/**
 */
package integrity;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link integrity.RequirementDocument#getSummary <em>Summary</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getState <em>State</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getProject <em>Project</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getAlm_SharedText <em>Alm Shared Text</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getAlm_DocumentShortTitle <em>Alm Document Short Title</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getID <em>ID</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getModifiedBy <em>Modified By</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getModifiedDate <em>Modified Date</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getType <em>Type</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getSignificantEditDate <em>Significant Edit Date</em>}</li>
 *   <li>{@link integrity.RequirementDocument#isSignificantChangeSinceItemRevision <em>Significant Change Since Item Revision</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getAlm_Documents <em>Alm Documents</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getContains <em>Contains</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getReferencedBy <em>Referenced By</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getAlm_ChangesAuthorizedBy <em>Alm Changes Authorized By</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getAlm_Spawns <em>Alm Spawns</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getAlm_SharedAttachments <em>Alm Shared Attachments</em>}</li>
 *   <li>{@link integrity.RequirementDocument#getRequirement <em>Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see integrity.IntegrityPackage#getRequirementDocument()
 * @model
 * @generated
 */
public interface RequirementDocument extends EObject {

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see integrity.IntegrityPackage#getRequirementDocument_Summary()
	 * @model required="true"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link integrity.RequirementDocument#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

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
	 * @see integrity.IntegrityPackage#getRequirementDocument_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link integrity.RequirementDocument#getState <em>State</em>}' attribute.
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
	 * If the meaning of the '<em>Project</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' containment reference.
	 * @see #setProject(Project)
	 * @see integrity.IntegrityPackage#getRequirementDocument_Project()
	 * @model containment="true"
	 * @generated
	 */
	Project getProject();

	/**
	 * Sets the value of the '{@link integrity.RequirementDocument#getProject <em>Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' containment reference.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(Project value);

	/**
	 * Returns the value of the '<em><b>Alm Shared Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Shared Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Shared Text</em>' attribute.
	 * @see #setAlm_SharedText(String)
	 * @see integrity.IntegrityPackage#getRequirementDocument_Alm_SharedText()
	 * @model
	 * @generated
	 */
	String getAlm_SharedText();

	/**
	 * Sets the value of the '{@link integrity.RequirementDocument#getAlm_SharedText <em>Alm Shared Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Shared Text</em>' attribute.
	 * @see #getAlm_SharedText()
	 * @generated
	 */
	void setAlm_SharedText(String value);

	/**
	 * Returns the value of the '<em><b>Alm Document Short Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Document Short Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Document Short Title</em>' attribute.
	 * @see #setAlm_DocumentShortTitle(String)
	 * @see integrity.IntegrityPackage#getRequirementDocument_Alm_DocumentShortTitle()
	 * @model
	 * @generated
	 */
	String getAlm_DocumentShortTitle();

	/**
	 * Sets the value of the '{@link integrity.RequirementDocument#getAlm_DocumentShortTitle <em>Alm Document Short Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Document Short Title</em>' attribute.
	 * @see #getAlm_DocumentShortTitle()
	 * @generated
	 */
	void setAlm_DocumentShortTitle(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see integrity.IntegrityPackage#getRequirementDocument_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link integrity.RequirementDocument#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

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
	 * @see integrity.IntegrityPackage#getRequirementDocument_ModifiedBy()
	 * @model required="true"
	 * @generated
	 */
	String getModifiedBy();

	/**
	 * Sets the value of the '{@link integrity.RequirementDocument#getModifiedBy <em>Modified By</em>}' attribute.
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
	 * @see integrity.IntegrityPackage#getRequirementDocument_CreatedBy()
	 * @model required="true"
	 * @generated
	 */
	String getCreatedBy();

	/**
	 * Sets the value of the '{@link integrity.RequirementDocument#getCreatedBy <em>Created By</em>}' attribute.
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
	 * @see integrity.IntegrityPackage#getRequirementDocument_ModifiedDate()
	 * @model required="true"
	 * @generated
	 */
	String getModifiedDate();

	/**
	 * Sets the value of the '{@link integrity.RequirementDocument#getModifiedDate <em>Modified Date</em>}' attribute.
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
	 * @see integrity.IntegrityPackage#getRequirementDocument_CreatedDate()
	 * @model required="true"
	 * @generated
	 */
	String getCreatedDate();

	/**
	 * Sets the value of the '{@link integrity.RequirementDocument#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(String value);

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
	 * @see integrity.IntegrityPackage#getRequirementDocument_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link integrity.RequirementDocument#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

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
	 * @see integrity.IntegrityPackage#getRequirementDocument_SignificantEditDate()
	 * @model
	 * @generated
	 */
	String getSignificantEditDate();

	/**
	 * Sets the value of the '{@link integrity.RequirementDocument#getSignificantEditDate <em>Significant Edit Date</em>}' attribute.
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
	 * @see integrity.IntegrityPackage#getRequirementDocument_SignificantChangeSinceItemRevision()
	 * @model
	 * @generated
	 */
	boolean isSignificantChangeSinceItemRevision();

	/**
	 * Sets the value of the '{@link integrity.RequirementDocument#isSignificantChangeSinceItemRevision <em>Significant Change Since Item Revision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Significant Change Since Item Revision</em>' attribute.
	 * @see #isSignificantChangeSinceItemRevision()
	 * @generated
	 */
	void setSignificantChangeSinceItemRevision(boolean value);

	/**
	 * Returns the value of the '<em><b>Alm Documents</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Documents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Documents</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirementDocument_Alm_Documents()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getAlm_Documents();

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
	 * @see integrity.IntegrityPackage#getRequirementDocument_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getContains();

	/**
	 * Returns the value of the '<em><b>Referenced By</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced By</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirementDocument_ReferencedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getReferencedBy();

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
	 * @see integrity.IntegrityPackage#getRequirementDocument_Alm_ChangesAuthorizedBy()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getAlm_ChangesAuthorizedBy();

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
	 * @see integrity.IntegrityPackage#getRequirementDocument_Alm_Spawns()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getAlm_Spawns();

	/**
	 * Returns the value of the '<em><b>Alm Shared Attachments</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Item}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Shared Attachments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Shared Attachments</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirementDocument_Alm_SharedAttachments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getAlm_SharedAttachments();

	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Requirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getRequirementDocument_Requirement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirement();
} // RequirementDocument
