package edu.gatech.mbsec.adapter.integrity.generators;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;
import org.eclipse.lyo.oslc4j.core.annotation.OslcName;
import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;
import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;
import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;
import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;
import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;
import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;
import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;
import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.Link;
import org.eclipse.lyo.oslc4j.core.model.Occurs;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;
import org.eclipse.lyo.oslc4j.core.model.ValueType;

import com.mks.api.CmdRunner;
import com.mks.api.Command;
import com.mks.api.IntegrationPoint;
import com.mks.api.IntegrationPointFactory;
import com.mks.api.OptionList;
import com.mks.api.SelectionList;
import com.mks.api.Session;
import com.mks.api.response.APIException;
import com.mks.api.response.Field;
import com.mks.api.response.Item;
import com.mks.api.response.ItemList;
import com.mks.api.response.Response;
import com.mks.api.response.WorkItem;
import com.mks.api.response.WorkItemIterator;

import edu.gatech.mbsec.adapter.integrity.application.OSLC4JIntegrityApplication;

public class GenerateDynamicCustomIntegrityMetamodel extends Thread {

	static EPackage integrityPackage;
	static EClass eclass;
	static String customIntegrityMetamodelLocation = "C:/Users/rb16964/git/ecore4integrity/edu.gatech.mbsec.adapter.integrity.ecore/model/customIntegrity.ecore";
	static String basicIntegrityMetamodelLocation = "C:/Users/rb16964/git/ecore4integrity/edu.gatech.mbsec.adapter.integrity.ecore/model/basicIntegrity.ecore";
	static List<String> itemTypeNames = CustomIntegrityItemTypes
			.getCustomIntegrityItemTypes();

	static Map<EStructuralFeature, String> unresolvedEStructuralFeatures = new HashMap<EStructuralFeature, String>();

	public GenerateDynamicCustomIntegrityMetamodel(
			String generatorConfigFileLocation,
			String basicIntegrityMetamodelLocation2, List<String> itemTypeNames2) {
		customIntegrityMetamodelLocation = generatorConfigFileLocation;
		basicIntegrityMetamodelLocation = basicIntegrityMetamodelLocation2;
		itemTypeNames = itemTypeNames2;
	}

	public static void main(String[] args) {

		unresolvedEStructuralFeatures.clear();

		// create and populate map
		Map<String, ArrayList<Field>> itemTypeNameFieldNamesMap = new HashMap<String, ArrayList<Field>>();
		Map<String, ArrayList<IntegrityItemField>> itemTypeNameFieldNamesMap2 = new HashMap<String, ArrayList<IntegrityItemField>>();
		for (String itemTypeName : itemTypeNames) {
			// send api command to get an item of that type with specified
			// fields
			// browse through one item and get list of fields.
			// ArrayList<Field> itemTypeFields =
			// getItemTypeFields(itemTypeName);
			ArrayList<IntegrityItemField> itemTypeFields2 = getItemTypeFields2(itemTypeName);
			// itemTypeNameFieldNamesMap.put(itemTypeName, itemTypeFields);
			itemTypeNameFieldNamesMap2.put(itemTypeName, itemTypeFields2);
		}

		// create a new integrity metamodel based on basic integrity ecore
		// metamodel
		Resource ecoreResource = loadEcoreModel(URI.createFileURI(new File(
				basicIntegrityMetamodelLocation).getAbsolutePath()));

		// get root package
		integrityPackage = (EPackage) EcoreUtil.getObjectByType(
				ecoreResource.getContents(),
				EcorePackage.eINSTANCE.getEPackage());

		// TODO: use in RDF vocabulary namespace URI port number of user-defined configuration (8484 is hard-coded)
		
		// set ns uri and prefix
		integrityPackage.setNsURI("http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#");
		integrityPackage.setNsPrefix("integrity");

		Map<EStructuralFeature, String> unresolvedFieldTypesMap = new HashMap<EStructuralFeature, String>();

		// convertItemFieldsIntoEcore(itemTypeNameFieldNamesMap,
		// unresolvedFieldTypesMap);
		convertItemFieldsIntoEcore2(itemTypeNameFieldNamesMap2,
				unresolvedFieldTypesMap);

		// traverse again unset properties after initial loop to set property
		// types
		for (EStructuralFeature eStructuralFeature : unresolvedFieldTypesMap
				.keySet()) {
			String fieldTypeName = unresolvedFieldTypesMap
					.get(eStructuralFeature);
			EClass fieldTypeEClass = getEClass(MyEcoreUtil
					.getEcoreFieldName(fieldTypeName));
			if (fieldTypeEClass != null) {
				eStructuralFeature.setEType(fieldTypeEClass);
			} else {
				System.err
						.println("AFTER COMPLETE TRAVERSAL, FIELD TYPE NAMED "
								+ fieldTypeName
								+ " HAS NOT YET BEEN MAPPED INTO CUSTOM INTEGRITY METAMODEL AND HAS BEEN SET TO ITEM");

				// set generic field type to be Item
				EClass itemEClass = getEClass("Item");
				eStructuralFeature.setEType(itemEClass);
			}
		}

		// save custom integrity.ecore model
		String customIntegrityECoreFilePath = customIntegrityMetamodelLocation;
		saveEcoreModel(customIntegrityECoreFilePath, integrityPackage);

		// generate Java classes with OSLC4J annotations

	}

	private static void convertItemFieldsIntoEcore2(
			Map<String, ArrayList<IntegrityItemField>> itemTypeNameFieldNamesMap,
			Map<EStructuralFeature, String> unresolvedFieldTypesMap) {

		Map<String, List<String>> fieldAllowedTypesMap = getFieldAllowedTypes();

		for (String itemTypeName : itemTypeNameFieldNamesMap.keySet()) {
			// create new EClass for each item type
			EClass newEClass = EcoreFactory.eINSTANCE.createEClass();
			newEClass.setName(MyEcoreUtil.getEcoreTypeName(itemTypeName));

			
			
			for (IntegrityItemField itemTypeField : itemTypeNameFieldNamesMap
					.get(itemTypeName)) {
				EStructuralFeature eStructuralFeature = null;
				// add new EAttribute/EReference for each item type field
				boolean isFieldTypePrimitive = false;
				String fieldTypeName = itemTypeField.getType();
				
				String fieldDisplayStyle = itemTypeField.getDisplayStyle();					
				
				if (fieldTypeName != null) {

					// shorttext, state, integer, logical,
					// date, relationship, attachment
					if (fieldTypeName.equals("shorttext")
							| fieldTypeName.equals("longtext")
							| fieldTypeName.equals("logical")
							| fieldTypeName.equals("integer")
							| fieldTypeName.equals("date")
							| fieldTypeName.equals("float")
							| fieldTypeName.equals("user")
							| fieldTypeName.equals("state")
							| fieldTypeName.equals("pick")
							| fieldTypeName.equals("fva") // field of type fva
															// is a string (for
															// 99% of item
															// fields) and a
															// reference (for
															// field
															// textAttachments
															// of
															// requirementss!).
															// So it can be
															// both? fva cannot
															// be used to
															// determine field
															// type! maybe in combination with attribute backedBy - depends on referenced attribute/reference?
							| fieldTypeName.equals("phase")
							| fieldTypeName.equals("ibpl")) {	// field Reports of item type Requirement is of type ibpl (isMultiValued = true, displayAsLink = false) 	No references
						isFieldTypePrimitive = true;
					}

					// example: field Text Attachments of item type Requirement. Type: fva. Values defined in table. References other items
					if(fieldDisplayStyle != null){
						if(fieldDisplayStyle.equals("table") & fieldTypeName.equals("fva")){
							isFieldTypePrimitive = false;
						}
					}
					
					
					if (!isFieldTypePrimitive) {
						eStructuralFeature = EcoreFactory.eINSTANCE
								.createEReference();
						EReference eReference = (EReference) eStructuralFeature;
						// containment = true
						eReference.setContainment(true);

						// set eStructuralFeature type

						// ecoreFieldTypeName starts with uppercase letter

						// String ecoreFieldTypeName =
						// MyEcoreUtil.getEcoreTypeName(fieldTypeName);

						// check if for field name, there is a condition on the
						// filed type
						// Example, for field name = contains, if item type
						// owning field = Req Doc, field type = Req
						// establish map of allowed types

						EClassifier fieldTypeEClass = null;
						if (fieldTypeName.equals("project")) {
							fieldTypeEClass = getEClass("Project");
						} else if (fieldAllowedTypesMap
								.containsKey(itemTypeField.getName())) {
							List<String> allowedTypesPairs = fieldAllowedTypesMap
									.get(itemTypeField.getName());
							for (String allowedTypes : allowedTypesPairs) {
								String[] allowedTypesArray = allowedTypes
										.split(":");
								String fromType = allowedTypesArray[0];
								if (fromType.equals(itemTypeName)) {
									String toType = allowedTypesArray[1];
									fieldTypeEClass = getEClass(MyEcoreUtil
											.getEcoreTypeName(toType));
									if (fieldTypeEClass == null) {
										// Ecore type has not yet been created
										// during the creation of the ecore
										// metamodel
										// the eRference can be set with correct
										// type definition at a second traversal

										// save estructuralFeature and name of
										// type to be set
										unresolvedEStructuralFeatures
												.put(eStructuralFeature,
														MyEcoreUtil
																.getEcoreTypeName(toType));
									}
									break;
								}
							}

						}

						if (fieldTypeEClass == null) {
							fieldTypeEClass = getEClass("Item");
						}

						if (fieldTypeEClass != null) {
							eStructuralFeature.setEType(fieldTypeEClass);
						}

					} else {
						eStructuralFeature = EcoreFactory.eINSTANCE
								.createEAttribute();

						// set eStructuralFeature type
						// if (fieldTypeName.equals("integer") |
						// fieldTypeName.equals("phase")) {
						// fieldTypeName.equals("phase"), example Document Phase
						// of Product Requirement Document is of type Phase,
						// value is of type String
						if (fieldTypeName.equals("integer")) {
							eStructuralFeature.setEType(EcorePackage.eINSTANCE
									.getEInt());
						} else if (fieldTypeName.equals("logical")) {
							eStructuralFeature.setEType(EcorePackage.eINSTANCE
									.getEBoolean());
						} else if (fieldTypeName.equals("float")) {
							eStructuralFeature.setEType(EcorePackage.eINSTANCE
									.getEFloat());
						} else {
							// set EString as EType
							eStructuralFeature.setEType(EcorePackage.eINSTANCE
									.getEString());
						}

					}

					// add new eStructuralFeature to EClass
					newEClass.getEStructuralFeatures().add(eStructuralFeature);

					// set eStructuralFeature name
					eStructuralFeature.setName(MyEcoreUtil
							.getEcoreFieldName(itemTypeField.getName()));

					// set eStructuralFeature multiplicity
					if (itemTypeField.isMultiValued()) {
						// set lowerBound (0)
						eStructuralFeature.setLowerBound(0);
						// set upperBound (-1)
						eStructuralFeature.setUpperBound(-1);
					} else {
						// set lowerBound (0)
						eStructuralFeature.setLowerBound(0);
						// set upperBound (-1)
						eStructuralFeature.setUpperBound(1);
					}

				} else {
					System.err.println("FIELD NAMED " + itemTypeField.getName()
							+ " OWNED BY TYPE " + itemTypeName
							+ " HAS NO TYPE!");
					continue;
				}

			}
			// add new EClass to root package
			integrityPackage.getEClassifiers().add(newEClass);

			// add new reference to project
			EClass projectEClass = getEClass("Project");
			EStructuralFeature projectStructuralFeature = EcoreFactory.eINSTANCE
					.createEReference();
			projectEClass.getEStructuralFeatures().add(
					(EReference) projectStructuralFeature);
			String projectFeatureName = MyEcoreUtil
					.getEcoreTypeName(itemTypeName);
			projectStructuralFeature.setName(projectFeatureName.substring(0, 1)
					.toLowerCase()
					+ projectFeatureName.substring(1,
							projectFeatureName.length()));
			projectStructuralFeature.setEType(newEClass);
			// set lowerBound (0)
			projectStructuralFeature.setLowerBound(0);
			// set upperBound (-1)
			projectStructuralFeature.setUpperBound(-1);
		}

		// resolve unresolvedEStructuralFeatures
		for (EStructuralFeature eStructuralFeature : unresolvedEStructuralFeatures
				.keySet()) {
			EClass eclass = getEClass(unresolvedEStructuralFeatures
					.get(eStructuralFeature));
			if (eclass != null) {
				eStructuralFeature.setEType(eclass);
			} else {
				// not necessarily an error - only an error if adapter has to consider ALL Integrity item types
				// if adapter is configured to not consider items of type X, adapter will consider items of type X as items of generic type "Item"
				
//				System.err.println("Type "
//						+ unresolvedEStructuralFeatures.get(eStructuralFeature)
//						+ " of feature " + eStructuralFeature.getName()
//						+ " cannot be set");
			}
		}
	}

	private static void convertItemFieldsIntoEcore(
			Map<String, ArrayList<Field>> itemTypeNameFieldNamesMap,
			Map<EStructuralFeature, String> unresolvedFieldTypesMap) {
		for (String itemTypeName : itemTypeNameFieldNamesMap.keySet()) {
			// create new EClass for each item type
			EClass newEClass = EcoreFactory.eINSTANCE.createEClass();
			newEClass.setName(itemTypeName);

			for (Field itemTypeField : itemTypeNameFieldNamesMap
					.get(itemTypeName)) {
				EStructuralFeature eStructuralFeature = null;
				// add new EAttribute/EReference for each item type field
				if (itemTypeField.getDataType() != null) {
					if (itemTypeField.getDataType().equals(
							"com.mks.api.response.ItemList")
							| itemTypeField.getDataType().equals(
									"com.mks.api.response.Item")) {
						eStructuralFeature = EcoreFactory.eINSTANCE
								.createEReference();

						if (itemTypeField.getDataType().equals(
								"com.mks.api.response.ItemList")) {
							// set lowerBound (0)
							eStructuralFeature.setLowerBound(0);
							// set upperBound (-1)
							eStructuralFeature.setUpperBound(-1);
						} else {
							// itemTypeField.getDataType().equals("com.mks.api.response.Item")

							// set lowerBound (0)
							eStructuralFeature.setLowerBound(0);
							// set upperBound (-1)
							eStructuralFeature.setUpperBound(1);
						}

						EReference eReference = (EReference) eStructuralFeature;
						// containment = true
						eReference.setContainment(true);
						// add new eFeature to new EClass
						newEClass.getEStructuralFeatures().add(eReference);

						// set type
						String fieldTypeName = itemTypeField.getDataType();
						EClass fieldTypeEClass = getEClass(fieldTypeName);
						if (fieldTypeEClass != null) {
							eStructuralFeature.setEType(fieldTypeEClass);
						} else {
							// if type hasn't yet been added to ecore, then
							// traverse again unset properties after initial
							// loop
							System.err
									.println("FIELD TYPE NAMED "
											+ fieldTypeName
											+ " HAS NOT YET BEEN MAPPED INTO CUSTOM INTEGRITY METAMODEL!");
							// add to map eStructuralFeature, fieldTypeName
							unresolvedFieldTypesMap.put(eStructuralFeature,
									fieldTypeName);
						}

					} else {
						eStructuralFeature = EcoreFactory.eINSTANCE
								.createEAttribute();
						// set lowerBound (0)
						eStructuralFeature.setLowerBound(0);
						// set upperBound (-1)
						eStructuralFeature.setUpperBound(1);
						// add new eFeature to new EClass
						newEClass.getEStructuralFeatures().add(
								(EAttribute) eStructuralFeature);

						// set type
						if (itemTypeField.getDataType().equals(
								"java.lang.String")) {
							// set EString as EType
							eStructuralFeature.setEType(EcorePackage.eINSTANCE
									.getEString());
						} else if (itemTypeField.getDataType().equals(
								"java.lang.Integer")) {
							eStructuralFeature.setEType(EcorePackage.eINSTANCE
									.getEInt());
						} else if (itemTypeField.getDataType().equals(
								"java.lang.Boolean")) {
							eStructuralFeature.setEType(EcorePackage.eINSTANCE
									.getEBoolean());
						} else if (itemTypeField.getDataType().equals(
								"java.util.Date")) {
							eStructuralFeature.setEType(EcorePackage.eINSTANCE
									.getEString());
						} else {
							System.err.println("FIELD NAMED "
									+ itemTypeField.getName() + " OF TYPE "
									+ itemTypeField.getDataType()
									+ " IS NOT SUPPORTED!");
						}

					}
				} else {
					System.err.println("FIELD NAMED " + itemTypeField.getName()
							+ " OWNED BY TYPE " + itemTypeName
							+ " HAS NO TYPE!");
					continue;
				}

				// eStructuralFeature name
				eStructuralFeature.setName(itemTypeField.getName());

			}
			// add new EClass to root package
			integrityPackage.getEClassifiers().add(newEClass);

			// add new reference to project
			EClass projectEClass = getEClass("Project");
			EStructuralFeature projectStructuralFeature = EcoreFactory.eINSTANCE
					.createEReference();
			projectEClass.getEStructuralFeatures().add(
					(EReference) projectStructuralFeature);
			projectStructuralFeature.setName(itemTypeName);
			projectStructuralFeature.setEType(newEClass);
			// set lowerBound (0)
			projectStructuralFeature.setLowerBound(0);
			// set upperBound (-1)
			projectStructuralFeature.setUpperBound(-1);
		}

	}

	// private static void initializePrimitiveETypes() {
	// integrityPackage = (EPackage) EcoreUtil.getObjectByType(
	// ecoreResource.getContents(),
	// EcorePackage.eINSTANCE.getEPackage());
	// EcoreUtil.geto
	// EcorePackage.
	// }

	private static ArrayList<Field> getItemTypeFields(String itemTypeName) {
		IntegrationPointFactory integrationPointFactory = IntegrationPointFactory
				.getInstance();
		IntegrationPoint integrationPoint;
		ArrayList<Field> itemTypeFields = new ArrayList<Field>();
		ArrayList<IntegrityItemField> itemTypeFields2 = new ArrayList<IntegrityItemField>();
		try {
			integrationPoint = integrationPointFactory
					.createLocalIntegrationPoint(4, 12);
			Session session = integrationPoint.getCommonSession();
			CmdRunner queryReqDocsCmdRunner;
			queryReqDocsCmdRunner = session.createCmdRunner();
			Command queryReqDocsCommand = new Command(Command.IM, "issues");
			OptionList queryReqDocsList = new OptionList();
			// queryReqDocsList.add("query", "alm_All Requirements Documents");
			// --hostname=lsdewcs8.sdde.xxxxx.com
			queryReqDocsList.add("hostname", GenerateAdapter.integrityHostName);
			queryReqDocsList.add("query", "All " + itemTypeName + "s");

			String fieldNameList = getItemTypeFieldNames(itemTypeName);

			// other approach to get field info
			String[] fieldNames = fieldNameList.split(",");
			for (String fieldName : fieldNames) {
				IntegrityItemField integrityItemField = getItemTypeFieldInfo(
						itemTypeName, fieldName);
				itemTypeFields2.add(integrityItemField);
			}

			queryReqDocsList.add("fields", fieldNameList);
			// queryReqDocsList.add(fieldNameListBuffer.toString());

			queryReqDocsCommand.setOptionList(queryReqDocsList);
			Response queryReqDocsResponse = queryReqDocsCmdRunner
					.execute(queryReqDocsCommand);
			WorkItemIterator reqDocItemIterator = queryReqDocsResponse
					.getWorkItems();

			// only traverse through one item of custom type to get list of
			// field objects
			while (reqDocItemIterator.hasNext()) {
				WorkItem reqDocItem = reqDocItemIterator.next();
				Iterator fieldsIterator = reqDocItem.getFields();
				while (fieldsIterator.hasNext()) {
					Object fieldObject = fieldsIterator.next();
					if (fieldObject instanceof Field) {
						Field field = (Field) fieldObject;
						itemTypeFields.add(field);
					}
				}
				break;
			}
		} catch (APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return itemTypeFields;
	}

	private static ArrayList<IntegrityItemField> getItemTypeFields2(
			String itemTypeName) {
		ArrayList<IntegrityItemField> itemTypeFields = new ArrayList<IntegrityItemField>();
		String fieldNameList = getItemTypeFieldNames(itemTypeName);
		// get field info
		String[] fieldNames = fieldNameList.split(",");
		Set<String> fieldNamesSet = new HashSet<String>();
		for (String fieldName : fieldNames) {

			// avoid duplicate fields
			if (!fieldNamesSet.contains(fieldName)) {
				fieldNamesSet.add(fieldName);
			} else {
				continue;
			}

			IntegrityItemField integrityItemField = getItemTypeFieldInfo(
					itemTypeName, fieldName);
			itemTypeFields.add(integrityItemField);
		}
		return itemTypeFields;
	}

	private void getItemTypeFieldInfos(String itemTypeName) {
		// get list of field names for an item type
		String fieldNameList = getItemTypeFieldNames(itemTypeName);

		// get list of field info (type name + is multi-valued?)
	}

	private static Resource loadEcoreModel(URI fileURI) {
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet
				.getResourceFactoryRegistry()
				.getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION,
						new XMIResourceFactoryImpl());

		// Register the package -- only needed for stand-alone!
		EcorePackage ecorePackage = EcorePackage.eINSTANCE;

		// Demand load the resource for this file.
		Resource resource = resourceSet.getResource(fileURI, true);
		return resource;
	}

	private static Resource saveEcoreModel(String filePath, EObject rootPackage) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("ecore", new XMIResourceFactoryImpl());
		ResourceSet resSet = new ResourceSetImpl();
		Resource resource = resSet.createResource(URI.createFileURI(filePath));

		// Resource resource = loadEcoreModel(URI.createFileURI(filePath));

		resource.getContents().add(rootPackage);
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resource;

	}

	public static EClass getEClass(String eClassName) {
		if (integrityPackage == null) {
			Resource ecoreResource = loadEcoreModel(URI.createFileURI(new File(
					customIntegrityMetamodelLocation).getAbsolutePath()));
			integrityPackage = (EPackage) EcoreUtil.getObjectByType(
					ecoreResource.getContents(),
					EcorePackage.eINSTANCE.getEPackage());
		}

		for (Object eclassifier : integrityPackage.getEClassifiers()) {
			if (eclassifier instanceof EClass) {
				EClass eClass = (EClass) eclassifier;
				if (eClass.getName().equals(eClassName)) {
					return eClass;
				}
			}
		}
		return null;
	}

	private static String getItemTypeFieldNames(String itemTypeName) {
		IntegrationPointFactory integrationPointFactory = IntegrationPointFactory
				.getInstance();
		IntegrationPoint integrationPoint;
		StringBuffer fieldNameListBuffer = new StringBuffer();
		try {
			integrationPoint = integrationPointFactory
					.createLocalIntegrationPoint(4, 12);
			Session session = integrationPoint.getCommonSession();
			CmdRunner queryReqDocsCmdRunner;

			queryReqDocsCmdRunner = session.createCmdRunner();
			ArrayList<String> itemTypeFields = new ArrayList<String>();
			// get all fields of Module_Component Requirement Documents
			Command queryReqDocsFieldCommand = new Command(Command.IM,
					"viewtype");
			// command hostname option
			OptionList queryReqDocsFieldOptionList = new OptionList();
			queryReqDocsFieldOptionList.add("hostname",
					GenerateAdapter.integrityHostName);
			queryReqDocsFieldCommand.setOptionList(queryReqDocsFieldOptionList);
			// command viewtype argument
			SelectionList queryReqDocsFieldSelectionList = new SelectionList();
			queryReqDocsFieldSelectionList.add(itemTypeName);
			queryReqDocsFieldCommand
					.setSelectionList(queryReqDocsFieldSelectionList);
			// send command
			Response queryReqDocsFieldResponse = queryReqDocsCmdRunner
					.execute(queryReqDocsFieldCommand);
			WorkItemIterator reqDocItemFieldIterator = queryReqDocsFieldResponse
					.getWorkItems();

			// create string for queryReqDocsList
			while (reqDocItemFieldIterator.hasNext()) {
				WorkItem workItem = (WorkItem) reqDocItemFieldIterator.next();
				Iterator fieldIterator = workItem.getFields();
				boolean isCommaNeeded = false;
				while (fieldIterator.hasNext()) {
					Field field = (Field) fieldIterator.next();
					String fieldName = field.getName();

					if (fieldName.equals("visibleFields")) {
						if (isCommaNeeded) {
							fieldNameListBuffer.append(",");
						}
						fieldNameListBuffer.append(field.getValueAsString());
						isCommaNeeded = true;
					}

					if (fieldName.equals("systemManagedFields")) {
						if (isCommaNeeded) {
							fieldNameListBuffer.append(",");
						}
						fieldNameListBuffer.append(field.getValueAsString());
						isCommaNeeded = true;
					}
				}
			}
		} catch (APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return fieldNameListBuffer.toString();

	}

	private static Map<String, List<String>> getFieldAllowedTypes() {
		IntegrationPointFactory integrationPointFactory = IntegrationPointFactory
				.getInstance();
		IntegrationPoint integrationPoint;
		Map<String, List<String>> fieldNameAndAllowedTypes = new HashMap<String, List<String>>();
		try {
			integrationPoint = integrationPointFactory
					.createLocalIntegrationPoint(4, 12);
			Session session = integrationPoint.getCommonSession();
			// CmdRunner queryReqDocsCmdRunner;
			//
			// queryReqDocsCmdRunner = session.createCmdRunner();
			//
			// // get all fields of Module_Component Requirement Documents
			// Command queryReqDocsFieldCommand = new Command(Command.IM,
			// "fields");
			// // command hostname option
			// OptionList queryReqDocsFieldOptionList = new OptionList();
			// queryReqDocsFieldOptionList.add("hostname",
			// "lsdewcs8.sdde.xxxxx.com");
			// queryReqDocsFieldOptionList.add("fields",
			// "name");
			// queryReqDocsFieldCommand.setOptionList(queryReqDocsFieldOptionList);
			//
			// // send command
			// Response queryReqDocsFieldResponse = queryReqDocsCmdRunner
			// .execute(queryReqDocsFieldCommand);
			// WorkItemIterator reqDocItemFieldIterator =
			// queryReqDocsFieldResponse
			// .getWorkItems();
			//
			// ArrayList<String> fieldNames = new ArrayList<String>();
			// // create string for queryReqDocsList
			// while (reqDocItemFieldIterator.hasNext()) {
			// WorkItem workItem = (WorkItem) reqDocItemFieldIterator.next();
			// fieldNames.add(workItem.toString());
			// }
			// System.out.println(fieldNames);

			CmdRunner quer2CommandRunner = session.createCmdRunner();
			Command quer2Command = new Command(Command.IM, "fields");
			// command hostname option
			OptionList quer2CommandOptionList = new OptionList();
			quer2CommandOptionList.add("hostname",
					GenerateAdapter.integrityHostName);
			quer2CommandOptionList.add("fields", "allowedTypes");
			quer2Command.setOptionList(quer2CommandOptionList);

			// send command
			Response quer2CommandResponse = quer2CommandRunner
					.execute(quer2Command);
			WorkItemIterator quer2ResponseIterator = quer2CommandResponse
					.getWorkItems();

			List<String> allowedTypesPairs = new ArrayList<String>();

			while (quer2ResponseIterator.hasNext()) {
				WorkItem workItem = (WorkItem) quer2ResponseIterator.next();
				Iterator workItemIterator = workItem.getFields();
				if (workItemIterator.hasNext()) {
					Field field = (Field) workItemIterator.next();
					ItemList allowedTypesItemList = (ItemList) field.getValue();
					if (allowedTypesItemList != null) {
						Iterator allowedTypesItemListIT = allowedTypesItemList
								.iterator();
						while (allowedTypesItemListIT.hasNext()) {
							Item item = (Item) allowedTypesItemListIT.next();
							Field fromField = item.getField("from");
							String fromType = fromField.getValueAsString();
							Field toField = item.getField("to");
							String toType = toField.getValueAsString();

							String allowedTypesPair = fromType + ":" + toType;
							// String allowedTypesPair = toType + ":" +
							// fromType;
							allowedTypesPairs.add(allowedTypesPair);
						}
					}
				}
				fieldNameAndAllowedTypes.put(workItem.toString(),
						allowedTypesPairs);
			}

		} catch (APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return fieldNameAndAllowedTypes;

	}

	private static IntegrityItemField getItemTypeFieldInfo(String itemTypeName,
			String itemTypeFieldName) {
		IntegrationPointFactory integrationPointFactory = IntegrationPointFactory
				.getInstance();
		IntegrationPoint integrationPoint;
		IntegrityItemField itemTypeField = new IntegrityItemField();
		try {
			integrationPoint = integrationPointFactory
					.createLocalIntegrationPoint(4, 12);
			Session session = integrationPoint.getCommonSession();
			CmdRunner queryReqDocsCmdRunner;

			queryReqDocsCmdRunner = session.createCmdRunner();

			// get all fields of Module_Component Requirement Documents
			Command queryReqDocsFieldCommand = new Command(Command.IM,
					"viewfield");
			// command hostname option
			OptionList queryReqDocsFieldOptionList = new OptionList();
			queryReqDocsFieldOptionList.add("hostname",
					GenerateAdapter.integrityHostName);
			queryReqDocsFieldOptionList.add("overrideForType", itemTypeName);

			queryReqDocsFieldCommand.setOptionList(queryReqDocsFieldOptionList);
			// command viewtype argument
			SelectionList queryReqDocsFieldSelectionList = new SelectionList();
			queryReqDocsFieldSelectionList.add(itemTypeFieldName);
			queryReqDocsFieldCommand
					.setSelectionList(queryReqDocsFieldSelectionList);
			// send command
			Response queryReqDocsFieldResponse = queryReqDocsCmdRunner
					.execute(queryReqDocsFieldCommand);
			WorkItemIterator reqDocItemFieldIterator = queryReqDocsFieldResponse
					.getWorkItems();

			// create string for queryReqDocsList
			while (reqDocItemFieldIterator.hasNext()) {
				WorkItem workItem = (WorkItem) reqDocItemFieldIterator.next();
				Iterator fieldIterator = workItem.getFields();
				boolean isCommaNeeded = false;

				while (fieldIterator.hasNext()) {
					Field field = (Field) fieldIterator.next();
					String fieldName = field.getName();

					// if (fieldName.equals("dataType")){
					// System.out.println(field.getValueAsString());
					// }

					if (fieldName.equals("type")) {
						// primitive types: shorttext, state, integer, logical,
						// relationship,
						// date

						// pick = enumeration?
						// System.out.println(field.getValueAsString());
						itemTypeField.setType(field.getValueAsString());
					}

					if (fieldName.equals("description")) {
						itemTypeField.setDescription(field.getValueAsString());
					}

					if (fieldName.equals("isMultiValued")) {
						itemTypeField.setMultiValued(Boolean.parseBoolean(field
								.getValueAsString()));
					}

					if (fieldName.equals("name")) {
						itemTypeField.setName(field.getValueAsString());
					}
					if (fieldName.equals("backedBy")) {
						itemTypeField.setBackedBy(field.getValueAsString());
					}
					if (fieldName.equals("displayStyle")) {
						itemTypeField.setDisplayStyle(field.getValueAsString());
					}
				}

				// if field type = relationship, then field is multi-valued,
				// even if is multi-valued=false
				if (itemTypeField.getType().equals("relationship")
						| itemTypeField.getType().equals("attachment")
						| itemTypeField.getType().equals("fva")) {
					itemTypeField.setMultiValued(true);
				}

			}
		} catch (APIException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return itemTypeField;

	}

	@Override
	public void run() {
		main(null);

	}

}
