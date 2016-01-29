/**
 */
package integrity.impl;

import integrity.Field;
import integrity.IntegrityFactory;
import integrity.IntegrityPackage;
import integrity.Item;
import integrity.PriorityEnumeration;
import integrity.Project;
import integrity.Requirement;
import integrity.RequirementDocument;
import integrity.Server;
import integrity.TraceStatusEnumeration;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IntegrityPackageImpl extends EPackageImpl implements IntegrityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementDocumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorityEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum traceStatusEnumerationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see integrity.IntegrityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private IntegrityPackageImpl() {
		super(eNS_URI, IntegrityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link IntegrityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static IntegrityPackage init() {
		if (isInited) return (IntegrityPackage)EPackage.Registry.INSTANCE.getEPackage(IntegrityPackage.eNS_URI);

		// Obtain or create and register package
		IntegrityPackageImpl theIntegrityPackage = (IntegrityPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IntegrityPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IntegrityPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theIntegrityPackage.createPackageContents();

		// Initialize created meta-data
		theIntegrityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theIntegrityPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(IntegrityPackage.eNS_URI, theIntegrityPackage);
		return theIntegrityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServer() {
		return serverEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServer_Project() {
		return (EReference)serverEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_RequirementDocument() {
		return (EReference)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_Requirement() {
		return (EReference)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Summary() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_State() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_ID() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_ModifiedBy() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_CreatedBy() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_ModifiedDate() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_CreatedDate() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Name() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Type() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Alm_Description() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_SignificantEditDate() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Project() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_Alm_ProductManager() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementDocument() {
		return requirementDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementDocument_Summary() {
		return (EAttribute)requirementDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementDocument_State() {
		return (EAttribute)requirementDocumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementDocument_Project() {
		return (EReference)requirementDocumentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementDocument_Alm_SharedText() {
		return (EAttribute)requirementDocumentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementDocument_Alm_DocumentShortTitle() {
		return (EAttribute)requirementDocumentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementDocument_ID() {
		return (EAttribute)requirementDocumentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementDocument_ModifiedBy() {
		return (EAttribute)requirementDocumentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementDocument_CreatedBy() {
		return (EAttribute)requirementDocumentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementDocument_ModifiedDate() {
		return (EAttribute)requirementDocumentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementDocument_CreatedDate() {
		return (EAttribute)requirementDocumentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementDocument_Type() {
		return (EAttribute)requirementDocumentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementDocument_SignificantEditDate() {
		return (EAttribute)requirementDocumentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementDocument_SignificantChangeSinceItemRevision() {
		return (EAttribute)requirementDocumentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementDocument_Alm_Documents() {
		return (EReference)requirementDocumentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementDocument_Contains() {
		return (EReference)requirementDocumentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementDocument_ReferencedBy() {
		return (EReference)requirementDocumentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementDocument_Alm_ChangesAuthorizedBy() {
		return (EReference)requirementDocumentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementDocument_Alm_Spawns() {
		return (EReference)requirementDocumentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementDocument_Alm_SharedAttachments() {
		return (EReference)requirementDocumentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementDocument_Requirement() {
		return (EReference)requirementDocumentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_State() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Project() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Attachments() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_ParameterValues() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_AuthorizingChangeOrder() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_SuspectCount() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_IncludeReference() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_Priority() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Alm_SatisfiedBy() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Alm_ValidatedBy() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Alm_Spawns() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Alm_DecomposesTo() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Alm_IsRelatedTo() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_IncludeSubsegmentinMetrics() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_ValidatedByTraceCount() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_TraceStatus() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_DownstreamTraceCount() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_UpstreamTraceCount() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_ValidatedByPassCount() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_ValidatedByPassPercentage() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_CategoryIntValue() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Alm_ModelledBy() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Alm_VerifiedBy() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_VerifiedByPassCount() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_VerifiedByTraceCount() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_VerifiedByPassPercentage() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Alm_ChangesAuthorizedBy() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Alm_DecomposedFrom() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_ValidChangeOrder() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_ValidatedByTraceHealth() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_VerifiedByTraceHealth() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_Text() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_ProjectState() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Alm_ProjectPhaseFVA() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Type() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_ID() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_ModifiedBy() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_CreatedBy() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_ModifiedDate() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_CreatedDate() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_Category() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_References() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Contains() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_ContainedBy() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_ReferenceMode() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_DocumentID() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_ReferencedItemType() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_Shares() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_SharedBy() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_RootID() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_InputRevisionDate() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_SignificantEditDate() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirement_SignificantChangeSinceItemRevision() {
		return (EAttribute)requirementEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_RequirementDocument() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItem_ID() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItem_Field() {
		return (EReference)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Name() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Value() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorityEnumeration() {
		return priorityEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTraceStatusEnumeration() {
		return traceStatusEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegrityFactory getIntegrityFactory() {
		return (IntegrityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		serverEClass = createEClass(SERVER);
		createEReference(serverEClass, SERVER__PROJECT);

		projectEClass = createEClass(PROJECT);
		createEReference(projectEClass, PROJECT__REQUIREMENT_DOCUMENT);
		createEReference(projectEClass, PROJECT__REQUIREMENT);
		createEAttribute(projectEClass, PROJECT__SUMMARY);
		createEAttribute(projectEClass, PROJECT__STATE);
		createEAttribute(projectEClass, PROJECT__ID);
		createEAttribute(projectEClass, PROJECT__MODIFIED_BY);
		createEAttribute(projectEClass, PROJECT__CREATED_BY);
		createEAttribute(projectEClass, PROJECT__MODIFIED_DATE);
		createEAttribute(projectEClass, PROJECT__CREATED_DATE);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEAttribute(projectEClass, PROJECT__TYPE);
		createEAttribute(projectEClass, PROJECT__ALM_DESCRIPTION);
		createEAttribute(projectEClass, PROJECT__SIGNIFICANT_EDIT_DATE);
		createEAttribute(projectEClass, PROJECT__PROJECT);
		createEAttribute(projectEClass, PROJECT__ALM_PRODUCT_MANAGER);

		requirementDocumentEClass = createEClass(REQUIREMENT_DOCUMENT);
		createEAttribute(requirementDocumentEClass, REQUIREMENT_DOCUMENT__SUMMARY);
		createEAttribute(requirementDocumentEClass, REQUIREMENT_DOCUMENT__STATE);
		createEReference(requirementDocumentEClass, REQUIREMENT_DOCUMENT__PROJECT);
		createEAttribute(requirementDocumentEClass, REQUIREMENT_DOCUMENT__ALM_SHARED_TEXT);
		createEAttribute(requirementDocumentEClass, REQUIREMENT_DOCUMENT__ALM_DOCUMENT_SHORT_TITLE);
		createEAttribute(requirementDocumentEClass, REQUIREMENT_DOCUMENT__ID);
		createEAttribute(requirementDocumentEClass, REQUIREMENT_DOCUMENT__MODIFIED_BY);
		createEAttribute(requirementDocumentEClass, REQUIREMENT_DOCUMENT__CREATED_BY);
		createEAttribute(requirementDocumentEClass, REQUIREMENT_DOCUMENT__MODIFIED_DATE);
		createEAttribute(requirementDocumentEClass, REQUIREMENT_DOCUMENT__CREATED_DATE);
		createEAttribute(requirementDocumentEClass, REQUIREMENT_DOCUMENT__TYPE);
		createEAttribute(requirementDocumentEClass, REQUIREMENT_DOCUMENT__SIGNIFICANT_EDIT_DATE);
		createEAttribute(requirementDocumentEClass, REQUIREMENT_DOCUMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION);
		createEReference(requirementDocumentEClass, REQUIREMENT_DOCUMENT__ALM_DOCUMENTS);
		createEReference(requirementDocumentEClass, REQUIREMENT_DOCUMENT__CONTAINS);
		createEReference(requirementDocumentEClass, REQUIREMENT_DOCUMENT__REFERENCED_BY);
		createEReference(requirementDocumentEClass, REQUIREMENT_DOCUMENT__ALM_CHANGES_AUTHORIZED_BY);
		createEReference(requirementDocumentEClass, REQUIREMENT_DOCUMENT__ALM_SPAWNS);
		createEReference(requirementDocumentEClass, REQUIREMENT_DOCUMENT__ALM_SHARED_ATTACHMENTS);
		createEReference(requirementDocumentEClass, REQUIREMENT_DOCUMENT__REQUIREMENT);

		requirementEClass = createEClass(REQUIREMENT);
		createEAttribute(requirementEClass, REQUIREMENT__STATE);
		createEReference(requirementEClass, REQUIREMENT__PROJECT);
		createEReference(requirementEClass, REQUIREMENT__ATTACHMENTS);
		createEAttribute(requirementEClass, REQUIREMENT__PARAMETER_VALUES);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_AUTHORIZING_CHANGE_ORDER);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_SUSPECT_COUNT);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_INCLUDE_REFERENCE);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_PRIORITY);
		createEReference(requirementEClass, REQUIREMENT__ALM_SATISFIED_BY);
		createEReference(requirementEClass, REQUIREMENT__ALM_VALIDATED_BY);
		createEReference(requirementEClass, REQUIREMENT__ALM_SPAWNS);
		createEReference(requirementEClass, REQUIREMENT__ALM_DECOMPOSES_TO);
		createEReference(requirementEClass, REQUIREMENT__ALM_IS_RELATED_TO);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_INCLUDE_SUBSEGMENTIN_METRICS);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_VALIDATED_BY_TRACE_COUNT);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_TRACE_STATUS);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_DOWNSTREAM_TRACE_COUNT);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_UPSTREAM_TRACE_COUNT);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_VALIDATED_BY_PASS_COUNT);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_VALIDATED_BY_PASS_PERCENTAGE);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_CATEGORY_INT_VALUE);
		createEReference(requirementEClass, REQUIREMENT__ALM_MODELLED_BY);
		createEReference(requirementEClass, REQUIREMENT__ALM_VERIFIED_BY);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_VERIFIED_BY_PASS_COUNT);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_VERIFIED_BY_TRACE_COUNT);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_VERIFIED_BY_PASS_PERCENTAGE);
		createEReference(requirementEClass, REQUIREMENT__ALM_CHANGES_AUTHORIZED_BY);
		createEReference(requirementEClass, REQUIREMENT__ALM_DECOMPOSED_FROM);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_VALID_CHANGE_ORDER);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_VALIDATED_BY_TRACE_HEALTH);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_VERIFIED_BY_TRACE_HEALTH);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_TEXT);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_PROJECT_STATE);
		createEAttribute(requirementEClass, REQUIREMENT__ALM_PROJECT_PHASE_FVA);
		createEAttribute(requirementEClass, REQUIREMENT__TYPE);
		createEAttribute(requirementEClass, REQUIREMENT__ID);
		createEAttribute(requirementEClass, REQUIREMENT__MODIFIED_BY);
		createEAttribute(requirementEClass, REQUIREMENT__CREATED_BY);
		createEAttribute(requirementEClass, REQUIREMENT__MODIFIED_DATE);
		createEAttribute(requirementEClass, REQUIREMENT__CREATED_DATE);
		createEAttribute(requirementEClass, REQUIREMENT__CATEGORY);
		createEReference(requirementEClass, REQUIREMENT__REFERENCES);
		createEReference(requirementEClass, REQUIREMENT__CONTAINS);
		createEReference(requirementEClass, REQUIREMENT__CONTAINED_BY);
		createEAttribute(requirementEClass, REQUIREMENT__REFERENCE_MODE);
		createEAttribute(requirementEClass, REQUIREMENT__DOCUMENT_ID);
		createEAttribute(requirementEClass, REQUIREMENT__REFERENCED_ITEM_TYPE);
		createEReference(requirementEClass, REQUIREMENT__SHARES);
		createEReference(requirementEClass, REQUIREMENT__SHARED_BY);
		createEAttribute(requirementEClass, REQUIREMENT__ROOT_ID);
		createEAttribute(requirementEClass, REQUIREMENT__INPUT_REVISION_DATE);
		createEAttribute(requirementEClass, REQUIREMENT__SIGNIFICANT_EDIT_DATE);
		createEAttribute(requirementEClass, REQUIREMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION);
		createEReference(requirementEClass, REQUIREMENT__REQUIREMENT_DOCUMENT);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__ID);
		createEReference(itemEClass, ITEM__FIELD);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__NAME);
		createEAttribute(fieldEClass, FIELD__VALUE);

		// Create enums
		priorityEnumerationEEnum = createEEnum(PRIORITY_ENUMERATION);
		traceStatusEnumerationEEnum = createEEnum(TRACE_STATUS_ENUMERATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(serverEClass, Server.class, "Server", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServer_Project(), this.getProject(), null, "project", null, 0, -1, Server.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProject_RequirementDocument(), this.getRequirementDocument(), null, "requirementDocument", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Requirement(), this.getRequirement(), null, "requirement", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Summary(), ecorePackage.getEString(), "summary", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_State(), ecorePackage.getEString(), "state", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ID(), ecorePackage.getEString(), "ID", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ModifiedBy(), ecorePackage.getEString(), "modifiedBy", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_CreatedBy(), ecorePackage.getEString(), "createdBy", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ModifiedDate(), ecorePackage.getEString(), "modifiedDate", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_CreatedDate(), ecorePackage.getEString(), "createdDate", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Type(), ecorePackage.getEString(), "type", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Alm_Description(), ecorePackage.getEString(), "alm_Description", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_SignificantEditDate(), ecorePackage.getEString(), "significantEditDate", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Project(), ecorePackage.getEString(), "project", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Alm_ProductManager(), ecorePackage.getEString(), "alm_ProductManager", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementDocumentEClass, RequirementDocument.class, "RequirementDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementDocument_Summary(), ecorePackage.getEString(), "summary", null, 1, 1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementDocument_State(), ecorePackage.getEString(), "state", null, 0, 1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementDocument_Project(), this.getProject(), null, "project", null, 0, 1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementDocument_Alm_SharedText(), ecorePackage.getEString(), "alm_SharedText", null, 0, 1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementDocument_Alm_DocumentShortTitle(), ecorePackage.getEString(), "alm_DocumentShortTitle", null, 0, 1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementDocument_ID(), ecorePackage.getEString(), "ID", null, 1, 1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementDocument_ModifiedBy(), ecorePackage.getEString(), "modifiedBy", null, 1, 1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementDocument_CreatedBy(), ecorePackage.getEString(), "createdBy", null, 1, 1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementDocument_ModifiedDate(), ecorePackage.getEString(), "modifiedDate", null, 1, 1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementDocument_CreatedDate(), ecorePackage.getEString(), "createdDate", null, 1, 1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementDocument_Type(), ecorePackage.getEString(), "type", null, 0, 1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementDocument_SignificantEditDate(), ecorePackage.getEString(), "significantEditDate", null, 0, 1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementDocument_SignificantChangeSinceItemRevision(), ecorePackage.getEBoolean(), "significantChangeSinceItemRevision", null, 0, 1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementDocument_Alm_Documents(), this.getItem(), null, "alm_Documents", null, 0, -1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementDocument_Contains(), this.getItem(), null, "contains", null, 0, -1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementDocument_ReferencedBy(), this.getItem(), null, "referencedBy", null, 0, -1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementDocument_Alm_ChangesAuthorizedBy(), this.getItem(), null, "alm_ChangesAuthorizedBy", null, 0, -1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementDocument_Alm_Spawns(), this.getItem(), null, "alm_Spawns", null, 0, -1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementDocument_Alm_SharedAttachments(), this.getItem(), null, "alm_SharedAttachments", null, 0, -1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementDocument_Requirement(), this.getRequirement(), null, "requirement", null, 0, -1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirement_State(), ecorePackage.getEString(), "state", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Project(), this.getProject(), null, "project", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Attachments(), this.getItem(), null, "attachments", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_ParameterValues(), ecorePackage.getEString(), "parameterValues", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_AuthorizingChangeOrder(), ecorePackage.getEInt(), "alm_AuthorizingChangeOrder", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_SuspectCount(), ecorePackage.getEInt(), "alm_SuspectCount", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_IncludeReference(), ecorePackage.getEBoolean(), "alm_IncludeReference", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_Priority(), ecorePackage.getEString(), "alm_Priority", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Alm_SatisfiedBy(), this.getItem(), null, "alm_SatisfiedBy", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Alm_ValidatedBy(), this.getItem(), null, "alm_ValidatedBy", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Alm_Spawns(), this.getItem(), null, "alm_Spawns", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Alm_DecomposesTo(), this.getItem(), null, "alm_DecomposesTo", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Alm_IsRelatedTo(), this.getItem(), null, "alm_IsRelatedTo", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_IncludeSubsegmentinMetrics(), ecorePackage.getEBoolean(), "alm_IncludeSubsegmentinMetrics", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_ValidatedByTraceCount(), ecorePackage.getEInt(), "alm_ValidatedByTraceCount", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_TraceStatus(), ecorePackage.getEString(), "alm_TraceStatus", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_DownstreamTraceCount(), ecorePackage.getEInt(), "alm_DownstreamTraceCount", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_UpstreamTraceCount(), ecorePackage.getEInt(), "alm_UpstreamTraceCount", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_ValidatedByPassCount(), ecorePackage.getEInt(), "alm_ValidatedByPassCount", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_ValidatedByPassPercentage(), ecorePackage.getEFloat(), "alm_ValidatedByPassPercentage", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_CategoryIntValue(), ecorePackage.getEString(), "alm_CategoryIntValue", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Alm_ModelledBy(), this.getItem(), null, "alm_ModelledBy", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Alm_VerifiedBy(), this.getItem(), null, "alm_VerifiedBy", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_VerifiedByPassCount(), ecorePackage.getEInt(), "alm_VerifiedByPassCount", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_VerifiedByTraceCount(), ecorePackage.getEInt(), "alm_VerifiedByTraceCount", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_VerifiedByPassPercentage(), ecorePackage.getEFloat(), "alm_VerifiedByPassPercentage", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Alm_ChangesAuthorizedBy(), this.getItem(), null, "alm_ChangesAuthorizedBy", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Alm_DecomposedFrom(), this.getItem(), null, "alm_DecomposedFrom", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_ValidChangeOrder(), ecorePackage.getEBoolean(), "alm_ValidChangeOrder", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_ValidatedByTraceHealth(), ecorePackage.getEString(), "alm_ValidatedByTraceHealth", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_VerifiedByTraceHealth(), ecorePackage.getEString(), "alm_VerifiedByTraceHealth", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_Text(), ecorePackage.getEString(), "alm_Text", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_ProjectState(), ecorePackage.getEString(), "alm_ProjectState", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Alm_ProjectPhaseFVA(), ecorePackage.getEString(), "alm_ProjectPhaseFVA", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Type(), ecorePackage.getEString(), "type", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_ID(), ecorePackage.getEInt(), "ID", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_ModifiedBy(), ecorePackage.getEString(), "modifiedBy", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_CreatedBy(), ecorePackage.getEString(), "createdBy", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_ModifiedDate(), ecorePackage.getEString(), "modifiedDate", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_CreatedDate(), ecorePackage.getEString(), "createdDate", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_Category(), ecorePackage.getEString(), "category", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_References(), this.getItem(), null, "references", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Contains(), this.getItem(), null, "contains", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_ContainedBy(), this.getItem(), null, "containedBy", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_ReferenceMode(), ecorePackage.getEString(), "referenceMode", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_DocumentID(), ecorePackage.getEInt(), "documentID", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_ReferencedItemType(), ecorePackage.getEString(), "referencedItemType", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_Shares(), this.getItem(), null, "shares", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_SharedBy(), this.getItem(), null, "sharedBy", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_RootID(), ecorePackage.getEInt(), "rootID", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_InputRevisionDate(), ecorePackage.getEString(), "inputRevisionDate", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_SignificantEditDate(), ecorePackage.getEString(), "significantEditDate", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirement_SignificantChangeSinceItemRevision(), ecorePackage.getEBoolean(), "significantChangeSinceItemRevision", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_RequirementDocument(), this.getRequirementDocument(), null, "requirementDocument", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_ID(), ecorePackage.getEString(), "ID", null, 1, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Field(), this.getField(), null, "field", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Name(), ecorePackage.getEString(), "name", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getField_Value(), ecorePackage.getEString(), "value", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(priorityEnumerationEEnum, PriorityEnumeration.class, "PriorityEnumeration");
		addEEnumLiteral(priorityEnumerationEEnum, PriorityEnumeration.LOW);
		addEEnumLiteral(priorityEnumerationEEnum, PriorityEnumeration.MEDIUM);
		addEEnumLiteral(priorityEnumerationEEnum, PriorityEnumeration.HIGH);
		addEEnumLiteral(priorityEnumerationEEnum, PriorityEnumeration.CRITICAL);

		initEEnum(traceStatusEnumerationEEnum, TraceStatusEnumeration.class, "TraceStatusEnumeration");
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.NONE);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.DOWNSTREAM);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.DOWNSTREAM_RELATED);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.DOWNSTREAM_SUSPECT);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.DOWNSTREAM_SUSPECT_RELATED);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.UPSTREAM);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.UPSTREAM_DOWNSTREAM);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.UPSTREAM_DOWNSTREAM_RELATED);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.UPSTREAM_DOWNSTREAM_SUSPECT);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.UPSTREAM_DOWNSTREAM_SUSPECT_RELATED);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.UPSTREAM_RELATED);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.UPSTREAM_SUSPECT);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.UPSTREAM_SUSPECT_DOWNSTREAM);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.UPSTREAM_SUSPECT_DOWNSTREAM_RELATED);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.UPSTREAM_SUSPECT_DOWNSTREAM_SUSPECT_RELATED);
		addEEnumLiteral(traceStatusEnumerationEEnum, TraceStatusEnumeration.UPSTREAM_SUSPECT_RELATED);

		// Create resource
		createResource(eNS_URI);
	}

} //IntegrityPackageImpl
