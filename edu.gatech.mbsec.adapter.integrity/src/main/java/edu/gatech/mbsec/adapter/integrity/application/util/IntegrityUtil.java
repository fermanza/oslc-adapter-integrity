package edu.gatech.mbsec.adapter.integrity.application.util;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.provider.jena.JenaProvidersRegistry;
import org.eclipse.lyo.oslc4j.provider.json4j.Json4JProvidersRegistry;

import com.mks.api.CmdRunner;
import com.mks.api.Command;
import com.mks.api.OptionList;
import com.mks.api.SelectionList;
import com.mks.api.Session;
import com.mks.api.response.APIException;
import com.mks.api.response.Field;
import com.mks.api.response.Item;
import com.mks.api.response.ItemList;
import com.mks.api.response.Response;
import com.mks.api.response.WorkItem;
import com.mks.api.response.WorkItemIterator;

import edu.gatech.mbsec.adapter.integrity.application.IntegrityManager;
import edu.gatech.mbsec.adapter.integrity.application.OSLC4JIntegrityApplication;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityField;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityItem;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityPriorityEnumeration;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityProject;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityServerResources;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityTraceStatusEnumeration;
import edu.gatech.mbsec.adapter.integrity.services.ServiceProviderCatalogService;
import edu.gatech.mbsec.adapter.integrity.services.ServiceProviderService;

public class IntegrityUtil {

	static Map<String, String> projectNameIDMap = new HashMap<String, String>();
	public static Map<String, URI> integrityIDURIMap = new HashMap<String, URI>();
	static Map<Object, ArrayList<Field>> objectFieldValueMap = new HashMap<Object, ArrayList<Field>>();
	public static Set<URI> oslcIntegrityItemURIs = new HashSet<URI>();

	// public static List<IntegrityProject> oslcIntegrityProjects = new
	// ArrayList<IntegrityProject>();
	// public static List<IntegrityField> oslcIntegrityFields = new
	// ArrayList<IntegrityField>();
	// public static List<IntegrityItem> oslcIntegrityItems = new
	// ArrayList<IntegrityItem>();

	// static Map<String, IntegrityProject> qNameOslcIntegrityProjectMap = new
	// HashMap<String, IntegrityProject>();
	// static Map<URI, IntegrityField> qNameOslcIntegrityFieldMap = new
	// HashMap<URI, IntegrityField>();
	// static Map<String, IntegrityItem> qNameOslcIntegrityItemMap = new
	// HashMap<String, IntegrityItem>();

	public static String getItemTypeFieldNames(String itemTypeName,
			Session session) {
		CmdRunner queryReqDocsCmdRunner;
		StringBuffer fieldNameListBuffer = new StringBuffer();
		try {
			queryReqDocsCmdRunner = session.createCmdRunner();
			ArrayList<String> itemTypeFields = new ArrayList<String>();
			// get all fields of Module_Component Requirement Documents
			Command queryReqDocsFieldCommand = new Command(Command.IM,
					"viewtype");
			// command hostname option
			OptionList queryReqDocsFieldOptionList = new OptionList();
			queryReqDocsFieldOptionList.add("hostname",
					OSLC4JIntegrityApplication.integrityHostName);
			queryReqDocsFieldCommand.setOptionList(queryReqDocsFieldOptionList);
			// command viewtype argument
			SelectionList queryReqDocsFieldSelectionList = new SelectionList();
			queryReqDocsFieldSelectionList.add(itemTypeName);
			queryReqDocsFieldCommand
					.setSelectionList(queryReqDocsFieldSelectionList);
			// send command
			Response queryReqDocsFieldResponse = queryReqDocsCmdRunner
					.execute(queryReqDocsFieldCommand);
			WorkItemIterator reqDocItemFieldIterator = queryReqDocsFieldResponse
					.getWorkItems();

			// create string for queryReqDocsList
			while (reqDocItemFieldIterator.hasNext()) {
				WorkItem workItem = (WorkItem) reqDocItemFieldIterator.next();
				Iterator fieldIterator = workItem.getFields();
				boolean isCommaNeeded = false;
				while (fieldIterator.hasNext()) {
					Field field = (Field) fieldIterator.next();
					String fieldName = field.getName();

					if (fieldName.equals("visibleFields")) {
						if (isCommaNeeded) {
							fieldNameListBuffer.append(",");
						}
						fieldNameListBuffer.append(field.getValueAsString());
						isCommaNeeded = true;
					}

					if (fieldName.equals("systemManagedFields")) {
						if (isCommaNeeded) {
							fieldNameListBuffer.append(",");
						}
						fieldNameListBuffer.append(field.getValueAsString());
						isCommaNeeded = true;
					}
				}
			}
		} catch (APIException e) {
			// TODO Auto-generated catch block
			System.err.println(e.toString());	
		}

		return fieldNameListBuffer.toString();

	}

	public static String getProjectID(Iterator<Field> fieldsIterator) {
		String owningProjectID = null;
		while (fieldsIterator.hasNext()) {
			Object fieldObject = fieldsIterator.next();
			if (fieldObject instanceof Field) {
				Field field = (Field) fieldObject;
				if (field.getName().equals("Project")) {
					Object fieldValue = field.getValue();
					Item item = (Item) fieldValue;
					if(item !=null){
						owningProjectID = item.getId();
						String projectID = IntegrityUtil.projectNameIDMap
								.get(owningProjectID);
						return projectID;
					}
					else{
						return null;
					}
					
//					String projectID = null;
//					if(owningProjectID == null){
//						projectID = IntegrityUtil.projectNameIDMap
//								.get(owningProjectID);
//					}
//					else{
//						projectID = IntegrityUtil.projectNameIDMap
//								.get(owningProjectID);
//					}
					
					
					
				}
			}
		}
		return owningProjectID;
	}

	public static String getProjectName(Iterator<Field> fieldsIterator) {
		String projectName = null;
		while (fieldsIterator.hasNext()) {
			Object fieldObject = fieldsIterator.next();
			if (fieldObject instanceof Field) {
				Field field = (Field) fieldObject;
				if (field.getName().equals("Project")) {
					Object fieldValue = field.getValue();
					Item item = (Item) fieldValue;
					if(item != null){
						projectName = new String(item.getId());
						return projectName;
					}
					else{
						return null;
					}
					
					// projectName = projectName.replaceFirst("/", "");
					// // http://en.wikipedia.org/wiki/Percent-encoding
					// projectName = projectName.replace("/", "%2F");
					
				}
			}
		}
		return projectName;
	}

	public static String getSpecialProjectName(Iterator<Field> fieldsIterator) {
		String projectName = null;
		while (fieldsIterator.hasNext()) {
			Object fieldObject = fieldsIterator.next();
			if (fieldObject instanceof Field) {
				Field field = (Field) fieldObject;
				if (field.getName().equals("name")) {
					Object fieldValue = field.getValue();
					projectName = (String) fieldValue;
					
					// projectName = projectName.replaceFirst("/", "");
					// // http://en.wikipedia.org/wiki/Percent-encoding
					// projectName = projectName.replace("/", "%2F");
					return projectName;
				}
			}
		}
		return projectName;
	}
	
	public static void getAllProjects(Session session) {
		/**
		 * Updates static variable "projectNameIDMap" with 
		 * Updates static variable "integrityIDURIMap" with 
		 */
		CmdRunner queryProjectsCmdRunner;
		try {
			queryProjectsCmdRunner = session.createCmdRunner();
			
			
//			Command queryProjectsCommand = new Command(Command.IM, "issues");
//			OptionList queryProjectsOptionList = new OptionList();
//			// queryProjectsOptionList.add("query", "alm_All Projects");
//			queryProjectsOptionList.add("hostname", OSLC4JIntegrityApplication.integrityHostName);
//			queryProjectsOptionList.add("query", "All Projects");
//			queryProjectsOptionList.add("fields", "Summary,State,Project,"
//					+ "ID," + "Modified By," + "Created By," + "Modified Date,"
//					+ "Created Date," + "Type,Modified By,Type,Project");
//			queryProjectsCommand.setOptionList(queryProjectsOptionList);
			
			
			Command queryProjectsCommand = new Command(Command.IM, "projects");
			OptionList queryProjectsOptionList = new OptionList();
			queryProjectsOptionList.add("hostname", OSLC4JIntegrityApplication.integrityHostName);			
			queryProjectsCommand.setOptionList(queryProjectsOptionList);
			
			
			
			
			
			Response queryProjectsResponse = queryProjectsCmdRunner
					.execute(queryProjectsCommand);
			WorkItemIterator workItemIterator = queryProjectsResponse
					.getWorkItems();

			while (workItemIterator.hasNext()) {
				WorkItem workItem = workItemIterator.next();
//				System.out.println("");
//				System.out.println("*** New Project ***");
//				System.out.println(workItem);
//
//				System.out.println("ID: " + workItem.getId());
				// iterateThroughFields(workItem.getFields());

				String projectName = getProjectName(workItem.getFields());
				
				// new Integrity projects have only one field describing the project name
				if(projectName == null){
					projectName = getSpecialProjectName(workItem.getFields());
				}

				// workItem ID = project ID
				String projectIdWithSpecialChars = "project" + workItem.getId();
				
				//make sure to remove any slash from projectId
				//make sure to remove any white space from projectId
//				projectId = projectId.replace("/", "_");
//				projectId = projectId.replace(" ", "_");
				String projectId = IntegrityUtil.getValidProjectIdOrName(projectIdWithSpecialChars);
				
				projectNameIDMap.put(projectName, workItem.getId());

				// projectName = projectName.replace(" ", "_");
				// projectName = projectName.replace("/", "__");
				edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityProject integrityProject;
				try {

					integrityProject = new IntegrityProject(
							java.net.URI.create(IntegrityManager.baseHTTPURI
									+ "/services/" + projectId + "/projects"));
					integrityProject.setName(projectName);
					iterateThroughFields(workItem.getFields(), integrityProject);
					
					// some projects have no id, just a name
					if(integrityProject.getID() == null){
						integrityProject.setID(projectId);
					}
					
					IntegrityServerResources.qNameOslcIntegrityProjectMap.put(
							integrityProject.getAbout().toString(),
							integrityProject);
					IntegrityServerResources.oslcIntegrityProjects
							.add(integrityProject);
					integrityIDURIMap.put(workItem.getId(),
							integrityProject.getAbout());
				} catch (URISyntaxException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			// create noproject
			IntegrityProject integrityNoProject;
			try {
				integrityNoProject = new IntegrityProject(
						java.net.URI.create(IntegrityManager.baseHTTPURI
								+ "/services/" + "noproject" + "/project/"
								+ "noproject"));
				integrityNoProject.setID("0");
				IntegrityServerResources.qNameOslcIntegrityProjectMap.put(
						integrityNoProject.getAbout().toString(),
						integrityNoProject);
				IntegrityServerResources.oslcIntegrityProjects
						.add(integrityNoProject);
				integrityIDURIMap.put("0", integrityNoProject.getAbout());
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (APIException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static void iterateThroughFields(Iterator<Field> fieldsIterator,
			Object object) {
		ArrayList<Field> fieldLinks = new ArrayList<Field>();
		while (fieldsIterator.hasNext()) {
			Object fieldObject = fieldsIterator.next();
			if (fieldObject instanceof Field) {
				Field field = (Field) fieldObject;
				if (field.getValueAsString() == null) {
					continue;
				}

//				System.out.println("");
//				System.out.println("*** New Field ***");
//				System.out.println("field.getName(): " + field.getName());
//				System.out.println("field.getValueAsString(): "
//						+ field.getValueAsString());
//				System.out.println("field.getProjectType(): "
//						+ field.getModelType());
//				System.out.println("field.getDataType(): "
//						+ field.getDataType());

				// get object property name
				String fieldName = field.getName();
				fieldName = fieldName.trim();
				fieldName = fieldName.replace(" ", "");
				if (!fieldName.equals("ID")) {
					fieldName = fieldName.substring(0, 1).toUpperCase()
							+ fieldName.substring(1, fieldName.length());
				}

				if (fieldName.equals("Project")
						& object.getClass().getName()
								.equals("IntegrityProject")) {
					fieldName = "Name";
				}

				// check that the field has a value
				// if (field.getDataType() != null) {
				// if (field.getDataType().equals(
				// "com.mks.api.response.ItemList")) {
				// Object fieldValue = field.getValue();
				// if (fieldValue instanceof ItemList) {
				// ItemList itemList = (ItemList) fieldValue;
				// if (itemList.size() == 0) {
				// continue;
				// }
				// }
				// } else if (field.getDataType().equals(
				// "com.mks.api.response.Item")) {
				// Object fieldValue = field.getValue();
				// Item item = null;
				// if (fieldValue instanceof Item) {
				// item = (Item) fieldValue;
				// if (item == null) {
				// continue;
				// }
				// }
				// }
				// }

				// try to find equivalent property
				for (Method method : object.getClass().getDeclaredMethods()) {
					if (method.getName().equals("set" + fieldName)) {
						try {
							Class[] parameterTypesArray = method
									.getParameterTypes();
							Class parameterType = parameterTypesArray[0];
							String parameterTypeName = parameterType.getName();

							// set object property value
							if (field.getDataType() != null) {
								if (field.getDataType().equals(
										"com.mks.api.response.ItemList")) {
									Object fieldValue = field.getValue();
									if (fieldValue instanceof ItemList) {
										ItemList itemList = (ItemList) fieldValue;

										// not all Integrity items may have been
										// mapped into OSLC resources at this
										// point
										// the OSLC resource can not refer to
										// all linked resources
										// the links of this OSLC resource for
										// the specific Integrity Item field
										// needs to be resolved once all OSLC
										// resources have been created
										if (itemList.size() > 0) {
											fieldLinks.add(field);
											break;
										}
									}
								} else if (field.getDataType().equals(
										"com.mks.api.response.Item")) {
									Object fieldValue = field.getValue();
									Item item = null;
									if (fieldValue instanceof Item) {
										item = (Item) fieldValue;
										if (parameterTypeName
												.equals("java.lang.String")) {
											String[] stringArray = new String[1];
											stringArray[0] = field
													.getValueAsString();
											method.invoke(object, stringArray);
										} else {
											fieldLinks.add(field);
										}
										break;
									}
								} else {
									// not an itemlist nor an item
									if (parameterTypeName
											.equals("java.lang.String")) {
										String[] stringArray = new String[1];
										stringArray[0] = field
												.getValueAsString();
										method.invoke(object, stringArray);
										break;
									} else if (parameterTypeName
											.equals("boolean")) {
										boolean value = Boolean.valueOf(
												field.getValueAsString())
												.booleanValue();
										method.invoke(object, value);
										break;
									} else if (parameterTypeName.equals("int")) {
										int value = Integer.valueOf(
												field.getValueAsString())
												.intValue();
										method.invoke(object, value);
										break;
									} else if (parameterTypeName
											.equals("float")) {
										String valueString = field
												.getValueAsString();
										valueString = valueString.replace("%",
												"");
										float value = Float
												.valueOf(valueString)
												.floatValue();
										method.invoke(object, value);
										break;
									} else {
										System.err.println("Field " + fieldName
												+ " of object "
												+ object.toString()
												+ " not set!!");
									}

								}
							}
						} catch (IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SecurityException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}
		}
		if (fieldLinks.size() > 0) {
			objectFieldValueMap.put(object, fieldLinks);
		}

	}

	public static Class<?>[] getResourceClassesForRegisteringServices() {

		// through classloading, add classes to class array instead of
		// hard-coding classes in array
		// create list of classes and then convert to array
		ArrayList<Class> serviceClassesList = new ArrayList<Class>();
		List<String> serviceClassNamesList = getAllJavaClassesInPackage("src/main/java/edu/gatech/mbsec/adapter/integrity/generated/services");
		for (String serviceClassName : serviceClassNamesList) {
			if (!(serviceClassName.startsWith("IntegrityFieldService")
					| serviceClassName.startsWith("IntegrityServerService")
					| serviceClassName.startsWith("/gitignore") | serviceClassName
						.startsWith(".gitignore"))) {
				String modifiedClassName = serviceClassName
						.replace(".java", "");
				modifiedClassName = modifiedClassName.replace(".class", "");
				Class serviceClass = null;
				try {
					serviceClass = Class
							.forName("edu.gatech.mbsec.adapter.integrity.generated.services."
									+ modifiedClassName);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				serviceClassesList.add(serviceClass);
			}
		}
		Class[] classAarray = serviceClassesList
				.toArray(new Class[serviceClassesList.size()]);
		return classAarray;
	}

	public static Set<Class<?>> getResourceClassesForRegisteringEntityProviders() {

		// adding first default OSLC entity providers
		Set<Class<?>> entityProviderClassesSet = new HashSet<Class<?>>();
		entityProviderClassesSet.addAll(JenaProvidersRegistry.getProviders());
		entityProviderClassesSet.addAll(Json4JProvidersRegistry.getProviders());
		
		
		List<String> defaultServiceClassNamesList = getAllJavaClassesInPackage("src/main/java/edu/gatech/mbsec/adapter/integrity/services");
		for (String serviceClassName : defaultServiceClassNamesList) {
			String modifiedClassName = serviceClassName.replace(".java", "");
			modifiedClassName = modifiedClassName.replace(".class", "");
			Class serviceClass = null;
			try {
				serviceClass = Class
						.forName("edu.gatech.mbsec.adapter.integrity.services."
								+ modifiedClassName);
				entityProviderClassesSet.add(serviceClass);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// through classloading, add classes to class array instead of
		// hard-coding classes in array
		// create list of classes and then convert to array

		List<String> serviceClassNamesList = getAllJavaClassesInPackage("src/main/java/edu/gatech/mbsec/adapter/integrity/generated/services");
		for (String serviceClassName : serviceClassNamesList) {
			if (!(serviceClassName.startsWith("IntegrityFieldService")
					| serviceClassName
							.startsWith("IntegrityServerService.java")
					| serviceClassName.startsWith("/gitignore") | serviceClassName
						.startsWith(".gitignore"))) {
				String modifiedClassName = serviceClassName
						.replace(".java", "");
				modifiedClassName = modifiedClassName.replace(".class", "");
				Class serviceClass = null;
				try {
					serviceClass = Class
							.forName("edu.gatech.mbsec.adapter.integrity.generated.services."
									+ modifiedClassName);
					entityProviderClassesSet.add(serviceClass);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		return entityProviderClassesSet;
	}

	private static List<String> getAllJavaClassesInPackage(String fileURI) {
		File serviceClassesPackageLocation = new File(fileURI);
		if (!serviceClassesPackageLocation.isDirectory()) {
			// relative path to service classes is different in standalone
			// Tomcat/Catalina war deployment than in embedded Eclipse Tomcat
			// server deployment

			// in standalone Tomcat deployement, root is /bin folder of Tomcat
			// installation directory
			// in embedded Eclipse Tomcat deployment, root is Eclipse project
			// location

			// get relative path for standalone Tomcat deployment
			// get postfix, the part after oslc4jintegrity
			String postfix = fileURI.substring(
					fileURI.indexOf("oslc4jintegrity/") + 16, fileURI.length());
			String newFileURI = "../webapps/oslc4jintegrity/WEB-INF/classes/edu/gatech/mbsec/adapter/integrity/"
					+ postfix;
			serviceClassesPackageLocation = new File(newFileURI);
		}
		String[] serviceClasses = serviceClassesPackageLocation.list();
		return (List<String>) Arrays.asList(serviceClasses);
	}

	public static IntegrityField getFieldByURI(URI fieldURI) {
		IntegrityField integrityField = IntegrityServerResources.qNameOslcIntegrityFieldMap
				.get(fieldURI.toString());
		return integrityField;
	}

	private static Object getFieldValue(Iterator<Field> fieldsIterator,
			String fieldName) {
		String owningProjectID = null;
		while (fieldsIterator.hasNext()) {
			Object fieldObject = fieldsIterator.next();
			if (fieldObject instanceof Field) {
				Field field = (Field) fieldObject;
				if (field.getName().equals(fieldName)) {
					Object fieldValue = field.getValue();
					return fieldValue;
				}
			}
		}
		return owningProjectID;
	}

	public static String getProjectName(String id) {
		String projectName = null;
		if (!projectNameIDMap.containsValue(id)) {
			return null;
		}
		for (String projectName2 : projectNameIDMap.keySet()) {
			if (projectNameIDMap.get(projectName2).equals(id)) {
				projectName = projectName2;
				break;
			}
		}

		return projectName;
	}

	private static void iterateThroughItemFields(
			Iterator<Field> fieldsIterator, IntegrityItem integrityItem,
			String projectID) {
		// get fieldSize
		int fieldSize = 0;
		ArrayList<Field> fieldList = new ArrayList<Field>();
		while (fieldsIterator.hasNext()) {
			Field field = fieldsIterator.next();
			if (field.getValueAsString() == null) {
				continue;
			}
			fieldSize++;
			fieldList.add(field);
		}
		// set item fields
		Link[] fieldLinks = new Link[fieldSize];
		int y = 0;
		for (Field field : fieldList) {

			if (field.getValueAsString() == null) {
				continue;
			}

//			System.out.println("");
//			System.out.println("*** New Field ***");
//			System.out.println("field.getName(): " + field.getName());
//			System.out.println("field.getValueAsString(): "
//					+ field.getValueAsString());
//			System.out.println("field.getProjectType(): "
//					+ field.getModelType());
//			System.out.println("field.getDataType(): " + field.getDataType());

			// create field object
			String fieldName = field.getName();
			fieldName = fieldName.trim();
			fieldName = fieldName.replace(" ", "");
			IntegrityField integrityField;
			try {
				integrityField = new IntegrityField(
						java.net.URI.create(IntegrityManager.baseHTTPURI
								+ "/services/" + projectID + "/fields/"
								+ integrityItem.getID() + "-" + fieldName));
				integrityField.setName(field.getName());
				integrityField.setValue(field.getValueAsString());

				IntegrityServerResources.qNameOslcIntegrityFieldMap.put(
						integrityField.getAbout().toString(), integrityField);
				IntegrityServerResources.oslcIntegrityFields
						.add(integrityField);
				fieldLinks[y] = new Link(integrityField.getAbout());
				y++;
			} catch (URISyntaxException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if (fieldSize > 0) {
			integrityItem.setField(fieldLinks);
		}

	}

	private static URI createNewItem(Item item) {
		String projectName = getProjectID(item.getFields());
		String projectID = null;
		String itemID = item.getId();
		itemID = itemID.replace(" ", "_");
		if (projectName == null) {
			// projectID = item.getId();
			// projectID = projectID.replace("/", "");
			itemID = itemID.replace("/", "");
			projectID = "noproject";
		} else {
			projectID = projectNameIDMap.get(projectName);
		}
		IntegrityItem integrityItem = null;
		try {
			integrityItem = new IntegrityItem(
					java.net.URI.create(IntegrityManager.baseHTTPURI
							+ "/services/" + projectID + "/items/" + itemID));
			integrityItem.setID(itemID);
			iterateThroughItemFields(item.getFields(), integrityItem, projectID);

			if (!IntegrityServerResources.qNameOslcIntegrityItemMap.keySet()
					.contains(integrityItem.getAbout().toString())) {
				IntegrityServerResources.qNameOslcIntegrityItemMap.put(
						integrityItem.getAbout().toString(), integrityItem);
				IntegrityServerResources.oslcIntegrityItems.add(integrityItem);
				integrityIDURIMap.put(itemID, integrityItem.getAbout());
			}
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return integrityItem.getAbout();
	}

	public static void resolveDependencies() {

		for (Object object : objectFieldValueMap.keySet()) {
			ArrayList<Field> objectFields = objectFieldValueMap.get(object);
			for (Field field : objectFields) {
				String fieldName = field.getName();
				fieldName = fieldName.trim();
				fieldName = fieldName.replace(" ", "");
				if (!fieldName.equals("ID")) {
					fieldName = fieldName.substring(0, 1).toUpperCase()
							+ fieldName.substring(1, fieldName.length());
				}
				// get the setter method of the object for the field
				boolean isFieldValueSet = false;
				for (Method method : object.getClass().getDeclaredMethods()) {

					if (method.getName().equals("set" + fieldName)) {
						try {
							Class[] parameterTypesArray = method
									.getParameterTypes();
							Class parameterType = parameterTypesArray[0];
							String parameterTypeName = parameterType.getName();

							// set object property value
							if (field.getDataType() != null) {
								if (field.getDataType().equals(
										"com.mks.api.response.ItemList")) {
									Object fieldValue = field.getValue();
									if (fieldValue instanceof ItemList) {
										ItemList itemList = (ItemList) fieldValue;
										if (itemList.size() > 0) {

											Link[] itemLinks = new Link[itemList
													.size()];
											int i = 0;
											for (Object object2 : itemList) {
												if (object2 instanceof Item) {
													Item item = (Item) object2;
//													System.out.println("");
//													System.out
//															.println("*** New Item ***");
//													System.out
//															.println("ITEM ID: "
//																	+ item.getId());

													// find existing project,
													// req doc, or req, or
													// create a new item
													String itemID = item
															.getId();
													URI linkedObjectURI = null;
													if (integrityIDURIMap
															.containsKey(itemID)) {
														linkedObjectURI = integrityIDURIMap
																.get(itemID);
													} else {
														// create new item
														// object
														linkedObjectURI = createNewItem(item);
													}
													if (linkedObjectURI != null) {
														Link link = new Link(
																linkedObjectURI);
														itemLinks[i] = link;
														i++;
													}
												}
											}
											try {
												Method methodToExecute = object
														.getClass()
														.getDeclaredMethod(
																method.getName(),
																new Class[] { Link[].class });
												methodToExecute
														.invoke(object,
																new Object[] { itemLinks });
												isFieldValueSet = true;
											} catch (NoSuchMethodException e) {
												// TODO Auto-generated catch
												// block
												e.printStackTrace();
											} catch (SecurityException e) {
												// TODO Auto-generated catch
												// block
												e.printStackTrace();
											}

											// method.invoke(object,
											// new Object[] { itemLinks });
											break;
										}
									}
								} else if (field.getDataType().equals(
										"com.mks.api.response.Item")) {
									Object fieldValue = field.getValue();
									Item item = null;
									if (fieldValue instanceof Item) {
										item = (Item) fieldValue;
										if (parameterTypeName
												.equals("java.net.URI")) {
											String itemID = item.getId();
											if (itemID.contains("/")) {
												itemID = projectNameIDMap
														.get(itemID);
											}
											URI linkedObjectURI = null;
											if (integrityIDURIMap
													.containsKey(itemID)) {
												linkedObjectURI = integrityIDURIMap
														.get(itemID);
											} else {
												// create new item
												// object
												linkedObjectURI = createNewItem(item);
											}
											if (linkedObjectURI != null) {
												// create the link
												URI[] array = new URI[1];
												array[0] = linkedObjectURI;
												method.invoke(object, array);
												isFieldValueSet = true;
											}
											break;
										} else if (parameterTypeName
												.equals("edu.gatech.mbsec.adapter.integrity.resources.IntegrityPriorityEnumeration")) {
											System.err
													.println("Enumeration Field "
															+ fieldName
															+ " of object "
															+ object.toString()
															+ " not set!!");
											IntegrityPriorityEnumeration priorityEnumValue = null;
											if (fieldValue.equals("low")) {
												priorityEnumValue = IntegrityPriorityEnumeration.LOW;
											} else if (fieldValue
													.equals("medium")) {
												priorityEnumValue = IntegrityPriorityEnumeration.MEDIUM;
											}

											IntegrityPriorityEnumeration[] array = new IntegrityPriorityEnumeration[1];
											array[0] = priorityEnumValue;
											method.invoke(object, array);

											break;
										} else if (parameterTypeName
												.equals("edu.gatech.mbsec.adapter.integrity.resources.IntegrityTraceStatusEnumeration")) {
											System.err
													.println("Enumeration Field "
															+ fieldName
															+ " of object "
															+ object.toString()
															+ " not set!!");
											IntegrityTraceStatusEnumeration enumValue = null;
											if (fieldValue.equals("downstream")) {
												enumValue = IntegrityTraceStatusEnumeration.DOWNSTREAM;
											} else if (fieldValue
													.equals("medium")) {
												enumValue = IntegrityTraceStatusEnumeration.DOWNSTREAMRELATED;
											}

											IntegrityTraceStatusEnumeration[] array = new IntegrityTraceStatusEnumeration[1];
											array[0] = enumValue;
											method.invoke(object, array);

											break;
										}
									}
								}
							}
						} catch (IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (InvocationTargetException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
				if (!isFieldValueSet) {
					System.err.println("field " + fieldName
							+ " of oslc resource " + object + " not set!");
				}
			}
		}
	}

	public static List<IntegrityItem> getItemsInProject(String projectID) {
		ArrayList<IntegrityItem> elements = new ArrayList<IntegrityItem>();
		for (IntegrityItem integrityElement : IntegrityServerResources.oslcIntegrityItems) {
			String elementURI = integrityElement.getAbout().toString();
			if (elementURI.startsWith(IntegrityManager.baseHTTPURI
					+ "/services/" + projectID + "/items/")) {
				elements.add(integrityElement);
			}
		}
		return elements;
	}

	public static IntegrityItem getItemByURI(String uri) {
		return IntegrityServerResources.qNameOslcIntegrityItemMap
				.get(IntegrityManager.baseHTTPURI + "/services/" + uri);
	}

	public static String getValidProjectIdOrName(String projectIdOrName) {
		String validProjectIdOrName = projectIdOrName.replaceAll("[\\s()$%#&]", "_");
		validProjectIdOrName = validProjectIdOrName.replace("/", "__");
		return validProjectIdOrName;
	}
	
	public static String getValidFieldName(String projectIdOrName) {
		String validProjectIdOrName = projectIdOrName.replaceAll("[\\s()$%#&:]", "_");
		validProjectIdOrName = validProjectIdOrName.replace("/", "__");
		return validProjectIdOrName;
	}
}
