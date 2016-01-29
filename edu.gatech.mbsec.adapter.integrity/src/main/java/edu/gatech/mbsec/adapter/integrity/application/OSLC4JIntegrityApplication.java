package edu.gatech.mbsec.adapter.integrity.application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;















import org.eclipse.lyo.oslc4j.application.OslcWinkApplication;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.OslcConstants;

import edu.gatech.mbsec.adapter.integrity.application.util.IntegrityUtil;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityFunction;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityFunctionHierarchy;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityRequirement;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegritySystemElement;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegritySystemHierarchy;



public class OSLC4JIntegrityApplication extends OslcWinkApplication {

	public static String hostName = "localhost";
//	public static String portNumber =  getPortNumber();
	public static String portNumber =  null;
	public static String contextPath = "oslc4jintegrity";

	private static final Set<Class<?>> RESOURCE_CLASSES = IntegrityUtil.getResourceClassesForRegisteringEntityProviders();
	public static final Map<String, Class<?>> RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP = new HashMap<String, Class<?>>();

	public static String warConfigFilePath = "../oslc4jintegrity configuration/config.properties";
	public static String localConfigFilePath = "oslc4jintegrity configuration/config.properties";
	public static String configFilePath = null;
	
	public static String integrityHostName = "lsdewcs9.sdde.xxxxx.com";
	
	static {	
		
		RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(edu.gatech.mbsec.adapter.integrity.generated.resources.Constants.PATH_INTEGRITY_REQUIREMENT, IntegrityRequirement.class);
		RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(edu.gatech.mbsec.adapter.integrity.generated.resources.Constants.PATH_INTEGRITY_FUNCTION, IntegrityFunction.class);
		RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(edu.gatech.mbsec.adapter.integrity.generated.resources.Constants.PATH_INTEGRITY_FUNCTIONHIERARCHY, IntegrityFunctionHierarchy.class);
		RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(edu.gatech.mbsec.adapter.integrity.generated.resources.Constants.PATH_INTEGRITY_SYSTEMELEMENT, IntegritySystemElement.class);
		RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP.put(edu.gatech.mbsec.adapter.integrity.generated.resources.Constants.PATH_INTEGRITY_SYSTEMHIERARCHY, IntegritySystemHierarchy.class);
		
		
		loadPropertiesFile();
		IntegrityManager.readServerResourcesPeriodically();		
	}

	

	public OSLC4JIntegrityApplication() throws OslcCoreApplicationException, URISyntaxException {
		super(RESOURCE_CLASSES, OslcConstants.PATH_RESOURCE_SHAPES, RESOURCE_SHAPE_PATH_TO_RESOURCE_CLASS_MAP);
	}

	// @Override
	// public Set<Object> getSingletons() {
	// final Set<Object> singletons = new HashSet<Object>();
	// // Register an instance of LoggingFilter.
	// singletons.add(new GZIPWriterInterceptor());
	// return singletons;
	// }

	// @Override
	// @SuppressWarnings("unchecked")
	// protected Application configure() {
	// ResourceConfig resourceConfig = new ResourceConfig(MyResource.class);
	// EncodingFilter.enableFor(resourceConfig, GZipEncoder.class);
	// return resourceConfig;
	// }

	private static void loadPropertiesFile() {
		Thread thread = new Thread(){
				public void start(){
					Properties prop = new Properties();
					InputStream input = null;

					try {
						// loading properties file
						// input = new FileInputStream("./configuration/config.properties");
						input = new FileInputStream(warConfigFilePath); // for war file
						configFilePath = warConfigFilePath;
					} catch (FileNotFoundException e) {
						try {
							input = new FileInputStream(localConfigFilePath);
							configFilePath = localConfigFilePath;
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						} // for war file
					}

					// load property file content and convert backslashes into forward
					// slashes
					String str;
					if (input != null) {
						try {
							str = readFile(configFilePath, Charset.defaultCharset());
							prop.load(new StringReader(str.replace("\\", "/")));			
							portNumber = prop.getProperty("portNumber");
							integrityHostName = prop.getProperty("integrityHostName");
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
				
		};
		thread.start();
		try {
			thread.join();
			System.out.println("Properties file read");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	
	public static String getPortNumber(){
		Properties prop = new Properties();
		InputStream input = null;

		try {
			// loading properties file
			// input = new FileInputStream("./configuration/config.properties");
			input = new FileInputStream(warConfigFilePath); // for war file
			configFilePath = warConfigFilePath;
		} catch (FileNotFoundException e) {
			try {
				input = new FileInputStream(localConfigFilePath);
				configFilePath = localConfigFilePath;
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} // for war file
		}

		// load property file content and convert backslashes into forward
		// slashes
		String str;
		String portNumber = null;
		if (input != null) {
			try {
				str = readFile(configFilePath, Charset.defaultCharset());
				prop.load(new StringReader(str.replace("\\", "/")));			
				portNumber = prop.getProperty("portNumber");

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
		return portNumber;
		
	}
	
	static String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return encoding.decode(ByteBuffer.wrap(encoded)).toString();
	}
}
