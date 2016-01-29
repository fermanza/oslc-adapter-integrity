package edu.gatech.mbsec.adapter.integrity.clients;



import java.lang.reflect.InvocationTargetException;
import java.net.URI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.Response;
import javax.xml.datatype.DatatypeConfigurationException;

import org.eclipse.lyo.oslc4j.core.exception.OslcCoreApplicationException;
import org.eclipse.lyo.oslc4j.core.model.AbstractResource;
import org.eclipse.lyo.oslc4j.core.model.QueryCapability;
import org.eclipse.lyo.oslc4j.core.model.Service;
import org.eclipse.lyo.oslc4j.core.model.ServiceProvider;
import org.eclipse.lyo.oslc4j.core.model.ServiceProviderCatalog;
import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;
import org.eclipse.lyo.oslc4j.provider.jena.JenaProvidersRegistry;
import org.glassfish.jersey.client.ClientConfig;


import edu.gatech.mbsec.adapter.integrity.client.util.IntegrityClientUtil;
import edu.gatech.mbsec.adapter.integrity.generated.client.util.GeneratedIntegrityClientUtil;
import com.hp.hpl.jena.query.Dataset;
import com.hp.hpl.jena.rdf.model.Model;
import com.hp.hpl.jena.tdb.TDBFactory;

public class PopulateTriplestoreWithAllIntegrityItems {

	public static void main(String[] args) {
		Thread thread = new Thread() {
			public void start() {
				// create TDB dataset
				String triplestoreLocation = "C:/Users/rb16964/git/triplestore/triplestore/mytriplestore";
				Dataset dataset = TDBFactory.createDataset(triplestoreLocation);
				Model tdbModel = dataset.getDefaultModel();
				
				
				
//				AbstractResource[] oslcResources = GeneratedIntegrityClientUtil.getIntegrityProductRequirementDocumentResources("http://localhost:8484/oslc4jintegrity/services/project2883__xxxxx__Mannheim_POC_Sample_Content/productrequirementdocuments");
//				Object[] objects = oslcResources;
//				
//				Model model;							
//				try {
//					model = JenaModelHelper.createJenaModel(objects);
//					tdbModel.add(model);
//				} catch (IllegalAccessException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IllegalArgumentException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (InvocationTargetException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (DatatypeConfigurationException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (OslcCoreApplicationException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				
				
				
				// ServiceProviderCatalog URI
				String ServiceProviderCatalogURI = "http://localhost:8484/oslc4jintegrity/services/catalog/singleton";
				
				ServiceProviderCatalog serviceProviderCatalog = IntegrityClientUtil.getServiceProviderCatalogResource(ServiceProviderCatalogURI);
				
				for (ServiceProvider serviceProvider : serviceProviderCatalog.getServiceProviders()) {
					for (Service service : serviceProvider.getServices()) {
						for (QueryCapability queryCapability : service.getQueryCapabilities()) {
							URI queryBase = queryCapability.getQueryBase();
							AbstractResource[] oslcResources = GeneratedIntegrityClientUtil.getIntegrityResources(queryBase.toString());
							if(oslcResources.length > 0){								
								Object[] objects = oslcResources;						
								Model model;							
								try {
									model = JenaModelHelper.createJenaModel(objects);
									tdbModel.add(model);
									System.out.println("Added triples to triplestore of query base: " + queryBase.toString());
								} catch (IllegalAccessException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (IllegalArgumentException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (InvocationTargetException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (DatatypeConfigurationException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								} catch (OslcCoreApplicationException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							
						}
					}
				}
				tdbModel.close();
				dataset.close();
			}
		};
		thread.start();
		try {
			thread.join();
			System.out.println("All Integrity items added to triplestore");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
