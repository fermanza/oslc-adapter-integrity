<!DOCTYPE html>

<%@ page contentType="text/html" language="java" pageEncoding="UTF-8" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.ServiceProvider" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.Link" %>
<%@ page import="java.net.URI" %>
<%@ page import="edu.gatech.mbsec.adapter.integrity.resources.trs.TrackedResourceSet" %>
<%@ page import="edu.gatech.mbsec.adapter.integrity.resources.trs.ChangeLog" %>
<%@ page import="edu.gatech.mbsec.adapter.integrity.resources.trs.ChangeEvent" %>
<%@ page import="java.util.Collection" %>
<%
String bugzillaUri = (String) request.getAttribute("bugzillaUri");
TrackedResourceSet trackedResourceSet = (TrackedResourceSet)request.getAttribute("trackedResourceSet");

URI trackedResourceSetDocumentURI = (URI)request.getAttribute("trackedResourceSetDocumentURI");
%>
<html>
	<head>

		<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
		<title>Integrity OSLC Adapter: Tracked Resource Set</title>
		<link href="<%= bugzillaUri %>/skins/standard/global.css" rel="stylesheet" type="text/css">
		<link href="<%= bugzillaUri %>/skins/standard/index.css" rel="stylesheet" type="text/css">
		<link href="<%= bugzillaUri %>/skins/standard/global.css" rel="alternate stylesheet" title="Classic" type="text/css">
		<link href="<%= bugzillaUri %>/skins/standard/index.css" rel="alternate stylesheet" title="Classic" type="text/css">
		<link href="<%= bugzillaUri %>/skins/contrib/Dusk/global.css" rel="stylesheet" title="Dusk" type="text/css">
		<link href="<%= bugzillaUri %>/skins/contrib/Dusk/index.css" rel="stylesheet" title="Dusk" type="text/css">
		<link href="<%= bugzillaUri %>/skins/custom/global.css" rel="stylesheet" type="text/css">
		<link href="<%= bugzillaUri %>/skins/custom/index.css" rel="stylesheet" type="text/css">
		<!-- <link rel="shortcut icon" href="<%= bugzillaUri %>/images/favicon.ico"> -->
		
	</head>
	<body onload="">
	
		<div id="header">
			<div id="banner"></div>
			<table border="0" cellspacing="10" cellpadding="0" id="titles">
				<tr>
					<td id="title">
						<p>
							Integrity OSLC Adapter: Tracked Resource Set
						</p>
					</td>
					<td id="information">
						<p class="header_addl_info">
							Version 0.1
						</p>
					</td>
				</tr>
			</table>
		</div>
		
		<div id="bugzilla-body">
			<div id="page-index">
			
			
			
			<img src=    "<%=request.getContextPath()%>/images/oslcLg.png" alt="icon"  />
			
			
			
				
			<!-- <img src="../../images/resources/OMG-SysML-logo" alt="icon" width="80" height="80"/> -->
			
			
			<h1><small>Tracked Resource Set</small> </h1>
			
			

            <table>
	            <tr>
		            <td><b>This document</b>:</td>
		            <td><a href="<%= trackedResourceSet.getAbout() %>">
                            <%= trackedResourceSet.getAbout() %>
                        </a></td>
	            </tr>
	            <!--
	            <tr>
		            <td><b>Bugzilla</b>:</td>
		            <td><a href="<%= bugzillaUri %>"><%= bugzillaUri %></a></td>
	            </tr>
	            -->
	            <tr>
		            <td><b>Adapter Publisher</b>:</td>
		            <td>Georgia Institute of Technology OSLC Tools Project</td>
	            </tr>
	            <tr>
		            <td><b>Adapter Identity</b>:</td>
		            <td>edu.gatech.mbsec.adapter.integrity</td>
	            </tr>
            </table>
			
			<h2><small>Base: <a href="<%= trackedResourceSet.getBase() %>">
                    	<%= trackedResourceSet.getBase() %></a></small></h2>
			<!--  
			<h2><small>Change Log: : <a href="<%= trackedResourceSet.getChangeLog().getAbout() %>">
                    	<%= trackedResourceSet.getChangeLog().getAbout() %></a></small></h2>
			-->
			
			<h2><small>Change Log</small></h2>
			
			
			<% ChangeLog changeLog = trackedResourceSet.getChangeLog(); %>
			<% if(changeLog.getPrevious() != null) { %>
			
			<p>&nbsp;&nbsp;&nbsp;<b>Previous Change Log: </b> <a href="<%= changeLog.getPrevious() %>">
                    	<%= changeLog.getPrevious() %></a></p>
			
			
			<% } else{ %>	
				<h2><small>&nbsp;&nbsp;&nbsp;<b>Previous Change Log:</b> none</small></h2>
			<% } %>	
			
			
			
			<% if(changeLog.getChanges().size() > 0) { %>
				<h2><small>&nbsp;&nbsp;&nbsp;Change Events</small></h2>		
				<% for (ChangeEvent changeEvent : changeLog.getChanges()) { %>	
				<% Collection<URI> changeEventTypes = changeEvent.getTypes(); %>	
					<% String changeEventTypeURI = changeEventTypes.toArray()[0].toString(); %>
					<% String changeEventType = changeEventTypeURI.replace("http://open-services.net/ns/core/trs#",""); %>
					<p><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<%= changeEventType %></b> Change Event</p>
                    	<p><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Changed</b> Resource <a href="<%= changeEvent.getChanged() %>">
                    	<%= changeEvent.getChanged() %></a></p>
                    	<p><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Timestamp</b> <%= changeEvent.getAbout().toString().replace("http://localhost:8383/oslc4jintegrity/changeevents/", "") %></p>
                    	<p><b>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Order</b> <%= changeEvent.getOrder() %></p>
				<% } %>
				
			<% } else { %>	
				<h2><small>&nbsp;&nbsp;&nbsp;Change Events: none</small></h2>
			<% } %>	
			
			
			</div>
		</div>
		
		<!-- footer -->
		<p id="footer">OSLC Integrity Adapter 1.1</p>
		
	</body>
</html>
