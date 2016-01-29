package edu.gatech.mbsec.adapter.integrity.generators;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.mks.api.CmdRunner;
import com.mks.api.Command;
import com.mks.api.OptionList;
import com.mks.api.response.APIException;
import com.mks.api.response.Response;

import edu.gatech.mbsec.adapter.integrity.application.OSLC4JIntegrityApplication;
import edu.gatech.mbsec.adapter.integrity.application.util.IntegrityUtil;

public class GenerateReadServerClass implements Runnable {

	static EPackage ecoreRootPackage;
	static EClass eclass;
	static String javaResourceDirectory = "C:/Users/ap77456/Documents/Git/oslc4jintegrity/oslc4jintegrity/src/main/java/edu/gatech/mbsec/adapter/integrity/generated/resources/";
	static String ecoreMetamodelLocation = "C:/Users/ap77456/Documents/Git/ecore4integrity/edu.gatech.mbsec.adapter.integrity.ecore/model/customIntegrity.ecore";
	static List<String> itemTypeNames = CustomIntegrityItemTypes
			.getCustomIntegrityItemTypes();

	public GenerateReadServerClass(String customIntegrityMetamodelLocation,
			String javaResourcePackageLocation, List<String> itemTypeNames2) {
		ecoreMetamodelLocation = customIntegrityMetamodelLocation;
		javaResourceDirectory = javaResourcePackageLocation;
		itemTypeNames = itemTypeNames2;
	}

	public static void main(String[] args) {
		// load integrity.ecore model
		Resource ecoreResource = MyEcoreUtil.loadEcoreModel(URI
				.createFileURI(new File(ecoreMetamodelLocation)
						.getAbsolutePath()));

		ecoreRootPackage = (EPackage) EcoreUtil.getObjectByType(
				ecoreResource.getContents(),
				EcorePackage.eINSTANCE.getEPackage());

		// create annotated Java class
		StringBuffer buffer = new StringBuffer();

		// print package declaration
		printPackageDeclaration(buffer);

		// // print import statements
		printImportStatements(buffer);

		// print Java class declaration
		printJavaClassDeclaration(buffer);

		// print static variables declaration
		printJavaClassStaticVariables(buffer);

		// print oslc resource getter methods
		printGetOSLCResourceMethods(buffer);

		// print SessionInitializationMethod
		printSessionInitializationMethod(buffer);

		// print GetIntegrityResourceMethods
		printGetIntegrityResourceMethods(buffer);

		// print Read Server Resources method
		printReadServerResourcesMethods(buffer);

		// print get all resources method
		printGetAllResourcesMethod(buffer);

		// print get modified date method
		// printGetModifiedDateMethod(buffer);

		// add closing bracket
		buffer.append("}");

		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(javaResourceDirectory
					+ "IntegrityServerResources.java");
			fileWriter.append(buffer);
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void printGetModifiedDateMethod(StringBuffer buffer) {
		buffer.append("\tpublic static String getModifiedDate(AbstractResource integrityResource){");
		buffer.append("\r\n");

		for (EClassifier eclassifier : ecoreRootPackage.getEClassifiers()) {
			if (!(eclassifier instanceof EClass)) {
				continue;
			}
			if (eclassifier.getName().equals("Server")
					| eclassifier.getName().equals("Item")
					| eclassifier.getName().equals("Field")) {
				// server is the root container concept - there is only one
				// server
				// Item and Field resources have no modified date property
				continue;
			}
			buffer.append("\t\tif(integrityResource instanceof Integrity"
					+ eclassifier.getName() + "){");
			buffer.append("\r\n");
			buffer.append("\t\t\tIntegrity" + eclassifier.getName()
					+ " resource = (Integrity" + eclassifier.getName()
					+ ") integrityResource;");
			buffer.append("\r\n");
			buffer.append("\t\t\treturn resource.getModifiedDate();");
			buffer.append("\r\n");
			buffer.append("\t\t}");
			buffer.append("\r\n");
		}

		buffer.append("\t\treturn null;");
		buffer.append("\r\n");

		// closing method bracket
		buffer.append("\t}\r\n");
		buffer.append("\r\n");

	}

	private static void printGetAllResourcesMethod(StringBuffer buffer) {
		buffer.append("\tpublic static synchronized List<AbstractResource> getAllResources() {");
		buffer.append("\r\n");

		buffer.append("\t\tList<AbstractResource> allResources = new ArrayList<AbstractResource>();");
		buffer.append("\r\n");

		for (EClassifier eclassifier : ecoreRootPackage.getEClassifiers()) {
			if (!(eclassifier instanceof EClass)) {
				continue;
			}
			if (eclassifier.getName().equals("Server")
					| eclassifier.getName().equals("Item")
					| eclassifier.getName().equals("Field")) {
				// server is the root container concept - there is only one
				// server
				// Item and Field resources have no modified date property
				continue;
			}
			buffer.append("\t\tfor (Integrity" + eclassifier.getName()
					+ " integrityResource : qNameOslcIntegrity"
					+ eclassifier.getName() + "Map.values()) {");
			buffer.append("\r\n");
			buffer.append("\t\t\tallResources.add(integrityResource);");
			buffer.append("\r\n");
			buffer.append("\t\t}");
			buffer.append("\r\n");

		}

		buffer.append("\t\treturn allResources;");
		buffer.append("\r\n");

		// closing method bracket
		buffer.append("\t}\r\n");
		buffer.append("\r\n");
	}

	private static void printReadServerResourcesMethods(StringBuffer buffer) {
		buffer.append("\tpublic static synchronized void readServerResources() {");
		buffer.append("\r\n");

		for (EClassifier eclassifier : ecoreRootPackage.getEClassifiers()) {
			if (!(eclassifier instanceof EClass)) {
				continue;
			}
			buffer.append("\t\toslcIntegrity" + eclassifier.getName()
					+ "s.clear();");
			buffer.append("\r\n");
			buffer.append("\t\tqNameOslcIntegrity" + eclassifier.getName()
					+ "Map.clear();");
			buffer.append("\r\n");
		}

		buffer.append("\t\tIntegrityUtil.integrityIDURIMap.clear();\r\n");
		buffer.append("\r\n");

		// buffer.append("\t\ttry {\r\n");
		buffer.append("\t\tSession session = getIntegritySession();");
		buffer.append("\r\n");

		for (EClassifier eclassifier : ecoreRootPackage.getEClassifiers()) {
			if (!(eclassifier instanceof EClass)) {
				continue;
			}
			// distinguish between calling predefined vs generated methods
			if (eclassifier.getName().equals("Project")) {
				// calling predefined method
				buffer.append("\t\tIntegrityUtil.getAll"
						+ eclassifier.getName() + "s(session);");
				buffer.append("\r\n");
			} else if (eclassifier.getName().equals("Server")
					| eclassifier.getName().equals("Item")
					| eclassifier.getName().equals("Field")) {
				// server is the root container concept - there is only one
				// server
				// Item and Field are generic concepts
			} else {
				// calling generated methods
				buffer.append("\t\tgetAll" + eclassifier.getName()
						+ "s(session);");
				buffer.append("\r\n");
			}
		}

		// buffer.append("\t\t} catch (APIException e) {");
		// buffer.append("\r\n");
		// buffer.append("\t\t\te.printStackTrace();");
		// buffer.append("\r\n");
		// buffer.append("\t\t}\r\n");
		buffer.append("\r\n");

		// closing method bracket
		buffer.append("\t}\r\n");
		buffer.append("\r\n");
		buffer.append("\r\n");
		buffer.append("\r\n");

		// oslcIntegrityItemURIs.clear();
		// projectNameIDMap.clear();
		// objectFieldValueMap.clear();

	}

	private static void printSessionInitializationMethod(StringBuffer buffer) {
		buffer.append("\tpublic static Session getIntegritySession() {");
		buffer.append("\r\n");
		buffer.append("\t\tIntegrationPointFactory integrationPointFactory = IntegrationPointFactory.getInstance();");
		buffer.append("\r\n");
		buffer.append("\t\tIntegrationPoint integrationPoint;");
		buffer.append("\r\n");
		buffer.append("\t\tSession session = null;");
		buffer.append("\r\n");
		buffer.append("\t\ttry {");
		buffer.append("\r\n");
		buffer.append("\t\t\tintegrationPoint = integrationPointFactory.createLocalIntegrationPoint(4, 12);");
		buffer.append("\r\n");
		buffer.append("\t\t\tsession = integrationPoint.getCommonSession();");
		buffer.append("\r\n");
		buffer.append("\t\t} catch (APIException e) {");
		buffer.append("\r\n");
		buffer.append("\t\t\te.printStackTrace();");
		buffer.append("\r\n");
		buffer.append("\t\t}");
		buffer.append("\r\n");
		buffer.append("\t\treturn session;");
		buffer.append("\r\n");
		buffer.append("\t}");
		buffer.append("\r\n");
		buffer.append("\r\n");

	}

	private static void printGetIntegrityResourceMethods(StringBuffer buffer) {
		for (String originalIntegrityItemTypeName : itemTypeNames) {
			String ecoreTypeName = MyEcoreUtil
					.getEcoreTypeName(originalIntegrityItemTypeName);
			buffer.append("\tpublic static synchronized void getAll"
					+ ecoreTypeName + "s(Session session) {");
			buffer.append("\r\n");
			buffer.append("\t\tCmdRunner queryCmdRunner;");
			buffer.append("\r\n");
			buffer.append("\t\tResponse queryResponse = null;");
			buffer.append("\r\n");

			buffer.append("\t\ttry {");
			buffer.append("\r\n");
			buffer.append("\t\t\tqueryCmdRunner = session.createCmdRunner();");
			buffer.append("\r\n");
			buffer.append("\t\t\tCommand queryCommand = new Command(Command.IM, \"issues\");");
			buffer.append("\r\n");
			buffer.append("\t\t\tOptionList queryList = new OptionList();");
			buffer.append("\r\n");
			buffer.append("\t\t\tqueryList.add(\"hostname\", \""
					+ GenerateAdapter.integrityHostName + "\");");
			buffer.append("\r\n");
			buffer.append("\t\t\tqueryList.add(\"query\", \"All "
					+ originalIntegrityItemTypeName + "s\");");
			buffer.append("\r\n");
			buffer.append("\t\t\tString fieldNameList = IntegrityUtil.getItemTypeFieldNames(\""
					+ originalIntegrityItemTypeName + "\", session);");
			buffer.append("\r\n");
			buffer.append("\t\t\tqueryList.add(\"fields\",fieldNameList);");
			buffer.append("\r\n");
			buffer.append("\t\t\tqueryCommand.setOptionList(queryList);");
			buffer.append("\r\n");
			buffer.append("\t\t\tqueryResponse = queryCmdRunner.execute(queryCommand);");
			buffer.append("\r\n");
			buffer.append("\t\t} ");
			buffer.append("\r\n");
			buffer.append("\t\tcatch(ItemNotFoundException e){");
			buffer.append("\r\n");

			buffer.append("\t\t\t//create query");
			buffer.append("\r\n");
			buffer.append("\t\t\ttry {");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tCmdRunner createQueryCmdRunner = session.createCmdRunner();");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tCommand createQueryCommand = new Command(Command.IM, \"createquery\");");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tOptionList createQueryOptionList = new OptionList();");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tcreateQueryOptionList.add(\"hostname\", \""
					+ GenerateAdapter.integrityHostName + "\");");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tcreateQueryOptionList.add(\"name\", \"All "
					+ originalIntegrityItemTypeName + "s\");");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tcreateQueryOptionList.add(\"queryDefinition\", \"(field[Type]="
					+ originalIntegrityItemTypeName + ")\");");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tcreateQueryCommand.setOptionList(createQueryOptionList);");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tResponse createQueryResponse = createQueryCmdRunner.execute(createQueryCommand);");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tSystem.out.println(createQueryResponse);");
			buffer.append("\r\n");
			buffer.append("\t\t\t} catch (APIException e1) {");
			buffer.append("\r\n");
			buffer.append("\t\t\t\te1.printStackTrace();");
			buffer.append("\r\n");
			buffer.append("\t\t\t}");

			buffer.append("\r\n");
			buffer.append("\t\t\t//execute query");

			buffer.append("\r\n");
			buffer.append("\t\t\ttry {");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tCmdRunner executeQueryCmdRunner = session.createCmdRunner();");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tqueryCmdRunner = session.createCmdRunner();");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tCommand queryCommand = new Command(Command.IM, \"issues\");");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tOptionList queryList = new OptionList();");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tqueryList.add(\"hostname\", \""
					+ GenerateAdapter.integrityHostName + "\");");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tqueryList.add(\"query\", \"All "
					+ originalIntegrityItemTypeName + "s\");");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tString fieldNameList = IntegrityUtil.getItemTypeFieldNames(\""
					+ originalIntegrityItemTypeName + "\", session);");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tqueryList.add(\"fields\",fieldNameList);");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tqueryCommand.setOptionList(queryList);");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tqueryResponse = executeQueryCmdRunner.execute(queryCommand);");
			buffer.append("\r\n");
			buffer.append("\t\t\t} catch (APIException e1) {");
			buffer.append("\r\n");
			buffer.append("\t\t\t\te1.printStackTrace();");
			buffer.append("\r\n");
			buffer.append("\t\t\t}");

			buffer.append("\r\n");
			buffer.append("\t\t}");

			buffer.append("\r\n");
			buffer.append("\t\tcatch (APIException e1) {	");
			buffer.append("\r\n");
			buffer.append("\t\t\te1.printStackTrace();");
			buffer.append("\r\n");
			buffer.append("\t\t}");

			buffer.append("\r\n");
			buffer.append("\r\n");
			buffer.append("\t\ttry{");
			buffer.append("\r\n");
			buffer.append("\t\t\tWorkItemIterator workItemIterator = queryResponse.getWorkItems();");
			buffer.append("\r\n");
			buffer.append("\t\t\twhile (workItemIterator.hasNext()) {");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tWorkItem workItem = workItemIterator.next();");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tSystem.out.println(\"Converting into OSLC resource "
					+ originalIntegrityItemTypeName + " \" + workItem);");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tString owningProjectID = IntegrityUtil.getProjectID(workItem.getFields());");
			buffer.append("\r\n");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tString projectId = null;");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tString projectName = IntegrityUtil.getProjectName(workItem.getFields());");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tif(projectName == null | projectName == \"\"){");
			buffer.append("\r\n");
			buffer.append("\t\t\t\t\tprojectName = \"unnamed\";");
			buffer.append("\r\n");
			buffer.append("\t\t\t}");
			buffer.append("\r\n");
			buffer.append("\t\t\telse{");
			buffer.append("\r\n");
			buffer.append("\t\t\t\t\tprojectName = IntegrityUtil.getValidProjectIdOrName(projectName);");
			buffer.append("\r\n");
			buffer.append("\t\t\t}");
			buffer.append("\r\n");
			buffer.append("\t\t\tif (owningProjectID == null) {");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tprojectId = \"noproject\";");
			buffer.append("\r\n");
			buffer.append("\t\t\t} else {");
			buffer.append("\r\n");

			buffer.append("\t\t\t\towningProjectID = IntegrityUtil.getValidProjectIdOrName(owningProjectID);");
			buffer.append("\r\n");

			buffer.append("\t\t\t\tif(owningProjectID.equals(projectName)){");
			buffer.append("\r\n");
			buffer.append("\t\t\t\t\tprojectId = \"project\" + projectName;");
			buffer.append("\r\n");
			buffer.append("\t\t\t\t}");
			buffer.append("\r\n");
			buffer.append("\t\t\t\telse{");
			buffer.append("\r\n");
			buffer.append("\t\t\t\t\tprojectId = \"project\" + owningProjectID + projectName;");
			buffer.append("\r\n");
			buffer.append("\t\t\t\t}");
			buffer.append("\r\n");

//			buffer.append("\t\t\t\tprojectId = \"project\" + owningProjectID + projectName;");
//			buffer.append("\r\n");
			buffer.append("\t\t\t}");
			buffer.append("\r\n");
			buffer.append("\t\t\tIntegrity" + ecoreTypeName + " integrity"
					+ ecoreTypeName + ";");
			buffer.append("\r\n");
			buffer.append("\t\t\ttry {");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tintegrity"
					+ ecoreTypeName
					+ " = new Integrity"
					+ ecoreTypeName
					+ "("
					+ "java.net.URI.create(IntegrityManager.baseHTTPURI + \"/services/\""
					+ "+ projectId + \"/" + ecoreTypeName.toLowerCase()
					+ "s/\"" + "+ workItem.getId()));");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tIntegrityUtil.iterateThroughFields(workItem.getFields(),	integrity"
					+ ecoreTypeName + ");");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tqNameOslcIntegrity" + ecoreTypeName
					+ "Map.put(" + "integrity" + ecoreTypeName
					+ ".getAbout().toString()," + "integrity" + ecoreTypeName
					+ ");");
			buffer.append("\r\n");
			buffer.append("\t\t\t\toslcIntegrity" + ecoreTypeName
					+ "s.add(integrity" + ecoreTypeName + ");");
			buffer.append("\r\n");
			buffer.append("\t\t\t\tIntegrityUtil.integrityIDURIMap.put(workItem.getId(),integrity"
					+ ecoreTypeName + ".getAbout());");
			buffer.append("\r\n");
			buffer.append("\t\t\t} catch (URISyntaxException e) {");
			buffer.append("\r\n");
			buffer.append("\t\t\t\te.printStackTrace();");
			buffer.append("\r\n");
			buffer.append("\t\t\t}");
			buffer.append("\r\n");
			buffer.append("\t\t\t}");
			buffer.append("\r\n");
			buffer.append("\r\n");
			buffer.append("\t\t} catch (APIException e1) {	");
			buffer.append("\r\n");
			buffer.append("\t\t\te1.printStackTrace();");
			buffer.append("\r\n");
			buffer.append("\t\t}");
			buffer.append("\r\n");
			buffer.append("\t}");
			buffer.append("\r\n");

		}

	}

	private static void printGetOSLCResourceMethods(StringBuffer buffer) {
		for (EClassifier eclassifier : ecoreRootPackage.getEClassifiers()) {
			if (!(eclassifier instanceof EClass)) {
				continue;
			}
			buffer.append("\tpublic static synchronized List<Integrity"
					+ eclassifier.getName() + "> get" + eclassifier.getName()
					+ "sInProject(String projectID) {");
			buffer.append("\r\n");
			buffer.append("\t\tArrayList<Integrity" + eclassifier.getName()
					+ "> oslcResources = new ArrayList<Integrity"
					+ eclassifier.getName() + ">();");
			buffer.append("\r\n");
			buffer.append("\t\tfor (Integrity" + eclassifier.getName()
					+ " oslcResource : oslcIntegrity" + eclassifier.getName()
					+ "s) {");
			buffer.append("\r\n");
			buffer.append("\t\t\tString oslcResourceURI = oslcResource.getAbout().toString();");
			buffer.append("\r\n");
			buffer.append("\t\t\tif (oslcResourceURI.startsWith(IntegrityManager.baseHTTPURI + \"/services/\" + projectID + \"/"
					+ eclassifier.getName().toLowerCase() + "s/\")) {");
			buffer.append("\r\n");
			buffer.append("\t\t\t\t\toslcResources.add(oslcResource);");
			buffer.append("\r\n");
			buffer.append("\t\t\t}");
			buffer.append("\r\n");
			buffer.append("\t\t}");
			buffer.append("\r\n");
			buffer.append("\t\treturn oslcResources;");
			buffer.append("\r\n");
			buffer.append("\t}");
			buffer.append("\r\n");
			buffer.append("\r\n");

			buffer.append("\tpublic static synchronized Integrity"
					+ eclassifier.getName() + " get" + eclassifier.getName()
					+ "ByURI(String uri) {");
			buffer.append("\r\n");
			buffer.append("\t\treturn qNameOslcIntegrity"
					+ eclassifier.getName()
					+ "Map.get(IntegrityManager.baseHTTPURI+ \"/services/\" + uri);");
			buffer.append("\r\n");
			buffer.append("\t}");
			buffer.append("\r\n");

		}

	}

	private static void printJavaClassDeclaration(StringBuffer buffer) {
		buffer.append("public class IntegrityServerResources{");
		buffer.append("\r\n");
		buffer.append("\r\n");
	}

	private static void printJavaClassStaticVariables(StringBuffer buffer) {
		for (EClassifier eclassifier : ecoreRootPackage.getEClassifiers()) {
			if (!(eclassifier instanceof EClass)) {
				continue;
			}
			buffer.append("\tpublic static List<Integrity"
					+ eclassifier.getName() + "> oslcIntegrity"
					+ eclassifier.getName() + "s = new ArrayList<Integrity"
					+ eclassifier.getName() + ">();");
			buffer.append("\r\n");

			buffer.append("\tpublic static Map<String, Integrity"
					+ eclassifier.getName() + "> qNameOslcIntegrity"
					+ eclassifier.getName()
					+ "Map  = new HashMap<String, Integrity"
					+ eclassifier.getName() + ">();	");
			buffer.append("\r\n");

		}

		buffer.append("\r\n");
		// buffer.append("\tpublic static String baseHTTPURI = \"http://\" "
		// + "+ OSLC4JIntegrityApplication.hostName + \":\" "
		// + "+ OSLC4JIntegrityApplication.portNumber + \"/\""
		// + "+ OSLC4JIntegrityApplication.contextPath;");
		// buffer.append("\r\n");
		buffer.append("\r\n");

	}

	private static void printImportStatements(StringBuffer buffer) {
		buffer.append("import java.util.ArrayList;");
		buffer.append("\r\n");
		buffer.append("import java.util.List;");
		buffer.append("\r\n");
		buffer.append("import java.net.URISyntaxException;");
		buffer.append("\r\n");
		buffer.append("import java.util.Map;");
		buffer.append("\r\n");
		buffer.append("import java.util.HashMap;");
		buffer.append("\r\n");

		buffer.append("import edu.gatech.mbsec.adapter.integrity.application.OSLC4JIntegrityApplication;");
		buffer.append("\r\n");
		buffer.append("import edu.gatech.mbsec.adapter.integrity.application.util.IntegrityUtil;");
		buffer.append("\r\n");
		buffer.append("import edu.gatech.mbsec.adapter.integrity.application.IntegrityManager;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.model.AbstractResource;");
		buffer.append("\r\n");

		for (EClassifier eclassifier : ecoreRootPackage.getEClassifiers()) {
			buffer.append("import edu.gatech.mbsec.adapter.integrity.generated.resources.Integrity"
					+ eclassifier.getName() + ";");
			buffer.append("\r\n");
		}

		buffer.append("import com.mks.api.CmdRunner;");
		buffer.append("\r\n");
		buffer.append("import com.mks.api.Command;");
		buffer.append("\r\n");
		buffer.append("import com.mks.api.IntegrationPoint;");
		buffer.append("\r\n");
		buffer.append("import com.mks.api.IntegrationPointFactory;");
		buffer.append("\r\n");
		buffer.append("import com.mks.api.OptionList;");
		buffer.append("\r\n");
		buffer.append("import com.mks.api.SelectionList;");
		buffer.append("\r\n");
		buffer.append("import com.mks.api.Session;");
		buffer.append("\r\n");
		buffer.append("import com.mks.api.response.APIConnectionException;");
		buffer.append("\r\n");
		buffer.append("import com.mks.api.response.APIException;");
		buffer.append("\r\n");
		buffer.append("import com.mks.api.response.Field;");
		buffer.append("\r\n");
		buffer.append("import com.mks.api.response.Item;");
		buffer.append("\r\n");
		buffer.append("import com.mks.api.response.ItemNotFoundException;");
		buffer.append("\r\n");

		buffer.append("import com.mks.api.response.ItemList;");
		buffer.append("\r\n");
		buffer.append("import com.mks.api.response.Response;");
		buffer.append("\r\n");
		buffer.append("import com.mks.api.response.WorkItem;");
		buffer.append("\r\n");
		buffer.append("import com.mks.api.response.WorkItemIterator;");
		buffer.append("\r\n");

		buffer.append("\r\n");

	}

	private static void printPackageDeclaration(StringBuffer buffer) {
		buffer.append("package edu.gatech.mbsec.adapter.integrity.generated.resources;");
		buffer.append("\r\n");
		buffer.append("\r\n");
	}

	@Override
	public void run() {
		main(null);

	}

}
