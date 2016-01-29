package edu.gatech.mbsec.adapter.integrity.generated.services;

import edu.gatech.mbsec.adapter.integrity.application.IntegrityManager;
import edu.gatech.mbsec.adapter.integrity.application.OSLC4JIntegrityApplication;
import edu.gatech.mbsec.adapter.integrity.application.util.IntegrityUtil;
import edu.gatech.mbsec.adapter.integrity.generated.resources.Constants;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityField;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityProject;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityServerResources;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.EntityTag;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.ResponseBuilder;
import org.eclipse.lyo.oslc4j.core.annotation.OslcCreationFactory;
import org.eclipse.lyo.oslc4j.core.annotation.OslcQueryCapability;
import org.eclipse.lyo.oslc4j.core.annotation.OslcService;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;
import org.eclipse.lyo.oslc4j.core.model.Link;


@OslcService(Constants.INTEGRITY_PROJECT_DOMAIN)
@Path("{projectID}/projects")
public class IntegrityProjectService {
	@Context
	private HttpServletRequest httpServletRequest;
	@Context
	private HttpServletResponse httpServletResponse;
	@Context
	private UriInfo uriInfo;

	@GET
	@Produces({ OslcMediaType.APPLICATION_RDF_XML, OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	public Response getProject(
		@PathParam("projectID") final String projectID,
		@Context Request request)
		throws URISyntaxException {
		while(!IntegrityManager.serverResourcesReadFlag.getValue()){
			System.out.println("WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		IntegrityProject oslcResource = IntegrityServerResources.getProjectByURI(projectID + "/projects");
		if(oslcResource == null){
			return Response.status(HttpServletResponse.SC_INTERNAL_SERVER_ERROR).build();
		}
		return Response.ok(oslcResource).build();

	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public void getHtmlProject(
		@PathParam("projectID") final String projectID)
		throws URISyntaxException, IOException {
		while(!IntegrityManager.serverResourcesReadFlag.getValue()){
			System.out.println("WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		IntegrityProject oslcResource = IntegrityServerResources.getProjectByURI(projectID + "/projects");
			String requestURL = httpServletRequest.getRequestURL().toString();
			String projectID2 = null;
			if(projectID.contains("project")){
				projectID2 = projectID.replace("project", "");
			}else{
				projectID2 = projectID;
			}
			String projectName = IntegrityUtil.getProjectName(projectID2);
		if (oslcResource != null) {
			httpServletRequest.setAttribute("bugzillaUri","https://landfill.bugzilla.org/bugzilla-4.2-branch/");
			httpServletRequest.setAttribute("element", oslcResource);
			httpServletRequest.setAttribute("requestURL", requestURL);
			httpServletRequest.setAttribute("projectName", projectName);
			RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/integrity/genericitem_html.jsp");
			try {
				rd.forward(httpServletRequest, httpServletResponse);
			} catch (Exception e) {
				e.printStackTrace();
				throw new WebApplicationException(e);
			}
		}

	}

}