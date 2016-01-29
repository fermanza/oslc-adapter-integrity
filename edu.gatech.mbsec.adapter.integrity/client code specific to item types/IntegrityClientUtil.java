package edu.gatech.mbsec.adapter.integrity.client.util;

import java.net.URI;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Response;

import org.apache.wink.client.handlers.BasicAuthSecurityHandler;
import org.eclipse.lyo.oslc4j.client.OslcRestClient;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog;
import org.eclipse.lyo.oslc4j.provider.jena.JenaProvidersRegistry;

import edu.gatech.mbsec.adapter.integrity.application.IntegrityManager;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityItem;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityProductRequirement;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityProductRequirementDocument;
import edu.gatech.mbsec.adapter.integrity.resources.trs.Base;
import edu.gatech.mbsec.adapter.integrity.resources.trs.ChangeLog;
import edu.gatech.mbsec.adapter.integrity.resources.trs.TrackedResourceSet;

public class IntegrityClientUtil {
	
	private static final Set<Class<?>> PROVIDERS = new HashSet<Class<?>>();

	static {
		PROVIDERS.addAll(JenaProvidersRegistry.getProviders());
		// PROVIDERS.addAll(Json4JProvidersRegistry.getProviders());
	}
	
	
	
	
	public static AbstractResource getResource(URI resourceURI){
		
			// URI of the HTTP request
			
			// expected mediatype
			String mediaType = "application/rdf+xml";

			// readTimeout specifies how long the RestClient object waits (in
			// milliseconds) for a response before timing out
			int readTimeout = 120000;

			// set up the credentials for the basic authentication
//			BasicAuthSecurityHandler basicAuthHandler = new BasicAuthSecurityHandler();
//			basicAuthHandler.setUserName("foo");
//			basicAuthHandler.setPassword("bar");

			// set up the HTTP connection
//			final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS,
//					resourceURI, mediaType, readTimeout,
//					basicAuthHandler);
			
			final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS,
					resourceURI, mediaType, readTimeout);

			// retrieve the SysML block as POJO
			final IntegrityProductRequirement resource = oslcRestClient
					.getOslcResource(IntegrityProductRequirement.class);			
			return resource;
	}

	
	public static TrackedResourceSet getTrackedResourceSetResource(String trsURI){
		
		// URI of the HTTP request
		

		// expected mediatype
		String mediaType = "application/rdf+xml";

		// readTimeout specifies how long the RestClient object waits (in
		// milliseconds) for a response before timing out
		int readTimeout = 120000;

		// set up the credentials for the basic authentication
//		BasicAuthSecurityHandler basicAuthHandler = new BasicAuthSecurityHandler();
//		basicAuthHandler.setUserName("foo");
//		basicAuthHandler.setPassword("bar");

		// set up the HTTP connection
//		final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS,
//				resourceURI, mediaType, readTimeout,
//				basicAuthHandler);
		
		final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS,
				trsURI, mediaType, readTimeout);

		// retrieve the SysML block as POJO
		final TrackedResourceSet resource = oslcRestClient
				.getOslcResource(TrackedResourceSet.class);			
		return resource;
}

	public static Base getBaseResource(URI baseURI) {
		// expected mediatype
				String mediaType = "application/rdf+xml";

				// readTimeout specifies how long the RestClient object waits (in
				// milliseconds) for a response before timing out
				int readTimeout = 120000;

				// set up the credentials for the basic authentication
//				BasicAuthSecurityHandler basicAuthHandler = new BasicAuthSecurityHandler();
//				basicAuthHandler.setUserName("foo");
//				basicAuthHandler.setPassword("bar");

				// set up the HTTP connection
//				final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS,
//						resourceURI, mediaType, readTimeout,
//						basicAuthHandler);
				
				final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS,
						baseURI, mediaType, readTimeout);

				// retrieve the SysML block as POJO
				final Base resource = oslcRestClient
						.getOslcResource(Base.class);			
				return resource;
	}

	public static ChangeLog getChangeLogResource(URI previousChangeLogURI) {
		// expected mediatype
		String mediaType = "application/rdf+xml";

		// readTimeout specifies how long the RestClient object waits (in
		// milliseconds) for a response before timing out
		int readTimeout = 120000;

		// set up the credentials for the basic authentication
//		BasicAuthSecurityHandler basicAuthHandler = new BasicAuthSecurityHandler();
//		basicAuthHandler.setUserName("foo");
//		basicAuthHandler.setPassword("bar");

		// set up the HTTP connection
//		final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS,
//				resourceURI, mediaType, readTimeout,
//				basicAuthHandler);
		
		final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS,
				previousChangeLogURI, mediaType, readTimeout);

		// retrieve the SysML block as POJO
		final ChangeLog resource = oslcRestClient
				.getOslcResource(ChangeLog.class);			
		return resource;
	}
	
	public static ServiceProviderCatalog getServiceProviderCatalogResource(String resourceURI){
		String mediaType = "application/rdf+xml";
		int readTimeout = 120000;
		BasicAuthSecurityHandler basicAuthHandler = new BasicAuthSecurityHandler();
		basicAuthHandler.setUserName("foo");
		basicAuthHandler.setPassword("bar");
		final OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS,
				resourceURI, mediaType, readTimeout,
				basicAuthHandler);
		final ServiceProviderCatalog resource = oslcRestClient.getOslcResource(ServiceProviderCatalog.class);			
		return resource;
	}
	
}
