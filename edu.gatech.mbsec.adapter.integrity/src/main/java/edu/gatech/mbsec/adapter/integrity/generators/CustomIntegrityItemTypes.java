package edu.gatech.mbsec.adapter.integrity.generators;

import java.util.ArrayList;

public class CustomIntegrityItemTypes {
	
	public static ArrayList<String> getCustomIntegrityItemTypes(){
		ArrayList<String> itemTypeNames = new ArrayList<String>();
		itemTypeNames.add("Product Requirement");
		itemTypeNames.add("Product Requirement Document");
		return itemTypeNames;
	}
	
}
