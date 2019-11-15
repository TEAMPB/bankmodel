/**
 */
package bankmodelpim.domain.impl;

import bankmodelpim.domain.AccountTransaction;
import bankmodelpim.domain.Bank;
import bankmodelpim.domain.BankAccount;
import bankmodelpim.domain.BankAccountHolder;
import bankmodelpim.domain.DomainFactory;
import bankmodelpim.domain.DomainPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bank Account Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link bankmodelpim.domain.impl.BankAccountHolderImpl#getBankaccounts <em>Bankaccounts</em>}</li>
 *   <li>{@link bankmodelpim.domain.impl.BankAccountHolderImpl#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link bankmodelpim.domain.impl.BankAccountHolderImpl#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BankAccountHolderImpl extends PIMBankObjectImpl implements BankAccountHolder {
	/**
	 * The cached value of the '{@link #getBankaccounts() <em>Bankaccounts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBankaccounts()
	 * @generated
	 * @ordered
	 */
	protected EList<BankAccount> bankaccounts;

	/**
	 * The cached value of the '{@link #getTransactions() <em>Transactions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactions()
	 * @generated
	 * @ordered
	 */
	protected EList<AccountTransaction> transactions;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BankAccountHolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DomainPackage.Literals.BANK_ACCOUNT_HOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BankAccount> getBankaccounts() {
		if (bankaccounts == null) {
			bankaccounts = new EObjectContainmentEList<BankAccount>(BankAccount.class, this, DomainPackage.BANK_ACCOUNT_HOLDER__BANKACCOUNTS);
		}
		return bankaccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AccountTransaction> getTransactions() {
		if (transactions == null) {
			transactions = new EObjectContainmentEList<AccountTransaction>(AccountTransaction.class, this, DomainPackage.BANK_ACCOUNT_HOLDER__TRANSACTIONS);
		}
		return transactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DomainPackage.BANK_ACCOUNT_HOLDER__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean transferMoney(int sourceBankAccountId, int targetBankAccountId, double amount, String intendedUse) {
			try {
				BankAccount sourceAcc = this.bankaccounts.stream().filter(a -> a.getId() == sourceBankAccountId).findAny().get();
				
				Bank bank = (Bank)this.eContainer();
				
				BankAccount targetAcc = bank.getCustomers().stream().flatMap(c -> c.getBankaccounts().stream()).filter(ba -> ba.getId()==targetBankAccountId).findAny().get();
				
				if(sourceAcc.getBalance()<amount) {
					throw new IllegalStateException("Bankaccount "+ sourceBankAccountId + " does not have enough money!");
				}
				
				sourceAcc.setBalance(sourceAcc.getBalance() - amount);
				targetAcc.setBalance(targetAcc.getBalance() + amount);
				
				AccountTransaction t = DomainFactory.eINSTANCE.createAccountTransaction();
				t.setTimestamp(new Date());
				t.setFromAccount(sourceAcc);
				t.setToAccount(targetAcc);
				t.setAmount(amount);
				t.setIntendedUse(intendedUse);
				
				this.getTransactions().add(t);
			}
			catch (Exception e) {
				return false;
			}
			
			return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList showLastTransactions() {

		List<AccountTransaction> res = new ArrayList<>();
		
		res.addAll(getTransactions());
		
		Bank bank = (Bank)this.eContainer();
		
		List<AccountTransaction> targetAcc = bank.getCustomers().stream().flatMap(c -> c.getTransactions().stream()).filter(t -> t.getToAccount().equals(this)).collect(Collectors.toList());
		
		res.addAll(targetAcc);
		
		EList<AccountTransaction> elist =  new BasicEList<>();
		
		elist.addAll(res.stream().sorted(Comparator.comparing(AccountTransaction::getTimestamp)).collect(Collectors.toList()));
		
		return elist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DomainPackage.BANK_ACCOUNT_HOLDER__BANKACCOUNTS:
				return ((InternalEList<?>)getBankaccounts()).basicRemove(otherEnd, msgs);
			case DomainPackage.BANK_ACCOUNT_HOLDER__TRANSACTIONS:
				return ((InternalEList<?>)getTransactions()).basicRemove(otherEnd, msgs);
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
			case DomainPackage.BANK_ACCOUNT_HOLDER__BANKACCOUNTS:
				return getBankaccounts();
			case DomainPackage.BANK_ACCOUNT_HOLDER__TRANSACTIONS:
				return getTransactions();
			case DomainPackage.BANK_ACCOUNT_HOLDER__PASSWORD:
				return getPassword();
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
			case DomainPackage.BANK_ACCOUNT_HOLDER__BANKACCOUNTS:
				getBankaccounts().clear();
				getBankaccounts().addAll((Collection<? extends BankAccount>)newValue);
				return;
			case DomainPackage.BANK_ACCOUNT_HOLDER__TRANSACTIONS:
				getTransactions().clear();
				getTransactions().addAll((Collection<? extends AccountTransaction>)newValue);
				return;
			case DomainPackage.BANK_ACCOUNT_HOLDER__PASSWORD:
				setPassword((String)newValue);
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
			case DomainPackage.BANK_ACCOUNT_HOLDER__BANKACCOUNTS:
				getBankaccounts().clear();
				return;
			case DomainPackage.BANK_ACCOUNT_HOLDER__TRANSACTIONS:
				getTransactions().clear();
				return;
			case DomainPackage.BANK_ACCOUNT_HOLDER__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
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
			case DomainPackage.BANK_ACCOUNT_HOLDER__BANKACCOUNTS:
				return bankaccounts != null && !bankaccounts.isEmpty();
			case DomainPackage.BANK_ACCOUNT_HOLDER__TRANSACTIONS:
				return transactions != null && !transactions.isEmpty();
			case DomainPackage.BANK_ACCOUNT_HOLDER__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case DomainPackage.BANK_ACCOUNT_HOLDER___TRANSFER_MONEY__INT_INT_DOUBLE_STRING:
				return transferMoney((Integer)arguments.get(0), (Integer)arguments.get(1), (Double)arguments.get(2), (String)arguments.get(3));
			case DomainPackage.BANK_ACCOUNT_HOLDER___SHOW_LAST_TRANSACTIONS:
				return showLastTransactions();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //BankAccountHolderImpl
