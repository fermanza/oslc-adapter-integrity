
package edu.gatech.mbsec.adapter.integrity.services;



import java.net.URI;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response.Status;

import org.eclipse.lyo.oslc4j.core.annotation.OslcDialog;
import org.eclipse.lyo.oslc4j.core.annotation.OslcQueryCapability;
import org.eclipse.lyo.oslc4j.core.annotation.OslcService;
import org.eclipse.lyo.oslc4j.core.model.Compact;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;
import org.eclipse.lyo.oslc4j.core.model.Service;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog;

import edu.gatech.mbsec.adapter.integrity.application.OSLC4JIntegrityApplication;
import edu.gatech.mbsec.adapter.integrity.serviceproviders.ServiceProviderCatalogSingleton;





@OslcService(OslcConstants.OSLC_CORE_DOMAIN)
@Path("serviceProviders")
public class ServiceProviderService
{
	@Context private HttpServletRequest httpServletRequest;
	@Context private HttpServletResponse httpServletResponse;
	
	
	/**
	 * RDF/XML, XML and JSON representations of an OSLC Service Provider collection
	 * @return
	 */
	
    @OslcDialog
    (
         title = "Service Provider Selection Dialog",
         label = "Service Provider Selection Dialog",
         uri = "",
         hintWidth = "1000px",
         hintHeight = "600px",
         resourceTypes = {OslcConstants.TYPE_SERVICE_PROVIDER},
         usages = {OslcConstants.OSLC_USAGE_DEFAULT}
    )
    @OslcQueryCapability
    (
         title = "Service Provider Query Capability",
         label = "Service Provider Query",
         resourceShape = OslcConstants.PATH_RESOURCE_SHAPES + "/" + OslcConstants.PATH_SERVICE_PROVIDER,
         resourceTypes = {OslcConstants.TYPE_SERVICE_PROVIDER},
         usages = {OslcConstants.OSLC_USAGE_DEFAULT}
    )
    @GET
    @Produces({OslcMediaType.APPLICATION_RDF_XML, OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON})
    public ServiceProvider[] getServiceProviders()
    {
    	httpServletResponse.addHeader("Oslc-Core-Version","2.0");
        return ServiceProviderCatalogSingleton.getServiceProviders(httpServletRequest);
    }

    /**
     * RDF/XML, XML and JSON representations of a single OSLC Service Provider
     * 
     * @param serviceProviderId
     * @return
     */
    @GET
    @Path("{serviceProviderId}")
    @Produces({OslcMediaType.APPLICATION_RDF_XML, OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON})
    public ServiceProvider getServiceProvider(@PathParam("serviceProviderId") final String serviceProviderId)
    {
    	httpServletResponse.addHeader("Oslc-Core-Version","2.0");
        return ServiceProviderCatalogSingleton.getServiceProvider(httpServletRequest, serviceProviderId);
    }

    /**
     * OSLC compact XML representation of a single OSLC Service Provider
     * 
     * @param serviceProviderId
     * @return
     */
    @GET
    @Path("{serviceProviderId}")
    @Produces({OslcMediaType.APPLICATION_X_OSLC_COMPACT_XML, OslcMediaType.APPLICATION_X_OSLC_COMPACT_JSON})
    public Compact getCompact(@PathParam("serviceProviderId") final String serviceProviderId)
    {
        final ServiceProvider serviceProvider = ServiceProviderCatalogSingleton.getServiceProvider(httpServletRequest, serviceProviderId);

        if (serviceProvider != null) {
        	
        	final Compact compact = new Compact();

        	compact.setAbout(serviceProvider.getAbout());
        	compact.setShortTitle(serviceProvider.getTitle());
        	compact.setTitle(serviceProvider.getTitle());

        	// TODO - Need icon for ServiceProvider compact.

        	httpServletResponse.addHeader("Oslc-Core-Version","2.0");
        	return compact;
        }
        
        throw new WebApplicationException(Status.NOT_FOUND);
    }
    
    /**
     * HTML representation of a single OSLC Service Provider
     * 
     * Forwards to serviceprovider_html.jsp to create the html document
     * 
     * @param serviceProviderId
     */
    @GET
    @Path("{serviceProviderId}")
    @Produces(MediaType.TEXT_HTML)
    public void getHtmlServiceProvider(@PathParam("serviceProviderId") final String serviceProviderId)
    {
    	ServiceProvider serviceProvider = ServiceProviderCatalogSingleton.getServiceProvider(httpServletRequest, serviceProviderId);
    	
    	Service [] services = serviceProvider.getServices();
    	
//    	for (Service service : services) {
//			if(service.getDomain().toString().contains("project")){
//				service.setAbout(URI.create("http://" + OSLC4JIntegrityApplication.hostName + ":" + OSLC4JIntegrityApplication.portNumber + "/" + OSLC4JIntegrityApplication.contextPath + "/services/" + serviceProviderId + "/project"));
//			}
//			else if(service.getDomain().toString().contains("requirementDocument")){
//				service.setAbout(URI.create("http://" + OSLC4JIntegrityApplication.hostName + ":" + OSLC4JIntegrityApplication.portNumber + "/" + OSLC4JIntegrityApplication.contextPath + "/services/" + serviceProviderId + "/requirementdocuments"));
//			}
//			else if(service.getDomain().toString().contains("requirement")){
//				service.setAbout(URI.create("http://" + OSLC4JIntegrityApplication.hostName + ":" + OSLC4JIntegrityApplication.portNumber + "/" + OSLC4JIntegrityApplication.contextPath + "/services/" + serviceProviderId + "/requirements"));
//			}
//			else if(service.getDomain().toString().contains("item")){
//				service.setAbout(URI.create("http://" + OSLC4JIntegrityApplication.hostName + ":" + OSLC4JIntegrityApplication.portNumber + "/" + OSLC4JIntegrityApplication.contextPath + "/services/" + serviceProviderId + "/items"));
//			}
//		}
    	
    	if (services !=null && services.length > 0)
    	{
    		//Bugzilla adapter should only have one Service per ServiceProvider
	        httpServletRequest.setAttribute("bugzillaUri", "https://landfill.bugzilla.org/bugzilla-4.2-branch/");
//	        httpServletRequest.setAttribute("service", services[0]);
	        httpServletRequest.setAttribute("serviceProvider", serviceProvider);	        
//    		return new Viewable("/integrity/serviceprovider_html.jsp");
    		RequestDispatcher rd = httpServletRequest
					.getRequestDispatcher("/integrity/serviceprovider_html.jsp");
			try {
				rd.forward(httpServletRequest, httpServletResponse);
			} catch (Exception e) {
				e.printStackTrace();
				throw new WebApplicationException(e);
			}
    	}
//    	return null;
    }


}
