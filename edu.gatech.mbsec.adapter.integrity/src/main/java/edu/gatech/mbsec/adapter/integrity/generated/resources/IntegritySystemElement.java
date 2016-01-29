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
@OslcName("SystemElement")
@OslcResourceShape(title = "SystemElement Resource Shape", describes = Constants.TYPE_INTEGRITY_SYSTEMELEMENT)
public class IntegritySystemElement extends AbstractResource{

	public IntegritySystemElement() throws URISyntaxException {
		super();
	}
	public IntegritySystemElement(URI about) throws URISyntaxException {
		super(about);
	}

	private String summary;

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@OslcDescription("Description of SystemElement::summary TBD")
	@OslcName("summary")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_summary")
	@OslcTitle("summary")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSummary() {
		 return summary;
	}
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	@OslcDescription("Description of SystemElement::state TBD")
	@OslcName("state")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_state")
	@OslcTitle("state")
	@OslcValueType(ValueType.XMLLiteral)
	public String getState() {
		 return state;
	}
	private String assignedUser;

	public void setAssignedUser(String assignedUser) {
		this.assignedUser = assignedUser;
	}

	@OslcDescription("Description of SystemElement::assignedUser TBD")
	@OslcName("assignedUser")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_assignedUser")
	@OslcTitle("assignedUser")
	@OslcValueType(ValueType.XMLLiteral)
	public String getAssignedUser() {
		 return assignedUser;
	}
	private String parameters;

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	@OslcDescription("Description of SystemElement::parameters TBD")
	@OslcName("parameters")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_parameters")
	@OslcTitle("parameters")
	@OslcValueType(ValueType.XMLLiteral)
	public String getParameters() {
		 return parameters;
	}
	private String parameterValues;

	public void setParameterValues(String parameterValues) {
		this.parameterValues = parameterValues;
	}

	@OslcDescription("Description of SystemElement::parameterValues TBD")
	@OslcName("parameterValues")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_parameterValues")
	@OslcTitle("parameterValues")
	@OslcValueType(ValueType.XMLLiteral)
	public String getParameterValues() {
		 return parameterValues;
	}
	private int authorizingChangeRequest;

	public void setAuthorizingChangeRequest(int authorizingChangeRequest) {
		this.authorizingChangeRequest = authorizingChangeRequest;
	}

	@OslcDescription("Description of SystemElement::authorizingChangeRequest TBD")
	@OslcName("authorizingChangeRequest")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_authorizingChangeRequest")
	@OslcTitle("authorizingChangeRequest")
	public int getAuthorizingChangeRequest() {
		 return authorizingChangeRequest;
	}
	private String description;

	public void setDescription(String description) {
		this.description = description;
	}

	@OslcDescription("Description of SystemElement::description TBD")
	@OslcName("description")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_description")
	@OslcTitle("description")
	@OslcValueType(ValueType.XMLLiteral)
	public String getDescription() {
		 return description;
	}
	private int downstreamTraceCount;

	public void setDownstreamTraceCount(int downstreamTraceCount) {
		this.downstreamTraceCount = downstreamTraceCount;
	}

	@OslcDescription("Description of SystemElement::downstreamTraceCount TBD")
	@OslcName("downstreamTraceCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_downstreamTraceCount")
	@OslcTitle("downstreamTraceCount")
	public int getDownstreamTraceCount() {
		 return downstreamTraceCount;
	}
	private String externalID;

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	@OslcDescription("Description of SystemElement::externalID TBD")
	@OslcName("externalID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_externalID")
	@OslcTitle("externalID")
	@OslcValueType(ValueType.XMLLiteral)
	public String getExternalID() {
		 return externalID;
	}
	private boolean includeReference;

	public void setIncludeReference(boolean includeReference) {
		this.includeReference = includeReference;
	}

	@OslcDescription("Description of SystemElement::includeReference TBD")
	@OslcName("includeReference")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_includeReference")
	@OslcTitle("includeReference")
	public boolean getIncludeReference() {
		 return includeReference;
	}
	private boolean includeSubsegmentinMetrics;

	public void setIncludeSubsegmentinMetrics(boolean includeSubsegmentinMetrics) {
		this.includeSubsegmentinMetrics = includeSubsegmentinMetrics;
	}

	@OslcDescription("Description of SystemElement::includeSubsegmentinMetrics TBD")
	@OslcName("includeSubsegmentinMetrics")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_includeSubsegmentinMetrics")
	@OslcTitle("includeSubsegmentinMetrics")
	public boolean getIncludeSubsegmentinMetrics() {
		 return includeSubsegmentinMetrics;
	}
	private String oC_Name;

	public void setOC_Name(String oC_Name) {
		this.oC_Name = oC_Name;
	}

	@OslcDescription("Description of SystemElement::oC_Name TBD")
	@OslcName("oC_Name")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_oC_Name")
	@OslcTitle("oC_Name")
	@OslcValueType(ValueType.XMLLiteral)
	public String getOC_Name() {
		 return oC_Name;
	}
	private String parameterValuesFromSharedItem;

	public void setParameterValuesFromSharedItem(String parameterValuesFromSharedItem) {
		this.parameterValuesFromSharedItem = parameterValuesFromSharedItem;
	}

	@OslcDescription("Description of SystemElement::parameterValuesFromSharedItem TBD")
	@OslcName("parameterValuesFromSharedItem")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_parameterValuesFromSharedItem")
	@OslcTitle("parameterValuesFromSharedItem")
	@OslcValueType(ValueType.XMLLiteral)
	public String getParameterValuesFromSharedItem() {
		 return parameterValuesFromSharedItem;
	}
	private String priority;

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@OslcDescription("Description of SystemElement::priority TBD")
	@OslcName("priority")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_priority")
	@OslcTitle("priority")
	@OslcValueType(ValueType.XMLLiteral)
	public String getPriority() {
		 return priority;
	}
	private String rationale;

	public void setRationale(String rationale) {
		this.rationale = rationale;
	}

	@OslcDescription("Description of SystemElement::rationale TBD")
	@OslcName("rationale")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_rationale")
	@OslcTitle("rationale")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRationale() {
		 return rationale;
	}
	private String risk;

	public void setRisk(String risk) {
		this.risk = risk;
	}

	@OslcDescription("Description of SystemElement::risk TBD")
	@OslcName("risk")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_risk")
	@OslcTitle("risk")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRisk() {
		 return risk;
	}
	private String source;

	public void setSource(String source) {
		this.source = source;
	}

	@OslcDescription("Description of SystemElement::source TBD")
	@OslcName("source")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_source")
	@OslcTitle("source")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSource() {
		 return source;
	}
	private int suspectCount;

	public void setSuspectCount(int suspectCount) {
		this.suspectCount = suspectCount;
	}

	@OslcDescription("Description of SystemElement::suspectCount TBD")
	@OslcName("suspectCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_suspectCount")
	@OslcTitle("suspectCount")
	public int getSuspectCount() {
		 return suspectCount;
	}
	private String oC_Text;

	public void setOC_Text(String oC_Text) {
		this.oC_Text = oC_Text;
	}

	@OslcDescription("Description of SystemElement::oC_Text TBD")
	@OslcName("oC_Text")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_oC_Text")
	@OslcTitle("oC_Text")
	@OslcValueType(ValueType.XMLLiteral)
	public String getOC_Text() {
		 return oC_Text;
	}
	private String traceStatus;

	public void setTraceStatus(String traceStatus) {
		this.traceStatus = traceStatus;
	}

	@OslcDescription("Description of SystemElement::traceStatus TBD")
	@OslcName("traceStatus")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_traceStatus")
	@OslcTitle("traceStatus")
	@OslcValueType(ValueType.XMLLiteral)
	public String getTraceStatus() {
		 return traceStatus;
	}
	private int upstreamTraceCount;

	public void setUpstreamTraceCount(int upstreamTraceCount) {
		this.upstreamTraceCount = upstreamTraceCount;
	}

	@OslcDescription("Description of SystemElement::upstreamTraceCount TBD")
	@OslcName("upstreamTraceCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_upstreamTraceCount")
	@OslcTitle("upstreamTraceCount")
	public int getUpstreamTraceCount() {
		 return upstreamTraceCount;
	}
	private boolean validChangeRequest;

	public void setValidChangeRequest(boolean validChangeRequest) {
		this.validChangeRequest = validChangeRequest;
	}

	@OslcDescription("Description of SystemElement::validChangeRequest TBD")
	@OslcName("validChangeRequest")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_validChangeRequest")
	@OslcTitle("validChangeRequest")
	public boolean getValidChangeRequest() {
		 return validChangeRequest;
	}
	private String windchillItem;

	public void setWindchillItem(String windchillItem) {
		this.windchillItem = windchillItem;
	}

	@OslcDescription("Description of SystemElement::windchillItem TBD")
	@OslcName("windchillItem")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_windchillItem")
	@OslcTitle("windchillItem")
	@OslcValueType(ValueType.XMLLiteral)
	public String getWindchillItem() {
		 return windchillItem;
	}
	private String projectPhase;

	public void setProjectPhase(String projectPhase) {
		this.projectPhase = projectPhase;
	}

	@OslcDescription("Description of SystemElement::projectPhase TBD")
	@OslcName("projectPhase")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_projectPhase")
	@OslcTitle("projectPhase")
	@OslcValueType(ValueType.XMLLiteral)
	public String getProjectPhase() {
		 return projectPhase;
	}
	private int verifiedByTraceCount;

	public void setVerifiedByTraceCount(int verifiedByTraceCount) {
		this.verifiedByTraceCount = verifiedByTraceCount;
	}

	@OslcDescription("Description of SystemElement::verifiedByTraceCount TBD")
	@OslcName("verifiedByTraceCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_verifiedByTraceCount")
	@OslcTitle("verifiedByTraceCount")
	public int getVerifiedByTraceCount() {
		 return verifiedByTraceCount;
	}
	private float verifiedByPassPercentage;

	public void setVerifiedByPassPercentage(float verifiedByPassPercentage) {
		this.verifiedByPassPercentage = verifiedByPassPercentage;
	}

	@OslcDescription("Description of SystemElement::verifiedByPassPercentage TBD")
	@OslcName("verifiedByPassPercentage")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_verifiedByPassPercentage")
	@OslcTitle("verifiedByPassPercentage")
	public float getVerifiedByPassPercentage() {
		 return verifiedByPassPercentage;
	}
	private String leadReviewer;

	public void setLeadReviewer(String leadReviewer) {
		this.leadReviewer = leadReviewer;
	}

	@OslcDescription("Description of SystemElement::leadReviewer TBD")
	@OslcName("leadReviewer")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_leadReviewer")
	@OslcTitle("leadReviewer")
	@OslcValueType(ValueType.XMLLiteral)
	public String getLeadReviewer() {
		 return leadReviewer;
	}
	private String assignedReviewers;

	public void setAssignedReviewers(String assignedReviewers) {
		this.assignedReviewers = assignedReviewers;
	}

	@OslcDescription("Description of SystemElement::assignedReviewers TBD")
	@OslcName("assignedReviewers")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_assignedReviewers")
	@OslcTitle("assignedReviewers")
	@OslcValueType(ValueType.XMLLiteral)
	public String getAssignedReviewers() {
		 return assignedReviewers;
	}
	private String assignedApprovers;

	public void setAssignedApprovers(String assignedApprovers) {
		this.assignedApprovers = assignedApprovers;
	}

	@OslcDescription("Description of SystemElement::assignedApprovers TBD")
	@OslcName("assignedApprovers")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_assignedApprovers")
	@OslcTitle("assignedApprovers")
	@OslcValueType(ValueType.XMLLiteral)
	public String getAssignedApprovers() {
		 return assignedApprovers;
	}
	private String requirementClassification;

	public void setRequirementClassification(String requirementClassification) {
		this.requirementClassification = requirementClassification;
	}

	@OslcDescription("Description of SystemElement::requirementClassification TBD")
	@OslcName("requirementClassification")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_requirementClassification")
	@OslcTitle("requirementClassification")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRequirementClassification() {
		 return requirementClassification;
	}
	private String riskRationale;

	public void setRiskRationale(String riskRationale) {
		this.riskRationale = riskRationale;
	}

	@OslcDescription("Description of SystemElement::riskRationale TBD")
	@OslcName("riskRationale")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_riskRationale")
	@OslcTitle("riskRationale")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRiskRationale() {
		 return riskRationale;
	}
	private String reviewDueDate;

	public void setReviewDueDate(String reviewDueDate) {
		this.reviewDueDate = reviewDueDate;
	}

	@OslcDescription("Description of SystemElement::reviewDueDate TBD")
	@OslcName("reviewDueDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_reviewDueDate")
	@OslcTitle("reviewDueDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReviewDueDate() {
		 return reviewDueDate;
	}
	private String reviewStatus;

	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	@OslcDescription("Description of SystemElement::reviewStatus TBD")
	@OslcName("reviewStatus")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_reviewStatus")
	@OslcTitle("reviewStatus")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReviewStatus() {
		 return reviewStatus;
	}
	private String vandVNecessity;

	public void setVandVNecessity(String vandVNecessity) {
		this.vandVNecessity = vandVNecessity;
	}

	@OslcDescription("Description of SystemElement::vandVNecessity TBD")
	@OslcName("vandVNecessity")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_vandVNecessity")
	@OslcTitle("vandVNecessity")
	@OslcValueType(ValueType.XMLLiteral)
	public String getVandVNecessity() {
		 return vandVNecessity;
	}
	private String vandVMethod;

	public void setVandVMethod(String vandVMethod) {
		this.vandVMethod = vandVMethod;
	}

	@OslcDescription("Description of SystemElement::vandVMethod TBD")
	@OslcName("vandVMethod")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_vandVMethod")
	@OslcTitle("vandVMethod")
	@OslcValueType(ValueType.XMLLiteral)
	public String getVandVMethod() {
		 return vandVMethod;
	}
	private String reviewHistory;

	public void setReviewHistory(String reviewHistory) {
		this.reviewHistory = reviewHistory;
	}

	@OslcDescription("Description of SystemElement::reviewHistory TBD")
	@OslcName("reviewHistory")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_reviewHistory")
	@OslcTitle("reviewHistory")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReviewHistory() {
		 return reviewHistory;
	}
	private String reviewHistoryMetadata;

	public void setReviewHistoryMetadata(String reviewHistoryMetadata) {
		this.reviewHistoryMetadata = reviewHistoryMetadata;
	}

	@OslcDescription("Description of SystemElement::reviewHistoryMetadata TBD")
	@OslcName("reviewHistoryMetadata")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_reviewHistoryMetadata")
	@OslcTitle("reviewHistoryMetadata")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReviewHistoryMetadata() {
		 return reviewHistoryMetadata;
	}
	private String iPRiskClassification;

	public void setIPRiskClassification(String iPRiskClassification) {
		this.iPRiskClassification = iPRiskClassification;
	}

	@OslcDescription("Description of SystemElement::iPRiskClassification TBD")
	@OslcName("iPRiskClassification")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_iPRiskClassification")
	@OslcTitle("iPRiskClassification")
	@OslcValueType(ValueType.XMLLiteral)
	public String getIPRiskClassification() {
		 return iPRiskClassification;
	}
	private String keyWords;

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	@OslcDescription("Description of SystemElement::keyWords TBD")
	@OslcName("keyWords")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_keyWords")
	@OslcTitle("keyWords")
	@OslcValueType(ValueType.XMLLiteral)
	public String getKeyWords() {
		 return keyWords;
	}
	private String assignedtoUserorGroup;

	public void setAssignedtoUserorGroup(String assignedtoUserorGroup) {
		this.assignedtoUserorGroup = assignedtoUserorGroup;
	}

	@OslcDescription("Description of SystemElement::assignedtoUserorGroup TBD")
	@OslcName("assignedtoUserorGroup")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_assignedtoUserorGroup")
	@OslcTitle("assignedtoUserorGroup")
	@OslcValueType(ValueType.XMLLiteral)
	public String getAssignedtoUserorGroup() {
		 return assignedtoUserorGroup;
	}
	private String reports;

	public void setReports(String reports) {
		this.reports = reports;
	}

	@OslcDescription("Description of SystemElement::reports TBD")
	@OslcName("reports")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_reports")
	@OslcTitle("reports")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReports() {
		 return reports;
	}
	private boolean enterDetails;

	public void setEnterDetails(boolean enterDetails) {
		this.enterDetails = enterDetails;
	}

	@OslcDescription("Description of SystemElement::enterDetails TBD")
	@OslcName("enterDetails")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_enterDetails")
	@OslcTitle("enterDetails")
	public boolean getEnterDetails() {
		 return enterDetails;
	}
	private String createdbyUserorGroup;

	public void setCreatedbyUserorGroup(String createdbyUserorGroup) {
		this.createdbyUserorGroup = createdbyUserorGroup;
	}

	@OslcDescription("Description of SystemElement::createdbyUserorGroup TBD")
	@OslcName("createdbyUserorGroup")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_createdbyUserorGroup")
	@OslcTitle("createdbyUserorGroup")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCreatedbyUserorGroup() {
		 return createdbyUserorGroup;
	}
	private String summaryfieldofthecontainingdocument;

	public void setSummaryfieldofthecontainingdocument(String summaryfieldofthecontainingdocument) {
		this.summaryfieldofthecontainingdocument = summaryfieldofthecontainingdocument;
	}

	@OslcDescription("Description of SystemElement::summaryfieldofthecontainingdocument TBD")
	@OslcName("summaryfieldofthecontainingdocument")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_summaryfieldofthecontainingdocument")
	@OslcTitle("summaryfieldofthecontainingdocument")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSummaryfieldofthecontainingdocument() {
		 return summaryfieldofthecontainingdocument;
	}
	private String text;

	public void setText(String text) {
		this.text = text;
	}

	@OslcDescription("Description of SystemElement::text TBD")
	@OslcName("text")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_text")
	@OslcTitle("text")
	@OslcValueType(ValueType.XMLLiteral)
	public String getText() {
		 return text;
	}
	private String statement;

	public void setStatement(String statement) {
		this.statement = statement;
	}

	@OslcDescription("Description of SystemElement::statement TBD")
	@OslcName("statement")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_statement")
	@OslcTitle("statement")
	@OslcValueType(ValueType.XMLLiteral)
	public String getStatement() {
		 return statement;
	}
	private String summaryOnSharedItem;

	public void setSummaryOnSharedItem(String summaryOnSharedItem) {
		this.summaryOnSharedItem = summaryOnSharedItem;
	}

	@OslcDescription("Description of SystemElement::summaryOnSharedItem TBD")
	@OslcName("summaryOnSharedItem")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_summaryOnSharedItem")
	@OslcTitle("summaryOnSharedItem")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSummaryOnSharedItem() {
		 return summaryOnSharedItem;
	}
	private String name_;

	public void setName_(String name_) {
		this.name_ = name_;
	}

	@OslcDescription("Description of SystemElement::name_ TBD")
	@OslcName("name_")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_name_")
	@OslcTitle("name_")
	@OslcValueType(ValueType.XMLLiteral)
	public String getName_() {
		 return name_;
	}
	private String backingItemonSegment;

	public void setBackingItemonSegment(String backingItemonSegment) {
		this.backingItemonSegment = backingItemonSegment;
	}

	@OslcDescription("Description of SystemElement::backingItemonSegment TBD")
	@OslcName("backingItemonSegment")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_backingItemonSegment")
	@OslcTitle("backingItemonSegment")
	@OslcValueType(ValueType.XMLLiteral)
	public String getBackingItemonSegment() {
		 return backingItemonSegment;
	}
	private String backingItemonNode;

	public void setBackingItemonNode(String backingItemonNode) {
		this.backingItemonNode = backingItemonNode;
	}

	@OslcDescription("Description of SystemElement::backingItemonNode TBD")
	@OslcName("backingItemonNode")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_backingItemonNode")
	@OslcTitle("backingItemonNode")
	@OslcValueType(ValueType.XMLLiteral)
	public String getBackingItemonNode() {
		 return backingItemonNode;
	}
	private boolean enterDetailSelected;

	public void setEnterDetailSelected(boolean enterDetailSelected) {
		this.enterDetailSelected = enterDetailSelected;
	}

	@OslcDescription("Description of SystemElement::enterDetailSelected TBD")
	@OslcName("enterDetailSelected")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_enterDetailSelected")
	@OslcTitle("enterDetailSelected")
	public boolean getEnterDetailSelected() {
		 return enterDetailSelected;
	}
	private String systemLevel;

	public void setSystemLevel(String systemLevel) {
		this.systemLevel = systemLevel;
	}

	@OslcDescription("Description of SystemElement::systemLevel TBD")
	@OslcName("systemLevel")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_systemLevel")
	@OslcTitle("systemLevel")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSystemLevel() {
		 return systemLevel;
	}
	private String modularity;

	public void setModularity(String modularity) {
		this.modularity = modularity;
	}

	@OslcDescription("Description of SystemElement::modularity TBD")
	@OslcName("modularity")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_modularity")
	@OslcTitle("modularity")
	@OslcValueType(ValueType.XMLLiteral)
	public String getModularity() {
		 return modularity;
	}
	private boolean standardPart;

	public void setStandardPart(boolean standardPart) {
		this.standardPart = standardPart;
	}

	@OslcDescription("Description of SystemElement::standardPart TBD")
	@OslcName("standardPart")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_standardPart")
	@OslcTitle("standardPart")
	public boolean getStandardPart() {
		 return standardPart;
	}
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@OslcDescription("Description of SystemElement::name TBD")
	@OslcName("name")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_name")
	@OslcTitle("name")
	@OslcValueType(ValueType.XMLLiteral)
	public String getName() {
		 return name;
	}
	private String referencetoBackingItemonSegment;

	public void setReferencetoBackingItemonSegment(String referencetoBackingItemonSegment) {
		this.referencetoBackingItemonSegment = referencetoBackingItemonSegment;
	}

	@OslcDescription("Description of SystemElement::referencetoBackingItemonSegment TBD")
	@OslcName("referencetoBackingItemonSegment")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_referencetoBackingItemonSegment")
	@OslcTitle("referencetoBackingItemonSegment")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReferencetoBackingItemonSegment() {
		 return referencetoBackingItemonSegment;
	}
	private String text_;

	public void setText_(String text_) {
		this.text_ = text_;
	}

	@OslcDescription("Description of SystemElement::text_ TBD")
	@OslcName("text_")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_text_")
	@OslcTitle("text_")
	@OslcValueType(ValueType.XMLLiteral)
	public String getText_() {
		 return text_;
	}
	private int minorVersionID;

	public void setMinorVersionID(int minorVersionID) {
		this.minorVersionID = minorVersionID;
	}

	@OslcDescription("Description of SystemElement::minorVersionID TBD")
	@OslcName("minorVersionID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_minorVersionID")
	@OslcTitle("minorVersionID")
	public int getMinorVersionID() {
		 return minorVersionID;
	}
	private int majorVersionID;

	public void setMajorVersionID(int majorVersionID) {
		this.majorVersionID = majorVersionID;
	}

	@OslcDescription("Description of SystemElement::majorVersionID TBD")
	@OslcName("majorVersionID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_majorVersionID")
	@OslcTitle("majorVersionID")
	public int getMajorVersionID() {
		 return majorVersionID;
	}
	private int liveItemID;

	public void setLiveItemID(int liveItemID) {
		this.liveItemID = liveItemID;
	}

	@OslcDescription("Description of SystemElement::liveItemID TBD")
	@OslcName("liveItemID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_liveItemID")
	@OslcTitle("liveItemID")
	public int getLiveItemID() {
		 return liveItemID;
	}
	private String bookmarks;

	public void setBookmarks(String bookmarks) {
		this.bookmarks = bookmarks;
	}

	@OslcDescription("Description of SystemElement::bookmarks TBD")
	@OslcName("bookmarks")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_bookmarks")
	@OslcTitle("bookmarks")
	@OslcValueType(ValueType.XMLLiteral)
	public String getBookmarks() {
		 return bookmarks;
	}
	private String signatureComment;

	public void setSignatureComment(String signatureComment) {
		this.signatureComment = signatureComment;
	}

	@OslcDescription("Description of SystemElement::signatureComment TBD")
	@OslcName("signatureComment")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_signatureComment")
	@OslcTitle("signatureComment")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSignatureComment() {
		 return signatureComment;
	}
	private String signedBy;

	public void setSignedBy(String signedBy) {
		this.signedBy = signedBy;
	}

	@OslcDescription("Description of SystemElement::signedBy TBD")
	@OslcName("signedBy")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_signedBy")
	@OslcTitle("signedBy")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSignedBy() {
		 return signedBy;
	}
	private int iD;

	public void setID(int iD) {
		this.iD = iD;
	}

	@OslcDescription("Description of SystemElement::iD TBD")
	@OslcName("iD")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_iD")
	@OslcTitle("iD")
	public int getID() {
		 return iD;
	}
	private String modifiedBy;

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@OslcDescription("Description of SystemElement::modifiedBy TBD")
	@OslcName("modifiedBy")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_modifiedBy")
	@OslcTitle("modifiedBy")
	@OslcValueType(ValueType.XMLLiteral)
	public String getModifiedBy() {
		 return modifiedBy;
	}
	private String createdBy;

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@OslcDescription("Description of SystemElement::createdBy TBD")
	@OslcName("createdBy")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_createdBy")
	@OslcTitle("createdBy")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCreatedBy() {
		 return createdBy;
	}
	private String modifiedDate;

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@OslcDescription("Description of SystemElement::modifiedDate TBD")
	@OslcName("modifiedDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_modifiedDate")
	@OslcTitle("modifiedDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getModifiedDate() {
		 return modifiedDate;
	}
	private String createdDate;

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@OslcDescription("Description of SystemElement::createdDate TBD")
	@OslcName("createdDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_createdDate")
	@OslcTitle("createdDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCreatedDate() {
		 return createdDate;
	}
	private String category;

	public void setCategory(String category) {
		this.category = category;
	}

	@OslcDescription("Description of SystemElement::category TBD")
	@OslcName("category")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_category")
	@OslcTitle("category")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCategory() {
		 return category;
	}
	private String referenceMode;

	public void setReferenceMode(String referenceMode) {
		this.referenceMode = referenceMode;
	}

	@OslcDescription("Description of SystemElement::referenceMode TBD")
	@OslcName("referenceMode")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_referenceMode")
	@OslcTitle("referenceMode")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReferenceMode() {
		 return referenceMode;
	}
	private int documentID;

	public void setDocumentID(int documentID) {
		this.documentID = documentID;
	}

	@OslcDescription("Description of SystemElement::documentID TBD")
	@OslcName("documentID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_documentID")
	@OslcTitle("documentID")
	public int getDocumentID() {
		 return documentID;
	}
	private String subsegmentName;

	public void setSubsegmentName(String subsegmentName) {
		this.subsegmentName = subsegmentName;
	}

	@OslcDescription("Description of SystemElement::subsegmentName TBD")
	@OslcName("subsegmentName")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_subsegmentName")
	@OslcTitle("subsegmentName")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSubsegmentName() {
		 return subsegmentName;
	}
	private String referencedItemType;

	public void setReferencedItemType(String referencedItemType) {
		this.referencedItemType = referencedItemType;
	}

	@OslcDescription("Description of SystemElement::referencedItemType TBD")
	@OslcName("referencedItemType")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_referencedItemType")
	@OslcTitle("referencedItemType")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReferencedItemType() {
		 return referencedItemType;
	}
	private int rootID;

	public void setRootID(int rootID) {
		this.rootID = rootID;
	}

	@OslcDescription("Description of SystemElement::rootID TBD")
	@OslcName("rootID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_rootID")
	@OslcTitle("rootID")
	public int getRootID() {
		 return rootID;
	}
	private String referencedBookmarks;

	public void setReferencedBookmarks(String referencedBookmarks) {
		this.referencedBookmarks = referencedBookmarks;
	}

	@OslcDescription("Description of SystemElement::referencedBookmarks TBD")
	@OslcName("referencedBookmarks")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_referencedBookmarks")
	@OslcTitle("referencedBookmarks")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReferencedBookmarks() {
		 return referencedBookmarks;
	}
	private String inputRevisionDate;

	public void setInputRevisionDate(String inputRevisionDate) {
		this.inputRevisionDate = inputRevisionDate;
	}

	@OslcDescription("Description of SystemElement::inputRevisionDate TBD")
	@OslcName("inputRevisionDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_inputRevisionDate")
	@OslcTitle("inputRevisionDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getInputRevisionDate() {
		 return inputRevisionDate;
	}
	private String significantEditDate;

	public void setSignificantEditDate(String significantEditDate) {
		this.significantEditDate = significantEditDate;
	}

	@OslcDescription("Description of SystemElement::significantEditDate TBD")
	@OslcName("significantEditDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_significantEditDate")
	@OslcTitle("significantEditDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSignificantEditDate() {
		 return significantEditDate;
	}
	private String itemSignificantEditDateonSharedItem;

	public void setItemSignificantEditDateonSharedItem(String itemSignificantEditDateonSharedItem) {
		this.itemSignificantEditDateonSharedItem = itemSignificantEditDateonSharedItem;
	}

	@OslcDescription("Description of SystemElement::itemSignificantEditDateonSharedItem TBD")
	@OslcName("itemSignificantEditDateonSharedItem")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_itemSignificantEditDateonSharedItem")
	@OslcTitle("itemSignificantEditDateonSharedItem")
	@OslcValueType(ValueType.XMLLiteral)
	public String getItemSignificantEditDateonSharedItem() {
		 return itemSignificantEditDateonSharedItem;
	}
	private String revision;

	public void setRevision(String revision) {
		this.revision = revision;
	}

	@OslcDescription("Description of SystemElement::revision TBD")
	@OslcName("revision")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_revision")
	@OslcTitle("revision")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRevision() {
		 return revision;
	}
	private String revisionIncrementDate;

	public void setRevisionIncrementDate(String revisionIncrementDate) {
		this.revisionIncrementDate = revisionIncrementDate;
	}

	@OslcDescription("Description of SystemElement::revisionIncrementDate TBD")
	@OslcName("revisionIncrementDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_revisionIncrementDate")
	@OslcTitle("revisionIncrementDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRevisionIncrementDate() {
		 return revisionIncrementDate;
	}
	private boolean significantChangeSinceItemRevision;

	public void setSignificantChangeSinceItemRevision(boolean significantChangeSinceItemRevision) {
		this.significantChangeSinceItemRevision = significantChangeSinceItemRevision;
	}

	@OslcDescription("Description of SystemElement::significantChangeSinceItemRevision TBD")
	@OslcName("significantChangeSinceItemRevision")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_significantChangeSinceItemRevision")
	@OslcTitle("significantChangeSinceItemRevision")
	public boolean getSignificantChangeSinceItemRevision() {
		 return significantChangeSinceItemRevision;
	}
	// ********* project *********
	private URI project;

	public void setProject(final URI project) {
		this.project = project;
	}

	@OslcDescription("Description of SystemElement::project TBD")
	@OslcName("project")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_project")
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

	@OslcDescription("Description of SystemElement::attachments TBD")
	@OslcName("attachments")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_attachments")
	@OslcTitle("attachments")
	@OslcReadOnly(false)
	public Link[]  getAttachments() {
		 return attachments.toArray(new Link[attachments.size()]);
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

	@OslcDescription("Description of SystemElement::changesAuthorizedBy TBD")
	@OslcName("changesAuthorizedBy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_changesAuthorizedBy")
	@OslcTitle("changesAuthorizedBy")
	@OslcReadOnly(false)
	public Link[]  getChangesAuthorizedBy() {
		 return changesAuthorizedBy.toArray(new Link[changesAuthorizedBy.size()]);
	}

	// ********* isRelatedTo *********
	private final Set<Link> isRelatedTo = new HashSet<Link>();

	public void setIsRelatedTo(final Link[] isRelatedTo) {
		this.isRelatedTo.clear();
		if (isRelatedTo != null)
		{
			this.isRelatedTo.addAll(Arrays.asList(isRelatedTo));
		}
	}

	@OslcDescription("Description of SystemElement::isRelatedTo TBD")
	@OslcName("isRelatedTo")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_isRelatedTo")
	@OslcTitle("isRelatedTo")
	@OslcReadOnly(false)
	public Link[]  getIsRelatedTo() {
		 return isRelatedTo.toArray(new Link[isRelatedTo.size()]);
	}

	// ********* relatedTo *********
	private final Set<Link> relatedTo = new HashSet<Link>();

	public void setRelatedTo(final Link[] relatedTo) {
		this.relatedTo.clear();
		if (relatedTo != null)
		{
			this.relatedTo.addAll(Arrays.asList(relatedTo));
		}
	}

	@OslcDescription("Description of SystemElement::relatedTo TBD")
	@OslcName("relatedTo")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_relatedTo")
	@OslcTitle("relatedTo")
	@OslcReadOnly(false)
	public Link[]  getRelatedTo() {
		 return relatedTo.toArray(new Link[relatedTo.size()]);
	}

	// ********* satisfiedBy *********
	private final Set<Link> satisfiedBy = new HashSet<Link>();

	public void setSatisfiedBy(final Link[] satisfiedBy) {
		this.satisfiedBy.clear();
		if (satisfiedBy != null)
		{
			this.satisfiedBy.addAll(Arrays.asList(satisfiedBy));
		}
	}

	@OslcDescription("Description of SystemElement::satisfiedBy TBD")
	@OslcName("satisfiedBy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_satisfiedBy")
	@OslcTitle("satisfiedBy")
	@OslcReadOnly(false)
	public Link[]  getSatisfiedBy() {
		 return satisfiedBy.toArray(new Link[satisfiedBy.size()]);
	}

	// ********* oC_Satisfies *********
	private final Set<Link> oC_Satisfies = new HashSet<Link>();

	public void setOC_Satisfies(final Link[] oC_Satisfies) {
		this.oC_Satisfies.clear();
		if (oC_Satisfies != null)
		{
			this.oC_Satisfies.addAll(Arrays.asList(oC_Satisfies));
		}
	}

	@OslcDescription("Description of SystemElement::oC_Satisfies TBD")
	@OslcName("oC_Satisfies")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_oC_Satisfies")
	@OslcTitle("oC_Satisfies")
	@OslcReadOnly(false)
	public Link[]  getOC_Satisfies() {
		 return oC_Satisfies.toArray(new Link[oC_Satisfies.size()]);
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

	@OslcDescription("Description of SystemElement::spawns TBD")
	@OslcName("spawns")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_spawns")
	@OslcTitle("spawns")
	@OslcReadOnly(false)
	public Link[]  getSpawns() {
		 return spawns.toArray(new Link[spawns.size()]);
	}

	// ********* textAttachments *********
	private final Set<Link> textAttachments = new HashSet<Link>();

	public void setTextAttachments(final Link[] textAttachments) {
		this.textAttachments.clear();
		if (textAttachments != null)
		{
			this.textAttachments.addAll(Arrays.asList(textAttachments));
		}
	}

	@OslcDescription("Description of SystemElement::textAttachments TBD")
	@OslcName("textAttachments")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_textAttachments")
	@OslcTitle("textAttachments")
	@OslcReadOnly(false)
	public Link[]  getTextAttachments() {
		 return textAttachments.toArray(new Link[textAttachments.size()]);
	}

	// ********* verifiedBy *********
	private final Set<Link> verifiedBy = new HashSet<Link>();

	public void setVerifiedBy(final Link[] verifiedBy) {
		this.verifiedBy.clear();
		if (verifiedBy != null)
		{
			this.verifiedBy.addAll(Arrays.asList(verifiedBy));
		}
	}

	@OslcDescription("Description of SystemElement::verifiedBy TBD")
	@OslcName("verifiedBy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_verifiedBy")
	@OslcTitle("verifiedBy")
	@OslcReadOnly(false)
	public Link[]  getVerifiedBy() {
		 return verifiedBy.toArray(new Link[verifiedBy.size()]);
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

	@OslcDescription("Description of SystemElement::reviewTasks TBD")
	@OslcName("reviewTasks")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_reviewTasks")
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

	@OslcDescription("Description of SystemElement::itemReviewSessions TBD")
	@OslcName("itemReviewSessions")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_itemReviewSessions")
	@OslcTitle("itemReviewSessions")
	@OslcReadOnly(false)
	public Link[]  getItemReviewSessions() {
		 return itemReviewSessions.toArray(new Link[itemReviewSessions.size()]);
	}

	// ********* documentReviewTasks *********
	private final Set<Link> documentReviewTasks = new HashSet<Link>();

	public void setDocumentReviewTasks(final Link[] documentReviewTasks) {
		this.documentReviewTasks.clear();
		if (documentReviewTasks != null)
		{
			this.documentReviewTasks.addAll(Arrays.asList(documentReviewTasks));
		}
	}

	@OslcDescription("Description of SystemElement::documentReviewTasks TBD")
	@OslcName("documentReviewTasks")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_documentReviewTasks")
	@OslcTitle("documentReviewTasks")
	@OslcReadOnly(false)
	public Link[]  getDocumentReviewTasks() {
		 return documentReviewTasks.toArray(new Link[documentReviewTasks.size()]);
	}

	// ********* functionalAllocation *********
	private final Set<Link> functionalAllocation = new HashSet<Link>();

	public void setFunctionalAllocation(final Link[] functionalAllocation) {
		this.functionalAllocation.clear();
		if (functionalAllocation != null)
		{
			this.functionalAllocation.addAll(Arrays.asList(functionalAllocation));
		}
	}

	@OslcDescription("Description of SystemElement::functionalAllocation TBD")
	@OslcName("functionalAllocation")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_functionalAllocation")
	@OslcTitle("functionalAllocation")
	@OslcReadOnly(false)
	public Link[]  getFunctionalAllocation() {
		 return functionalAllocation.toArray(new Link[functionalAllocation.size()]);
	}

	// ********* systemAllocation *********
	private final Set<Link> systemAllocation = new HashSet<Link>();

	public void setSystemAllocation(final Link[] systemAllocation) {
		this.systemAllocation.clear();
		if (systemAllocation != null)
		{
			this.systemAllocation.addAll(Arrays.asList(systemAllocation));
		}
	}

	@OslcDescription("Description of SystemElement::systemAllocation TBD")
	@OslcName("systemAllocation")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_systemAllocation")
	@OslcTitle("systemAllocation")
	@OslcReadOnly(false)
	public Link[]  getSystemAllocation() {
		 return systemAllocation.toArray(new Link[systemAllocation.size()]);
	}

	// ********* derives *********
	private final Set<Link> derives = new HashSet<Link>();

	public void setDerives(final Link[] derives) {
		this.derives.clear();
		if (derives != null)
		{
			this.derives.addAll(Arrays.asList(derives));
		}
	}

	@OslcDescription("Description of SystemElement::derives TBD")
	@OslcName("derives")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_derives")
	@OslcTitle("derives")
	@OslcReadOnly(false)
	public Link[]  getDerives() {
		 return derives.toArray(new Link[derives.size()]);
	}

	// ********* satisfies *********
	private final Set<Link> satisfies = new HashSet<Link>();

	public void setSatisfies(final Link[] satisfies) {
		this.satisfies.clear();
		if (satisfies != null)
		{
			this.satisfies.addAll(Arrays.asList(satisfies));
		}
	}

	@OslcDescription("Description of SystemElement::satisfies TBD")
	@OslcName("satisfies")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_satisfies")
	@OslcTitle("satisfies")
	@OslcReadOnly(false)
	public Link[]  getSatisfies() {
		 return satisfies.toArray(new Link[satisfies.size()]);
	}

	// ********* derivedFrom *********
	private final Set<Link> derivedFrom = new HashSet<Link>();

	public void setDerivedFrom(final Link[] derivedFrom) {
		this.derivedFrom.clear();
		if (derivedFrom != null)
		{
			this.derivedFrom.addAll(Arrays.asList(derivedFrom));
		}
	}

	@OslcDescription("Description of SystemElement::derivedFrom TBD")
	@OslcName("derivedFrom")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_derivedFrom")
	@OslcTitle("derivedFrom")
	@OslcReadOnly(false)
	public Link[]  getDerivedFrom() {
		 return derivedFrom.toArray(new Link[derivedFrom.size()]);
	}

	// ********* allocatedTo *********
	private final Set<Link> allocatedTo = new HashSet<Link>();

	public void setAllocatedTo(final Link[] allocatedTo) {
		this.allocatedTo.clear();
		if (allocatedTo != null)
		{
			this.allocatedTo.addAll(Arrays.asList(allocatedTo));
		}
	}

	@OslcDescription("Description of SystemElement::allocatedTo TBD")
	@OslcName("allocatedTo")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_allocatedTo")
	@OslcTitle("allocatedTo")
	@OslcReadOnly(false)
	public Link[]  getAllocatedTo() {
		 return allocatedTo.toArray(new Link[allocatedTo.size()]);
	}

	// ********* requiredBy *********
	private final Set<Link> requiredBy = new HashSet<Link>();

	public void setRequiredBy(final Link[] requiredBy) {
		this.requiredBy.clear();
		if (requiredBy != null)
		{
			this.requiredBy.addAll(Arrays.asList(requiredBy));
		}
	}

	@OslcDescription("Description of SystemElement::requiredBy TBD")
	@OslcName("requiredBy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_requiredBy")
	@OslcTitle("requiredBy")
	@OslcReadOnly(false)
	public Link[]  getRequiredBy() {
		 return requiredBy.toArray(new Link[requiredBy.size()]);
	}

	// ********* comprises *********
	private final Set<Link> comprises = new HashSet<Link>();

	public void setComprises(final Link[] comprises) {
		this.comprises.clear();
		if (comprises != null)
		{
			this.comprises.addAll(Arrays.asList(comprises));
		}
	}

	@OslcDescription("Description of SystemElement::comprises TBD")
	@OslcName("comprises")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_comprises")
	@OslcTitle("comprises")
	@OslcReadOnly(false)
	public Link[]  getComprises() {
		 return comprises.toArray(new Link[comprises.size()]);
	}

	// ********* varies *********
	private final Set<Link> varies = new HashSet<Link>();

	public void setVaries(final Link[] varies) {
		this.varies.clear();
		if (varies != null)
		{
			this.varies.addAll(Arrays.asList(varies));
		}
	}

	@OslcDescription("Description of SystemElement::varies TBD")
	@OslcName("varies")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_varies")
	@OslcTitle("varies")
	@OslcReadOnly(false)
	public Link[]  getVaries() {
		 return varies.toArray(new Link[varies.size()]);
	}

	// ********* interacts *********
	private final Set<Link> interacts = new HashSet<Link>();

	public void setInteracts(final Link[] interacts) {
		this.interacts.clear();
		if (interacts != null)
		{
			this.interacts.addAll(Arrays.asList(interacts));
		}
	}

	@OslcDescription("Description of SystemElement::interacts TBD")
	@OslcName("interacts")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_interacts")
	@OslcTitle("interacts")
	@OslcReadOnly(false)
	public Link[]  getInteracts() {
		 return interacts.toArray(new Link[interacts.size()]);
	}

	// ********* partOf *********
	private final Set<Link> partOf = new HashSet<Link>();

	public void setPartOf(final Link[] partOf) {
		this.partOf.clear();
		if (partOf != null)
		{
			this.partOf.addAll(Arrays.asList(partOf));
		}
	}

	@OslcDescription("Description of SystemElement::partOf TBD")
	@OslcName("partOf")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_partOf")
	@OslcTitle("partOf")
	@OslcReadOnly(false)
	public Link[]  getPartOf() {
		 return partOf.toArray(new Link[partOf.size()]);
	}

	// ********* variesWith *********
	private final Set<Link> variesWith = new HashSet<Link>();

	public void setVariesWith(final Link[] variesWith) {
		this.variesWith.clear();
		if (variesWith != null)
		{
			this.variesWith.addAll(Arrays.asList(variesWith));
		}
	}

	@OslcDescription("Description of SystemElement::variesWith TBD")
	@OslcName("variesWith")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_variesWith")
	@OslcTitle("variesWith")
	@OslcReadOnly(false)
	public Link[]  getVariesWith() {
		 return variesWith.toArray(new Link[variesWith.size()]);
	}

	// ********* interactWith *********
	private final Set<Link> interactWith = new HashSet<Link>();

	public void setInteractWith(final Link[] interactWith) {
		this.interactWith.clear();
		if (interactWith != null)
		{
			this.interactWith.addAll(Arrays.asList(interactWith));
		}
	}

	@OslcDescription("Description of SystemElement::interactWith TBD")
	@OslcName("interactWith")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_interactWith")
	@OslcTitle("interactWith")
	@OslcReadOnly(false)
	public Link[]  getInteractWith() {
		 return interactWith.toArray(new Link[interactWith.size()]);
	}

	// ********* type *********
	private URI type;

	public void setType(final URI type) {
		this.type = type;
	}

	@OslcDescription("Description of SystemElement::type TBD")
	@OslcName("type")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_type")
	@OslcTitle("type")
	@OslcRange("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemHierarchy")
	public URI  getType() {
		 return type;
	}

	// ********* references *********
	private final Set<Link> references = new HashSet<Link>();

	public void setReferences(final Link[] references) {
		this.references.clear();
		if (references != null)
		{
			this.references.addAll(Arrays.asList(references));
		}
	}

	@OslcDescription("Description of SystemElement::references TBD")
	@OslcName("references")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_references")
	@OslcTitle("references")
	@OslcReadOnly(false)
	public Link[]  getReferences() {
		 return references.toArray(new Link[references.size()]);
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

	@OslcDescription("Description of SystemElement::contains TBD")
	@OslcName("contains")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_contains")
	@OslcTitle("contains")
	@OslcReadOnly(false)
	public Link[]  getContains() {
		 return contains.toArray(new Link[contains.size()]);
	}

	// ********* containedBy *********
	private final Set<Link> containedBy = new HashSet<Link>();

	public void setContainedBy(final Link[] containedBy) {
		this.containedBy.clear();
		if (containedBy != null)
		{
			this.containedBy.addAll(Arrays.asList(containedBy));
		}
	}

	@OslcDescription("Description of SystemElement::containedBy TBD")
	@OslcName("containedBy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_containedBy")
	@OslcTitle("containedBy")
	@OslcReadOnly(false)
	public Link[]  getContainedBy() {
		 return containedBy.toArray(new Link[containedBy.size()]);
	}

	// ********* shares *********
	private final Set<Link> shares = new HashSet<Link>();

	public void setShares(final Link[] shares) {
		this.shares.clear();
		if (shares != null)
		{
			this.shares.addAll(Arrays.asList(shares));
		}
	}

	@OslcDescription("Description of SystemElement::shares TBD")
	@OslcName("shares")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_shares")
	@OslcTitle("shares")
	@OslcReadOnly(false)
	public Link[]  getShares() {
		 return shares.toArray(new Link[shares.size()]);
	}

	// ********* sharedBy *********
	private final Set<Link> sharedBy = new HashSet<Link>();

	public void setSharedBy(final Link[] sharedBy) {
		this.sharedBy.clear();
		if (sharedBy != null)
		{
			this.sharedBy.addAll(Arrays.asList(sharedBy));
		}
	}

	@OslcDescription("Description of SystemElement::sharedBy TBD")
	@OslcName("sharedBy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SystemElement_sharedBy")
	@OslcTitle("sharedBy")
	@OslcReadOnly(false)
	public Link[]  getSharedBy() {
		 return sharedBy.toArray(new Link[sharedBy.size()]);
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