package edu.gatech.mbsec.adapter.integrity.generators;

public class IntegrityItemField {
	
	String type;
	String description;
	boolean isMultiValued;
	String name;
	String backedBy;
	String displayStyle;
	
	public String getDisplayStyle() {
		return displayStyle;
	}
	public void setDisplayStyle(String displayStyle) {
		this.displayStyle = displayStyle;
	}
	public String getBackedBy() {
		return backedBy;
	}
	public void setBackedBy(String backedBy) {
		this.backedBy = backedBy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isMultiValued() {
		return isMultiValued;
	}
	public void setMultiValued(boolean isMultiValued) {
		this.isMultiValued = isMultiValued;
	}

}
