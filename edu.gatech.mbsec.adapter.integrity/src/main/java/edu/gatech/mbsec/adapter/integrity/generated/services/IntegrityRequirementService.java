package edu.gatech.mbsec.adapter.integrity.generated.services;

import edu.gatech.mbsec.adapter.integrity.application.IntegrityManager;
import edu.gatech.mbsec.adapter.integrity.application.OSLC4JIntegrityApplication;
import edu.gatech.mbsec.adapter.integrity.application.util.IntegrityUtil;
import edu.gatech.mbsec.adapter.integrity.generated.resources.Constants;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityField;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityRequirement;
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


@OslcService(Constants.INTEGRITY_REQUIREMENT_DOMAIN)
@Path("{projectID}/requirements")
public class IntegrityRequirementService {
	@Context
	private HttpServletRequest httpServletRequest;
	@Context
	private HttpServletResponse httpServletResponse;
	@Context
	private UriInfo uriInfo;

	@OslcQueryCapability(title = "Integrity Requirement Query Capability",label = "Integrity Requirement Catalog Query",resourceShape = OslcConstants.PATH_RESOURCE_SHAPES+ "/" + Constants.PATH_INTEGRITY_REQUIREMENT,resourceTypes = { Constants.TYPE_INTEGRITY_REQUIREMENT },usages = { OslcConstants.OSLC_USAGE_DEFAULT })
	@GET
	@Produces({ OslcMediaType.APPLICATION_RDF_XML, OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	public List<IntegrityRequirement> getRequirements(
		@PathParam("projectID") final String projectID,
		@QueryParam("oslc.where") final String where,
		@QueryParam("oslc.select") final String select,
		@QueryParam("oslc.prefix") final String prefix,
		@QueryParam("page") final String pageString,
		@QueryParam("oslc.orderBy") final String orderBy,
		@QueryParam("oslc.searchTerms") final String searchTerms,
		@QueryParam("oslc.paging") final String paging,
		@QueryParam("oslc.pageSize") final String pageSize)
		throws IOException, ServletException {
		while(!IntegrityManager.serverResourcesReadFlag.getValue()){
			System.out.println("WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		List<IntegrityRequirement> oslcResources = IntegrityServerResources.getRequirementsInProject(projectID);
		return oslcResources;
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	public void getHtmlRequirements(@PathParam("projectID") final String projectID) {
		while(!IntegrityManager.serverResourcesReadFlag.getValue()){
			System.out.println("WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			List<IntegrityRequirement> oslcResources = IntegrityServerResources.getRequirementsInProject(projectID);
		String requestURL = httpServletRequest.getRequestURL().toString();
		if (oslcResources != null) {
			httpServletRequest.setAttribute("bugzillaUri","https://landfill.bugzilla.org/bugzilla-4.2-branch/");
			httpServletRequest.setAttribute("elements", oslcResources);
			httpServletRequest.setAttribute("requestURL", requestURL);
			httpServletRequest.setAttribute("projectID", projectID);
			httpServletRequest.setAttribute("itemTypeName", "Requirement");
			RequestDispatcher rd = httpServletRequest.getRequestDispatcher("/integrity/genericitems_html.jsp");
			try {
				rd.forward(httpServletRequest, httpServletResponse);
			} catch (Exception e) {
				e.printStackTrace();
				throw new WebApplicationException(e);
			}
		}
	}

	@GET
	@Path("{uri}")
	@Produces({ OslcMediaType.APPLICATION_RDF_XML, OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	public Response getRequirement(
		@PathParam("projectID") final String projectID,
		@Context Request request,
		@PathParam("uri") final String ID)
		throws URISyntaxException {
		while(!IntegrityManager.serverResourcesReadFlag.getValue()){
			System.out.println("WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		IntegrityRequirement oslcResource = IntegrityServerResources.getRequirementByURI(projectID + "/requirements/" + ID);
		if(oslcResource == null){
			return Response.status(HttpServletResponse.SC_INTERNAL_SERVER_ERROR).build();
		}
		return Response.ok(oslcResource).build();

	}

	@GET
	@Path("{uri}")
	@Produces(MediaType.TEXT_HTML)
	public void getHtmlRequirement(
		@PathParam("projectID") final String projectID,
		@PathParam("uri") final String ID)
		throws URISyntaxException, IOException {
		while(!IntegrityManager.serverResourcesReadFlag.getValue()){
			System.out.println("WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		IntegrityRequirement oslcResource = IntegrityServerResources.getRequirementByURI(projectID + "/requirements/" + ID);
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