package edu.gatech.mbsec.adapter.integrity.generators;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class GenerateConstantsClass extends Thread{

	static EPackage ecoreRootPackage;
	static EClass eclass;
	static String javaResourceDirectory = "C:/Users/ap77456/Documents/Git/oslc4jintegrity/oslc4jintegrity/src/main/java/edu/gatech/mbsec/adapter/integrity/generated/resources/";
	static String ecoreMetamodelLocation = "C:/Users/ap77456/Documents/Git/ecore4integrity/edu.gatech.mbsec.adapter.integrity.ecore/model/customIntegrity.ecore";

	public GenerateConstantsClass(String ecoreMetamodelLocation2, String javaResourcePackageLocation2) {
		ecoreMetamodelLocation = ecoreMetamodelLocation2;
		javaResourceDirectory = javaResourcePackageLocation2;
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

		// print package declaration
		printPackageDeclaration(buffer);

//		// print import statements
//		printImportStatements(buffer);

		// print Java class declaration
		printJavaClassDeclaration(buffer);

		// print prefix declarations
		printPrefixDeclarations(buffer);

		// print namespace declarations
		printNamespaceDeclarations(buffer);
		
		// print type declarations
		printTypeDeclarations(buffer);
		
		// print domain declarations
		printDomainDeclarations(buffer);
		
		// print path declarations
		printPathDeclarations(buffer);
		
		buffer.append("\t\tpublic static final String HDR_OSLC_VERSION = \"OSLC-Core-Version\";");
		buffer.append("\r\n");
		
		
		// add closing bracket
		buffer.append("}");

		FileWriter fileWriter;
		try {
			fileWriter = new FileWriter(javaResourceDirectory
					+ "Constants.java");
			fileWriter.append(buffer);
			fileWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void printPathDeclarations(StringBuffer buffer) {
		for (EClassifier eClassifier : ecoreRootPackage.getEClassifiers()) {
			buffer.append("public static String PATH_"
					+ ecoreRootPackage.getName().toUpperCase() + "_"
					+ eClassifier.getName().toUpperCase() + " = \""										
					+ eClassifier.getName().toLowerCase() + "\";");
			buffer.append("\r\n");
		}
		buffer.append("\r\n");		
	}

	private static void printDomainDeclarations(StringBuffer buffer) {
		for (EClassifier eClassifier : ecoreRootPackage.getEClassifiers()) {
			buffer.append("public static String "
					+ ecoreRootPackage.getName().toUpperCase() + "_"
					+ eClassifier.getName().toUpperCase() + "_DOMAIN = "
					+ ecoreRootPackage.getName().toUpperCase() + "_NAMESPACE + \""
					+ ecoreRootPackage.getName() + "_"
					+ eClassifier.getName().toLowerCase() + "\";");
			buffer.append("\r\n");
		}
		buffer.append("\r\n");		
	}

	private static void printTypeDeclarations(StringBuffer buffer) {		
		for (EClassifier eClassifier : ecoreRootPackage.getEClassifiers()) {
			buffer.append("public static String TYPE_"
					+ ecoreRootPackage.getName().toUpperCase() + "_"
					+ eClassifier.getName().toUpperCase() + " = "
					+ ecoreRootPackage.getName().toUpperCase() + "_NAMESPACE + \""
					+ ecoreRootPackage.getName() + "_"
					+ eClassifier.getName().toLowerCase() + "\";");
			buffer.append("\r\n");
		}
		buffer.append("\r\n");		
	}

	private static void printPrefixDeclarations(StringBuffer buffer) {
		buffer.append("public static String "
				+ ecoreRootPackage.getName().toUpperCase() + "_PREFIX = \""
				+ ecoreRootPackage.getNsPrefix() + "\";");
		buffer.append("\r\n");
		for (EClassifier eClassifier : ecoreRootPackage.getEClassifiers()) {
			buffer.append("public static String "
					+ ecoreRootPackage.getName().toUpperCase() + "_"
					+ eClassifier.getName().toUpperCase() + "_PREFIX = \""
					+ ecoreRootPackage.getName() + "_"
					+ eClassifier.getName().toLowerCase() + "\";");
			buffer.append("\r\n");
		}
		buffer.append("\r\n");

	}
	
	private static void printNamespaceDeclarations(StringBuffer buffer) {
		buffer.append("public static String "
				+ ecoreRootPackage.getName().toUpperCase() + "_NAMESPACE = \""
				+ ecoreRootPackage.getNsURI() + "\";");
		buffer.append("\r\n");
		for (EClassifier eClassifier : ecoreRootPackage.getEClassifiers()) {
			buffer.append("public static String "
					+ ecoreRootPackage.getName().toUpperCase() + "_"
					+ eClassifier.getName().toUpperCase() + "_NAMESPACE = "
					+ ecoreRootPackage.getName().toUpperCase() + "_NAMESPACE + \""
					+ eClassifier.getName() + "/\";");
			buffer.append("\r\n");
		}
		buffer.append("\r\n");

	}

	private static void printJavaClassDeclaration(StringBuffer buffer) {
		buffer.append("public interface Constants{");
		buffer.append("\r\n");
		buffer.append("\r\n");
	}

	private static void printImportStatements(StringBuffer buffer) {
		buffer.append("import org.eclipse.lyo.oslc4j.core.model.OslcConstants;");
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
