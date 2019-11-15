/**
 */
package bankmodelpim.ui.impl;

import bankmodelpim.ui.DataField;
import bankmodelpim.ui.Operation;
import bankmodelpim.ui.Page;
import bankmodelpim.ui.UiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bankmodelpim.ui.impl.OperationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link bankmodelpim.ui.impl.OperationImpl#getSuccessPage <em>Success Page</em>}</li>
 *   <li>{@link bankmodelpim.ui.impl.OperationImpl#getErrorPage <em>Error Page</em>}</li>
 *   <li>{@link bankmodelpim.ui.impl.OperationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation {
	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<DataField> input;

	/**
	 * The cached value of the '{@link #getSuccessPage() <em>Success Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessPage()
	 * @generated
	 * @ordered
	 */
	protected Page successPage;

	/**
	 * The cached value of the '{@link #getErrorPage() <em>Error Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorPage()
	 * @generated
	 * @ordered
	 */
	protected Page errorPage;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UiPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataField> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<DataField>(DataField.class, this, UiPackage.OPERATION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getSuccessPage() {
		if (successPage != null && successPage.eIsProxy()) {
			InternalEObject oldSuccessPage = (InternalEObject)successPage;
			successPage = (Page)eResolveProxy(oldSuccessPage);
			if (successPage != oldSuccessPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.OPERATION__SUCCESS_PAGE, oldSuccessPage, successPage));
			}
		}
		return successPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetSuccessPage() {
		return successPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuccessPage(Page newSuccessPage) {
		Page oldSuccessPage = successPage;
		successPage = newSuccessPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.OPERATION__SUCCESS_PAGE, oldSuccessPage, successPage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getErrorPage() {
		if (errorPage != null && errorPage.eIsProxy()) {
			InternalEObject oldErrorPage = (InternalEObject)errorPage;
			errorPage = (Page)eResolveProxy(oldErrorPage);
			if (errorPage != oldErrorPage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UiPackage.OPERATION__ERROR_PAGE, oldErrorPage, errorPage));
			}
		}
		return errorPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetErrorPage() {
		return errorPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setErrorPage(Page newErrorPage) {
		Page oldErrorPage = errorPage;
		errorPage = newErrorPage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.OPERATION__ERROR_PAGE, oldErrorPage, errorPage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UiPackage.OPERATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UiPackage.OPERATION__INPUT:
				return getInput();
			case UiPackage.OPERATION__SUCCESS_PAGE:
				if (resolve) return getSuccessPage();
				return basicGetSuccessPage();
			case UiPackage.OPERATION__ERROR_PAGE:
				if (resolve) return getErrorPage();
				return basicGetErrorPage();
			case UiPackage.OPERATION__NAME:
				return getName();
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
			case UiPackage.OPERATION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends DataField>)newValue);
				return;
			case UiPackage.OPERATION__SUCCESS_PAGE:
				setSuccessPage((Page)newValue);
				return;
			case UiPackage.OPERATION__ERROR_PAGE:
				setErrorPage((Page)newValue);
				return;
			case UiPackage.OPERATION__NAME:
				setName((String)newValue);
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
			case UiPackage.OPERATION__INPUT:
				getInput().clear();
				return;
			case UiPackage.OPERATION__SUCCESS_PAGE:
				setSuccessPage((Page)null);
				return;
			case UiPackage.OPERATION__ERROR_PAGE:
				setErrorPage((Page)null);
				return;
			case UiPackage.OPERATION__NAME:
				setName(NAME_EDEFAULT);
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
			case UiPackage.OPERATION__INPUT:
				return input != null && !input.isEmpty();
			case UiPackage.OPERATION__SUCCESS_PAGE:
				return successPage != null;
			case UiPackage.OPERATION__ERROR_PAGE:
				return errorPage != null;
			case UiPackage.OPERATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
