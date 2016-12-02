package edu.gatech.mbsec.adapter.integrity.application;

import java.io.File;
import java.io.IOException;

import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;

import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.query.ReadWrite;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.rdf.model.ResIterator;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.StmtIterator;
import com.hp.hpl.jena.sparql.core.DatasetGraph;
import com.hp.hpl.jena.tdb.TDBFactory;
import com.hp.hpl.jena.vocabulary.RDF;

import resources.IntegrityParameterValues;
import resources.IntegrityProductConfiguration;
import resources.IntegrityRequirement;

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
		// good article: 
		// 	http://trimc-nlp.blogspot.com/2013/06/introduction-to-jena.html
		//================================================================
		try {
			System.out.println("Starting to read TDB database");
			String tdbdir = "./TDBoutput";
			File tdbdirFile = new File(tdbdir);
			if (!tdbdirFile.exists()) {
				System.err.println("directory: " + tdbdir + " does not exist. Run \" TestRequirementToSimulink2\" first. Exiting method.");
				return;
			}

			Dataset dataset = TDBFactory.createDataset(tdbdir);
			// A Jena Dataset wraps and extends the functionality of a
			// DatasetGraph. This is not likely to be necessary in a typical
			// development scenario.
			//
			// DatasetGraph dsg = dataset.asDatasetGraph();
			// System.out.println(dsg.toString());

			dataset.begin(ReadWrite.READ);
			// get model inside the transaction
			Model model = dataset.getDefaultModel();
			dataset.end();


			// JenaModelHelper.fromJenaResource(resource, beanClass);
			// ===
			// helpful link: 
			// http://stackoverflow.com/questions/16939159/iterate-over-specific-resource-in-rdf-file-with-jena
			// get resource by type. Types are:
			//http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#SimulationName
			//http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#ProductConfiguration
			//http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Requirement
			//http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#ParameterValues
			//http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#Project
			// ===
			String integrityRdfVocabularyNamespace = "http://localhost:8484/oslc4jintegrity/services/rdfvocabulary#";
			String[] integrityRdfResourceTypes = {"Project",
					"ParameterValues",
					"Requirement",
					"ProductConfiguration",
					"SimulationName",
			};

			for(int i=0; i<integrityRdfResourceTypes.length; i++){
				System.out.println("Accessing: " + integrityRdfResourceTypes[i]);
				Resource resourceType = model.getResource(integrityRdfVocabularyNamespace + integrityRdfResourceTypes[i]);
				// ResIterator requirements = model.listSubjectsWithProperty(RDF.type, requirementType);
				ResIterator resources = model.listResourcesWithProperty(RDF.type, resourceType);
				while (resources.hasNext()) {
					Resource resource = resources.next();
					StmtIterator statements  = resource.listProperties();
					System.out.println( "* "+ resource );
					while ( statements.hasNext() ) {
						System.out.println( "** "+ statements.next() );
					}
				}

			}

			/* Manual implementation 
			Resource prodConfig = model.getResource("http://IntegrityExecutableRequirements/#productConfigForRequirementID243828");						
			Resource prodConfigType = prodConfig.getProperty(RDF.type).getResource();
			Object rdfProdConfig = JenaModelHelper.fromJenaResource(prodConfig, IntegrityProductConfiguration.class);

			System.out.println(prodConfig.toString());
			System.out.println(prodConfigType.toString());
			System.out.println("");

			Resource paramValue = model.getResource("http://IntegrityExecutableRequirements/#paramValueForRequirementID243828");
			Object rdfParamValue = JenaModelHelper.fromJenaResource(paramValue, IntegrityParameterValues.class);

			Resource requirement = model.getResource("http://IntegrityExecutableRequirements/#requirementID243828");
			Object rdfRequirement = JenaModelHelper.fromJenaResource(requirement, IntegrityRequirement.class); 
			 */

			// ===
			// query all project
			// ===


			// ===
			// for each project, query all requirements. 
			// ===


			// ===
			// for each requirement, extract all contents
			// ===


			System.out.println("Finished reading TDB database");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			System.err.println("");				
		}

	}

}
