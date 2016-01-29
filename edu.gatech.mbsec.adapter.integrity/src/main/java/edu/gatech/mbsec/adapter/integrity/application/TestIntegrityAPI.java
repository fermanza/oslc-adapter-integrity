package edu.gatech.mbsec.adapter.integrity.application;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Iterator;

import com.mks.api.CmdRunner;
import com.mks.api.Command;
import com.mks.api.IntegrationPoint;
import com.mks.api.IntegrationPointFactory;
import com.mks.api.OptionList;
import com.mks.api.Session;
import com.mks.api.response.APIException;
import com.mks.api.response.Field;
import com.mks.api.response.Item;
import com.mks.api.response.ItemList;
import com.mks.api.response.Response;
import com.mks.api.response.Result;
import com.mks.api.response.SubRoutine;
import com.mks.api.response.SubRoutineIterator;
import com.mks.api.response.WorkItem;
import com.mks.api.response.WorkItemIterator;
import com.mks.api.util.APIVersion;

public class TestIntegrityAPI {

	static StringBuffer loggingBuffer = new StringBuffer();
	
	public static void main(String[] args) {

		try {

			
			
			IntegrationPointFactory integrationPointFactory = IntegrationPointFactory
					.getInstance();
			//

			// create connection with Integrity server
			// IntegrationPoint integrationPoint =
			// integrationPointFactory.createIntegrationPoint("localhost", 7001,
			// 4, 10);
			// com.mks.api.response.APIConnectionException: Failed to establish
			// a session: Session not authenticated/authorized.

			// create connection with Integrity client
			IntegrationPoint integrationPoint = integrationPointFactory
					.createLocalIntegrationPoint(4, 12);

			// IntegrationPoint integrationPoint =
			// IntegrationPointFactory.getInstance().createIntegrationPoint("localhost",
			// 7001, APIVersion.API_4_12 );
			// Session session = integrationPoint.createSession("axel", "axel",
			// APIVersion.MINOR_VERSION_LESSER,
			// APIVersion.MINOR_VERSION_GREATER);

			// Session session = integrationPoint.createSession();

			// Session session = integrationPoint.createSession("axel", "axel");
			Session session = integrationPoint.getCommonSession();

			session.setTimeout(10); // The number of seconds to wait before
									// timing out on a connect
			System.out.println(session.isCommon()); // session is not common!

			CmdRunner cmdRunner = session.createCmdRunner(); // You can only run
																// one command
																// per CmdRunner
																// object. If
																// multiple
																// commands need
																// to be run
																// concurrently,
																// use multiple
																// CmdRunner
																// objects.
			// String[] strArray = new String[1];
			// strArray[0] = Command.INTEGRITY;

			// si projects displays a list of projects registered to the
			// currently connected Integrity Server
			// com.mks.api.response.NoCredentialsException: Authentication
			// failed for axel on ME01241:7001
			// with options, no exception
			// [--hostname=server] [--port=number] [--password=password]
			// [--user=name]

			// si projectinfo displays current project information

			// im projects displays projects registered to the
			// currently connected Integrity Client !?

			// Command command = new Command(Command.IM, "projects");
			// optionList.add("fields", "references, description");

			Command queryReqDocCommand = new Command(Command.IM, "issues");

			OptionList queryReqDocOptionList = new OptionList();
			queryReqDocOptionList.add("hostname", "localhost");
			queryReqDocOptionList.add("port", "7001");
			queryReqDocOptionList.add("password", "axel");
			queryReqDocOptionList.add("user", "axel");

			// optionList.add("project", "/alm_sample/project.pj");

			// optionList.add("query", "alm_Requirements");
			queryReqDocOptionList.add("queryDefinition",
					"(subquery[alm_All Requirements Documents])");
			// optionList.add("fields", "ID,Type,Summary,Project");
			// optionList.add("fields", "Summary,Project");

			// Authorizing Change Order, Valid Change Order, Allow Edits

			queryReqDocOptionList
					.add("fields",
							"Category,Summary,State,Project,"
									+ "Parameters,Parameter Values,Attachments,"
									+ "Significant Edit Date,Revision,Revision Increment Date,ID");

			queryReqDocCommand.setOptionList(queryReqDocOptionList);

			Response response = cmdRunner.execute(queryReqDocCommand);
			// Result result = response.getResult();
			// System.out.println("result.getFieldListSize(): " +
			// result.getFieldListSize());

			WorkItemIterator workItemIterator = response.getWorkItems();
			while (workItemIterator.hasNext()) {
				WorkItem workItem = workItemIterator.next();

				System.out.println("");
				System.out.println("*** New WorkItem ***");
				System.out.println(workItem);

				loggingBuffer.append("\r\n");
				loggingBuffer.append("\r\n*** New WorkItem ***");
				loggingBuffer.append("\r\n" + workItem);
				
				System.out.println("workItem.getFieldListSize(): "
						+ workItem.getFieldListSize());

				System.out.println("FIELDS");
				Iterator fieldsIterator = workItem.getFields();
				iterateThroughFields(fieldsIterator);

				SubRoutineIterator subRoutinesIterator = workItem
						.getSubRoutines();
				while (subRoutinesIterator.hasNext()) {
					Object subRoutineObject = subRoutinesIterator.next();
					if (subRoutineObject instanceof SubRoutine) {
						System.out.println("");
						System.out.println("*** New SubRoutine ***");
						SubRoutine subRoutine = (SubRoutine) subRoutineObject;

						System.out.println("subRoutine.getRoutine(): "
								+ subRoutine.getRoutine());
						System.out.println("subRoutine.getResult(): "
								+ subRoutine.getResult());
					}
				}

			}

			System.out.println("***  ***");
			System.out.println("*** REQUIREMENTS ***");
			System.out.println("***  ***");
			Command queryReqCommand = new Command(Command.IM, "issues");
			OptionList queryReqOptionList = new OptionList();
			queryReqOptionList.add("hostname", "localhost");
			queryReqOptionList.add("port", "7001");
			queryReqOptionList.add("password", "axel");
			queryReqOptionList.add("user", "axel");
			queryReqOptionList.add("query", "alm_Requirements");
			// queryReqOptionList
			// .add("fields",
			// "Category,Summary,State,Project,"
			// + "Parameters,Parameter Values,Attachments,"
			// + "Significant Edit Date,Revision,Revision Increment Date,ID");
			queryReqOptionList.add("fields",
					"State,Project,Attachments,Parameter Values,"
							+ "alm_Authorizing Change Order,"
							+ "alm_Suspect Count," + "alm_IncludeReference,"
							+ "alm_IncludeReference," + "alm_Priority,"
							+ "alm_Satisfied By," + "alm_Validated By,"
							+ "alm_Spawns," + "alm_Decomposes To,"
							+ "alm_Is Related To,"
							+ "alm_Include Subsegment in Metrics,"
							+ "alm_Validated By Trace Count,"
							+ "alm_Trace Status,"
							+ "alm_Downstream Trace Count,"
							+ "alm_Upstream Trace Count,"
							+ "alm_Validated By Pass Count,"
							+ "alm_Validated By Pass Percentage,"
							+ "alm_Additional Comments,"
							+ "alm_Category Int Value," + "alm_Modelled By,"
							+ "alm_Verified By,"
							+ "alm_Verified By Pass Count,"
							+ "alm_Verified By Trace Count,"
							+ "alm_Verified By Pass Percentage," + "alm_Hide,"
							+ "alm_Changes Authorized By,"
							+ "alm_Decomposed From," + "alm_Is Related To,"
							+ "alm_Valid Change Order,"
							+ "alm_Validated By Trace Health,"
							+ "alm_Verified By Trace Health," + "alm_Text,"
							+ "alm_Text Attachments," + "alm_Project State,"
							+ "alm_Parameter Values From Shared Item,"
							+ "alm_Parameters From Shared Item,"
							+ "alm_Project Phase FVA," + "Bookmarks,"
							+ "Signature Comment," + "Signed By," + "Type,"
							+ "ID," + "Modified By," + "Created By,"
							+ "Modified Date," + "Created Date," + "Category,"
							+ "References," + "Contains," + "Contained By,"
							+ "Reference Mode," + "Document ID,"
							+ "Subsegment Name," + "Referenced Item Type,"
							+ "Shares," + "Shared By," + "Root ID,"
							+ "Referenced Bookmarks," + "Input Revision Date,"
							+ "Significant Edit Date,"
							+ "Item Significant Edit Date on Shared Item,"
							+ "Revision," + "Revision Increment Date,"
							+ "Significant Change Since Item Revision");

			queryReqCommand.setOptionList(queryReqOptionList);
			CmdRunner cmdRunner2 = session.createCmdRunner();
			Response queryReqResponse = cmdRunner2.execute(queryReqCommand);
			WorkItemIterator workItemIterator2 = queryReqResponse
					.getWorkItems();
			while (workItemIterator2.hasNext()) {
				WorkItem workItem = workItemIterator2.next();
				System.out.println("");
				System.out.println("*** New WorkItem ***");
				System.out.println(workItem);

				loggingBuffer.append("\r\n");
				loggingBuffer.append("\r\n*** New WorkItem ***");
				loggingBuffer.append("\r\n" + workItem);

				System.out.println("FIELDS");
				Iterator fieldsIterator = workItem.getFields();
				iterateThroughFields(fieldsIterator);
			}

			// Result result = response.getResult();
			// System.out.println(result.getMessage());
			System.out.println(response.getConnectionPort());
			
			
			try {
				FileWriter logFile = new FileWriter("log.txt");
				logFile.append(loggingBuffer);
				logFile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			integrationPoint.release();
		} catch (APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.print(e.toString());

		}

		
		
	}

	private static void iterateThroughFields(Iterator fieldsIterator) {

		while (fieldsIterator.hasNext()) {
			Object fieldObject = fieldsIterator.next();
			if (fieldObject instanceof Field) {
				Field field = (Field) fieldObject;
				System.out.println("");
				System.out.println("*** New Field ***");
				System.out.println("field.getName(): " + field.getName());
				System.out.println("field.getValueAsString(): "
						+ field.getValueAsString());
				System.out.println("field.getModelType(): "
						+ field.getModelType());
				System.out.println("field.getDataType(): "
						+ field.getDataType());

				loggingBuffer.append("\r\n ");
				loggingBuffer.append("\r\n*** New Field ***");
				loggingBuffer.append("\r\nfield.getName(): " + field.getName());
				loggingBuffer.append("\r\nfield.getValueAsString(): "
						+ field.getValueAsString());
				loggingBuffer.append("\r\nfield.getModelType(): "
						+ field.getModelType());
				loggingBuffer.append("\r\nfield.getDataType(): "
						+ field.getDataType());
				
				
				// get references
				if (field.getDataType() != null) {
					if (field.getDataType().equals(
							"com.mks.api.response.ItemList")) {
						Object fieldValue = field.getValue();
						if (fieldValue instanceof ItemList) {
							ItemList itemList = (ItemList) fieldValue;
							System.out.println("");
							System.out.println("*** New ItemList ***");
							
							loggingBuffer.append("\r\n");
							loggingBuffer.append("\r\n*** New ItemList ***");
							
							for (Object object : itemList) {
								if (object instanceof Item) {
									Item item = (Item) object;
									System.out.println("");
									System.out.println("*** New Item ***");
									System.out.println("ITEM ID: "
											+ item.getId());
									
									loggingBuffer.append("\r\n");
									loggingBuffer.append("\r\n*** New Item ***");
									loggingBuffer.append("\r\nITEM ID: "
											+ item.getId());
									
//									iterateThroughFields(item.getFields());
								}
							}
						}
					}
					if (field.getDataType().equals("com.mks.api.response.Item")) {
						Object fieldValue = field.getValue();
						if (fieldValue instanceof Item) {
							Item item = (Item) fieldValue;
							System.out.println("");
							System.out.println("*** New Item ***");
							System.out.println("ITEM ID: " + item.getId());
							loggingBuffer.append("\r\n");
							loggingBuffer.append("\r\n*** New Item ***");
							loggingBuffer.append("\r\nITEM ID: "
									+ item.getId());
							// iterateThroughFields(item.getFields());

						}
					}
				}

			}
		}

	}

}
