package edu.gatech.mbsec.adapter.integrity.application;

import java.net.URISyntaxException;
import java.util.Date;
import java.util.Iterator;

import com.mks.api.CmdRunner;
import com.mks.api.Command;
import com.mks.api.IntegrationPoint;
import com.mks.api.IntegrationPointFactory;
import com.mks.api.OptionList;
import com.mks.api.Session;
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
								Iterator<Item> itemIterator = itemList.getItems();
								while(itemIterator.hasNext()) {
									Item item = itemIterator.next();
									System.out.println(item.toString());
									System.out.println("");
								}
								if(itemList!=null){									
								} else { fieldTextColon = "null";}
								System.out.println("Text field = " + fieldTextColon);
								System.out.println("");
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
				System.out.println("");
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
