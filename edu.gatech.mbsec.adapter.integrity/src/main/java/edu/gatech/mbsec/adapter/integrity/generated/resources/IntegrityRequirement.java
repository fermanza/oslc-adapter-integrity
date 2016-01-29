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
@OslcName("Requirement")
@OslcResourceShape(title = "Requirement Resource Shape", describes = Constants.TYPE_INTEGRITY_REQUIREMENT)
public class IntegrityRequirement extends AbstractResource{

	public IntegrityRequirement() throws URISyntaxException {
		super();
	}
	public IntegrityRequirement(URI about) throws URISyntaxException {
		super(about);
	}

	private String summary;

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@OslcDescription("Description of Requirement::summary TBD")
	@OslcName("summary")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_summary")
	@OslcTitle("summary")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSummary() {
		 return summary;
	}
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	@OslcDescription("Description of Requirement::state TBD")
	@OslcName("state")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_state")
	@OslcTitle("state")
	@OslcValueType(ValueType.XMLLiteral)
	public String getState() {
		 return state;
	}
	private String assignedUser;

	public void setAssignedUser(String assignedUser) {
		this.assignedUser = assignedUser;
	}

	@OslcDescription("Description of Requirement::assignedUser TBD")
	@OslcName("assignedUser")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_assignedUser")
	@OslcTitle("assignedUser")
	@OslcValueType(ValueType.XMLLiteral)
	public String getAssignedUser() {
		 return assignedUser;
	}
	private String parameters;

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}

	@OslcDescription("Description of Requirement::parameters TBD")
	@OslcName("parameters")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_parameters")
	@OslcTitle("parameters")
	@OslcValueType(ValueType.XMLLiteral)
	public String getParameters() {
		 return parameters;
	}
	private String parameterValues;

	public void setParameterValues(String parameterValues) {
		this.parameterValues = parameterValues;
	}

	@OslcDescription("Description of Requirement::parameterValues TBD")
	@OslcName("parameterValues")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_parameterValues")
	@OslcTitle("parameterValues")
	@OslcValueType(ValueType.XMLLiteral)
	public String getParameterValues() {
		 return parameterValues;
	}
	private int authorizingChangeRequest;

	public void setAuthorizingChangeRequest(int authorizingChangeRequest) {
		this.authorizingChangeRequest = authorizingChangeRequest;
	}

	@OslcDescription("Description of Requirement::authorizingChangeRequest TBD")
	@OslcName("authorizingChangeRequest")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_authorizingChangeRequest")
	@OslcTitle("authorizingChangeRequest")
	public int getAuthorizingChangeRequest() {
		 return authorizingChangeRequest;
	}
	private int downstreamTraceCount;

	public void setDownstreamTraceCount(int downstreamTraceCount) {
		this.downstreamTraceCount = downstreamTraceCount;
	}

	@OslcDescription("Description of Requirement::downstreamTraceCount TBD")
	@OslcName("downstreamTraceCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_downstreamTraceCount")
	@OslcTitle("downstreamTraceCount")
	public int getDownstreamTraceCount() {
		 return downstreamTraceCount;
	}
	private String externalID;

	public void setExternalID(String externalID) {
		this.externalID = externalID;
	}

	@OslcDescription("Description of Requirement::externalID TBD")
	@OslcName("externalID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_externalID")
	@OslcTitle("externalID")
	@OslcValueType(ValueType.XMLLiteral)
	public String getExternalID() {
		 return externalID;
	}
	private boolean includeReference;

	public void setIncludeReference(boolean includeReference) {
		this.includeReference = includeReference;
	}

	@OslcDescription("Description of Requirement::includeReference TBD")
	@OslcName("includeReference")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_includeReference")
	@OslcTitle("includeReference")
	public boolean getIncludeReference() {
		 return includeReference;
	}
	private boolean includeSubsegmentinMetrics;

	public void setIncludeSubsegmentinMetrics(boolean includeSubsegmentinMetrics) {
		this.includeSubsegmentinMetrics = includeSubsegmentinMetrics;
	}

	@OslcDescription("Description of Requirement::includeSubsegmentinMetrics TBD")
	@OslcName("includeSubsegmentinMetrics")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_includeSubsegmentinMetrics")
	@OslcTitle("includeSubsegmentinMetrics")
	public boolean getIncludeSubsegmentinMetrics() {
		 return includeSubsegmentinMetrics;
	}
	private String oC_Name;

	public void setOC_Name(String oC_Name) {
		this.oC_Name = oC_Name;
	}

	@OslcDescription("Description of Requirement::oC_Name TBD")
	@OslcName("oC_Name")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_oC_Name")
	@OslcTitle("oC_Name")
	@OslcValueType(ValueType.XMLLiteral)
	public String getOC_Name() {
		 return oC_Name;
	}
	private String parameterValuesFromSharedItem;

	public void setParameterValuesFromSharedItem(String parameterValuesFromSharedItem) {
		this.parameterValuesFromSharedItem = parameterValuesFromSharedItem;
	}

	@OslcDescription("Description of Requirement::parameterValuesFromSharedItem TBD")
	@OslcName("parameterValuesFromSharedItem")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_parameterValuesFromSharedItem")
	@OslcTitle("parameterValuesFromSharedItem")
	@OslcValueType(ValueType.XMLLiteral)
	public String getParameterValuesFromSharedItem() {
		 return parameterValuesFromSharedItem;
	}
	private String priority;

	public void setPriority(String priority) {
		this.priority = priority;
	}

	@OslcDescription("Description of Requirement::priority TBD")
	@OslcName("priority")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_priority")
	@OslcTitle("priority")
	@OslcValueType(ValueType.XMLLiteral)
	public String getPriority() {
		 return priority;
	}
	private String rationale;

	public void setRationale(String rationale) {
		this.rationale = rationale;
	}

	@OslcDescription("Description of Requirement::rationale TBD")
	@OslcName("rationale")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_rationale")
	@OslcTitle("rationale")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRationale() {
		 return rationale;
	}
	private String risk;

	public void setRisk(String risk) {
		this.risk = risk;
	}

	@OslcDescription("Description of Requirement::risk TBD")
	@OslcName("risk")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_risk")
	@OslcTitle("risk")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRisk() {
		 return risk;
	}
	private String source;

	public void setSource(String source) {
		this.source = source;
	}

	@OslcDescription("Description of Requirement::source TBD")
	@OslcName("source")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_source")
	@OslcTitle("source")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSource() {
		 return source;
	}
	private int suspectCount;

	public void setSuspectCount(int suspectCount) {
		this.suspectCount = suspectCount;
	}

	@OslcDescription("Description of Requirement::suspectCount TBD")
	@OslcName("suspectCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_suspectCount")
	@OslcTitle("suspectCount")
	public int getSuspectCount() {
		 return suspectCount;
	}
	private String oC_Text;

	public void setOC_Text(String oC_Text) {
		this.oC_Text = oC_Text;
	}

	@OslcDescription("Description of Requirement::oC_Text TBD")
	@OslcName("oC_Text")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_oC_Text")
	@OslcTitle("oC_Text")
	@OslcValueType(ValueType.XMLLiteral)
	public String getOC_Text() {
		 return oC_Text;
	}
	private String traceStatus;

	public void setTraceStatus(String traceStatus) {
		this.traceStatus = traceStatus;
	}

	@OslcDescription("Description of Requirement::traceStatus TBD")
	@OslcName("traceStatus")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_traceStatus")
	@OslcTitle("traceStatus")
	@OslcValueType(ValueType.XMLLiteral)
	public String getTraceStatus() {
		 return traceStatus;
	}
	private int upstreamTraceCount;

	public void setUpstreamTraceCount(int upstreamTraceCount) {
		this.upstreamTraceCount = upstreamTraceCount;
	}

	@OslcDescription("Description of Requirement::upstreamTraceCount TBD")
	@OslcName("upstreamTraceCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_upstreamTraceCount")
	@OslcTitle("upstreamTraceCount")
	public int getUpstreamTraceCount() {
		 return upstreamTraceCount;
	}
	private boolean validChangeRequest;

	public void setValidChangeRequest(boolean validChangeRequest) {
		this.validChangeRequest = validChangeRequest;
	}

	@OslcDescription("Description of Requirement::validChangeRequest TBD")
	@OslcName("validChangeRequest")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_validChangeRequest")
	@OslcTitle("validChangeRequest")
	public boolean getValidChangeRequest() {
		 return validChangeRequest;
	}
	private String windchillItem;

	public void setWindchillItem(String windchillItem) {
		this.windchillItem = windchillItem;
	}

	@OslcDescription("Description of Requirement::windchillItem TBD")
	@OslcName("windchillItem")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_windchillItem")
	@OslcTitle("windchillItem")
	@OslcValueType(ValueType.XMLLiteral)
	public String getWindchillItem() {
		 return windchillItem;
	}
	private String projectPhase;

	public void setProjectPhase(String projectPhase) {
		this.projectPhase = projectPhase;
	}

	@OslcDescription("Description of Requirement::projectPhase TBD")
	@OslcName("projectPhase")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_projectPhase")
	@OslcTitle("projectPhase")
	@OslcValueType(ValueType.XMLLiteral)
	public String getProjectPhase() {
		 return projectPhase;
	}
	private int verifiedByTraceCount;

	public void setVerifiedByTraceCount(int verifiedByTraceCount) {
		this.verifiedByTraceCount = verifiedByTraceCount;
	}

	@OslcDescription("Description of Requirement::verifiedByTraceCount TBD")
	@OslcName("verifiedByTraceCount")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_verifiedByTraceCount")
	@OslcTitle("verifiedByTraceCount")
	public int getVerifiedByTraceCount() {
		 return verifiedByTraceCount;
	}
	private float verifiedByPassPercentage;

	public void setVerifiedByPassPercentage(float verifiedByPassPercentage) {
		this.verifiedByPassPercentage = verifiedByPassPercentage;
	}

	@OslcDescription("Description of Requirement::verifiedByPassPercentage TBD")
	@OslcName("verifiedByPassPercentage")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_verifiedByPassPercentage")
	@OslcTitle("verifiedByPassPercentage")
	public float getVerifiedByPassPercentage() {
		 return verifiedByPassPercentage;
	}
	private String leadReviewer;

	public void setLeadReviewer(String leadReviewer) {
		this.leadReviewer = leadReviewer;
	}

	@OslcDescription("Description of Requirement::leadReviewer TBD")
	@OslcName("leadReviewer")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_leadReviewer")
	@OslcTitle("leadReviewer")
	@OslcValueType(ValueType.XMLLiteral)
	public String getLeadReviewer() {
		 return leadReviewer;
	}
	private String assignedReviewers;

	public void setAssignedReviewers(String assignedReviewers) {
		this.assignedReviewers = assignedReviewers;
	}

	@OslcDescription("Description of Requirement::assignedReviewers TBD")
	@OslcName("assignedReviewers")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_assignedReviewers")
	@OslcTitle("assignedReviewers")
	@OslcValueType(ValueType.XMLLiteral)
	public String getAssignedReviewers() {
		 return assignedReviewers;
	}
	private String assignedApprovers;

	public void setAssignedApprovers(String assignedApprovers) {
		this.assignedApprovers = assignedApprovers;
	}

	@OslcDescription("Description of Requirement::assignedApprovers TBD")
	@OslcName("assignedApprovers")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_assignedApprovers")
	@OslcTitle("assignedApprovers")
	@OslcValueType(ValueType.XMLLiteral)
	public String getAssignedApprovers() {
		 return assignedApprovers;
	}
	private String requirementClassification;

	public void setRequirementClassification(String requirementClassification) {
		this.requirementClassification = requirementClassification;
	}

	@OslcDescription("Description of Requirement::requirementClassification TBD")
	@OslcName("requirementClassification")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_requirementClassification")
	@OslcTitle("requirementClassification")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRequirementClassification() {
		 return requirementClassification;
	}
	private String riskRationale;

	public void setRiskRationale(String riskRationale) {
		this.riskRationale = riskRationale;
	}

	@OslcDescription("Description of Requirement::riskRationale TBD")
	@OslcName("riskRationale")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_riskRationale")
	@OslcTitle("riskRationale")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRiskRationale() {
		 return riskRationale;
	}
	private String reviewDueDate;

	public void setReviewDueDate(String reviewDueDate) {
		this.reviewDueDate = reviewDueDate;
	}

	@OslcDescription("Description of Requirement::reviewDueDate TBD")
	@OslcName("reviewDueDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_reviewDueDate")
	@OslcTitle("reviewDueDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReviewDueDate() {
		 return reviewDueDate;
	}
	private String reviewStatus;

	public void setReviewStatus(String reviewStatus) {
		this.reviewStatus = reviewStatus;
	}

	@OslcDescription("Description of Requirement::reviewStatus TBD")
	@OslcName("reviewStatus")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_reviewStatus")
	@OslcTitle("reviewStatus")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReviewStatus() {
		 return reviewStatus;
	}
	private String vandVNecessity;

	public void setVandVNecessity(String vandVNecessity) {
		this.vandVNecessity = vandVNecessity;
	}

	@OslcDescription("Description of Requirement::vandVNecessity TBD")
	@OslcName("vandVNecessity")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_vandVNecessity")
	@OslcTitle("vandVNecessity")
	@OslcValueType(ValueType.XMLLiteral)
	public String getVandVNecessity() {
		 return vandVNecessity;
	}
	private String vandVMethod;

	public void setVandVMethod(String vandVMethod) {
		this.vandVMethod = vandVMethod;
	}

	@OslcDescription("Description of Requirement::vandVMethod TBD")
	@OslcName("vandVMethod")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_vandVMethod")
	@OslcTitle("vandVMethod")
	@OslcValueType(ValueType.XMLLiteral)
	public String getVandVMethod() {
		 return vandVMethod;
	}
	private String reviewHistory;

	public void setReviewHistory(String reviewHistory) {
		this.reviewHistory = reviewHistory;
	}

	@OslcDescription("Description of Requirement::reviewHistory TBD")
	@OslcName("reviewHistory")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_reviewHistory")
	@OslcTitle("reviewHistory")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReviewHistory() {
		 return reviewHistory;
	}
	private String reviewHistoryMetadata;

	public void setReviewHistoryMetadata(String reviewHistoryMetadata) {
		this.reviewHistoryMetadata = reviewHistoryMetadata;
	}

	@OslcDescription("Description of Requirement::reviewHistoryMetadata TBD")
	@OslcName("reviewHistoryMetadata")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_reviewHistoryMetadata")
	@OslcTitle("reviewHistoryMetadata")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReviewHistoryMetadata() {
		 return reviewHistoryMetadata;
	}
	private String iPRiskClassification;

	public void setIPRiskClassification(String iPRiskClassification) {
		this.iPRiskClassification = iPRiskClassification;
	}

	@OslcDescription("Description of Requirement::iPRiskClassification TBD")
	@OslcName("iPRiskClassification")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_iPRiskClassification")
	@OslcTitle("iPRiskClassification")
	@OslcValueType(ValueType.XMLLiteral)
	public String getIPRiskClassification() {
		 return iPRiskClassification;
	}
	private String backingItemVariety;

	public void setBackingItemVariety(String backingItemVariety) {
		this.backingItemVariety = backingItemVariety;
	}

	@OslcDescription("Description of Requirement::backingItemVariety TBD")
	@OslcName("backingItemVariety")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_backingItemVariety")
	@OslcTitle("backingItemVariety")
	@OslcValueType(ValueType.XMLLiteral)
	public String getBackingItemVariety() {
		 return backingItemVariety;
	}
	private String cost;

	public void setCost(String cost) {
		this.cost = cost;
	}

	@OslcDescription("Description of Requirement::cost TBD")
	@OslcName("cost")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_cost")
	@OslcTitle("cost")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCost() {
		 return cost;
	}
	private String costExplanation;

	public void setCostExplanation(String costExplanation) {
		this.costExplanation = costExplanation;
	}

	@OslcDescription("Description of Requirement::costExplanation TBD")
	@OslcName("costExplanation")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_costExplanation")
	@OslcTitle("costExplanation")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCostExplanation() {
		 return costExplanation;
	}
	private String keyWords;

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	@OslcDescription("Description of Requirement::keyWords TBD")
	@OslcName("keyWords")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_keyWords")
	@OslcTitle("keyWords")
	@OslcValueType(ValueType.XMLLiteral)
	public String getKeyWords() {
		 return keyWords;
	}
	private String difficultyExplanation;

	public void setDifficultyExplanation(String difficultyExplanation) {
		this.difficultyExplanation = difficultyExplanation;
	}

	@OslcDescription("Description of Requirement::difficultyExplanation TBD")
	@OslcName("difficultyExplanation")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_difficultyExplanation")
	@OslcTitle("difficultyExplanation")
	@OslcValueType(ValueType.XMLLiteral)
	public String getDifficultyExplanation() {
		 return difficultyExplanation;
	}
	private String decisions;

	public void setDecisions(String decisions) {
		this.decisions = decisions;
	}

	@OslcDescription("Description of Requirement::decisions TBD")
	@OslcName("decisions")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_decisions")
	@OslcTitle("decisions")
	@OslcValueType(ValueType.XMLLiteral)
	public String getDecisions() {
		 return decisions;
	}
	private String assumptions;

	public void setAssumptions(String assumptions) {
		this.assumptions = assumptions;
	}

	@OslcDescription("Description of Requirement::assumptions TBD")
	@OslcName("assumptions")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_assumptions")
	@OslcTitle("assumptions")
	@OslcValueType(ValueType.XMLLiteral)
	public String getAssumptions() {
		 return assumptions;
	}
	private String dependency;

	public void setDependency(String dependency) {
		this.dependency = dependency;
	}

	@OslcDescription("Description of Requirement::dependency TBD")
	@OslcName("dependency")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_dependency")
	@OslcTitle("dependency")
	@OslcValueType(ValueType.XMLLiteral)
	public String getDependency() {
		 return dependency;
	}
	private String assignedtoUserorGroup;

	public void setAssignedtoUserorGroup(String assignedtoUserorGroup) {
		this.assignedtoUserorGroup = assignedtoUserorGroup;
	}

	@OslcDescription("Description of Requirement::assignedtoUserorGroup TBD")
	@OslcName("assignedtoUserorGroup")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_assignedtoUserorGroup")
	@OslcTitle("assignedtoUserorGroup")
	@OslcValueType(ValueType.XMLLiteral)
	public String getAssignedtoUserorGroup() {
		 return assignedtoUserorGroup;
	}
	private String region;

	public void setRegion(String region) {
		this.region = region;
	}

	@OslcDescription("Description of Requirement::region TBD")
	@OslcName("region")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_region")
	@OslcTitle("region")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRegion() {
		 return region;
	}
	private String referenceSource;

	public void setReferenceSource(String referenceSource) {
		this.referenceSource = referenceSource;
	}

	@OslcDescription("Description of Requirement::referenceSource TBD")
	@OslcName("referenceSource")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_referenceSource")
	@OslcTitle("referenceSource")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReferenceSource() {
		 return referenceSource;
	}
	private String requirementStage;

	public void setRequirementStage(String requirementStage) {
		this.requirementStage = requirementStage;
	}

	@OslcDescription("Description of Requirement::requirementStage TBD")
	@OslcName("requirementStage")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_requirementStage")
	@OslcTitle("requirementStage")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRequirementStage() {
		 return requirementStage;
	}
	private String difficulty;

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	@OslcDescription("Description of Requirement::difficulty TBD")
	@OslcName("difficulty")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_difficulty")
	@OslcTitle("difficulty")
	@OslcValueType(ValueType.XMLLiteral)
	public String getDifficulty() {
		 return difficulty;
	}
	private String reports;

	public void setReports(String reports) {
		this.reports = reports;
	}

	@OslcDescription("Description of Requirement::reports TBD")
	@OslcName("reports")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_reports")
	@OslcTitle("reports")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReports() {
		 return reports;
	}
	private boolean enterDetails;

	public void setEnterDetails(boolean enterDetails) {
		this.enterDetails = enterDetails;
	}

	@OslcDescription("Description of Requirement::enterDetails TBD")
	@OslcName("enterDetails")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_enterDetails")
	@OslcTitle("enterDetails")
	public boolean getEnterDetails() {
		 return enterDetails;
	}
	private String createdbyUserorGroup;

	public void setCreatedbyUserorGroup(String createdbyUserorGroup) {
		this.createdbyUserorGroup = createdbyUserorGroup;
	}

	@OslcDescription("Description of Requirement::createdbyUserorGroup TBD")
	@OslcName("createdbyUserorGroup")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_createdbyUserorGroup")
	@OslcTitle("createdbyUserorGroup")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCreatedbyUserorGroup() {
		 return createdbyUserorGroup;
	}
	private String stageTextValue;

	public void setStageTextValue(String stageTextValue) {
		this.stageTextValue = stageTextValue;
	}

	@OslcDescription("Description of Requirement::stageTextValue TBD")
	@OslcName("stageTextValue")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_stageTextValue")
	@OslcTitle("stageTextValue")
	@OslcValueType(ValueType.XMLLiteral)
	public String getStageTextValue() {
		 return stageTextValue;
	}
	private String referencetoSegmentStageTextValue;

	public void setReferencetoSegmentStageTextValue(String referencetoSegmentStageTextValue) {
		this.referencetoSegmentStageTextValue = referencetoSegmentStageTextValue;
	}

	@OslcDescription("Description of Requirement::referencetoSegmentStageTextValue TBD")
	@OslcName("referencetoSegmentStageTextValue")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_referencetoSegmentStageTextValue")
	@OslcTitle("referencetoSegmentStageTextValue")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReferencetoSegmentStageTextValue() {
		 return referencetoSegmentStageTextValue;
	}
	private String referencetoSegmentStageNumericValue;

	public void setReferencetoSegmentStageNumericValue(String referencetoSegmentStageNumericValue) {
		this.referencetoSegmentStageNumericValue = referencetoSegmentStageNumericValue;
	}

	@OslcDescription("Description of Requirement::referencetoSegmentStageNumericValue TBD")
	@OslcName("referencetoSegmentStageNumericValue")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_referencetoSegmentStageNumericValue")
	@OslcTitle("referencetoSegmentStageNumericValue")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReferencetoSegmentStageNumericValue() {
		 return referencetoSegmentStageNumericValue;
	}
	private int stageNumericValue;

	public void setStageNumericValue(int stageNumericValue) {
		this.stageNumericValue = stageNumericValue;
	}

	@OslcDescription("Description of Requirement::stageNumericValue TBD")
	@OslcName("stageNumericValue")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_stageNumericValue")
	@OslcTitle("stageNumericValue")
	public int getStageNumericValue() {
		 return stageNumericValue;
	}
	private String text;

	public void setText(String text) {
		this.text = text;
	}

	@OslcDescription("Description of Requirement::text TBD")
	@OslcName("text")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_text")
	@OslcTitle("text")
	@OslcValueType(ValueType.XMLLiteral)
	public String getText() {
		 return text;
	}
	private String summaryOnSharedItem;

	public void setSummaryOnSharedItem(String summaryOnSharedItem) {
		this.summaryOnSharedItem = summaryOnSharedItem;
	}

	@OslcDescription("Description of Requirement::summaryOnSharedItem TBD")
	@OslcName("summaryOnSharedItem")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_summaryOnSharedItem")
	@OslcTitle("summaryOnSharedItem")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSummaryOnSharedItem() {
		 return summaryOnSharedItem;
	}
	private String name_;

	public void setName_(String name_) {
		this.name_ = name_;
	}

	@OslcDescription("Description of Requirement::name_ TBD")
	@OslcName("name_")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_name_")
	@OslcTitle("name_")
	@OslcValueType(ValueType.XMLLiteral)
	public String getName_() {
		 return name_;
	}
	private String backingItemonSegment;

	public void setBackingItemonSegment(String backingItemonSegment) {
		this.backingItemonSegment = backingItemonSegment;
	}

	@OslcDescription("Description of Requirement::backingItemonSegment TBD")
	@OslcName("backingItemonSegment")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_backingItemonSegment")
	@OslcTitle("backingItemonSegment")
	@OslcValueType(ValueType.XMLLiteral)
	public String getBackingItemonSegment() {
		 return backingItemonSegment;
	}
	private String backingItemonNode;

	public void setBackingItemonNode(String backingItemonNode) {
		this.backingItemonNode = backingItemonNode;
	}

	@OslcDescription("Description of Requirement::backingItemonNode TBD")
	@OslcName("backingItemonNode")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_backingItemonNode")
	@OslcTitle("backingItemonNode")
	@OslcValueType(ValueType.XMLLiteral)
	public String getBackingItemonNode() {
		 return backingItemonNode;
	}
	private boolean enterDetailSelected;

	public void setEnterDetailSelected(boolean enterDetailSelected) {
		this.enterDetailSelected = enterDetailSelected;
	}

	@OslcDescription("Description of Requirement::enterDetailSelected TBD")
	@OslcName("enterDetailSelected")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_enterDetailSelected")
	@OslcTitle("enterDetailSelected")
	public boolean getEnterDetailSelected() {
		 return enterDetailSelected;
	}
	private boolean voiceDocumentRequirement;

	public void setVoiceDocumentRequirement(boolean voiceDocumentRequirement) {
		this.voiceDocumentRequirement = voiceDocumentRequirement;
	}

	@OslcDescription("Description of Requirement::voiceDocumentRequirement TBD")
	@OslcName("voiceDocumentRequirement")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_voiceDocumentRequirement")
	@OslcTitle("voiceDocumentRequirement")
	public boolean getVoiceDocumentRequirement() {
		 return voiceDocumentRequirement;
	}
	private boolean notVoiceDocumentRequirement;

	public void setNotVoiceDocumentRequirement(boolean notVoiceDocumentRequirement) {
		this.notVoiceDocumentRequirement = notVoiceDocumentRequirement;
	}

	@OslcDescription("Description of Requirement::notVoiceDocumentRequirement TBD")
	@OslcName("notVoiceDocumentRequirement")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_notVoiceDocumentRequirement")
	@OslcTitle("notVoiceDocumentRequirement")
	public boolean getNotVoiceDocumentRequirement() {
		 return notVoiceDocumentRequirement;
	}
	private String topic;

	public void setTopic(String topic) {
		this.topic = topic;
	}

	@OslcDescription("Description of Requirement::topic TBD")
	@OslcName("topic")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_topic")
	@OslcTitle("topic")
	@OslcValueType(ValueType.XMLLiteral)
	public String getTopic() {
		 return topic;
	}
	private String collector;

	public void setCollector(String collector) {
		this.collector = collector;
	}

	@OslcDescription("Description of Requirement::collector TBD")
	@OslcName("collector")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_collector")
	@OslcTitle("collector")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCollector() {
		 return collector;
	}
	private String occasion;

	public void setOccasion(String occasion) {
		this.occasion = occasion;
	}

	@OslcDescription("Description of Requirement::occasion TBD")
	@OslcName("occasion")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_occasion")
	@OslcTitle("occasion")
	@OslcValueType(ValueType.XMLLiteral)
	public String getOccasion() {
		 return occasion;
	}
	private String collectionDate;

	public void setCollectionDate(String collectionDate) {
		this.collectionDate = collectionDate;
	}

	@OslcDescription("Description of Requirement::collectionDate TBD")
	@OslcName("collectionDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_collectionDate")
	@OslcTitle("collectionDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCollectionDate() {
		 return collectionDate;
	}
	private String relevantRegion;

	public void setRelevantRegion(String relevantRegion) {
		this.relevantRegion = relevantRegion;
	}

	@OslcDescription("Description of Requirement::relevantRegion TBD")
	@OslcName("relevantRegion")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_relevantRegion")
	@OslcTitle("relevantRegion")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRelevantRegion() {
		 return relevantRegion;
	}
	private String reviewer;

	public void setReviewer(String reviewer) {
		this.reviewer = reviewer;
	}

	@OslcDescription("Description of Requirement::reviewer TBD")
	@OslcName("reviewer")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_reviewer")
	@OslcTitle("reviewer")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReviewer() {
		 return reviewer;
	}
	private String competitor;

	public void setCompetitor(String competitor) {
		this.competitor = competitor;
	}

	@OslcDescription("Description of Requirement::competitor TBD")
	@OslcName("competitor")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_competitor")
	@OslcTitle("competitor")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCompetitor() {
		 return competitor;
	}
	private String kanoClassification;

	public void setKanoClassification(String kanoClassification) {
		this.kanoClassification = kanoClassification;
	}

	@OslcDescription("Description of Requirement::kanoClassification TBD")
	@OslcName("kanoClassification")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_kanoClassification")
	@OslcTitle("kanoClassification")
	@OslcValueType(ValueType.XMLLiteral)
	public String getKanoClassification() {
		 return kanoClassification;
	}
	private String relevanttoUserorGroup;

	public void setRelevanttoUserorGroup(String relevanttoUserorGroup) {
		this.relevanttoUserorGroup = relevanttoUserorGroup;
	}

	@OslcDescription("Description of Requirement::relevanttoUserorGroup TBD")
	@OslcName("relevanttoUserorGroup")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_relevanttoUserorGroup")
	@OslcTitle("relevanttoUserorGroup")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRelevanttoUserorGroup() {
		 return relevanttoUserorGroup;
	}
	private String productFamily;

	public void setProductFamily(String productFamily) {
		this.productFamily = productFamily;
	}

	@OslcDescription("Description of Requirement::productFamily TBD")
	@OslcName("productFamily")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_productFamily")
	@OslcTitle("productFamily")
	@OslcValueType(ValueType.XMLLiteral)
	public String getProductFamily() {
		 return productFamily;
	}
	private String code;

	public void setCode(String code) {
		this.code = code;
	}

	@OslcDescription("Description of Requirement::code TBD")
	@OslcName("code")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_code")
	@OslcTitle("code")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCode() {
		 return code;
	}
	private int nodeStageValue;

	public void setNodeStageValue(int nodeStageValue) {
		this.nodeStageValue = nodeStageValue;
	}

	@OslcDescription("Description of Requirement::nodeStageValue TBD")
	@OslcName("nodeStageValue")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_nodeStageValue")
	@OslcTitle("nodeStageValue")
	public int getNodeStageValue() {
		 return nodeStageValue;
	}
	private String nodeStageText;

	public void setNodeStageText(String nodeStageText) {
		this.nodeStageText = nodeStageText;
	}

	@OslcDescription("Description of Requirement::nodeStageText TBD")
	@OslcName("nodeStageText")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_nodeStageText")
	@OslcTitle("nodeStageText")
	@OslcValueType(ValueType.XMLLiteral)
	public String getNodeStageText() {
		 return nodeStageText;
	}
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@OslcDescription("Description of Requirement::name TBD")
	@OslcName("name")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_name")
	@OslcTitle("name")
	@OslcValueType(ValueType.XMLLiteral)
	public String getName() {
		 return name;
	}
	private String referencetoBackingItemonSegment;

	public void setReferencetoBackingItemonSegment(String referencetoBackingItemonSegment) {
		this.referencetoBackingItemonSegment = referencetoBackingItemonSegment;
	}

	@OslcDescription("Description of Requirement::referencetoBackingItemonSegment TBD")
	@OslcName("referencetoBackingItemonSegment")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_referencetoBackingItemonSegment")
	@OslcTitle("referencetoBackingItemonSegment")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReferencetoBackingItemonSegment() {
		 return referencetoBackingItemonSegment;
	}
	private String referencetoNodeStageValue;

	public void setReferencetoNodeStageValue(String referencetoNodeStageValue) {
		this.referencetoNodeStageValue = referencetoNodeStageValue;
	}

	@OslcDescription("Description of Requirement::referencetoNodeStageValue TBD")
	@OslcName("referencetoNodeStageValue")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_referencetoNodeStageValue")
	@OslcTitle("referencetoNodeStageValue")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReferencetoNodeStageValue() {
		 return referencetoNodeStageValue;
	}
	private String referencetoNodeStageText;

	public void setReferencetoNodeStageText(String referencetoNodeStageText) {
		this.referencetoNodeStageText = referencetoNodeStageText;
	}

	@OslcDescription("Description of Requirement::referencetoNodeStageText TBD")
	@OslcName("referencetoNodeStageText")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_referencetoNodeStageText")
	@OslcTitle("referencetoNodeStageText")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReferencetoNodeStageText() {
		 return referencetoNodeStageText;
	}
	private boolean doNotEnterDetailsYet;

	public void setDoNotEnterDetailsYet(boolean doNotEnterDetailsYet) {
		this.doNotEnterDetailsYet = doNotEnterDetailsYet;
	}

	@OslcDescription("Description of Requirement::doNotEnterDetailsYet TBD")
	@OslcName("doNotEnterDetailsYet")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_doNotEnterDetailsYet")
	@OslcTitle("doNotEnterDetailsYet")
	public boolean getDoNotEnterDetailsYet() {
		 return doNotEnterDetailsYet;
	}
	private String text_;

	public void setText_(String text_) {
		this.text_ = text_;
	}

	@OslcDescription("Description of Requirement::text_ TBD")
	@OslcName("text_")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_text_")
	@OslcTitle("text_")
	@OslcValueType(ValueType.XMLLiteral)
	public String getText_() {
		 return text_;
	}
	private int minorVersionID;

	public void setMinorVersionID(int minorVersionID) {
		this.minorVersionID = minorVersionID;
	}

	@OslcDescription("Description of Requirement::minorVersionID TBD")
	@OslcName("minorVersionID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_minorVersionID")
	@OslcTitle("minorVersionID")
	public int getMinorVersionID() {
		 return minorVersionID;
	}
	private int majorVersionID;

	public void setMajorVersionID(int majorVersionID) {
		this.majorVersionID = majorVersionID;
	}

	@OslcDescription("Description of Requirement::majorVersionID TBD")
	@OslcName("majorVersionID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_majorVersionID")
	@OslcTitle("majorVersionID")
	public int getMajorVersionID() {
		 return majorVersionID;
	}
	private int liveItemID;

	public void setLiveItemID(int liveItemID) {
		this.liveItemID = liveItemID;
	}

	@OslcDescription("Description of Requirement::liveItemID TBD")
	@OslcName("liveItemID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_liveItemID")
	@OslcTitle("liveItemID")
	public int getLiveItemID() {
		 return liveItemID;
	}
	private String bookmarks;

	public void setBookmarks(String bookmarks) {
		this.bookmarks = bookmarks;
	}

	@OslcDescription("Description of Requirement::bookmarks TBD")
	@OslcName("bookmarks")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_bookmarks")
	@OslcTitle("bookmarks")
	@OslcValueType(ValueType.XMLLiteral)
	public String getBookmarks() {
		 return bookmarks;
	}
	private String signatureComment;

	public void setSignatureComment(String signatureComment) {
		this.signatureComment = signatureComment;
	}

	@OslcDescription("Description of Requirement::signatureComment TBD")
	@OslcName("signatureComment")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_signatureComment")
	@OslcTitle("signatureComment")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSignatureComment() {
		 return signatureComment;
	}
	private String signedBy;

	public void setSignedBy(String signedBy) {
		this.signedBy = signedBy;
	}

	@OslcDescription("Description of Requirement::signedBy TBD")
	@OslcName("signedBy")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_signedBy")
	@OslcTitle("signedBy")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSignedBy() {
		 return signedBy;
	}
	private int iD;

	public void setID(int iD) {
		this.iD = iD;
	}

	@OslcDescription("Description of Requirement::iD TBD")
	@OslcName("iD")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_iD")
	@OslcTitle("iD")
	public int getID() {
		 return iD;
	}
	private String modifiedBy;

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@OslcDescription("Description of Requirement::modifiedBy TBD")
	@OslcName("modifiedBy")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_modifiedBy")
	@OslcTitle("modifiedBy")
	@OslcValueType(ValueType.XMLLiteral)
	public String getModifiedBy() {
		 return modifiedBy;
	}
	private String createdBy;

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@OslcDescription("Description of Requirement::createdBy TBD")
	@OslcName("createdBy")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_createdBy")
	@OslcTitle("createdBy")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCreatedBy() {
		 return createdBy;
	}
	private String modifiedDate;

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@OslcDescription("Description of Requirement::modifiedDate TBD")
	@OslcName("modifiedDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_modifiedDate")
	@OslcTitle("modifiedDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getModifiedDate() {
		 return modifiedDate;
	}
	private String createdDate;

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@OslcDescription("Description of Requirement::createdDate TBD")
	@OslcName("createdDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_createdDate")
	@OslcTitle("createdDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCreatedDate() {
		 return createdDate;
	}
	private String category;

	public void setCategory(String category) {
		this.category = category;
	}

	@OslcDescription("Description of Requirement::category TBD")
	@OslcName("category")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_category")
	@OslcTitle("category")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCategory() {
		 return category;
	}
	private String referenceMode;

	public void setReferenceMode(String referenceMode) {
		this.referenceMode = referenceMode;
	}

	@OslcDescription("Description of Requirement::referenceMode TBD")
	@OslcName("referenceMode")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_referenceMode")
	@OslcTitle("referenceMode")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReferenceMode() {
		 return referenceMode;
	}
	private int documentID;

	public void setDocumentID(int documentID) {
		this.documentID = documentID;
	}

	@OslcDescription("Description of Requirement::documentID TBD")
	@OslcName("documentID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_documentID")
	@OslcTitle("documentID")
	public int getDocumentID() {
		 return documentID;
	}
	private String subsegmentName;

	public void setSubsegmentName(String subsegmentName) {
		this.subsegmentName = subsegmentName;
	}

	@OslcDescription("Description of Requirement::subsegmentName TBD")
	@OslcName("subsegmentName")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_subsegmentName")
	@OslcTitle("subsegmentName")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSubsegmentName() {
		 return subsegmentName;
	}
	private String referencedItemType;

	public void setReferencedItemType(String referencedItemType) {
		this.referencedItemType = referencedItemType;
	}

	@OslcDescription("Description of Requirement::referencedItemType TBD")
	@OslcName("referencedItemType")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_referencedItemType")
	@OslcTitle("referencedItemType")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReferencedItemType() {
		 return referencedItemType;
	}
	private int rootID;

	public void setRootID(int rootID) {
		this.rootID = rootID;
	}

	@OslcDescription("Description of Requirement::rootID TBD")
	@OslcName("rootID")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_rootID")
	@OslcTitle("rootID")
	public int getRootID() {
		 return rootID;
	}
	private String referencedBookmarks;

	public void setReferencedBookmarks(String referencedBookmarks) {
		this.referencedBookmarks = referencedBookmarks;
	}

	@OslcDescription("Description of Requirement::referencedBookmarks TBD")
	@OslcName("referencedBookmarks")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_referencedBookmarks")
	@OslcTitle("referencedBookmarks")
	@OslcValueType(ValueType.XMLLiteral)
	public String getReferencedBookmarks() {
		 return referencedBookmarks;
	}
	private String inputRevisionDate;

	public void setInputRevisionDate(String inputRevisionDate) {
		this.inputRevisionDate = inputRevisionDate;
	}

	@OslcDescription("Description of Requirement::inputRevisionDate TBD")
	@OslcName("inputRevisionDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_inputRevisionDate")
	@OslcTitle("inputRevisionDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getInputRevisionDate() {
		 return inputRevisionDate;
	}
	private String significantEditDate;

	public void setSignificantEditDate(String significantEditDate) {
		this.significantEditDate = significantEditDate;
	}

	@OslcDescription("Description of Requirement::significantEditDate TBD")
	@OslcName("significantEditDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_significantEditDate")
	@OslcTitle("significantEditDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSignificantEditDate() {
		 return significantEditDate;
	}
	private String itemSignificantEditDateonSharedItem;

	public void setItemSignificantEditDateonSharedItem(String itemSignificantEditDateonSharedItem) {
		this.itemSignificantEditDateonSharedItem = itemSignificantEditDateonSharedItem;
	}

	@OslcDescription("Description of Requirement::itemSignificantEditDateonSharedItem TBD")
	@OslcName("itemSignificantEditDateonSharedItem")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_itemSignificantEditDateonSharedItem")
	@OslcTitle("itemSignificantEditDateonSharedItem")
	@OslcValueType(ValueType.XMLLiteral)
	public String getItemSignificantEditDateonSharedItem() {
		 return itemSignificantEditDateonSharedItem;
	}
	private String revision;

	public void setRevision(String revision) {
		this.revision = revision;
	}

	@OslcDescription("Description of Requirement::revision TBD")
	@OslcName("revision")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_revision")
	@OslcTitle("revision")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRevision() {
		 return revision;
	}
	private String revisionIncrementDate;

	public void setRevisionIncrementDate(String revisionIncrementDate) {
		this.revisionIncrementDate = revisionIncrementDate;
	}

	@OslcDescription("Description of Requirement::revisionIncrementDate TBD")
	@OslcName("revisionIncrementDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_revisionIncrementDate")
	@OslcTitle("revisionIncrementDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getRevisionIncrementDate() {
		 return revisionIncrementDate;
	}
	private boolean significantChangeSinceItemRevision;

	public void setSignificantChangeSinceItemRevision(boolean significantChangeSinceItemRevision) {
		this.significantChangeSinceItemRevision = significantChangeSinceItemRevision;
	}

	@OslcDescription("Description of Requirement::significantChangeSinceItemRevision TBD")
	@OslcName("significantChangeSinceItemRevision")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_significantChangeSinceItemRevision")
	@OslcTitle("significantChangeSinceItemRevision")
	public boolean getSignificantChangeSinceItemRevision() {
		 return significantChangeSinceItemRevision;
	}
	// ********* assignedGroup *********
	private URI assignedGroup;

	public void setAssignedGroup(final URI assignedGroup) {
		this.assignedGroup = assignedGroup;
	}

	@OslcDescription("Description of Requirement::assignedGroup TBD")
	@OslcName("assignedGroup")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_assignedGroup")
	@OslcTitle("assignedGroup")
	@OslcRange("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Item")
	public URI  getAssignedGroup() {
		 return assignedGroup;
	}

	// ********* project *********
	private URI project;

	public void setProject(final URI project) {
		this.project = project;
	}

	@OslcDescription("Description of Requirement::project TBD")
	@OslcName("project")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_project")
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

	@OslcDescription("Description of Requirement::attachments TBD")
	@OslcName("attachments")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_attachments")
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

	@OslcDescription("Description of Requirement::changesAuthorizedBy TBD")
	@OslcName("changesAuthorizedBy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_changesAuthorizedBy")
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

	@OslcDescription("Description of Requirement::isRelatedTo TBD")
	@OslcName("isRelatedTo")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_isRelatedTo")
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

	@OslcDescription("Description of Requirement::relatedTo TBD")
	@OslcName("relatedTo")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_relatedTo")
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

	@OslcDescription("Description of Requirement::satisfiedBy TBD")
	@OslcName("satisfiedBy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_satisfiedBy")
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

	@OslcDescription("Description of Requirement::oC_Satisfies TBD")
	@OslcName("oC_Satisfies")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_oC_Satisfies")
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

	@OslcDescription("Description of Requirement::spawns TBD")
	@OslcName("spawns")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_spawns")
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

	@OslcDescription("Description of Requirement::textAttachments TBD")
	@OslcName("textAttachments")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_textAttachments")
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

	@OslcDescription("Description of Requirement::verifiedBy TBD")
	@OslcName("verifiedBy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_verifiedBy")
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

	@OslcDescription("Description of Requirement::reviewTasks TBD")
	@OslcName("reviewTasks")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_reviewTasks")
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

	@OslcDescription("Description of Requirement::itemReviewSessions TBD")
	@OslcName("itemReviewSessions")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_itemReviewSessions")
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

	@OslcDescription("Description of Requirement::documentReviewTasks TBD")
	@OslcName("documentReviewTasks")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_documentReviewTasks")
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

	@OslcDescription("Description of Requirement::functionalAllocation TBD")
	@OslcName("functionalAllocation")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_functionalAllocation")
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

	@OslcDescription("Description of Requirement::systemAllocation TBD")
	@OslcName("systemAllocation")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_systemAllocation")
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

	@OslcDescription("Description of Requirement::derives TBD")
	@OslcName("derives")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_derives")
	@OslcTitle("derives")
	@OslcReadOnly(false)
	public Link[]  getDerives() {
		 return derives.toArray(new Link[derives.size()]);
	}

	// ********* requires *********
	private final Set<Link> requires = new HashSet<Link>();

	public void setRequires(final Link[] requires) {
		this.requires.clear();
		if (requires != null)
		{
			this.requires.addAll(Arrays.asList(requires));
		}
	}

	@OslcDescription("Description of Requirement::requires TBD")
	@OslcName("requires")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_requires")
	@OslcTitle("requires")
	@OslcReadOnly(false)
	public Link[]  getRequires() {
		 return requires.toArray(new Link[requires.size()]);
	}

	// ********* constrains *********
	private final Set<Link> constrains = new HashSet<Link>();

	public void setConstrains(final Link[] constrains) {
		this.constrains.clear();
		if (constrains != null)
		{
			this.constrains.addAll(Arrays.asList(constrains));
		}
	}

	@OslcDescription("Description of Requirement::constrains TBD")
	@OslcName("constrains")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_constrains")
	@OslcTitle("constrains")
	@OslcReadOnly(false)
	public Link[]  getConstrains() {
		 return constrains.toArray(new Link[constrains.size()]);
	}

	// ********* connects *********
	private final Set<Link> connects = new HashSet<Link>();

	public void setConnects(final Link[] connects) {
		this.connects.clear();
		if (connects != null)
		{
			this.connects.addAll(Arrays.asList(connects));
		}
	}

	@OslcDescription("Description of Requirement::connects TBD")
	@OslcName("connects")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_connects")
	@OslcTitle("connects")
	@OslcReadOnly(false)
	public Link[]  getConnects() {
		 return connects.toArray(new Link[connects.size()]);
	}

	// ********* flowsTo *********
	private final Set<Link> flowsTo = new HashSet<Link>();

	public void setFlowsTo(final Link[] flowsTo) {
		this.flowsTo.clear();
		if (flowsTo != null)
		{
			this.flowsTo.addAll(Arrays.asList(flowsTo));
		}
	}

	@OslcDescription("Description of Requirement::flowsTo TBD")
	@OslcName("flowsTo")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_flowsTo")
	@OslcTitle("flowsTo")
	@OslcReadOnly(false)
	public Link[]  getFlowsTo() {
		 return flowsTo.toArray(new Link[flowsTo.size()]);
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

	@OslcDescription("Description of Requirement::derivedFrom TBD")
	@OslcName("derivedFrom")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_derivedFrom")
	@OslcTitle("derivedFrom")
	@OslcReadOnly(false)
	public Link[]  getDerivedFrom() {
		 return derivedFrom.toArray(new Link[derivedFrom.size()]);
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

	@OslcDescription("Description of Requirement::requiredBy TBD")
	@OslcName("requiredBy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_requiredBy")
	@OslcTitle("requiredBy")
	@OslcReadOnly(false)
	public Link[]  getRequiredBy() {
		 return requiredBy.toArray(new Link[requiredBy.size()]);
	}

	// ********* constrainedTo *********
	private final Set<Link> constrainedTo = new HashSet<Link>();

	public void setConstrainedTo(final Link[] constrainedTo) {
		this.constrainedTo.clear();
		if (constrainedTo != null)
		{
			this.constrainedTo.addAll(Arrays.asList(constrainedTo));
		}
	}

	@OslcDescription("Description of Requirement::constrainedTo TBD")
	@OslcName("constrainedTo")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_constrainedTo")
	@OslcTitle("constrainedTo")
	@OslcReadOnly(false)
	public Link[]  getConstrainedTo() {
		 return constrainedTo.toArray(new Link[constrainedTo.size()]);
	}

	// ********* connectedTo *********
	private final Set<Link> connectedTo = new HashSet<Link>();

	public void setConnectedTo(final Link[] connectedTo) {
		this.connectedTo.clear();
		if (connectedTo != null)
		{
			this.connectedTo.addAll(Arrays.asList(connectedTo));
		}
	}

	@OslcDescription("Description of Requirement::connectedTo TBD")
	@OslcName("connectedTo")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_connectedTo")
	@OslcTitle("connectedTo")
	@OslcReadOnly(false)
	public Link[]  getConnectedTo() {
		 return connectedTo.toArray(new Link[connectedTo.size()]);
	}

	// ********* flowsFrom *********
	private final Set<Link> flowsFrom = new HashSet<Link>();

	public void setFlowsFrom(final Link[] flowsFrom) {
		this.flowsFrom.clear();
		if (flowsFrom != null)
		{
			this.flowsFrom.addAll(Arrays.asList(flowsFrom));
		}
	}

	@OslcDescription("Description of Requirement::flowsFrom TBD")
	@OslcName("flowsFrom")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_flowsFrom")
	@OslcTitle("flowsFrom")
	@OslcReadOnly(false)
	public Link[]  getFlowsFrom() {
		 return flowsFrom.toArray(new Link[flowsFrom.size()]);
	}

	// ********* type *********
	private URI type;

	public void setType(final URI type) {
		this.type = type;
	}

	@OslcDescription("Description of Requirement::type TBD")
	@OslcName("type")
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_type")
	@OslcTitle("type")
	@OslcRange("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Item")
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

	@OslcDescription("Description of Requirement::references TBD")
	@OslcName("references")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_references")
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

	@OslcDescription("Description of Requirement::contains TBD")
	@OslcName("contains")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_contains")
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

	@OslcDescription("Description of Requirement::containedBy TBD")
	@OslcName("containedBy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_containedBy")
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

	@OslcDescription("Description of Requirement::shares TBD")
	@OslcName("shares")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_shares")
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

	@OslcDescription("Description of Requirement::sharedBy TBD")
	@OslcName("sharedBy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement_sharedBy")
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