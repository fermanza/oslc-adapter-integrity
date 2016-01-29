package edu.gatech.mbsec.adapter.integrity.generated.client.util;

import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.net.URI;
import java.util.Set;
import java.util.HashSet;
import org.eclipse.lyo.oslc4j.client.OslcRestClient;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.provider.jena.JenaProvidersRegistry;

import edu.gatech.mbsec.adapter.integrity.application.IntegrityManager;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityField;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityFunction;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityFunctionHierarchy;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityItem;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityProject;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityRequirement;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegritySystemElement;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegritySystemHierarchy;

public class GeneratedIntegrityClientUtil {
	private static final Set<Class<?>> PROVIDERS = new HashSet<Class<?>>();
	static {
		PROVIDERS.addAll(JenaProvidersRegistry.getProviders());
	}
public static IntegrityProject getIntegrityProjectResource(String resourceURI){
	String mediaType = "application/rdf+xml";
	int readTimeout = 120000000;
	final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);
	final IntegrityProject resource = oslcRestClient.getOslcResource(IntegrityProject.class);			
	return resource;
}




public static IntegrityItem getIntegrityItemResource(String resourceURI){
	String mediaType = "application/rdf+xml";
	int readTimeout = 120000000;
	final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);
	final IntegrityItem resource = oslcRestClient.getOslcResource(IntegrityItem.class);			
	return resource;
}




public static IntegrityRequirement getIntegrityRequirementResource(String resourceURI){
	String mediaType = "application/rdf+xml";
	int readTimeout = 120000000;
	final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);
	final IntegrityRequirement resource = oslcRestClient.getOslcResource(IntegrityRequirement.class);			
	return resource;
}




public static IntegrityFunction getIntegrityFunctionResource(String resourceURI){
	String mediaType = "application/rdf+xml";
	int readTimeout = 120000000;
	final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);
	final IntegrityFunction resource = oslcRestClient.getOslcResource(IntegrityFunction.class);			
	return resource;
}




public static IntegrityFunctionHierarchy getIntegrityFunctionHierarchyResource(String resourceURI){
	String mediaType = "application/rdf+xml";
	int readTimeout = 120000000;
	final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);
	final IntegrityFunctionHierarchy resource = oslcRestClient.getOslcResource(IntegrityFunctionHierarchy.class);			
	return resource;
}




public static IntegritySystemElement getIntegritySystemElementResource(String resourceURI){
	String mediaType = "application/rdf+xml";
	int readTimeout = 120000000;
	final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);
	final IntegritySystemElement resource = oslcRestClient.getOslcResource(IntegritySystemElement.class);			
	return resource;
}




public static IntegritySystemHierarchy getIntegritySystemHierarchyResource(String resourceURI){
	String mediaType = "application/rdf+xml";
	int readTimeout = 120000000;
	final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);
	final IntegritySystemHierarchy resource = oslcRestClient.getOslcResource(IntegritySystemHierarchy.class);			
	return resource;
}




public static AbstractResource getIntegrityResource(String resourceURI){
	AbstractResource integrityResource;
	if (resourceURI.toString().contains("projects")) {
		return getIntegrityProjectResource(resourceURI);
	}	if (resourceURI.toString().contains("items")) {
		return getIntegrityItemResource(resourceURI);
	}	if (resourceURI.toString().contains("requirements")) {
		return getIntegrityRequirementResource(resourceURI);
	}	if (resourceURI.toString().contains("functions")) {
		return getIntegrityFunctionResource(resourceURI);
	}	if (resourceURI.toString().contains("functionhierarchys")) {
		return getIntegrityFunctionHierarchyResource(resourceURI);
	}	if (resourceURI.toString().contains("systemelements")) {
		return getIntegritySystemElementResource(resourceURI);
	}	if (resourceURI.toString().contains("systemhierarchys")) {
		return getIntegritySystemHierarchyResource(resourceURI);
	}	return null;
}
public static IntegrityProject[] getIntegrityProjectResources(String resourceURI){
	String mediaType = "application/rdf+xml";
	int readTimeout = 120000000;
	final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);
	final IntegrityProject[] resource = oslcRestClient.getOslcResource(IntegrityProject[].class);			
	return resource;
}




public static IntegrityItem[] getIntegrityItemResources(String resourceURI){
	String mediaType = "application/rdf+xml";
	int readTimeout = 120000000;
	final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);
	final IntegrityItem[] resource = oslcRestClient.getOslcResource(IntegrityItem[].class);			
	return resource;
}




public static IntegrityRequirement[] getIntegrityRequirementResources(String resourceURI){
	String mediaType = "application/rdf+xml";
	int readTimeout = 120000000;
	final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);
	final IntegrityRequirement[] resource = oslcRestClient.getOslcResource(IntegrityRequirement[].class);			
	return resource;
}




public static IntegrityFunction[] getIntegrityFunctionResources(String resourceURI){
	String mediaType = "application/rdf+xml";
	int readTimeout = 120000000;
	final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);
	final IntegrityFunction[] resource = oslcRestClient.getOslcResource(IntegrityFunction[].class);			
	return resource;
}




public static IntegrityFunctionHierarchy[] getIntegrityFunctionHierarchyResources(String resourceURI){
	String mediaType = "application/rdf+xml";
	int readTimeout = 120000000;
	final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);
	final IntegrityFunctionHierarchy[] resource = oslcRestClient.getOslcResource(IntegrityFunctionHierarchy[].class);			
	return resource;
}




public static IntegritySystemElement[] getIntegritySystemElementResources(String resourceURI){
	String mediaType = "application/rdf+xml";
	int readTimeout = 120000000;
	final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);
	final IntegritySystemElement[] resource = oslcRestClient.getOslcResource(IntegritySystemElement[].class);			
	return resource;
}




public static IntegritySystemHierarchy[] getIntegritySystemHierarchyResources(String resourceURI){
	String mediaType = "application/rdf+xml";
	int readTimeout = 120000000;
	final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);
	final IntegritySystemHierarchy[] resource = oslcRestClient.getOslcResource(IntegritySystemHierarchy[].class);			
	return resource;
}




public static AbstractResource[] getIntegrityResources(String resourceURI){
	AbstractResource[] integrityResources;
	if (resourceURI.toString().contains("projects")) {
		return getIntegrityProjectResources(resourceURI);
	}	if (resourceURI.toString().contains("items")) {
		return getIntegrityItemResources(resourceURI);
	}	if (resourceURI.toString().contains("requirements")) {
		return getIntegrityRequirementResources(resourceURI);
	}	if (resourceURI.toString().contains("functions")) {
		return getIntegrityFunctionResources(resourceURI);
	}	if (resourceURI.toString().contains("functionhierarchys")) {
		return getIntegrityFunctionHierarchyResources(resourceURI);
	}	if (resourceURI.toString().contains("systemelements")) {
		return getIntegritySystemElementResources(resourceURI);
	}	if (resourceURI.toString().contains("systemhierarchys")) {
		return getIntegritySystemHierarchyResources(resourceURI);
	}	return null;
}
public static AbstractResource[] getAllIntegrityResources(){
	Collection<AbstractResource> integrityResourcesList = new ArrayList();
	integrityResourcesList.addAll(Arrays.asList(getIntegrityProjectResources("")));
	integrityResourcesList.addAll(Arrays.asList(getIntegrityProjectResources("")));
	integrityResourcesList.addAll(Arrays.asList(getIntegrityProjectResources("")));
	integrityResourcesList.addAll(Arrays.asList(getIntegrityProjectResources("")));
	integrityResourcesList.addAll(Arrays.asList(getIntegrityProjectResources("")));
	integrityResourcesList.addAll(Arrays.asList(getIntegrityProjectResources("")));
	integrityResourcesList.addAll(Arrays.asList(getIntegrityProjectResources("")));
	AbstractResource[] integrityResources = (AbstractResource[]) integrityResourcesList.toArray();
	return integrityResources;
}}