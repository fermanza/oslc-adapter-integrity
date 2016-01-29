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
@OslcName("Project")
@OslcResourceShape(title = "Project Resource Shape", describes = Constants.TYPE_INTEGRITY_PROJECT)
public class IntegrityProject extends AbstractResource{

	public IntegrityProject() throws URISyntaxException {
		super();
	}
	public IntegrityProject(URI about) throws URISyntaxException {
		super(about);
	}

	private String summary;

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@OslcDescription("Description of Project::summary TBD")
	@OslcName("summary")
	@OslcOccurs(Occurs.ExactlyOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_summary")
	@OslcTitle("summary")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSummary() {
		 return summary;
	}
	private String state;

	public void setState(String state) {
		this.state = state;
	}

	@OslcDescription("Description of Project::state TBD")
	@OslcName("state")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_state")
	@OslcTitle("state")
	@OslcValueType(ValueType.XMLLiteral)
	public String getState() {
		 return state;
	}
	private String ID;

	public void setID(String ID) {
		this.ID = ID;
	}

	@OslcDescription("Description of Project::ID TBD")
	@OslcName("ID")
	@OslcOccurs(Occurs.ExactlyOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_ID")
	@OslcTitle("ID")
	@OslcValueType(ValueType.XMLLiteral)
	public String getID() {
		 return ID;
	}
	private String modifiedBy;

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	@OslcDescription("Description of Project::modifiedBy TBD")
	@OslcName("modifiedBy")
	@OslcOccurs(Occurs.ExactlyOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_modifiedBy")
	@OslcTitle("modifiedBy")
	@OslcValueType(ValueType.XMLLiteral)
	public String getModifiedBy() {
		 return modifiedBy;
	}
	private String createdBy;

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@OslcDescription("Description of Project::createdBy TBD")
	@OslcName("createdBy")
	@OslcOccurs(Occurs.ExactlyOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_createdBy")
	@OslcTitle("createdBy")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCreatedBy() {
		 return createdBy;
	}
	private String modifiedDate;

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@OslcDescription("Description of Project::modifiedDate TBD")
	@OslcName("modifiedDate")
	@OslcOccurs(Occurs.ExactlyOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_modifiedDate")
	@OslcTitle("modifiedDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getModifiedDate() {
		 return modifiedDate;
	}
	private String createdDate;

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@OslcDescription("Description of Project::createdDate TBD")
	@OslcName("createdDate")
	@OslcOccurs(Occurs.ExactlyOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_createdDate")
	@OslcTitle("createdDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getCreatedDate() {
		 return createdDate;
	}
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	@OslcDescription("Description of Project::name TBD")
	@OslcName("name")
	@OslcOccurs(Occurs.ExactlyOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_name")
	@OslcTitle("name")
	@OslcValueType(ValueType.XMLLiteral)
	public String getName() {
		 return name;
	}
	private String type;

	public void setType(String type) {
		this.type = type;
	}

	@OslcDescription("Description of Project::type TBD")
	@OslcName("type")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_type")
	@OslcTitle("type")
	@OslcValueType(ValueType.XMLLiteral)
	public String getType() {
		 return type;
	}
	private String significantEditDate;

	public void setSignificantEditDate(String significantEditDate) {
		this.significantEditDate = significantEditDate;
	}

	@OslcDescription("Description of Project::significantEditDate TBD")
	@OslcName("significantEditDate")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_significantEditDate")
	@OslcTitle("significantEditDate")
	@OslcValueType(ValueType.XMLLiteral)
	public String getSignificantEditDate() {
		 return significantEditDate;
	}
	private String project;

	public void setProject(String project) {
		this.project = project;
	}

	@OslcDescription("Description of Project::project TBD")
	@OslcName("project")
	@OslcOccurs(Occurs.ZeroOrOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_project")
	@OslcTitle("project")
	@OslcValueType(ValueType.XMLLiteral)
	public String getProject() {
		 return project;
	}
	// ********* requirement *********
	private final Set<Link> requirement = new HashSet<Link>();

	public void setRequirement(final Link[] requirement) {
		this.requirement.clear();
		if (requirement != null)
		{
			this.requirement.addAll(Arrays.asList(requirement));
		}
	}

	@OslcDescription("Description of Project::requirement TBD")
	@OslcName("requirement")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_requirement")
	@OslcTitle("requirement")
	@OslcReadOnly(false)
	public Link[]  getRequirement() {
		 return requirement.toArray(new Link[requirement.size()]);
	}

	// ********* function *********
	private final Set<Link> function = new HashSet<Link>();

	public void setFunction(final Link[] function) {
		this.function.clear();
		if (function != null)
		{
			this.function.addAll(Arrays.asList(function));
		}
	}

	@OslcDescription("Description of Project::function TBD")
	@OslcName("function")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_function")
	@OslcTitle("function")
	@OslcReadOnly(false)
	public Link[]  getFunction() {
		 return function.toArray(new Link[function.size()]);
	}

	// ********* functionHierarchy *********
	private final Set<Link> functionHierarchy = new HashSet<Link>();

	public void setFunctionHierarchy(final Link[] functionHierarchy) {
		this.functionHierarchy.clear();
		if (functionHierarchy != null)
		{
			this.functionHierarchy.addAll(Arrays.asList(functionHierarchy));
		}
	}

	@OslcDescription("Description of Project::functionHierarchy TBD")
	@OslcName("functionHierarchy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_functionHierarchy")
	@OslcTitle("functionHierarchy")
	@OslcReadOnly(false)
	public Link[]  getFunctionHierarchy() {
		 return functionHierarchy.toArray(new Link[functionHierarchy.size()]);
	}

	// ********* systemElement *********
	private final Set<Link> systemElement = new HashSet<Link>();

	public void setSystemElement(final Link[] systemElement) {
		this.systemElement.clear();
		if (systemElement != null)
		{
			this.systemElement.addAll(Arrays.asList(systemElement));
		}
	}

	@OslcDescription("Description of Project::systemElement TBD")
	@OslcName("systemElement")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_systemElement")
	@OslcTitle("systemElement")
	@OslcReadOnly(false)
	public Link[]  getSystemElement() {
		 return systemElement.toArray(new Link[systemElement.size()]);
	}

	// ********* systemHierarchy *********
	private final Set<Link> systemHierarchy = new HashSet<Link>();

	public void setSystemHierarchy(final Link[] systemHierarchy) {
		this.systemHierarchy.clear();
		if (systemHierarchy != null)
		{
			this.systemHierarchy.addAll(Arrays.asList(systemHierarchy));
		}
	}

	@OslcDescription("Description of Project::systemHierarchy TBD")
	@OslcName("systemHierarchy")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project_systemHierarchy")
	@OslcTitle("systemHierarchy")
	@OslcReadOnly(false)
	public Link[]  getSystemHierarchy() {
		 return systemHierarchy.toArray(new Link[systemHierarchy.size()]);
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