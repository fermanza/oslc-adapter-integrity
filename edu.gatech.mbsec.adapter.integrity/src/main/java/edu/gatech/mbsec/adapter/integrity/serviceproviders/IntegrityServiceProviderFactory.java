package edu.gatech.mbsec.adapter.integrity.serviceproviders;

import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;


import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.PrefixDefinition;
import org.eclipse.lyo.oslc4j.core.model.Publisher;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.ServiceProviderFactory;

import edu.gatech.mbsec.adapter.integrity.application.OSLC4JIntegrityApplication;
import edu.gatech.mbsec.adapter.integrity.application.util.IntegrityUtil;




public class IntegrityServiceProviderFactory {
	private static Class<?>[] RESOURCE_CLASSES = IntegrityUtil.getResourceClassesForRegisteringServices();
		
	
		

	



	private IntegrityServiceProviderFactory() {
		super();
	}

	/**
	 * Create a new Integrity OSLC service provider.
	 * 
	 * @param baseURI
	 * @param product
	 * @param parameterValueMap
	 *            - a map containing the path replacement value for {productId}.
	 *            See ServiceProviderCatalogSingleton.
	 *            initServiceProvidersFromProducts()
	 * @return
	 * @throws OslcCoreApplicationException
	 * @throws URISyntaxException
	 */
	public static ServiceProvider createServiceProvider(final String baseURI,
			final String product, final Map<String, Object> parameterValueMap)
			throws OslcCoreApplicationException, URISyntaxException {
		final ServiceProvider serviceProvider = ServiceProviderFactory
				.createServiceProvider(baseURI, "http://" + OSLC4JIntegrityApplication.hostName + ":" + OSLC4JIntegrityApplication.portNumber + "/" + "OSLC4JUI", product,
						"Service provider for Integrity server: " + product,
						new Publisher("Georgia Institute of Technology OSLC Project",
								"urn:oslc:ServiceProvider"), RESOURCE_CLASSES,
						parameterValueMap);
		URI detailsURIs[] = { new URI(baseURI + "/details") };
		serviceProvider.setDetails(detailsURIs);

		final PrefixDefinition[] prefixDefinitions = {
				new PrefixDefinition(OslcConstants.DCTERMS_NAMESPACE_PREFIX,
						new URI(OslcConstants.DCTERMS_NAMESPACE)),
				new PrefixDefinition(OslcConstants.OSLC_CORE_NAMESPACE_PREFIX,
						new URI(OslcConstants.OSLC_CORE_NAMESPACE)),
				new PrefixDefinition(OslcConstants.OSLC_DATA_NAMESPACE_PREFIX,
						new URI(OslcConstants.OSLC_DATA_NAMESPACE)),
				new PrefixDefinition(OslcConstants.RDF_NAMESPACE_PREFIX,
						new URI(OslcConstants.RDF_NAMESPACE)),
				new PrefixDefinition(OslcConstants.RDFS_NAMESPACE_PREFIX,
						new URI(OslcConstants.RDFS_NAMESPACE))
//				,
//				new PrefixDefinition(
//						Constants.CHANGE_MANAGEMENT_NAMESPACE_PREFIX, new URI(
//								Constants.CHANGE_MANAGEMENT_NAMESPACE)),
//				new PrefixDefinition(Constants.BUGZILLA_NAMESPACE_PREFIX,
//						new URI(Constants.BUGZILLA_NAMESPACE)),
//				new PrefixDefinition(Constants.FOAF_NAMESPACE_PREFIX, new URI(
//						Constants.FOAF_NAMESPACE)),
//				new PrefixDefinition(Constants.QUALITY_MANAGEMENT_PREFIX,
//						new URI(Constants.QUALITY_MANAGEMENT_NAMESPACE)),
//				new PrefixDefinition(Constants.REQUIREMENTS_MANAGEMENT_PREFIX,
//						new URI(Constants.REQUIREMENTS_MANAGEMENT_NAMESPACE)),
//				new PrefixDefinition(
//						Constants.SOFTWARE_CONFIGURATION_MANAGEMENT_PREFIX,
//						new URI(
//								Constants.SOFTWARE_CONFIGURATION_MANAGEMENT_NAMESPACE)),
//				new PrefixDefinition(Constants.SIMULINK_PREFIX, new URI(
//						Constants.SIMULINK_NAMESPACE)) 
				};

		serviceProvider.setPrefixDefinitions(prefixDefinitions);

		return serviceProvider;
	}
}
