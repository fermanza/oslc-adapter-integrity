package edu.gatech.mbsec.adapter.integrity.application;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

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
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityRequirement;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityServerResources;

public class TestRequirementToSimulink2 {

	public static SynchronizedBooleanFlag serverResourcesReadFlag = new SynchronizedBooleanFlag();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread thread = new Thread() {
			public void start(){
				readIntegrityData();
				//serverResourcesReadFlag.setValue(true);
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


	public static synchronized void readIntegrityData() {

		System.out.println("Inside Thread");

		IntegrationPointFactory integrationPointFactory = IntegrationPointFactory.getInstance();
		IntegrationPoint integrationPoint;
		Session session = null;		
		try {
			integrationPoint = integrationPointFactory.createLocalIntegrationPoint(4, 16);
			
			session = integrationPoint.getCommonSession();
			
			CmdRunner queryCmdRunner;
			Response queryResponse = null;

			try {
				queryCmdRunner = session.createCmdRunner();
				// "im editquery" -> edit a query and then execute
				Command queryCommand = new Command(Command.IM, "editquery"); 
				OptionList queryList = new OptionList();
				System.out.println("Editing quick query and running");				
				String queryName = "Quick Query";
				String queryFields = "Project,ID,Type,Name,Category,Text,Parameter Values,Requires";
				int reqId = 243828; // TODO: note that this is a custom hard coded value. 
				queryList.add("hostname", OSLC4JIntegrityApplication.integrityHostName); // the static block in OSLC4JIn... class calls APIs
				queryList.add("queryDefinition", "((field[ID]=" + reqId + "))");
				queryList.add("fields", queryFields);
				queryCommand.setOptionList(queryList);
				queryCommand.addSelection(queryName);
				System.out.println("Running edit query: " + queryName);
				queryResponse = queryCmdRunner.execute(queryCommand); // async call
				System.out.println("Finished editing query: " + queryName);
				
				System.out.println("Running query: " + queryName + " results");				
				
				queryCmdRunner = session.createCmdRunner();
				// "im issues" -> presents issues found in the query results for the specified query. You can also choose the columns to use in displaying the issues view information 
				queryCommand = new Command(Command.IM, "issues"); 
				queryList = new OptionList();
				queryList.add("hostname", OSLC4JIntegrityApplication.integrityHostName); // the static block in OSLC4JIn... class calls APIs
				queryList.add("query", queryName);
				queryList.add("fields", queryFields);
				queryCommand.setOptionList(queryList);
				System.out.println("Running query: " + queryName);
				queryResponse = queryCmdRunner.execute(queryCommand); // async call
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
								if(item !=null){
									fieldProject = item.getId();
									System.out.println("Project field = " + fieldProject);
								}
								else{ System.out.println("Project is Null"); }
								System.out.println("");
							} else if (field.getName().equals("ID")) {
								System.out.println("Reading ID field:");								
								// note that there is a "field.getDataType()" method that returns the expected output type 
								Object fieldValue = field.getValue();
								fieldID = (int) fieldValue;
								System.out.println("ID field = " + fieldID);								
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
								if(fieldName!=null){									
								} else { fieldName = "null";}
								System.out.println("Name field = " + fieldName);
								System.out.println("");
							} else if (field.getName().equals("Category")) {
								System.out.println("Reading Category field");
								Object fieldValue = field.getValue();
								fieldCategory = (String) fieldValue;
								if(fieldCategory!=null){									
								} else { fieldCategory = "null";}
								System.out.println("Category field = " + fieldCategory);
								System.out.println("");
							} else if (field.getName().equals("Text")) {
								System.out.println("Reading Text field");
								Object fieldValue = field.getValue();
								fieldText = (String) fieldValue;
								if(fieldText!=null){									
								} else { fieldText = "null";}
								System.out.println("Text field = " + fieldText);
								System.out.println("");
							} else if (field.getName().equals("Parameter Values")) {
								System.out.println("Reading Parameter Values field");
								Object fieldValue = field.getValue();
								fieldParameterValues = (String) fieldValue;
								if(fieldParameterValues!=null){									
								} else { fieldParameterValues = "null";}
								System.out.println("Parameter Values field = " + fieldParameterValues);
								System.out.println("");
							}		
							else if (field.getName().equals("Requires")) { // also a way to read "Contains" field
								// Contains relationship should provide way to access actual requirements
								System.out.println("Reading Requires field");
								Object fieldValue = field.getValue();
								ItemList itemList = (ItemList) fieldValue;
								ArrayList<Integer> requiresRelationshipIDs = new ArrayList<Integer>();
								if(itemList!=null){	
									Iterator<Item> itemIterator = itemList.getItems();
									while(itemIterator.hasNext()) {
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
									System.out.println("Creating query to read in the requires relationship elements found above");									
									//edit and run quick query
									try {
										queryCmdRunner = session.createCmdRunner();
										// "im editquery" -> edit a query and then execute
										queryCommand = new Command(Command.IM, "editquery"); 
										queryList = new OptionList();
										System.out.println("Editing quick query and running");				
										queryName = "Quick Query";
										queryFields = "Category,Name";					
										queryList.add("hostname", OSLC4JIntegrityApplication.integrityHostName); // the static block in OSLC4JIn... class calls APIs
										queryList.add("queryDefinition", "((field[ID]=" + requiresRelationshipIDs.get(0) + ")or(field[ID]=" + requiresRelationshipIDs.get(1) + "))");
										queryList.add("fields", queryFields);
										queryCommand.setOptionList(queryList);
										queryCommand.addSelection(queryName);
										System.out.println("Running edit query: " + queryName);
										queryResponse = queryCmdRunner.execute(queryCommand); // async call
										System.out.println("Finished editing query: " + queryName);
										
										System.out.println("Running query: " + queryName + " results");				
										
										queryCmdRunner = session.createCmdRunner();
										// "im issues" -> presents issues found in the query results for the specified query. You can also choose the columns to use in displaying the issues view information 
										queryCommand = new Command(Command.IM, "issues"); 
										queryList = new OptionList();
										queryList.add("hostname", OSLC4JIntegrityApplication.integrityHostName); // the static block in OSLC4JIn... class calls APIs
										queryList.add("query", queryName);
										queryList.add("fields", queryFields);
										queryCommand.setOptionList(queryList);
										System.out.println("Running query: " + queryName);
										queryResponse = queryCmdRunner.execute(queryCommand); // async call
										System.out.println("Finished executing query: " + queryName);
										System.out.println("Processing query: " + queryName + " results");
									
										String productConfig = ""; // from System Element
										String simulationName = ""; // from Function Element
										String strType = "";
										String strName = "";
										HashMap<String,String> requiresRelationHashMap = new HashMap<String, String>();												
										workItemIterator = queryResponse.getWorkItems();										
										while (workItemIterator.hasNext()) {
											workItem = workItemIterator.next();
											System.out.println("Reading fields from query result #" + idx + " " + workItem);

											// another way to access the field
											// Field idField = workItem.getField("id");
											// System.out.println(idField.toString());
											fieldsIterator = workItem.getFields();
											while (fieldsIterator.hasNext()) {
												fieldObject = fieldsIterator.next();
												if (fieldObject instanceof Field) {
													field = (Field) fieldObject;
													System.out.println("Field name = " + field.getName());
													System.out.println("Field display name = " + field.getDisplayName());
													if (field.getName().equals("Category")) {
														System.out.println("Reading Category field");
														fieldValue = field.getValue();
														strType = (String) fieldValue;
														if(strType!=null){									
														} else { strType = "null";}
														System.out.println("Category field = " + strType);
														System.out.println("");														
													} else if (field.getName().equals("Name")) {
														System.out.println("Reading Name field");
														fieldValue = field.getValue();
														strName = (String) fieldValue;
														if(strName!=null){									
														} else { strName = "null";}
														System.out.println("Name field = " + strName);
														System.out.println("");																											}
												}
											}
											requiresRelationHashMap.put(strType, strName);
										}
										productConfig = requiresRelationHashMap.get("System Element");										
										simulationName = requiresRelationHashMap.get("Function");
										
										System.out.println("");
									} catch (APIException e1) {
										System.err.println(e1.getMessage());
										System.err.println("");
										
									}
									
								}
								
							}
						}
					}
					
					

					/*
					String owningProjectID = IntegrityUtil.getProjectID(workItem.getFields());

					String projectId = null;
					String projectName = IntegrityUtil.getProjectName(workItem.getFields());
					if(projectName == null | projectName == ""){
						projectName = "unnamed";
					} else{
						projectName = IntegrityUtil.getValidProjectIdOrName(projectName);
					}
					if (owningProjectID == null) {
						projectId = "noproject";
					} else {
						owningProjectID = IntegrityUtil.getValidProjectIdOrName(owningProjectID);
						if(owningProjectID.equals(projectName)){
							projectId = "project" + projectName;
						} else{
							projectId = "project" + owningProjectID + projectName;
						}
					}
					IntegrityRequirement integrityRequirement;
					try {
						integrityRequirement = new IntegrityRequirement(java.net.URI.create(IntegrityManager.baseHTTPURI + "/services/"+ projectId + "/requirements/"+ workItem.getId()));
						IntegrityUtil.iterateThroughFields(workItem.getFields(),	integrityRequirement);
						qNameOslcIntegrityRequirementMap.put(integrityRequirement.getAbout().toString(),integrityRequirement);
						oslcIntegrityRequirements.add(integrityRequirement);
						IntegrityUtil.integrityIDURIMap.put(workItem.getId(),integrityRequirement.getAbout());
					} catch (URISyntaxException e) {
						e.printStackTrace();
					}
					 */
				}
				System.out.println(queryResponse.getWorkItems().next().getFields().next().toString());
				System.out.println("End Integrity API call");				
				integrationPointFactory.removeIntegrationPoint(integrationPoint);
				System.out.println("Removing integration point to terminate thread.");
				
			} 
			catch(ItemNotFoundException e){
				System.err.println(e.toString());
			}
		} 
		catch(Exception e){
			System.err.println(e.getMessage());
			System.err.println("");
			
		}
		return;
	}
}
