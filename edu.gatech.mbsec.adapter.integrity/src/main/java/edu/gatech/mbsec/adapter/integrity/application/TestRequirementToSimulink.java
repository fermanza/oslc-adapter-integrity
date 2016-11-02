package edu.gatech.mbsec.adapter.integrity.application;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Date;
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

public class TestRequirementToSimulink {

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
				// "im issues" -> presents issues found in the query results for the specified query. You can also choose the columns to use in displaying the issues view information 
				Command queryCommand = new Command(Command.IM, "issues"); 
				OptionList queryList = new OptionList();

				String queryName = "SkidSteerRelated_OnlyRequirement";
				queryList.add("hostname", OSLC4JIntegrityApplication.integrityHostName); // the static block in OSLC4JIn... class calls APIs
				queryList.add("query", queryName);
				queryList.add("fields", "Project,ID,Type,Name:,Category,Text:,Contains");
				// String fieldNameList = IntegrityUtil.getItemTypeFieldNames("Requirement", session);
				// queryList.add("fields",fieldNameList);
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
					String fieldTextColon = "";
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
								Item item = (Item) fieldValue;
								if(item!=null){									
								} else { fieldName = "null";}
								System.out.println("Name field = " + fieldName);
								System.out.println("");
							} else if (field.getName().equals("Category")) {
								System.out.println("Reading Category field");
								Object fieldValue = field.getValue();
								Item item = (Item) fieldValue;
								if(item!=null){									
								} else { fieldCategory = "null";}
								System.out.println("Category field = " + fieldCategory);
								System.out.println("");
							} else if (field.getName().equals("Text")) {
								System.out.println("Reading Text field");
								Object fieldValue = field.getValue();
								Item item = (Item) fieldValue;
								if(item!=null){									
								} else { fieldTextColon = "null";}
								System.out.println("Text field = " + fieldTextColon);
								System.out.println("");
							}
							else if (field.getName().equals("Contains")) {
								// Contains relationship should provide way to access actual requirements
								System.out.println("Reading Contains field");
								Object fieldValue = field.getValue();
								ItemList itemList = (ItemList) fieldValue;
								ArrayList<Integer> containedReqIds = new ArrayList<Integer>();
								if(itemList!=null){	
									Iterator<Item> itemIterator = itemList.getItems();
									while(itemIterator.hasNext()) {
										// get IDs for each item
										Item item = itemIterator.next();
										containedReqIds.add(Integer.parseInt(item.getId()));
										System.out.println("Contained Requirement id: " + item.getId());
										// System.out.println(item.toString());
										System.out.println("");
									}
								} 
								System.out.println("Requirement Ids to read in: " + containedReqIds.toString());
								System.out.println("");
																
								if (!containedReqIds.isEmpty()) {
									System.out.println("Creating query to read in the requirements found above");									
									//create query
									try {
										/*
										// try to delete query if it already exists before creating new one. 
										try {											
											CmdRunner deleteQueryCmdRunner = session.createCmdRunner();
											// Command deleteQueryCommand = new Command(Command.IM, "deletequery" + " --noconfirm" + " --hostname=" + OSLC4JIntegrityApplication.integrityHostName + " \"Find Contained Requirements\"");
											Command deleteQueryCommand = new Command(Command.IM, "deletequery");
											OptionList deleteQueryOptionList = new OptionList();
											deleteQueryOptionList.add("noconfirm",null);
											deleteQueryOptionList.add("hostname", OSLC4JIntegrityApplication.integrityHostName);
											// Option opt1 = new Option("\"Find Contained Requirements\"");
											//deleteQueryOptionList.add(opt1);	
											// deleteQueryOptionList.add("me:\"Find Contained Requirements\"",null);
											// Option opt2 = new Option("noconfirm");
											// deleteQueryOptionList.add(opt2);	
											deleteQueryCommand.setOptionList(deleteQueryOptionList);
											deleteQueryCommand.addSelection("test Delete");
											Response deleteQueryResponse = deleteQueryCmdRunner.execute(deleteQueryCommand);
											System.out.println(deleteQueryResponse);
											System.out.println("");
										} catch (APIException e) {
											System.err.println(e.getMessage());
											System.err.println("");
										}	
										*/
											/*																		
										CmdRunner createQueryCmdRunner = session.createCmdRunner();
										Command createQueryCommand = new Command(Command.IM, "createquery");
										OptionList createQueryOptionList = new OptionList();
										createQueryOptionList.add("name", "Find Contained Requirements");
										// this will add a query to the client GUI as well. Therefore it errors out
										// after the query has been created once. Find alternative option.
										String queryDefString = "((field[ID]=" + containedReqIds.get(0) + ")or(field[ID]=" + containedReqIds.get(1) + "))"; // overall grouping () is required.  
										createQueryOptionList.add("queryDefinition", queryDefString);
										createQueryCommand.setOptionList(createQueryOptionList);
										Response createQueryResponse = createQueryCmdRunner.execute(createQueryCommand);
										System.out.println(createQueryResponse);
										System.out.println("");
										*/
										
										// keep updating the existing quick query										
										CmdRunner quickQueryCmdRunner = session.createCmdRunner();
										Command quickQueryCommand = new Command(Command.IM, "editquery");
										OptionList quickQueryOptionList = new OptionList();
										//quickQueryOptionList.add("name", "Quick Query");
										String quickqueryDefString = "((field[ID]=" + containedReqIds.get(0) + ")or(field[ID]=" + containedReqIds.get(1) + "))"; // overall grouping () is required.  
										quickQueryOptionList.add("queryDefinition", quickqueryDefString);
										quickQueryCommand.setOptionList(quickQueryOptionList);
										quickQueryCommand.addSelection("Quick Query");
										Response quickQueryResponse = quickQueryCmdRunner.execute(quickQueryCommand);
										System.out.println(quickQueryResponse);
										System.out.println("");
										
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
