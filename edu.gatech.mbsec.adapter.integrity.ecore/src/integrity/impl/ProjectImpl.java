/**
 */
package integrity.impl;

import integrity.IntegrityPackage;
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
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link integrity.impl.ProjectImpl#getRequirementDocument <em>Requirement Document</em>}</li>
 *   <li>{@link integrity.impl.ProjectImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link integrity.impl.ProjectImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link integrity.impl.ProjectImpl#getState <em>State</em>}</li>
 *   <li>{@link integrity.impl.ProjectImpl#getID <em>ID</em>}</li>
 *   <li>{@link integrity.impl.ProjectImpl#getModifiedBy <em>Modified By</em>}</li>
 *   <li>{@link integrity.impl.ProjectImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link integrity.impl.ProjectImpl#getModifiedDate <em>Modified Date</em>}</li>
 *   <li>{@link integrity.impl.ProjectImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link integrity.impl.ProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link integrity.impl.ProjectImpl#getType <em>Type</em>}</li>
 *   <li>{@link integrity.impl.ProjectImpl#getAlm_Description <em>Alm Description</em>}</li>
 *   <li>{@link integrity.impl.ProjectImpl#getSignificantEditDate <em>Significant Edit Date</em>}</li>
 *   <li>{@link integrity.impl.ProjectImpl#getProject <em>Project</em>}</li>
 *   <li>{@link integrity.impl.ProjectImpl#getAlm_ProductManager <em>Alm Product Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProjectImpl extends MinimalEObjectImpl.Container implements Project {
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
	 * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> requirement;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

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
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getAlm_Description() <em>Alm Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_Description()
	 * @generated
	 * @ordered
	 */
	protected static final String ALM_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlm_Description() <em>Alm Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_Description()
	 * @generated
	 * @ordered
	 */
	protected String alm_Description = ALM_DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected static final String PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProject() <em>Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected String project = PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlm_ProductManager() <em>Alm Product Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ProductManager()
	 * @generated
	 * @ordered
	 */
	protected static final String ALM_PRODUCT_MANAGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlm_ProductManager() <em>Alm Product Manager</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_ProductManager()
	 * @generated
	 * @ordered
	 */
	protected String alm_ProductManager = ALM_PRODUCT_MANAGER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntegrityPackage.Literals.PROJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequirementDocument> getRequirementDocument() {
		if (requirementDocument == null) {
			requirementDocument = new EObjectContainmentEList<RequirementDocument>(RequirementDocument.class, this, IntegrityPackage.PROJECT__REQUIREMENT_DOCUMENT);
		}
		return requirementDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirement() {
		if (requirement == null) {
			requirement = new EObjectContainmentEList<Requirement>(Requirement.class, this, IntegrityPackage.PROJECT__REQUIREMENT);
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.PROJECT__SUMMARY, oldSummary, summary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.PROJECT__STATE, oldState, state));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.PROJECT__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.PROJECT__MODIFIED_BY, oldModifiedBy, modifiedBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.PROJECT__CREATED_BY, oldCreatedBy, createdBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.PROJECT__MODIFIED_DATE, oldModifiedDate, modifiedDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.PROJECT__CREATED_DATE, oldCreatedDate, createdDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.PROJECT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.PROJECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlm_Description() {
		return alm_Description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_Description(String newAlm_Description) {
		String oldAlm_Description = alm_Description;
		alm_Description = newAlm_Description;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.PROJECT__ALM_DESCRIPTION, oldAlm_Description, alm_Description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.PROJECT__SIGNIFICANT_EDIT_DATE, oldSignificantEditDate, significantEditDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProject() {
		return project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProject(String newProject) {
		String oldProject = project;
		project = newProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.PROJECT__PROJECT, oldProject, project));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlm_ProductManager() {
		return alm_ProductManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_ProductManager(String newAlm_ProductManager) {
		String oldAlm_ProductManager = alm_ProductManager;
		alm_ProductManager = newAlm_ProductManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.PROJECT__ALM_PRODUCT_MANAGER, oldAlm_ProductManager, alm_ProductManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntegrityPackage.PROJECT__REQUIREMENT_DOCUMENT:
				return ((InternalEList<?>)getRequirementDocument()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.PROJECT__REQUIREMENT:
				return ((InternalEList<?>)getRequirement()).basicRemove(otherEnd, msgs);
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
			case IntegrityPackage.PROJECT__REQUIREMENT_DOCUMENT:
				return getRequirementDocument();
			case IntegrityPackage.PROJECT__REQUIREMENT:
				return getRequirement();
			case IntegrityPackage.PROJECT__SUMMARY:
				return getSummary();
			case IntegrityPackage.PROJECT__STATE:
				return getState();
			case IntegrityPackage.PROJECT__ID:
				return getID();
			case IntegrityPackage.PROJECT__MODIFIED_BY:
				return getModifiedBy();
			case IntegrityPackage.PROJECT__CREATED_BY:
				return getCreatedBy();
			case IntegrityPackage.PROJECT__MODIFIED_DATE:
				return getModifiedDate();
			case IntegrityPackage.PROJECT__CREATED_DATE:
				return getCreatedDate();
			case IntegrityPackage.PROJECT__NAME:
				return getName();
			case IntegrityPackage.PROJECT__TYPE:
				return getType();
			case IntegrityPackage.PROJECT__ALM_DESCRIPTION:
				return getAlm_Description();
			case IntegrityPackage.PROJECT__SIGNIFICANT_EDIT_DATE:
				return getSignificantEditDate();
			case IntegrityPackage.PROJECT__PROJECT:
				return getProject();
			case IntegrityPackage.PROJECT__ALM_PRODUCT_MANAGER:
				return getAlm_ProductManager();
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
			case IntegrityPackage.PROJECT__REQUIREMENT_DOCUMENT:
				getRequirementDocument().clear();
				getRequirementDocument().addAll((Collection<? extends RequirementDocument>)newValue);
				return;
			case IntegrityPackage.PROJECT__REQUIREMENT:
				getRequirement().clear();
				getRequirement().addAll((Collection<? extends Requirement>)newValue);
				return;
			case IntegrityPackage.PROJECT__SUMMARY:
				setSummary((String)newValue);
				return;
			case IntegrityPackage.PROJECT__STATE:
				setState((String)newValue);
				return;
			case IntegrityPackage.PROJECT__ID:
				setID((String)newValue);
				return;
			case IntegrityPackage.PROJECT__MODIFIED_BY:
				setModifiedBy((String)newValue);
				return;
			case IntegrityPackage.PROJECT__CREATED_BY:
				setCreatedBy((String)newValue);
				return;
			case IntegrityPackage.PROJECT__MODIFIED_DATE:
				setModifiedDate((String)newValue);
				return;
			case IntegrityPackage.PROJECT__CREATED_DATE:
				setCreatedDate((String)newValue);
				return;
			case IntegrityPackage.PROJECT__NAME:
				setName((String)newValue);
				return;
			case IntegrityPackage.PROJECT__TYPE:
				setType((String)newValue);
				return;
			case IntegrityPackage.PROJECT__ALM_DESCRIPTION:
				setAlm_Description((String)newValue);
				return;
			case IntegrityPackage.PROJECT__SIGNIFICANT_EDIT_DATE:
				setSignificantEditDate((String)newValue);
				return;
			case IntegrityPackage.PROJECT__PROJECT:
				setProject((String)newValue);
				return;
			case IntegrityPackage.PROJECT__ALM_PRODUCT_MANAGER:
				setAlm_ProductManager((String)newValue);
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
			case IntegrityPackage.PROJECT__REQUIREMENT_DOCUMENT:
				getRequirementDocument().clear();
				return;
			case IntegrityPackage.PROJECT__REQUIREMENT:
				getRequirement().clear();
				return;
			case IntegrityPackage.PROJECT__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case IntegrityPackage.PROJECT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case IntegrityPackage.PROJECT__ID:
				setID(ID_EDEFAULT);
				return;
			case IntegrityPackage.PROJECT__MODIFIED_BY:
				setModifiedBy(MODIFIED_BY_EDEFAULT);
				return;
			case IntegrityPackage.PROJECT__CREATED_BY:
				setCreatedBy(CREATED_BY_EDEFAULT);
				return;
			case IntegrityPackage.PROJECT__MODIFIED_DATE:
				setModifiedDate(MODIFIED_DATE_EDEFAULT);
				return;
			case IntegrityPackage.PROJECT__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case IntegrityPackage.PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case IntegrityPackage.PROJECT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case IntegrityPackage.PROJECT__ALM_DESCRIPTION:
				setAlm_Description(ALM_DESCRIPTION_EDEFAULT);
				return;
			case IntegrityPackage.PROJECT__SIGNIFICANT_EDIT_DATE:
				setSignificantEditDate(SIGNIFICANT_EDIT_DATE_EDEFAULT);
				return;
			case IntegrityPackage.PROJECT__PROJECT:
				setProject(PROJECT_EDEFAULT);
				return;
			case IntegrityPackage.PROJECT__ALM_PRODUCT_MANAGER:
				setAlm_ProductManager(ALM_PRODUCT_MANAGER_EDEFAULT);
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
			case IntegrityPackage.PROJECT__REQUIREMENT_DOCUMENT:
				return requirementDocument != null && !requirementDocument.isEmpty();
			case IntegrityPackage.PROJECT__REQUIREMENT:
				return requirement != null && !requirement.isEmpty();
			case IntegrityPackage.PROJECT__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case IntegrityPackage.PROJECT__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case IntegrityPackage.PROJECT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IntegrityPackage.PROJECT__MODIFIED_BY:
				return MODIFIED_BY_EDEFAULT == null ? modifiedBy != null : !MODIFIED_BY_EDEFAULT.equals(modifiedBy);
			case IntegrityPackage.PROJECT__CREATED_BY:
				return CREATED_BY_EDEFAULT == null ? createdBy != null : !CREATED_BY_EDEFAULT.equals(createdBy);
			case IntegrityPackage.PROJECT__MODIFIED_DATE:
				return MODIFIED_DATE_EDEFAULT == null ? modifiedDate != null : !MODIFIED_DATE_EDEFAULT.equals(modifiedDate);
			case IntegrityPackage.PROJECT__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case IntegrityPackage.PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case IntegrityPackage.PROJECT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case IntegrityPackage.PROJECT__ALM_DESCRIPTION:
				return ALM_DESCRIPTION_EDEFAULT == null ? alm_Description != null : !ALM_DESCRIPTION_EDEFAULT.equals(alm_Description);
			case IntegrityPackage.PROJECT__SIGNIFICANT_EDIT_DATE:
				return SIGNIFICANT_EDIT_DATE_EDEFAULT == null ? significantEditDate != null : !SIGNIFICANT_EDIT_DATE_EDEFAULT.equals(significantEditDate);
			case IntegrityPackage.PROJECT__PROJECT:
				return PROJECT_EDEFAULT == null ? project != null : !PROJECT_EDEFAULT.equals(project);
			case IntegrityPackage.PROJECT__ALM_PRODUCT_MANAGER:
				return ALM_PRODUCT_MANAGER_EDEFAULT == null ? alm_ProductManager != null : !ALM_PRODUCT_MANAGER_EDEFAULT.equals(alm_ProductManager);
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
		result.append(" (summary: ");
		result.append(summary);
		result.append(", state: ");
		result.append(state);
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
		result.append(", name: ");
		result.append(name);
		result.append(", type: ");
		result.append(type);
		result.append(", alm_Description: ");
		result.append(alm_Description);
		result.append(", significantEditDate: ");
		result.append(significantEditDate);
		result.append(", project: ");
		result.append(project);
		result.append(", alm_ProductManager: ");
		result.append(alm_ProductManager);
		result.append(')');
		return result.toString();
	}

} //ProjectImpl
