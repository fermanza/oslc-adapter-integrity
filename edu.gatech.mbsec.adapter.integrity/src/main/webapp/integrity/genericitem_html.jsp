<!DOCTYPE html>

<%@ page contentType="text/html" language="java" pageEncoding="UTF-8" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.ServiceProvider" %>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.Link" %>
<%@ page import="java.net.URI" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.lang.reflect.InvocationTargetException" %>
<%@ page import="java.lang.reflect.Method" %>
<%@ page import="java.lang.reflect.InvocationTargetException" %>
<%@ page import="java.lang.reflect.InvocationTargetException" %>
<%@ page import="java.lang.reflect.InvocationTargetException" %>
<%@ page import="java.lang.reflect.InvocationTargetException" %>
<%@ page import="java.lang.reflect.InvocationTargetException" %>



<%
String bugzillaUri = (String) request.getAttribute("bugzillaUri");
Object resource = request.getAttribute("element");
String requestURL = (String)request.getAttribute("requestURL");
String projectName = (String)request.getAttribute("projectName");

%>
<html>
	<head>

		<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
		<title>Integrity OSLC Adapter: Integrity <%= getResourceTypeName(resource) %></title>
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
							Integrity OSLC Adapter: Integrity <%= getResourceTypeName(resource) %>
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
			
			
			<h1>Integrity <%= getResourceTypeName(resource) %> </h1>
			<h1><small>ID: </small> <%= getResourceID(resource) %></h1>
			
			

            <table>
	            <tr>
		            <td><b>This document</b>:</td>
		            <td><a href="<%= requestURL %>">
                            <%= requestURL %>
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
			
			
			
			
			
			
			<%
			for (Method method : resource.getClass().getDeclaredMethods()) {
				if (method.getName().startsWith("get")) {
					String methodName = method.getName();
					String fieldName = methodName.replace("get", "");
					//fieldName = fieldName.toUpperCase();
					try {
						

						// get object property value
						
							if (method.getReturnType().equals(Link[].class)) {
								Object object = method.invoke(resource,null);
								Link[] linkArray = (Link[]) object;
								

								if(linkArray.length > 0) { %>
								<h2><small><%= fieldName %></small></h2>		
								<% 
								for (Link link : linkArray) { %>			
									<p><a href="<%= link.getValue() %>">
				                    	<%= link.getValue() %></a></p>
								<% } 
							 } 
								
								
								
								
								
							} else if (method.getReturnType().equals(Set.class)) {
								Object object = method.invoke(resource,null);
								Set<Link> linkSet = (Set<Link>) object;
								
								
								if(linkSet.size() > 0) { %>
								<h2><small><%= fieldName %></small></h2>		
								<% 
								for (Link link : linkSet) { %>			
									<p><a href="<%= link.getValue() %>">
				                    	<%= link.getValue() %></a></p>
								<% } 
								 } 
								
							} else if (method.getReturnType().equals(URI.class)) {
								Object object = method.invoke(resource,null);
								URI uri = (URI) object;
								
								
								if(uri != null) { %>
								<h2><small><%= fieldName %></small></h2>				
								<p><a href="<%= uri.toString() %>">
				                    	<%= uri.toString() %></a></p>
				                    	<%								
								 } 
								
							} else if (method.getReturnType().equals(String.class)) {
								Object object = method.invoke(resource,null);
								String stringValue = (String) object;
								%>
								<p><span id="metainfo"><%= fieldName %></span>: <%= stringValue %></p>
								
								<%
								
							}
							
							
						
					} catch (IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IllegalArgumentException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SecurityException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			%>
			
			
			
			
			
			<%!
		public String getResourceID(Object resource){				
			// getAbout() is in super class				
			Method method;
			String stringValue = null;
			try {
				method = resource.getClass().getDeclaredMethod("getID", new Class[0]);
				Object object = method.invoke(resource,null);
				stringValue = object.toString();				
			} catch (NoSuchMethodException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			return stringValue;
		}
		%>
			
			
			
			
			<%!
			public String getResourceTypeName(Object resource){				
				String typeName = resource.getClass().getName();
				String[] qualifiedNameSegments = typeName.split("\\.");
				typeName = qualifiedNameSegments[qualifiedNameSegments.length - 1];
				typeName = typeName.replace("Integrity", "");				
				return typeName;
			}
			%>
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
				
			
			
			</div>
		</div>
		
		<!-- footer -->
		<p id="footer">OSLC Integrity Adapter 1.1</p>
		
	</body>
</html>
