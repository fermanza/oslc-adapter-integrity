/*******************************************************************************
 * Copyright (c) 2012, 2013 IBM Corporation.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 * 
 * * Contributors:
 * 
 *    Susumu Fukuda - Initial implementation
 *******************************************************************************/
package edu.gatech.mbsec.adapter.integrity.services;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;

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
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.core.Response.Status;

import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;

import edu.gatech.mbsec.adapter.integrity.application.IntegrityManager;
import edu.gatech.mbsec.adapter.integrity.resources.trs.Base;
import edu.gatech.mbsec.adapter.integrity.resources.trs.ChangeLog;
import edu.gatech.mbsec.adapter.integrity.resources.trs.TRSConstants;
import edu.gatech.mbsec.adapter.integrity.resources.trs.TrackedResourceSet;
import edu.gatech.mbsec.adapter.integrity.trs.ChangeHistory;

/*
 * Added in Lab 1.1, Modified in Lab 1.3.
 */
@Path("trs")
public class TrackedResourceSetService {

	public TrackedResourceSetService() {
	}

	@Context
	private HttpServletRequest httpServletRequest;
	@Context
	private HttpServletResponse httpServletResponse;
	@Context
	private UriInfo uriInfo;

	@GET
	@Produces({ OslcMediaType.TEXT_TURTLE, OslcMediaType.APPLICATION_RDF_XML,
			OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	public TrackedResourceSet getTrackedResourceSet() throws URISyntaxException {
		// IntegrityManager.readServerResources();
		while(!IntegrityManager.serverResourcesReadFlag.getValue()){
			System.out.println("WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		TrackedResourceSet trackedResourceSet = ChangeHistory
				.getTrackedResourceSet();
		return trackedResourceSet;
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public void getHtmlTrackedResourceSet() throws URISyntaxException {
		// IntegrityManager.readServerResources();
		while(!IntegrityManager.serverResourcesReadFlag.getValue()){
			System.out.println("WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		TrackedResourceSet trackedResourceSet = ChangeHistory
				.getTrackedResourceSet();
		if (trackedResourceSet != null) {
			httpServletRequest.setAttribute("bugzillaUri",
					"https://landfill.bugzilla.org/bugzilla-4.2-branch/");
			httpServletRequest.setAttribute("trackedResourceSet",
					trackedResourceSet);
//			return new Viewable("/integrity/trackedresourceset_html.jsp");
			RequestDispatcher rd = httpServletRequest
					.getRequestDispatcher("/integrity/trackedresourceset_html.jsp");
			try {
				rd.forward(httpServletRequest, httpServletResponse);
			} catch (Exception e) {
				e.printStackTrace();
				throw new WebApplicationException(e);
			}
		}
//		return null;
	}

	@Path(TRSConstants.TRS_TERM_BASE)
	@GET
	@Produces({ OslcMediaType.TEXT_TURTLE, OslcMediaType.APPLICATION_RDF_XML,
			OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	public Base getBase() {
		while(!IntegrityManager.serverResourcesReadFlag.getValue()){
			System.out.println("WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// IntegrityManager.readServerResources();
		return ChangeHistory.getBase();
	}

	@Path(TRSConstants.TRS_TERM_BASE)
	@GET
	@Produces(MediaType.TEXT_HTML)
	public void getHtmlBase() {
		// IntegrityManager.readServerResources();
		while(!IntegrityManager.serverResourcesReadFlag.getValue()){
			System.out.println("WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		Base base = ChangeHistory.getBase();
		if (base != null) {
			httpServletRequest.setAttribute("bugzillaUri",
					"https://landfill.bugzilla.org/bugzilla-4.2-branch/");
			httpServletRequest.setAttribute("base", base);
//			return new Viewable("/integrity/base_html.jsp");
			RequestDispatcher rd = httpServletRequest
					.getRequestDispatcher("/integrity/base_html.jsp");
			try {
				rd.forward(httpServletRequest, httpServletResponse);
			} catch (Exception e) {
				e.printStackTrace();
				throw new WebApplicationException(e);
			}
		}
//		return null;
	}

	@Path(TRSConstants.TRS_TERM_CHANGE_LOG)
	@GET
	@Produces({ OslcMediaType.TEXT_TURTLE, OslcMediaType.APPLICATION_RDF_XML,
			OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	public ChangeLog getChangeLog() {
		while(!IntegrityManager.serverResourcesReadFlag.getValue()){
			System.out.println("WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return ChangeHistory.getChangeLog();
	}
	
	@Path(TRSConstants.TRS_TERM_CHANGE_LOG +"/{page}")
	@GET
	@Produces({ OslcMediaType.TEXT_TURTLE, OslcMediaType.APPLICATION_RDF_XML,
			OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })
	public ChangeLog getChangeLog(@PathParam("page") String pagenum) {
		while(!IntegrityManager.serverResourcesReadFlag.getValue()){
			System.out.println("WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return ChangeHistory.getChangeLog(pagenum);
	}

	@Path(TRSConstants.TRS_TERM_CHANGE_LOG)
	@GET
	@Produces(MediaType.TEXT_HTML)
	public void getHtmlChangeLog() {
		while(!IntegrityManager.serverResourcesReadFlag.getValue()){
			System.out.println("WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ChangeLog changeLog = ChangeHistory.getChangeLog();
		if (changeLog != null) {
			
				httpServletRequest.setAttribute("bugzillaUri",
						"https://landfill.bugzilla.org/bugzilla-4.2-branch/");
				httpServletRequest.setAttribute("changeLog", changeLog);
//				return new Viewable("/integrity/changelog_html.jsp");
				RequestDispatcher rd = httpServletRequest
						.getRequestDispatcher("/integrity/changelog_html.jsp");
				try {
					rd.forward(httpServletRequest, httpServletResponse);
				} catch (Exception e) {
					e.printStackTrace();
					throw new WebApplicationException(e);
				}
			
		}
//		return null;
	}
	
	
	
	@Path(TRSConstants.TRS_TERM_CHANGE_LOG +"/{page}")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public void getHtmlChangeLog(@PathParam("page") String pagenum) {
		while(!IntegrityManager.serverResourcesReadFlag.getValue()){
			System.out.println("WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		ChangeLog changeLog = ChangeHistory.getChangeLog(pagenum);
		if (changeLog != null) {			
				URI changeLogURI = ChangeHistory.getChangeLogURI(pagenum);
				httpServletRequest.setAttribute("bugzillaUri",
						"https://landfill.bugzilla.org/bugzilla-4.2-branch/");
				httpServletRequest.setAttribute("changeLog", changeLog);
				httpServletRequest.setAttribute("changeLogURI", changeLogURI);
//				return new Viewable("/integrity/changelog_html.jsp");
				RequestDispatcher rd = httpServletRequest
						.getRequestDispatcher("/integrity/changelog_html.jsp");
				try {
					rd.forward(httpServletRequest, httpServletResponse);
				} catch (Exception e) {
					e.printStackTrace();
					throw new WebApplicationException(e);
				}
		}
//		return null;
	}
}
