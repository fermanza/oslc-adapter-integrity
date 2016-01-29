package edu.gatech.mbsec.adapter.integrity.generators;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class GenerateAdapter {

	public static String generatorConfigFileLocation = "./generator configuration/config.properties";

	public static String customIntegrityMetamodelLocation;
	public static String basicIntegrityMetamodelLocation;
	public static List<String> itemTypeNames;
	public static String javaResourcePackageLocation;
	public static String javaServicePackageLocation;
	public static String javaClientUtilLocation;
	
	public static String integrityHostName;

	public static void main(String[] args) {

		// read generator config file
		loadPropertiesFile(generatorConfigFileLocation);

		// GenerateDynamicCustomIntegrityMetamodel
		GenerateDynamicCustomIntegrityMetamodel thread1 = new GenerateDynamicCustomIntegrityMetamodel(
				customIntegrityMetamodelLocation,
				basicIntegrityMetamodelLocation, itemTypeNames);
		thread1.run();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("custom .ecore metamodel created");

		// delete all classes in .generated.resources package
		File resourcesPackageDirectory = new File(javaResourcePackageLocation);
		for (File file : resourcesPackageDirectory.listFiles())
			if (!file.isDirectory())
				file.delete();
		System.out.println(".generated.resources package emptied");

		// GenerateConstantsClass
		GenerateConstantsClass thread2 = new GenerateConstantsClass(
				customIntegrityMetamodelLocation, javaResourcePackageLocation);
		thread2.run();
		System.out.println("constants class created");

		// GenerateResourceClasses
		GenerateResourceClasses thread3 = new GenerateResourceClasses(
				customIntegrityMetamodelLocation, javaResourcePackageLocation);
		thread3.run();
		System.out.println("resource classes created");

		// GenerateReadServerClass
		GenerateReadServerClass thread4 = new GenerateReadServerClass(
				customIntegrityMetamodelLocation, javaResourcePackageLocation,
				itemTypeNames);
		thread4.run();
		System.out.println("readserver class created");

		// GeneratePackageAnnotationsForNamespaceDef
		GeneratePackageAnnotationsForNamespaceDef thread5 = new GeneratePackageAnnotationsForNamespaceDef(
				customIntegrityMetamodelLocation, javaResourcePackageLocation);
		thread5.run();
		System.out.println("package annotation class created");

		// delete all classes in .generated.services package
		File servicesPackageDirectory = new File(javaServicePackageLocation);
		for (File file : servicesPackageDirectory.listFiles())
			if (!file.isDirectory())
				file.delete();
		System.out.println(".generated.services package emptied");

		// GenerateServiceClasses
		GenerateServiceClasses thread6 = new GenerateServiceClasses(
				customIntegrityMetamodelLocation, javaServicePackageLocation);
		thread6.run();
		System.out.println("service classes created");

		// Generate client util Class
		GenerateClientUtilClass thread7 = new GenerateClientUtilClass(
				customIntegrityMetamodelLocation, javaClientUtilLocation);
		thread7.run();
		System.out.println("client util class created");

		// closing statement
		System.out.println("adapter generation finished");

	}

	private static void loadPropertiesFile(String generatorConfigFileLocation) {
		Properties prop = new Properties();
		InputStream input = null;

		// load property file content and convert backslashes into forward
		// slashes
		String str;
		try {
			input = new FileInputStream(generatorConfigFileLocation);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (input != null) {
			try {
				str = readFile(generatorConfigFileLocation,
						Charset.defaultCharset());
				prop.load(new StringReader(str.replace("\\", "/")));

				// get the property values
				integrityHostName = prop
						.getProperty("integrityHostName");
				
				customIntegrityMetamodelLocation = prop
						.getProperty("customIntegrityMetamodelLocation");
				basicIntegrityMetamodelLocation = prop
						.getProperty("basicIntegrityMetamodelLocation");

				String javaResourcePackageLocationFromUser = prop
						.getProperty("javaResourcePackageLocation");
				// add trailing slash if missing
				if (!javaResourcePackageLocationFromUser.endsWith("/")) {
					javaResourcePackageLocation = javaResourcePackageLocationFromUser
							+ "/";
				} else {
					javaResourcePackageLocation = javaResourcePackageLocationFromUser;
				}

				String javaServicePackageLocationFromUser = prop
						.getProperty("javaServicePackageLocation");
				// add trailing slash if missing
				if (!javaServicePackageLocationFromUser.endsWith("/")) {
					javaServicePackageLocation = javaServicePackageLocationFromUser
							+ "/";
				} else {
					javaServicePackageLocation = javaServicePackageLocationFromUser;
				}
				
				String javaClientUtilLocationFromUser = prop
						.getProperty("javaClientUtilLocation");
				// add trailing slash if missing
				if (!javaClientUtilLocationFromUser.endsWith("/")) {
					javaClientUtilLocation = javaClientUtilLocationFromUser
							+ "/";
				} else {
					javaClientUtilLocation = javaClientUtilLocationFromUser;
				}
				

				String itemTypeNamesFromUser = prop
						.getProperty("itemTypeNames");
				String[] itemTypeNamesArray = itemTypeNamesFromUser.split(",");
				itemTypeNames = new ArrayList<String>();
				for (String string : itemTypeNamesArray) {
					// make sure to delete possible space character
					if (string.startsWith(" ")) {
						string = string.substring(1, string.length());
					}
					itemTypeNames.add(string);
				}
				// itemTypeNames = Arrays.asList(itemTypeNamesArray);

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {

				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		}

	}

	static String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return encoding.decode(ByteBuffer.wrap(encoded)).toString();
	}
}
