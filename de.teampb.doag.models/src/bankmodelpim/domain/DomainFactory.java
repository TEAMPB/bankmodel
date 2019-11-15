/**
 */
package bankmodelpim.domain;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see bankmodelpim.domain.DomainPackage
 * @generated
 */
public interface DomainFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainFactory eINSTANCE = bankmodelpim.domain.impl.DomainFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bank Account Holder</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank Account Holder</em>'.
	 * @generated
	 */
	BankAccountHolder createBankAccountHolder();

	/**
	 * Returns a new object of class '<em>Bank Account</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank Account</em>'.
	 * @generated
	 */
	BankAccount createBankAccount();

	/**
	 * Returns a new object of class '<em>Bank</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bank</em>'.
	 * @generated
	 */
	Bank createBank();

	/**
	 * Returns a new object of class '<em>Account Transaction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Account Transaction</em>'.
	 * @generated
	 */
	AccountTransaction createAccountTransaction();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DomainPackage getDomainPackage();

} //DomainFactory
