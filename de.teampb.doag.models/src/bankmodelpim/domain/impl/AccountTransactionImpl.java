/**
 */
package bankmodelpim.domain.impl;

import bankmodelpim.domain.AccountTransaction;
import bankmodelpim.domain.BankAccount;
import bankmodelpim.domain.DomainPackage;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bankmodelpim.domain.impl.AccountTransactionImpl#getFromAccount <em>From Account</em>}</li>
 *   <li>{@link bankmodelpim.domain.impl.AccountTransactionImpl#getToAccount <em>To Account</em>}</li>
 *   <li>{@link bankmodelpim.domain.impl.AccountTransactionImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link bankmodelpim.domain.impl.AccountTransactionImpl#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link bankmodelpim.domain.impl.AccountTransactionImpl#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccountTransactionImpl extends MinimalEObjectImpl.Container implements AccountTransaction {
	/**
	 * The cached value of the '{@link #getFromAccount() <em>From Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromAccount()
	 * @generated
	 * @ordered
	 */
	protected BankAccount fromAccount;

	/**
	 * The cached value of the '{@link #getToAccount() <em>To Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToAccount()
	 * @generated
	 * @ordered
	 */
	protected BankAccount toAccount;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected double amount = AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIntendedUse() <em>Intended Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedUse()
	 * @generated
	 * @ordered
	 */
	protected static final String INTENDED_USE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIntendedUse() <em>Intended Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntendedUse()
	 * @generated
	 * @ordered
	 */
	protected String intendedUse = INTENDED_USE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIMESTAMP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimestamp() <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimestamp()
	 * @generated
	 * @ordered
	 */
	protected Date timestamp = TIMESTAMP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountTransactionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.ACCOUNT_TRANSACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BankAccount getFromAccount() {
		if (fromAccount != null && fromAccount.eIsProxy()) {
			InternalEObject oldFromAccount = (InternalEObject)fromAccount;
			fromAccount = (BankAccount)eResolveProxy(oldFromAccount);
			if (fromAccount != oldFromAccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.ACCOUNT_TRANSACTION__FROM_ACCOUNT, oldFromAccount, fromAccount));
			}
		}
		return fromAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAccount basicGetFromAccount() {
		return fromAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFromAccount(BankAccount newFromAccount) {
		BankAccount oldFromAccount = fromAccount;
		fromAccount = newFromAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ACCOUNT_TRANSACTION__FROM_ACCOUNT, oldFromAccount, fromAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BankAccount getToAccount() {
		if (toAccount != null && toAccount.eIsProxy()) {
			InternalEObject oldToAccount = (InternalEObject)toAccount;
			toAccount = (BankAccount)eResolveProxy(oldToAccount);
			if (toAccount != oldToAccount) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, DomainPackage.ACCOUNT_TRANSACTION__TO_ACCOUNT, oldToAccount, toAccount));
			}
		}
		return toAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAccount basicGetToAccount() {
		return toAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setToAccount(BankAccount newToAccount) {
		BankAccount oldToAccount = toAccount;
		toAccount = newToAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ACCOUNT_TRANSACTION__TO_ACCOUNT, oldToAccount, toAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAmount(double newAmount) {
		double oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ACCOUNT_TRANSACTION__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getIntendedUse() {
		return intendedUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIntendedUse(String newIntendedUse) {
		String oldIntendedUse = intendedUse;
		intendedUse = newIntendedUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ACCOUNT_TRANSACTION__INTENDED_USE, oldIntendedUse, intendedUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimestamp(Date newTimestamp) {
		Date oldTimestamp = timestamp;
		timestamp = newTimestamp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.ACCOUNT_TRANSACTION__TIMESTAMP, oldTimestamp, timestamp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DomainPackage.ACCOUNT_TRANSACTION__FROM_ACCOUNT:
				if (resolve) return getFromAccount();
				return basicGetFromAccount();
			case DomainPackage.ACCOUNT_TRANSACTION__TO_ACCOUNT:
				if (resolve) return getToAccount();
				return basicGetToAccount();
			case DomainPackage.ACCOUNT_TRANSACTION__AMOUNT:
				return getAmount();
			case DomainPackage.ACCOUNT_TRANSACTION__INTENDED_USE:
				return getIntendedUse();
			case DomainPackage.ACCOUNT_TRANSACTION__TIMESTAMP:
				return getTimestamp();
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
			case DomainPackage.ACCOUNT_TRANSACTION__FROM_ACCOUNT:
				setFromAccount((BankAccount)newValue);
				return;
			case DomainPackage.ACCOUNT_TRANSACTION__TO_ACCOUNT:
				setToAccount((BankAccount)newValue);
				return;
			case DomainPackage.ACCOUNT_TRANSACTION__AMOUNT:
				setAmount((Double)newValue);
				return;
			case DomainPackage.ACCOUNT_TRANSACTION__INTENDED_USE:
				setIntendedUse((String)newValue);
				return;
			case DomainPackage.ACCOUNT_TRANSACTION__TIMESTAMP:
				setTimestamp((Date)newValue);
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
			case DomainPackage.ACCOUNT_TRANSACTION__FROM_ACCOUNT:
				setFromAccount((BankAccount)null);
				return;
			case DomainPackage.ACCOUNT_TRANSACTION__TO_ACCOUNT:
				setToAccount((BankAccount)null);
				return;
			case DomainPackage.ACCOUNT_TRANSACTION__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case DomainPackage.ACCOUNT_TRANSACTION__INTENDED_USE:
				setIntendedUse(INTENDED_USE_EDEFAULT);
				return;
			case DomainPackage.ACCOUNT_TRANSACTION__TIMESTAMP:
				setTimestamp(TIMESTAMP_EDEFAULT);
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
			case DomainPackage.ACCOUNT_TRANSACTION__FROM_ACCOUNT:
				return fromAccount != null;
			case DomainPackage.ACCOUNT_TRANSACTION__TO_ACCOUNT:
				return toAccount != null;
			case DomainPackage.ACCOUNT_TRANSACTION__AMOUNT:
				return amount != AMOUNT_EDEFAULT;
			case DomainPackage.ACCOUNT_TRANSACTION__INTENDED_USE:
				return INTENDED_USE_EDEFAULT == null ? intendedUse != null : !INTENDED_USE_EDEFAULT.equals(intendedUse);
			case DomainPackage.ACCOUNT_TRANSACTION__TIMESTAMP:
				return TIMESTAMP_EDEFAULT == null ? timestamp != null : !TIMESTAMP_EDEFAULT.equals(timestamp);
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
		result.append(" (amount: ");
		result.append(amount);
		result.append(", intendedUse: ");
		result.append(intendedUse);
		result.append(", timestamp: ");
		result.append(timestamp);
		result.append(')');
		return result.toString();
	}

} //AccountTransactionImpl
