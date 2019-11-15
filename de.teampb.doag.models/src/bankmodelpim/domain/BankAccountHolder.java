/**
 */
package bankmodelpim.domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank Account Holder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bankmodelpim.domain.BankAccountHolder#getBankaccounts <em>Bankaccounts</em>}</li>
 *   <li>{@link bankmodelpim.domain.BankAccountHolder#getTransactions <em>Transactions</em>}</li>
 *   <li>{@link bankmodelpim.domain.BankAccountHolder#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @see bankmodelpim.domain.DomainPackage#getBankAccountHolder()
 * @model
 * @generated
 */
public interface BankAccountHolder extends PIMBankObject {
	/**
	 * Returns the value of the '<em><b>Bankaccounts</b></em>' containment reference list.
	 * The list contents are of type {@link bankmodelpim.domain.BankAccount}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bankaccounts</em>' containment reference list.
	 * @see bankmodelpim.domain.DomainPackage#getBankAccountHolder_Bankaccounts()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<BankAccount> getBankaccounts();

	/**
	 * Returns the value of the '<em><b>Transactions</b></em>' containment reference list.
	 * The list contents are of type {@link bankmodelpim.domain.AccountTransaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transactions</em>' containment reference list.
	 * @see bankmodelpim.domain.DomainPackage#getBankAccountHolder_Transactions()
	 * @model containment="true"
	 * @generated
	 */
	EList<AccountTransaction> getTransactions();

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see bankmodelpim.domain.DomainPackage#getBankAccountHolder_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link bankmodelpim.domain.BankAccountHolder#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean transferMoney(int sourceBankAccountId, int targetBankAccountId, double amount, String intendedUse);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model many="false"
	 * @generated
	 */
	EList showLastTransactions();

} // BankAccountHolder
