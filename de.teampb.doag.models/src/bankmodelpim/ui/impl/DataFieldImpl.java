/**
 */
package bankmodelpim.ui.impl;

import bankmodelpim.domain.PIMBankObject;
import bankmodelpim.ui.DataField;
import bankmodelpim.ui.Type;
import bankmodelpim.ui.UiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Field</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bankmodelpim.ui.impl.DataFieldImpl#getType <em>Type</em>}</li>
 *   <li>{@link bankmodelpim.ui.impl.DataFieldImpl#getName <em>Name</em>}</li>
 *   <li>{@link bankmodelpim.ui.impl.DataFieldImpl#getDomainObjectRef <em>Domain Object Ref</em>}</li>
 *   <li>{@link bankmodelpim.ui.impl.DataFieldImpl#getObjectRefName <em>Object Ref Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataFieldImpl extends MinimalEObjectImpl.Container implements DataField {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.CHAR;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

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
	 * The cached value of the '{@link #getDomainObjectRef() <em>Domain Object Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainObjectRef()
	 * @generated
	 * @ordered
	 */
	protected PIMBankObject domainObjectRef;

	/**
	 * The default value of the '{@link #getObjectRefName() <em>Object Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectRefName()
	 * @generated
	 * @ordered
	 */
	protected static final String OBJECT_REF_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getObjectRefName() <em>Object Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectRefName()
	 * @generated
	 * @ordered
	 */
	protected String objectRefName = OBJECT_REF_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DataFieldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.DATA_FIELD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DATA_FIELD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DATA_FIELD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PIMBankObject getDomainObjectRef() {
		if (domainObjectRef != null && domainObjectRef.eIsProxy()) {
			InternalEObject oldDomainObjectRef = (InternalEObject)domainObjectRef;
			domainObjectRef = (PIMBankObject)eResolveProxy(oldDomainObjectRef);
			if (domainObjectRef != oldDomainObjectRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.DATA_FIELD__DOMAIN_OBJECT_REF, oldDomainObjectRef, domainObjectRef));
			}
		}
		return domainObjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PIMBankObject basicGetDomainObjectRef() {
		return domainObjectRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDomainObjectRef(PIMBankObject newDomainObjectRef) {
		PIMBankObject oldDomainObjectRef = domainObjectRef;
		domainObjectRef = newDomainObjectRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DATA_FIELD__DOMAIN_OBJECT_REF, oldDomainObjectRef, domainObjectRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getObjectRefName() {
		return objectRefName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setObjectRefName(String newObjectRefName) {
		String oldObjectRefName = objectRefName;
		objectRefName = newObjectRefName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.DATA_FIELD__OBJECT_REF_NAME, oldObjectRefName, objectRefName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.DATA_FIELD__TYPE:
				return getType();
			case UiPackage.DATA_FIELD__NAME:
				return getName();
			case UiPackage.DATA_FIELD__DOMAIN_OBJECT_REF:
				if (resolve) return getDomainObjectRef();
				return basicGetDomainObjectRef();
			case UiPackage.DATA_FIELD__OBJECT_REF_NAME:
				return getObjectRefName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UiPackage.DATA_FIELD__TYPE:
				setType((Type)newValue);
				return;
			case UiPackage.DATA_FIELD__NAME:
				setName((String)newValue);
				return;
			case UiPackage.DATA_FIELD__DOMAIN_OBJECT_REF:
				setDomainObjectRef((PIMBankObject)newValue);
				return;
			case UiPackage.DATA_FIELD__OBJECT_REF_NAME:
				setObjectRefName((String)newValue);
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
			case UiPackage.DATA_FIELD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case UiPackage.DATA_FIELD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UiPackage.DATA_FIELD__DOMAIN_OBJECT_REF:
				setDomainObjectRef((PIMBankObject)null);
				return;
			case UiPackage.DATA_FIELD__OBJECT_REF_NAME:
				setObjectRefName(OBJECT_REF_NAME_EDEFAULT);
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
			case UiPackage.DATA_FIELD__TYPE:
				return type != TYPE_EDEFAULT;
			case UiPackage.DATA_FIELD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UiPackage.DATA_FIELD__DOMAIN_OBJECT_REF:
				return domainObjectRef != null;
			case UiPackage.DATA_FIELD__OBJECT_REF_NAME:
				return OBJECT_REF_NAME_EDEFAULT == null ? objectRefName != null : !OBJECT_REF_NAME_EDEFAULT.equals(objectRefName);
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (type: ");
		result.append(type);
		result.append(", name: ");
		result.append(name);
		result.append(", objectRefName: ");
		result.append(objectRefName);
		result.append(')');
		return result.toString();
	}

} //DataFieldImpl
