package edu.gatech.mbsec.adapter.integrity.generated.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.Representation;
import org.eclipse.lyo.oslc4j.core.model.ValueType;
import org.eclipse.lyo.oslc4j.core.model.Link;

@OslcNamespace(Constants.INTEGRITY_NAMESPACE)
@OslcName("SystemHierarchy")
@OslcResourceShape(title = "SystemHierarchy Resource Shape", describes = Constants.TYPE_INTEGRITY_SYSTEMHIERARCHY)
public class IntegritySystemHierarchy extends AbstractResource{

	public IntegritySystemHierarchy() throws URISyntaxException {
		super();
	}
	public IntegritySystemHierarchy(URI about) throws URISyntaxException {
		super(about);
	}

	private String summary;

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@OslcDescription("Description of SystemHierarchy::summary TBD")
	@OslcName("summary")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_summary")
	@OslcTitle("summary")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSummary() {
		 return summary;
	}
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	@OslcDescription("Description of SystemHierarchy::state TBD")
	@OslcName("state")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_state")
	@OslcTitle("state")
	@OslcValueType(ValueType.XMLLiteral)
	public String getState() {
		 return state;
	}
	private String assignedUser;

	public void setAssignedUser(String assignedUser) {
		this.assignedUser = assignedUser;
	}

	@OslcDescription("Description of SystemHierarchy::assignedUser TBD")
	@OslcName("assignedUser")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_assignedUser")
	@OslcTitle("assignedUser")
	@OslcValueType(ValueType.XMLLiteral)
	public String getAssignedUser() {
		 return assignedUser;
	}
	private String parameters;

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	@OslcDescription("Description of SystemHierarchy::parameters TBD")
	@OslcName("parameters")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_parameters")
	@OslcTitle("parameters")
	@OslcValueType(ValueType.XMLLiteral)
	public String getParameters() {
		 return parameters;
	}
	private String parameterValues;

	public void setParameterValues(String parameterValues) {
		this.parameterValues = parameterValues;
	}

	@OslcDescription("Description of SystemHierarchy::parameterValues TBD")
	@OslcName("parameterValues")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_parameterValues")
	@OslcTitle("parameterValues")
	@OslcValueType(ValueType.XMLLiteral)
	public String getParameterValues() {
		 return parameterValues;
	}
	private String oC_SharedName;

	public void setOC_SharedName(String oC_SharedName) {
		this.oC_SharedName = oC_SharedName;
	}

	@OslcDescription("Description of SystemHierarchy::oC_SharedName TBD")
	@OslcName("oC_SharedName")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_oC_SharedName")
	@OslcTitle("oC_SharedName")
	@OslcValueType(ValueType.XMLLiteral)
	public String getOC_SharedName() {
		 return oC_SharedName;
	}
	private String sharedText;

	public void setSharedText(String sharedText) {
		this.sharedText = sharedText;
	}

	@OslcDescription("Description of SystemHierarchy::sharedText TBD")
	@OslcName("sharedText")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_sharedText")
	@OslcTitle("sharedText")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSharedText() {
		 return sharedText;
	}
	private int allContentCount;

	public void setAllContentCount(int allContentCount) {
		this.allContentCount = allContentCount;
	}

	@OslcDescription("Description of SystemHierarchy::allContentCount TBD")
	@OslcName("allContentCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_allContentCount")
	@OslcTitle("allContentCount")
	public int getAllContentCount() {
		 return allContentCount;
	}
	private boolean allowEdits;

	public void setAllowEdits(boolean allowEdits) {
		this.allowEdits = allowEdits;
	}

	@OslcDescription("Description of SystemHierarchy::allowEdits TBD")
	@OslcName("allowEdits")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_allowEdits")
	@OslcTitle("allowEdits")
	public boolean getAllowEdits() {
		 return allowEdits;
	}
	private boolean allowTraces;

	public void setAllowTraces(boolean allowTraces) {
		this.allowTraces = allowTraces;
	}

	@OslcDescription("Description of SystemHierarchy::allowTraces TBD")
	@OslcName("allowTraces")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_allowTraces")
	@OslcTitle("allowTraces")
	public boolean getAllowTraces() {
		 return allowTraces;
	}
	private int authorizingChangeRequest;

	public void setAuthorizingChangeRequest(int authorizingChangeRequest) {
		this.authorizingChangeRequest = authorizingChangeRequest;
	}

	@OslcDescription("Description of SystemHierarchy::authorizingChangeRequest TBD")
	@OslcName("authorizingChangeRequest")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_authorizingChangeRequest")
	@OslcTitle("authorizingChangeRequest")
	public int getAuthorizingChangeRequest() {
		 return authorizingChangeRequest;
	}
	private int closedChangeRequestsCount;

	public void setClosedChangeRequestsCount(int closedChangeRequestsCount) {
		this.closedChangeRequestsCount = closedChangeRequestsCount;
	}

	@OslcDescription("Description of SystemHierarchy::closedChangeRequestsCount TBD")
	@OslcName("closedChangeRequestsCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_closedChangeRequestsCount")
	@OslcTitle("closedChangeRequestsCount")
	public int getClosedChangeRequestsCount() {
		 return closedChangeRequestsCount;
	}
	private int missingUpstreamTraceCount;

	public void setMissingUpstreamTraceCount(int missingUpstreamTraceCount) {
		this.missingUpstreamTraceCount = missingUpstreamTraceCount;
	}

	@OslcDescription("Description of SystemHierarchy::missingUpstreamTraceCount TBD")
	@OslcName("missingUpstreamTraceCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_missingUpstreamTraceCount")
	@OslcTitle("missingUpstreamTraceCount")
	public int getMissingUpstreamTraceCount() {
		 return missingUpstreamTraceCount;
	}
	private int missingDownstreamTraceCount;

	public void setMissingDownstreamTraceCount(int missingDownstreamTraceCount) {
		this.missingDownstreamTraceCount = missingDownstreamTraceCount;
	}

	@OslcDescription("Description of SystemHierarchy::missingDownstreamTraceCount TBD")
	@OslcName("missingDownstreamTraceCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_missingDownstreamTraceCount")
	@OslcTitle("missingDownstreamTraceCount")
	public int getMissingDownstreamTraceCount() {
		 return missingDownstreamTraceCount;
	}
	private String description;

	public void setDescription(String description) {
		this.description = description;
	}

	@OslcDescription("Description of SystemHierarchy::description TBD")
	@OslcName("description")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_description")
	@OslcTitle("description")
	@OslcValueType(ValueType.XMLLiteral)
	public String getDescription() {
		 return description;
	}
	private String documentPhase;

	public void setDocumentPhase(String documentPhase) {
		this.documentPhase = documentPhase;
	}

	@OslcDescription("Description of SystemHierarchy::documentPhase TBD")
	@OslcName("documentPhase")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_documentPhase")
	@OslcTitle("documentPhase")
	@OslcValueType(ValueType.XMLLiteral)
	public String getDocumentPhase() {
		 return documentPhase;
	}
	private String integrationDetails;

	public void setIntegrationDetails(String integrationDetails) {
		this.integrationDetails = integrationDetails;
	}

	@OslcDescription("Description of SystemHierarchy::integrationDetails TBD")
	@OslcName("integrationDetails")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_integrationDetails")
	@OslcTitle("integrationDetails")
	@OslcValueType(ValueType.XMLLiteral)
	public String getIntegrationDetails() {
		 return integrationDetails;
	}
	private String integrationStatus;

	public void setIntegrationStatus(String integrationStatus) {
		this.integrationStatus = integrationStatus;
	}

	@OslcDescription("Description of SystemHierarchy::integrationStatus TBD")
	@OslcName("integrationStatus")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_integrationStatus")
	@OslcTitle("integrationStatus")
	@OslcValueType(ValueType.XMLLiteral)
	public String getIntegrationStatus() {
		 return integrationStatus;
	}
	private String locationinWindchill;

	public void setLocationinWindchill(String locationinWindchill) {
		this.locationinWindchill = locationinWindchill;
	}

	@OslcDescription("Description of SystemHierarchy::locationinWindchill TBD")
	@OslcName("locationinWindchill")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_locationinWindchill")
	@OslcTitle("locationinWindchill")
	@OslcValueType(ValueType.XMLLiteral)
	public String getLocationinWindchill() {
		 return locationinWindchill;
	}
	private int meaningfulContentCount;

	public void setMeaningfulContentCount(int meaningfulContentCount) {
		this.meaningfulContentCount = meaningfulContentCount;
	}

	@OslcDescription("Description of SystemHierarchy::meaningfulContentCount TBD")
	@OslcName("meaningfulContentCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_meaningfulContentCount")
	@OslcTitle("meaningfulContentCount")
	public int getMeaningfulContentCount() {
		 return meaningfulContentCount;
	}
	private int openChangeRequestsCount;

	public void setOpenChangeRequestsCount(int openChangeRequestsCount) {
		this.openChangeRequestsCount = openChangeRequestsCount;
	}

	@OslcDescription("Description of SystemHierarchy::openChangeRequestsCount TBD")
	@OslcName("openChangeRequestsCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_openChangeRequestsCount")
	@OslcTitle("openChangeRequestsCount")
	public int getOpenChangeRequestsCount() {
		 return openChangeRequestsCount;
	}
	private int pendingChangeRequestsCount;

	public void setPendingChangeRequestsCount(int pendingChangeRequestsCount) {
		this.pendingChangeRequestsCount = pendingChangeRequestsCount;
	}

	@OslcDescription("Description of SystemHierarchy::pendingChangeRequestsCount TBD")
	@OslcName("pendingChangeRequestsCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_pendingChangeRequestsCount")
	@OslcTitle("pendingChangeRequestsCount")
	public int getPendingChangeRequestsCount() {
		 return pendingChangeRequestsCount;
	}
	private String metricsLastComputed;

	public void setMetricsLastComputed(String metricsLastComputed) {
		this.metricsLastComputed = metricsLastComputed;
	}

	@OslcDescription("Description of SystemHierarchy::metricsLastComputed TBD")
	@OslcName("metricsLastComputed")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_metricsLastComputed")
	@OslcTitle("metricsLastComputed")
	@OslcValueType(ValueType.XMLLiteral)
	public String getMetricsLastComputed() {
		 return metricsLastComputed;
	}
	private boolean rootDocument;

	public void setRootDocument(boolean rootDocument) {
		this.rootDocument = rootDocument;
	}

	@OslcDescription("Description of SystemHierarchy::rootDocument TBD")
	@OslcName("rootDocument")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_rootDocument")
	@OslcTitle("rootDocument")
	public boolean getRootDocument() {
		 return rootDocument;
	}
	private String selectWindchillLocation;

	public void setSelectWindchillLocation(String selectWindchillLocation) {
		this.selectWindchillLocation = selectWindchillLocation;
	}

	@OslcDescription("Description of SystemHierarchy::selectWindchillLocation TBD")
	@OslcName("selectWindchillLocation")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_selectWindchillLocation")
	@OslcTitle("selectWindchillLocation")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSelectWindchillLocation() {
		 return selectWindchillLocation;
	}
	private String sendtoWindchill;

	public void setSendtoWindchill(String sendtoWindchill) {
		this.sendtoWindchill = sendtoWindchill;
	}

	@OslcDescription("Description of SystemHierarchy::sendtoWindchill TBD")
	@OslcName("sendtoWindchill")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_sendtoWindchill")
	@OslcTitle("sendtoWindchill")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSendtoWindchill() {
		 return sendtoWindchill;
	}
	private int suspectContentCount;

	public void setSuspectContentCount(int suspectContentCount) {
		this.suspectContentCount = suspectContentCount;
	}

	@OslcDescription("Description of SystemHierarchy::suspectContentCount TBD")
	@OslcName("suspectContentCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_suspectContentCount")
	@OslcTitle("suspectContentCount")
	public int getSuspectContentCount() {
		 return suspectContentCount;
	}
	private float suspectContentPercentage;

	public void setSuspectContentPercentage(float suspectContentPercentage) {
		this.suspectContentPercentage = suspectContentPercentage;
	}

	@OslcDescription("Description of SystemHierarchy::suspectContentPercentage TBD")
	@OslcName("suspectContentPercentage")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_suspectContentPercentage")
	@OslcTitle("suspectContentPercentage")
	public float getSuspectContentPercentage() {
		 return suspectContentPercentage;
	}
	private boolean useHierarchicalEditability;

	public void setUseHierarchicalEditability(boolean useHierarchicalEditability) {
		this.useHierarchicalEditability = useHierarchicalEditability;
	}

	@OslcDescription("Description of SystemHierarchy::useHierarchicalEditability TBD")
	@OslcName("useHierarchicalEditability")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_useHierarchicalEditability")
	@OslcTitle("useHierarchicalEditability")
	public boolean getUseHierarchicalEditability() {
		 return useHierarchicalEditability;
	}
	private boolean validChangeRequest;

	public void setValidChangeRequest(boolean validChangeRequest) {
		this.validChangeRequest = validChangeRequest;
	}

	@OslcDescription("Description of SystemHierarchy::validChangeRequest TBD")
	@OslcName("validChangeRequest")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_validChangeRequest")
	@OslcTitle("validChangeRequest")
	public boolean getValidChangeRequest() {
		 return validChangeRequest;
	}
	private String windchillItem;

	public void setWindchillItem(String windchillItem) {
		this.windchillItem = windchillItem;
	}

	@OslcDescription("Description of SystemHierarchy::windchillItem TBD")
	@OslcName("windchillItem")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_windchillItem")
	@OslcTitle("windchillItem")
	@OslcValueType(ValueType.XMLLiteral)
	public String getWindchillItem() {
		 return windchillItem;
	}
	private String windchillLocation;

	public void setWindchillLocation(String windchillLocation) {
		this.windchillLocation = windchillLocation;
	}

	@OslcDescription("Description of SystemHierarchy::windchillLocation TBD")
	@OslcName("windchillLocation")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_windchillLocation")
	@OslcTitle("windchillLocation")
	@OslcValueType(ValueType.XMLLiteral)
	public String getWindchillLocation() {
		 return windchillLocation;
	}
	private int windchillTransferProgress;

	public void setWindchillTransferProgress(int windchillTransferProgress) {
		this.windchillTransferProgress = windchillTransferProgress;
	}

	@OslcDescription("Description of SystemHierarchy::windchillTransferProgress TBD")
	@OslcName("windchillTransferProgress")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_windchillTransferProgress")
	@OslcTitle("windchillTransferProgress")
	public int getWindchillTransferProgress() {
		 return windchillTransferProgress;
	}
	private String projectPhase;

	public void setProjectPhase(String projectPhase) {
		this.projectPhase = projectPhase;
	}

	@OslcDescription("Description of SystemHierarchy::projectPhase TBD")
	@OslcName("projectPhase")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_projectPhase")
	@OslcTitle("projectPhase")
	@OslcValueType(ValueType.XMLLiteral)
	public String getProjectPhase() {
		 return projectPhase;
	}
	private String leadReviewer;

	public void setLeadReviewer(String leadReviewer) {
		this.leadReviewer = leadReviewer;
	}

	@OslcDescription("Description of SystemHierarchy::leadReviewer TBD")
	@OslcName("leadReviewer")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_leadReviewer")
	@OslcTitle("leadReviewer")
	@OslcValueType(ValueType.XMLLiteral)
	public String getLeadReviewer() {
		 return leadReviewer;
	}
	private String assignedReviewers;

	public void setAssignedReviewers(String assignedReviewers) {
		this.assignedReviewers = assignedReviewers;
	}

	@OslcDescription("Description of SystemHierarchy::assignedReviewers TBD")
	@OslcName("assignedReviewers")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_assignedReviewers")
	@OslcTitle("assignedReviewers")
	@OslcValueType(ValueType.XMLLiteral)
	public String getAssignedReviewers() {
		 return assignedReviewers;
	}
	private String assignedApprovers;

	public void setAssignedApprovers(String assignedApprovers) {
		this.assignedApprovers = assignedApprovers;
	}

	@OslcDescription("Description of SystemHierarchy::assignedApprovers TBD")
	@OslcName("assignedApprovers")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_assignedApprovers")
	@OslcTitle("assignedApprovers")
	@OslcValueType(ValueType.XMLLiteral)
	public String getAssignedApprovers() {
		 return assignedApprovers;
	}
	private String reviewDueDate;

	public void setReviewDueDate(String reviewDueDate) {
		this.reviewDueDate = reviewDueDate;
	}

	@OslcDescription("Description of SystemHierarchy::reviewDueDate TBD")
	@OslcName("reviewDueDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_reviewDueDate")
	@OslcTitle("reviewDueDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReviewDueDate() {
		 return reviewDueDate;
	}
	private String reviewStatus;

	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	@OslcDescription("Description of SystemHierarchy::reviewStatus TBD")
	@OslcName("reviewStatus")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_reviewStatus")
	@OslcTitle("reviewStatus")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReviewStatus() {
		 return reviewStatus;
	}
	private boolean automaticRequirementApprovalAllowed;

	public void setAutomaticRequirementApprovalAllowed(boolean automaticRequirementApprovalAllowed) {
		this.automaticRequirementApprovalAllowed = automaticRequirementApprovalAllowed;
	}

	@OslcDescription("Description of SystemHierarchy::automaticRequirementApprovalAllowed TBD")
	@OslcName("automaticRequirementApprovalAllowed")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_automaticRequirementApprovalAllowed")
	@OslcTitle("automaticRequirementApprovalAllowed")
	public boolean getAutomaticRequirementApprovalAllowed() {
		 return automaticRequirementApprovalAllowed;
	}
	private String reviewHistory;

	public void setReviewHistory(String reviewHistory) {
		this.reviewHistory = reviewHistory;
	}

	@OslcDescription("Description of SystemHierarchy::reviewHistory TBD")
	@OslcName("reviewHistory")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_reviewHistory")
	@OslcTitle("reviewHistory")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReviewHistory() {
		 return reviewHistory;
	}
	private String approvalHistory;

	public void setApprovalHistory(String approvalHistory) {
		this.approvalHistory = approvalHistory;
	}

	@OslcDescription("Description of SystemHierarchy::approvalHistory TBD")
	@OslcName("approvalHistory")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_approvalHistory")
	@OslcTitle("approvalHistory")
	@OslcValueType(ValueType.XMLLiteral)
	public String getApprovalHistory() {
		 return approvalHistory;
	}
	private String reviewHistoryMetadata;

	public void setReviewHistoryMetadata(String reviewHistoryMetadata) {
		this.reviewHistoryMetadata = reviewHistoryMetadata;
	}

	@OslcDescription("Description of SystemHierarchy::reviewHistoryMetadata TBD")
	@OslcName("reviewHistoryMetadata")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_reviewHistoryMetadata")
	@OslcTitle("reviewHistoryMetadata")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReviewHistoryMetadata() {
		 return reviewHistoryMetadata;
	}
	private String iPRiskClassification;

	public void setIPRiskClassification(String iPRiskClassification) {
		this.iPRiskClassification = iPRiskClassification;
	}

	@OslcDescription("Description of SystemHierarchy::iPRiskClassification TBD")
	@OslcName("iPRiskClassification")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_iPRiskClassification")
	@OslcTitle("iPRiskClassification")
	@OslcValueType(ValueType.XMLLiteral)
	public String getIPRiskClassification() {
		 return iPRiskClassification;
	}
	private String name_;

	public void setName_(String name_) {
		this.name_ = name_;
	}

	@OslcDescription("Description of SystemHierarchy::name_ TBD")
	@OslcName("name_")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_name_")
	@OslcTitle("name_")
	@OslcValueType(ValueType.XMLLiteral)
	public String getName_() {
		 return name_;
	}
	private String sharedName;

	public void setSharedName(String sharedName) {
		this.sharedName = sharedName;
	}

	@OslcDescription("Description of SystemHierarchy::sharedName TBD")
	@OslcName("sharedName")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_sharedName")
	@OslcTitle("sharedName")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSharedName() {
		 return sharedName;
	}
	private String backingItemonSegment;

	public void setBackingItemonSegment(String backingItemonSegment) {
		this.backingItemonSegment = backingItemonSegment;
	}

	@OslcDescription("Description of SystemHierarchy::backingItemonSegment TBD")
	@OslcName("backingItemonSegment")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_backingItemonSegment")
	@OslcTitle("backingItemonSegment")
	@OslcValueType(ValueType.XMLLiteral)
	public String getBackingItemonSegment() {
		 return backingItemonSegment;
	}
	private String referencetoBackingItemonProject;

	public void setReferencetoBackingItemonProject(String referencetoBackingItemonProject) {
		this.referencetoBackingItemonProject = referencetoBackingItemonProject;
	}

	@OslcDescription("Description of SystemHierarchy::referencetoBackingItemonProject TBD")
	@OslcName("referencetoBackingItemonProject")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_referencetoBackingItemonProject")
	@OslcTitle("referencetoBackingItemonProject")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReferencetoBackingItemonProject() {
		 return referencetoBackingItemonProject;
	}
	private String text_;

	public void setText_(String text_) {
		this.text_ = text_;
	}

	@OslcDescription("Description of SystemHierarchy::text_ TBD")
	@OslcName("text_")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_text_")
	@OslcTitle("text_")
	@OslcValueType(ValueType.XMLLiteral)
	public String getText_() {
		 return text_;
	}
	private int minorVersionID;

	public void setMinorVersionID(int minorVersionID) {
		this.minorVersionID = minorVersionID;
	}

	@OslcDescription("Description of SystemHierarchy::minorVersionID TBD")
	@OslcName("minorVersionID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_minorVersionID")
	@OslcTitle("minorVersionID")
	public int getMinorVersionID() {
		 return minorVersionID;
	}
	private int majorVersionID;

	public void setMajorVersionID(int majorVersionID) {
		this.majorVersionID = majorVersionID;
	}

	@OslcDescription("Description of SystemHierarchy::majorVersionID TBD")
	@OslcName("majorVersionID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_majorVersionID")
	@OslcTitle("majorVersionID")
	public int getMajorVersionID() {
		 return majorVersionID;
	}
	private int liveItemID;

	public void setLiveItemID(int liveItemID) {
		this.liveItemID = liveItemID;
	}

	@OslcDescription("Description of SystemHierarchy::liveItemID TBD")
	@OslcName("liveItemID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_liveItemID")
	@OslcTitle("liveItemID")
	public int getLiveItemID() {
		 return liveItemID;
	}
	private String bookmarks;

	public void setBookmarks(String bookmarks) {
		this.bookmarks = bookmarks;
	}

	@OslcDescription("Description of SystemHierarchy::bookmarks TBD")
	@OslcName("bookmarks")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_bookmarks")
	@OslcTitle("bookmarks")
	@OslcValueType(ValueType.XMLLiteral)
	public String getBookmarks() {
		 return bookmarks;
	}
	private String signatureComment;

	public void setSignatureComment(String signatureComment) {
		this.signatureComment = signatureComment;
	}

	@OslcDescription("Description of SystemHierarchy::signatureComment TBD")
	@OslcName("signatureComment")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_signatureComment")
	@OslcTitle("signatureComment")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSignatureComment() {
		 return signatureComment;
	}
	private String signedBy;

	public void setSignedBy(String signedBy) {
		this.signedBy = signedBy;
	}

	@OslcDescription("Description of SystemHierarchy::signedBy TBD")
	@OslcName("signedBy")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_signedBy")
	@OslcTitle("signedBy")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSignedBy() {
		 return signedBy;
	}
	private int iD;

	public void setID(int iD) {
		this.iD = iD;
	}

	@OslcDescription("Description of SystemHierarchy::iD TBD")
	@OslcName("iD")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_iD")
	@OslcTitle("iD")
	public int getID() {
		 return iD;
	}
	private String modifiedBy;

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@OslcDescription("Description of SystemHierarchy::modifiedBy TBD")
	@OslcName("modifiedBy")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_modifiedBy")
	@OslcTitle("modifiedBy")
	@OslcValueType(ValueType.XMLLiteral)
	public String getModifiedBy() {
		 return modifiedBy;
	}
	private String createdBy;

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@OslcDescription("Description of SystemHierarchy::createdBy TBD")
	@OslcName("createdBy")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_createdBy")
	@OslcTitle("createdBy")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCreatedBy() {
		 return createdBy;
	}
	private String modifiedDate;

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@OslcDescription("Description of SystemHierarchy::modifiedDate TBD")
	@OslcName("modifiedDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_modifiedDate")
	@OslcTitle("modifiedDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getModifiedDate() {
		 return modifiedDate;
	}
	private String createdDate;

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@OslcDescription("Description of SystemHierarchy::createdDate TBD")
	@OslcName("createdDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_createdDate")
	@OslcTitle("createdDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCreatedDate() {
		 return createdDate;
	}
	private String sharedCategory;

	public void setSharedCategory(String sharedCategory) {
		this.sharedCategory = sharedCategory;
	}

	@OslcDescription("Description of SystemHierarchy::sharedCategory TBD")
	@OslcName("sharedCategory")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_sharedCategory")
	@OslcTitle("sharedCategory")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSharedCategory() {
		 return sharedCategory;
	}
	private int rootID;

	public void setRootID(int rootID) {
		this.rootID = rootID;
	}

	@OslcDescription("Description of SystemHierarchy::rootID TBD")
	@OslcName("rootID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_rootID")
	@OslcTitle("rootID")
	public int getRootID() {
		 return rootID;
	}
	private String inputRevisionDate;

	public void setInputRevisionDate(String inputRevisionDate) {
		this.inputRevisionDate = inputRevisionDate;
	}

	@OslcDescription("Description of SystemHierarchy::inputRevisionDate TBD")
	@OslcName("inputRevisionDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_inputRevisionDate")
	@OslcTitle("inputRevisionDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getInputRevisionDate() {
		 return inputRevisionDate;
	}
	private String significantEditDate;

	public void setSignificantEditDate(String significantEditDate) {
		this.significantEditDate = significantEditDate;
	}

	@OslcDescription("Description of SystemHierarchy::significantEditDate TBD")
	@OslcName("significantEditDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_significantEditDate")
	@OslcTitle("significantEditDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSignificantEditDate() {
		 return significantEditDate;
	}
	private String revision;

	public void setRevision(String revision) {
		this.revision = revision;
	}

	@OslcDescription("Description of SystemHierarchy::revision TBD")
	@OslcName("revision")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_revision")
	@OslcTitle("revision")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRevision() {
		 return revision;
	}
	private String revisionIncrementDate;

	public void setRevisionIncrementDate(String revisionIncrementDate) {
		this.revisionIncrementDate = revisionIncrementDate;
	}

	@OslcDescription("Description of SystemHierarchy::revisionIncrementDate TBD")
	@OslcName("revisionIncrementDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_revisionIncrementDate")
	@OslcTitle("revisionIncrementDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRevisionIncrementDate() {
		 return revisionIncrementDate;
	}
	private boolean significantChangeSinceItemRevision;

	public void setSignificantChangeSinceItemRevision(boolean significantChangeSinceItemRevision) {
		this.significantChangeSinceItemRevision = significantChangeSinceItemRevision;
	}

	@OslcDescription("Description of SystemHierarchy::significantChangeSinceItemRevision TBD")
	@OslcName("significantChangeSinceItemRevision")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_significantChangeSinceItemRevision")
	@OslcTitle("significantChangeSinceItemRevision")
	public boolean getSignificantChangeSinceItemRevision() {
		 return significantChangeSinceItemRevision;
	}
	// ********* project *********
	private URI project;

	public void setProject(final URI project) {
		this.project = project;
	}

	@OslcDescription("Description of SystemHierarchy::project TBD")
	@OslcName("project")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_project")
	@OslcTitle("project")
	@OslcRange("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project")
	public URI  getProject() {
		 return project;
	}

	// ********* attachments *********
	private final Set<Link> attachments = new HashSet<Link>();

	public void setAttachments(final Link[] attachments) {
		this.attachments.clear();
		if (attachments != null)
		{
			this.attachments.addAll(Arrays.asList(attachments));
		}
	}

	@OslcDescription("Description of SystemHierarchy::attachments TBD")
	@OslcName("attachments")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_attachments")
	@OslcTitle("attachments")
	@OslcReadOnly(false)
	public Link[]  getAttachments() {
		 return attachments.toArray(new Link[attachments.size()]);
	}

	// ********* sharedAttachments *********
	private final Set<Link> sharedAttachments = new HashSet<Link>();

	public void setSharedAttachments(final Link[] sharedAttachments) {
		this.sharedAttachments.clear();
		if (sharedAttachments != null)
		{
			this.sharedAttachments.addAll(Arrays.asList(sharedAttachments));
		}
	}

	@OslcDescription("Description of SystemHierarchy::sharedAttachments TBD")
	@OslcName("sharedAttachments")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_sharedAttachments")
	@OslcTitle("sharedAttachments")
	@OslcReadOnly(false)
	public Link[]  getSharedAttachments() {
		 return sharedAttachments.toArray(new Link[sharedAttachments.size()]);
	}

	// ********* changesAuthorizedBy *********
	private final Set<Link> changesAuthorizedBy = new HashSet<Link>();

	public void setChangesAuthorizedBy(final Link[] changesAuthorizedBy) {
		this.changesAuthorizedBy.clear();
		if (changesAuthorizedBy != null)
		{
			this.changesAuthorizedBy.addAll(Arrays.asList(changesAuthorizedBy));
		}
	}

	@OslcDescription("Description of SystemHierarchy::changesAuthorizedBy TBD")
	@OslcName("changesAuthorizedBy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_changesAuthorizedBy")
	@OslcTitle("changesAuthorizedBy")
	@OslcReadOnly(false)
	public Link[]  getChangesAuthorizedBy() {
		 return changesAuthorizedBy.toArray(new Link[changesAuthorizedBy.size()]);
	}

	// ********* documents *********
	private final Set<Link> documents = new HashSet<Link>();

	public void setDocuments(final Link[] documents) {
		this.documents.clear();
		if (documents != null)
		{
			this.documents.addAll(Arrays.asList(documents));
		}
	}

	@OslcDescription("Description of SystemHierarchy::documents TBD")
	@OslcName("documents")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_documents")
	@OslcTitle("documents")
	@OslcReadOnly(false)
	public Link[]  getDocuments() {
		 return documents.toArray(new Link[documents.size()]);
	}

	// ********* spawns *********
	private final Set<Link> spawns = new HashSet<Link>();

	public void setSpawns(final Link[] spawns) {
		this.spawns.clear();
		if (spawns != null)
		{
			this.spawns.addAll(Arrays.asList(spawns));
		}
	}

	@OslcDescription("Description of SystemHierarchy::spawns TBD")
	@OslcName("spawns")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_spawns")
	@OslcTitle("spawns")
	@OslcReadOnly(false)
	public Link[]  getSpawns() {
		 return spawns.toArray(new Link[spawns.size()]);
	}

	// ********* reviewTasks *********
	private final Set<Link> reviewTasks = new HashSet<Link>();

	public void setReviewTasks(final Link[] reviewTasks) {
		this.reviewTasks.clear();
		if (reviewTasks != null)
		{
			this.reviewTasks.addAll(Arrays.asList(reviewTasks));
		}
	}

	@OslcDescription("Description of SystemHierarchy::reviewTasks TBD")
	@OslcName("reviewTasks")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_reviewTasks")
	@OslcTitle("reviewTasks")
	@OslcReadOnly(false)
	public Link[]  getReviewTasks() {
		 return reviewTasks.toArray(new Link[reviewTasks.size()]);
	}

	// ********* itemReviewSessions *********
	private final Set<Link> itemReviewSessions = new HashSet<Link>();

	public void setItemReviewSessions(final Link[] itemReviewSessions) {
		this.itemReviewSessions.clear();
		if (itemReviewSessions != null)
		{
			this.itemReviewSessions.addAll(Arrays.asList(itemReviewSessions));
		}
	}

	@OslcDescription("Description of SystemHierarchy::itemReviewSessions TBD")
	@OslcName("itemReviewSessions")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_itemReviewSessions")
	@OslcTitle("itemReviewSessions")
	@OslcReadOnly(false)
	public Link[]  getItemReviewSessions() {
		 return itemReviewSessions.toArray(new Link[itemReviewSessions.size()]);
	}

	// ********* type *********
	private URI type;

	public void setType(final URI type) {
		this.type = type;
	}

	@OslcDescription("Description of SystemHierarchy::type TBD")
	@OslcName("type")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_type")
	@OslcTitle("type")
	@OslcRange("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement")
	public URI  getType() {
		 return type;
	}

	// ********* contains *********
	private final Set<Link> contains = new HashSet<Link>();

	public void setContains(final Link[] contains) {
		this.contains.clear();
		if (contains != null)
		{
			this.contains.addAll(Arrays.asList(contains));
		}
	}

	@OslcDescription("Description of SystemHierarchy::contains TBD")
	@OslcName("contains")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_contains")
	@OslcTitle("contains")
	@OslcReadOnly(false)
	public Link[]  getContains() {
		 return contains.toArray(new Link[contains.size()]);
	}

	// ********* referencedBy *********
	private final Set<Link> referencedBy = new HashSet<Link>();

	public void setReferencedBy(final Link[] referencedBy) {
		this.referencedBy.clear();
		if (referencedBy != null)
		{
			this.referencedBy.addAll(Arrays.asList(referencedBy));
		}
	}

	@OslcDescription("Description of SystemHierarchy::referencedBy TBD")
	@OslcName("referencedBy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy_referencedBy")
	@OslcTitle("referencedBy")
	@OslcReadOnly(false)
	public Link[]  getReferencedBy() {
		 return referencedBy.toArray(new Link[referencedBy.size()]);
	}

	private URI      serviceProvider;

	public void setServiceProvider(final URI serviceProvider)
	{		this.serviceProvider = serviceProvider;
	}

	@OslcDescription("The scope of a resource is a URI for the resource's OSLC Service Provider.")
	@OslcPropertyDefinition(OslcConstants.OSLC_CORE_NAMESPACE + "serviceProvider")
	@OslcRange(OslcConstants.TYPE_SERVICE_PROVIDER)
	@OslcTitle("Service Provider")	
	public URI getServiceProvider()
	{
		return serviceProvider;
	}

}