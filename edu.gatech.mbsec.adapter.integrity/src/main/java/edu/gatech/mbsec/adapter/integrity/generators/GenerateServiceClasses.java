package edu.gatech.mbsec.adapter.integrity.generators;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import edu.gatech.mbsec.adapter.integrity.application.IntegrityManager;

public class GenerateServiceClasses implements Runnable {

	static EPackage ecoreRootPackage;
	static EClass eclass;
	static String javaResourceDirectory = "C:/Users/rb16964/git/oslc4jintegrity/oslc4jintegrity/src/main/java/edu/gatech/mbsec/adapter/integrity/generated/services/";
	static String ecoreMetamodelLocation = "C:/Users/rb16964/git/ecore4integrity/edu.gatech.mbsec.adapter.integrity.ecore/model/customIntegrity.ecore";

	public GenerateServiceClasses(String customIntegrityMetamodelLocation,
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

		for (Object eclassifier : ecoreRootPackage.getEClassifiers()) {
			if (eclassifier instanceof EClass) {
				eclass = (EClass) eclassifier;

				if (!eclass.isAbstract()) {
					// create annotated Java class
					StringBuffer buffer = new StringBuffer();

					// print package declaration
					printPackageDeclaration(buffer);

					// print import statements
					printImportStatements(buffer);

					// print Java class OSLC annotations
					printJavaClassOSLCAnnotations(buffer);

					// print Java class declaration
					printJavaClassDeclaration(buffer);

					// print getter method GetOSLCResourcesInRDFMethod
					printGetOSLCResourcesInRDFMethod(buffer);

					// print getter method GetOSLCResourcesInHTMLMethod
					printGetOSLCResourcesInHTMLMethod(buffer);

					// print getter method GetOSLCResourceInRDFMethod
					printGetOSLCResourceInRDFMethod(buffer);

					// print getter methodGetOSLCResourceInHTMLMethod
					printGetOSLCResourceInHTMLMethod(buffer);

					// // print Java class attributes
					// printJavaClassAttributes(buffer);
					//
					// // print Java class references
					// printJavaClassReferences(buffer);

					buffer.append("}");

					FileWriter fileWriter;
					try {
						fileWriter = new FileWriter(javaResourceDirectory
								+ "Integrity" + eclass.getName()
								+ "Service.java");
						fileWriter.append(buffer);
						fileWriter.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

				}
			}
		}
	}

	private static void printGetOSLCResourceInHTMLMethod(StringBuffer buffer) {
		buffer.append("\t@GET");
		buffer.append("\r\n");
		// exception for Project (root container)
		if (!eclass.getName().equals("Project")) {
			buffer.append("\t@Path(\"{uri}\")");
			buffer.append("\r\n");
		}
		buffer.append("\t@Produces(MediaType.TEXT_HTML)");
		buffer.append("\r\n");
		buffer.append("\tpublic void getHtml" + eclass.getName() + "(");
		buffer.append("\r\n");
		buffer.append("\t\t@PathParam(\"projectID\") final String projectID");

		// exception for Project (root container)
		if (!eclass.getName().equals("Project")) {
			buffer.append(",\r\n");
			buffer.append("\t\t@PathParam(\"uri\") final String ID)");
			buffer.append("\r\n");
		} else {
			buffer.append(")");
			buffer.append("\r\n");
		}

		buffer.append("\t\tthrows URISyntaxException, IOException {");
		buffer.append("\r\n");
//		buffer.append("\t\t\tIntegrityManager.readServerResources();");
//		buffer.append("\r\n");
		buffer.append("\t\twhile(!IntegrityManager.serverResourcesReadFlag.getValue()){");
		buffer.append("\r\n");
		buffer.append("\t\t\tSystem.out.println(\"WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER\");");
		buffer.append("\r\n");
		buffer.append("\t\t\ttry {");
		buffer.append("\r\n");
		buffer.append("\t\t\t\tThread.sleep(3000);");
		buffer.append("\r\n");
		buffer.append("\t\t\t} catch (InterruptedException e) {");
		buffer.append("\r\n");
		buffer.append("\t\t\t\te.printStackTrace();");
		buffer.append("\r\n");
		buffer.append("\t\t\t}");
		buffer.append("\r\n");
		buffer.append("\t\t}");
		buffer.append("\r\n");
		// exception for Project (root container)
		if (!eclass.getName().equals("Project")) {
			buffer.append("\t\tIntegrity" + eclass.getName()
					+ " oslcResource = IntegrityServerResources.get"
					+ eclass.getName() + "ByURI(projectID + \"/"
					+ eclass.getName().toLowerCase() + "s/\" + ID);");
		} else {
			buffer.append("\t\tIntegrity" + eclass.getName()
					+ " oslcResource = IntegrityServerResources.get"
					+ eclass.getName() + "ByURI(projectID + \"/"
					+ eclass.getName().toLowerCase() + "s\");");
		}

		buffer.append("\r\n");
		buffer.append("\t\t\tString requestURL = httpServletRequest.getRequestURL().toString();");
		buffer.append("\r\n");
		buffer.append("\t\t\tString projectID2 = null;");
		buffer.append("\r\n");
		buffer.append("\t\t\tif(projectID.contains(\"project\")){");
		buffer.append("\r\n");
		buffer.append("\t\t\t\tprojectID2 = projectID.replace(\"project\", \"\");");
		buffer.append("\r\n");
		buffer.append("\t\t\t}else{");
		buffer.append("\r\n");
		buffer.append("\t\t\t\tprojectID2 = projectID;");
		buffer.append("\r\n");
		buffer.append("\t\t\t}");
		buffer.append("\r\n");
		buffer.append("\t\t\tString projectName = IntegrityUtil.getProjectName(projectID2);");
		buffer.append("\r\n");
		buffer.append("\t\tif (oslcResource != null) {");
		buffer.append("\r\n");

		if (eclass.getName().equals("Item")) {
			buffer.append("\t\tMap<String, String> fieldNameValueMap = new HashMap<String, String>();");
			buffer.append("\r\n");
			buffer.append("\t\tfor (Link fieldLink : oslcResource.getField()) {URI fieldURI = fieldLink.getValue();");
			buffer.append("\r\n");
			buffer.append("\t\t\tIntegrityField integrityField = IntegrityUtil.getFieldByURI(fieldURI);");
			buffer.append("\r\n");
			buffer.append("\t\t\tString fieldName = integrityField.getName();");
			buffer.append("\r\n");
			buffer.append("\t\t\tString fieldValue = integrityField.getValue();");
			buffer.append("\r\n");
			buffer.append("\t\t\tfieldNameValueMap.put(fieldName, fieldValue);");
			buffer.append("\r\n");
			buffer.append("\t\t}");
			buffer.append("\r\n");
			buffer.append("\t\t\thttpServletRequest.setAttribute(\"fieldNameValueMap\", fieldNameValueMap);");
			buffer.append("\r\n");
		}

		buffer.append("\t\t\thttpServletRequest.setAttribute(\"bugzillaUri\",\"https://landfill.bugzilla.org/bugzilla-4.2-branch/\");");
		buffer.append("\r\n");
		buffer.append("\t\t\thttpServletRequest.setAttribute(\"element\", oslcResource);");
		buffer.append("\r\n");
		buffer.append("\t\t\thttpServletRequest.setAttribute(\"requestURL\", requestURL);");
		buffer.append("\r\n");
		buffer.append("\t\t\thttpServletRequest.setAttribute(\"projectName\", projectName);");
		buffer.append("\r\n");

		if (eclass.getName().equals("Item")) {
			buffer.append("\t\t\tRequestDispatcher rd = httpServletRequest.getRequestDispatcher(\"/integrity/item_html.jsp\");");
			buffer.append("\r\n");
		} else {
			buffer.append("\t\t\tRequestDispatcher rd = httpServletRequest.getRequestDispatcher(\"/integrity/genericitem_html.jsp\");");
			buffer.append("\r\n");
		}

		buffer.append("\t\t\ttry {");
		buffer.append("\r\n");
		buffer.append("\t\t\t\trd.forward(httpServletRequest, httpServletResponse);");
		buffer.append("\r\n");
		buffer.append("\t\t\t} catch (Exception e) {");
		buffer.append("\r\n");
		buffer.append("\t\t\t\te.printStackTrace();");
		buffer.append("\r\n");
		buffer.append("\t\t\t\tthrow new WebApplicationException(e);");
		buffer.append("\r\n");
		buffer.append("\t\t\t}");
		buffer.append("\r\n");

		buffer.append("\t\t}");
		buffer.append("\r\n");

		buffer.append("\r\n");
		buffer.append("\t}\r\n");
		buffer.append("\r\n");

	}

	private static void printGetOSLCResourceInRDFMethod(StringBuffer buffer) {
		buffer.append("\t@GET");
		buffer.append("\r\n");
		// exception for Project (root container)
		if (!eclass.getName().equals("Project")) {
			buffer.append("\t@Path(\"{uri}\")");
			buffer.append("\r\n");
		}

		buffer.append("\t@Produces({ OslcMediaType.APPLICATION_RDF_XML, OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })");
		buffer.append("\r\n");
		buffer.append("\tpublic Response get" + eclass.getName() + "(");
		buffer.append("\r\n");
		buffer.append("\t\t@PathParam(\"projectID\") final String projectID,");
		buffer.append("\r\n");
		buffer.append("\t\t@Context Request request");
		
		
		// exception for Project (root container)
		if (!eclass.getName().equals("Project")) {
			buffer.append(",\r\n");
			buffer.append("\t\t@PathParam(\"uri\") final String ID)");
			buffer.append("\r\n");
		} else {
			buffer.append(")");
			buffer.append("\r\n");
		}

		
		
		buffer.append("\t\tthrows URISyntaxException {");
		buffer.append("\r\n");
//		buffer.append("\t\t\tIntegrityManager.readServerResources();");
//		buffer.append("\r\n");
		buffer.append("\t\twhile(!IntegrityManager.serverResourcesReadFlag.getValue()){");
		buffer.append("\r\n");
		buffer.append("\t\t\tSystem.out.println(\"WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER\");");
		buffer.append("\r\n");
		buffer.append("\t\t\ttry {");
		buffer.append("\r\n");
		buffer.append("\t\t\t\tThread.sleep(3000);");
		buffer.append("\r\n");
		buffer.append("\t\t\t} catch (InterruptedException e) {");
		buffer.append("\r\n");
		buffer.append("\t\t\t\te.printStackTrace();");
		buffer.append("\r\n");
		buffer.append("\t\t\t}");
		buffer.append("\r\n");
		buffer.append("\t\t}");
		buffer.append("\r\n");
		// exception for Project (root container)
		if (!eclass.getName().equals("Project")) {
			buffer.append("\t\tIntegrity" + eclass.getName()
					+ " oslcResource = IntegrityServerResources.get"
					+ eclass.getName() + "ByURI(projectID + \"/"
					+ eclass.getName().toLowerCase() + "s/\" + ID);");
		} else {
			buffer.append("\t\tIntegrity" + eclass.getName()
					+ " oslcResource = IntegrityServerResources.get"
					+ eclass.getName() + "ByURI(projectID + \"/"
					+ eclass.getName().toLowerCase() + "s\");");
		}
		buffer.append("\r\n");
		buffer.append("\t\tif(oslcResource == null){");
		buffer.append("\r\n");
		buffer.append("\t\t\treturn Response.status(HttpServletResponse.SC_INTERNAL_SERVER_ERROR).build();");
		buffer.append("\r\n");
		buffer.append("\t\t}");
		buffer.append("\r\n");
		buffer.append("\t\treturn Response.ok(oslcResource).build();\r\n");
		buffer.append("\r\n");
		buffer.append("\t}\r\n");
		buffer.append("\r\n");

	}

	private static void printGetOSLCResourcesInHTMLMethod(StringBuffer buffer) {
		// exception for Project (root container)- list of projects published
		// through Service Provider Catalog
		if (eclass.getName().equals("Project")) {
			return;
		}

		buffer.append("\t@GET");
		buffer.append("\r\n");
		buffer.append("\t@Produces(MediaType.TEXT_HTML)");
		buffer.append("\r\n");
		buffer.append("\tpublic void getHtml" + eclass.getName()
				+ "s(@PathParam(\"projectID\") final String projectID) {");
		buffer.append("\r\n");
//		buffer.append("\t\tIntegrityManager.readServerResources();");
//		buffer.append("\r\n");
		buffer.append("\t\twhile(!IntegrityManager.serverResourcesReadFlag.getValue()){");
		buffer.append("\r\n");
		buffer.append("\t\t\tSystem.out.println(\"WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER\");");
		buffer.append("\r\n");
		buffer.append("\t\t\ttry {");
		buffer.append("\r\n");
		buffer.append("\t\t\t\tThread.sleep(3000);");
		buffer.append("\r\n");
		buffer.append("\t\t\t} catch (InterruptedException e) {");
		buffer.append("\r\n");
		buffer.append("\t\t\t\te.printStackTrace();");
		buffer.append("\r\n");
		buffer.append("\t\t\t}");
		buffer.append("\r\n");
		buffer.append("\t\t}");
		buffer.append("\r\n");
		buffer.append("\t\t\tList<Integrity" + eclass.getName()
				+ "> oslcResources = IntegrityServerResources.get"
				+ eclass.getName() + "sInProject(projectID);");
		buffer.append("\r\n");
		buffer.append("\t\tString requestURL = httpServletRequest.getRequestURL().toString();");
		buffer.append("\r\n");
		buffer.append("\t\tif (oslcResources != null) {");
		buffer.append("\r\n");
		buffer.append("\t\t\thttpServletRequest.setAttribute(\"bugzillaUri\",\"https://landfill.bugzilla.org/bugzilla-4.2-branch/\");");
		buffer.append("\r\n");
		buffer.append("\t\t\thttpServletRequest.setAttribute(\"elements\", oslcResources);");
		buffer.append("\r\n");
		buffer.append("\t\t\thttpServletRequest.setAttribute(\"requestURL\", requestURL);");
		buffer.append("\r\n");
		buffer.append("\t\t\thttpServletRequest.setAttribute(\"projectID\", projectID);");
		buffer.append("\r\n");
		buffer.append("\t\t\thttpServletRequest.setAttribute(\"itemTypeName\", \""
				+ eclass.getName() + "\");");
		buffer.append("\r\n");

		buffer.append("\t\t\tRequestDispatcher rd = httpServletRequest.getRequestDispatcher(\"/integrity/genericitems_html.jsp\");");
		buffer.append("\r\n");

		buffer.append("\t\t\ttry {");
		buffer.append("\r\n");
		buffer.append("\t\t\t\trd.forward(httpServletRequest, httpServletResponse);");
		buffer.append("\r\n");
		buffer.append("\t\t\t} catch (Exception e) {");
		buffer.append("\r\n");
		buffer.append("\t\t\t\te.printStackTrace();");
		buffer.append("\r\n");
		buffer.append("\t\t\t\tthrow new WebApplicationException(e);");
		buffer.append("\r\n");
		buffer.append("\t\t\t}");
		buffer.append("\r\n");

		buffer.append("\t\t}");
		buffer.append("\r\n");

		buffer.append("\t}\r\n");
		buffer.append("\r\n");

	}

	private static void printGetOSLCResourcesInRDFMethod(StringBuffer buffer) {
		// exception for Project (root container)- list of projects published
		// through Service Provider Catalog
		if (eclass.getName().equals("Project")) {
			return;
		}

		buffer.append("\t@OslcQueryCapability(title = \"Integrity "
				+ eclass.getName() + " Query Capability\","
				+ "label = \"Integrity " + eclass.getName()
				+ " Catalog Query\","
				+ "resourceShape = OslcConstants.PATH_RESOURCE_SHAPES"
				+ "+ \"/\" + Constants.PATH_INTEGRITY_"
				+ eclass.getName().toUpperCase() + ","
				+ "resourceTypes = { Constants.TYPE_INTEGRITY_"
				+ eclass.getName().toUpperCase() + " },"
				+ "usages = { OslcConstants.OSLC_USAGE_DEFAULT })");
		buffer.append("\r\n");
		buffer.append("\t@GET");
		buffer.append("\r\n");
		buffer.append("\t@Produces({ OslcMediaType.APPLICATION_RDF_XML, OslcMediaType.APPLICATION_XML, OslcMediaType.APPLICATION_JSON })");
		buffer.append("\r\n");
		buffer.append("\tpublic List<Integrity" + eclass.getName() + "> get"
				+ eclass.getName() + "s(");
		buffer.append("\r\n");
		buffer.append("\t\t@PathParam(\"projectID\") final String projectID,");
		buffer.append("\r\n");
		buffer.append("\t\t@QueryParam(\"oslc.where\") final String where,");
		buffer.append("\r\n");
		buffer.append("\t\t@QueryParam(\"oslc.select\") final String select,");
		buffer.append("\r\n");
		buffer.append("\t\t@QueryParam(\"oslc.prefix\") final String prefix,");
		buffer.append("\r\n");
		buffer.append("\t\t@QueryParam(\"page\") final String pageString,");
		buffer.append("\r\n");
		buffer.append("\t\t@QueryParam(\"oslc.orderBy\") final String orderBy,");
		buffer.append("\r\n");
		buffer.append("\t\t@QueryParam(\"oslc.searchTerms\") final String searchTerms,");
		buffer.append("\r\n");
		buffer.append("\t\t@QueryParam(\"oslc.paging\") final String paging,");
		buffer.append("\r\n");
		buffer.append("\t\t@QueryParam(\"oslc.pageSize\") final String pageSize)");
		buffer.append("\r\n");
		buffer.append("\t\tthrows IOException, ServletException {");
		buffer.append("\r\n");
//		buffer.append("\t\t\tIntegrityManager.readServerResources();");
//		buffer.append("\r\n");
		
		buffer.append("\t\twhile(!IntegrityManager.serverResourcesReadFlag.getValue()){");
		buffer.append("\r\n");
		buffer.append("\t\t\tSystem.out.println(\"WAITING FOR ADAPTER TO FINISH SCANNING INTEGRITY SERVER\");");
		buffer.append("\r\n");
		buffer.append("\t\t\ttry {");
		buffer.append("\r\n");
		buffer.append("\t\t\t\tThread.sleep(3000);");
		buffer.append("\r\n");
		buffer.append("\t\t\t} catch (InterruptedException e) {");
		buffer.append("\r\n");
		buffer.append("\t\t\t\te.printStackTrace();");
		buffer.append("\r\n");
		buffer.append("\t\t\t}");
		buffer.append("\r\n");
		buffer.append("\t\t}");
		buffer.append("\r\n");
			
		buffer.append("\t\tList<Integrity" + eclass.getName()
				+ "> oslcResources = IntegrityServerResources.get"
				+ eclass.getName() + "sInProject(projectID);");
		buffer.append("\r\n");
		buffer.append("\t\treturn oslcResources;");
		buffer.append("\r\n");
		buffer.append("\t}");
		buffer.append("\r\n");

	}

	private static void printJavaClassDeclaration(StringBuffer buffer) {

		buffer.append("public class Integrity" + eclass.getName() + "Service {");
		buffer.append("\r\n");
		buffer.append("\t@Context");
		buffer.append("\r\n");
		buffer.append("\tprivate HttpServletRequest httpServletRequest;");
		buffer.append("\r\n");
		buffer.append("\t@Context");
		buffer.append("\r\n");
		buffer.append("\tprivate HttpServletResponse httpServletResponse;");
		buffer.append("\r\n");
		buffer.append("\t@Context");
		buffer.append("\r\n");
		buffer.append("\tprivate UriInfo uriInfo;");
		buffer.append("\r\n");
		buffer.append("\r\n");

	}

	private static void printJavaClassOSLCAnnotations(StringBuffer buffer) {
		buffer.append("@OslcService(Constants.INTEGRITY_"
				+ eclass.getName().toUpperCase() + "_DOMAIN)");
		buffer.append("\r\n");
		buffer.append("@Path(\"{projectID}/" + eclass.getName().toLowerCase()
				+ "s\")");
		buffer.append("\r\n");

	}

	private static void printImportStatements(StringBuffer buffer) {

		buffer.append("import edu.gatech.mbsec.adapter.integrity.generated.resources.Integrity"
				+ eclass.getName() + ";");
		buffer.append("\r\n");
		buffer.append("import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityServerResources;");
		buffer.append("\r\n");
		buffer.append("import edu.gatech.mbsec.adapter.integrity.application.util.IntegrityUtil;");
		buffer.append("\r\n");

		buffer.append("import java.io.IOException;\r\n");
		buffer.append("import java.io.UnsupportedEncodingException;\r\n");
		buffer.append("import java.net.URI;\r\n");
		buffer.append("import java.net.URISyntaxException;\r\n");
		buffer.append("import java.security.MessageDigest;\r\n");
		buffer.append("import java.security.NoSuchAlgorithmException;\r\n");
		buffer.append("import java.util.List;\r\n");
		buffer.append("import java.util.Map;\r\n");
		buffer.append("import java.util.HashMap;\r\n");

		buffer.append("import javax.servlet.RequestDispatcher;\r\n");
		buffer.append("import javax.servlet.ServletException;\r\n");
		buffer.append("import javax.servlet.http.HttpServletRequest;\r\n");
		buffer.append("import javax.servlet.http.HttpServletResponse;\r\n");
		buffer.append("import javax.ws.rs.Consumes;\r\n");
		buffer.append("import javax.ws.rs.GET;\r\n");
		buffer.append("import javax.ws.rs.HEAD;\r\n");
		buffer.append("import javax.ws.rs.POST;\r\n");
		buffer.append("import javax.ws.rs.PUT;\r\n");
		buffer.append("import javax.ws.rs.Path;\r\n");
		buffer.append("import javax.ws.rs.PathParam;\r\n");
		buffer.append("import javax.ws.rs.Produces;\r\n");
		buffer.append("import javax.ws.rs.QueryParam;\r\n");
		buffer.append("import javax.ws.rs.WebApplicationException;\r\n");
		buffer.append("import javax.ws.rs.core.Context;\r\n");
		buffer.append("import javax.ws.rs.core.EntityTag;\r\n");
		buffer.append("import javax.ws.rs.core.MediaType;\r\n");
		buffer.append("import javax.ws.rs.core.Request;\r\n");
		buffer.append("import javax.ws.rs.core.Response;\r\n");
		buffer.append("import javax.ws.rs.core.UriInfo;\r\n");
		buffer.append("import javax.ws.rs.core.Response.ResponseBuilder;\r\n");

		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcCreationFactory;\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcQueryCapability;\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.annotation.OslcService;\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.model.OslcConstants;\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.model.OslcMediaType;\r\n");
		buffer.append("import org.eclipse.lyo.oslc4j.core.model.Link;\r\n");

		buffer.append("import edu.gatech.mbsec.adapter.integrity.application.IntegrityManager;\r\n");
		buffer.append("import edu.gatech.mbsec.adapter.integrity.application.OSLC4JIntegrityApplication;\r\n");
		buffer.append("import edu.gatech.mbsec.adapter.integrity.generated.resources.Constants;\r\n");
		buffer.append("import edu.gatech.mbsec.adapter.integrity.generated.resources.IntegrityField;\r\n");

		buffer.append("\r\n");
		buffer.append("\r\n");
	}

	private static void printPackageDeclaration(StringBuffer buffer) {
		buffer.append("package edu.gatech.mbsec.adapter.integrity.generated.services;");
		buffer.append("\r\n");
		buffer.append("\r\n");

	}

	@Override
	public void run() {
		main(null);

	}

}
