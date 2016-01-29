/**
 */
package integrity.impl;

import integrity.IntegrityPackage;
import integrity.Item;
import integrity.Project;
import integrity.Requirement;
import integrity.RequirementDocument;
import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link integrity.impl.RequirementImpl#getState <em>State</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getProject <em>Project</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_AuthorizingChangeOrder <em>Alm Authorizing Change Order</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_SuspectCount <em>Alm Suspect Count</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#isAlm_IncludeReference <em>Alm Include Reference</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_Priority <em>Alm Priority</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_SatisfiedBy <em>Alm Satisfied By</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_ValidatedBy <em>Alm Validated By</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_Spawns <em>Alm Spawns</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_DecomposesTo <em>Alm Decomposes To</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_IsRelatedTo <em>Alm Is Related To</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#isAlm_IncludeSubsegmentinMetrics <em>Alm Include Subsegmentin Metrics</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_ValidatedByTraceCount <em>Alm Validated By Trace Count</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_TraceStatus <em>Alm Trace Status</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_DownstreamTraceCount <em>Alm Downstream Trace Count</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_UpstreamTraceCount <em>Alm Upstream Trace Count</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_ValidatedByPassCount <em>Alm Validated By Pass Count</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_ValidatedByPassPercentage <em>Alm Validated By Pass Percentage</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_CategoryIntValue <em>Alm Category Int Value</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_ModelledBy <em>Alm Modelled By</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_VerifiedBy <em>Alm Verified By</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_VerifiedByPassCount <em>Alm Verified By Pass Count</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_VerifiedByTraceCount <em>Alm Verified By Trace Count</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_VerifiedByPassPercentage <em>Alm Verified By Pass Percentage</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_ChangesAuthorizedBy <em>Alm Changes Authorized By</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_DecomposedFrom <em>Alm Decomposed From</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#isAlm_ValidChangeOrder <em>Alm Valid Change Order</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_ValidatedByTraceHealth <em>Alm Validated By Trace Health</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_VerifiedByTraceHealth <em>Alm Verified By Trace Health</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_Text <em>Alm Text</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_ProjectState <em>Alm Project State</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getAlm_ProjectPhaseFVA <em>Alm Project Phase FVA</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getType <em>Type</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getID <em>ID</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getModifiedBy <em>Modified By</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getModifiedDate <em>Modified Date</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getReferences <em>References</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getContainedBy <em>Contained By</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getReferenceMode <em>Reference Mode</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getDocumentID <em>Document ID</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getReferencedItemType <em>Referenced Item Type</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getShares <em>Shares</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getSharedBy <em>Shared By</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getRootID <em>Root ID</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getInputRevisionDate <em>Input Revision Date</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getSignificantEditDate <em>Significant Edit Date</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#isSignificantChangeSinceItemRevision <em>Significant Change Since Item Revision</em>}</li>
 *   <li>{@link integrity.impl.RequirementImpl#getRequirementDocument <em>Requirement Document</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement {
	/**
	 * The default value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected static final String STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getState() <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getState()
	 * @generated
	 * @ordered
	 */
	protected String state = STATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;

	/**
	 * The cached value of the '{@link #getAttachments() <em>Attachments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttachments()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> attachments;

	/**
	 * The default value of the '{@link #getParameterValues() <em>Parameter Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValues()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAMETER_VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParameterValues() <em>Parameter Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterValues()
	 * @generated
	 * @ordered
	 */
	protected String parameterValues = PARAMETER_VALUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_AuthorizingChangeOrder() <em>Alm Authorizing Change Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_AuthorizingChangeOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int ALM_AUTHORIZING_CHANGE_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAlm_AuthorizingChangeOrder() <em>Alm Authorizing Change Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_AuthorizingChangeOrder()
	 * @generated
	 * @ordered
	 */
	protected int alm_AuthorizingChangeOrder = ALM_AUTHORIZING_CHANGE_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_SuspectCount() <em>Alm Suspect Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_SuspectCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ALM_SUSPECT_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAlm_SuspectCount() <em>Alm Suspect Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_SuspectCount()
	 * @generated
	 * @ordered
	 */
	protected int alm_SuspectCount = ALM_SUSPECT_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAlm_IncludeReference() <em>Alm Include Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlm_IncludeReference()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALM_INCLUDE_REFERENCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAlm_IncludeReference() <em>Alm Include Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlm_IncludeReference()
	 * @generated
	 * @ordered
	 */
	protected boolean alm_IncludeReference = ALM_INCLUDE_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_Priority() <em>Alm Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_Priority()
	 * @generated
	 * @ordered
	 */
	protected static final String ALM_PRIORITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlm_Priority() <em>Alm Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_Priority()
	 * @generated
	 * @ordered
	 */
	protected String alm_Priority = ALM_PRIORITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlm_SatisfiedBy() <em>Alm Satisfied By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_SatisfiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> alm_SatisfiedBy;

	/**
	 * The cached value of the '{@link #getAlm_ValidatedBy() <em>Alm Validated By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ValidatedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> alm_ValidatedBy;

	/**
	 * The cached value of the '{@link #getAlm_Spawns() <em>Alm Spawns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_Spawns()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> alm_Spawns;

	/**
	 * The cached value of the '{@link #getAlm_DecomposesTo() <em>Alm Decomposes To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_DecomposesTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> alm_DecomposesTo;

	/**
	 * The cached value of the '{@link #getAlm_IsRelatedTo() <em>Alm Is Related To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_IsRelatedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> alm_IsRelatedTo;

	/**
	 * The default value of the '{@link #isAlm_IncludeSubsegmentinMetrics() <em>Alm Include Subsegmentin Metrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlm_IncludeSubsegmentinMetrics()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALM_INCLUDE_SUBSEGMENTIN_METRICS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAlm_IncludeSubsegmentinMetrics() <em>Alm Include Subsegmentin Metrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlm_IncludeSubsegmentinMetrics()
	 * @generated
	 * @ordered
	 */
	protected boolean alm_IncludeSubsegmentinMetrics = ALM_INCLUDE_SUBSEGMENTIN_METRICS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_ValidatedByTraceCount() <em>Alm Validated By Trace Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ValidatedByTraceCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ALM_VALIDATED_BY_TRACE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAlm_ValidatedByTraceCount() <em>Alm Validated By Trace Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ValidatedByTraceCount()
	 * @generated
	 * @ordered
	 */
	protected int alm_ValidatedByTraceCount = ALM_VALIDATED_BY_TRACE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_TraceStatus() <em>Alm Trace Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_TraceStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String ALM_TRACE_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlm_TraceStatus() <em>Alm Trace Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_TraceStatus()
	 * @generated
	 * @ordered
	 */
	protected String alm_TraceStatus = ALM_TRACE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_DownstreamTraceCount() <em>Alm Downstream Trace Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_DownstreamTraceCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ALM_DOWNSTREAM_TRACE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAlm_DownstreamTraceCount() <em>Alm Downstream Trace Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_DownstreamTraceCount()
	 * @generated
	 * @ordered
	 */
	protected int alm_DownstreamTraceCount = ALM_DOWNSTREAM_TRACE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_UpstreamTraceCount() <em>Alm Upstream Trace Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_UpstreamTraceCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ALM_UPSTREAM_TRACE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAlm_UpstreamTraceCount() <em>Alm Upstream Trace Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_UpstreamTraceCount()
	 * @generated
	 * @ordered
	 */
	protected int alm_UpstreamTraceCount = ALM_UPSTREAM_TRACE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_ValidatedByPassCount() <em>Alm Validated By Pass Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ValidatedByPassCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ALM_VALIDATED_BY_PASS_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAlm_ValidatedByPassCount() <em>Alm Validated By Pass Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ValidatedByPassCount()
	 * @generated
	 * @ordered
	 */
	protected int alm_ValidatedByPassCount = ALM_VALIDATED_BY_PASS_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_ValidatedByPassPercentage() <em>Alm Validated By Pass Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ValidatedByPassPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final float ALM_VALIDATED_BY_PASS_PERCENTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAlm_ValidatedByPassPercentage() <em>Alm Validated By Pass Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ValidatedByPassPercentage()
	 * @generated
	 * @ordered
	 */
	protected float alm_ValidatedByPassPercentage = ALM_VALIDATED_BY_PASS_PERCENTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_CategoryIntValue() <em>Alm Category Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_CategoryIntValue()
	 * @generated
	 * @ordered
	 */
	protected static final String ALM_CATEGORY_INT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlm_CategoryIntValue() <em>Alm Category Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_CategoryIntValue()
	 * @generated
	 * @ordered
	 */
	protected String alm_CategoryIntValue = ALM_CATEGORY_INT_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlm_ModelledBy() <em>Alm Modelled By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ModelledBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> alm_ModelledBy;

	/**
	 * The cached value of the '{@link #getAlm_VerifiedBy() <em>Alm Verified By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_VerifiedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> alm_VerifiedBy;

	/**
	 * The default value of the '{@link #getAlm_VerifiedByPassCount() <em>Alm Verified By Pass Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_VerifiedByPassCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ALM_VERIFIED_BY_PASS_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAlm_VerifiedByPassCount() <em>Alm Verified By Pass Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_VerifiedByPassCount()
	 * @generated
	 * @ordered
	 */
	protected int alm_VerifiedByPassCount = ALM_VERIFIED_BY_PASS_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_VerifiedByTraceCount() <em>Alm Verified By Trace Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_VerifiedByTraceCount()
	 * @generated
	 * @ordered
	 */
	protected static final int ALM_VERIFIED_BY_TRACE_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAlm_VerifiedByTraceCount() <em>Alm Verified By Trace Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_VerifiedByTraceCount()
	 * @generated
	 * @ordered
	 */
	protected int alm_VerifiedByTraceCount = ALM_VERIFIED_BY_TRACE_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_VerifiedByPassPercentage() <em>Alm Verified By Pass Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_VerifiedByPassPercentage()
	 * @generated
	 * @ordered
	 */
	protected static final float ALM_VERIFIED_BY_PASS_PERCENTAGE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getAlm_VerifiedByPassPercentage() <em>Alm Verified By Pass Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_VerifiedByPassPercentage()
	 * @generated
	 * @ordered
	 */
	protected float alm_VerifiedByPassPercentage = ALM_VERIFIED_BY_PASS_PERCENTAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAlm_ChangesAuthorizedBy() <em>Alm Changes Authorized By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ChangesAuthorizedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> alm_ChangesAuthorizedBy;

	/**
	 * The cached value of the '{@link #getAlm_DecomposedFrom() <em>Alm Decomposed From</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_DecomposedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> alm_DecomposedFrom;

	/**
	 * The default value of the '{@link #isAlm_ValidChangeOrder() <em>Alm Valid Change Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlm_ValidChangeOrder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALM_VALID_CHANGE_ORDER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAlm_ValidChangeOrder() <em>Alm Valid Change Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAlm_ValidChangeOrder()
	 * @generated
	 * @ordered
	 */
	protected boolean alm_ValidChangeOrder = ALM_VALID_CHANGE_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_ValidatedByTraceHealth() <em>Alm Validated By Trace Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ValidatedByTraceHealth()
	 * @generated
	 * @ordered
	 */
	protected static final String ALM_VALIDATED_BY_TRACE_HEALTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlm_ValidatedByTraceHealth() <em>Alm Validated By Trace Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ValidatedByTraceHealth()
	 * @generated
	 * @ordered
	 */
	protected String alm_ValidatedByTraceHealth = ALM_VALIDATED_BY_TRACE_HEALTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_VerifiedByTraceHealth() <em>Alm Verified By Trace Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_VerifiedByTraceHealth()
	 * @generated
	 * @ordered
	 */
	protected static final String ALM_VERIFIED_BY_TRACE_HEALTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlm_VerifiedByTraceHealth() <em>Alm Verified By Trace Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_VerifiedByTraceHealth()
	 * @generated
	 * @ordered
	 */
	protected String alm_VerifiedByTraceHealth = ALM_VERIFIED_BY_TRACE_HEALTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_Text() <em>Alm Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_Text()
	 * @generated
	 * @ordered
	 */
	protected static final String ALM_TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlm_Text() <em>Alm Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_Text()
	 * @generated
	 * @ordered
	 */
	protected String alm_Text = ALM_TEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_ProjectState() <em>Alm Project State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ProjectState()
	 * @generated
	 * @ordered
	 */
	protected static final String ALM_PROJECT_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlm_ProjectState() <em>Alm Project State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ProjectState()
	 * @generated
	 * @ordered
	 */
	protected String alm_ProjectState = ALM_PROJECT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_ProjectPhaseFVA() <em>Alm Project Phase FVA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ProjectPhaseFVA()
	 * @generated
	 * @ordered
	 */
	protected static final String ALM_PROJECT_PHASE_FVA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlm_ProjectPhaseFVA() <em>Alm Project Phase FVA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ProjectPhaseFVA()
	 * @generated
	 * @ordered
	 */
	protected String alm_ProjectPhaseFVA = ALM_PROJECT_PHASE_FVA_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifiedBy() <em>Modified By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedBy() <em>Modified By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedBy()
	 * @generated
	 * @ordered
	 */
	protected String modifiedBy = MODIFIED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_BY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedBy() <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedBy()
	 * @generated
	 * @ordered
	 */
	protected String createdBy = CREATED_BY_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifiedDate() <em>Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifiedDate() <em>Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiedDate()
	 * @generated
	 * @ordered
	 */
	protected String modifiedDate = MODIFIED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected static final String CREATED_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCreatedDate() <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreatedDate()
	 * @generated
	 * @ordered
	 */
	protected String createdDate = CREATED_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected static final String CATEGORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected String category = CATEGORY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getReferences() <em>References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> references;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> contains;

	/**
	 * The cached value of the '{@link #getContainedBy() <em>Contained By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> containedBy;

	/**
	 * The default value of the '{@link #getReferenceMode() <em>Reference Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceMode()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferenceMode() <em>Reference Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceMode()
	 * @generated
	 * @ordered
	 */
	protected String referenceMode = REFERENCE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentID() <em>Document ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentID()
	 * @generated
	 * @ordered
	 */
	protected static final int DOCUMENT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDocumentID() <em>Document ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentID()
	 * @generated
	 * @ordered
	 */
	protected int documentID = DOCUMENT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getReferencedItemType() <em>Referenced Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedItemType()
	 * @generated
	 * @ordered
	 */
	protected static final String REFERENCED_ITEM_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReferencedItemType() <em>Referenced Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedItemType()
	 * @generated
	 * @ordered
	 */
	protected String referencedItemType = REFERENCED_ITEM_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getShares() <em>Shares</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShares()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> shares;

	/**
	 * The cached value of the '{@link #getSharedBy() <em>Shared By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> sharedBy;

	/**
	 * The default value of the '{@link #getRootID() <em>Root ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootID()
	 * @generated
	 * @ordered
	 */
	protected static final int ROOT_ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRootID() <em>Root ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRootID()
	 * @generated
	 * @ordered
	 */
	protected int rootID = ROOT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputRevisionDate() <em>Input Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_REVISION_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputRevisionDate() <em>Input Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputRevisionDate()
	 * @generated
	 * @ordered
	 */
	protected String inputRevisionDate = INPUT_REVISION_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSignificantEditDate() <em>Significant Edit Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignificantEditDate()
	 * @generated
	 * @ordered
	 */
	protected static final String SIGNIFICANT_EDIT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSignificantEditDate() <em>Significant Edit Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSignificantEditDate()
	 * @generated
	 * @ordered
	 */
	protected String significantEditDate = SIGNIFICANT_EDIT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isSignificantChangeSinceItemRevision() <em>Significant Change Since Item Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignificantChangeSinceItemRevision()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSignificantChangeSinceItemRevision() <em>Significant Change Since Item Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSignificantChangeSinceItemRevision()
	 * @generated
	 * @ordered
	 */
	protected boolean significantChangeSinceItemRevision = SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequirementDocument() <em>Requirement Document</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementDocument()
	 * @generated
	 * @ordered
	 */
	protected EList<RequirementDocument> requirementDocument;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntegrityPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getState() {
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(String newState) {
		String oldState = state;
		state = newState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Project getProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProject(Project newProject, NotificationChain msgs) {
		Project oldProject = project;
		project = newProject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__PROJECT, oldProject, newProject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(Project newProject) {
		if (newProject != project) {
			NotificationChain msgs = null;
			if (project != null)
				msgs = ((InternalEObject)project).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntegrityPackage.REQUIREMENT__PROJECT, null, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntegrityPackage.REQUIREMENT__PROJECT, null, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getAttachments() {
		if (attachments == null) {
			attachments = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT__ATTACHMENTS);
		}
		return attachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParameterValues() {
		return parameterValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterValues(String newParameterValues) {
		String oldParameterValues = parameterValues;
		parameterValues = newParameterValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__PARAMETER_VALUES, oldParameterValues, parameterValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlm_AuthorizingChangeOrder() {
		return alm_AuthorizingChangeOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_AuthorizingChangeOrder(int newAlm_AuthorizingChangeOrder) {
		int oldAlm_AuthorizingChangeOrder = alm_AuthorizingChangeOrder;
		alm_AuthorizingChangeOrder = newAlm_AuthorizingChangeOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_AUTHORIZING_CHANGE_ORDER, oldAlm_AuthorizingChangeOrder, alm_AuthorizingChangeOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlm_SuspectCount() {
		return alm_SuspectCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_SuspectCount(int newAlm_SuspectCount) {
		int oldAlm_SuspectCount = alm_SuspectCount;
		alm_SuspectCount = newAlm_SuspectCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_SUSPECT_COUNT, oldAlm_SuspectCount, alm_SuspectCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAlm_IncludeReference() {
		return alm_IncludeReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_IncludeReference(boolean newAlm_IncludeReference) {
		boolean oldAlm_IncludeReference = alm_IncludeReference;
		alm_IncludeReference = newAlm_IncludeReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_INCLUDE_REFERENCE, oldAlm_IncludeReference, alm_IncludeReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlm_Priority() {
		return alm_Priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_Priority(String newAlm_Priority) {
		String oldAlm_Priority = alm_Priority;
		alm_Priority = newAlm_Priority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_PRIORITY, oldAlm_Priority, alm_Priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getAlm_SatisfiedBy() {
		if (alm_SatisfiedBy == null) {
			alm_SatisfiedBy = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT__ALM_SATISFIED_BY);
		}
		return alm_SatisfiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getAlm_ValidatedBy() {
		if (alm_ValidatedBy == null) {
			alm_ValidatedBy = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY);
		}
		return alm_ValidatedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getAlm_Spawns() {
		if (alm_Spawns == null) {
			alm_Spawns = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT__ALM_SPAWNS);
		}
		return alm_Spawns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getAlm_DecomposesTo() {
		if (alm_DecomposesTo == null) {
			alm_DecomposesTo = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT__ALM_DECOMPOSES_TO);
		}
		return alm_DecomposesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getAlm_IsRelatedTo() {
		if (alm_IsRelatedTo == null) {
			alm_IsRelatedTo = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT__ALM_IS_RELATED_TO);
		}
		return alm_IsRelatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAlm_IncludeSubsegmentinMetrics() {
		return alm_IncludeSubsegmentinMetrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_IncludeSubsegmentinMetrics(boolean newAlm_IncludeSubsegmentinMetrics) {
		boolean oldAlm_IncludeSubsegmentinMetrics = alm_IncludeSubsegmentinMetrics;
		alm_IncludeSubsegmentinMetrics = newAlm_IncludeSubsegmentinMetrics;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_INCLUDE_SUBSEGMENTIN_METRICS, oldAlm_IncludeSubsegmentinMetrics, alm_IncludeSubsegmentinMetrics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlm_ValidatedByTraceCount() {
		return alm_ValidatedByTraceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_ValidatedByTraceCount(int newAlm_ValidatedByTraceCount) {
		int oldAlm_ValidatedByTraceCount = alm_ValidatedByTraceCount;
		alm_ValidatedByTraceCount = newAlm_ValidatedByTraceCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_TRACE_COUNT, oldAlm_ValidatedByTraceCount, alm_ValidatedByTraceCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlm_TraceStatus() {
		return alm_TraceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_TraceStatus(String newAlm_TraceStatus) {
		String oldAlm_TraceStatus = alm_TraceStatus;
		alm_TraceStatus = newAlm_TraceStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_TRACE_STATUS, oldAlm_TraceStatus, alm_TraceStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlm_DownstreamTraceCount() {
		return alm_DownstreamTraceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_DownstreamTraceCount(int newAlm_DownstreamTraceCount) {
		int oldAlm_DownstreamTraceCount = alm_DownstreamTraceCount;
		alm_DownstreamTraceCount = newAlm_DownstreamTraceCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_DOWNSTREAM_TRACE_COUNT, oldAlm_DownstreamTraceCount, alm_DownstreamTraceCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlm_UpstreamTraceCount() {
		return alm_UpstreamTraceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_UpstreamTraceCount(int newAlm_UpstreamTraceCount) {
		int oldAlm_UpstreamTraceCount = alm_UpstreamTraceCount;
		alm_UpstreamTraceCount = newAlm_UpstreamTraceCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_UPSTREAM_TRACE_COUNT, oldAlm_UpstreamTraceCount, alm_UpstreamTraceCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlm_ValidatedByPassCount() {
		return alm_ValidatedByPassCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_ValidatedByPassCount(int newAlm_ValidatedByPassCount) {
		int oldAlm_ValidatedByPassCount = alm_ValidatedByPassCount;
		alm_ValidatedByPassCount = newAlm_ValidatedByPassCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_PASS_COUNT, oldAlm_ValidatedByPassCount, alm_ValidatedByPassCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAlm_ValidatedByPassPercentage() {
		return alm_ValidatedByPassPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_ValidatedByPassPercentage(float newAlm_ValidatedByPassPercentage) {
		float oldAlm_ValidatedByPassPercentage = alm_ValidatedByPassPercentage;
		alm_ValidatedByPassPercentage = newAlm_ValidatedByPassPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_PASS_PERCENTAGE, oldAlm_ValidatedByPassPercentage, alm_ValidatedByPassPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlm_CategoryIntValue() {
		return alm_CategoryIntValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_CategoryIntValue(String newAlm_CategoryIntValue) {
		String oldAlm_CategoryIntValue = alm_CategoryIntValue;
		alm_CategoryIntValue = newAlm_CategoryIntValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_CATEGORY_INT_VALUE, oldAlm_CategoryIntValue, alm_CategoryIntValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getAlm_ModelledBy() {
		if (alm_ModelledBy == null) {
			alm_ModelledBy = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT__ALM_MODELLED_BY);
		}
		return alm_ModelledBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getAlm_VerifiedBy() {
		if (alm_VerifiedBy == null) {
			alm_VerifiedBy = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY);
		}
		return alm_VerifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlm_VerifiedByPassCount() {
		return alm_VerifiedByPassCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_VerifiedByPassCount(int newAlm_VerifiedByPassCount) {
		int oldAlm_VerifiedByPassCount = alm_VerifiedByPassCount;
		alm_VerifiedByPassCount = newAlm_VerifiedByPassCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_PASS_COUNT, oldAlm_VerifiedByPassCount, alm_VerifiedByPassCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAlm_VerifiedByTraceCount() {
		return alm_VerifiedByTraceCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_VerifiedByTraceCount(int newAlm_VerifiedByTraceCount) {
		int oldAlm_VerifiedByTraceCount = alm_VerifiedByTraceCount;
		alm_VerifiedByTraceCount = newAlm_VerifiedByTraceCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_TRACE_COUNT, oldAlm_VerifiedByTraceCount, alm_VerifiedByTraceCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getAlm_VerifiedByPassPercentage() {
		return alm_VerifiedByPassPercentage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_VerifiedByPassPercentage(float newAlm_VerifiedByPassPercentage) {
		float oldAlm_VerifiedByPassPercentage = alm_VerifiedByPassPercentage;
		alm_VerifiedByPassPercentage = newAlm_VerifiedByPassPercentage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_PASS_PERCENTAGE, oldAlm_VerifiedByPassPercentage, alm_VerifiedByPassPercentage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getAlm_ChangesAuthorizedBy() {
		if (alm_ChangesAuthorizedBy == null) {
			alm_ChangesAuthorizedBy = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT__ALM_CHANGES_AUTHORIZED_BY);
		}
		return alm_ChangesAuthorizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getAlm_DecomposedFrom() {
		if (alm_DecomposedFrom == null) {
			alm_DecomposedFrom = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT__ALM_DECOMPOSED_FROM);
		}
		return alm_DecomposedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAlm_ValidChangeOrder() {
		return alm_ValidChangeOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_ValidChangeOrder(boolean newAlm_ValidChangeOrder) {
		boolean oldAlm_ValidChangeOrder = alm_ValidChangeOrder;
		alm_ValidChangeOrder = newAlm_ValidChangeOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_VALID_CHANGE_ORDER, oldAlm_ValidChangeOrder, alm_ValidChangeOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlm_ValidatedByTraceHealth() {
		return alm_ValidatedByTraceHealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_ValidatedByTraceHealth(String newAlm_ValidatedByTraceHealth) {
		String oldAlm_ValidatedByTraceHealth = alm_ValidatedByTraceHealth;
		alm_ValidatedByTraceHealth = newAlm_ValidatedByTraceHealth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_TRACE_HEALTH, oldAlm_ValidatedByTraceHealth, alm_ValidatedByTraceHealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlm_VerifiedByTraceHealth() {
		return alm_VerifiedByTraceHealth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_VerifiedByTraceHealth(String newAlm_VerifiedByTraceHealth) {
		String oldAlm_VerifiedByTraceHealth = alm_VerifiedByTraceHealth;
		alm_VerifiedByTraceHealth = newAlm_VerifiedByTraceHealth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_TRACE_HEALTH, oldAlm_VerifiedByTraceHealth, alm_VerifiedByTraceHealth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlm_Text() {
		return alm_Text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_Text(String newAlm_Text) {
		String oldAlm_Text = alm_Text;
		alm_Text = newAlm_Text;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_TEXT, oldAlm_Text, alm_Text));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlm_ProjectState() {
		return alm_ProjectState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_ProjectState(String newAlm_ProjectState) {
		String oldAlm_ProjectState = alm_ProjectState;
		alm_ProjectState = newAlm_ProjectState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_PROJECT_STATE, oldAlm_ProjectState, alm_ProjectState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlm_ProjectPhaseFVA() {
		return alm_ProjectPhaseFVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_ProjectPhaseFVA(String newAlm_ProjectPhaseFVA) {
		String oldAlm_ProjectPhaseFVA = alm_ProjectPhaseFVA;
		alm_ProjectPhaseFVA = newAlm_ProjectPhaseFVA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ALM_PROJECT_PHASE_FVA, oldAlm_ProjectPhaseFVA, alm_ProjectPhaseFVA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModifiedBy() {
		return modifiedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedBy(String newModifiedBy) {
		String oldModifiedBy = modifiedBy;
		modifiedBy = newModifiedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__MODIFIED_BY, oldModifiedBy, modifiedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreatedBy() {
		return createdBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedBy(String newCreatedBy) {
		String oldCreatedBy = createdBy;
		createdBy = newCreatedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__CREATED_BY, oldCreatedBy, createdBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModifiedDate() {
		return modifiedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiedDate(String newModifiedDate) {
		String oldModifiedDate = modifiedDate;
		modifiedDate = newModifiedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__MODIFIED_DATE, oldModifiedDate, modifiedDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCreatedDate() {
		return createdDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreatedDate(String newCreatedDate) {
		String oldCreatedDate = createdDate;
		createdDate = newCreatedDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(String newCategory) {
		String oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getReferences() {
		if (references == null) {
			references = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT__REFERENCES);
		}
		return references;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getContainedBy() {
		if (containedBy == null) {
			containedBy = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT__CONTAINED_BY);
		}
		return containedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferenceMode() {
		return referenceMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceMode(String newReferenceMode) {
		String oldReferenceMode = referenceMode;
		referenceMode = newReferenceMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__REFERENCE_MODE, oldReferenceMode, referenceMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDocumentID() {
		return documentID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentID(int newDocumentID) {
		int oldDocumentID = documentID;
		documentID = newDocumentID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__DOCUMENT_ID, oldDocumentID, documentID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReferencedItemType() {
		return referencedItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferencedItemType(String newReferencedItemType) {
		String oldReferencedItemType = referencedItemType;
		referencedItemType = newReferencedItemType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__REFERENCED_ITEM_TYPE, oldReferencedItemType, referencedItemType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getShares() {
		if (shares == null) {
			shares = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT__SHARES);
		}
		return shares;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getSharedBy() {
		if (sharedBy == null) {
			sharedBy = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT__SHARED_BY);
		}
		return sharedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRootID() {
		return rootID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRootID(int newRootID) {
		int oldRootID = rootID;
		rootID = newRootID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__ROOT_ID, oldRootID, rootID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputRevisionDate() {
		return inputRevisionDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputRevisionDate(String newInputRevisionDate) {
		String oldInputRevisionDate = inputRevisionDate;
		inputRevisionDate = newInputRevisionDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__INPUT_REVISION_DATE, oldInputRevisionDate, inputRevisionDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSignificantEditDate() {
		return significantEditDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignificantEditDate(String newSignificantEditDate) {
		String oldSignificantEditDate = significantEditDate;
		significantEditDate = newSignificantEditDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__SIGNIFICANT_EDIT_DATE, oldSignificantEditDate, significantEditDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSignificantChangeSinceItemRevision() {
		return significantChangeSinceItemRevision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSignificantChangeSinceItemRevision(boolean newSignificantChangeSinceItemRevision) {
		boolean oldSignificantChangeSinceItemRevision = significantChangeSinceItemRevision;
		significantChangeSinceItemRevision = newSignificantChangeSinceItemRevision;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION, oldSignificantChangeSinceItemRevision, significantChangeSinceItemRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementDocument> getRequirementDocument() {
		if (requirementDocument == null) {
			requirementDocument = new EObjectContainmentEList<RequirementDocument>(RequirementDocument.class, this, IntegrityPackage.REQUIREMENT__REQUIREMENT_DOCUMENT);
		}
		return requirementDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntegrityPackage.REQUIREMENT__PROJECT:
				return basicSetProject(null, msgs);
			case IntegrityPackage.REQUIREMENT__ATTACHMENTS:
				return ((InternalEList<?>)getAttachments()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT__ALM_SATISFIED_BY:
				return ((InternalEList<?>)getAlm_SatisfiedBy()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY:
				return ((InternalEList<?>)getAlm_ValidatedBy()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT__ALM_SPAWNS:
				return ((InternalEList<?>)getAlm_Spawns()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT__ALM_DECOMPOSES_TO:
				return ((InternalEList<?>)getAlm_DecomposesTo()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT__ALM_IS_RELATED_TO:
				return ((InternalEList<?>)getAlm_IsRelatedTo()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT__ALM_MODELLED_BY:
				return ((InternalEList<?>)getAlm_ModelledBy()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY:
				return ((InternalEList<?>)getAlm_VerifiedBy()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT__ALM_CHANGES_AUTHORIZED_BY:
				return ((InternalEList<?>)getAlm_ChangesAuthorizedBy()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT__ALM_DECOMPOSED_FROM:
				return ((InternalEList<?>)getAlm_DecomposedFrom()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT__REFERENCES:
				return ((InternalEList<?>)getReferences()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT__CONTAINED_BY:
				return ((InternalEList<?>)getContainedBy()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT__SHARES:
				return ((InternalEList<?>)getShares()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT__SHARED_BY:
				return ((InternalEList<?>)getSharedBy()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT__REQUIREMENT_DOCUMENT:
				return ((InternalEList<?>)getRequirementDocument()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntegrityPackage.REQUIREMENT__STATE:
				return getState();
			case IntegrityPackage.REQUIREMENT__PROJECT:
				return getProject();
			case IntegrityPackage.REQUIREMENT__ATTACHMENTS:
				return getAttachments();
			case IntegrityPackage.REQUIREMENT__PARAMETER_VALUES:
				return getParameterValues();
			case IntegrityPackage.REQUIREMENT__ALM_AUTHORIZING_CHANGE_ORDER:
				return getAlm_AuthorizingChangeOrder();
			case IntegrityPackage.REQUIREMENT__ALM_SUSPECT_COUNT:
				return getAlm_SuspectCount();
			case IntegrityPackage.REQUIREMENT__ALM_INCLUDE_REFERENCE:
				return isAlm_IncludeReference();
			case IntegrityPackage.REQUIREMENT__ALM_PRIORITY:
				return getAlm_Priority();
			case IntegrityPackage.REQUIREMENT__ALM_SATISFIED_BY:
				return getAlm_SatisfiedBy();
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY:
				return getAlm_ValidatedBy();
			case IntegrityPackage.REQUIREMENT__ALM_SPAWNS:
				return getAlm_Spawns();
			case IntegrityPackage.REQUIREMENT__ALM_DECOMPOSES_TO:
				return getAlm_DecomposesTo();
			case IntegrityPackage.REQUIREMENT__ALM_IS_RELATED_TO:
				return getAlm_IsRelatedTo();
			case IntegrityPackage.REQUIREMENT__ALM_INCLUDE_SUBSEGMENTIN_METRICS:
				return isAlm_IncludeSubsegmentinMetrics();
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_TRACE_COUNT:
				return getAlm_ValidatedByTraceCount();
			case IntegrityPackage.REQUIREMENT__ALM_TRACE_STATUS:
				return getAlm_TraceStatus();
			case IntegrityPackage.REQUIREMENT__ALM_DOWNSTREAM_TRACE_COUNT:
				return getAlm_DownstreamTraceCount();
			case IntegrityPackage.REQUIREMENT__ALM_UPSTREAM_TRACE_COUNT:
				return getAlm_UpstreamTraceCount();
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_PASS_COUNT:
				return getAlm_ValidatedByPassCount();
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_PASS_PERCENTAGE:
				return getAlm_ValidatedByPassPercentage();
			case IntegrityPackage.REQUIREMENT__ALM_CATEGORY_INT_VALUE:
				return getAlm_CategoryIntValue();
			case IntegrityPackage.REQUIREMENT__ALM_MODELLED_BY:
				return getAlm_ModelledBy();
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY:
				return getAlm_VerifiedBy();
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_PASS_COUNT:
				return getAlm_VerifiedByPassCount();
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_TRACE_COUNT:
				return getAlm_VerifiedByTraceCount();
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_PASS_PERCENTAGE:
				return getAlm_VerifiedByPassPercentage();
			case IntegrityPackage.REQUIREMENT__ALM_CHANGES_AUTHORIZED_BY:
				return getAlm_ChangesAuthorizedBy();
			case IntegrityPackage.REQUIREMENT__ALM_DECOMPOSED_FROM:
				return getAlm_DecomposedFrom();
			case IntegrityPackage.REQUIREMENT__ALM_VALID_CHANGE_ORDER:
				return isAlm_ValidChangeOrder();
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_TRACE_HEALTH:
				return getAlm_ValidatedByTraceHealth();
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_TRACE_HEALTH:
				return getAlm_VerifiedByTraceHealth();
			case IntegrityPackage.REQUIREMENT__ALM_TEXT:
				return getAlm_Text();
			case IntegrityPackage.REQUIREMENT__ALM_PROJECT_STATE:
				return getAlm_ProjectState();
			case IntegrityPackage.REQUIREMENT__ALM_PROJECT_PHASE_FVA:
				return getAlm_ProjectPhaseFVA();
			case IntegrityPackage.REQUIREMENT__TYPE:
				return getType();
			case IntegrityPackage.REQUIREMENT__ID:
				return getID();
			case IntegrityPackage.REQUIREMENT__MODIFIED_BY:
				return getModifiedBy();
			case IntegrityPackage.REQUIREMENT__CREATED_BY:
				return getCreatedBy();
			case IntegrityPackage.REQUIREMENT__MODIFIED_DATE:
				return getModifiedDate();
			case IntegrityPackage.REQUIREMENT__CREATED_DATE:
				return getCreatedDate();
			case IntegrityPackage.REQUIREMENT__CATEGORY:
				return getCategory();
			case IntegrityPackage.REQUIREMENT__REFERENCES:
				return getReferences();
			case IntegrityPackage.REQUIREMENT__CONTAINS:
				return getContains();
			case IntegrityPackage.REQUIREMENT__CONTAINED_BY:
				return getContainedBy();
			case IntegrityPackage.REQUIREMENT__REFERENCE_MODE:
				return getReferenceMode();
			case IntegrityPackage.REQUIREMENT__DOCUMENT_ID:
				return getDocumentID();
			case IntegrityPackage.REQUIREMENT__REFERENCED_ITEM_TYPE:
				return getReferencedItemType();
			case IntegrityPackage.REQUIREMENT__SHARES:
				return getShares();
			case IntegrityPackage.REQUIREMENT__SHARED_BY:
				return getSharedBy();
			case IntegrityPackage.REQUIREMENT__ROOT_ID:
				return getRootID();
			case IntegrityPackage.REQUIREMENT__INPUT_REVISION_DATE:
				return getInputRevisionDate();
			case IntegrityPackage.REQUIREMENT__SIGNIFICANT_EDIT_DATE:
				return getSignificantEditDate();
			case IntegrityPackage.REQUIREMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION:
				return isSignificantChangeSinceItemRevision();
			case IntegrityPackage.REQUIREMENT__REQUIREMENT_DOCUMENT:
				return getRequirementDocument();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IntegrityPackage.REQUIREMENT__STATE:
				setState((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__PROJECT:
				setProject((Project)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ATTACHMENTS:
				getAttachments().clear();
				getAttachments().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__PARAMETER_VALUES:
				setParameterValues((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_AUTHORIZING_CHANGE_ORDER:
				setAlm_AuthorizingChangeOrder((Integer)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_SUSPECT_COUNT:
				setAlm_SuspectCount((Integer)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_INCLUDE_REFERENCE:
				setAlm_IncludeReference((Boolean)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_PRIORITY:
				setAlm_Priority((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_SATISFIED_BY:
				getAlm_SatisfiedBy().clear();
				getAlm_SatisfiedBy().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY:
				getAlm_ValidatedBy().clear();
				getAlm_ValidatedBy().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_SPAWNS:
				getAlm_Spawns().clear();
				getAlm_Spawns().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_DECOMPOSES_TO:
				getAlm_DecomposesTo().clear();
				getAlm_DecomposesTo().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_IS_RELATED_TO:
				getAlm_IsRelatedTo().clear();
				getAlm_IsRelatedTo().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_INCLUDE_SUBSEGMENTIN_METRICS:
				setAlm_IncludeSubsegmentinMetrics((Boolean)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_TRACE_COUNT:
				setAlm_ValidatedByTraceCount((Integer)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_TRACE_STATUS:
				setAlm_TraceStatus((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_DOWNSTREAM_TRACE_COUNT:
				setAlm_DownstreamTraceCount((Integer)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_UPSTREAM_TRACE_COUNT:
				setAlm_UpstreamTraceCount((Integer)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_PASS_COUNT:
				setAlm_ValidatedByPassCount((Integer)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_PASS_PERCENTAGE:
				setAlm_ValidatedByPassPercentage((Float)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_CATEGORY_INT_VALUE:
				setAlm_CategoryIntValue((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_MODELLED_BY:
				getAlm_ModelledBy().clear();
				getAlm_ModelledBy().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY:
				getAlm_VerifiedBy().clear();
				getAlm_VerifiedBy().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_PASS_COUNT:
				setAlm_VerifiedByPassCount((Integer)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_TRACE_COUNT:
				setAlm_VerifiedByTraceCount((Integer)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_PASS_PERCENTAGE:
				setAlm_VerifiedByPassPercentage((Float)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_CHANGES_AUTHORIZED_BY:
				getAlm_ChangesAuthorizedBy().clear();
				getAlm_ChangesAuthorizedBy().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_DECOMPOSED_FROM:
				getAlm_DecomposedFrom().clear();
				getAlm_DecomposedFrom().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VALID_CHANGE_ORDER:
				setAlm_ValidChangeOrder((Boolean)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_TRACE_HEALTH:
				setAlm_ValidatedByTraceHealth((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_TRACE_HEALTH:
				setAlm_VerifiedByTraceHealth((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_TEXT:
				setAlm_Text((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_PROJECT_STATE:
				setAlm_ProjectState((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_PROJECT_PHASE_FVA:
				setAlm_ProjectPhaseFVA((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__TYPE:
				setType((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ID:
				setID((Integer)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__MODIFIED_BY:
				setModifiedBy((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__CREATED_BY:
				setCreatedBy((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__MODIFIED_DATE:
				setModifiedDate((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__CREATED_DATE:
				setCreatedDate((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__CATEGORY:
				setCategory((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__REFERENCES:
				getReferences().clear();
				getReferences().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__CONTAINED_BY:
				getContainedBy().clear();
				getContainedBy().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__REFERENCE_MODE:
				setReferenceMode((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__DOCUMENT_ID:
				setDocumentID((Integer)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__REFERENCED_ITEM_TYPE:
				setReferencedItemType((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__SHARES:
				getShares().clear();
				getShares().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__SHARED_BY:
				getSharedBy().clear();
				getSharedBy().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__ROOT_ID:
				setRootID((Integer)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__INPUT_REVISION_DATE:
				setInputRevisionDate((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__SIGNIFICANT_EDIT_DATE:
				setSignificantEditDate((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION:
				setSignificantChangeSinceItemRevision((Boolean)newValue);
				return;
			case IntegrityPackage.REQUIREMENT__REQUIREMENT_DOCUMENT:
				getRequirementDocument().clear();
				getRequirementDocument().addAll((Collection<? extends RequirementDocument>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IntegrityPackage.REQUIREMENT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__PROJECT:
				setProject((Project)null);
				return;
			case IntegrityPackage.REQUIREMENT__ATTACHMENTS:
				getAttachments().clear();
				return;
			case IntegrityPackage.REQUIREMENT__PARAMETER_VALUES:
				setParameterValues(PARAMETER_VALUES_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_AUTHORIZING_CHANGE_ORDER:
				setAlm_AuthorizingChangeOrder(ALM_AUTHORIZING_CHANGE_ORDER_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_SUSPECT_COUNT:
				setAlm_SuspectCount(ALM_SUSPECT_COUNT_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_INCLUDE_REFERENCE:
				setAlm_IncludeReference(ALM_INCLUDE_REFERENCE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_PRIORITY:
				setAlm_Priority(ALM_PRIORITY_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_SATISFIED_BY:
				getAlm_SatisfiedBy().clear();
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY:
				getAlm_ValidatedBy().clear();
				return;
			case IntegrityPackage.REQUIREMENT__ALM_SPAWNS:
				getAlm_Spawns().clear();
				return;
			case IntegrityPackage.REQUIREMENT__ALM_DECOMPOSES_TO:
				getAlm_DecomposesTo().clear();
				return;
			case IntegrityPackage.REQUIREMENT__ALM_IS_RELATED_TO:
				getAlm_IsRelatedTo().clear();
				return;
			case IntegrityPackage.REQUIREMENT__ALM_INCLUDE_SUBSEGMENTIN_METRICS:
				setAlm_IncludeSubsegmentinMetrics(ALM_INCLUDE_SUBSEGMENTIN_METRICS_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_TRACE_COUNT:
				setAlm_ValidatedByTraceCount(ALM_VALIDATED_BY_TRACE_COUNT_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_TRACE_STATUS:
				setAlm_TraceStatus(ALM_TRACE_STATUS_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_DOWNSTREAM_TRACE_COUNT:
				setAlm_DownstreamTraceCount(ALM_DOWNSTREAM_TRACE_COUNT_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_UPSTREAM_TRACE_COUNT:
				setAlm_UpstreamTraceCount(ALM_UPSTREAM_TRACE_COUNT_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_PASS_COUNT:
				setAlm_ValidatedByPassCount(ALM_VALIDATED_BY_PASS_COUNT_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_PASS_PERCENTAGE:
				setAlm_ValidatedByPassPercentage(ALM_VALIDATED_BY_PASS_PERCENTAGE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_CATEGORY_INT_VALUE:
				setAlm_CategoryIntValue(ALM_CATEGORY_INT_VALUE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_MODELLED_BY:
				getAlm_ModelledBy().clear();
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY:
				getAlm_VerifiedBy().clear();
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_PASS_COUNT:
				setAlm_VerifiedByPassCount(ALM_VERIFIED_BY_PASS_COUNT_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_TRACE_COUNT:
				setAlm_VerifiedByTraceCount(ALM_VERIFIED_BY_TRACE_COUNT_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_PASS_PERCENTAGE:
				setAlm_VerifiedByPassPercentage(ALM_VERIFIED_BY_PASS_PERCENTAGE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_CHANGES_AUTHORIZED_BY:
				getAlm_ChangesAuthorizedBy().clear();
				return;
			case IntegrityPackage.REQUIREMENT__ALM_DECOMPOSED_FROM:
				getAlm_DecomposedFrom().clear();
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VALID_CHANGE_ORDER:
				setAlm_ValidChangeOrder(ALM_VALID_CHANGE_ORDER_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_TRACE_HEALTH:
				setAlm_ValidatedByTraceHealth(ALM_VALIDATED_BY_TRACE_HEALTH_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_TRACE_HEALTH:
				setAlm_VerifiedByTraceHealth(ALM_VERIFIED_BY_TRACE_HEALTH_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_TEXT:
				setAlm_Text(ALM_TEXT_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_PROJECT_STATE:
				setAlm_ProjectState(ALM_PROJECT_STATE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ALM_PROJECT_PHASE_FVA:
				setAlm_ProjectPhaseFVA(ALM_PROJECT_PHASE_FVA_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__ID:
				setID(ID_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__MODIFIED_BY:
				setModifiedBy(MODIFIED_BY_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__CREATED_BY:
				setCreatedBy(CREATED_BY_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__MODIFIED_DATE:
				setModifiedDate(MODIFIED_DATE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__CATEGORY:
				setCategory(CATEGORY_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__REFERENCES:
				getReferences().clear();
				return;
			case IntegrityPackage.REQUIREMENT__CONTAINS:
				getContains().clear();
				return;
			case IntegrityPackage.REQUIREMENT__CONTAINED_BY:
				getContainedBy().clear();
				return;
			case IntegrityPackage.REQUIREMENT__REFERENCE_MODE:
				setReferenceMode(REFERENCE_MODE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__DOCUMENT_ID:
				setDocumentID(DOCUMENT_ID_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__REFERENCED_ITEM_TYPE:
				setReferencedItemType(REFERENCED_ITEM_TYPE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__SHARES:
				getShares().clear();
				return;
			case IntegrityPackage.REQUIREMENT__SHARED_BY:
				getSharedBy().clear();
				return;
			case IntegrityPackage.REQUIREMENT__ROOT_ID:
				setRootID(ROOT_ID_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__INPUT_REVISION_DATE:
				setInputRevisionDate(INPUT_REVISION_DATE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__SIGNIFICANT_EDIT_DATE:
				setSignificantEditDate(SIGNIFICANT_EDIT_DATE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION:
				setSignificantChangeSinceItemRevision(SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT__REQUIREMENT_DOCUMENT:
				getRequirementDocument().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IntegrityPackage.REQUIREMENT__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case IntegrityPackage.REQUIREMENT__PROJECT:
				return project != null;
			case IntegrityPackage.REQUIREMENT__ATTACHMENTS:
				return attachments != null && !attachments.isEmpty();
			case IntegrityPackage.REQUIREMENT__PARAMETER_VALUES:
				return PARAMETER_VALUES_EDEFAULT == null ? parameterValues != null : !PARAMETER_VALUES_EDEFAULT.equals(parameterValues);
			case IntegrityPackage.REQUIREMENT__ALM_AUTHORIZING_CHANGE_ORDER:
				return alm_AuthorizingChangeOrder != ALM_AUTHORIZING_CHANGE_ORDER_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__ALM_SUSPECT_COUNT:
				return alm_SuspectCount != ALM_SUSPECT_COUNT_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__ALM_INCLUDE_REFERENCE:
				return alm_IncludeReference != ALM_INCLUDE_REFERENCE_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__ALM_PRIORITY:
				return ALM_PRIORITY_EDEFAULT == null ? alm_Priority != null : !ALM_PRIORITY_EDEFAULT.equals(alm_Priority);
			case IntegrityPackage.REQUIREMENT__ALM_SATISFIED_BY:
				return alm_SatisfiedBy != null && !alm_SatisfiedBy.isEmpty();
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY:
				return alm_ValidatedBy != null && !alm_ValidatedBy.isEmpty();
			case IntegrityPackage.REQUIREMENT__ALM_SPAWNS:
				return alm_Spawns != null && !alm_Spawns.isEmpty();
			case IntegrityPackage.REQUIREMENT__ALM_DECOMPOSES_TO:
				return alm_DecomposesTo != null && !alm_DecomposesTo.isEmpty();
			case IntegrityPackage.REQUIREMENT__ALM_IS_RELATED_TO:
				return alm_IsRelatedTo != null && !alm_IsRelatedTo.isEmpty();
			case IntegrityPackage.REQUIREMENT__ALM_INCLUDE_SUBSEGMENTIN_METRICS:
				return alm_IncludeSubsegmentinMetrics != ALM_INCLUDE_SUBSEGMENTIN_METRICS_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_TRACE_COUNT:
				return alm_ValidatedByTraceCount != ALM_VALIDATED_BY_TRACE_COUNT_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__ALM_TRACE_STATUS:
				return ALM_TRACE_STATUS_EDEFAULT == null ? alm_TraceStatus != null : !ALM_TRACE_STATUS_EDEFAULT.equals(alm_TraceStatus);
			case IntegrityPackage.REQUIREMENT__ALM_DOWNSTREAM_TRACE_COUNT:
				return alm_DownstreamTraceCount != ALM_DOWNSTREAM_TRACE_COUNT_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__ALM_UPSTREAM_TRACE_COUNT:
				return alm_UpstreamTraceCount != ALM_UPSTREAM_TRACE_COUNT_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_PASS_COUNT:
				return alm_ValidatedByPassCount != ALM_VALIDATED_BY_PASS_COUNT_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_PASS_PERCENTAGE:
				return alm_ValidatedByPassPercentage != ALM_VALIDATED_BY_PASS_PERCENTAGE_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__ALM_CATEGORY_INT_VALUE:
				return ALM_CATEGORY_INT_VALUE_EDEFAULT == null ? alm_CategoryIntValue != null : !ALM_CATEGORY_INT_VALUE_EDEFAULT.equals(alm_CategoryIntValue);
			case IntegrityPackage.REQUIREMENT__ALM_MODELLED_BY:
				return alm_ModelledBy != null && !alm_ModelledBy.isEmpty();
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY:
				return alm_VerifiedBy != null && !alm_VerifiedBy.isEmpty();
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_PASS_COUNT:
				return alm_VerifiedByPassCount != ALM_VERIFIED_BY_PASS_COUNT_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_TRACE_COUNT:
				return alm_VerifiedByTraceCount != ALM_VERIFIED_BY_TRACE_COUNT_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_PASS_PERCENTAGE:
				return alm_VerifiedByPassPercentage != ALM_VERIFIED_BY_PASS_PERCENTAGE_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__ALM_CHANGES_AUTHORIZED_BY:
				return alm_ChangesAuthorizedBy != null && !alm_ChangesAuthorizedBy.isEmpty();
			case IntegrityPackage.REQUIREMENT__ALM_DECOMPOSED_FROM:
				return alm_DecomposedFrom != null && !alm_DecomposedFrom.isEmpty();
			case IntegrityPackage.REQUIREMENT__ALM_VALID_CHANGE_ORDER:
				return alm_ValidChangeOrder != ALM_VALID_CHANGE_ORDER_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__ALM_VALIDATED_BY_TRACE_HEALTH:
				return ALM_VALIDATED_BY_TRACE_HEALTH_EDEFAULT == null ? alm_ValidatedByTraceHealth != null : !ALM_VALIDATED_BY_TRACE_HEALTH_EDEFAULT.equals(alm_ValidatedByTraceHealth);
			case IntegrityPackage.REQUIREMENT__ALM_VERIFIED_BY_TRACE_HEALTH:
				return ALM_VERIFIED_BY_TRACE_HEALTH_EDEFAULT == null ? alm_VerifiedByTraceHealth != null : !ALM_VERIFIED_BY_TRACE_HEALTH_EDEFAULT.equals(alm_VerifiedByTraceHealth);
			case IntegrityPackage.REQUIREMENT__ALM_TEXT:
				return ALM_TEXT_EDEFAULT == null ? alm_Text != null : !ALM_TEXT_EDEFAULT.equals(alm_Text);
			case IntegrityPackage.REQUIREMENT__ALM_PROJECT_STATE:
				return ALM_PROJECT_STATE_EDEFAULT == null ? alm_ProjectState != null : !ALM_PROJECT_STATE_EDEFAULT.equals(alm_ProjectState);
			case IntegrityPackage.REQUIREMENT__ALM_PROJECT_PHASE_FVA:
				return ALM_PROJECT_PHASE_FVA_EDEFAULT == null ? alm_ProjectPhaseFVA != null : !ALM_PROJECT_PHASE_FVA_EDEFAULT.equals(alm_ProjectPhaseFVA);
			case IntegrityPackage.REQUIREMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case IntegrityPackage.REQUIREMENT__ID:
				return id != ID_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__MODIFIED_BY:
				return MODIFIED_BY_EDEFAULT == null ? modifiedBy != null : !MODIFIED_BY_EDEFAULT.equals(modifiedBy);
			case IntegrityPackage.REQUIREMENT__CREATED_BY:
				return CREATED_BY_EDEFAULT == null ? createdBy != null : !CREATED_BY_EDEFAULT.equals(createdBy);
			case IntegrityPackage.REQUIREMENT__MODIFIED_DATE:
				return MODIFIED_DATE_EDEFAULT == null ? modifiedDate != null : !MODIFIED_DATE_EDEFAULT.equals(modifiedDate);
			case IntegrityPackage.REQUIREMENT__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case IntegrityPackage.REQUIREMENT__CATEGORY:
				return CATEGORY_EDEFAULT == null ? category != null : !CATEGORY_EDEFAULT.equals(category);
			case IntegrityPackage.REQUIREMENT__REFERENCES:
				return references != null && !references.isEmpty();
			case IntegrityPackage.REQUIREMENT__CONTAINS:
				return contains != null && !contains.isEmpty();
			case IntegrityPackage.REQUIREMENT__CONTAINED_BY:
				return containedBy != null && !containedBy.isEmpty();
			case IntegrityPackage.REQUIREMENT__REFERENCE_MODE:
				return REFERENCE_MODE_EDEFAULT == null ? referenceMode != null : !REFERENCE_MODE_EDEFAULT.equals(referenceMode);
			case IntegrityPackage.REQUIREMENT__DOCUMENT_ID:
				return documentID != DOCUMENT_ID_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__REFERENCED_ITEM_TYPE:
				return REFERENCED_ITEM_TYPE_EDEFAULT == null ? referencedItemType != null : !REFERENCED_ITEM_TYPE_EDEFAULT.equals(referencedItemType);
			case IntegrityPackage.REQUIREMENT__SHARES:
				return shares != null && !shares.isEmpty();
			case IntegrityPackage.REQUIREMENT__SHARED_BY:
				return sharedBy != null && !sharedBy.isEmpty();
			case IntegrityPackage.REQUIREMENT__ROOT_ID:
				return rootID != ROOT_ID_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__INPUT_REVISION_DATE:
				return INPUT_REVISION_DATE_EDEFAULT == null ? inputRevisionDate != null : !INPUT_REVISION_DATE_EDEFAULT.equals(inputRevisionDate);
			case IntegrityPackage.REQUIREMENT__SIGNIFICANT_EDIT_DATE:
				return SIGNIFICANT_EDIT_DATE_EDEFAULT == null ? significantEditDate != null : !SIGNIFICANT_EDIT_DATE_EDEFAULT.equals(significantEditDate);
			case IntegrityPackage.REQUIREMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION:
				return significantChangeSinceItemRevision != SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION_EDEFAULT;
			case IntegrityPackage.REQUIREMENT__REQUIREMENT_DOCUMENT:
				return requirementDocument != null && !requirementDocument.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (state: ");
		result.append(state);
		result.append(", parameterValues: ");
		result.append(parameterValues);
		result.append(", alm_AuthorizingChangeOrder: ");
		result.append(alm_AuthorizingChangeOrder);
		result.append(", alm_SuspectCount: ");
		result.append(alm_SuspectCount);
		result.append(", alm_IncludeReference: ");
		result.append(alm_IncludeReference);
		result.append(", alm_Priority: ");
		result.append(alm_Priority);
		result.append(", alm_IncludeSubsegmentinMetrics: ");
		result.append(alm_IncludeSubsegmentinMetrics);
		result.append(", alm_ValidatedByTraceCount: ");
		result.append(alm_ValidatedByTraceCount);
		result.append(", alm_TraceStatus: ");
		result.append(alm_TraceStatus);
		result.append(", alm_DownstreamTraceCount: ");
		result.append(alm_DownstreamTraceCount);
		result.append(", alm_UpstreamTraceCount: ");
		result.append(alm_UpstreamTraceCount);
		result.append(", alm_ValidatedByPassCount: ");
		result.append(alm_ValidatedByPassCount);
		result.append(", alm_ValidatedByPassPercentage: ");
		result.append(alm_ValidatedByPassPercentage);
		result.append(", alm_CategoryIntValue: ");
		result.append(alm_CategoryIntValue);
		result.append(", alm_VerifiedByPassCount: ");
		result.append(alm_VerifiedByPassCount);
		result.append(", alm_VerifiedByTraceCount: ");
		result.append(alm_VerifiedByTraceCount);
		result.append(", alm_VerifiedByPassPercentage: ");
		result.append(alm_VerifiedByPassPercentage);
		result.append(", alm_ValidChangeOrder: ");
		result.append(alm_ValidChangeOrder);
		result.append(", alm_ValidatedByTraceHealth: ");
		result.append(alm_ValidatedByTraceHealth);
		result.append(", alm_VerifiedByTraceHealth: ");
		result.append(alm_VerifiedByTraceHealth);
		result.append(", alm_Text: ");
		result.append(alm_Text);
		result.append(", alm_ProjectState: ");
		result.append(alm_ProjectState);
		result.append(", alm_ProjectPhaseFVA: ");
		result.append(alm_ProjectPhaseFVA);
		result.append(", type: ");
		result.append(type);
		result.append(", ID: ");
		result.append(id);
		result.append(", modifiedBy: ");
		result.append(modifiedBy);
		result.append(", createdBy: ");
		result.append(createdBy);
		result.append(", modifiedDate: ");
		result.append(modifiedDate);
		result.append(", createdDate: ");
		result.append(createdDate);
		result.append(", category: ");
		result.append(category);
		result.append(", referenceMode: ");
		result.append(referenceMode);
		result.append(", documentID: ");
		result.append(documentID);
		result.append(", referencedItemType: ");
		result.append(referencedItemType);
		result.append(", rootID: ");
		result.append(rootID);
		result.append(", inputRevisionDate: ");
		result.append(inputRevisionDate);
		result.append(", significantEditDate: ");
		result.append(significantEditDate);
		result.append(", significantChangeSinceItemRevision: ");
		result.append(significantChangeSinceItemRevision);
		result.append(')');
		return result.toString();
	}

} //RequirementImpl
