/**
 */
package bankmodelpim.domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bankmodelpim.domain.BankAccount#getId <em>Id</em>}</li>
 *   <li>{@link bankmodelpim.domain.BankAccount#getBalance <em>Balance</em>}</li>
 * </ul>
 *
 * @see bankmodelpim.domain.DomainPackage#getBankAccount()
 * @model
 * @generated
 */
public interface BankAccount extends PIMBankObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see bankmodelpim.domain.DomainPackage#getBankAccount_Id()
	 * @model id="true"
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link bankmodelpim.domain.BankAccount#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Balance</em>' attribute.
	 * @see #setBalance(double)
	 * @see bankmodelpim.domain.DomainPackage#getBankAccount_Balance()
	 * @model required="true"
	 * @generated
	 */
	double getBalance();

	/**
	 * Sets the value of the '{@link bankmodelpim.domain.BankAccount#getBalance <em>Balance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Balance</em>' attribute.
	 * @see #getBalance()
	 * @generated
	 */
	void setBalance(double value);

} // BankAccount
