/**
 */
package bankmodelpim.domain;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account Transaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bankmodelpim.domain.AccountTransaction#getFromAccount <em>From Account</em>}</li>
 *   <li>{@link bankmodelpim.domain.AccountTransaction#getToAccount <em>To Account</em>}</li>
 *   <li>{@link bankmodelpim.domain.AccountTransaction#getAmount <em>Amount</em>}</li>
 *   <li>{@link bankmodelpim.domain.AccountTransaction#getIntendedUse <em>Intended Use</em>}</li>
 *   <li>{@link bankmodelpim.domain.AccountTransaction#getTimestamp <em>Timestamp</em>}</li>
 * </ul>
 *
 * @see bankmodelpim.domain.DomainPackage#getAccountTransaction()
 * @model
 * @generated
 */
public interface AccountTransaction extends EObject {
	/**
	 * Returns the value of the '<em><b>From Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Account</em>' reference.
	 * @see #setFromAccount(BankAccount)
	 * @see bankmodelpim.domain.DomainPackage#getAccountTransaction_FromAccount()
	 * @model required="true"
	 * @generated
	 */
	BankAccount getFromAccount();

	/**
	 * Sets the value of the '{@link bankmodelpim.domain.AccountTransaction#getFromAccount <em>From Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Account</em>' reference.
	 * @see #getFromAccount()
	 * @generated
	 */
	void setFromAccount(BankAccount value);

	/**
	 * Returns the value of the '<em><b>To Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Account</em>' reference.
	 * @see #setToAccount(BankAccount)
	 * @see bankmodelpim.domain.DomainPackage#getAccountTransaction_ToAccount()
	 * @model required="true"
	 * @generated
	 */
	BankAccount getToAccount();

	/**
	 * Sets the value of the '{@link bankmodelpim.domain.AccountTransaction#getToAccount <em>To Account</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Account</em>' reference.
	 * @see #getToAccount()
	 * @generated
	 */
	void setToAccount(BankAccount value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(double)
	 * @see bankmodelpim.domain.DomainPackage#getAccountTransaction_Amount()
	 * @model required="true"
	 * @generated
	 */
	double getAmount();

	/**
	 * Sets the value of the '{@link bankmodelpim.domain.AccountTransaction#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(double value);

	/**
	 * Returns the value of the '<em><b>Intended Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intended Use</em>' attribute.
	 * @see #setIntendedUse(String)
	 * @see bankmodelpim.domain.DomainPackage#getAccountTransaction_IntendedUse()
	 * @model required="true"
	 * @generated
	 */
	String getIntendedUse();

	/**
	 * Sets the value of the '{@link bankmodelpim.domain.AccountTransaction#getIntendedUse <em>Intended Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intended Use</em>' attribute.
	 * @see #getIntendedUse()
	 * @generated
	 */
	void setIntendedUse(String value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(Date)
	 * @see bankmodelpim.domain.DomainPackage#getAccountTransaction_Timestamp()
	 * @model required="true" derived="true"
	 * @generated
	 */
	Date getTimestamp();

	/**
	 * Sets the value of the '{@link bankmodelpim.domain.AccountTransaction#getTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #getTimestamp()
	 * @generated
	 */
	void setTimestamp(Date value);

} // AccountTransaction
