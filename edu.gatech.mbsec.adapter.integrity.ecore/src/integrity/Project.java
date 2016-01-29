/**
 */
package integrity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link integrity.Project#getRequirementDocument <em>Requirement Document</em>}</li>
 *   <li>{@link integrity.Project#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link integrity.Project#getSummary <em>Summary</em>}</li>
 *   <li>{@link integrity.Project#getState <em>State</em>}</li>
 *   <li>{@link integrity.Project#getID <em>ID</em>}</li>
 *   <li>{@link integrity.Project#getModifiedBy <em>Modified By</em>}</li>
 *   <li>{@link integrity.Project#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link integrity.Project#getModifiedDate <em>Modified Date</em>}</li>
 *   <li>{@link integrity.Project#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link integrity.Project#getName <em>Name</em>}</li>
 *   <li>{@link integrity.Project#getType <em>Type</em>}</li>
 *   <li>{@link integrity.Project#getAlm_Description <em>Alm Description</em>}</li>
 *   <li>{@link integrity.Project#getSignificantEditDate <em>Significant Edit Date</em>}</li>
 *   <li>{@link integrity.Project#getProject <em>Project</em>}</li>
 *   <li>{@link integrity.Project#getAlm_ProductManager <em>Alm Product Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see integrity.IntegrityPackage#getProject()
 * @model
 * @generated
 */
public interface Project extends EObject {
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
	 * @see integrity.IntegrityPackage#getProject_RequirementDocument()
	 * @model containment="true"
	 * @generated
	 */
	EList<RequirementDocument> getRequirementDocument();

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
	 * @see integrity.IntegrityPackage#getProject_Requirement()
	 * @model containment="true"
	 * @generated
	 */
	EList<Requirement> getRequirement();

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
	 * @see integrity.IntegrityPackage#getProject_Summary()
	 * @model required="true"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link integrity.Project#getSummary <em>Summary</em>}' attribute.
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
	 * @see integrity.IntegrityPackage#getProject_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link integrity.Project#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

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
	 * @see integrity.IntegrityPackage#getProject_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link integrity.Project#getID <em>ID</em>}' attribute.
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
	 * @see integrity.IntegrityPackage#getProject_ModifiedBy()
	 * @model required="true"
	 * @generated
	 */
	String getModifiedBy();

	/**
	 * Sets the value of the '{@link integrity.Project#getModifiedBy <em>Modified By</em>}' attribute.
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
	 * @see integrity.IntegrityPackage#getProject_CreatedBy()
	 * @model required="true"
	 * @generated
	 */
	String getCreatedBy();

	/**
	 * Sets the value of the '{@link integrity.Project#getCreatedBy <em>Created By</em>}' attribute.
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
	 * @see integrity.IntegrityPackage#getProject_ModifiedDate()
	 * @model required="true"
	 * @generated
	 */
	String getModifiedDate();

	/**
	 * Sets the value of the '{@link integrity.Project#getModifiedDate <em>Modified Date</em>}' attribute.
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
	 * @see integrity.IntegrityPackage#getProject_CreatedDate()
	 * @model required="true"
	 * @generated
	 */
	String getCreatedDate();

	/**
	 * Sets the value of the '{@link integrity.Project#getCreatedDate <em>Created Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created Date</em>' attribute.
	 * @see #getCreatedDate()
	 * @generated
	 */
	void setCreatedDate(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see integrity.IntegrityPackage#getProject_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link integrity.Project#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see integrity.IntegrityPackage#getProject_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link integrity.Project#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Alm Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Description</em>' attribute.
	 * @see #setAlm_Description(String)
	 * @see integrity.IntegrityPackage#getProject_Alm_Description()
	 * @model
	 * @generated
	 */
	String getAlm_Description();

	/**
	 * Sets the value of the '{@link integrity.Project#getAlm_Description <em>Alm Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Description</em>' attribute.
	 * @see #getAlm_Description()
	 * @generated
	 */
	void setAlm_Description(String value);

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
	 * @see integrity.IntegrityPackage#getProject_SignificantEditDate()
	 * @model
	 * @generated
	 */
	String getSignificantEditDate();

	/**
	 * Sets the value of the '{@link integrity.Project#getSignificantEditDate <em>Significant Edit Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Significant Edit Date</em>' attribute.
	 * @see #getSignificantEditDate()
	 * @generated
	 */
	void setSignificantEditDate(String value);

	/**
	 * Returns the value of the '<em><b>Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' attribute.
	 * @see #setProject(String)
	 * @see integrity.IntegrityPackage#getProject_Project()
	 * @model
	 * @generated
	 */
	String getProject();

	/**
	 * Sets the value of the '{@link integrity.Project#getProject <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Project</em>' attribute.
	 * @see #getProject()
	 * @generated
	 */
	void setProject(String value);

	/**
	 * Returns the value of the '<em><b>Alm Product Manager</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alm Product Manager</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alm Product Manager</em>' attribute.
	 * @see #setAlm_ProductManager(String)
	 * @see integrity.IntegrityPackage#getProject_Alm_ProductManager()
	 * @model
	 * @generated
	 */
	String getAlm_ProductManager();

	/**
	 * Sets the value of the '{@link integrity.Project#getAlm_ProductManager <em>Alm Product Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alm Product Manager</em>' attribute.
	 * @see #getAlm_ProductManager()
	 * @generated
	 */
	void setAlm_ProductManager(String value);

} // Project
