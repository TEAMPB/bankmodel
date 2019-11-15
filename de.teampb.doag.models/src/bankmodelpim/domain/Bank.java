/**
 */
package bankmodelpim.domain;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bankmodelpim.domain.Bank#getCustomers <em>Customers</em>}</li>
 * </ul>
 *
 * @see bankmodelpim.domain.DomainPackage#getBank()
 * @model
 * @generated
 */
public interface Bank extends PIMBankObject {
	/**
	 * Returns the value of the '<em><b>Customers</b></em>' containment reference list.
	 * The list contents are of type {@link bankmodelpim.domain.BankAccountHolder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customers</em>' containment reference list.
	 * @see bankmodelpim.domain.DomainPackage#getBank_Customers()
	 * @model containment="true"
	 * @generated
	 */
	EList<BankAccountHolder> getCustomers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	String login(String givenUsername, String givenPassword);

} // Bank
