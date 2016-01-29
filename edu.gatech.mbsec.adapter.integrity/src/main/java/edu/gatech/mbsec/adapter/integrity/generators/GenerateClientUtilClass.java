package edu.gatech.mbsec.adapter.integrity.generators;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.lyo.oslc4j.client.OslcRestClient;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.provider.jena.JenaProvidersRegistry;

import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityItem;


public class GenerateClientUtilClass implements Runnable {

	static EPackage ecoreRootPackage;
	static EClass eclass;
	static String javaResourceDirectory = "C:/Users/rb16964/git/oslc4jintegrity.wink/oslc4jintegrity-wink/src/main/java/edu/gatech/mbsec/adapter/integrity/generated/client/util/";
	static String ecoreMetamodelLocation = "C:/Users/rb16964/git/ecore4integrity/edu.gatech.mbsec.adapter.integrity.ecore/model/customIntegrity.ecore";

	public GenerateClientUtilClass(String customIntegrityMetamodelLocation,
			String javaResourcePackageLocation2) {
		ecoreMetamodelLocation = customIntegrityMetamodelLocation;
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

					// print import statements
					printImportStatements(buffer);

					

					// print Java class declaration
					printJavaClassDeclaration(buffer);

					// printProviders
					printProviders(buffer);
					
					// printGetSpecificIntegrityResourceInRDFMethods
					printGetSpecificIntegrityResourceInRDFMethods(buffer);

					// printGetAnyIntegrityResourceInRDFMethod
					printGetAnyIntegrityResourceInRDFMethod(buffer);

					// printGetSpecificIntegrityResourcesInRDFMethods
					printGetSpecificIntegrityResourcesInRDFMethods(buffer);
					
					// printGetAnyIntegrityResourcesInRDFMethod
					printGetAnyIntegrityResourcesInRDFMethod(buffer);
					
					
					// printGetAllIntegrityResourcesInRDFMethod
					printGetAllIntegrityResourcesInRDFMethod(buffer);
					

					buffer.append("}");

					FileWriter fileWriter;
					try {
						fileWriter = new FileWriter(javaResourceDirectory
								+ "GeneratedIntegrityClientUtil.java");
						fileWriter.append(buffer);
						fileWriter.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				
			
		
	}

	private static void printGetAllIntegrityResourcesInRDFMethod(
			StringBuffer buffer) {
		buffer.append("public static AbstractResource[] getAllIntegrityResources(){");
		buffer.append("\r\n");
		buffer.append("\tCollection<AbstractResource> integrityResourcesList = new ArrayList();");
		buffer.append("\r\n");				
		for (EClassifier eClassifier : ecoreRootPackage.getEClassifiers()) {
			if (!(eClassifier instanceof EClass)) {
				continue;
			}	
			if (eClassifier.getName().equals("Server") | eClassifier.getName().equals("Field")) {
				continue;
			}
			buffer.append("\tintegrityResourcesList.addAll(Arrays.asList(getIntegrityProjectResources(\"\")));");
			buffer.append("\r\n");
			
		}
		buffer.append("\tAbstractResource[] integrityResources = (AbstractResource[]) integrityResourcesList.toArray();");		
		buffer.append("\r\n");
		buffer.append("\treturn integrityResources;");
		buffer.append("\r\n");
		buffer.append("}");
		

	}

	private static void printGetAnyIntegrityResourcesInRDFMethod(
			StringBuffer buffer) {
		buffer.append("public static AbstractResource[] getIntegrityResources(String resourceURI){");
		buffer.append("\r\n");
		buffer.append("\tAbstractResource[] integrityResources;");
		buffer.append("\r\n");				
		for (EClassifier eClassifier : ecoreRootPackage.getEClassifiers()) {
			if (!(eClassifier instanceof EClass)) {
				continue;
			}	
			if (eClassifier.getName().equals("Server") | eClassifier.getName().equals("Field")) {
				continue;
			}
			buffer.append("\tif (resourceURI.toString().contains(\""
					+ eClassifier.getName().toLowerCase() + "s\")) {");
			buffer.append("\r\n");
			buffer.append("\t\treturn getIntegrity"
					+ eClassifier.getName() + "Resources(resourceURI);");
			buffer.append("\r\n");
			buffer.append("\t}");
		}
		buffer.append("\treturn null;");		
		buffer.append("\r\n");
		buffer.append("}");
		buffer.append("\r\n");
		
	}

	private static void printGetSpecificIntegrityResourcesInRDFMethods(
			StringBuffer buffer) {
		for (EClassifier eClassifier : ecoreRootPackage.getEClassifiers()) {
			if (!(eClassifier instanceof EClass)) {
				continue;
			}	
			if (eClassifier.getName().equals("Server") | eClassifier.getName().equals("Field")) {
				continue;
			}
			buffer.append("public static Integrity" + eClassifier.getName() + "[] getIntegrity" + eClassifier.getName() + "Resources(String resourceURI){");
			buffer.append("\r\n");
			buffer.append("\tString mediaType = \"application/rdf+xml\";");
			buffer.append("\r\n");
			
			buffer.append("\tint readTimeout = 120000000;");
			buffer.append("\r\n");
			buffer.append("\tfinal OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);");
			
			buffer.append("\r\n");
			buffer.append("\tfinal Integrity" + eClassifier.getName() + "[] resource = oslcRestClient.getOslcResource(Integrity" + eClassifier.getName() + "[].class);			");
			buffer.append("\r\n");
			
			buffer.append("\treturn resource;");
			buffer.append("\r\n");
			
			buffer.append("}");
			buffer.append("\r\n");
			
			
			buffer.append("\r\n");
			buffer.append("\r\n");
			buffer.append("\r\n");
			buffer.append("\r\n");
		}
		
	}

	private static void printGetAnyIntegrityResourceInRDFMethod(StringBuffer buffer) {
		buffer.append("public static AbstractResource getIntegrityResource(String resourceURI){");
		buffer.append("\r\n");
		buffer.append("\tAbstractResource integrityResource;");
		buffer.append("\r\n");
		
		
		for (EClassifier eClassifier : ecoreRootPackage.getEClassifiers()) {
			if (!(eClassifier instanceof EClass)) {
				continue;
			}	
			if (eClassifier.getName().equals("Server") | eClassifier.getName().equals("Field")) {
				continue;
			}
			buffer.append("\tif (resourceURI.toString().contains(\""
					+ eClassifier.getName().toLowerCase() + "s\")) {");
			buffer.append("\r\n");
			buffer.append("\t\treturn getIntegrity"
					+ eClassifier.getName() + "Resource(resourceURI);");
			buffer.append("\r\n");
			buffer.append("\t}");
		}
		
		
		
		
		
		buffer.append("\treturn null;");
		
		buffer.append("\r\n");
		buffer.append("}");
		buffer.append("\r\n");

			
		
	}

	private static void printProviders(StringBuffer buffer) {
		
		buffer.append("\tprivate static final Set<Class<?>> PROVIDERS = new HashSet<Class<?>>();");
		buffer.append("\r\n");
		buffer.append("\tstatic {");
		buffer.append("\r\n");
		buffer.append("\t\tPROVIDERS.addAll(JenaProvidersRegistry.getProviders());");
		buffer.append("\r\n");
		buffer.append("\t}");
		buffer.append("\r\n");
		

		
	}

	private static void printGetSpecificIntegrityResourceInRDFMethods(StringBuffer buffer) {
		for (EClassifier eClassifier : ecoreRootPackage.getEClassifiers()) {
			if (!(eClassifier instanceof EClass)) {
				continue;
			}	
			if (eClassifier.getName().equals("Server") | eClassifier.getName().equals("Field")) {
				continue;
			}
			buffer.append("public static Integrity" + eClassifier.getName() + " getIntegrity" + eClassifier.getName() + "Resource(String resourceURI){");
			buffer.append("\r\n");
			buffer.append("\tString mediaType = \"application/rdf+xml\";");
			buffer.append("\r\n");
			
			buffer.append("\tint readTimeout = 120000000;");
			buffer.append("\r\n");
			buffer.append("\tfinal OslcRestClient oslcRestClient = new OslcRestClient(PROVIDERS, resourceURI, mediaType, readTimeout);");
			
			buffer.append("\r\n");
			buffer.append("\tfinal Integrity" + eClassifier.getName() + " resource = oslcRestClient.getOslcResource(Integrity" + eClassifier.getName() + ".class);			");
			buffer.append("\r\n");
			
			buffer.append("\treturn resource;");
			buffer.append("\r\n");
			
			buffer.append("}");
			buffer.append("\r\n");
			
			
			buffer.append("\r\n");
			buffer.append("\r\n");
			buffer.append("\r\n");
			buffer.append("\r\n");
		}
	
			
	}
		
		
		
		
		
		
	

	private static void printJavaClassDeclaration(StringBuffer buffer) {

		buffer.append("public class GeneratedIntegrityClientUtil {");
		buffer.append("\r\n");
		

	}

	

	private static void printImportStatements(StringBuffer buffer) {

		buffer.append("import java.util.Arrays;\r\n");
		buffer.append("import java.util.Collection;\r\n");
		buffer.append("import java.util.ArrayList;\r\n");
		buffer.append("import java.net.URI;\r\n");
		buffer.append("import java.util.Set;\r\n");
		buffer.append("import java.util.HashSet;\r\n");
		
		buffer.append("import org.eclipse.lyo.oslc4j.client.OslcRestClient;\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.model.AbstractResource;\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.provider.jena.JenaProvidersRegistry;\r\n");

		buffer.append("import edu.gatech.mbsec.adapter.integrity.application.IntegrityManager;\r\n");
		
		for (EClassifier eClassifier : ecoreRootPackage.getEClassifiers()) {
			if (!(eClassifier instanceof EClass)) {
				continue;
			}	
			if (eClassifier.getName().equals("Server")) {
				continue;
			}
			buffer.append("import edu.gatech.mbsec.adapter.integrity.generated.resources.Integrity"
					+ eClassifier.getName() + ";");
		}
		
		buffer.append("\r\n");
		buffer.append("\r\n");
	}

	private static void printPackageDeclaration(StringBuffer buffer) {
		buffer.append("package edu.gatech.mbsec.adapter.integrity.generated.client.util;");
		buffer.append("\r\n");
		buffer.append("\r\n");

	}

	@Override
	public void run() {
		main(null);

	}

}
