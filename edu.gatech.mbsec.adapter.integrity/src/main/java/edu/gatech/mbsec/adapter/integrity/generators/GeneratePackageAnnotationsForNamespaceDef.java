package edu.gatech.mbsec.adapter.integrity.generators;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class GeneratePackageAnnotationsForNamespaceDef implements Runnable{

	static EPackage ecoreRootPackage;
	static EClass eclass;
	static String javaResourceDirectory = "C:/Users/rb16964/git/oslc4jintegrity/oslc4jintegrity/src/main/java/edu/gatech/mbsec/adapter/integrity/generated/resources/";
	static String ecoreMetamodelLocation = "C:/Users/rb16964/git/ecore4integrity/edu.gatech.mbsec.adapter.integrity.ecore/model/customIntegrity.ecore";
	
	public GeneratePackageAnnotationsForNamespaceDef(
			String customIntegrityMetamodelLocation,
			String javaResourcePackageLocation) {
		ecoreMetamodelLocation = customIntegrityMetamodelLocation;
		javaResourceDirectory = javaResourcePackageLocation;
	}

	public static void main(String[] args) {
		// load integrity.ecore model
		Resource ecoreResource = MyEcoreUtil.loadEcoreModel(URI
				.createFileURI(new File(ecoreMetamodelLocation)
						.getAbsolutePath()));

		ecoreRootPackage = (EPackage) EcoreUtil.getObjectByType(
				ecoreResource.getContents(),
				EcorePackage.eINSTANCE.getEPackage());
		

		// create annotated Java class
		StringBuffer buffer = new StringBuffer();

		// print OSLC Schema declaration
		printOSLCSchemaDeclaration(buffer);
		
		// print namespace defintions 
		printNamespaceDefinitions(buffer);

		// add closing bracket
		buffer.append("})");
		buffer.append("\r\n");
		
		// print package declaration
		printPackageDeclaration(buffer);
		
		// print import statements
		printImportStatements(buffer);

		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(javaResourceDirectory
					+ "package-info.java");
			fileWriter.append(buffer);
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void printNamespaceDefinitions(StringBuffer buffer) {
		buffer.append("@OslcNamespaceDefinition(prefix = OslcConstants.DCTERMS_NAMESPACE_PREFIX,             namespaceURI = OslcConstants.DCTERMS_NAMESPACE),");
		buffer.append("\r\n");
		buffer.append("@OslcNamespaceDefinition(prefix = OslcConstants.OSLC_CORE_NAMESPACE_PREFIX,           namespaceURI = OslcConstants.OSLC_CORE_NAMESPACE),");
		buffer.append("\r\n");
		buffer.append("@OslcNamespaceDefinition(prefix = OslcConstants.OSLC_DATA_NAMESPACE_PREFIX,           namespaceURI = OslcConstants.OSLC_DATA_NAMESPACE),");
		buffer.append("\r\n");
		buffer.append("@OslcNamespaceDefinition(prefix = OslcConstants.RDF_NAMESPACE_PREFIX,                 namespaceURI = OslcConstants.RDF_NAMESPACE),");
		buffer.append("\r\n");
		buffer.append("@OslcNamespaceDefinition(prefix = OslcConstants.RDFS_NAMESPACE_PREFIX,                namespaceURI = OslcConstants.RDFS_NAMESPACE),");
		buffer.append("\r\n");
		
		buffer.append("@OslcNamespaceDefinition(prefix = \"mbse\",                namespaceURI = \"http://eclipse.org/MBSE/\"),");
		buffer.append("\r\n");
		
		buffer.append("@OslcNamespaceDefinition(prefix = \"" + ecoreRootPackage.getNsPrefix() + "\",                namespaceURI = \"" + ecoreRootPackage.getNsURI() + "\"),");
		buffer.append("\r\n");
		
		int i = 0;
		for (EClassifier eclassifier : ecoreRootPackage.getEClassifiers()) {
			if(!(eclassifier instanceof EClass)){
				continue;
			}
			if(i > 0){
				buffer.append(",");
				buffer.append("\r\n");
			}			
			buffer.append("@OslcNamespaceDefinition(prefix = Constants.INTEGRITY_" +  eclassifier.getName().toUpperCase() + "_PREFIX, namespaceURI = Constants.INTEGRITY_" +  eclassifier.getName().toUpperCase() + "_NAMESPACE)");			
			i++;
		}
		buffer.append("\r\n");
	}

	private static void printImportStatements(StringBuffer buffer) {
		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcNamespaceDefinition;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcSchema;");
		buffer.append("\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.model.OslcConstants;");
		buffer.append("\r\n");	
	}

	private static void printOSLCSchemaDeclaration(StringBuffer buffer) {
		buffer.append("@OslcSchema ({");
		buffer.append("\r\n");
	}

	private static void printPackageDeclaration(StringBuffer buffer) {
		buffer.append("package edu.gatech.mbsec.adapter.integrity.generated.resources;");
		buffer.append("\r\n");
		buffer.append("\r\n");
	}

	@Override
	public void run() {
		main(null);
		
	}
}
