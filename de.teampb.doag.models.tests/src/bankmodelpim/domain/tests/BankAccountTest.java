/**
 */
package bankmodelpim.domain.tests;

import bankmodelpim.domain.BankAccount;
import bankmodelpim.domain.DomainFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bank Account</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BankAccountTest extends PIMBankObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BankAccountTest.class);
	}

	/**
	 * Constructs a new Bank Account test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAccountTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bank Account test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BankAccount getFixture() {
		return (BankAccount)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DomainFactory.eINSTANCE.createBankAccount());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //BankAccountTest
