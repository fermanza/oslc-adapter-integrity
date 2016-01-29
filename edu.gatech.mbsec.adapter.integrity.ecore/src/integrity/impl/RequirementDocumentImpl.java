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
 * An implementation of the model object '<em><b>Requirement Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getState <em>State</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getProject <em>Project</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getAlm_SharedText <em>Alm Shared Text</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getAlm_DocumentShortTitle <em>Alm Document Short Title</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getID <em>ID</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getModifiedBy <em>Modified By</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getModifiedDate <em>Modified Date</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getCreatedDate <em>Created Date</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getType <em>Type</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getSignificantEditDate <em>Significant Edit Date</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#isSignificantChangeSinceItemRevision <em>Significant Change Since Item Revision</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getAlm_Documents <em>Alm Documents</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getContains <em>Contains</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getReferencedBy <em>Referenced By</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getAlm_ChangesAuthorizedBy <em>Alm Changes Authorized By</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getAlm_Spawns <em>Alm Spawns</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getAlm_SharedAttachments <em>Alm Shared Attachments</em>}</li>
 *   <li>{@link integrity.impl.RequirementDocumentImpl#getRequirement <em>Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementDocumentImpl extends MinimalEObjectImpl.Container implements RequirementDocument {
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
	 * The cached value of the '{@link #getProject() <em>Project</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProject()
	 * @generated
	 * @ordered
	 */
	protected Project project;
	/**
	 * The default value of the '{@link #getAlm_SharedText() <em>Alm Shared Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_SharedText()
	 * @generated
	 * @ordered
	 */
	protected static final String ALM_SHARED_TEXT_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAlm_SharedText() <em>Alm Shared Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_SharedText()
	 * @generated
	 * @ordered
	 */
	protected String alm_SharedText = ALM_SHARED_TEXT_EDEFAULT;
	/**
	 * The default value of the '{@link #getAlm_DocumentShortTitle() <em>Alm Document Short Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_DocumentShortTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String ALM_DOCUMENT_SHORT_TITLE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getAlm_DocumentShortTitle() <em>Alm Document Short Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_DocumentShortTitle()
	 * @generated
	 * @ordered
	 */
	protected String alm_DocumentShortTitle = ALM_DOCUMENT_SHORT_TITLE_EDEFAULT;
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
	 * The cached value of the '{@link #getAlm_Documents() <em>Alm Documents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_Documents()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> alm_Documents;
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
	 * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedBy()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> referencedBy;
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
	 * The cached value of the '{@link #getAlm_Spawns() <em>Alm Spawns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_Spawns()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> alm_Spawns;
	/**
	 * The cached value of the '{@link #getAlm_SharedAttachments() <em>Alm Shared Attachments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlm_SharedAttachments()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> alm_SharedAttachments;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntegrityPackage.Literals.REQUIREMENT_DOCUMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT_DOCUMENT__SUMMARY, oldSummary, summary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT_DOCUMENT__STATE, oldState, state));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT_DOCUMENT__PROJECT, oldProject, newProject);
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
				msgs = ((InternalEObject)project).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntegrityPackage.REQUIREMENT_DOCUMENT__PROJECT, null, msgs);
			if (newProject != null)
				msgs = ((InternalEObject)newProject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntegrityPackage.REQUIREMENT_DOCUMENT__PROJECT, null, msgs);
			msgs = basicSetProject(newProject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT_DOCUMENT__PROJECT, newProject, newProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlm_SharedText() {
		return alm_SharedText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_SharedText(String newAlm_SharedText) {
		String oldAlm_SharedText = alm_SharedText;
		alm_SharedText = newAlm_SharedText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SHARED_TEXT, oldAlm_SharedText, alm_SharedText));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlm_DocumentShortTitle() {
		return alm_DocumentShortTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlm_DocumentShortTitle(String newAlm_DocumentShortTitle) {
		String oldAlm_DocumentShortTitle = alm_DocumentShortTitle;
		alm_DocumentShortTitle = newAlm_DocumentShortTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_DOCUMENT_SHORT_TITLE, oldAlm_DocumentShortTitle, alm_DocumentShortTitle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT_DOCUMENT__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT_DOCUMENT__MODIFIED_BY, oldModifiedBy, modifiedBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT_DOCUMENT__CREATED_BY, oldCreatedBy, createdBy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT_DOCUMENT__MODIFIED_DATE, oldModifiedDate, modifiedDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT_DOCUMENT__CREATED_DATE, oldCreatedDate, createdDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT_DOCUMENT__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT_DOCUMENT__SIGNIFICANT_EDIT_DATE, oldSignificantEditDate, significantEditDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, IntegrityPackage.REQUIREMENT_DOCUMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION, oldSignificantChangeSinceItemRevision, significantChangeSinceItemRevision));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getAlm_Documents() {
		if (alm_Documents == null) {
			alm_Documents = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_DOCUMENTS);
		}
		return alm_Documents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT_DOCUMENT__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getReferencedBy() {
		if (referencedBy == null) {
			referencedBy = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT_DOCUMENT__REFERENCED_BY);
		}
		return referencedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getAlm_ChangesAuthorizedBy() {
		if (alm_ChangesAuthorizedBy == null) {
			alm_ChangesAuthorizedBy = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_CHANGES_AUTHORIZED_BY);
		}
		return alm_ChangesAuthorizedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getAlm_Spawns() {
		if (alm_Spawns == null) {
			alm_Spawns = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SPAWNS);
		}
		return alm_Spawns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Item> getAlm_SharedAttachments() {
		if (alm_SharedAttachments == null) {
			alm_SharedAttachments = new EObjectContainmentEList<Item>(Item.class, this, IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SHARED_ATTACHMENTS);
		}
		return alm_SharedAttachments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getRequirement() {
		if (requirement == null) {
			requirement = new EObjectContainmentEList<Requirement>(Requirement.class, this, IntegrityPackage.REQUIREMENT_DOCUMENT__REQUIREMENT);
		}
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntegrityPackage.REQUIREMENT_DOCUMENT__PROJECT:
				return basicSetProject(null, msgs);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_DOCUMENTS:
				return ((InternalEList<?>)getAlm_Documents()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__REFERENCED_BY:
				return ((InternalEList<?>)getReferencedBy()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_CHANGES_AUTHORIZED_BY:
				return ((InternalEList<?>)getAlm_ChangesAuthorizedBy()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SPAWNS:
				return ((InternalEList<?>)getAlm_Spawns()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SHARED_ATTACHMENTS:
				return ((InternalEList<?>)getAlm_SharedAttachments()).basicRemove(otherEnd, msgs);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__REQUIREMENT:
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
			case IntegrityPackage.REQUIREMENT_DOCUMENT__SUMMARY:
				return getSummary();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__STATE:
				return getState();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__PROJECT:
				return getProject();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SHARED_TEXT:
				return getAlm_SharedText();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_DOCUMENT_SHORT_TITLE:
				return getAlm_DocumentShortTitle();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ID:
				return getID();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__MODIFIED_BY:
				return getModifiedBy();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__CREATED_BY:
				return getCreatedBy();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__MODIFIED_DATE:
				return getModifiedDate();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__CREATED_DATE:
				return getCreatedDate();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__TYPE:
				return getType();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__SIGNIFICANT_EDIT_DATE:
				return getSignificantEditDate();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION:
				return isSignificantChangeSinceItemRevision();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_DOCUMENTS:
				return getAlm_Documents();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__CONTAINS:
				return getContains();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__REFERENCED_BY:
				return getReferencedBy();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_CHANGES_AUTHORIZED_BY:
				return getAlm_ChangesAuthorizedBy();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SPAWNS:
				return getAlm_Spawns();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SHARED_ATTACHMENTS:
				return getAlm_SharedAttachments();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__REQUIREMENT:
				return getRequirement();
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
			case IntegrityPackage.REQUIREMENT_DOCUMENT__SUMMARY:
				setSummary((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__STATE:
				setState((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__PROJECT:
				setProject((Project)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SHARED_TEXT:
				setAlm_SharedText((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_DOCUMENT_SHORT_TITLE:
				setAlm_DocumentShortTitle((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ID:
				setID((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__MODIFIED_BY:
				setModifiedBy((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__CREATED_BY:
				setCreatedBy((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__MODIFIED_DATE:
				setModifiedDate((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__CREATED_DATE:
				setCreatedDate((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__TYPE:
				setType((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__SIGNIFICANT_EDIT_DATE:
				setSignificantEditDate((String)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION:
				setSignificantChangeSinceItemRevision((Boolean)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_DOCUMENTS:
				getAlm_Documents().clear();
				getAlm_Documents().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__REFERENCED_BY:
				getReferencedBy().clear();
				getReferencedBy().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_CHANGES_AUTHORIZED_BY:
				getAlm_ChangesAuthorizedBy().clear();
				getAlm_ChangesAuthorizedBy().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SPAWNS:
				getAlm_Spawns().clear();
				getAlm_Spawns().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SHARED_ATTACHMENTS:
				getAlm_SharedAttachments().clear();
				getAlm_SharedAttachments().addAll((Collection<? extends Item>)newValue);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__REQUIREMENT:
				getRequirement().clear();
				getRequirement().addAll((Collection<? extends Requirement>)newValue);
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
			case IntegrityPackage.REQUIREMENT_DOCUMENT__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__STATE:
				setState(STATE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__PROJECT:
				setProject((Project)null);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SHARED_TEXT:
				setAlm_SharedText(ALM_SHARED_TEXT_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_DOCUMENT_SHORT_TITLE:
				setAlm_DocumentShortTitle(ALM_DOCUMENT_SHORT_TITLE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ID:
				setID(ID_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__MODIFIED_BY:
				setModifiedBy(MODIFIED_BY_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__CREATED_BY:
				setCreatedBy(CREATED_BY_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__MODIFIED_DATE:
				setModifiedDate(MODIFIED_DATE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__CREATED_DATE:
				setCreatedDate(CREATED_DATE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__SIGNIFICANT_EDIT_DATE:
				setSignificantEditDate(SIGNIFICANT_EDIT_DATE_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION:
				setSignificantChangeSinceItemRevision(SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION_EDEFAULT);
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_DOCUMENTS:
				getAlm_Documents().clear();
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__CONTAINS:
				getContains().clear();
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__REFERENCED_BY:
				getReferencedBy().clear();
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_CHANGES_AUTHORIZED_BY:
				getAlm_ChangesAuthorizedBy().clear();
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SPAWNS:
				getAlm_Spawns().clear();
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SHARED_ATTACHMENTS:
				getAlm_SharedAttachments().clear();
				return;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__REQUIREMENT:
				getRequirement().clear();
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
			case IntegrityPackage.REQUIREMENT_DOCUMENT__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__STATE:
				return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__PROJECT:
				return project != null;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SHARED_TEXT:
				return ALM_SHARED_TEXT_EDEFAULT == null ? alm_SharedText != null : !ALM_SHARED_TEXT_EDEFAULT.equals(alm_SharedText);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_DOCUMENT_SHORT_TITLE:
				return ALM_DOCUMENT_SHORT_TITLE_EDEFAULT == null ? alm_DocumentShortTitle != null : !ALM_DOCUMENT_SHORT_TITLE_EDEFAULT.equals(alm_DocumentShortTitle);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__MODIFIED_BY:
				return MODIFIED_BY_EDEFAULT == null ? modifiedBy != null : !MODIFIED_BY_EDEFAULT.equals(modifiedBy);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__CREATED_BY:
				return CREATED_BY_EDEFAULT == null ? createdBy != null : !CREATED_BY_EDEFAULT.equals(createdBy);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__MODIFIED_DATE:
				return MODIFIED_DATE_EDEFAULT == null ? modifiedDate != null : !MODIFIED_DATE_EDEFAULT.equals(modifiedDate);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__CREATED_DATE:
				return CREATED_DATE_EDEFAULT == null ? createdDate != null : !CREATED_DATE_EDEFAULT.equals(createdDate);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__SIGNIFICANT_EDIT_DATE:
				return SIGNIFICANT_EDIT_DATE_EDEFAULT == null ? significantEditDate != null : !SIGNIFICANT_EDIT_DATE_EDEFAULT.equals(significantEditDate);
			case IntegrityPackage.REQUIREMENT_DOCUMENT__SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION:
				return significantChangeSinceItemRevision != SIGNIFICANT_CHANGE_SINCE_ITEM_REVISION_EDEFAULT;
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_DOCUMENTS:
				return alm_Documents != null && !alm_Documents.isEmpty();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__CONTAINS:
				return contains != null && !contains.isEmpty();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__REFERENCED_BY:
				return referencedBy != null && !referencedBy.isEmpty();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_CHANGES_AUTHORIZED_BY:
				return alm_ChangesAuthorizedBy != null && !alm_ChangesAuthorizedBy.isEmpty();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SPAWNS:
				return alm_Spawns != null && !alm_Spawns.isEmpty();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__ALM_SHARED_ATTACHMENTS:
				return alm_SharedAttachments != null && !alm_SharedAttachments.isEmpty();
			case IntegrityPackage.REQUIREMENT_DOCUMENT__REQUIREMENT:
				return requirement != null && !requirement.isEmpty();
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
		result.append(", alm_SharedText: ");
		result.append(alm_SharedText);
		result.append(", alm_DocumentShortTitle: ");
		result.append(alm_DocumentShortTitle);
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
		result.append(", type: ");
		result.append(type);
		result.append(", significantEditDate: ");
		result.append(significantEditDate);
		result.append(", significantChangeSinceItemRevision: ");
		result.append(significantChangeSinceItemRevision);
		result.append(')');
		return result.toString();
	}

} //RequirementDocumentImpl
