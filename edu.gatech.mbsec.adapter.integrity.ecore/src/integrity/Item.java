/**
 */
package integrity;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link integrity.Item#getID <em>ID</em>}</li>
 *   <li>{@link integrity.Item#getField <em>Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see integrity.IntegrityPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
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
	 * @see integrity.IntegrityPackage#getItem_ID()
	 * @model required="true"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link integrity.Item#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Field</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getItem_Field()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getField();

} // Item
