package edu.gatech.mbsec.adapter.integrity.application;

import integrity.IntegrityPackage;
import integrity.Server;

import java.awt.GridLayout;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.TypeVariable;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.lyo.oslc4j.core.model.Link;

import com.mks.api.CmdRunner;
import com.mks.api.Command;
import com.mks.api.IntegrationPoint;
import com.mks.api.IntegrationPointFactory;
import com.mks.api.OptionList;
import com.mks.api.SelectionList;
import com.mks.api.Session;
import com.mks.api.response.APIConnectionException;
import com.mks.api.response.APIException;
import com.mks.api.response.Field;
import com.mks.api.response.Item;
import com.mks.api.response.ItemList;
import com.mks.api.response.Response;
import com.mks.api.response.WorkItem;
import com.mks.api.response.WorkItemIterator;

import edu.gatech.mbsec.adapter.integrity.application.util.IntegrityUtil;
import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityServerResources;
import edu.gatech.mbsec.adapter.integrity.generators.CustomIntegrityItemTypes;
import edu.gatech.mbsec.adapter.integrity.generators.MyEcoreUtil;
import edu.gatech.mbsec.adapter.integrity.trs.ChangeHistory;

public class IntegrityManager {

	static int sessionID = 1;
	static int delayInSecondsBetweenServerScans = 3000;

	// public static List<IntegrityProject> oslcIntegrityProjects = new
	// ArrayList<IntegrityProject>();

	// public static List<IntegrityRequirementDocument>
	// oslcIntegrityRequirementDocuments = new
	// ArrayList<IntegrityRequirementDocument>();
	// public static List<IntegrityItem> oslcIntegrityItems = new
	// ArrayList<IntegrityItem>();
	// public static List<IntegrityField> oslcIntegrityFields = new
	// ArrayList<IntegrityField>();
	// public static Set<URI> oslcIntegrityItemURIs = new HashSet<URI>();
	//
	// static Map<String, IntegrityProject> qNameOslcIntegrityProjectMap = new
	// HashMap<String, IntegrityProject>();
	// static Map<String, IntegrityRequirement> qNameOslcIntegrityRequirementMap
	// = new HashMap<String, IntegrityRequirement>();
	// static Map<String, IntegrityRequirementDocument>
	// qNameOslcIntegrityRequirementDocumentMap = new HashMap<String,
	// IntegrityRequirementDocument>();
	// static Map<String, IntegrityItem> qNameOslcIntegrityItemMap = new
	// HashMap<String, IntegrityItem>();
	// static Map<URI, IntegrityField> qNameOslcIntegrityFieldMap = new
	// HashMap<URI, IntegrityField>();

	// public static Map<String, String> projectNameIDMap = new HashMap<String,
	// String>();
	// public static Map<String, URI> integrityIDURIMap = new HashMap<String,
	// URI>();
	// static Map<Object, ArrayList<Field>> objectFieldValueMap = new
	// HashMap<Object, ArrayList<Field>>();

	public static SynchronizedBooleanFlag serverResourcesReadFlag = new SynchronizedBooleanFlag();

	static StringBuffer buffer;

	public static String baseHTTPURI = "http://"
			+ OSLC4JIntegrityApplication.hostName + ":"
			+ OSLC4JIntegrityApplication.portNumber + "/"
			+ OSLC4JIntegrityApplication.contextPath;

	public static void main(String[] args) {
		readServerResources();
	}

	public static void readServerResourcesPeriodically() {
		Timer timer = new Timer();
		serverResourcesReadFlag.setValue(false);
		timer.scheduleAtFixedRate(new TimerTask() {
			public void run() {				
				readServerResources();
			}
		}, 0, delayInSecondsBetweenServerScans * 1000);
	}

	public static synchronized void readServerResources() {
		Thread thread = new Thread() {
			public void start(){
//				if (serverResourcesReadFlag.getValue()) {
//					return;
//				}

				IntegrityServerResources.readServerResources();

				// resolve cross-dependencies
				IntegrityUtil.resolveDependencies();

				// add dependencies which are not provided by integrity (e.g.
				// project -> requirements)
				// addImplicitDependencies();

				
				// due to missing modifiedDate property, removed feature for now
//				// set baseline version of tracked requirements
//				ChangeHistory.initializeBaseResources(null);
//
//				// detect changes to baseline version of tracked requirements
//				ChangeHistory.detectChangesToTrackedResources();

				serverResourcesReadFlag.setValue(true);
			}
		};
		thread.start();
		try {
			thread.join();
			System.out.println("Resources read from Integrity Server " + new Date().toString());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
////		if (serverResourcesReadFlag.getValue()) {
////			return;
////		}
//
//		IntegrityServerResources.readServerResources();
//
//		// resolve cross-dependencies
//		IntegrityUtil.resolveDependencies();
//
//		// add dependencies which are not provided by integrity (e.g.
//		// project -> requirements)
//		// addImplicitDependencies();
//
//		// set baseline version of tracked requirements
//		ChangeHistory.initializeBaseResources(null);
//
//		// detect changes to baseline version of tracked requirements
//		ChangeHistory.detectChangesToTrackedResources();
//
//		serverResourcesReadFlag.setValue(true);
//		System.out.println("Resources read from Integrity Server " + new Date().toString());
		
		
		
	}


}
