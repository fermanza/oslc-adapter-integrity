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
@OslcName("Item")
@OslcResourceShape(title = "Item Resource Shape", describes = Constants.TYPE_INTEGRITY_ITEM)
public class IntegrityItem extends AbstractResource{

	public IntegrityItem() throws URISyntaxException {
		super();
	}
	public IntegrityItem(URI about) throws URISyntaxException {
		super(about);
	}

	private String ID;

	public void setID(String ID) {
		this.ID = ID;
	}

	@OslcDescription("Description of Item::ID TBD")
	@OslcName("ID")
	@OslcOccurs(Occurs.ExactlyOne)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Item_ID")
	@OslcTitle("ID")
	@OslcValueType(ValueType.XMLLiteral)
	public String getID() {
		 return ID;
	}
	// ********* field *********
	private final Set<Link> field = new HashSet<Link>();

	public void setField(final Link[] field) {
		this.field.clear();
		if (field != null)
		{
			this.field.addAll(Arrays.asList(field));
		}
	}

	@OslcDescription("Description of Item::field TBD")
	@OslcName("field")
	@OslcOccurs(Occurs.ZeroOrMany)
	@OslcPropertyDefinition("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Item_field")
	@OslcTitle("field")
	@OslcReadOnly(false)
	public Link[]  getField() {
		 return field.toArray(new Link[field.size()]);
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