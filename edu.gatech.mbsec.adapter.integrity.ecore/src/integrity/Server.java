/**
 */
package integrity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link integrity.Server#getProject <em>Project</em>}</li>
 * </ul>
 * </p>
 *
 * @see integrity.IntegrityPackage#getServer()
 * @model
 * @generated
 */
public interface Server extends EObject {
	/**
	 * Returns the value of the '<em><b>Project</b></em>' containment reference list.
	 * The list contents are of type {@link integrity.Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Project</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' containment reference list.
	 * @see integrity.IntegrityPackage#getServer_Project()
	 * @model containment="true"
	 * @generated
	 */
	EList<Project> getProject();

} // Server
