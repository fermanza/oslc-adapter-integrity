package edu.gatech.mbsec.adapter.integrity.generators;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
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

import edu.gatech.mbsec.adapter.integrity.application.util.IntegrityUtil;
import edu.gatech.mbsec.adapter.integrity.generated.resources.Constants;

public class GenerateResourceClasses implements Runnable {

	static EPackage integrityPackage;
	static EClass eclass;
	// static String javaResourceDirectory =
	// "C:/Users/rb16964/git/oslc4jintegrity/oslc4jintegrity/src/main/java/edu/gatech/mbsec/adapter/integrity/generated/resources/";
	static String javaResourceDirectory = "C:/Users/rb16964/git/oslc4jintegrit.wink/oslc4jintegrity-wink/src/main/java/edu/gatech/mbsec/adapter/integrity/generated/resources/";
	static String ecoreMetamodelLocation = "C:/Users/rb16964/git/ecore4integrity/edu.gatech.mbsec.adapter.integrity.ecore/model/customIntegrity.ecore";

	public GenerateResourceClasses(String customIntegrityMetamodelLocation,
			String javaResourcePackageLocation) {
		ecoreMetamodelLocation = customIntegrityMetamodelLocation;
		javaResourceDirectory = javaResourcePackageLocation;
	}

	public static void main(String[] args) {

		// load integrity.ecore model
		Resource ecoreResource = loadEcoreModel(URI.createFileURI(new File(
				ecoreMetamodelLocation).getAbsolutePath()));

		integrityPackage = (EPackage) EcoreUtil.getObjectByType(
				ecoreResource.getContents(),
				EcorePackage.eINSTANCE.getEPackage());

		for (Object eclassifier : integrityPackage.getEClassifiers()) {
			if (eclassifier instanceof EClass) {
				eclass = (EClass) eclassifier;

				if (!eclass.isAbstract()) {
					// create annotated Java class
					StringBuffer buffer = new StringBuffer();

					// print package declaration
					printPackageDeclaration(buffer);

					// print import statements
					printImportStatements(buffer);

					// print Java class OSLC annotations
					printJavaClassOSLCAnnotations(buffer);

					// print Java class declaration
					printJavaClassDeclaration(buffer);

					// print Java class constructors
					printJavaClassConstructors(buffer);

					// print Java class attributes
					printJavaClassAttributes(buffer);

					// print Java class references
					printJavaClassReferences(buffer);

					// print references to common MBSE vocabulary types
					// if(eclass.getName().endsWith("Requirement")){
					// addReferenceToMBSERequirementType(buffer);
					// }

					buffer.append("}");

					FileWriter fileWriter;
					try {
						fileWriter = new FileWriter(javaResourceDirectory
								+ "Integrity" + eclass.getName() + ".java");
						fileWriter.append(buffer);
						fileWriter.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}

			} else if (eclassifier instanceof EEnum) {
				EEnum eEnum = (EEnum) eclassifier;

				// create annotated Java enumeration
				StringBuffer buffer = new StringBuffer();

				// print package declaration
				printPackageDeclaration(buffer);

				// print enum
				printJavaEnum(buffer, eEnum);

				FileWriter fileWriter;
				try {
					fileWriter = new FileWriter(javaResourceDirectory
							+ "Integrity" + eEnum.getName() + ".java");
					fileWriter.append(buffer);
					fileWriter.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}

	private static void addReferenceToMBSERequirementType(StringBuffer buffer) {

		buffer.append("\t// ********* rdfType *********");
		buffer.append("\r\n");
		buffer.append("\tprivate URI[] rdfTypes = new URI[1];");
		buffer.append("\r\n");
		buffer.append("\tpublic void setRdfTypes(final URI[] rdfTypes) {");
		buffer.append("\r\n");
		buffer.append("\t\tthis.rdfTypes = rdfTypes;");
		buffer.append("\r\n");
		buffer.append("\t}");
		buffer.append("\r\n");
		buffer.append("\t@OslcDescription(\"Additional resource type URIs \")");
		buffer.append("\r\n");
		buffer.append("\t@OslcName(\"type\")");
		buffer.append("\r\n");
		buffer.append("\t@OslcOccurs(Occurs.ZeroOrMany)");
		buffer.append("\r\n");
		buffer.append("\t@OslcPropertyDefinition(OslcConstants.RDF_NAMESPACE + \"type\")");
		buffer.append("\r\n");
		buffer.append("\tpublic URI[]  getRdfTypes() {");
		buffer.append("\r\n");
		buffer.append("\t\tURI[] rdfTypes = {URI.create(\"http://eclipse.org/MBSE/Requirement\"), URI.create(\""
				+ integrityPackage.getNsURI() + eclass.getName() + "\")};");
		buffer.append("\r\n");
		buffer.append("\t\treturn rdfTypes;");
		buffer.append("\r\n");
		buffer.append("\t}");
		buffer.append("\r\n");

	}

	private static void printJavaClassReferences(StringBuffer buffer) {

		// keep track of field names
		// avoid duplicate names
		Set<String> fieldNames = new HashSet<String>();

		for (Object object : eclass.getEAllReferences()) {
			if (object instanceof EReference) {
				EReference ereference = (EReference) object;

				// ignore duplicate fields
				if (fieldNames.contains(ereference.getName())) {
					continue;
				} else {
					fieldNames.add(ereference.getName());
				}

				if (ereference.isDerived()) {
					continue;
				}

				int lowerBound = ereference.getLowerBound();
				int upperBound = ereference.getUpperBound();

				// find reference name
//				String referenceName = ereference.getName();
				String referenceName = IntegrityUtil.getValidFieldName(ereference.getName());

				// find reference name with first char in uppercase
				String referenceNameFirstLetter = referenceName
						.subSequence(0, 1).toString().toUpperCase();
				String referenceNameRest = referenceName.subSequence(1,
						referenceName.length()).toString();
				String referenceNameUpperCase = referenceNameFirstLetter
						+ referenceNameRest;

				// find name of class containing reference
				String referenceContainingClassName = ereference
						.getEContainingClass().getName();

				// find name of reference type
				String referenceTypeName = null;
				EClassifier etype = ereference.getEType();
				if (etype.getName() != null) {
					if (etype.getName().equals("EString")) {
						referenceTypeName = "String";
					} else {
						referenceTypeName = "Integrity" + etype.getName();
					}
				}

				// do not generate code for the reference if its type is not
				// resolved
				if (referenceTypeName == null) {
					continue;
				}

				// if reference is multiple-valued
				if (lowerBound >= 0 & upperBound == -1 | lowerBound >= 0
						& upperBound >= 2) {

					// add comments to mark section
					buffer.append("\t// ********* " + referenceName
							+ " *********");
					buffer.append("\r\n");

					String originalReferenceName = referenceName;
					// if (referenceName.endsWith("y")) {
					// referenceName = referenceName.substring(0,
					// referenceName.length() - 1) + "ie";
					// referenceNameUpperCase = referenceNameUpperCase
					// .substring(0,
					// referenceNameUpperCase.length() - 1)
					// + "ie";
					// } else if (referenceName.endsWith("ed")) {
					// referenceName = referenceName + "Element";
					// referenceNameUpperCase = referenceNameUpperCase
					// + "Element";
					// } else if (referenceName.endsWith("om")) {
					// referenceName = referenceName + "Element";
					// referenceNameUpperCase = referenceNameUpperCase
					// + "Element";
					// }

					// print reference declaration
					buffer.append("\tprivate final Set<Link> " + referenceName
							+ " = new HashSet<Link>();");
					// buffer.append("\tprivate final Set<Link> " +
					// referenceName
					// + "s = new HashSet<Link>();");
					buffer.append("\r\n");
					buffer.append("\r\n");

					// print reference setter method
					buffer.append("\tpublic void set" + referenceNameUpperCase
							+ "(final Link[] " + referenceName + ") {");
					// buffer.append("\tpublic void set" +
					// referenceNameUpperCase
					// + "s(final Link[] " + referenceName + "s) {");
					buffer.append("\r\n");
					buffer.append("\t\tthis." + referenceName + ".clear();");
					buffer.append("\r\n");
					buffer.append("\t\tif (" + referenceName + " != null)");
					buffer.append("\r\n");
					// buffer.append("\t\tthis." + referenceName +
					// "s.clear();");
					// buffer.append("\r\n");
					// buffer.append("\t\tif (" + referenceName + "s != null)");
					// buffer.append("\r\n");
					buffer.append("\t\t{");
					buffer.append("\r\n");
					buffer.append("\t\t\tthis." + referenceName
							+ ".addAll(Arrays.asList(" + referenceName + "));");
					// buffer.append("\t\t\tthis." + referenceName
					// + "s.addAll(Arrays.asList(" + referenceName
					// + "s));");
					buffer.append("\r\n");
					buffer.append("\t\t}");
					buffer.append("\r\n");
					buffer.append("\t}");
					buffer.append("\r\n");
					buffer.append("\r\n");

					// print reference getter method annotations

					// @OslcDescription
					buffer.append("\t@OslcDescription(\"Description of "
							+ referenceContainingClassName + "::"
							+ originalReferenceName + " TBD\")");
					buffer.append("\r\n");

					// @OslcName
					buffer.append("\t@OslcName(\"" + originalReferenceName
							+ "\")");
					buffer.append("\r\n");

					// @OslcOccurs
					if (lowerBound == 0 & upperBound == -1) {
						buffer.append("\t@OslcOccurs(Occurs.ZeroOrMany)");
						buffer.append("\r\n");
					} else if (lowerBound == 1 & upperBound == -1) {
						buffer.append("\t@OslcOccurs(Occurs.OneOrMany)");
						buffer.append("\r\n");
					}

					// @OslcPropertyDefinition
					buffer.append("\t@OslcPropertyDefinition(\""
							+ Constants.INTEGRITY_NAMESPACE
							+ referenceContainingClassName + "_"
							+ originalReferenceName + "\")");
					buffer.append("\r\n");

					// @OslcTitle
					buffer.append("\t@OslcTitle(\"" + originalReferenceName
							+ "\")");
					buffer.append("\r\n");

					// @OslcReadOnly
					buffer.append("\t@OslcReadOnly(false)");
					buffer.append("\r\n");

					// // @OslcValueType
					// if(referenceTypeName.equals("String")){
					// buffer.append("\t@OslcValueType(ValueType.XMLLiteral)");
					// buffer.append("\r\n");
					// }

					// print reference getter method
					buffer.append("\tpublic Link[] " + " get"
							+ referenceNameUpperCase + "() {");
					// buffer.append("\tpublic Link[] " + " get"
					// + referenceNameUpperCase + "s() {");
					buffer.append("\r\n");
					buffer.append("\t\t return " + referenceName
							+ ".toArray(new Link[" + referenceName
							+ ".size()]);");
					// buffer.append("\t\t return " + referenceName
					// + "s.toArray(new Link[" + referenceName
					// + "s.size()]);");
					buffer.append("\r\n");
					buffer.append("\t}");
					buffer.append("\r\n");
					buffer.append("\r\n");

				} else if (lowerBound >= 0 & upperBound == 1) {

					// add comments to mark section
					buffer.append("\t// ********* " + referenceName
							+ " *********");
					buffer.append("\r\n");

					// print reference declaration
					buffer.append("\tprivate URI " + referenceName + ";");
					buffer.append("\r\n");
					buffer.append("\r\n");

					// print reference setter method
					buffer.append("\tpublic void set" + referenceNameUpperCase
							+ "(final URI " + referenceName + ") {");
					buffer.append("\r\n");
					buffer.append("\t\tthis." + referenceName + " = "
							+ referenceName + ";");
					buffer.append("\r\n");
					buffer.append("\t}");
					buffer.append("\r\n");
					buffer.append("\r\n");

					// print reference getter method annotations

					// @OslcDescription
					buffer.append("\t@OslcDescription(\"Description of "
							+ referenceContainingClassName + "::"
							+ referenceName + " TBD\")");
					buffer.append("\r\n");

					// @OslcName
					buffer.append("\t@OslcName(\"" + referenceName + "\")");
					buffer.append("\r\n");

					// @OslcOccurs
					if (lowerBound == 0 & upperBound == -1) {
						buffer.append("\t@OslcOccurs(Occurs.ZeroOrMany)");
						buffer.append("\r\n");
					} else if (lowerBound == 1 & upperBound == -1) {
						buffer.append("\t@OslcOccurs(Occurs.OneOrMany)");
						buffer.append("\r\n");
					}

					// @OslcPropertyDefinition
					buffer.append("\t@OslcPropertyDefinition(\""
							+ Constants.INTEGRITY_NAMESPACE
							+ referenceContainingClassName + "_"
							+ referenceName + "\")");
					buffer.append("\r\n");

					// @OslcTitle
					buffer.append("\t@OslcTitle(\"" + referenceName + "\")");
					buffer.append("\r\n");

					// @OslcRange
					// buffer.append("\t@OslcRange(\"http://open-services.net/ns/SIMULINK/"
					// + etype.getName() + "\")");
					buffer.append("\t@OslcRange(\""
							+ Constants.INTEGRITY_NAMESPACE + etype.getName()
							+ "\")");
					buffer.append("\r\n");

					// print reference getter method
					buffer.append("\tpublic URI " + " get"
							+ referenceNameUpperCase + "() {");
					buffer.append("\r\n");
					buffer.append("\t\t return " + referenceName + ";");
					buffer.append("\r\n");
					buffer.append("\t}");
					buffer.append("\r\n");
					buffer.append("\r\n");

				}

			}

		}

		// add serviceprovider reference
		buffer.append("\tprivate URI      serviceProvider;");
		buffer.append("\r\n");
		buffer.append("\r\n");
		buffer.append("\tpublic void setServiceProvider(final URI serviceProvider)");
		buffer.append("\r\n");
		buffer.append("\t{");
		buffer.append("\t\tthis.serviceProvider = serviceProvider;");
		buffer.append("\r\n");
		buffer.append("\t}");
		buffer.append("\r\n");
		buffer.append("\r\n");

		buffer.append("\t@OslcDescription(\"The scope of a resource is a URI for the resource's OSLC Service Provider.\")");
		buffer.append("\r\n");
		buffer.append("\t@OslcPropertyDefinition(OslcConstants.OSLC_CORE_NAMESPACE + \"serviceProvider\")");
		buffer.append("\r\n");
		buffer.append("\t@OslcRange(OslcConstants.TYPE_SERVICE_PROVIDER)");
		buffer.append("\r\n");
		buffer.append("\t@OslcTitle(\"Service Provider\")");
		buffer.append("\t\r\n");
		buffer.append("\tpublic URI getServiceProvider()");
		buffer.append("\r\n");
		buffer.append("\t{");
		buffer.append("\r\n");
		buffer.append("\t\treturn serviceProvider;");
		buffer.append("\r\n");
		buffer.append("\t}");
		buffer.append("\r\n");
		buffer.append("\r\n");
	}

	private static void printJavaClassAttributes(StringBuffer buffer) {

		// keep track of field names
		// avoid duplicate names
		Set<String> fieldNames = new HashSet<String>();

		for (Object object : eclass.getEAllAttributes()) {
			if (object instanceof EAttribute) {
				EAttribute eattribute = (EAttribute) object;

				// ignore duplicate fields
				if (fieldNames.contains(eattribute.getName())) {
					continue;
				} else {
					fieldNames.add(eattribute.getName());
				}

				// temporary fix: ignore properties with : in name
				// make sure that field name is valid
				// find attribute name				
				String attributeName = IntegrityUtil.getValidFieldName(eattribute.getName());
//				if (eattribute.getName().contains(":")) {
//					continue;
//				}

				if (eattribute.isDerived()) {
					continue;
				}

				int lowerBound = eattribute.getLowerBound();
				int upperBound = eattribute.getUpperBound();

				

				// find attribute name with first char in uppercase
				String attributeNameFirstLetter = attributeName
						.subSequence(0, 1).toString().toUpperCase();
				String attributeNameRest = attributeName.subSequence(1,
						attributeName.length()).toString();
				String attributeNameUpperCase = attributeNameFirstLetter
						+ attributeNameRest;

				// find name of class containing attribute
				String attributeContainingClassName = eattribute
						.getEContainingClass().getName();

				// find name of attribute type
				String attributeTypeName = null;
				EClassifier etype = eattribute.getEType();
				if (etype.getName() != null) {
					if (etype.getName().equals("EString")) {
						attributeTypeName = "String";
					} else if (etype.getName().equals("EBoolean")) {
						attributeTypeName = "boolean";
					} else if (etype.getName().equals("EInt")) {
						attributeTypeName = "int";
					} else if (etype.getName().equals("EFloat")) {
						attributeTypeName = "float";
					} else {
						attributeTypeName = "Integrity" + etype.getName();
					}
				}

				// do not generate code for the attribute if its type is not
				// resolved
				if (attributeTypeName == null) {
					continue;
				}

				// if attribute is single-valued
				if (lowerBound >= 0 & upperBound <= 1) {

					// print attribute declaration
					buffer.append("\tprivate " + attributeTypeName + " "
							+ attributeName + ";");
					buffer.append("\r\n");
					buffer.append("\r\n");

					// print attribute setter method
					buffer.append("\tpublic void set" + attributeNameUpperCase
							+ "(" + attributeTypeName + " " + attributeName
							+ ") {");
					buffer.append("\r\n");
					buffer.append("\t\tthis." + attributeName + " = "
							+ attributeName + ";");
					buffer.append("\r\n");
					buffer.append("\t}");
					buffer.append("\r\n");
					buffer.append("\r\n");

					// print attribute getter method annotations

					// @OslcDescription
					buffer.append("\t@OslcDescription(\"Description of "
							+ attributeContainingClassName + "::"
							+ attributeName + " TBD\")");
					buffer.append("\r\n");

					// @OslcName
					buffer.append("\t@OslcName(\"" + attributeName + "\")");
					buffer.append("\r\n");

					// @OslcOccurs
					if (lowerBound == 1 & upperBound == 1) {
						buffer.append("\t@OslcOccurs(Occurs.ExactlyOne)");
						buffer.append("\r\n");
					} else if (lowerBound == 0 & upperBound == 1) {
						buffer.append("\t@OslcOccurs(Occurs.ZeroOrOne)");
						buffer.append("\r\n");
					}

					// @OslcPropertyDefinition
					buffer.append("\t@OslcPropertyDefinition(\""
							+ Constants.INTEGRITY_NAMESPACE
							+ attributeContainingClassName + "_"
							+ attributeName + "\")");
					buffer.append("\r\n");

					// @OslcTitle
					buffer.append("\t@OslcTitle(\"" + attributeName + "\")");
					buffer.append("\r\n");

					// @OslcValueType
					if (attributeTypeName.equals("String")) {
						buffer.append("\t@OslcValueType(ValueType.XMLLiteral)");
						buffer.append("\r\n");
					}

					// print attribute getter method
					buffer.append("\tpublic " + attributeTypeName + " get"
							+ attributeNameUpperCase + "() {");
					buffer.append("\r\n");
					buffer.append("\t\t return " + attributeName + ";");
					buffer.append("\r\n");
					buffer.append("\t}");
					buffer.append("\r\n");

				}
			}
		}
	}

	private static void printJavaClassConstructors(StringBuffer buffer) {
		buffer.append("\tpublic Integrity" + eclass.getName()
				+ "() throws URISyntaxException {");
		buffer.append("\r\n");
		buffer.append("\t\tsuper();");
		buffer.append("\r\n");
		buffer.append("\t}");
		buffer.append("\r\n");

		buffer.append("\tpublic Integrity" + eclass.getName()
				+ "(URI about) throws URISyntaxException {");
		buffer.append("\r\n");
		buffer.append("\t\tsuper(about);");
		buffer.append("\r\n");
		buffer.append("\t}");
		buffer.append("\r\n");
		buffer.append("\r\n");

	}

	private static void printJavaClassDeclaration(StringBuffer buffer) {
		// if (eclass.getName().equals("Requirement")) {
		// buffer.append("public class Integrity" + eclass.getName()
		// + " extends Requirement{");
		// buffer.append("\r\n");
		// buffer.append("\r\n");
		// } else {
		buffer.append("public class Integrity" + eclass.getName()
				+ " extends AbstractResource{");
		buffer.append("\r\n");
		buffer.append("\r\n");
		// }

	}

	private static void printJavaEnum(StringBuffer buffer, EEnum eEnum) {

		buffer.append("public enum Integrity" + eEnum.getName() + " {");
		buffer.append("\r\n");

		for (Iterator iterator = eEnum.getELiterals().iterator(); iterator
				.hasNext();) {
			EEnumLiteral eEnumLiteral = (EEnumLiteral) iterator.next();
			buffer.append("\t");
			buffer.append(eEnumLiteral.getName().toUpperCase());
			if (iterator.hasNext()) {
				buffer.append(",");
			}
			buffer.append("\r\n");
		}
		buffer.append("}");

	}

	private static void printJavaClassOSLCAnnotations(StringBuffer buffer) {
		// buffer.append("@OslcNamespace(\"" + SIMULINKPackage.getNsURI() +
		// "\")");
		// buffer.append("@OslcNamespace(Constants.SIMULINK_" +
		// eclass.getName().toUpperCase() + "_NAMESPACE)");
		buffer.append("@OslcNamespace(Constants.INTEGRITY_NAMESPACE)");
		buffer.append("\r\n");
		buffer.append("@OslcName(\"" + eclass.getName() + "\")");
		buffer.append("\r\n");
		// buffer.append("@OslcResourceShape(title = \"" + eclass.getName()
		// + " Resource Shape\", describes = \"" + SIMULINKPackage.getNsURI()
		// + eclass.getName().toLowerCase() + "/rdf#\")");
		// buffer.append("@OslcResourceShape(title = \"" + eclass.getName()
		// + " Resource Shape\", describes = \"" + SIMULINKPackage.getNsURI() +
		// "rdf#"
		// + eclass.getName() + "\")");

		// buffer.append("@OslcResourceShape(title = \"" + eclass.getName()
		// + " Resource Shape\", describes = \"" + SIMULINKPackage.getNsURI() +
		// "rdf#"
		// + eclass.getName() + "\")");

		buffer.append("@OslcResourceShape(title = \"" + eclass.getName()
				+ " Resource Shape\", describes = "
				+ "Constants.TYPE_INTEGRITY_" + eclass.getName().toUpperCase()
				+ ")");
		buffer.append("\r\n");

	}

	private static void printImportStatements(StringBuffer buffer) {
		buffer.append("import java.net.URI;");
		buffer.append("\r\n");
		buffer.append("import java.net.URISyntaxException;");
		buffer.append("\r\n");
		buffer.append("import java.util.ArrayList;");
		buffer.append("\r\n");
		buffer.append("import java.util.Arrays;");
		buffer.append("\r\n");
		buffer.append("import java.util.List;");
		buffer.append("\r\n");
		buffer.append("import java.util.HashSet;");
		buffer.append("\r\n");
		buffer.append("import java.util.Set;");
		buffer.append("\r\n");

		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcDescription;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcName;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcOccurs;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespace;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcReadOnly;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcPropertyDefinition;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcRange;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcRepresentation;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcResourceShape;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcTitle;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcValueType;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.model.AbstractResource;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.model.OslcConstants;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.model.Occurs;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.model.Representation;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.model.ValueType;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.model.Link;");
		buffer.append("\r\n");

		buffer.append("\r\n");

	}

	private static void printPackageDeclaration(StringBuffer buffer) {
		buffer.append("package edu.gatech.mbsec.adapter.integrity.generated.resources;");
		buffer.append("\r\n");
		buffer.append("\r\n");
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

	public static EClass getEClass(String eClassName) {
		if (integrityPackage == null) {
			// load SIMULINK.ecore model
			Resource ecoreResource = loadEcoreModel(URI.createFileURI(new File(
					"integrity.ecore").getAbsolutePath()));

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

	@Override
	public void run() {
		main(null);

	}

}
