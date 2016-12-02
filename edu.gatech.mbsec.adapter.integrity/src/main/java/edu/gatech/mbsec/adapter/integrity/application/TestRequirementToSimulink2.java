package edu.gatech.mbsec.adapter.integrity.application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Map.Entry;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.commons.io.FileUtils;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.provider.jena.ErrorHandler;
import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.RDFWriter;
import com.hp.hpl.jena.tdb.TDBFactory;
import com.mks.api.CmdRunner;
import com.mks.api.Command;
import com.mks.api.IntegrationPoint;
import com.mks.api.IntegrationPointFactory;
import com.mks.api.Option;
import com.mks.api.OptionList;
import com.mks.api.Session;
import com.mks.api.response.APIException;
import com.mks.api.response.Field;
import com.mks.api.response.Item;
import com.mks.api.response.ItemList;
import com.mks.api.response.ItemNotFoundException;
import com.mks.api.response.Response;
import com.mks.api.response.WorkItem;
import com.mks.api.response.WorkItemIterator;

import edu.gatech.mbsec.adapter.integrity.application.OSLC4JIntegrityApplication;
import edu.gatech.mbsec.adapter.integrity.application.util.IntegrityUtil;
import integrityNew.IntegrityNewFactory;
import integrityNew.ParameterValues;
import integrityNew.ProductConfiguration;
import integrityNew.Project;
import integrityNew.Requirement;
import integrityNew.SimulationName;
import resources.IntegrityParameterValues;
import resources.IntegrityProductConfiguration;
import resources.IntegrityProject;
import resources.IntegrityRequirement;
import resources.IntegritySimulationName;

/**
 * This class reads in data from Integrity and outputs it to RDF and TDB form. Specifically, it: 
 * <ul>
 * <li> reads in a specific requirement from Integrity
 * <li> processes it and extracts information
 * <li> creates a simple output xml file that can be used by Matlab
 * <li> creates a plain old java object (POJO) that is defined by an ecore metamodel. The generated code for the ecore metamodel includes the annotations required to support RDF serialization.
 * <li> serializes the POJO to an RDF output xml file and a TDB database.
 * </ul>
 */
public class TestRequirementToSimulink2 {

	public static SynchronizedBooleanFlag serverResourcesReadFlag = new SynchronizedBooleanFlag();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println("Current directory");
			System.out.println(new File(".").getCanonicalPath());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Thread thread = new Thread() {
			public void start() {
				readIntegrityData();
				// serverResourcesReadFlag.setValue(true);
				return;
			}
		};
		System.out.println("Starting thread");
		try {
			thread.start();
			thread.join();
			System.out.println("Thread finished");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println(e.toString());
		}
		System.out.println("Main function finished.");
	}

	private static String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return encoding.decode(ByteBuffer.wrap(encoded)).toString();
	}
	
	public static synchronized void readIntegrityData() {

		System.out.println("Inside Thread");

		IntegrationPointFactory integrationPointFactory = IntegrationPointFactory.getInstance();
		IntegrationPoint integrationPoint;
		Session session = null;
		String localConfigFilePath = "oslc4jintegrity configuration\\config.properties";
		String fullConfigFilePath = "";
		// String hostname = OSLC4JIntegrityApplication.integrityHostName;
		// String username = OSLC4JIntegrityApplication.integrityUsername;
		// String password = OSLC4JIntegrityApplication.integrityPassword;

		// directly read in user info.
		String hostname = "lsdewcs9.sdde.xxxxx.com";
		String username = "xxxxxxx";
		String password = "xxxxxxxxx";
		/* Read in from config.properties file
		try {
			fullConfigFilePath = (new File(".").getCanonicalPath()) + "\\" + localConfigFilePath;
			System.out.println("Location of config file: " + fullConfigFilePath);
			String str = readFile(fullConfigFilePath, Charset.defaultCharset());
			Properties prop = new Properties();
			prop.load(new StringReader(str.replace("\\", "/")));			
			hostname = prop.getProperty("integrityHostName");
			username = prop.getProperty("integrityUsername");
			password = prop.getProperty("integrityPassword");	
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		*/

		// read in from environment variable that is present during Jenkins job
		// execution (uses credentials binding plugin). Ref:
		// https://support.cloudbees.com/hc/en-us/articles/203802500-Injecting-Secrets-into-Jenkins-Build-Jobs
		hostname = System.getenv("integrityHostName");
		username = System.getenv("integrityUsername");
		password = System.getenv("integrityPassword");			
		
		try {
			integrationPoint = integrationPointFactory.createLocalIntegrationPoint(4, 16);
			integrationPoint.setAutoStartIntegrityClient(true);
			// the static block in OSLC4JIntegrityApplication class calls APIs
			session = integrationPoint.getCommonSession(username, password);
			CmdRunner queryCmdRunner;
			Response queryResponse = null;

			// variables used to populate output xml file
			String xmlStringProjectID = "1"; // hardcoded for now
			String xmlStringProject = "";
			String xmlStringCategory = "";
			String xmlStringID = "";
			String xmlStringName = "";
			String xmlStringText = "";
			String xmlStringParameterValues = "";
			HashMap<String, String> xmlParameterValuesMap = new HashMap<String, String>();
			String xmlStringProductConfiguration = "";
			String xmlStringSimulationName = "";

			try {
				queryCmdRunner = session.createCmdRunner();
				// "im editquery" -> edit a query and then execute
				Command queryCommand = new Command(Command.IM, "editquery");
				OptionList queryList = new OptionList();
				System.out.println("Editing quick query and running");
				String queryName = "Quick Query";
				String queryFields = "Project,ID,Type,Name,Category,Text,Parameter Values,Requires";
				// TODO: note that this is a custom hard coded value.
				int reqId = 243828;
				queryList.add("hostname", hostname);
				queryList.add("queryDefinition", "((field[ID]=" + reqId + "))");
				queryList.add("fields", queryFields);
				queryCommand.setOptionList(queryList);
				queryCommand.addSelection(queryName);
				System.out.println("Running edit query: " + queryName);
				queryResponse = queryCmdRunner.execute(queryCommand);
				System.out.println("Finished editing query: " + queryName);

				System.out.println("Running query: " + queryName + " results");

				queryCmdRunner = session.createCmdRunner();
				// "im issues" -> presents issues found in the query results for
				// the specified query. You can also choose the columns to use
				// in displaying the issues view information
				queryCommand = new Command(Command.IM, "issues");
				queryList = new OptionList();
				// the static block in OSLC4JIn... class calls APIs
				queryList.add("hostname", hostname);
				queryList.add("query", queryName);
				queryList.add("fields", queryFields);
				queryCommand.setOptionList(queryList);
				System.out.println("Running query: " + queryName);
				queryResponse = queryCmdRunner.execute(queryCommand); // async
																		// call
				System.out.println("Finished executing query: " + queryName);
				System.out.println("Processing query: " + queryName + " results");

				System.out.println("Iterating through query results");
				WorkItemIterator workItemIterator = queryResponse.getWorkItems();
				int idx = 1;
				while (workItemIterator.hasNext()) {
					WorkItem workItem = workItemIterator.next();
					System.out.println("Reading fields from query result #" + idx + " " + workItem);

					int fieldID = 0;
					String fieldType = "";
					String fieldName = "";
					String fieldProject = "";
					String fieldCategory = "";
					String fieldText = "";
					String fieldParameterValues = "";
					// another way to access the field
					// Field idField = workItem.getField("id");
					// System.out.println(idField.toString());
					Iterator<Field> fieldsIterator = workItem.getFields();
					while (fieldsIterator.hasNext()) {
						Object fieldObject = fieldsIterator.next();
						if (fieldObject instanceof Field) {
							Field field = (Field) fieldObject;
							System.out.println("Field name = " + field.getName());
							System.out.println("Field display name = " + field.getDisplayName());
							if (field.getName().equals("Project")) {
								System.out.println("Reading Project field:");
								Object fieldValue = field.getValue();
								Item item = (Item) fieldValue;
								if (item != null) {
									fieldProject = item.getId();
									System.out.println("Project field = " + fieldProject);
								} else {
									System.out.println("Project is Null");
								}
								xmlStringProject = fieldProject;
								System.out.println("");
							} else if (field.getName().equals("ID")) {
								System.out.println("Reading ID field:");
								// note that there is a "field.getDataType()"
								// method that returns the expected output type
								Object fieldValue = field.getValue();
								fieldID = (int) fieldValue;
								System.out.println("ID field = " + fieldID);
								xmlStringID = Integer.toString(fieldID);
								System.out.println("");
							} else if (field.getName().equals("Type")) {
								System.out.println("Reading Type field");
								Object fieldValue = field.getValue();
								Item item = (Item) fieldValue;
								fieldType = item.getId();
								System.out.println("Type field = " + fieldType);
								System.out.println("");
							} else if (field.getName().equals("Name")) {
								System.out.println("Reading Name field");
								Object fieldValue = field.getValue();
								fieldName = (String) fieldValue;
								if (fieldName != null) {
								} else {
									fieldName = "null";
								}
								System.out.println("Name field = " + fieldName);
								xmlStringName = fieldName;
								System.out.println("");
							} else if (field.getName().equals("Category")) {
								System.out.println("Reading Category field");
								Object fieldValue = field.getValue();
								fieldCategory = (String) fieldValue;
								if (fieldCategory != null) {
								} else {
									fieldCategory = "null";
								}
								System.out.println("Category field = " + fieldCategory);
								xmlStringCategory = fieldCategory;
								System.out.println("");
							} else if (field.getName().equals("Text")) {
								System.out.println("Reading Text field");
								Object fieldValue = field.getValue();
								fieldText = (String) fieldValue;
								if (fieldText != null) {
								} else {
									fieldText = "null";
								}
								System.out.println("Text field = " + fieldText);
								xmlStringText = fieldText;
								System.out.println("");
							} else if (field.getName().equals("Parameter Values")) {
								System.out.println("Reading Parameter Values field");
								// Parameter value data is a string, which is
								// formed of unordered rows (when pasted in text
								// editor).
								// Each row is a field for the parameter. It is
								// either semi-colon separated or = separated.
								// The equal separated entry represents the
								// value
								// The semi-colon separated entry represents
								// other properties of the parameter.
								// <parameter>;<field>=<value>\n<parameter>=<value>
								// need to detect ";" or "="
								Object fieldValue = field.getValue();
								fieldParameterValues = (String) fieldValue;
								if (fieldParameterValues != null) {
								} else {
									fieldParameterValues = "null";
								}
								String delims = "\n";
								String[] parameterValueRows = fieldParameterValues.split(delims);
								String[] tokens;
								HashMap<String, String> parameterValuesMap = new HashMap<String, String>();
								for (int i = 0; i < parameterValueRows.length; i++) {
									tokens = parameterValueRows[i].split(";");
									// System.out.println(tokens.length);
									if (tokens.length == 1) {
										tokens = parameterValueRows[i].split("=");
										// System.out.println(Arrays.toString(tokens));
										parameterValuesMap.put(tokens[0], tokens[1]);
									}
								}
								System.out.println("After parsing, Parameter Values = " + parameterValuesMap);
								xmlParameterValuesMap = parameterValuesMap;
								// System.out.println(Arrays.toString(parameterValueRows));
								// System.out.println("Parameter Values field =
								// " + fieldParameterValues);
								xmlStringParameterValues = parameterValuesMap.toString();
								System.out.println("");
							} else if (field.getName().equals("Requires")) {
								// also a way to read "Contains" field
								// Contains relationship should provide way to
								// access actual requirements
								System.out.println("Reading Requires field");
								Object fieldValue = field.getValue();
								ItemList itemList = (ItemList) fieldValue;
								ArrayList<Integer> requiresRelationshipIDs = new ArrayList<Integer>();
								if (itemList != null) {
									Iterator<Item> itemIterator = itemList.getItems();
									while (itemIterator.hasNext()) {
										// get IDs for each item
										Item item = itemIterator.next();
										requiresRelationshipIDs.add(Integer.parseInt(item.getId()));
										System.out.println("Requires Relationship ID: " + item.getId());
										// System.out.println(item.toString());
										System.out.println("");
									}
								}
								System.out.println("Requirement Ids to read in: " + requiresRelationshipIDs.toString());
								System.out.println("");

								if (!requiresRelationshipIDs.isEmpty()) {
									System.out.println(
											"Creating query to read in the requires relationship elements found above");
									// edit and run quick query
									try {
										queryCmdRunner = session.createCmdRunner();
										// "im editquery" -> edit a query and
										// then execute
										queryCommand = new Command(Command.IM, "editquery");
										queryList = new OptionList();
										System.out.println("Editing quick query and running");
										queryName = "Quick Query";
										queryFields = "Category,Name";
										queryList.add("hostname", hostname);
										queryList.add("queryDefinition", "((field[ID]=" + requiresRelationshipIDs.get(0)
												+ ")or(field[ID]=" + requiresRelationshipIDs.get(1) + "))");
										queryList.add("fields", queryFields);
										queryCommand.setOptionList(queryList);
										queryCommand.addSelection(queryName);
										System.out.println("Running edit query: " + queryName);
										queryResponse = queryCmdRunner.execute(queryCommand); // async
																								// call
										System.out.println("Finished editing query: " + queryName);

										System.out.println("Running query: " + queryName + " results");

										queryCmdRunner = session.createCmdRunner();
										// "im issues" -> presents issues found
										// in the query results for the
										// specified query. You can also choose
										// the columns to use in displaying the
										// issues view information
										queryCommand = new Command(Command.IM, "issues");
										queryList = new OptionList();
										// reading in config properties file
										// does not work with exported jar.
										// reference:
										// http://stackoverflow.com/questions/18091046/creating-runnable-jar-with-external-files-included
										// http://stackoverflow.com/questions/7284471/where-does-java-put-resource-files-when-i-jar-my-program/7284648#7284648
										queryList.add("hostname", hostname);
										queryList.add("query", queryName);
										queryList.add("fields", queryFields);
										queryCommand.setOptionList(queryList);
										System.out.println("Running query: " + queryName);
										queryResponse = queryCmdRunner.execute(queryCommand); // async
																								// call
										System.out.println("Finished executing query: " + queryName);
										System.out.println("Processing query: " + queryName + " results");

										// from System Element
										String productConfig = "";
										// from Function Element
										String simulationName = "";
										String strType = "";
										String strName = "";
										HashMap<String, String> requiresRelationHashMap = new HashMap<String, String>();
										workItemIterator = queryResponse.getWorkItems();
										while (workItemIterator.hasNext()) {
											workItem = workItemIterator.next();
											System.out.println(
													"Reading fields from query result #" + idx + " " + workItem);

											// another way to access the field
											// Field idField =
											// workItem.getField("id");
											// System.out.println(idField.toString());
											fieldsIterator = workItem.getFields();
											while (fieldsIterator.hasNext()) {
												fieldObject = fieldsIterator.next();
												if (fieldObject instanceof Field) {
													field = (Field) fieldObject;
													System.out.println("Field name = " + field.getName());
													System.out
															.println("Field display name = " + field.getDisplayName());
													if (field.getName().equals("Category")) {
														System.out.println("Reading Category field");
														fieldValue = field.getValue();
														strType = (String) fieldValue;
														if (strType != null) {
														} else {
															strType = "null";
														}
														System.out.println("Category field = " + strType);
														System.out.println("");
													} else if (field.getName().equals("Name")) {
														System.out.println("Reading Name field");
														fieldValue = field.getValue();
														strName = (String) fieldValue;
														if (strName != null) {
														} else {
															strName = "null";
														}
														System.out.println("Name field = " + strName);
														System.out.println("");
													}
												}
											}
											requiresRelationHashMap.put(strType, strName);
										}
										productConfig = requiresRelationHashMap.get("System Element");
										simulationName = requiresRelationHashMap.get("Function");

										xmlStringProductConfiguration = productConfig;
										xmlStringSimulationName = simulationName;
										System.out.println("Product Configuration = " + productConfig);
										System.out.println("Simulation Name = " + simulationName);
										System.out.println("");
									} catch (APIException e1) {
										System.err.println(e1.getMessage());
										System.err.println("");

									}

								}

							}
						}
					}
				}
				System.out.println(queryResponse.getWorkItems().next().getFields().next().toString());
				System.out.println("End Integrity API call");
				integrationPointFactory.removeIntegrationPoint(integrationPoint);
				System.out.println("Removing integration point to terminate thread.");

			} catch (ItemNotFoundException e) {
				System.err.println(e.toString());
			}

			//================================================================
			// create output XML file
			//================================================================
			System.out.println("\n\n");
			System.out.println("Output XML file section");
			System.out.println(xmlStringProject);
			System.out.println(xmlStringCategory);
			System.out.println(xmlStringID);
			System.out.println(xmlStringName);
			System.out.println(xmlStringText);
			System.out.println(xmlStringParameterValues);
			System.out.println(xmlStringProductConfiguration);
			System.out.println(xmlStringSimulationName);
			System.out.println("");

			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

			// Construct xml file
			Document doc = docBuilder.newDocument();
			Element rootElement = doc.createElement("requirement");
			doc.appendChild(rootElement);

			Element projectElement = doc.createElement("project");
			projectElement.appendChild(doc.createTextNode(xmlStringProject));
			rootElement.appendChild(projectElement);

			Element categoryElement = doc.createElement("category");
			categoryElement.appendChild(doc.createTextNode(xmlStringCategory));
			rootElement.appendChild(categoryElement);

			Element idElement = doc.createElement("id");
			idElement.appendChild(doc.createTextNode(xmlStringID));
			rootElement.appendChild(idElement);

			Element nameElement = doc.createElement("name");
			nameElement.appendChild(doc.createTextNode(xmlStringName));
			rootElement.appendChild(nameElement);

			Element textElement = doc.createElement("text");
			textElement.appendChild(doc.createTextNode(xmlStringText));
			rootElement.appendChild(textElement);

			// Parameter values
			Element parameterValuesElement = doc.createElement("parameterValues");
			// direct string representation of hashmap
			// parameterValuesElement.appendChild(doc.createTextNode(xmlStringParameterValues));
			rootElement.appendChild(parameterValuesElement);
			// go through hash map to generate elements
			Element parameterValueEntryElement;
			Iterator iterator = xmlParameterValuesMap.entrySet().iterator();
			while (iterator.hasNext()) {
				Entry thisEntry = (Entry) iterator.next();
				parameterValueEntryElement = doc.createElement((String) thisEntry.getKey());
				parameterValueEntryElement.appendChild(doc.createTextNode((String) thisEntry.getValue()));
				parameterValuesElement.appendChild(parameterValueEntryElement);
			}

			Element productConfigurationElement = doc.createElement("productConfiguration");
			productConfigurationElement.appendChild(doc.createTextNode(xmlStringProductConfiguration));
			rootElement.appendChild(productConfigurationElement);

			Element simulationNameElement = doc.createElement("simulationName");
			simulationNameElement.appendChild(doc.createTextNode(xmlStringSimulationName));
			rootElement.appendChild(simulationNameElement);

			// write the content into xml file
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
			transformer.setOutputProperty(OutputKeys.METHOD, "xml");
			DOMSource source = new DOMSource(doc);
			StreamResult result = new StreamResult(new File("ID_" + xmlStringID + ".xml"));

			// Output to console for testing
			// StreamResult result = new StreamResult(System.out);

			transformer.transform(source, result);

			System.out.println("File saved!");

			//================================================================
			// create ecore object 
			//================================================================
			System.out.println("Creating Ecore model");
			Project ecoreProject = IntegrityNewFactory.eINSTANCE.createProject();
			ecoreProject.setId(xmlStringProjectID);
			ecoreProject.setName(xmlStringProject);
			Requirement ecoreRequirement = IntegrityNewFactory.eINSTANCE.createRequirement();
			ecoreProject.getRequirements().add(ecoreRequirement);

			ecoreRequirement.setId(xmlStringID);
			ecoreRequirement.setName(xmlStringName);
			ecoreRequirement.setText(xmlStringText);		
			
			ParameterValues ecoreParamValue = IntegrityNewFactory.eINSTANCE.createParameterValues();
			ecoreParamValue.setLowerLimit(xmlParameterValuesMap.get("lowerLimit"));
			ecoreParamValue.setUpperLimit(xmlParameterValuesMap.get("upperLimit"));
			ecoreParamValue.setUnit(xmlParameterValuesMap.get("unit"));
			ecoreRequirement.setParameterValues(ecoreParamValue);
			
			ProductConfiguration ecoreProdConfig = IntegrityNewFactory.eINSTANCE.createProductConfiguration();
			ecoreProdConfig.setName(xmlStringProductConfiguration);
			ecoreRequirement.setProductConfiguration(ecoreProdConfig);
			
			SimulationName ecoreSimName = IntegrityNewFactory.eINSTANCE.createSimulationName();
			ecoreSimName.setName(xmlStringSimulationName);			
			ecoreRequirement.setSimulationName(ecoreSimName);
			
			System.out.println("adding content to ecore objects");
			
			//================================================================
			// create rdf-compatible object (using Java classes generated from
			// ecore model with OSLC annotations
			//================================================================
			String URIprefix = "http://IntegrityExecutableRequirements/#";
			
			IntegrityProject rdfProject = new IntegrityProject();
			IntegrityRequirement rdfRequirement = new IntegrityRequirement();
			IntegrityParameterValues rdfParamValue = new IntegrityParameterValues();
			IntegrityProductConfiguration rdfProdConfig = new IntegrityProductConfiguration();
			IntegritySimulationName rdfSimName = new IntegritySimulationName();
			
			rdfProject.setAbout(URI.create(URIprefix + "projectID" + xmlStringProjectID));
			rdfProject.setId(xmlStringProjectID);
			rdfProject.setName(xmlStringProject);
			
			rdfRequirement.setId(xmlStringID);
			rdfRequirement.setName(xmlStringName);
			rdfRequirement.setText(xmlStringText);
			rdfRequirement.setAbout(URI.create(URIprefix + "requirementID" + xmlStringID));

			rdfParamValue.setLowerLimit(xmlParameterValuesMap.get("lowerLimit"));
			rdfParamValue.setUpperLimit(xmlParameterValuesMap.get("upperLimit"));
			rdfParamValue.setUnit(xmlParameterValuesMap.get("unit"));
			rdfParamValue.setAbout(URI.create(URIprefix + "paramValueForRequirementID" + xmlStringID));			
			rdfRequirement.setParameterValues(rdfParamValue.getAbout());
			
			rdfProdConfig.setName(xmlStringProductConfiguration);
			rdfProdConfig.setAbout(URI.create(URIprefix + "productConfigForRequirementID" + xmlStringID));
			rdfRequirement.setProductConfiguration(rdfProdConfig.getAbout());
			
			rdfSimName.setName(xmlStringSimulationName);
			rdfSimName.setAbout(URI.create(URIprefix + "simulationNameForRequirementID" + xmlStringID));
			rdfRequirement.setSimulationName(rdfSimName.getAbout());

			// important to assign relationships AFTER the URIs are created on the child objects
			Link[] linkReq2Project = new Link[1]; 
			linkReq2Project[0] = new Link(rdfRequirement.getAbout());
			rdfProject.setRequirements(linkReq2Project);

			System.out.println("finished creating RDF compatible object");

			//================================================================
			// write to rdf file 
			//================================================================
			System.out.println("Starting to write RDF output file");
			ArrayList<Object> objectList = new ArrayList<Object>();
			objectList.add(rdfProject);
			objectList.add(rdfRequirement);
			objectList.add(rdfParamValue);
			objectList.add(rdfProdConfig);
			objectList.add(rdfSimName);
			
			int arraySize = objectList.size();
			Object[] objects = new Object[arraySize];
			objects = objectList.toArray();

			try {
				Model model = JenaModelHelper.createJenaModel(objects);
				String rdfFormat = "RDF/XML"; // "RDF/XML", "RDF/XML-ABBREV", "N-TRIPLES"
				RDFWriter writer = model.getWriter(rdfFormat); 
				writer.setProperty("showXmlDeclaration", "false");
				writer.setErrorHandler(new ErrorHandler());
				String rdfFileName = "rdfForRequirementID_" + xmlStringID + ".xml";
				File newFile = new File(rdfFileName);
				newFile.createNewFile();
				OutputStream outputStream = new FileOutputStream(rdfFileName);
				writer.write(model, outputStream, null);
				outputStream.close();
				System.out.println("Finished writing RDF file");
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| DatatypeConfigurationException | OslcCoreApplicationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//================================================================
			// write to triple store database in folder 
			//================================================================
			try {
				System.out.println("Starting to write TDB output");
				String tdbdir = "./TDBoutput";
				File tdbdirFile = new File(tdbdir);
				if (tdbdirFile.exists()) {
					FileUtils.forceDelete(tdbdirFile);
				}
				if (!tdbdirFile.exists()) {
					Files.createDirectories(Paths.get(tdbdir));
				}
				Model model = JenaModelHelper.createJenaModel(objects);
				Dataset dataset = TDBFactory.createDataset(tdbdir);
				Model tdbModel = dataset.getDefaultModel();
//				System.out.println(tdbModel.
				// read in existing model from TDB directory
				tdbModel.add(model);
				dataset.close();
				System.out.println("Finished writing TDB output");
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException
					| DatatypeConfigurationException | OslcCoreApplicationException e) {
				System.err.println(e.getMessage());
				System.err.println("");
			} catch (IOException e) {
				System.err.println(e.getMessage());
				System.err.println("");
			} catch (Exception e) {
				System.err.println(e.getMessage());
				System.err.println("");				
			}
		} catch (Exception e) {
			System.err.println(e.toString());
			System.err.println("");
		}
		return;
	}
}
