package edu.gatech.mbsec.adapter.integrity.trs;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import edu.gatech.mbsec.adapter.integrity.application.IntegrityManager;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityServerResources;
import edu.gatech.mbsec.adapter.integrity.resources.trs.Base;
import edu.gatech.mbsec.adapter.integrity.resources.trs.ChangeEvent;
import edu.gatech.mbsec.adapter.integrity.resources.trs.ChangeLog;
import edu.gatech.mbsec.adapter.integrity.resources.trs.TRSConstants;
import edu.gatech.mbsec.adapter.integrity.resources.trs.TrackedResourceSet;

import org.eclipse.lyo.oslc4j.core.model.AbstractResource;


public class ChangeHistory {

	static List<AbstractResource> lastTrackedResources = new ArrayList<AbstractResource>();
	static List<AbstractResource> baseResources = new ArrayList<AbstractResource>();
	static ChangeLog changeLog = null;
	static Base base = null;
	static TrackedResourceSet trackedResourceSet = null;
	static int changeEventID = 1;
	static int changeLogID = 1;
	static URI changeLogURI = null;
	static int maxChangeEventPerChangeLog = 3;
	static int maxChangeEventBeforeBaseCutoffEvent = 10;
	static Map<String, ChangeLog> changeLogMap = new HashMap<String, ChangeLog>();

	static URI creationChangeEventTypeURI = URI
			.create("http://open-services.net/ns/core/trs#Creation");
	static URI modificationChangeEventTypeURI = URI
			.create("http://open-services.net/ns/core/trs#Modification");
	static URI deletionChangeEventTypeURI = URI
			.create("http://open-services.net/ns/core/trs#Deletion");
	static URI baseTypeURI = URI.create("http://www.w3.org/ns/ldp#Container");

	public static synchronized void detectChangesToTrackedResources() {
		// only compare resources if a base version has already been defined
		String date = new Date().toString().replace(" ", "");
		if (lastTrackedResources.size() > 0) {
			// compare the latest version of resources with the before last
			// version
			
			AbstractResource baseIntegrityResource = null;
			for (AbstractResource integrityResource : IntegrityServerResources.getAllResources()) {	
				boolean resourceIsCreated = true;
				for (AbstractResource integrityResource2 : lastTrackedResources) {
					if(integrityResource.getAbout().toString().equals(integrityResource2.getAbout().toString())){
						resourceIsCreated = false;
						baseIntegrityResource = integrityResource2;
						break;
					}
				}	
				
				
				if(integrityResource.getAbout().toString().endsWith("noproject")){
					// noproject is a container created by the adapter to store all integrity items that are linked to supported adapter integrity items
					// noproject is not a project created by integrity, it should not be unde TRS management
					continue;
				}
				
				
				// new integrity instance is publishing items without modified date property				
//				String modifiedDateLatestResource = IntegrityServerResources.getModifiedDate(integrityResource);
//				String modifiedDateBaseResource = IntegrityServerResources.getModifiedDate(baseIntegrityResource);				
				// temporary hack to avoid compilation problem
				// TODO fix by referring to other date property
				String modifiedDateLatestResource = null;
				String modifiedDateBaseResource = null;
				
//				if(modifiedDateLatestResource == null | modifiedDateBaseResource == null){
//					// resource = null, no date info, no change info. 
//					continue;
//				}
				
				if (resourceIsCreated) {
					// Creation change event
					checkForNewChangeLogAndCutoffEvent();
					ChangeEvent creationChangeEvent = new ChangeEvent();
					creationChangeEvent.setAbout(URI
							.create(IntegrityManager.baseHTTPURI
									+ "/changeevents/" + date + ":" + changeEventID));
					Collection<URI> creationChangeEventTypes = new ArrayList<URI>();
					creationChangeEventTypes.add(creationChangeEventTypeURI);
					creationChangeEvent.setTypes(creationChangeEventTypes);
					creationChangeEvent.setOrder(changeEventID);
					creationChangeEvent.setChanged(integrityResource
							.getAbout());
					changeLog.getChanges().add(creationChangeEvent);
					changeEventID++;
				} else if (!modifiedDateLatestResource.equals(modifiedDateBaseResource)) {
					// Modification change event
					checkForNewChangeLogAndCutoffEvent();
					ChangeEvent modificationChangeEvent = new ChangeEvent();
					modificationChangeEvent.setAbout(URI
							.create(IntegrityManager.baseHTTPURI
									+ "/changeevents/" + date + ":" + changeEventID));
					Collection<URI> modificationChangeEventTypes = new ArrayList<URI>();
					modificationChangeEventTypes
							.add(modificationChangeEventTypeURI);
					modificationChangeEvent
							.setTypes(modificationChangeEventTypes);
					modificationChangeEvent.setOrder(changeEventID);
					modificationChangeEvent.setChanged(integrityResource
							.getAbout());
					changeLog.getChanges().add(modificationChangeEvent);
					changeEventID++;
				}
			}
			for (AbstractResource integrityResource : lastTrackedResources) {
				boolean resourceIsDeleted = true;
				for (AbstractResource integrityResource2 : IntegrityServerResources.getAllResources()) {
					if(integrityResource.getAbout().toString().equals(integrityResource2.getAbout().toString())){
						resourceIsDeleted = false;						
						break;
					}
				}
				if (resourceIsDeleted) {
					// Deletion change event
					checkForNewChangeLogAndCutoffEvent();
					ChangeEvent deletionChangeEvent = new ChangeEvent();
					deletionChangeEvent.setAbout(URI
							.create(IntegrityManager.baseHTTPURI
									+ "/changeevents/" + date + ":" + changeEventID));
					Collection<URI> deletionChangeEventTypes = new ArrayList<URI>();
					deletionChangeEventTypes.add(deletionChangeEventTypeURI);
					deletionChangeEvent.setTypes(deletionChangeEventTypes);
					deletionChangeEvent.setOrder(changeEventID);
					deletionChangeEvent.setChanged(integrityResource
							.getAbout());
					changeLog.getChanges().add(deletionChangeEvent);
					changeEventID++;
				}
			}
			
			// reset lastTrackedResources
			lastTrackedResources.clear();
			// populate lastTrackedResources based on latest set of resources
			
			for (AbstractResource integrityResource : IntegrityServerResources.getAllResources()) {				
				lastTrackedResources.add(integrityResource);
			}

		} else if (lastTrackedResources.size() == 0) {
			// populate lastTrackedResources the first time at server start-up
			for (AbstractResource integrityResource : IntegrityServerResources.getAllResources()) {				
				lastTrackedResources.add(integrityResource);
			}
		}
	}

	private static synchronized void checkForNewChangeLogAndCutoffEvent() {
		// cutoffevent if max number of change events has reached (example for cutoff event)
		if((changeEventID - 1) >= maxChangeEventBeforeBaseCutoffEvent & (changeEventID - 1) % maxChangeEventBeforeBaseCutoffEvent == 0){
			// reinitialize the base resources
			baseResources.clear();
			String date = new Date().toString().replace(" ", "");
			URI cutoffEventURI = URI
			.create(IntegrityManager.baseHTTPURI
					+ "/cutoffevents/" + date);
			initializeBaseResources(cutoffEventURI);
		}
		else{
			// check if new changelog has to be created if current change log has reached the max number of change events
			if((changeEventID - 1) >= maxChangeEventPerChangeLog & (changeEventID - 1) % maxChangeEventPerChangeLog == 0){
				// create new changelog with previous attribute pointing to most recent changelog					
				URI previousChangeLogURI = changeLogURI;	
				changeLog = null;
				changeLog = new ChangeLog();
				URI newChangeLogURI = URI.create(IntegrityManager.baseHTTPURI + "/services/trs/"
						+ TRSConstants.TRS_TERM_CHANGE_LOG + "/" +  changeLogID);
//				changeLog.setAbout(newChangeLogURI);
				URI changeLogTypeURI = URI
						.create("http://open-services.net/ns/core/trs#ChangeLog");
				Collection<URI> changeLogTypes = new ArrayList<URI>();
				changeLogTypes.add(changeLogTypeURI);
				changeLog.setTypes(changeLogTypes);
				ArrayList<ChangeEvent> changeEvents = new ArrayList<ChangeEvent>();
				changeLog.setChanges(changeEvents);
				changeLog.setPrevious(previousChangeLogURI);
				changeLogURI = newChangeLogURI;
				changeLogMap.put(String.valueOf(changeLogID), changeLog);
				changeLogID ++;
				
//				try {
					trackedResourceSet.setChangeLog(changeLog);
//				} catch (URISyntaxException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			}
		}
	}

	public static synchronized void initializeBaseResources(URI cutoffEventURI) {
		// only set the base resources at server start-up and after base cutoff events
		if (baseResources.size() == 0) {
			baseResources = IntegrityServerResources.getAllResources();
			

			// initialize changelog
			changeEventID = 1;
			changeLogID = 1;
			changeLog = null;
			changeLog = new ChangeLog();
			// when changelog is added to trackedresourceset resource, uri of changelog is set to null. However, it is necessary to keep track of the changelog uri
			changeLogURI = URI.create(IntegrityManager.baseHTTPURI + "/services/trs/"
					+ TRSConstants.TRS_TERM_CHANGE_LOG + "/" +  changeLogID);
//			changeLog.setAbout(changeLogURI);
			URI changeLogTypeURI = URI
					.create("http://open-services.net/ns/core/trs#ChangeLog");
			Collection<URI> changeLogTypes = new ArrayList<URI>();
			changeLogTypes.add(changeLogTypeURI);
			changeLog.setTypes(changeLogTypes);
			ArrayList<ChangeEvent> changeEvents = new ArrayList<ChangeEvent>();
			changeLog.setChanges(changeEvents);
			changeLogMap.put(String.valueOf(changeLogID), changeLog);
			changeLogID ++;
			

			// initialize base
			base = new Base();
			Collection<URI> baseTypes = new ArrayList<URI>();
			baseTypes.add(baseTypeURI);
			base.setTypes(baseTypes);
			base.setAbout(URI.create(IntegrityManager.baseHTTPURI + "/services/trs/"
					+ TRSConstants.TRS_TERM_BASE));
			List<URI> baseMembers = new ArrayList<URI>();
			for (AbstractResource integrityResource : baseResources) {
				baseMembers.add(integrityResource.getAbout());
			}
			base.setMembers(baseMembers);
			if(cutoffEventURI == null){
				base.setCutoffEvent(URI
						.create("http://www.w3.org/1999/02/22-rdf-syntax-ns#nil"));
			}
			else{
				base.setCutoffEvent(cutoffEventURI);
			}
			

			// initialize trackedResourceSet	
			trackedResourceSet = new TrackedResourceSet();
			trackedResourceSet.setAbout(URI.create(IntegrityManager.baseHTTPURI
					+ "/services/trs"));//$NON-NLS-1$
			trackedResourceSet.setBase(URI.create(IntegrityManager.baseHTTPURI
					+ "/services/trs/" + TRSConstants.TRS_TERM_BASE));//$NON-NLS-1$										
//			try {
				trackedResourceSet.setChangeLog(changeLog);
//			} catch (URISyntaxException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

		}
	}

	public static synchronized ChangeLog getChangeLog() {
		return changeLog;
	}

	public static synchronized Base getBase() {
		return base;
	}

	public static synchronized TrackedResourceSet getTrackedResourceSet() {
//		try {
			if(trackedResourceSet == null) return null;
			trackedResourceSet.setChangeLog(changeLog);
//		} catch (URISyntaxException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return trackedResourceSet;
	}

	public static synchronized ChangeLog getChangeLog(String pagenum) {
		ChangeLog changeLog = changeLogMap.get(pagenum);
		if(changeLog != null){
			return changeLog;
		}		
		return null;
	}

	public static synchronized URI getChangeLogURI(String pagenum) {		
		URI changeLogURI = URI.create(IntegrityManager.baseHTTPURI + "/services/trs/"
					+ TRSConstants.TRS_TERM_CHANGE_LOG + "/" +  pagenum);
		return changeLogURI;
	}
}
