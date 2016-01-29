/**
 */
package integrity;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see integrity.IntegrityFactory
 * @model kind="package"
 * @generated
 */
public interface IntegrityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "integrity";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.ptc.com/solutions/application-lifecycle-management/";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ptc.integrity";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IntegrityPackage eINSTANCE = integrity.impl.IntegrityPackageImpl.init();

	/**
	 * The meta object id for the '{@link integrity.impl.ServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see integrity.impl.ServerImpl
	 * @see integrity.impl.IntegrityPackageImpl#getServer()
	 * @generated
	 */
	int SERVER = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER__PROJECT = 0;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link integrity.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see integrity.impl.ProjectImpl
	 * @see integrity.impl.IntegrityPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Requirement Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REQUIREMENT_DOCUMENT = 0;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__REQUIREMENT = 1;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SUMMARY = 2;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__STATE = 3;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ID = 4;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MODIFIED_BY = 5;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CREATED_BY = 6;

	/**
	 * The feature id for the '<em><b>Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__MODIFIED_DATE = 7;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__CREATED_DATE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TYPE = 10;

	/**
	 * The feature id for the '<em><b>Alm Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ALM_DESCRIPTION = 11;

	/**
	 * The feature id for the '<em><b>Significant Edit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__SIGNIFICANT_EDIT_DATE = 12;

	/**
	 * The feature id for the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROJECT = 13;

	/**
	 * The feature id for the '<em><b>Alm Product Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__ALM_PRODUCT_MANAGER = 14;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link integrity.impl.RequirementDocumentImpl <em>Requirement Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see integrity.impl.RequirementDocumentImpl
	 * @see integrity.impl.IntegrityPackageImpl#getRequirementDocument()
	 * @generated
	 */
	int REQUIREMENT_DOCUMENT = 2;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__SUMMARY = 0;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__STATE = 1;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__PROJECT = 2;

	/**
	 * The feature id for the '<em><b>Alm Shared Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__ALM_SHARED_TEXT = 3;

	/**
	 * The feature id for the '<em><b>Alm Document Short Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__ALM_DOCUMENT_SHORT_TITLE = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__ID = 5;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__MODIFIED_BY = 6;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__CREATED_BY = 7;

	/**
	 * The feature id for the '<em><b>Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__MODIFIED_DATE = 8;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__CREATED_DATE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__TYPE = 10;

	/**
	 * The feature id for the '<em><b>Significant Edit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__SIGNIFICANT_EDIT_DATE = 11;

	/**
	 * The feature id for the '<em><b>Significant Change Since Item Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION = 12;

	/**
	 * The feature id for the '<em><b>Alm Documents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__ALM_DOCUMENTS = 13;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__CONTAINS = 14;

	/**
	 * The feature id for the '<em><b>Referenced By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__REFERENCED_BY = 15;

	/**
	 * The feature id for the '<em><b>Alm Changes Authorized By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__ALM_CHANGES_AUTHORIZED_BY = 16;

	/**
	 * The feature id for the '<em><b>Alm Spawns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__ALM_SPAWNS = 17;

	/**
	 * The feature id for the '<em><b>Alm Shared Attachments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__ALM_SHARED_ATTACHMENTS = 18;

	/**
	 * The feature id for the '<em><b>Requirement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT__REQUIREMENT = 19;

	/**
	 * The number of structural features of the '<em>Requirement Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT_FEATURE_COUNT = 20;

	/**
	 * The number of operations of the '<em>Requirement Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_DOCUMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link integrity.impl.RequirementImpl <em>Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see integrity.impl.RequirementImpl
	 * @see integrity.impl.IntegrityPackageImpl#getRequirement()
	 * @generated
	 */
	int REQUIREMENT = 3;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__STATE = 0;

	/**
	 * The feature id for the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PROJECT = 1;

	/**
	 * The feature id for the '<em><b>Attachments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ATTACHMENTS = 2;

	/**
	 * The feature id for the '<em><b>Parameter Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__PARAMETER_VALUES = 3;

	/**
	 * The feature id for the '<em><b>Alm Authorizing Change Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_AUTHORIZING_CHANGE_ORDER = 4;

	/**
	 * The feature id for the '<em><b>Alm Suspect Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_SUSPECT_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Alm Include Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_INCLUDE_REFERENCE = 6;

	/**
	 * The feature id for the '<em><b>Alm Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_PRIORITY = 7;

	/**
	 * The feature id for the '<em><b>Alm Satisfied By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_SATISFIED_BY = 8;

	/**
	 * The feature id for the '<em><b>Alm Validated By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_VALIDATED_BY = 9;

	/**
	 * The feature id for the '<em><b>Alm Spawns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_SPAWNS = 10;

	/**
	 * The feature id for the '<em><b>Alm Decomposes To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_DECOMPOSES_TO = 11;

	/**
	 * The feature id for the '<em><b>Alm Is Related To</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_IS_RELATED_TO = 12;

	/**
	 * The feature id for the '<em><b>Alm Include Subsegmentin Metrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_INCLUDE_SUBSEGMENTIN_METRICS = 13;

	/**
	 * The feature id for the '<em><b>Alm Validated By Trace Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_VALIDATED_BY_TRACE_COUNT = 14;

	/**
	 * The feature id for the '<em><b>Alm Trace Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_TRACE_STATUS = 15;

	/**
	 * The feature id for the '<em><b>Alm Downstream Trace Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_DOWNSTREAM_TRACE_COUNT = 16;

	/**
	 * The feature id for the '<em><b>Alm Upstream Trace Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_UPSTREAM_TRACE_COUNT = 17;

	/**
	 * The feature id for the '<em><b>Alm Validated By Pass Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_VALIDATED_BY_PASS_COUNT = 18;

	/**
	 * The feature id for the '<em><b>Alm Validated By Pass Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_VALIDATED_BY_PASS_PERCENTAGE = 19;

	/**
	 * The feature id for the '<em><b>Alm Category Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_CATEGORY_INT_VALUE = 20;

	/**
	 * The feature id for the '<em><b>Alm Modelled By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_MODELLED_BY = 21;

	/**
	 * The feature id for the '<em><b>Alm Verified By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_VERIFIED_BY = 22;

	/**
	 * The feature id for the '<em><b>Alm Verified By Pass Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_VERIFIED_BY_PASS_COUNT = 23;

	/**
	 * The feature id for the '<em><b>Alm Verified By Trace Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_VERIFIED_BY_TRACE_COUNT = 24;

	/**
	 * The feature id for the '<em><b>Alm Verified By Pass Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_VERIFIED_BY_PASS_PERCENTAGE = 25;

	/**
	 * The feature id for the '<em><b>Alm Changes Authorized By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_CHANGES_AUTHORIZED_BY = 26;

	/**
	 * The feature id for the '<em><b>Alm Decomposed From</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_DECOMPOSED_FROM = 27;

	/**
	 * The feature id for the '<em><b>Alm Valid Change Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_VALID_CHANGE_ORDER = 28;

	/**
	 * The feature id for the '<em><b>Alm Validated By Trace Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_VALIDATED_BY_TRACE_HEALTH = 29;

	/**
	 * The feature id for the '<em><b>Alm Verified By Trace Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_VERIFIED_BY_TRACE_HEALTH = 30;

	/**
	 * The feature id for the '<em><b>Alm Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_TEXT = 31;

	/**
	 * The feature id for the '<em><b>Alm Project State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_PROJECT_STATE = 32;

	/**
	 * The feature id for the '<em><b>Alm Project Phase FVA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ALM_PROJECT_PHASE_FVA = 33;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__TYPE = 34;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ID = 35;

	/**
	 * The feature id for the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MODIFIED_BY = 36;

	/**
	 * The feature id for the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CREATED_BY = 37;

	/**
	 * The feature id for the '<em><b>Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__MODIFIED_DATE = 38;

	/**
	 * The feature id for the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CREATED_DATE = 39;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CATEGORY = 40;

	/**
	 * The feature id for the '<em><b>References</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFERENCES = 41;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONTAINS = 42;

	/**
	 * The feature id for the '<em><b>Contained By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__CONTAINED_BY = 43;

	/**
	 * The feature id for the '<em><b>Reference Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFERENCE_MODE = 44;

	/**
	 * The feature id for the '<em><b>Document ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__DOCUMENT_ID = 45;

	/**
	 * The feature id for the '<em><b>Referenced Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REFERENCED_ITEM_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Shares</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SHARES = 47;

	/**
	 * The feature id for the '<em><b>Shared By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SHARED_BY = 48;

	/**
	 * The feature id for the '<em><b>Root ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__ROOT_ID = 49;

	/**
	 * The feature id for the '<em><b>Input Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__INPUT_REVISION_DATE = 50;

	/**
	 * The feature id for the '<em><b>Significant Edit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SIGNIFICANT_EDIT_DATE = 51;

	/**
	 * The feature id for the '<em><b>Significant Change Since Item Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION = 52;

	/**
	 * The feature id for the '<em><b>Requirement Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT__REQUIREMENT_DOCUMENT = 53;

	/**
	 * The number of structural features of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_FEATURE_COUNT = 54;

	/**
	 * The number of operations of the '<em>Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link integrity.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see integrity.impl.ItemImpl
	 * @see integrity.impl.IntegrityPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 4;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__FIELD = 1;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link integrity.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see integrity.impl.FieldImpl
	 * @see integrity.impl.IntegrityPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link integrity.PriorityEnumeration <em>Priority Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see integrity.PriorityEnumeration
	 * @see integrity.impl.IntegrityPackageImpl#getPriorityEnumeration()
	 * @generated
	 */
	int PRIORITY_ENUMERATION = 6;

	/**
	 * The meta object id for the '{@link integrity.TraceStatusEnumeration <em>Trace Status Enumeration</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see integrity.TraceStatusEnumeration
	 * @see integrity.impl.IntegrityPackageImpl#getTraceStatusEnumeration()
	 * @generated
	 */
	int TRACE_STATUS_ENUMERATION = 7;


	/**
	 * Returns the meta object for class '{@link integrity.Server <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see integrity.Server
	 * @generated
	 */
	EClass getServer();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Server#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Project</em>'.
	 * @see integrity.Server#getProject()
	 * @see #getServer()
	 * @generated
	 */
	EReference getServer_Project();

	/**
	 * Returns the meta object for class '{@link integrity.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see integrity.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Project#getRequirementDocument <em>Requirement Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Document</em>'.
	 * @see integrity.Project#getRequirementDocument()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_RequirementDocument();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Project#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see integrity.Project#getRequirement()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Requirement();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Project#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see integrity.Project#getSummary()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Summary();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Project#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see integrity.Project#getState()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_State();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Project#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see integrity.Project#getID()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ID();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Project#getModifiedBy <em>Modified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified By</em>'.
	 * @see integrity.Project#getModifiedBy()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ModifiedBy();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Project#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By</em>'.
	 * @see integrity.Project#getCreatedBy()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_CreatedBy();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Project#getModifiedDate <em>Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Date</em>'.
	 * @see integrity.Project#getModifiedDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Project#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see integrity.Project#getCreatedDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see integrity.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Project#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see integrity.Project#getType()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Type();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Project#getAlm_Description <em>Alm Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Description</em>'.
	 * @see integrity.Project#getAlm_Description()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Alm_Description();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Project#getSignificantEditDate <em>Significant Edit Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Significant Edit Date</em>'.
	 * @see integrity.Project#getSignificantEditDate()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_SignificantEditDate();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Project#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Project</em>'.
	 * @see integrity.Project#getProject()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Project();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Project#getAlm_ProductManager <em>Alm Product Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Product Manager</em>'.
	 * @see integrity.Project#getAlm_ProductManager()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Alm_ProductManager();

	/**
	 * Returns the meta object for class '{@link integrity.RequirementDocument <em>Requirement Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement Document</em>'.
	 * @see integrity.RequirementDocument
	 * @generated
	 */
	EClass getRequirementDocument();

	/**
	 * Returns the meta object for the attribute '{@link integrity.RequirementDocument#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see integrity.RequirementDocument#getSummary()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EAttribute getRequirementDocument_Summary();

	/**
	 * Returns the meta object for the attribute '{@link integrity.RequirementDocument#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see integrity.RequirementDocument#getState()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EAttribute getRequirementDocument_State();

	/**
	 * Returns the meta object for the containment reference '{@link integrity.RequirementDocument#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project</em>'.
	 * @see integrity.RequirementDocument#getProject()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EReference getRequirementDocument_Project();

	/**
	 * Returns the meta object for the attribute '{@link integrity.RequirementDocument#getAlm_SharedText <em>Alm Shared Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Shared Text</em>'.
	 * @see integrity.RequirementDocument#getAlm_SharedText()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EAttribute getRequirementDocument_Alm_SharedText();

	/**
	 * Returns the meta object for the attribute '{@link integrity.RequirementDocument#getAlm_DocumentShortTitle <em>Alm Document Short Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Document Short Title</em>'.
	 * @see integrity.RequirementDocument#getAlm_DocumentShortTitle()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EAttribute getRequirementDocument_Alm_DocumentShortTitle();

	/**
	 * Returns the meta object for the attribute '{@link integrity.RequirementDocument#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see integrity.RequirementDocument#getID()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EAttribute getRequirementDocument_ID();

	/**
	 * Returns the meta object for the attribute '{@link integrity.RequirementDocument#getModifiedBy <em>Modified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified By</em>'.
	 * @see integrity.RequirementDocument#getModifiedBy()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EAttribute getRequirementDocument_ModifiedBy();

	/**
	 * Returns the meta object for the attribute '{@link integrity.RequirementDocument#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By</em>'.
	 * @see integrity.RequirementDocument#getCreatedBy()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EAttribute getRequirementDocument_CreatedBy();

	/**
	 * Returns the meta object for the attribute '{@link integrity.RequirementDocument#getModifiedDate <em>Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Date</em>'.
	 * @see integrity.RequirementDocument#getModifiedDate()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EAttribute getRequirementDocument_ModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link integrity.RequirementDocument#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see integrity.RequirementDocument#getCreatedDate()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EAttribute getRequirementDocument_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link integrity.RequirementDocument#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see integrity.RequirementDocument#getType()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EAttribute getRequirementDocument_Type();

	/**
	 * Returns the meta object for the attribute '{@link integrity.RequirementDocument#getSignificantEditDate <em>Significant Edit Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Significant Edit Date</em>'.
	 * @see integrity.RequirementDocument#getSignificantEditDate()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EAttribute getRequirementDocument_SignificantEditDate();

	/**
	 * Returns the meta object for the attribute '{@link integrity.RequirementDocument#isSignificantChangeSinceItemRevision <em>Significant Change Since Item Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Significant Change Since Item Revision</em>'.
	 * @see integrity.RequirementDocument#isSignificantChangeSinceItemRevision()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EAttribute getRequirementDocument_SignificantChangeSinceItemRevision();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.RequirementDocument#getAlm_Documents <em>Alm Documents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alm Documents</em>'.
	 * @see integrity.RequirementDocument#getAlm_Documents()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EReference getRequirementDocument_Alm_Documents();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.RequirementDocument#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see integrity.RequirementDocument#getContains()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EReference getRequirementDocument_Contains();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.RequirementDocument#getReferencedBy <em>Referenced By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Referenced By</em>'.
	 * @see integrity.RequirementDocument#getReferencedBy()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EReference getRequirementDocument_ReferencedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.RequirementDocument#getAlm_ChangesAuthorizedBy <em>Alm Changes Authorized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alm Changes Authorized By</em>'.
	 * @see integrity.RequirementDocument#getAlm_ChangesAuthorizedBy()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EReference getRequirementDocument_Alm_ChangesAuthorizedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.RequirementDocument#getAlm_Spawns <em>Alm Spawns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alm Spawns</em>'.
	 * @see integrity.RequirementDocument#getAlm_Spawns()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EReference getRequirementDocument_Alm_Spawns();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.RequirementDocument#getAlm_SharedAttachments <em>Alm Shared Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alm Shared Attachments</em>'.
	 * @see integrity.RequirementDocument#getAlm_SharedAttachments()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EReference getRequirementDocument_Alm_SharedAttachments();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.RequirementDocument#getRequirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement</em>'.
	 * @see integrity.RequirementDocument#getRequirement()
	 * @see #getRequirementDocument()
	 * @generated
	 */
	EReference getRequirementDocument_Requirement();

	/**
	 * Returns the meta object for class '{@link integrity.Requirement <em>Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Requirement</em>'.
	 * @see integrity.Requirement
	 * @generated
	 */
	EClass getRequirement();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see integrity.Requirement#getState()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_State();

	/**
	 * Returns the meta object for the containment reference '{@link integrity.Requirement#getProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Project</em>'.
	 * @see integrity.Requirement#getProject()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Project();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getAttachments <em>Attachments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attachments</em>'.
	 * @see integrity.Requirement#getAttachments()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Attachments();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getParameterValues <em>Parameter Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Values</em>'.
	 * @see integrity.Requirement#getParameterValues()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ParameterValues();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_AuthorizingChangeOrder <em>Alm Authorizing Change Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Authorizing Change Order</em>'.
	 * @see integrity.Requirement#getAlm_AuthorizingChangeOrder()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_AuthorizingChangeOrder();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_SuspectCount <em>Alm Suspect Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Suspect Count</em>'.
	 * @see integrity.Requirement#getAlm_SuspectCount()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_SuspectCount();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#isAlm_IncludeReference <em>Alm Include Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Include Reference</em>'.
	 * @see integrity.Requirement#isAlm_IncludeReference()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_IncludeReference();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_Priority <em>Alm Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Priority</em>'.
	 * @see integrity.Requirement#getAlm_Priority()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_Priority();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getAlm_SatisfiedBy <em>Alm Satisfied By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alm Satisfied By</em>'.
	 * @see integrity.Requirement#getAlm_SatisfiedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Alm_SatisfiedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getAlm_ValidatedBy <em>Alm Validated By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alm Validated By</em>'.
	 * @see integrity.Requirement#getAlm_ValidatedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Alm_ValidatedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getAlm_Spawns <em>Alm Spawns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alm Spawns</em>'.
	 * @see integrity.Requirement#getAlm_Spawns()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Alm_Spawns();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getAlm_DecomposesTo <em>Alm Decomposes To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alm Decomposes To</em>'.
	 * @see integrity.Requirement#getAlm_DecomposesTo()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Alm_DecomposesTo();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getAlm_IsRelatedTo <em>Alm Is Related To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alm Is Related To</em>'.
	 * @see integrity.Requirement#getAlm_IsRelatedTo()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Alm_IsRelatedTo();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#isAlm_IncludeSubsegmentinMetrics <em>Alm Include Subsegmentin Metrics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Include Subsegmentin Metrics</em>'.
	 * @see integrity.Requirement#isAlm_IncludeSubsegmentinMetrics()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_IncludeSubsegmentinMetrics();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_ValidatedByTraceCount <em>Alm Validated By Trace Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Validated By Trace Count</em>'.
	 * @see integrity.Requirement#getAlm_ValidatedByTraceCount()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_ValidatedByTraceCount();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_TraceStatus <em>Alm Trace Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Trace Status</em>'.
	 * @see integrity.Requirement#getAlm_TraceStatus()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_TraceStatus();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_DownstreamTraceCount <em>Alm Downstream Trace Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Downstream Trace Count</em>'.
	 * @see integrity.Requirement#getAlm_DownstreamTraceCount()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_DownstreamTraceCount();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_UpstreamTraceCount <em>Alm Upstream Trace Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Upstream Trace Count</em>'.
	 * @see integrity.Requirement#getAlm_UpstreamTraceCount()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_UpstreamTraceCount();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_ValidatedByPassCount <em>Alm Validated By Pass Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Validated By Pass Count</em>'.
	 * @see integrity.Requirement#getAlm_ValidatedByPassCount()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_ValidatedByPassCount();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_ValidatedByPassPercentage <em>Alm Validated By Pass Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Validated By Pass Percentage</em>'.
	 * @see integrity.Requirement#getAlm_ValidatedByPassPercentage()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_ValidatedByPassPercentage();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_CategoryIntValue <em>Alm Category Int Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Category Int Value</em>'.
	 * @see integrity.Requirement#getAlm_CategoryIntValue()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_CategoryIntValue();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getAlm_ModelledBy <em>Alm Modelled By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alm Modelled By</em>'.
	 * @see integrity.Requirement#getAlm_ModelledBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Alm_ModelledBy();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getAlm_VerifiedBy <em>Alm Verified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alm Verified By</em>'.
	 * @see integrity.Requirement#getAlm_VerifiedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Alm_VerifiedBy();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_VerifiedByPassCount <em>Alm Verified By Pass Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Verified By Pass Count</em>'.
	 * @see integrity.Requirement#getAlm_VerifiedByPassCount()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_VerifiedByPassCount();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_VerifiedByTraceCount <em>Alm Verified By Trace Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Verified By Trace Count</em>'.
	 * @see integrity.Requirement#getAlm_VerifiedByTraceCount()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_VerifiedByTraceCount();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_VerifiedByPassPercentage <em>Alm Verified By Pass Percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Verified By Pass Percentage</em>'.
	 * @see integrity.Requirement#getAlm_VerifiedByPassPercentage()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_VerifiedByPassPercentage();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getAlm_ChangesAuthorizedBy <em>Alm Changes Authorized By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alm Changes Authorized By</em>'.
	 * @see integrity.Requirement#getAlm_ChangesAuthorizedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Alm_ChangesAuthorizedBy();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getAlm_DecomposedFrom <em>Alm Decomposed From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alm Decomposed From</em>'.
	 * @see integrity.Requirement#getAlm_DecomposedFrom()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Alm_DecomposedFrom();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#isAlm_ValidChangeOrder <em>Alm Valid Change Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Valid Change Order</em>'.
	 * @see integrity.Requirement#isAlm_ValidChangeOrder()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_ValidChangeOrder();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_ValidatedByTraceHealth <em>Alm Validated By Trace Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Validated By Trace Health</em>'.
	 * @see integrity.Requirement#getAlm_ValidatedByTraceHealth()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_ValidatedByTraceHealth();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_VerifiedByTraceHealth <em>Alm Verified By Trace Health</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Verified By Trace Health</em>'.
	 * @see integrity.Requirement#getAlm_VerifiedByTraceHealth()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_VerifiedByTraceHealth();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_Text <em>Alm Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Text</em>'.
	 * @see integrity.Requirement#getAlm_Text()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_Text();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_ProjectState <em>Alm Project State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Project State</em>'.
	 * @see integrity.Requirement#getAlm_ProjectState()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_ProjectState();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getAlm_ProjectPhaseFVA <em>Alm Project Phase FVA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alm Project Phase FVA</em>'.
	 * @see integrity.Requirement#getAlm_ProjectPhaseFVA()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Alm_ProjectPhaseFVA();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see integrity.Requirement#getType()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Type();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see integrity.Requirement#getID()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ID();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getModifiedBy <em>Modified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified By</em>'.
	 * @see integrity.Requirement#getModifiedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ModifiedBy();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getCreatedBy <em>Created By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created By</em>'.
	 * @see integrity.Requirement#getCreatedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_CreatedBy();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getModifiedDate <em>Modified Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Modified Date</em>'.
	 * @see integrity.Requirement#getModifiedDate()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ModifiedDate();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getCreatedDate <em>Created Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Created Date</em>'.
	 * @see integrity.Requirement#getCreatedDate()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_CreatedDate();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see integrity.Requirement#getCategory()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_Category();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>References</em>'.
	 * @see integrity.Requirement#getReferences()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_References();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see integrity.Requirement#getContains()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Contains();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getContainedBy <em>Contained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contained By</em>'.
	 * @see integrity.Requirement#getContainedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_ContainedBy();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getReferenceMode <em>Reference Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reference Mode</em>'.
	 * @see integrity.Requirement#getReferenceMode()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ReferenceMode();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getDocumentID <em>Document ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document ID</em>'.
	 * @see integrity.Requirement#getDocumentID()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_DocumentID();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getReferencedItemType <em>Referenced Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referenced Item Type</em>'.
	 * @see integrity.Requirement#getReferencedItemType()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_ReferencedItemType();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getShares <em>Shares</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shares</em>'.
	 * @see integrity.Requirement#getShares()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_Shares();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getSharedBy <em>Shared By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Shared By</em>'.
	 * @see integrity.Requirement#getSharedBy()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_SharedBy();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getRootID <em>Root ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Root ID</em>'.
	 * @see integrity.Requirement#getRootID()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_RootID();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getInputRevisionDate <em>Input Revision Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input Revision Date</em>'.
	 * @see integrity.Requirement#getInputRevisionDate()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_InputRevisionDate();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#getSignificantEditDate <em>Significant Edit Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Significant Edit Date</em>'.
	 * @see integrity.Requirement#getSignificantEditDate()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_SignificantEditDate();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Requirement#isSignificantChangeSinceItemRevision <em>Significant Change Since Item Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Significant Change Since Item Revision</em>'.
	 * @see integrity.Requirement#isSignificantChangeSinceItemRevision()
	 * @see #getRequirement()
	 * @generated
	 */
	EAttribute getRequirement_SignificantChangeSinceItemRevision();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Requirement#getRequirementDocument <em>Requirement Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Requirement Document</em>'.
	 * @see integrity.Requirement#getRequirementDocument()
	 * @see #getRequirement()
	 * @generated
	 */
	EReference getRequirement_RequirementDocument();

	/**
	 * Returns the meta object for class '{@link integrity.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see integrity.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Item#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see integrity.Item#getID()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link integrity.Item#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see integrity.Item#getField()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Field();

	/**
	 * Returns the meta object for class '{@link integrity.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see integrity.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see integrity.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the attribute '{@link integrity.Field#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see integrity.Field#getValue()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Value();

	/**
	 * Returns the meta object for enum '{@link integrity.PriorityEnumeration <em>Priority Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Priority Enumeration</em>'.
	 * @see integrity.PriorityEnumeration
	 * @generated
	 */
	EEnum getPriorityEnumeration();

	/**
	 * Returns the meta object for enum '{@link integrity.TraceStatusEnumeration <em>Trace Status Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Trace Status Enumeration</em>'.
	 * @see integrity.TraceStatusEnumeration
	 * @generated
	 */
	EEnum getTraceStatusEnumeration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IntegrityFactory getIntegrityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link integrity.impl.ServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see integrity.impl.ServerImpl
		 * @see integrity.impl.IntegrityPackageImpl#getServer()
		 * @generated
		 */
		EClass SERVER = eINSTANCE.getServer();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVER__PROJECT = eINSTANCE.getServer_Project();

		/**
		 * The meta object literal for the '{@link integrity.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see integrity.impl.ProjectImpl
		 * @see integrity.impl.IntegrityPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Requirement Document</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__REQUIREMENT_DOCUMENT = eINSTANCE.getProject_RequirementDocument();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__REQUIREMENT = eINSTANCE.getProject_Requirement();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__SUMMARY = eINSTANCE.getProject_Summary();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__STATE = eINSTANCE.getProject_State();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ID = eINSTANCE.getProject_ID();

		/**
		 * The meta object literal for the '<em><b>Modified By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__MODIFIED_BY = eINSTANCE.getProject_ModifiedBy();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__CREATED_BY = eINSTANCE.getProject_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__MODIFIED_DATE = eINSTANCE.getProject_ModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__CREATED_DATE = eINSTANCE.getProject_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__TYPE = eINSTANCE.getProject_Type();

		/**
		 * The meta object literal for the '<em><b>Alm Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ALM_DESCRIPTION = eINSTANCE.getProject_Alm_Description();

		/**
		 * The meta object literal for the '<em><b>Significant Edit Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__SIGNIFICANT_EDIT_DATE = eINSTANCE.getProject_SignificantEditDate();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__PROJECT = eINSTANCE.getProject_Project();

		/**
		 * The meta object literal for the '<em><b>Alm Product Manager</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__ALM_PRODUCT_MANAGER = eINSTANCE.getProject_Alm_ProductManager();

		/**
		 * The meta object literal for the '{@link integrity.impl.RequirementDocumentImpl <em>Requirement Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see integrity.impl.RequirementDocumentImpl
		 * @see integrity.impl.IntegrityPackageImpl#getRequirementDocument()
		 * @generated
		 */
		EClass REQUIREMENT_DOCUMENT = eINSTANCE.getRequirementDocument();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DOCUMENT__SUMMARY = eINSTANCE.getRequirementDocument_Summary();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DOCUMENT__STATE = eINSTANCE.getRequirementDocument_State();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DOCUMENT__PROJECT = eINSTANCE.getRequirementDocument_Project();

		/**
		 * The meta object literal for the '<em><b>Alm Shared Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DOCUMENT__ALM_SHARED_TEXT = eINSTANCE.getRequirementDocument_Alm_SharedText();

		/**
		 * The meta object literal for the '<em><b>Alm Document Short Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DOCUMENT__ALM_DOCUMENT_SHORT_TITLE = eINSTANCE.getRequirementDocument_Alm_DocumentShortTitle();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DOCUMENT__ID = eINSTANCE.getRequirementDocument_ID();

		/**
		 * The meta object literal for the '<em><b>Modified By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DOCUMENT__MODIFIED_BY = eINSTANCE.getRequirementDocument_ModifiedBy();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DOCUMENT__CREATED_BY = eINSTANCE.getRequirementDocument_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DOCUMENT__MODIFIED_DATE = eINSTANCE.getRequirementDocument_ModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DOCUMENT__CREATED_DATE = eINSTANCE.getRequirementDocument_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DOCUMENT__TYPE = eINSTANCE.getRequirementDocument_Type();

		/**
		 * The meta object literal for the '<em><b>Significant Edit Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DOCUMENT__SIGNIFICANT_EDIT_DATE = eINSTANCE.getRequirementDocument_SignificantEditDate();

		/**
		 * The meta object literal for the '<em><b>Significant Change Since Item Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT_DOCUMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION = eINSTANCE.getRequirementDocument_SignificantChangeSinceItemRevision();

		/**
		 * The meta object literal for the '<em><b>Alm Documents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DOCUMENT__ALM_DOCUMENTS = eINSTANCE.getRequirementDocument_Alm_Documents();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DOCUMENT__CONTAINS = eINSTANCE.getRequirementDocument_Contains();

		/**
		 * The meta object literal for the '<em><b>Referenced By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DOCUMENT__REFERENCED_BY = eINSTANCE.getRequirementDocument_ReferencedBy();

		/**
		 * The meta object literal for the '<em><b>Alm Changes Authorized By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DOCUMENT__ALM_CHANGES_AUTHORIZED_BY = eINSTANCE.getRequirementDocument_Alm_ChangesAuthorizedBy();

		/**
		 * The meta object literal for the '<em><b>Alm Spawns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DOCUMENT__ALM_SPAWNS = eINSTANCE.getRequirementDocument_Alm_Spawns();

		/**
		 * The meta object literal for the '<em><b>Alm Shared Attachments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DOCUMENT__ALM_SHARED_ATTACHMENTS = eINSTANCE.getRequirementDocument_Alm_SharedAttachments();

		/**
		 * The meta object literal for the '<em><b>Requirement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT_DOCUMENT__REQUIREMENT = eINSTANCE.getRequirementDocument_Requirement();

		/**
		 * The meta object literal for the '{@link integrity.impl.RequirementImpl <em>Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see integrity.impl.RequirementImpl
		 * @see integrity.impl.IntegrityPackageImpl#getRequirement()
		 * @generated
		 */
		EClass REQUIREMENT = eINSTANCE.getRequirement();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__STATE = eINSTANCE.getRequirement_State();

		/**
		 * The meta object literal for the '<em><b>Project</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__PROJECT = eINSTANCE.getRequirement_Project();

		/**
		 * The meta object literal for the '<em><b>Attachments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ATTACHMENTS = eINSTANCE.getRequirement_Attachments();

		/**
		 * The meta object literal for the '<em><b>Parameter Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__PARAMETER_VALUES = eINSTANCE.getRequirement_ParameterValues();

		/**
		 * The meta object literal for the '<em><b>Alm Authorizing Change Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_AUTHORIZING_CHANGE_ORDER = eINSTANCE.getRequirement_Alm_AuthorizingChangeOrder();

		/**
		 * The meta object literal for the '<em><b>Alm Suspect Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_SUSPECT_COUNT = eINSTANCE.getRequirement_Alm_SuspectCount();

		/**
		 * The meta object literal for the '<em><b>Alm Include Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_INCLUDE_REFERENCE = eINSTANCE.getRequirement_Alm_IncludeReference();

		/**
		 * The meta object literal for the '<em><b>Alm Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_PRIORITY = eINSTANCE.getRequirement_Alm_Priority();

		/**
		 * The meta object literal for the '<em><b>Alm Satisfied By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ALM_SATISFIED_BY = eINSTANCE.getRequirement_Alm_SatisfiedBy();

		/**
		 * The meta object literal for the '<em><b>Alm Validated By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ALM_VALIDATED_BY = eINSTANCE.getRequirement_Alm_ValidatedBy();

		/**
		 * The meta object literal for the '<em><b>Alm Spawns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ALM_SPAWNS = eINSTANCE.getRequirement_Alm_Spawns();

		/**
		 * The meta object literal for the '<em><b>Alm Decomposes To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ALM_DECOMPOSES_TO = eINSTANCE.getRequirement_Alm_DecomposesTo();

		/**
		 * The meta object literal for the '<em><b>Alm Is Related To</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ALM_IS_RELATED_TO = eINSTANCE.getRequirement_Alm_IsRelatedTo();

		/**
		 * The meta object literal for the '<em><b>Alm Include Subsegmentin Metrics</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_INCLUDE_SUBSEGMENTIN_METRICS = eINSTANCE.getRequirement_Alm_IncludeSubsegmentinMetrics();

		/**
		 * The meta object literal for the '<em><b>Alm Validated By Trace Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_VALIDATED_BY_TRACE_COUNT = eINSTANCE.getRequirement_Alm_ValidatedByTraceCount();

		/**
		 * The meta object literal for the '<em><b>Alm Trace Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_TRACE_STATUS = eINSTANCE.getRequirement_Alm_TraceStatus();

		/**
		 * The meta object literal for the '<em><b>Alm Downstream Trace Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_DOWNSTREAM_TRACE_COUNT = eINSTANCE.getRequirement_Alm_DownstreamTraceCount();

		/**
		 * The meta object literal for the '<em><b>Alm Upstream Trace Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_UPSTREAM_TRACE_COUNT = eINSTANCE.getRequirement_Alm_UpstreamTraceCount();

		/**
		 * The meta object literal for the '<em><b>Alm Validated By Pass Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_VALIDATED_BY_PASS_COUNT = eINSTANCE.getRequirement_Alm_ValidatedByPassCount();

		/**
		 * The meta object literal for the '<em><b>Alm Validated By Pass Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_VALIDATED_BY_PASS_PERCENTAGE = eINSTANCE.getRequirement_Alm_ValidatedByPassPercentage();

		/**
		 * The meta object literal for the '<em><b>Alm Category Int Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_CATEGORY_INT_VALUE = eINSTANCE.getRequirement_Alm_CategoryIntValue();

		/**
		 * The meta object literal for the '<em><b>Alm Modelled By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ALM_MODELLED_BY = eINSTANCE.getRequirement_Alm_ModelledBy();

		/**
		 * The meta object literal for the '<em><b>Alm Verified By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ALM_VERIFIED_BY = eINSTANCE.getRequirement_Alm_VerifiedBy();

		/**
		 * The meta object literal for the '<em><b>Alm Verified By Pass Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_VERIFIED_BY_PASS_COUNT = eINSTANCE.getRequirement_Alm_VerifiedByPassCount();

		/**
		 * The meta object literal for the '<em><b>Alm Verified By Trace Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_VERIFIED_BY_TRACE_COUNT = eINSTANCE.getRequirement_Alm_VerifiedByTraceCount();

		/**
		 * The meta object literal for the '<em><b>Alm Verified By Pass Percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_VERIFIED_BY_PASS_PERCENTAGE = eINSTANCE.getRequirement_Alm_VerifiedByPassPercentage();

		/**
		 * The meta object literal for the '<em><b>Alm Changes Authorized By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ALM_CHANGES_AUTHORIZED_BY = eINSTANCE.getRequirement_Alm_ChangesAuthorizedBy();

		/**
		 * The meta object literal for the '<em><b>Alm Decomposed From</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__ALM_DECOMPOSED_FROM = eINSTANCE.getRequirement_Alm_DecomposedFrom();

		/**
		 * The meta object literal for the '<em><b>Alm Valid Change Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_VALID_CHANGE_ORDER = eINSTANCE.getRequirement_Alm_ValidChangeOrder();

		/**
		 * The meta object literal for the '<em><b>Alm Validated By Trace Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_VALIDATED_BY_TRACE_HEALTH = eINSTANCE.getRequirement_Alm_ValidatedByTraceHealth();

		/**
		 * The meta object literal for the '<em><b>Alm Verified By Trace Health</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_VERIFIED_BY_TRACE_HEALTH = eINSTANCE.getRequirement_Alm_VerifiedByTraceHealth();

		/**
		 * The meta object literal for the '<em><b>Alm Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_TEXT = eINSTANCE.getRequirement_Alm_Text();

		/**
		 * The meta object literal for the '<em><b>Alm Project State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_PROJECT_STATE = eINSTANCE.getRequirement_Alm_ProjectState();

		/**
		 * The meta object literal for the '<em><b>Alm Project Phase FVA</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ALM_PROJECT_PHASE_FVA = eINSTANCE.getRequirement_Alm_ProjectPhaseFVA();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__TYPE = eINSTANCE.getRequirement_Type();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ID = eINSTANCE.getRequirement_ID();

		/**
		 * The meta object literal for the '<em><b>Modified By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__MODIFIED_BY = eINSTANCE.getRequirement_ModifiedBy();

		/**
		 * The meta object literal for the '<em><b>Created By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__CREATED_BY = eINSTANCE.getRequirement_CreatedBy();

		/**
		 * The meta object literal for the '<em><b>Modified Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__MODIFIED_DATE = eINSTANCE.getRequirement_ModifiedDate();

		/**
		 * The meta object literal for the '<em><b>Created Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__CREATED_DATE = eINSTANCE.getRequirement_CreatedDate();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__CATEGORY = eINSTANCE.getRequirement_Category();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REFERENCES = eINSTANCE.getRequirement_References();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__CONTAINS = eINSTANCE.getRequirement_Contains();

		/**
		 * The meta object literal for the '<em><b>Contained By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__CONTAINED_BY = eINSTANCE.getRequirement_ContainedBy();

		/**
		 * The meta object literal for the '<em><b>Reference Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REFERENCE_MODE = eINSTANCE.getRequirement_ReferenceMode();

		/**
		 * The meta object literal for the '<em><b>Document ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__DOCUMENT_ID = eINSTANCE.getRequirement_DocumentID();

		/**
		 * The meta object literal for the '<em><b>Referenced Item Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__REFERENCED_ITEM_TYPE = eINSTANCE.getRequirement_ReferencedItemType();

		/**
		 * The meta object literal for the '<em><b>Shares</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__SHARES = eINSTANCE.getRequirement_Shares();

		/**
		 * The meta object literal for the '<em><b>Shared By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__SHARED_BY = eINSTANCE.getRequirement_SharedBy();

		/**
		 * The meta object literal for the '<em><b>Root ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__ROOT_ID = eINSTANCE.getRequirement_RootID();

		/**
		 * The meta object literal for the '<em><b>Input Revision Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__INPUT_REVISION_DATE = eINSTANCE.getRequirement_InputRevisionDate();

		/**
		 * The meta object literal for the '<em><b>Significant Edit Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__SIGNIFICANT_EDIT_DATE = eINSTANCE.getRequirement_SignificantEditDate();

		/**
		 * The meta object literal for the '<em><b>Significant Change Since Item Revision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REQUIREMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION = eINSTANCE.getRequirement_SignificantChangeSinceItemRevision();

		/**
		 * The meta object literal for the '<em><b>Requirement Document</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIREMENT__REQUIREMENT_DOCUMENT = eINSTANCE.getRequirement_RequirementDocument();

		/**
		 * The meta object literal for the '{@link integrity.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see integrity.impl.ItemImpl
		 * @see integrity.impl.IntegrityPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ID = eINSTANCE.getItem_ID();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__FIELD = eINSTANCE.getItem_Field();

		/**
		 * The meta object literal for the '{@link integrity.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see integrity.impl.FieldImpl
		 * @see integrity.impl.IntegrityPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__VALUE = eINSTANCE.getField_Value();

		/**
		 * The meta object literal for the '{@link integrity.PriorityEnumeration <em>Priority Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see integrity.PriorityEnumeration
		 * @see integrity.impl.IntegrityPackageImpl#getPriorityEnumeration()
		 * @generated
		 */
		EEnum PRIORITY_ENUMERATION = eINSTANCE.getPriorityEnumeration();

		/**
		 * The meta object literal for the '{@link integrity.TraceStatusEnumeration <em>Trace Status Enumeration</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see integrity.TraceStatusEnumeration
		 * @see integrity.impl.IntegrityPackageImpl#getTraceStatusEnumeration()
		 * @generated
		 */
		EEnum TRACE_STATUS_ENUMERATION = eINSTANCE.getTraceStatusEnumeration();

	}

} //IntegrityPackage
