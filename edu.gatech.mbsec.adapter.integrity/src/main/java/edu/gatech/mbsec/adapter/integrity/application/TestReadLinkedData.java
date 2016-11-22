package edu.gatech.mbsec.adapter.integrity.application;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.datatype.DatatypeConfigurationException;

import org.apache.commons.io.FileUtils;
import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;

import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.tdb.TDBFactory;

/**
 * Reads in linked data from TDB database and processes it into useful format. 
 * 
 * This file requires "TestRequirementToSimulink2" to be run first so that TDB database exists.  
 */
public class TestReadLinkedData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Current directory");
			System.out.println(new File(".").getCanonicalPath());
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Thread thread = new Thread() {
			public void start() {
				processLinkedData();
				// serverResourcesReadFlag.setValue(true);
				return;
			}
		};

		System.out.println("Starting thread");
		try {
			thread.start();
			thread.join();
			System.out.println("Thread finished");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.err.println(e.toString());
		}
		System.out.println("Main function finished.");
		
	}

	protected static synchronized void processLinkedData() {
		//================================================================
		// read triple store database located in folder 
		//================================================================
		try {
			System.out.println("Starting to read TDB database");
			String tdbdir = "./TDBoutput";
			File tdbdirFile = new File(tdbdir);
			if (!tdbdirFile.exists()) {
				System.err.println("directory: " + tdbdir + " does not exist. Exiting method.");
				return;
			}

			System.out.println("Finished reading TDB database");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("");				
		}
		
	}

}
