<!DOCTYPE html>
<%--
/*********************************************************************************************
 * Copyright (c) 2014 Model-Based Systems Engineering Center, Georgia Institute of Technology.
 *                         http://www.mbse.gatech.edu/
 *                  http://www.mbsec.gatech.edu/research/oslc
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Eclipse Distribution License v. 1.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 *  and the Eclipse Distribution License is available at
 *  http://www.eclipse.org/org/documents/edl-v10.php.
 *
 *  Contributors:
 *
 *	   Axel Reichwein, Koneksys (axel.reichwein@koneksys.com)		
 *******************************************************************************************/
--%>

<%@ page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<%@ page
	import="org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog"%>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.ServiceProvider"%>
<%@ page import="org.eclipse.lyo.oslc4j.core.model.Link"%>
<%@ page import="java.net.URI"%>

<%
String requestURL = (String)request.getAttribute("requestURL");
%>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html;charset=utf-8">
<title>Integrity OSLC Adapter: Integrity RDF Vocabulary</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/simple.css">
<link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700'
	rel='stylesheet' type='text/css'>
<link rel="shortcut icon" href="<%=request.getContextPath()%>/images/100px_white-oslc-favicon.ico">


</head>
<body onload="">

	<!-- header -->
	<p id="title">Integrity OSLC Adapter: RDF Vocabulary</p>

	<!-- main content -->
	<div id="main-body">
		
		<!-- oslc logo and adapter details -->
		<a id="oslclogo" href="http://open-services.net/" target="_blank"><img
			src="<%=request.getContextPath()%>/images/oslcLg.png"></a>
		<div id="adapter-details">
			<p class="word-break">
				This document: <a href="<%= requestURL %>"> <%= requestURL %>
				</a><br> Adapter Publisher: <a class="notfancy"
					href="http://www.mbsec.gatech.edu/research/oslc" target="_blank">Georgia
					Institute of Technology OSLC Tools Project</a><br> Adapter
				Identity: org.eclipse.lyo.adapter.Integrity
			</p>
		</div>
		<br>

		<!-- resource type and name -->
		<h1><span id="metainfo">Integrity RDF Vocabulary </span></h1>
		<br>

		<div> 
		
		
		
		<xmp style="padding-left: 25px;">
<?xml version="1.0" encoding="UTF-8"?>
<rdf:RDF
	xmlns:rdf="http://www.w3.org/1999/02/22-rdf-syntax-ns#"
	xmlns:rdfs="http://www.w3.org/2000/01/rdf-schema#"
	xmlns:dcterms="http://purl.org/dc/terms/"
	xmlns:integrity="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#">
	<rdfs:Class rdf:about="integrity:Server">
		<rdfs:label xml:lang="en-GB">Server</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdfs:Class>
	<rdf:Property rdf:about="integrity:Server_project">
		<rdfs:label xml:lang="en-GB">project</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdfs:Class rdf:about="integrity:Project">
		<rdfs:label xml:lang="en-GB">Project</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdfs:Class>
	<rdf:Property rdf:about="integrity:Project_summary">
		<rdfs:label xml:lang="en-GB">summary</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Project_state">
		<rdfs:label xml:lang="en-GB">state</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Project_ID">
		<rdfs:label xml:lang="en-GB">ID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Project_modifiedBy">
		<rdfs:label xml:lang="en-GB">modifiedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Project_createdBy">
		<rdfs:label xml:lang="en-GB">createdBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Project_modifiedDate">
		<rdfs:label xml:lang="en-GB">modifiedDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Project_createdDate">
		<rdfs:label xml:lang="en-GB">createdDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Project_name">
		<rdfs:label xml:lang="en-GB">name</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Project_type">
		<rdfs:label xml:lang="en-GB">type</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Project_significantEditDate">
		<rdfs:label xml:lang="en-GB">significantEditDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Project_project">
		<rdfs:label xml:lang="en-GB">project</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Project_requirement">
		<rdfs:label xml:lang="en-GB">requirement</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Project_function">
		<rdfs:label xml:lang="en-GB">function</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Project_functionHierarchy">
		<rdfs:label xml:lang="en-GB">functionHierarchy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Project_systemElement">
		<rdfs:label xml:lang="en-GB">systemElement</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Project_systemHierarchy">
		<rdfs:label xml:lang="en-GB">systemHierarchy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdfs:Class rdf:about="integrity:Item">
		<rdfs:label xml:lang="en-GB">Item</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdfs:Class>
	<rdf:Property rdf:about="integrity:Item_ID">
		<rdfs:label xml:lang="en-GB">ID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Item_field">
		<rdfs:label xml:lang="en-GB">field</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdfs:Class rdf:about="integrity:Field">
		<rdfs:label xml:lang="en-GB">Field</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdfs:Class>
	<rdf:Property rdf:about="integrity:Field_name">
		<rdfs:label xml:lang="en-GB">name</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Field_value">
		<rdfs:label xml:lang="en-GB">value</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdfs:Class rdf:about="integrity:Requirement">
		<rdfs:label xml:lang="en-GB">Requirement</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdfs:Class>
	<rdf:Property rdf:about="integrity:Requirement_summary">
		<rdfs:label xml:lang="en-GB">summary</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_state">
		<rdfs:label xml:lang="en-GB">state</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_assignedUser">
		<rdfs:label xml:lang="en-GB">assignedUser</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_parameters">
		<rdfs:label xml:lang="en-GB">parameters</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_parameterValues">
		<rdfs:label xml:lang="en-GB">parameterValues</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_authorizingChangeRequest">
		<rdfs:label xml:lang="en-GB">authorizingChangeRequest</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_downstreamTraceCount">
		<rdfs:label xml:lang="en-GB">downstreamTraceCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_externalID">
		<rdfs:label xml:lang="en-GB">externalID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_includeReference">
		<rdfs:label xml:lang="en-GB">includeReference</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_includeSubsegmentinMetrics">
		<rdfs:label xml:lang="en-GB">includeSubsegmentinMetrics</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_name">
		<rdfs:label xml:lang="en-GB">name</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_parameterValuesFromSharedItem">
		<rdfs:label xml:lang="en-GB">parameterValuesFromSharedItem</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_priority">
		<rdfs:label xml:lang="en-GB">priority</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_rationale">
		<rdfs:label xml:lang="en-GB">rationale</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_risk">
		<rdfs:label xml:lang="en-GB">risk</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_source">
		<rdfs:label xml:lang="en-GB">source</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_suspectCount">
		<rdfs:label xml:lang="en-GB">suspectCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_text">
		<rdfs:label xml:lang="en-GB">text</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_traceStatus">
		<rdfs:label xml:lang="en-GB">traceStatus</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_upstreamTraceCount">
		<rdfs:label xml:lang="en-GB">upstreamTraceCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_validChangeRequest">
		<rdfs:label xml:lang="en-GB">validChangeRequest</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_windchillItem">
		<rdfs:label xml:lang="en-GB">windchillItem</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_projectPhase">
		<rdfs:label xml:lang="en-GB">projectPhase</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_verifiedByTraceCount">
		<rdfs:label xml:lang="en-GB">verifiedByTraceCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_verifiedByPassPercentage">
		<rdfs:label xml:lang="en-GB">verifiedByPassPercentage</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_leadReviewer">
		<rdfs:label xml:lang="en-GB">leadReviewer</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_assignedReviewers">
		<rdfs:label xml:lang="en-GB">assignedReviewers</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_assignedApprovers">
		<rdfs:label xml:lang="en-GB">assignedApprovers</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_requirementClassification">
		<rdfs:label xml:lang="en-GB">requirementClassification</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_riskRationale">
		<rdfs:label xml:lang="en-GB">riskRationale</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_reviewDueDate">
		<rdfs:label xml:lang="en-GB">reviewDueDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_reviewStatus">
		<rdfs:label xml:lang="en-GB">reviewStatus</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_vandVNecessity">
		<rdfs:label xml:lang="en-GB">vandVNecessity</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_vandVMethod">
		<rdfs:label xml:lang="en-GB">vandVMethod</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_reviewHistory">
		<rdfs:label xml:lang="en-GB">reviewHistory</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_reviewHistoryMetadata">
		<rdfs:label xml:lang="en-GB">reviewHistoryMetadata</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_iPRiskClassification">
		<rdfs:label xml:lang="en-GB">iPRiskClassification</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_backingItemVariety">
		<rdfs:label xml:lang="en-GB">backingItemVariety</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_cost">
		<rdfs:label xml:lang="en-GB">cost</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_costExplanation">
		<rdfs:label xml:lang="en-GB">costExplanation</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_keyWords">
		<rdfs:label xml:lang="en-GB">keyWords</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_difficultyExplanation">
		<rdfs:label xml:lang="en-GB">difficultyExplanation</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_decisions">
		<rdfs:label xml:lang="en-GB">decisions</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_assumptions">
		<rdfs:label xml:lang="en-GB">assumptions</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_dependency">
		<rdfs:label xml:lang="en-GB">dependency</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_assignedToGroup">
		<rdfs:label xml:lang="en-GB">assignedToGroup</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_region">
		<rdfs:label xml:lang="en-GB">region</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_referenceSource">
		<rdfs:label xml:lang="en-GB">referenceSource</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_requirementStage">
		<rdfs:label xml:lang="en-GB">requirementStage</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_difficulty">
		<rdfs:label xml:lang="en-GB">difficulty</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_reports">
		<rdfs:label xml:lang="en-GB">reports</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_enterDetails">
		<rdfs:label xml:lang="en-GB">enterDetails</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_createdByUserGroup">
		<rdfs:label xml:lang="en-GB">createdByUserGroup</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_stageTextValue">
		<rdfs:label xml:lang="en-GB">stageTextValue</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_referencetoSegmentStageTextValue">
		<rdfs:label xml:lang="en-GB">referencetoSegmentStageTextValue</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_referencetoSegmentStageNumericValue">
		<rdfs:label xml:lang="en-GB">referencetoSegmentStageNumericValue</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_stageNumericValue">
		<rdfs:label xml:lang="en-GB">stageNumericValue</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_statement">
		<rdfs:label xml:lang="en-GB">statement</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_summaryOnSharedItem">
		<rdfs:label xml:lang="en-GB">summaryOnSharedItem</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_synopsis">
		<rdfs:label xml:lang="en-GB">synopsis</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_backingItemonSegment">
		<rdfs:label xml:lang="en-GB">backingItemonSegment</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_backingItemonNode">
		<rdfs:label xml:lang="en-GB">backingItemonNode</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_enterDetailSelected">
		<rdfs:label xml:lang="en-GB">enterDetailSelected</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_voiceDocumentRequirement">
		<rdfs:label xml:lang="en-GB">voiceDocumentRequirement</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_notVoiceDocumentRequirement">
		<rdfs:label xml:lang="en-GB">notVoiceDocumentRequirement</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_topic">
		<rdfs:label xml:lang="en-GB">topic</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_collector">
		<rdfs:label xml:lang="en-GB">collector</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_occasion">
		<rdfs:label xml:lang="en-GB">occasion</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_collectionDate">
		<rdfs:label xml:lang="en-GB">collectionDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_relevantRegion">
		<rdfs:label xml:lang="en-GB">relevantRegion</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_reviewer">
		<rdfs:label xml:lang="en-GB">reviewer</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_competitor">
		<rdfs:label xml:lang="en-GB">competitor</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_kanoClassification">
		<rdfs:label xml:lang="en-GB">kanoClassification</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_relevanttoGroup">
		<rdfs:label xml:lang="en-GB">relevanttoGroup</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_productFamily">
		<rdfs:label xml:lang="en-GB">productFamily</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_code">
		<rdfs:label xml:lang="en-GB">code</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_nodeStageValue">
		<rdfs:label xml:lang="en-GB">nodeStageValue</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_nodeStageText">
		<rdfs:label xml:lang="en-GB">nodeStageText</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_synopsis:">
		<rdfs:label xml:lang="en-GB">synopsis:</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_referencetoBackingItemonSegment">
		<rdfs:label xml:lang="en-GB">referencetoBackingItemonSegment</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_referencetoNodeStageValue">
		<rdfs:label xml:lang="en-GB">referencetoNodeStageValue</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_referencetoNodeStageText">
		<rdfs:label xml:lang="en-GB">referencetoNodeStageText</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_doNotEnterDetailsYet">
		<rdfs:label xml:lang="en-GB">doNotEnterDetailsYet</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_minorVersionID">
		<rdfs:label xml:lang="en-GB">minorVersionID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_majorVersionID">
		<rdfs:label xml:lang="en-GB">majorVersionID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_liveItemID">
		<rdfs:label xml:lang="en-GB">liveItemID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_bookmarks">
		<rdfs:label xml:lang="en-GB">bookmarks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_signatureComment">
		<rdfs:label xml:lang="en-GB">signatureComment</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_signedBy">
		<rdfs:label xml:lang="en-GB">signedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_iD">
		<rdfs:label xml:lang="en-GB">iD</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_modifiedBy">
		<rdfs:label xml:lang="en-GB">modifiedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_createdBy">
		<rdfs:label xml:lang="en-GB">createdBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_modifiedDate">
		<rdfs:label xml:lang="en-GB">modifiedDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_createdDate">
		<rdfs:label xml:lang="en-GB">createdDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_category">
		<rdfs:label xml:lang="en-GB">category</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_referenceMode">
		<rdfs:label xml:lang="en-GB">referenceMode</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_documentID">
		<rdfs:label xml:lang="en-GB">documentID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_subsegmentName">
		<rdfs:label xml:lang="en-GB">subsegmentName</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_referencedItemType">
		<rdfs:label xml:lang="en-GB">referencedItemType</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_rootID">
		<rdfs:label xml:lang="en-GB">rootID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_referencedBookmarks">
		<rdfs:label xml:lang="en-GB">referencedBookmarks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_inputRevisionDate">
		<rdfs:label xml:lang="en-GB">inputRevisionDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_significantEditDate">
		<rdfs:label xml:lang="en-GB">significantEditDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_itemSignificantEditDateonSharedItem">
		<rdfs:label xml:lang="en-GB">itemSignificantEditDateonSharedItem</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_revision">
		<rdfs:label xml:lang="en-GB">revision</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_revisionIncrementDate">
		<rdfs:label xml:lang="en-GB">revisionIncrementDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_significantChangeSinceItemRevision">
		<rdfs:label xml:lang="en-GB">significantChangeSinceItemRevision</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_assignedGroup">
		<rdfs:label xml:lang="en-GB">assignedGroup</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_project">
		<rdfs:label xml:lang="en-GB">project</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_attachments">
		<rdfs:label xml:lang="en-GB">attachments</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_changesAuthorizedBy">
		<rdfs:label xml:lang="en-GB">changesAuthorizedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_isRelatedTo">
		<rdfs:label xml:lang="en-GB">isRelatedTo</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_relatedTo">
		<rdfs:label xml:lang="en-GB">relatedTo</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_satisfiedBy">
		<rdfs:label xml:lang="en-GB">satisfiedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_satisfies">
		<rdfs:label xml:lang="en-GB">satisfies</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_spawns">
		<rdfs:label xml:lang="en-GB">spawns</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_textAttachments">
		<rdfs:label xml:lang="en-GB">textAttachments</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_verifiedBy">
		<rdfs:label xml:lang="en-GB">verifiedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_reviewTasks">
		<rdfs:label xml:lang="en-GB">reviewTasks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_itemReviewSessions">
		<rdfs:label xml:lang="en-GB">itemReviewSessions</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_documentReviewTasks">
		<rdfs:label xml:lang="en-GB">documentReviewTasks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_functionalAllocation">
		<rdfs:label xml:lang="en-GB">functionalAllocation</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_systemAllocation">
		<rdfs:label xml:lang="en-GB">systemAllocation</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_derives">
		<rdfs:label xml:lang="en-GB">derives</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_requires">
		<rdfs:label xml:lang="en-GB">requires</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_constrains">
		<rdfs:label xml:lang="en-GB">constrains</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_connects">
		<rdfs:label xml:lang="en-GB">connects</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_flowsTo">
		<rdfs:label xml:lang="en-GB">flowsTo</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_derivedFrom">
		<rdfs:label xml:lang="en-GB">derivedFrom</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_requiredBy">
		<rdfs:label xml:lang="en-GB">requiredBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_satisfiedBy">
		<rdfs:label xml:lang="en-GB">satisfiedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_constrainedTo">
		<rdfs:label xml:lang="en-GB">constrainedTo</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_connectedTo">
		<rdfs:label xml:lang="en-GB">connectedTo</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_flowsFrom">
		<rdfs:label xml:lang="en-GB">flowsFrom</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_type">
		<rdfs:label xml:lang="en-GB">type</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_references">
		<rdfs:label xml:lang="en-GB">references</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_contains">
		<rdfs:label xml:lang="en-GB">contains</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_containedBy">
		<rdfs:label xml:lang="en-GB">containedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_shares">
		<rdfs:label xml:lang="en-GB">shares</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Requirement_sharedBy">
		<rdfs:label xml:lang="en-GB">sharedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdfs:Class rdf:about="integrity:Function">
		<rdfs:label xml:lang="en-GB">Function</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdfs:Class>
	<rdf:Property rdf:about="integrity:Function_summary">
		<rdfs:label xml:lang="en-GB">summary</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_state">
		<rdfs:label xml:lang="en-GB">state</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_assignedUser">
		<rdfs:label xml:lang="en-GB">assignedUser</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_parameters">
		<rdfs:label xml:lang="en-GB">parameters</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_parameterValues">
		<rdfs:label xml:lang="en-GB">parameterValues</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_authorizingChangeRequest">
		<rdfs:label xml:lang="en-GB">authorizingChangeRequest</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_description">
		<rdfs:label xml:lang="en-GB">description</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_downstreamTraceCount">
		<rdfs:label xml:lang="en-GB">downstreamTraceCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_externalID">
		<rdfs:label xml:lang="en-GB">externalID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_includeReference">
		<rdfs:label xml:lang="en-GB">includeReference</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_includeSubsegmentinMetrics">
		<rdfs:label xml:lang="en-GB">includeSubsegmentinMetrics</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_name">
		<rdfs:label xml:lang="en-GB">name</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_parameterValuesFromSharedItem">
		<rdfs:label xml:lang="en-GB">parameterValuesFromSharedItem</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_priority">
		<rdfs:label xml:lang="en-GB">priority</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_rationale">
		<rdfs:label xml:lang="en-GB">rationale</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_risk">
		<rdfs:label xml:lang="en-GB">risk</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_source">
		<rdfs:label xml:lang="en-GB">source</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_suspectCount">
		<rdfs:label xml:lang="en-GB">suspectCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_text">
		<rdfs:label xml:lang="en-GB">text</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_traceStatus">
		<rdfs:label xml:lang="en-GB">traceStatus</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_upstreamTraceCount">
		<rdfs:label xml:lang="en-GB">upstreamTraceCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_validChangeRequest">
		<rdfs:label xml:lang="en-GB">validChangeRequest</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_windchillItem">
		<rdfs:label xml:lang="en-GB">windchillItem</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_projectPhase">
		<rdfs:label xml:lang="en-GB">projectPhase</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_verifiedByTraceCount">
		<rdfs:label xml:lang="en-GB">verifiedByTraceCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_verifiedByPassPercentage">
		<rdfs:label xml:lang="en-GB">verifiedByPassPercentage</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_leadReviewer">
		<rdfs:label xml:lang="en-GB">leadReviewer</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_assignedReviewers">
		<rdfs:label xml:lang="en-GB">assignedReviewers</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_assignedApprovers">
		<rdfs:label xml:lang="en-GB">assignedApprovers</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_requirementClassification">
		<rdfs:label xml:lang="en-GB">requirementClassification</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_riskRationale">
		<rdfs:label xml:lang="en-GB">riskRationale</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_reviewDueDate">
		<rdfs:label xml:lang="en-GB">reviewDueDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_reviewStatus">
		<rdfs:label xml:lang="en-GB">reviewStatus</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_vandVNecessity">
		<rdfs:label xml:lang="en-GB">vandVNecessity</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_vandVMethod">
		<rdfs:label xml:lang="en-GB">vandVMethod</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_reviewHistory">
		<rdfs:label xml:lang="en-GB">reviewHistory</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_reviewHistoryMetadata">
		<rdfs:label xml:lang="en-GB">reviewHistoryMetadata</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_iPRiskClassification">
		<rdfs:label xml:lang="en-GB">iPRiskClassification</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_backingItemVariety">
		<rdfs:label xml:lang="en-GB">backingItemVariety</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_keyWords">
		<rdfs:label xml:lang="en-GB">keyWords</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_assignedToGroup">
		<rdfs:label xml:lang="en-GB">assignedToGroup</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_referenceSource">
		<rdfs:label xml:lang="en-GB">referenceSource</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_reports">
		<rdfs:label xml:lang="en-GB">reports</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_doNotUseLogicalField">
		<rdfs:label xml:lang="en-GB">doNotUseLogicalField</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_enterDetails">
		<rdfs:label xml:lang="en-GB">enterDetails</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_createdByUserGroup">
		<rdfs:label xml:lang="en-GB">createdByUserGroup</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_summaryfieldofthecontainingdocument">
		<rdfs:label xml:lang="en-GB">summaryfieldofthecontainingdocument</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_headline">
		<rdfs:label xml:lang="en-GB">headline</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_description:">
		<rdfs:label xml:lang="en-GB">description:</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_summaryOnSharedItem">
		<rdfs:label xml:lang="en-GB">summaryOnSharedItem</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_synopsis">
		<rdfs:label xml:lang="en-GB">synopsis</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_backingItemonSegment">
		<rdfs:label xml:lang="en-GB">backingItemonSegment</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_backingItemonNode">
		<rdfs:label xml:lang="en-GB">backingItemonNode</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_backingItemProjectAssignement">
		<rdfs:label xml:lang="en-GB">backingItemProjectAssignement</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_nodeConfiguration">
		<rdfs:label xml:lang="en-GB">nodeConfiguration</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_enterDetailSelected">
		<rdfs:label xml:lang="en-GB">enterDetailSelected</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_reportsareCritical">
		<rdfs:label xml:lang="en-GB">reportsareCritical</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_typeofFunction">
		<rdfs:label xml:lang="en-GB">typeofFunction</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_synopsis:">
		<rdfs:label xml:lang="en-GB">synopsis:</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_referencetoBackingItemonSegment">
		<rdfs:label xml:lang="en-GB">referencetoBackingItemonSegment</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_referencetoSegmentConfiguration">
		<rdfs:label xml:lang="en-GB">referencetoSegmentConfiguration</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_minorVersionID">
		<rdfs:label xml:lang="en-GB">minorVersionID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_majorVersionID">
		<rdfs:label xml:lang="en-GB">majorVersionID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_liveItemID">
		<rdfs:label xml:lang="en-GB">liveItemID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_bookmarks">
		<rdfs:label xml:lang="en-GB">bookmarks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_signatureComment">
		<rdfs:label xml:lang="en-GB">signatureComment</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_signedBy">
		<rdfs:label xml:lang="en-GB">signedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_iD">
		<rdfs:label xml:lang="en-GB">iD</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_modifiedBy">
		<rdfs:label xml:lang="en-GB">modifiedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_createdBy">
		<rdfs:label xml:lang="en-GB">createdBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_modifiedDate">
		<rdfs:label xml:lang="en-GB">modifiedDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_createdDate">
		<rdfs:label xml:lang="en-GB">createdDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_category">
		<rdfs:label xml:lang="en-GB">category</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_referenceMode">
		<rdfs:label xml:lang="en-GB">referenceMode</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_documentID">
		<rdfs:label xml:lang="en-GB">documentID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_subsegmentName">
		<rdfs:label xml:lang="en-GB">subsegmentName</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_referencedItemType">
		<rdfs:label xml:lang="en-GB">referencedItemType</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_rootID">
		<rdfs:label xml:lang="en-GB">rootID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_referencedBookmarks">
		<rdfs:label xml:lang="en-GB">referencedBookmarks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_inputRevisionDate">
		<rdfs:label xml:lang="en-GB">inputRevisionDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_significantEditDate">
		<rdfs:label xml:lang="en-GB">significantEditDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_itemSignificantEditDateonSharedItem">
		<rdfs:label xml:lang="en-GB">itemSignificantEditDateonSharedItem</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_revision">
		<rdfs:label xml:lang="en-GB">revision</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_revisionIncrementDate">
		<rdfs:label xml:lang="en-GB">revisionIncrementDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_significantChangeSinceItemRevision">
		<rdfs:label xml:lang="en-GB">significantChangeSinceItemRevision</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_project">
		<rdfs:label xml:lang="en-GB">project</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_attachments">
		<rdfs:label xml:lang="en-GB">attachments</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_changesAuthorizedBy">
		<rdfs:label xml:lang="en-GB">changesAuthorizedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_isRelatedTo">
		<rdfs:label xml:lang="en-GB">isRelatedTo</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_relatedTo">
		<rdfs:label xml:lang="en-GB">relatedTo</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_satisfiedBy">
		<rdfs:label xml:lang="en-GB">satisfiedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_satisfies">
		<rdfs:label xml:lang="en-GB">satisfies</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_spawns">
		<rdfs:label xml:lang="en-GB">spawns</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_textAttachments">
		<rdfs:label xml:lang="en-GB">textAttachments</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_verifiedBy">
		<rdfs:label xml:lang="en-GB">verifiedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_reviewTasks">
		<rdfs:label xml:lang="en-GB">reviewTasks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_itemReviewSessions">
		<rdfs:label xml:lang="en-GB">itemReviewSessions</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_documentReviewTasks">
		<rdfs:label xml:lang="en-GB">documentReviewTasks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_functionalAllocation">
		<rdfs:label xml:lang="en-GB">functionalAllocation</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_systemAllocation">
		<rdfs:label xml:lang="en-GB">systemAllocation</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_derives">
		<rdfs:label xml:lang="en-GB">derives</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_allocates">
		<rdfs:label xml:lang="en-GB">allocates</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_requires">
		<rdfs:label xml:lang="en-GB">requires</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_derivedFrom">
		<rdfs:label xml:lang="en-GB">derivedFrom</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_requiredBy">
		<rdfs:label xml:lang="en-GB">requiredBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_depends">
		<rdfs:label xml:lang="en-GB">depends</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_dependentOn">
		<rdfs:label xml:lang="en-GB">dependentOn</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_type">
		<rdfs:label xml:lang="en-GB">type</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_references">
		<rdfs:label xml:lang="en-GB">references</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_contains">
		<rdfs:label xml:lang="en-GB">contains</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_containedBy">
		<rdfs:label xml:lang="en-GB">containedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_shares">
		<rdfs:label xml:lang="en-GB">shares</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:Function_sharedBy">
		<rdfs:label xml:lang="en-GB">sharedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdfs:Class rdf:about="integrity:FunctionHierarchy">
		<rdfs:label xml:lang="en-GB">FunctionHierarchy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdfs:Class>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_summary">
		<rdfs:label xml:lang="en-GB">summary</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_state">
		<rdfs:label xml:lang="en-GB">state</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_assignedUser">
		<rdfs:label xml:lang="en-GB">assignedUser</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_parameters">
		<rdfs:label xml:lang="en-GB">parameters</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_parameterValues">
		<rdfs:label xml:lang="en-GB">parameterValues</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_sharedName">
		<rdfs:label xml:lang="en-GB">sharedName</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_sharedText">
		<rdfs:label xml:lang="en-GB">sharedText</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_allContentCount">
		<rdfs:label xml:lang="en-GB">allContentCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_allowEdits">
		<rdfs:label xml:lang="en-GB">allowEdits</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_allowTraces">
		<rdfs:label xml:lang="en-GB">allowTraces</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_authorizingChangeRequest">
		<rdfs:label xml:lang="en-GB">authorizingChangeRequest</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_closedChangeRequestsCount">
		<rdfs:label xml:lang="en-GB">closedChangeRequestsCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_missingUpstreamTraceCount">
		<rdfs:label xml:lang="en-GB">missingUpstreamTraceCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_missingDownstreamTraceCount">
		<rdfs:label xml:lang="en-GB">missingDownstreamTraceCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_description">
		<rdfs:label xml:lang="en-GB">description</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_documentPhase">
		<rdfs:label xml:lang="en-GB">documentPhase</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_integrationDetails">
		<rdfs:label xml:lang="en-GB">integrationDetails</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_integrationStatus">
		<rdfs:label xml:lang="en-GB">integrationStatus</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_locationinWindchill">
		<rdfs:label xml:lang="en-GB">locationinWindchill</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_meaningfulContentCount">
		<rdfs:label xml:lang="en-GB">meaningfulContentCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_openChangeRequestsCount">
		<rdfs:label xml:lang="en-GB">openChangeRequestsCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_pendingChangeRequestsCount">
		<rdfs:label xml:lang="en-GB">pendingChangeRequestsCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_metricsLastComputed">
		<rdfs:label xml:lang="en-GB">metricsLastComputed</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_rootDocument">
		<rdfs:label xml:lang="en-GB">rootDocument</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_selectWindchillLocation">
		<rdfs:label xml:lang="en-GB">selectWindchillLocation</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_sendtoWindchill">
		<rdfs:label xml:lang="en-GB">sendtoWindchill</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_suspectContentCount">
		<rdfs:label xml:lang="en-GB">suspectContentCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_suspectContentPercentage">
		<rdfs:label xml:lang="en-GB">suspectContentPercentage</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_useHierarchicalEditability">
		<rdfs:label xml:lang="en-GB">useHierarchicalEditability</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_validChangeRequest">
		<rdfs:label xml:lang="en-GB">validChangeRequest</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_windchillItem">
		<rdfs:label xml:lang="en-GB">windchillItem</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_windchillLocation">
		<rdfs:label xml:lang="en-GB">windchillLocation</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_windchillTransferProgress">
		<rdfs:label xml:lang="en-GB">windchillTransferProgress</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_projectPhase">
		<rdfs:label xml:lang="en-GB">projectPhase</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_leadReviewer">
		<rdfs:label xml:lang="en-GB">leadReviewer</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_assignedReviewers">
		<rdfs:label xml:lang="en-GB">assignedReviewers</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_assignedApprovers">
		<rdfs:label xml:lang="en-GB">assignedApprovers</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_reviewDueDate">
		<rdfs:label xml:lang="en-GB">reviewDueDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_reviewStatus">
		<rdfs:label xml:lang="en-GB">reviewStatus</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_automaticRequirementApprovalAllowed">
		<rdfs:label xml:lang="en-GB">automaticRequirementApprovalAllowed</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_reviewHistory">
		<rdfs:label xml:lang="en-GB">reviewHistory</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_approvalHistory">
		<rdfs:label xml:lang="en-GB">approvalHistory</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_reviewHistoryMetadata">
		<rdfs:label xml:lang="en-GB">reviewHistoryMetadata</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_iPRiskClassification">
		<rdfs:label xml:lang="en-GB">iPRiskClassification</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_synopsis">
		<rdfs:label xml:lang="en-GB">synopsis</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_sharedSynopsis">
		<rdfs:label xml:lang="en-GB">sharedSynopsis</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_backingItemonSegment">
		<rdfs:label xml:lang="en-GB">backingItemonSegment</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_segmentConfiguration">
		<rdfs:label xml:lang="en-GB">segmentConfiguration</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_referencetoBackingItemonProject">
		<rdfs:label xml:lang="en-GB">referencetoBackingItemonProject</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_referencetoProjectConfiguration">
		<rdfs:label xml:lang="en-GB">referencetoProjectConfiguration</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_minorVersionID">
		<rdfs:label xml:lang="en-GB">minorVersionID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_majorVersionID">
		<rdfs:label xml:lang="en-GB">majorVersionID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_liveItemID">
		<rdfs:label xml:lang="en-GB">liveItemID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_bookmarks">
		<rdfs:label xml:lang="en-GB">bookmarks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_signatureComment">
		<rdfs:label xml:lang="en-GB">signatureComment</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_signedBy">
		<rdfs:label xml:lang="en-GB">signedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_iD">
		<rdfs:label xml:lang="en-GB">iD</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_modifiedBy">
		<rdfs:label xml:lang="en-GB">modifiedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_createdBy">
		<rdfs:label xml:lang="en-GB">createdBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_modifiedDate">
		<rdfs:label xml:lang="en-GB">modifiedDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_createdDate">
		<rdfs:label xml:lang="en-GB">createdDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_sharedCategory">
		<rdfs:label xml:lang="en-GB">sharedCategory</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_rootID">
		<rdfs:label xml:lang="en-GB">rootID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_inputRevisionDate">
		<rdfs:label xml:lang="en-GB">inputRevisionDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_significantEditDate">
		<rdfs:label xml:lang="en-GB">significantEditDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_revision">
		<rdfs:label xml:lang="en-GB">revision</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_revisionIncrementDate">
		<rdfs:label xml:lang="en-GB">revisionIncrementDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_significantChangeSinceItemRevision">
		<rdfs:label xml:lang="en-GB">significantChangeSinceItemRevision</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_project">
		<rdfs:label xml:lang="en-GB">project</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_attachments">
		<rdfs:label xml:lang="en-GB">attachments</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_sharedAttachments">
		<rdfs:label xml:lang="en-GB">sharedAttachments</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_changesAuthorizedBy">
		<rdfs:label xml:lang="en-GB">changesAuthorizedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_documents">
		<rdfs:label xml:lang="en-GB">documents</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_spawns">
		<rdfs:label xml:lang="en-GB">spawns</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_reviewTasks">
		<rdfs:label xml:lang="en-GB">reviewTasks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_itemReviewSessions">
		<rdfs:label xml:lang="en-GB">itemReviewSessions</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_type">
		<rdfs:label xml:lang="en-GB">type</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_contains">
		<rdfs:label xml:lang="en-GB">contains</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:FunctionHierarchy_referencedBy">
		<rdfs:label xml:lang="en-GB">referencedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdfs:Class rdf:about="integrity:SystemElement">
		<rdfs:label xml:lang="en-GB">SystemElement</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdfs:Class>
	<rdf:Property rdf:about="integrity:SystemElement_summary">
		<rdfs:label xml:lang="en-GB">summary</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_state">
		<rdfs:label xml:lang="en-GB">state</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_assignedUser">
		<rdfs:label xml:lang="en-GB">assignedUser</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_parameters">
		<rdfs:label xml:lang="en-GB">parameters</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_parameterValues">
		<rdfs:label xml:lang="en-GB">parameterValues</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_authorizingChangeRequest">
		<rdfs:label xml:lang="en-GB">authorizingChangeRequest</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_description">
		<rdfs:label xml:lang="en-GB">description</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_downstreamTraceCount">
		<rdfs:label xml:lang="en-GB">downstreamTraceCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_externalID">
		<rdfs:label xml:lang="en-GB">externalID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_includeReference">
		<rdfs:label xml:lang="en-GB">includeReference</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_includeSubsegmentinMetrics">
		<rdfs:label xml:lang="en-GB">includeSubsegmentinMetrics</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_name">
		<rdfs:label xml:lang="en-GB">name</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_parameterValuesFromSharedItem">
		<rdfs:label xml:lang="en-GB">parameterValuesFromSharedItem</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_priority">
		<rdfs:label xml:lang="en-GB">priority</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_rationale">
		<rdfs:label xml:lang="en-GB">rationale</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_risk">
		<rdfs:label xml:lang="en-GB">risk</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_source">
		<rdfs:label xml:lang="en-GB">source</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_suspectCount">
		<rdfs:label xml:lang="en-GB">suspectCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_text">
		<rdfs:label xml:lang="en-GB">text</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_traceStatus">
		<rdfs:label xml:lang="en-GB">traceStatus</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_upstreamTraceCount">
		<rdfs:label xml:lang="en-GB">upstreamTraceCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_validChangeRequest">
		<rdfs:label xml:lang="en-GB">validChangeRequest</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_windchillItem">
		<rdfs:label xml:lang="en-GB">windchillItem</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_projectPhase">
		<rdfs:label xml:lang="en-GB">projectPhase</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_verifiedByTraceCount">
		<rdfs:label xml:lang="en-GB">verifiedByTraceCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_verifiedByPassPercentage">
		<rdfs:label xml:lang="en-GB">verifiedByPassPercentage</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_leadReviewer">
		<rdfs:label xml:lang="en-GB">leadReviewer</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_assignedReviewers">
		<rdfs:label xml:lang="en-GB">assignedReviewers</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_assignedApprovers">
		<rdfs:label xml:lang="en-GB">assignedApprovers</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_requirementClassification">
		<rdfs:label xml:lang="en-GB">requirementClassification</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_riskRationale">
		<rdfs:label xml:lang="en-GB">riskRationale</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_reviewDueDate">
		<rdfs:label xml:lang="en-GB">reviewDueDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_reviewStatus">
		<rdfs:label xml:lang="en-GB">reviewStatus</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_vandVNecessity">
		<rdfs:label xml:lang="en-GB">vandVNecessity</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_vandVMethod">
		<rdfs:label xml:lang="en-GB">vandVMethod</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_reviewHistory">
		<rdfs:label xml:lang="en-GB">reviewHistory</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_reviewHistoryMetadata">
		<rdfs:label xml:lang="en-GB">reviewHistoryMetadata</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_iPRiskClassification">
		<rdfs:label xml:lang="en-GB">iPRiskClassification</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_keyWords">
		<rdfs:label xml:lang="en-GB">keyWords</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_assignedToGroup">
		<rdfs:label xml:lang="en-GB">assignedToGroup</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_reports">
		<rdfs:label xml:lang="en-GB">reports</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_enterDetails">
		<rdfs:label xml:lang="en-GB">enterDetails</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_createdByUserGroup">
		<rdfs:label xml:lang="en-GB">createdByUserGroup</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_summaryfieldofthecontainingdocument">
		<rdfs:label xml:lang="en-GB">summaryfieldofthecontainingdocument</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_statement">
		<rdfs:label xml:lang="en-GB">statement</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_description:">
		<rdfs:label xml:lang="en-GB">description:</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_summaryOnSharedItem">
		<rdfs:label xml:lang="en-GB">summaryOnSharedItem</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_synopsis">
		<rdfs:label xml:lang="en-GB">synopsis</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_backingItemonSegment">
		<rdfs:label xml:lang="en-GB">backingItemonSegment</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_backingItemonNode">
		<rdfs:label xml:lang="en-GB">backingItemonNode</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_enterDetailSelected">
		<rdfs:label xml:lang="en-GB">enterDetailSelected</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_systemLevel">
		<rdfs:label xml:lang="en-GB">systemLevel</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_modularity">
		<rdfs:label xml:lang="en-GB">modularity</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_standardPart">
		<rdfs:label xml:lang="en-GB">standardPart</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_synopsis:">
		<rdfs:label xml:lang="en-GB">synopsis:</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_referencetoBackingItemonSegment">
		<rdfs:label xml:lang="en-GB">referencetoBackingItemonSegment</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_minorVersionID">
		<rdfs:label xml:lang="en-GB">minorVersionID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_majorVersionID">
		<rdfs:label xml:lang="en-GB">majorVersionID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_liveItemID">
		<rdfs:label xml:lang="en-GB">liveItemID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_bookmarks">
		<rdfs:label xml:lang="en-GB">bookmarks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_signatureComment">
		<rdfs:label xml:lang="en-GB">signatureComment</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_signedBy">
		<rdfs:label xml:lang="en-GB">signedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_iD">
		<rdfs:label xml:lang="en-GB">iD</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_modifiedBy">
		<rdfs:label xml:lang="en-GB">modifiedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_createdBy">
		<rdfs:label xml:lang="en-GB">createdBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_modifiedDate">
		<rdfs:label xml:lang="en-GB">modifiedDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_createdDate">
		<rdfs:label xml:lang="en-GB">createdDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_category">
		<rdfs:label xml:lang="en-GB">category</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_referenceMode">
		<rdfs:label xml:lang="en-GB">referenceMode</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_documentID">
		<rdfs:label xml:lang="en-GB">documentID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_subsegmentName">
		<rdfs:label xml:lang="en-GB">subsegmentName</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_referencedItemType">
		<rdfs:label xml:lang="en-GB">referencedItemType</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_rootID">
		<rdfs:label xml:lang="en-GB">rootID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_referencedBookmarks">
		<rdfs:label xml:lang="en-GB">referencedBookmarks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_inputRevisionDate">
		<rdfs:label xml:lang="en-GB">inputRevisionDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_significantEditDate">
		<rdfs:label xml:lang="en-GB">significantEditDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_itemSignificantEditDateonSharedItem">
		<rdfs:label xml:lang="en-GB">itemSignificantEditDateonSharedItem</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_revision">
		<rdfs:label xml:lang="en-GB">revision</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_revisionIncrementDate">
		<rdfs:label xml:lang="en-GB">revisionIncrementDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_significantChangeSinceItemRevision">
		<rdfs:label xml:lang="en-GB">significantChangeSinceItemRevision</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_project">
		<rdfs:label xml:lang="en-GB">project</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_attachments">
		<rdfs:label xml:lang="en-GB">attachments</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_changesAuthorizedBy">
		<rdfs:label xml:lang="en-GB">changesAuthorizedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_isRelatedTo">
		<rdfs:label xml:lang="en-GB">isRelatedTo</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_relatedTo">
		<rdfs:label xml:lang="en-GB">relatedTo</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_satisfiedBy">
		<rdfs:label xml:lang="en-GB">satisfiedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_satisfies">
		<rdfs:label xml:lang="en-GB">satisfies</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_spawns">
		<rdfs:label xml:lang="en-GB">spawns</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_textAttachments">
		<rdfs:label xml:lang="en-GB">textAttachments</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_verifiedBy">
		<rdfs:label xml:lang="en-GB">verifiedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_reviewTasks">
		<rdfs:label xml:lang="en-GB">reviewTasks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_itemReviewSessions">
		<rdfs:label xml:lang="en-GB">itemReviewSessions</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_documentReviewTasks">
		<rdfs:label xml:lang="en-GB">documentReviewTasks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_functionalAllocation">
		<rdfs:label xml:lang="en-GB">functionalAllocation</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_systemAllocation">
		<rdfs:label xml:lang="en-GB">systemAllocation</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_derives">
		<rdfs:label xml:lang="en-GB">derives</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement__Satisfies">
		<rdfs:label xml:lang="en-GB">_Satisfies</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_derivedFrom">
		<rdfs:label xml:lang="en-GB">derivedFrom</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_allocatedTo">
		<rdfs:label xml:lang="en-GB">allocatedTo</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_requiredBy">
		<rdfs:label xml:lang="en-GB">requiredBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_comprises">
		<rdfs:label xml:lang="en-GB">comprises</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_varies">
		<rdfs:label xml:lang="en-GB">varies</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_interacts">
		<rdfs:label xml:lang="en-GB">interacts</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_partOf">
		<rdfs:label xml:lang="en-GB">partOf</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_variesWith">
		<rdfs:label xml:lang="en-GB">variesWith</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_interactWith">
		<rdfs:label xml:lang="en-GB">interactWith</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_type">
		<rdfs:label xml:lang="en-GB">type</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_references">
		<rdfs:label xml:lang="en-GB">references</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_contains">
		<rdfs:label xml:lang="en-GB">contains</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_containedBy">
		<rdfs:label xml:lang="en-GB">containedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_shares">
		<rdfs:label xml:lang="en-GB">shares</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemElement_sharedBy">
		<rdfs:label xml:lang="en-GB">sharedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdfs:Class rdf:about="integrity:SystemHierarchy">
		<rdfs:label xml:lang="en-GB">SystemHierarchy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdfs:Class>
	<rdf:Property rdf:about="integrity:SystemHierarchy_summary">
		<rdfs:label xml:lang="en-GB">summary</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_state">
		<rdfs:label xml:lang="en-GB">state</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_assignedUser">
		<rdfs:label xml:lang="en-GB">assignedUser</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_parameters">
		<rdfs:label xml:lang="en-GB">parameters</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_parameterValues">
		<rdfs:label xml:lang="en-GB">parameterValues</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_sharedName">
		<rdfs:label xml:lang="en-GB">sharedName</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_sharedText">
		<rdfs:label xml:lang="en-GB">sharedText</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_allContentCount">
		<rdfs:label xml:lang="en-GB">allContentCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_allowEdits">
		<rdfs:label xml:lang="en-GB">allowEdits</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_allowTraces">
		<rdfs:label xml:lang="en-GB">allowTraces</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_authorizingChangeRequest">
		<rdfs:label xml:lang="en-GB">authorizingChangeRequest</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_closedChangeRequestsCount">
		<rdfs:label xml:lang="en-GB">closedChangeRequestsCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_missingUpstreamTraceCount">
		<rdfs:label xml:lang="en-GB">missingUpstreamTraceCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_missingDownstreamTraceCount">
		<rdfs:label xml:lang="en-GB">missingDownstreamTraceCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_description">
		<rdfs:label xml:lang="en-GB">description</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_documentPhase">
		<rdfs:label xml:lang="en-GB">documentPhase</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_integrationDetails">
		<rdfs:label xml:lang="en-GB">integrationDetails</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_integrationStatus">
		<rdfs:label xml:lang="en-GB">integrationStatus</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_locationinWindchill">
		<rdfs:label xml:lang="en-GB">locationinWindchill</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_meaningfulContentCount">
		<rdfs:label xml:lang="en-GB">meaningfulContentCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_openChangeRequestsCount">
		<rdfs:label xml:lang="en-GB">openChangeRequestsCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_pendingChangeRequestsCount">
		<rdfs:label xml:lang="en-GB">pendingChangeRequestsCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_metricsLastComputed">
		<rdfs:label xml:lang="en-GB">metricsLastComputed</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_rootDocument">
		<rdfs:label xml:lang="en-GB">rootDocument</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_selectWindchillLocation">
		<rdfs:label xml:lang="en-GB">selectWindchillLocation</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_sendtoWindchill">
		<rdfs:label xml:lang="en-GB">sendtoWindchill</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_suspectContentCount">
		<rdfs:label xml:lang="en-GB">suspectContentCount</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_suspectContentPercentage">
		<rdfs:label xml:lang="en-GB">suspectContentPercentage</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_useHierarchicalEditability">
		<rdfs:label xml:lang="en-GB">useHierarchicalEditability</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_validChangeRequest">
		<rdfs:label xml:lang="en-GB">validChangeRequest</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_windchillItem">
		<rdfs:label xml:lang="en-GB">windchillItem</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_windchillLocation">
		<rdfs:label xml:lang="en-GB">windchillLocation</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_windchillTransferProgress">
		<rdfs:label xml:lang="en-GB">windchillTransferProgress</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_projectPhase">
		<rdfs:label xml:lang="en-GB">projectPhase</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_leadReviewer">
		<rdfs:label xml:lang="en-GB">leadReviewer</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_assignedReviewers">
		<rdfs:label xml:lang="en-GB">assignedReviewers</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_assignedApprovers">
		<rdfs:label xml:lang="en-GB">assignedApprovers</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_reviewDueDate">
		<rdfs:label xml:lang="en-GB">reviewDueDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_reviewStatus">
		<rdfs:label xml:lang="en-GB">reviewStatus</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_automaticRequirementApprovalAllowed">
		<rdfs:label xml:lang="en-GB">automaticRequirementApprovalAllowed</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_reviewHistory">
		<rdfs:label xml:lang="en-GB">reviewHistory</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_approvalHistory">
		<rdfs:label xml:lang="en-GB">approvalHistory</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_reviewHistoryMetadata">
		<rdfs:label xml:lang="en-GB">reviewHistoryMetadata</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_iPRiskClassification">
		<rdfs:label xml:lang="en-GB">iPRiskClassification</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_synopsis">
		<rdfs:label xml:lang="en-GB">synopsis</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_sharedSynopsis">
		<rdfs:label xml:lang="en-GB">sharedSynopsis</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_backingItemonSegment">
		<rdfs:label xml:lang="en-GB">backingItemonSegment</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_referencetoBackingItemonProject">
		<rdfs:label xml:lang="en-GB">referencetoBackingItemonProject</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_minorVersionID">
		<rdfs:label xml:lang="en-GB">minorVersionID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_majorVersionID">
		<rdfs:label xml:lang="en-GB">majorVersionID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_liveItemID">
		<rdfs:label xml:lang="en-GB">liveItemID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_bookmarks">
		<rdfs:label xml:lang="en-GB">bookmarks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_signatureComment">
		<rdfs:label xml:lang="en-GB">signatureComment</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_signedBy">
		<rdfs:label xml:lang="en-GB">signedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_iD">
		<rdfs:label xml:lang="en-GB">iD</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_modifiedBy">
		<rdfs:label xml:lang="en-GB">modifiedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_createdBy">
		<rdfs:label xml:lang="en-GB">createdBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_modifiedDate">
		<rdfs:label xml:lang="en-GB">modifiedDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_createdDate">
		<rdfs:label xml:lang="en-GB">createdDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_sharedCategory">
		<rdfs:label xml:lang="en-GB">sharedCategory</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_rootID">
		<rdfs:label xml:lang="en-GB">rootID</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_inputRevisionDate">
		<rdfs:label xml:lang="en-GB">inputRevisionDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_significantEditDate">
		<rdfs:label xml:lang="en-GB">significantEditDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_revision">
		<rdfs:label xml:lang="en-GB">revision</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_revisionIncrementDate">
		<rdfs:label xml:lang="en-GB">revisionIncrementDate</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_significantChangeSinceItemRevision">
		<rdfs:label xml:lang="en-GB">significantChangeSinceItemRevision</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_project">
		<rdfs:label xml:lang="en-GB">project</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_attachments">
		<rdfs:label xml:lang="en-GB">attachments</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_sharedAttachments">
		<rdfs:label xml:lang="en-GB">sharedAttachments</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_changesAuthorizedBy">
		<rdfs:label xml:lang="en-GB">changesAuthorizedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_documents">
		<rdfs:label xml:lang="en-GB">documents</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_spawns">
		<rdfs:label xml:lang="en-GB">spawns</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_reviewTasks">
		<rdfs:label xml:lang="en-GB">reviewTasks</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_itemReviewSessions">
		<rdfs:label xml:lang="en-GB">itemReviewSessions</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_type">
		<rdfs:label xml:lang="en-GB">type</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_contains">
		<rdfs:label xml:lang="en-GB">contains</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
	<rdf:Property rdf:about="integrity:SystemHierarchy_referencedBy">
		<rdfs:label xml:lang="en-GB">referencedBy</rdfs:label>
		<rdfs:isDefinedBy rdf:resource="http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#"/>
		<dcterms:issued>2014-01-05</dcterms:issued>
	</rdf:Property>
</rdf:RDF>
</xmp>
		
		
	</div>


	<!-- footer -->
	<p id="footer">OSLC Integrity Adapter 0.1 brought to you by <a class="nofancyfooter"
	 href="https://www.eclipse.org/lyo/" target="_blank">Eclipse Lyo</a>
	 
</body>
</html>







