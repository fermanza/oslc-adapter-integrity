package edu.gatech.mbsec.adapter.integrity.generators;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class MyEcoreUtil {
	
	public static Resource loadEcoreModel(URI fileURI) {
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
	
	public static String getEcoreTypeName(String fieldTypeName) {
		// first letter is uppercase
		String ecoreFieldTypeName = fieldTypeName.substring(0,
				1).toUpperCase()
				+ fieldTypeName.substring(1,
						fieldTypeName.length());
		// no whitespace in name
		ecoreFieldTypeName = ecoreFieldTypeName.replace(" ", "");
		return ecoreFieldTypeName;
	}
	
	public static String getEcoreFieldName(String fieldName) {
		// first letter is lowercase
		String ecoreFieldTypeName = fieldName.substring(0,
				1).toLowerCase()
				+ fieldName.substring(1,
						fieldName.length());
		// no whitespace in name
		ecoreFieldTypeName = ecoreFieldTypeName.replace(" ", "");
		return ecoreFieldTypeName;
	}
	
	
	public URI getResourceURI(Object resource){				
		// getAbout() is in super class				
		Method method;
		URI uri = null;
		try {
			method = resource.getClass().getSuperclass().getDeclaredMethod("getAbout", new Class[0]);
			Object object = method.invoke(resource,null);
			uri = (URI) object;
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return uri;
	}

}
