/**
 */
package integrity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link integrity.Requirement#getState <em>State</em>}</li>
 *   <li>{@link integrity.Requirement#getProject <em>Project</em>}</li>
 *   <li>{@link integrity.Requirement#getAttachments <em>Attachments</em>}</li>
 *   <li>{@link integrity.Requirement#getParameterValues <em>Parameter Values</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_AuthorizingChangeOrder <em>Alm Authorizing Change Order</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_SuspectCount <em>Alm Suspect Count</em>}</li>
 *   <li>{@link integrity.Requirement#isAlm_IncludeReference <em>Alm Include Reference</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_Priority <em>Alm Priority</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_SatisfiedBy <em>Alm Satisfied By</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_ValidatedBy <em>Alm Validated By</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_Spawns <em>Alm Spawns</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_DecomposesTo <em>Alm Decomposes To</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_IsRelatedTo <em>Alm Is Related To</em>}</li>
 *   <li>{@link integrity.Requirement#isAlm_IncludeSubsegmentinMetrics <em>Alm Include Subsegmentin Metrics</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_ValidatedByTraceCount <em>Alm Validated By Trace Count</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_TraceStatus <em>Alm Trace Status</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_DownstreamTraceCount <em>Alm Downstream Trace Count</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_UpstreamTraceCount <em>Alm Upstream Trace Count</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_ValidatedByPassCount <em>Alm Validated By Pass Count</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_ValidatedByPassPercentage <em>Alm Validated By Pass Percentage</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_CategoryIntValue <em>Alm Category Int Value</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_ModelledBy <em>Alm Modelled By</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_VerifiedBy <em>Alm Verified By</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_VerifiedByPassCount <em>Alm Verified By Pass Count</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_VerifiedByTraceCount <em>Alm Verified By Trace Count</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_VerifiedByPassPercentage <em>Alm Verified By Pass Percentage</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_ChangesAuthorizedBy <em>Alm Changes Authorized By</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_DecomposedFrom <em>Alm Decomposed From</em>}</li>
 *   <li>{@link integrity.Requirement#isAlm_ValidChangeOrder <em>Alm Valid Change Order</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_ValidatedByTraceHealth <em>Alm Validated By Trace Health</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_VerifiedByTraceHealth <em>Alm Verified By Trace Health</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_Text <em>Alm Text</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_ProjectState <em>Alm Project State</em>}</li>
 *   <li>{@link integrity.Requirement#getAlm_ProjectPhaseFVA <em>Alm Project Phase FVA</em>}</li>
 *   <li>{@link integrity.Requirement#getType <em>Type</em>}</li>
 *   <li>{@link integrity.Requirement#getID <em>ID</em>}</li>
 *   <li>{@link integrity.Requirement#getModifiedBy <em>Modified By</em>}</li>
 *   <li>{@link integrity.Requirement#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link integrity.Requirement#getModifiedDate <em>Modified Date</em>}</li>
 *   <li>{@link integrity.Requirement#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link integrity.Requirement#getCategory <em>Category</em>}</li>
 *   <li>{@link integrity.Requirement#getReferences <em>References</em>}</li>
 *   <li>{@link integrity.Requirement#getContains <em>Contains</em>}</li>
 *   <li>{@link integrity.Requirement#getContainedBy <em>Contained By</em>}</li>
 *   <li>{@link integrity.Requirement#getReferenceMode <em>Reference Mode</em>}</li>
 *   <li>{@link integrity.Requirement#getDocumentID <em>Document ID</em>}</li>
 *   <li>{@link integrity.Requirement#getReferencedItemType <em>Referenced Item Type</em>}</li>
 *   <li>{@link integrity.Requirement#getShares <em>Shares</em>}</li>
 *   <li>{@link integrity.Requirement#getSharedBy <em>Shared By</em>}</li>
 *   <li>{@link integrity.Requirement#getRootID <em>Root ID</em>}</li>
 *   <li>{@link integrity.Requirement#getInputRevisionDate <em>Input Revision Date</em>}</li>
 *   <li>{@link integrity.Requirement#getSignificantEditDate <em>Significant Edit Date</em>}</li>
 *   <li>{@link integrity.Requirement#isSignificantChangeSinceItemRevision <em>Significant Change Since Item Revision</em>}</li>
 *   <li>{@link integrity.Requirement#getRequirementDocument <em>Requirement Document</em>}</li>
 * </ul>
 * </p>
 *
 * @see integrity.IntegrityPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see integrity.IntegrityPackage#getRequirement_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' containment reference.
	 * @see #setProject(Project)
	 * @see integrity.IntegrityPackage#getRequirement_Project()
	 * @model containment="true"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getProject <em>Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' containment reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Attachments</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attachments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attachments</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_Attachments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getAttachments();

	/**
	 * Returns the value of the '<em><b>Parameter Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Values</em>' attribute.
	 * @see #setParameterValues(String)
	 * @see integrity.IntegrityPackage#getRequirement_ParameterValues()
	 * @model
	 * @generated
	 */
	String getParameterValues();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getParameterValues <em>Parameter Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Values</em>' attribute.
	 * @see #getParameterValues()
	 * @generated
	 */
	void setParameterValues(String value);

	/**
	 * Returns the value of the '<em><b>Alm Authorizing Change Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Authorizing Change Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Authorizing Change Order</em>' attribute.
	 * @see #setAlm_AuthorizingChangeOrder(int)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_AuthorizingChangeOrder()
	 * @model
	 * @generated
	 */
	int getAlm_AuthorizingChangeOrder();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_AuthorizingChangeOrder <em>Alm Authorizing Change Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Authorizing Change Order</em>' attribute.
	 * @see #getAlm_AuthorizingChangeOrder()
	 * @generated
	 */
	void setAlm_AuthorizingChangeOrder(int value);

	/**
	 * Returns the value of the '<em><b>Alm Suspect Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Suspect Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Suspect Count</em>' attribute.
	 * @see #setAlm_SuspectCount(int)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_SuspectCount()
	 * @model
	 * @generated
	 */
	int getAlm_SuspectCount();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_SuspectCount <em>Alm Suspect Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Suspect Count</em>' attribute.
	 * @see #getAlm_SuspectCount()
	 * @generated
	 */
	void setAlm_SuspectCount(int value);

	/**
	 * Returns the value of the '<em><b>Alm Include Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Include Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Include Reference</em>' attribute.
	 * @see #setAlm_IncludeReference(boolean)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_IncludeReference()
	 * @model
	 * @generated
	 */
	boolean isAlm_IncludeReference();

	/**
	 * Sets the value of the '{@link integrity.Requirement#isAlm_IncludeReference <em>Alm Include Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Include Reference</em>' attribute.
	 * @see #isAlm_IncludeReference()
	 * @generated
	 */
	void setAlm_IncludeReference(boolean value);

	/**
	 * Returns the value of the '<em><b>Alm Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Priority</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Priority</em>' attribute.
	 * @see #setAlm_Priority(String)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_Priority()
	 * @model
	 * @generated
	 */
	String getAlm_Priority();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_Priority <em>Alm Priority</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Priority</em>' attribute.
	 * @see #getAlm_Priority()
	 * @generated
	 */
	void setAlm_Priority(String value);

	/**
	 * Returns the value of the '<em><b>Alm Satisfied By</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Satisfied By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Satisfied By</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_Alm_SatisfiedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getAlm_SatisfiedBy();

	/**
	 * Returns the value of the '<em><b>Alm Validated By</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Validated By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Validated By</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_Alm_ValidatedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getAlm_ValidatedBy();

	/**
	 * Returns the value of the '<em><b>Alm Spawns</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Spawns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Spawns</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_Alm_Spawns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getAlm_Spawns();

	/**
	 * Returns the value of the '<em><b>Alm Decomposes To</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Decomposes To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Decomposes To</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_Alm_DecomposesTo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getAlm_DecomposesTo();

	/**
	 * Returns the value of the '<em><b>Alm Is Related To</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Is Related To</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Is Related To</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_Alm_IsRelatedTo()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getAlm_IsRelatedTo();

	/**
	 * Returns the value of the '<em><b>Alm Include Subsegmentin Metrics</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Include Subsegmentin Metrics</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Include Subsegmentin Metrics</em>' attribute.
	 * @see #setAlm_IncludeSubsegmentinMetrics(boolean)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_IncludeSubsegmentinMetrics()
	 * @model
	 * @generated
	 */
	boolean isAlm_IncludeSubsegmentinMetrics();

	/**
	 * Sets the value of the '{@link integrity.Requirement#isAlm_IncludeSubsegmentinMetrics <em>Alm Include Subsegmentin Metrics</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Include Subsegmentin Metrics</em>' attribute.
	 * @see #isAlm_IncludeSubsegmentinMetrics()
	 * @generated
	 */
	void setAlm_IncludeSubsegmentinMetrics(boolean value);

	/**
	 * Returns the value of the '<em><b>Alm Validated By Trace Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Validated By Trace Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Validated By Trace Count</em>' attribute.
	 * @see #setAlm_ValidatedByTraceCount(int)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_ValidatedByTraceCount()
	 * @model
	 * @generated
	 */
	int getAlm_ValidatedByTraceCount();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_ValidatedByTraceCount <em>Alm Validated By Trace Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Validated By Trace Count</em>' attribute.
	 * @see #getAlm_ValidatedByTraceCount()
	 * @generated
	 */
	void setAlm_ValidatedByTraceCount(int value);

	/**
	 * Returns the value of the '<em><b>Alm Trace Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Trace Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Trace Status</em>' attribute.
	 * @see #setAlm_TraceStatus(String)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_TraceStatus()
	 * @model
	 * @generated
	 */
	String getAlm_TraceStatus();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_TraceStatus <em>Alm Trace Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Trace Status</em>' attribute.
	 * @see #getAlm_TraceStatus()
	 * @generated
	 */
	void setAlm_TraceStatus(String value);

	/**
	 * Returns the value of the '<em><b>Alm Downstream Trace Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Downstream Trace Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Downstream Trace Count</em>' attribute.
	 * @see #setAlm_DownstreamTraceCount(int)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_DownstreamTraceCount()
	 * @model
	 * @generated
	 */
	int getAlm_DownstreamTraceCount();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_DownstreamTraceCount <em>Alm Downstream Trace Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Downstream Trace Count</em>' attribute.
	 * @see #getAlm_DownstreamTraceCount()
	 * @generated
	 */
	void setAlm_DownstreamTraceCount(int value);

	/**
	 * Returns the value of the '<em><b>Alm Upstream Trace Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Upstream Trace Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Upstream Trace Count</em>' attribute.
	 * @see #setAlm_UpstreamTraceCount(int)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_UpstreamTraceCount()
	 * @model
	 * @generated
	 */
	int getAlm_UpstreamTraceCount();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_UpstreamTraceCount <em>Alm Upstream Trace Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Upstream Trace Count</em>' attribute.
	 * @see #getAlm_UpstreamTraceCount()
	 * @generated
	 */
	void setAlm_UpstreamTraceCount(int value);

	/**
	 * Returns the value of the '<em><b>Alm Validated By Pass Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Validated By Pass Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Validated By Pass Count</em>' attribute.
	 * @see #setAlm_ValidatedByPassCount(int)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_ValidatedByPassCount()
	 * @model
	 * @generated
	 */
	int getAlm_ValidatedByPassCount();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_ValidatedByPassCount <em>Alm Validated By Pass Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Validated By Pass Count</em>' attribute.
	 * @see #getAlm_ValidatedByPassCount()
	 * @generated
	 */
	void setAlm_ValidatedByPassCount(int value);

	/**
	 * Returns the value of the '<em><b>Alm Validated By Pass Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Validated By Pass Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Validated By Pass Percentage</em>' attribute.
	 * @see #setAlm_ValidatedByPassPercentage(float)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_ValidatedByPassPercentage()
	 * @model
	 * @generated
	 */
	float getAlm_ValidatedByPassPercentage();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_ValidatedByPassPercentage <em>Alm Validated By Pass Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Validated By Pass Percentage</em>' attribute.
	 * @see #getAlm_ValidatedByPassPercentage()
	 * @generated
	 */
	void setAlm_ValidatedByPassPercentage(float value);

	/**
	 * Returns the value of the '<em><b>Alm Category Int Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Category Int Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Category Int Value</em>' attribute.
	 * @see #setAlm_CategoryIntValue(String)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_CategoryIntValue()
	 * @model
	 * @generated
	 */
	String getAlm_CategoryIntValue();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_CategoryIntValue <em>Alm Category Int Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Category Int Value</em>' attribute.
	 * @see #getAlm_CategoryIntValue()
	 * @generated
	 */
	void setAlm_CategoryIntValue(String value);

	/**
	 * Returns the value of the '<em><b>Alm Modelled By</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Modelled By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Modelled By</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_Alm_ModelledBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getAlm_ModelledBy();

	/**
	 * Returns the value of the '<em><b>Alm Verified By</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Verified By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Verified By</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_Alm_VerifiedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getAlm_VerifiedBy();

	/**
	 * Returns the value of the '<em><b>Alm Verified By Pass Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Verified By Pass Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Verified By Pass Count</em>' attribute.
	 * @see #setAlm_VerifiedByPassCount(int)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_VerifiedByPassCount()
	 * @model
	 * @generated
	 */
	int getAlm_VerifiedByPassCount();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_VerifiedByPassCount <em>Alm Verified By Pass Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Verified By Pass Count</em>' attribute.
	 * @see #getAlm_VerifiedByPassCount()
	 * @generated
	 */
	void setAlm_VerifiedByPassCount(int value);

	/**
	 * Returns the value of the '<em><b>Alm Verified By Trace Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Verified By Trace Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Verified By Trace Count</em>' attribute.
	 * @see #setAlm_VerifiedByTraceCount(int)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_VerifiedByTraceCount()
	 * @model
	 * @generated
	 */
	int getAlm_VerifiedByTraceCount();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_VerifiedByTraceCount <em>Alm Verified By Trace Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Verified By Trace Count</em>' attribute.
	 * @see #getAlm_VerifiedByTraceCount()
	 * @generated
	 */
	void setAlm_VerifiedByTraceCount(int value);

	/**
	 * Returns the value of the '<em><b>Alm Verified By Pass Percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Verified By Pass Percentage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Verified By Pass Percentage</em>' attribute.
	 * @see #setAlm_VerifiedByPassPercentage(float)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_VerifiedByPassPercentage()
	 * @model
	 * @generated
	 */
	float getAlm_VerifiedByPassPercentage();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_VerifiedByPassPercentage <em>Alm Verified By Pass Percentage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Verified By Pass Percentage</em>' attribute.
	 * @see #getAlm_VerifiedByPassPercentage()
	 * @generated
	 */
	void setAlm_VerifiedByPassPercentage(float value);

	/**
	 * Returns the value of the '<em><b>Alm Changes Authorized By</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Changes Authorized By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Changes Authorized By</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_Alm_ChangesAuthorizedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getAlm_ChangesAuthorizedBy();

	/**
	 * Returns the value of the '<em><b>Alm Decomposed From</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Decomposed From</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Decomposed From</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_Alm_DecomposedFrom()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getAlm_DecomposedFrom();

	/**
	 * Returns the value of the '<em><b>Alm Valid Change Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Valid Change Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Valid Change Order</em>' attribute.
	 * @see #setAlm_ValidChangeOrder(boolean)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_ValidChangeOrder()
	 * @model
	 * @generated
	 */
	boolean isAlm_ValidChangeOrder();

	/**
	 * Sets the value of the '{@link integrity.Requirement#isAlm_ValidChangeOrder <em>Alm Valid Change Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Valid Change Order</em>' attribute.
	 * @see #isAlm_ValidChangeOrder()
	 * @generated
	 */
	void setAlm_ValidChangeOrder(boolean value);

	/**
	 * Returns the value of the '<em><b>Alm Validated By Trace Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Validated By Trace Health</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Validated By Trace Health</em>' attribute.
	 * @see #setAlm_ValidatedByTraceHealth(String)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_ValidatedByTraceHealth()
	 * @model
	 * @generated
	 */
	String getAlm_ValidatedByTraceHealth();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_ValidatedByTraceHealth <em>Alm Validated By Trace Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Validated By Trace Health</em>' attribute.
	 * @see #getAlm_ValidatedByTraceHealth()
	 * @generated
	 */
	void setAlm_ValidatedByTraceHealth(String value);

	/**
	 * Returns the value of the '<em><b>Alm Verified By Trace Health</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Verified By Trace Health</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Verified By Trace Health</em>' attribute.
	 * @see #setAlm_VerifiedByTraceHealth(String)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_VerifiedByTraceHealth()
	 * @model
	 * @generated
	 */
	String getAlm_VerifiedByTraceHealth();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_VerifiedByTraceHealth <em>Alm Verified By Trace Health</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Verified By Trace Health</em>' attribute.
	 * @see #getAlm_VerifiedByTraceHealth()
	 * @generated
	 */
	void setAlm_VerifiedByTraceHealth(String value);

	/**
	 * Returns the value of the '<em><b>Alm Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Text</em>' attribute.
	 * @see #setAlm_Text(String)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_Text()
	 * @model
	 * @generated
	 */
	String getAlm_Text();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_Text <em>Alm Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Text</em>' attribute.
	 * @see #getAlm_Text()
	 * @generated
	 */
	void setAlm_Text(String value);

	/**
	 * Returns the value of the '<em><b>Alm Project State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Project State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Project State</em>' attribute.
	 * @see #setAlm_ProjectState(String)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_ProjectState()
	 * @model
	 * @generated
	 */
	String getAlm_ProjectState();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_ProjectState <em>Alm Project State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Project State</em>' attribute.
	 * @see #getAlm_ProjectState()
	 * @generated
	 */
	void setAlm_ProjectState(String value);

	/**
	 * Returns the value of the '<em><b>Alm Project Phase FVA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Project Phase FVA</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Project Phase FVA</em>' attribute.
	 * @see #setAlm_ProjectPhaseFVA(String)
	 * @see integrity.IntegrityPackage#getRequirement_Alm_ProjectPhaseFVA()
	 * @model
	 * @generated
	 */
	String getAlm_ProjectPhaseFVA();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getAlm_ProjectPhaseFVA <em>Alm Project Phase FVA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Project Phase FVA</em>' attribute.
	 * @see #getAlm_ProjectPhaseFVA()
	 * @generated
	 */
	void setAlm_ProjectPhaseFVA(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see integrity.IntegrityPackage#getRequirement_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(int)
	 * @see integrity.IntegrityPackage#getRequirement_ID()
	 * @model
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Returns the value of the '<em><b>Modified By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified By</em>' attribute.
	 * @see #setModifiedBy(String)
	 * @see integrity.IntegrityPackage#getRequirement_ModifiedBy()
	 * @model
	 * @generated
	 */
	String getModifiedBy();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getModifiedBy <em>Modified By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified By</em>' attribute.
	 * @see #getModifiedBy()
	 * @generated
	 */
	void setModifiedBy(String value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' attribute.
	 * @see #setCreatedBy(String)
	 * @see integrity.IntegrityPackage#getRequirement_CreatedBy()
	 * @model
	 * @generated
	 */
	String getCreatedBy();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getCreatedBy <em>Created By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' attribute.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(String value);

	/**
	 * Returns the value of the '<em><b>Modified Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modified Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modified Date</em>' attribute.
	 * @see #setModifiedDate(String)
	 * @see integrity.IntegrityPackage#getRequirement_ModifiedDate()
	 * @model
	 * @generated
	 */
	String getModifiedDate();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getModifiedDate <em>Modified Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modified Date</em>' attribute.
	 * @see #getModifiedDate()
	 * @generated
	 */
	void setModifiedDate(String value);

	/**
	 * Returns the value of the '<em><b>Created Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created Date</em>' attribute.
	 * @see #setCreatedDate(String)
	 * @see integrity.IntegrityPackage#getRequirement_CreatedDate()
	 * @model
	 * @generated
	 */
	String getCreatedDate();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(String value);

	/**
	 * Returns the value of the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' attribute.
	 * @see #setCategory(String)
	 * @see integrity.IntegrityPackage#getRequirement_Category()
	 * @model
	 * @generated
	 */
	String getCategory();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getCategory <em>Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' attribute.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(String value);

	/**
	 * Returns the value of the '<em><b>References</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>References</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>References</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_References()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getReferences();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getContains();

	/**
	 * Returns the value of the '<em><b>Contained By</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained By</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_ContainedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getContainedBy();

	/**
	 * Returns the value of the '<em><b>Reference Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Mode</em>' attribute.
	 * @see #setReferenceMode(String)
	 * @see integrity.IntegrityPackage#getRequirement_ReferenceMode()
	 * @model
	 * @generated
	 */
	String getReferenceMode();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getReferenceMode <em>Reference Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Mode</em>' attribute.
	 * @see #getReferenceMode()
	 * @generated
	 */
	void setReferenceMode(String value);

	/**
	 * Returns the value of the '<em><b>Document ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document ID</em>' attribute.
	 * @see #setDocumentID(int)
	 * @see integrity.IntegrityPackage#getRequirement_DocumentID()
	 * @model
	 * @generated
	 */
	int getDocumentID();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getDocumentID <em>Document ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document ID</em>' attribute.
	 * @see #getDocumentID()
	 * @generated
	 */
	void setDocumentID(int value);

	/**
	 * Returns the value of the '<em><b>Referenced Item Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Item Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Item Type</em>' attribute.
	 * @see #setReferencedItemType(String)
	 * @see integrity.IntegrityPackage#getRequirement_ReferencedItemType()
	 * @model
	 * @generated
	 */
	String getReferencedItemType();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getReferencedItemType <em>Referenced Item Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Item Type</em>' attribute.
	 * @see #getReferencedItemType()
	 * @generated
	 */
	void setReferencedItemType(String value);

	/**
	 * Returns the value of the '<em><b>Shares</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shares</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shares</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_Shares()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getShares();

	/**
	 * Returns the value of the '<em><b>Shared By</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shared By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shared By</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_SharedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getSharedBy();

	/**
	 * Returns the value of the '<em><b>Root ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root ID</em>' attribute.
	 * @see #setRootID(int)
	 * @see integrity.IntegrityPackage#getRequirement_RootID()
	 * @model
	 * @generated
	 */
	int getRootID();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getRootID <em>Root ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root ID</em>' attribute.
	 * @see #getRootID()
	 * @generated
	 */
	void setRootID(int value);

	/**
	 * Returns the value of the '<em><b>Input Revision Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input Revision Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Revision Date</em>' attribute.
	 * @see #setInputRevisionDate(String)
	 * @see integrity.IntegrityPackage#getRequirement_InputRevisionDate()
	 * @model
	 * @generated
	 */
	String getInputRevisionDate();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getInputRevisionDate <em>Input Revision Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Revision Date</em>' attribute.
	 * @see #getInputRevisionDate()
	 * @generated
	 */
	void setInputRevisionDate(String value);

	/**
	 * Returns the value of the '<em><b>Significant Edit Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Significant Edit Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Significant Edit Date</em>' attribute.
	 * @see #setSignificantEditDate(String)
	 * @see integrity.IntegrityPackage#getRequirement_SignificantEditDate()
	 * @model
	 * @generated
	 */
	String getSignificantEditDate();

	/**
	 * Sets the value of the '{@link integrity.Requirement#getSignificantEditDate <em>Significant Edit Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Significant Edit Date</em>' attribute.
	 * @see #getSignificantEditDate()
	 * @generated
	 */
	void setSignificantEditDate(String value);

	/**
	 * Returns the value of the '<em><b>Significant Change Since Item Revision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Significant Change Since Item Revision</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Significant Change Since Item Revision</em>' attribute.
	 * @see #setSignificantChangeSinceItemRevision(boolean)
	 * @see integrity.IntegrityPackage#getRequirement_SignificantChangeSinceItemRevision()
	 * @model
	 * @generated
	 */
	boolean isSignificantChangeSinceItemRevision();

	/**
	 * Sets the value of the '{@link integrity.Requirement#isSignificantChangeSinceItemRevision <em>Significant Change Since Item Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Significant Change Since Item Revision</em>' attribute.
	 * @see #isSignificantChangeSinceItemRevision()
	 * @generated
	 */
	void setSignificantChangeSinceItemRevision(boolean value);

	/**
	 * Returns the value of the '<em><b>Requirement Document</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.RequirementDocument}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement Document</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement Document</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirement_RequirementDocument()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementDocument> getRequirementDocument();

} // Requirement
