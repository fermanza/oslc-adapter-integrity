package edu.gatech.mbsec.adapter.integrity.generated.resources;

import java.util.ArrayList;
import java.util.List;
import java.net.URISyntaxException;
import java.util.Map;
import java.util.HashMap;

import org.eclipse.lyo.oslc4j.core.model.AbstractResource;

import com.mks.api.CmdRunner;
import com.mks.api.Command;
import com.mks.api.IntegrationPoint;
import com.mks.api.IntegrationPointFactory;
import com.mks.api.OptionList;
import com.mks.api.SelectionList;
import com.mks.api.Session;
import com.mks.api.response.APIConnectionException;
import com.mks.api.response.APIException;
import com.mks.api.response.Field;
import com.mks.api.response.Item;
import com.mks.api.response.ItemNotFoundException;
import com.mks.api.response.ItemList;
import com.mks.api.response.Response;
import com.mks.api.response.WorkItem;
import com.mks.api.response.WorkItemIterator;

import edu.gatech.mbsec.adapter.integrity.application.IntegrityManager;
import edu.gatech.mbsec.adapter.integrity.application.OSLC4JIntegrityApplication;
import edu.gatech.mbsec.adapter.integrity.application.util.IntegrityUtil;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityField;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityFunction;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityFunctionHierarchy;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityItem;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityPriorityEnumeration;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityProject;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityRequirement;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityServer;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegritySystemElement;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegritySystemHierarchy;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityTraceStatusEnumeration;

public class IntegrityServerResources{

	public static List<IntegrityServer> oslcIntegrityServers = new ArrayList<IntegrityServer>();
	public static Map<String, IntegrityServer> qNameOslcIntegrityServerMap  = new HashMap<String, IntegrityServer>();	
	public static List<IntegrityProject> oslcIntegrityProjects = new ArrayList<IntegrityProject>();
	public static Map<String, IntegrityProject> qNameOslcIntegrityProjectMap  = new HashMap<String, IntegrityProject>();	
	public static List<IntegrityItem> oslcIntegrityItems = new ArrayList<IntegrityItem>();
	public static Map<String, IntegrityItem> qNameOslcIntegrityItemMap  = new HashMap<String, IntegrityItem>();	
	public static List<IntegrityField> oslcIntegrityFields = new ArrayList<IntegrityField>();
	public static Map<String, IntegrityField> qNameOslcIntegrityFieldMap  = new HashMap<String, IntegrityField>();	
	public static List<IntegrityRequirement> oslcIntegrityRequirements = new ArrayList<IntegrityRequirement>();
	public static Map<String, IntegrityRequirement> qNameOslcIntegrityRequirementMap  = new HashMap<String, IntegrityRequirement>();	
	public static List<IntegrityFunction> oslcIntegrityFunctions = new ArrayList<IntegrityFunction>();
	public static Map<String, IntegrityFunction> qNameOslcIntegrityFunctionMap  = new HashMap<String, IntegrityFunction>();	
	public static List<IntegrityFunctionHierarchy> oslcIntegrityFunctionHierarchys = new ArrayList<IntegrityFunctionHierarchy>();
	public static Map<String, IntegrityFunctionHierarchy> qNameOslcIntegrityFunctionHierarchyMap  = new HashMap<String, IntegrityFunctionHierarchy>();	
	public static List<IntegritySystemElement> oslcIntegritySystemElements = new ArrayList<IntegritySystemElement>();
	public static Map<String, IntegritySystemElement> qNameOslcIntegritySystemElementMap  = new HashMap<String, IntegritySystemElement>();	
	public static List<IntegritySystemHierarchy> oslcIntegritySystemHierarchys = new ArrayList<IntegritySystemHierarchy>();
	public static Map<String, IntegritySystemHierarchy> qNameOslcIntegritySystemHierarchyMap  = new HashMap<String, IntegritySystemHierarchy>();	


	public static synchronized List<IntegrityServer> getServersInProject(String projectID) {
		ArrayList<IntegrityServer> oslcResources = new ArrayList<IntegrityServer>();
		for (IntegrityServer oslcResource : oslcIntegrityServers) {
			String oslcResourceURI = oslcResource.getAbout().toString();
			if (oslcResourceURI.startsWith(IntegrityManager.baseHTTPURI + "/services/" + projectID + "/servers/")) {
					oslcResources.add(oslcResource);
			}
		}
		return oslcResources;
	}

	public static synchronized IntegrityServer getServerByURI(String uri) {
		return qNameOslcIntegrityServerMap.get(IntegrityManager.baseHTTPURI+ "/services/" + uri);
	}
	public static synchronized List<IntegrityProject> getProjectsInProject(String projectID) {
		ArrayList<IntegrityProject> oslcResources = new ArrayList<IntegrityProject>();
		for (IntegrityProject oslcResource : oslcIntegrityProjects) {
			String oslcResourceURI = oslcResource.getAbout().toString();
			if (oslcResourceURI.startsWith(IntegrityManager.baseHTTPURI + "/services/" + projectID + "/projects/")) {
					oslcResources.add(oslcResource);
			}
		}
		return oslcResources;
	}

	public static synchronized IntegrityProject getProjectByURI(String uri) {
		return qNameOslcIntegrityProjectMap.get(IntegrityManager.baseHTTPURI+ "/services/" + uri);
	}
	public static synchronized List<IntegrityItem> getItemsInProject(String projectID) {
		ArrayList<IntegrityItem> oslcResources = new ArrayList<IntegrityItem>();
		for (IntegrityItem oslcResource : oslcIntegrityItems) {
			String oslcResourceURI = oslcResource.getAbout().toString();
			if (oslcResourceURI.startsWith(IntegrityManager.baseHTTPURI + "/services/" + projectID + "/items/")) {
					oslcResources.add(oslcResource);
			}
		}
		return oslcResources;
	}

	public static synchronized IntegrityItem getItemByURI(String uri) {
		return qNameOslcIntegrityItemMap.get(IntegrityManager.baseHTTPURI+ "/services/" + uri);
	}
	public static synchronized List<IntegrityField> getFieldsInProject(String projectID) {
		ArrayList<IntegrityField> oslcResources = new ArrayList<IntegrityField>();
		for (IntegrityField oslcResource : oslcIntegrityFields) {
			String oslcResourceURI = oslcResource.getAbout().toString();
			if (oslcResourceURI.startsWith(IntegrityManager.baseHTTPURI + "/services/" + projectID + "/fields/")) {
					oslcResources.add(oslcResource);
			}
		}
		return oslcResources;
	}

	public static synchronized IntegrityField getFieldByURI(String uri) {
		return qNameOslcIntegrityFieldMap.get(IntegrityManager.baseHTTPURI+ "/services/" + uri);
	}
	public static synchronized List<IntegrityRequirement> getRequirementsInProject(String projectID) {
		ArrayList<IntegrityRequirement> oslcResources = new ArrayList<IntegrityRequirement>();
		for (IntegrityRequirement oslcResource : oslcIntegrityRequirements) {
			String oslcResourceURI = oslcResource.getAbout().toString();
			if (oslcResourceURI.startsWith(IntegrityManager.baseHTTPURI + "/services/" + projectID + "/requirements/")) {
					oslcResources.add(oslcResource);
			}
		}
		return oslcResources;
	}

	public static synchronized IntegrityRequirement getRequirementByURI(String uri) {
		return qNameOslcIntegrityRequirementMap.get(IntegrityManager.baseHTTPURI+ "/services/" + uri);
	}
	public static synchronized List<IntegrityFunction> getFunctionsInProject(String projectID) {
		ArrayList<IntegrityFunction> oslcResources = new ArrayList<IntegrityFunction>();
		for (IntegrityFunction oslcResource : oslcIntegrityFunctions) {
			String oslcResourceURI = oslcResource.getAbout().toString();
			if (oslcResourceURI.startsWith(IntegrityManager.baseHTTPURI + "/services/" + projectID + "/functions/")) {
					oslcResources.add(oslcResource);
			}
		}
		return oslcResources;
	}

	public static synchronized IntegrityFunction getFunctionByURI(String uri) {
		return qNameOslcIntegrityFunctionMap.get(IntegrityManager.baseHTTPURI+ "/services/" + uri);
	}
	public static synchronized List<IntegrityFunctionHierarchy> getFunctionHierarchysInProject(String projectID) {
		ArrayList<IntegrityFunctionHierarchy> oslcResources = new ArrayList<IntegrityFunctionHierarchy>();
		for (IntegrityFunctionHierarchy oslcResource : oslcIntegrityFunctionHierarchys) {
			String oslcResourceURI = oslcResource.getAbout().toString();
			if (oslcResourceURI.startsWith(IntegrityManager.baseHTTPURI + "/services/" + projectID + "/functionhierarchys/")) {
					oslcResources.add(oslcResource);
			}
		}
		return oslcResources;
	}

	public static synchronized IntegrityFunctionHierarchy getFunctionHierarchyByURI(String uri) {
		return qNameOslcIntegrityFunctionHierarchyMap.get(IntegrityManager.baseHTTPURI+ "/services/" + uri);
	}
	public static synchronized List<IntegritySystemElement> getSystemElementsInProject(String projectID) {
		ArrayList<IntegritySystemElement> oslcResources = new ArrayList<IntegritySystemElement>();
		for (IntegritySystemElement oslcResource : oslcIntegritySystemElements) {
			String oslcResourceURI = oslcResource.getAbout().toString();
			if (oslcResourceURI.startsWith(IntegrityManager.baseHTTPURI + "/services/" + projectID + "/systemelements/")) {
					oslcResources.add(oslcResource);
			}
		}
		return oslcResources;
	}

	public static synchronized IntegritySystemElement getSystemElementByURI(String uri) {
		return qNameOslcIntegritySystemElementMap.get(IntegrityManager.baseHTTPURI+ "/services/" + uri);
	}
	public static synchronized List<IntegritySystemHierarchy> getSystemHierarchysInProject(String projectID) {
		ArrayList<IntegritySystemHierarchy> oslcResources = new ArrayList<IntegritySystemHierarchy>();
		for (IntegritySystemHierarchy oslcResource : oslcIntegritySystemHierarchys) {
			String oslcResourceURI = oslcResource.getAbout().toString();
			if (oslcResourceURI.startsWith(IntegrityManager.baseHTTPURI + "/services/" + projectID + "/systemhierarchys/")) {
					oslcResources.add(oslcResource);
			}
		}
		return oslcResources;
	}

	public static synchronized IntegritySystemHierarchy getSystemHierarchyByURI(String uri) {
		return qNameOslcIntegritySystemHierarchyMap.get(IntegrityManager.baseHTTPURI+ "/services/" + uri);
	}
	public static Session getIntegritySession() {
		IntegrationPointFactory integrationPointFactory = IntegrationPointFactory.getInstance();
		IntegrationPoint integrationPoint;
		Session session = null;
		try {
			integrationPoint = integrationPointFactory.createLocalIntegrationPoint(4, 12);
			session = integrationPoint.getCommonSession();
		} catch (APIException e) {
			e.printStackTrace();
		}
		return session;
	}

	public static synchronized void getAllRequirements(Session session) {
		CmdRunner queryCmdRunner;
		Response queryResponse = null;
		try {
			queryCmdRunner = session.createCmdRunner();
			Command queryCommand = new Command(Command.IM, "issues");
			OptionList queryList = new OptionList();
			queryList.add("hostname", "ldxwcs1.dx.xxxxx.com");
			queryList.add("query", "All Requirements");
			String fieldNameList = IntegrityUtil.getItemTypeFieldNames("Requirement", session);
			queryList.add("fields",fieldNameList);
			queryCommand.setOptionList(queryList);
			queryResponse = queryCmdRunner.execute(queryCommand);
		} 
		catch(ItemNotFoundException e){
			//create query
			try {
				CmdRunner createQueryCmdRunner = session.createCmdRunner();
				Command createQueryCommand = new Command(Command.IM, "createquery");
				OptionList createQueryOptionList = new OptionList();
				createQueryOptionList.add("hostname", "ldxwcs1.dx.xxxxx.com");
				createQueryOptionList.add("name", "All Requirements");
				createQueryOptionList.add("queryDefinition", "(field[Type]=Requirement)");
				createQueryCommand.setOptionList(createQueryOptionList);
				Response createQueryResponse = createQueryCmdRunner.execute(createQueryCommand);
				System.out.println(createQueryResponse);
			} catch (APIException e1) {
				e1.printStackTrace();
			}
			//execute query
			try {
				CmdRunner executeQueryCmdRunner = session.createCmdRunner();
				queryCmdRunner = session.createCmdRunner();
				Command queryCommand = new Command(Command.IM, "issues");
				OptionList queryList = new OptionList();
				queryList.add("hostname", "ldxwcs1.dx.xxxxx.com");
				queryList.add("query", "All Requirements");
				String fieldNameList = IntegrityUtil.getItemTypeFieldNames("Requirement", session);
				queryList.add("fields",fieldNameList);
				queryCommand.setOptionList(queryList);
				queryResponse = executeQueryCmdRunner.execute(queryCommand);
			} catch (APIException e1) {
				e1.printStackTrace();
			}
		}
		catch (APIException e1) {	
			e1.printStackTrace();
		}

		try{
			WorkItemIterator workItemIterator = queryResponse.getWorkItems();
			while (workItemIterator.hasNext()) {
				WorkItem workItem = workItemIterator.next();
				System.out.println("Converting into OSLC resource Requirement " + workItem);
				String owningProjectID = IntegrityUtil.getProjectID(workItem.getFields());

				String projectId = null;
				String projectName = IntegrityUtil.getProjectName(workItem.getFields());
				if(projectName == null | projectName == ""){
					projectName = "unnamed";
			}
			else{
					projectName = IntegrityUtil.getValidProjectIdOrName(projectName);
			}
			if (owningProjectID == null) {
				projectId = "noproject";
			} else {
				owningProjectID = IntegrityUtil.getValidProjectIdOrName(owningProjectID);
				if(owningProjectID.equals(projectName)){
					projectId = "project" + projectName;
				}
				else{
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
			}

		} catch (APIException e1) {	
			e1.printStackTrace();
		}
	}
	public static synchronized void getAllSystemHierarchys(Session session) {
		CmdRunner queryCmdRunner;
		Response queryResponse = null;
		try {
			queryCmdRunner = session.createCmdRunner();
			Command queryCommand = new Command(Command.IM, "issues");
			OptionList queryList = new OptionList();
			queryList.add("hostname", "ldxwcs1.dx.xxxxx.com");
			queryList.add("query", "All System Hierarchys");
			String fieldNameList = IntegrityUtil.getItemTypeFieldNames("System Hierarchy", session);
			queryList.add("fields",fieldNameList);
			queryCommand.setOptionList(queryList);
			queryResponse = queryCmdRunner.execute(queryCommand);
		} 
		catch(ItemNotFoundException e){
			//create query
			try {
				CmdRunner createQueryCmdRunner = session.createCmdRunner();
				Command createQueryCommand = new Command(Command.IM, "createquery");
				OptionList createQueryOptionList = new OptionList();
				createQueryOptionList.add("hostname", "ldxwcs1.dx.xxxxx.com");
				createQueryOptionList.add("name", "All System Hierarchys");
				createQueryOptionList.add("queryDefinition", "(field[Type]=System Hierarchy)");
				createQueryCommand.setOptionList(createQueryOptionList);
				Response createQueryResponse = createQueryCmdRunner.execute(createQueryCommand);
				System.out.println(createQueryResponse);
			} catch (APIException e1) {
				e1.printStackTrace();
			}
			//execute query
			try {
				CmdRunner executeQueryCmdRunner = session.createCmdRunner();
				queryCmdRunner = session.createCmdRunner();
				Command queryCommand = new Command(Command.IM, "issues");
				OptionList queryList = new OptionList();
				queryList.add("hostname", "ldxwcs1.dx.xxxxx.com");
				queryList.add("query", "All System Hierarchys");
				String fieldNameList = IntegrityUtil.getItemTypeFieldNames("System Hierarchy", session);
				queryList.add("fields",fieldNameList);
				queryCommand.setOptionList(queryList);
				queryResponse = executeQueryCmdRunner.execute(queryCommand);
			} catch (APIException e1) {
				e1.printStackTrace();
			}
		}
		catch (APIException e1) {	
			e1.printStackTrace();
		}

		try{
			WorkItemIterator workItemIterator = queryResponse.getWorkItems();
			while (workItemIterator.hasNext()) {
				WorkItem workItem = workItemIterator.next();
				System.out.println("Converting into OSLC resource System Hierarchy " + workItem);
				String owningProjectID = IntegrityUtil.getProjectID(workItem.getFields());

				String projectId = null;
				String projectName = IntegrityUtil.getProjectName(workItem.getFields());
				if(projectName == null | projectName == ""){
					projectName = "unnamed";
			}
			else{
					projectName = IntegrityUtil.getValidProjectIdOrName(projectName);
			}
			if (owningProjectID == null) {
				projectId = "noproject";
			} else {
				owningProjectID = IntegrityUtil.getValidProjectIdOrName(owningProjectID);
				if(owningProjectID.equals(projectName)){
					projectId = "project" + projectName;
				}
				else{
					projectId = "project" + owningProjectID + projectName;
				}
			}
			IntegritySystemHierarchy integritySystemHierarchy;
			try {
				integritySystemHierarchy = new IntegritySystemHierarchy(java.net.URI.create(IntegrityManager.baseHTTPURI + "/services/"+ projectId + "/systemhierarchys/"+ workItem.getId()));
				IntegrityUtil.iterateThroughFields(workItem.getFields(),	integritySystemHierarchy);
				qNameOslcIntegritySystemHierarchyMap.put(integritySystemHierarchy.getAbout().toString(),integritySystemHierarchy);
				oslcIntegritySystemHierarchys.add(integritySystemHierarchy);
				IntegrityUtil.integrityIDURIMap.put(workItem.getId(),integritySystemHierarchy.getAbout());
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			}

		} catch (APIException e1) {	
			e1.printStackTrace();
		}
	}
	public static synchronized void getAllSystemElements(Session session) {
		CmdRunner queryCmdRunner;
		Response queryResponse = null;
		try {
			queryCmdRunner = session.createCmdRunner();
			Command queryCommand = new Command(Command.IM, "issues");
			OptionList queryList = new OptionList();
			queryList.add("hostname", "ldxwcs1.dx.xxxxx.com");
			queryList.add("query", "All System Elements");
			String fieldNameList = IntegrityUtil.getItemTypeFieldNames("System Element", session);
			queryList.add("fields",fieldNameList);
			queryCommand.setOptionList(queryList);
			queryResponse = queryCmdRunner.execute(queryCommand);
		} 
		catch(ItemNotFoundException e){
			//create query
			try {
				CmdRunner createQueryCmdRunner = session.createCmdRunner();
				Command createQueryCommand = new Command(Command.IM, "createquery");
				OptionList createQueryOptionList = new OptionList();
				createQueryOptionList.add("hostname", "ldxwcs1.dx.xxxxx.com");
				createQueryOptionList.add("name", "All System Elements");
				createQueryOptionList.add("queryDefinition", "(field[Type]=System Element)");
				createQueryCommand.setOptionList(createQueryOptionList);
				Response createQueryResponse = createQueryCmdRunner.execute(createQueryCommand);
				System.out.println(createQueryResponse);
			} catch (APIException e1) {
				e1.printStackTrace();
			}
			//execute query
			try {
				CmdRunner executeQueryCmdRunner = session.createCmdRunner();
				queryCmdRunner = session.createCmdRunner();
				Command queryCommand = new Command(Command.IM, "issues");
				OptionList queryList = new OptionList();
				queryList.add("hostname", "ldxwcs1.dx.xxxxx.com");
				queryList.add("query", "All System Elements");
				String fieldNameList = IntegrityUtil.getItemTypeFieldNames("System Element", session);
				queryList.add("fields",fieldNameList);
				queryCommand.setOptionList(queryList);
				queryResponse = executeQueryCmdRunner.execute(queryCommand);
			} catch (APIException e1) {
				e1.printStackTrace();
			}
		}
		catch (APIException e1) {	
			e1.printStackTrace();
		}

		try{
			WorkItemIterator workItemIterator = queryResponse.getWorkItems();
			while (workItemIterator.hasNext()) {
				WorkItem workItem = workItemIterator.next();
				System.out.println("Converting into OSLC resource System Element " + workItem);
				String owningProjectID = IntegrityUtil.getProjectID(workItem.getFields());

				String projectId = null;
				String projectName = IntegrityUtil.getProjectName(workItem.getFields());
				if(projectName == null | projectName == ""){
					projectName = "unnamed";
			}
			else{
					projectName = IntegrityUtil.getValidProjectIdOrName(projectName);
			}
			if (owningProjectID == null) {
				projectId = "noproject";
			} else {
				owningProjectID = IntegrityUtil.getValidProjectIdOrName(owningProjectID);
				if(owningProjectID.equals(projectName)){
					projectId = "project" + projectName;
				}
				else{
					projectId = "project" + owningProjectID + projectName;
				}
			}
			IntegritySystemElement integritySystemElement;
			try {
				integritySystemElement = new IntegritySystemElement(java.net.URI.create(IntegrityManager.baseHTTPURI + "/services/"+ projectId + "/systemelements/"+ workItem.getId()));
				IntegrityUtil.iterateThroughFields(workItem.getFields(),	integritySystemElement);
				qNameOslcIntegritySystemElementMap.put(integritySystemElement.getAbout().toString(),integritySystemElement);
				oslcIntegritySystemElements.add(integritySystemElement);
				IntegrityUtil.integrityIDURIMap.put(workItem.getId(),integritySystemElement.getAbout());
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			}

		} catch (APIException e1) {	
			e1.printStackTrace();
		}
	}
	public static synchronized void getAllFunctionHierarchys(Session session) {
		CmdRunner queryCmdRunner;
		Response queryResponse = null;
		try {
			queryCmdRunner = session.createCmdRunner();
			Command queryCommand = new Command(Command.IM, "issues");
			OptionList queryList = new OptionList();
			queryList.add("hostname", "ldxwcs1.dx.xxxxx.com");
			queryList.add("query", "All Function Hierarchys");
			String fieldNameList = IntegrityUtil.getItemTypeFieldNames("Function Hierarchy", session);
			queryList.add("fields",fieldNameList);
			queryCommand.setOptionList(queryList);
			queryResponse = queryCmdRunner.execute(queryCommand);
		} 
		catch(ItemNotFoundException e){
			//create query
			try {
				CmdRunner createQueryCmdRunner = session.createCmdRunner();
				Command createQueryCommand = new Command(Command.IM, "createquery");
				OptionList createQueryOptionList = new OptionList();
				createQueryOptionList.add("hostname", "ldxwcs1.dx.xxxxx.com");
				createQueryOptionList.add("name", "All Function Hierarchys");
				createQueryOptionList.add("queryDefinition", "(field[Type]=Function Hierarchy)");
				createQueryCommand.setOptionList(createQueryOptionList);
				Response createQueryResponse = createQueryCmdRunner.execute(createQueryCommand);
				System.out.println(createQueryResponse);
			} catch (APIException e1) {
				e1.printStackTrace();
			}
			//execute query
			try {
				CmdRunner executeQueryCmdRunner = session.createCmdRunner();
				queryCmdRunner = session.createCmdRunner();
				Command queryCommand = new Command(Command.IM, "issues");
				OptionList queryList = new OptionList();
				queryList.add("hostname", "ldxwcs1.dx.xxxxx.com");
				queryList.add("query", "All Function Hierarchys");
				String fieldNameList = IntegrityUtil.getItemTypeFieldNames("Function Hierarchy", session);
				queryList.add("fields",fieldNameList);
				queryCommand.setOptionList(queryList);
				queryResponse = executeQueryCmdRunner.execute(queryCommand);
			} catch (APIException e1) {
				e1.printStackTrace();
			}
		}
		catch (APIException e1) {	
			e1.printStackTrace();
		}

		try{
			WorkItemIterator workItemIterator = queryResponse.getWorkItems();
			while (workItemIterator.hasNext()) {
				WorkItem workItem = workItemIterator.next();
				System.out.println("Converting into OSLC resource Function Hierarchy " + workItem);
				String owningProjectID = IntegrityUtil.getProjectID(workItem.getFields());

				String projectId = null;
				String projectName = IntegrityUtil.getProjectName(workItem.getFields());
				if(projectName == null | projectName == ""){
					projectName = "unnamed";
			}
			else{
					projectName = IntegrityUtil.getValidProjectIdOrName(projectName);
			}
			if (owningProjectID == null) {
				projectId = "noproject";
			} else {
				owningProjectID = IntegrityUtil.getValidProjectIdOrName(owningProjectID);
				if(owningProjectID.equals(projectName)){
					projectId = "project" + projectName;
				}
				else{
					projectId = "project" + owningProjectID + projectName;
				}
			}
			IntegrityFunctionHierarchy integrityFunctionHierarchy;
			try {
				integrityFunctionHierarchy = new IntegrityFunctionHierarchy(java.net.URI.create(IntegrityManager.baseHTTPURI + "/services/"+ projectId + "/functionhierarchys/"+ workItem.getId()));
				IntegrityUtil.iterateThroughFields(workItem.getFields(),	integrityFunctionHierarchy);
				qNameOslcIntegrityFunctionHierarchyMap.put(integrityFunctionHierarchy.getAbout().toString(),integrityFunctionHierarchy);
				oslcIntegrityFunctionHierarchys.add(integrityFunctionHierarchy);
				IntegrityUtil.integrityIDURIMap.put(workItem.getId(),integrityFunctionHierarchy.getAbout());
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			}

		} catch (APIException e1) {	
			e1.printStackTrace();
		}
	}
	public static synchronized void getAllFunctions(Session session) {
		CmdRunner queryCmdRunner;
		Response queryResponse = null;
		try {
			queryCmdRunner = session.createCmdRunner();
			Command queryCommand = new Command(Command.IM, "issues");
			OptionList queryList = new OptionList();
			queryList.add("hostname", "ldxwcs1.dx.xxxxx.com");
			queryList.add("query", "All Functions");
			String fieldNameList = IntegrityUtil.getItemTypeFieldNames("Function", session);
			queryList.add("fields",fieldNameList);
			queryCommand.setOptionList(queryList);
			queryResponse = queryCmdRunner.execute(queryCommand);
		} 
		catch(ItemNotFoundException e){
			//create query
			try {
				CmdRunner createQueryCmdRunner = session.createCmdRunner();
				Command createQueryCommand = new Command(Command.IM, "createquery");
				OptionList createQueryOptionList = new OptionList();
				createQueryOptionList.add("hostname", "ldxwcs1.dx.xxxxx.com");
				createQueryOptionList.add("name", "All Functions");
				createQueryOptionList.add("queryDefinition", "(field[Type]=Function)");
				createQueryCommand.setOptionList(createQueryOptionList);
				Response createQueryResponse = createQueryCmdRunner.execute(createQueryCommand);
				System.out.println(createQueryResponse);
			} catch (APIException e1) {
				e1.printStackTrace();
			}
			//execute query
			try {
				CmdRunner executeQueryCmdRunner = session.createCmdRunner();
				queryCmdRunner = session.createCmdRunner();
				Command queryCommand = new Command(Command.IM, "issues");
				OptionList queryList = new OptionList();
				queryList.add("hostname", "ldxwcs1.dx.xxxxx.com");
				queryList.add("query", "All Functions");
				String fieldNameList = IntegrityUtil.getItemTypeFieldNames("Function", session);
				queryList.add("fields",fieldNameList);
				queryCommand.setOptionList(queryList);
				queryResponse = executeQueryCmdRunner.execute(queryCommand);
			} catch (APIException e1) {
				e1.printStackTrace();
			}
		}
		catch (APIException e1) {	
			e1.printStackTrace();
		}

		try{
			WorkItemIterator workItemIterator = queryResponse.getWorkItems();
			while (workItemIterator.hasNext()) {
				WorkItem workItem = workItemIterator.next();
				System.out.println("Converting into OSLC resource Function " + workItem);
				String owningProjectID = IntegrityUtil.getProjectID(workItem.getFields());

				String projectId = null;
				String projectName = IntegrityUtil.getProjectName(workItem.getFields());
				if(projectName == null | projectName == ""){
					projectName = "unnamed";
			}
			else{
					projectName = IntegrityUtil.getValidProjectIdOrName(projectName);
			}
			if (owningProjectID == null) {
				projectId = "noproject";
			} else {
				owningProjectID = IntegrityUtil.getValidProjectIdOrName(owningProjectID);
				if(owningProjectID.equals(projectName)){
					projectId = "project" + projectName;
				}
				else{
					projectId = "project" + owningProjectID + projectName;
				}
			}
			IntegrityFunction integrityFunction;
			try {
				integrityFunction = new IntegrityFunction(java.net.URI.create(IntegrityManager.baseHTTPURI + "/services/"+ projectId + "/functions/"+ workItem.getId()));
				IntegrityUtil.iterateThroughFields(workItem.getFields(),	integrityFunction);
				qNameOslcIntegrityFunctionMap.put(integrityFunction.getAbout().toString(),integrityFunction);
				oslcIntegrityFunctions.add(integrityFunction);
				IntegrityUtil.integrityIDURIMap.put(workItem.getId(),integrityFunction.getAbout());
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}
			}

		} catch (APIException e1) {	
			e1.printStackTrace();
		}
	}
	public static synchronized void readServerResources() {
		oslcIntegrityServers.clear();
		qNameOslcIntegrityServerMap.clear();
		oslcIntegrityProjects.clear();
		qNameOslcIntegrityProjectMap.clear();
		oslcIntegrityItems.clear();
		qNameOslcIntegrityItemMap.clear();
		oslcIntegrityFields.clear();
		qNameOslcIntegrityFieldMap.clear();
		oslcIntegrityRequirements.clear();
		qNameOslcIntegrityRequirementMap.clear();
		oslcIntegrityFunctions.clear();
		qNameOslcIntegrityFunctionMap.clear();
		oslcIntegrityFunctionHierarchys.clear();
		qNameOslcIntegrityFunctionHierarchyMap.clear();
		oslcIntegritySystemElements.clear();
		qNameOslcIntegritySystemElementMap.clear();
		oslcIntegritySystemHierarchys.clear();
		qNameOslcIntegritySystemHierarchyMap.clear();
		IntegrityUtil.integrityIDURIMap.clear();

		Session session = getIntegritySession();
		IntegrityUtil.getAllProjects(session);
		getAllRequirements(session);
		getAllFunctions(session);
		getAllFunctionHierarchys(session);
		getAllSystemElements(session);
		getAllSystemHierarchys(session);

	}



	public static synchronized List<AbstractResource> getAllResources() {
		List<AbstractResource> allResources = new ArrayList<AbstractResource>();
		for (IntegrityProject integrityResource : qNameOslcIntegrityProjectMap.values()) {
			allResources.add(integrityResource);
		}
		for (IntegrityRequirement integrityResource : qNameOslcIntegrityRequirementMap.values()) {
			allResources.add(integrityResource);
		}
		for (IntegrityFunction integrityResource : qNameOslcIntegrityFunctionMap.values()) {
			allResources.add(integrityResource);
		}
		for (IntegrityFunctionHierarchy integrityResource : qNameOslcIntegrityFunctionHierarchyMap.values()) {
			allResources.add(integrityResource);
		}
		for (IntegritySystemElement integrityResource : qNameOslcIntegritySystemElementMap.values()) {
			allResources.add(integrityResource);
		}
		for (IntegritySystemHierarchy integrityResource : qNameOslcIntegritySystemHierarchyMap.values()) {
			allResources.add(integrityResource);
		}
		return allResources;
	}

}