/**
 */
package bankmodelpim.domain.tests;

import bankmodelpim.domain.AccountTransaction;
import bankmodelpim.domain.DomainFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Account Transaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link bankmodelpim.domain.AccountTransaction#getTimestamp() <em>Timestamp</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AccountTransactionTest extends TestCase {

	/**
	 * The fixture for this Account Transaction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountTransaction fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AccountTransactionTest.class);
	}

	/**
	 * Constructs a new Account Transaction test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountTransactionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Account Transaction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AccountTransaction fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Account Transaction test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccountTransaction getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DomainFactory.eINSTANCE.createAccountTransaction());
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

	/**
	 * Tests the '{@link bankmodelpim.domain.AccountTransaction#getTimestamp() <em>Timestamp</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankmodelpim.domain.AccountTransaction#getTimestamp()
	 * @generated
	 */
	public void testGetTimestamp() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link bankmodelpim.domain.AccountTransaction#setTimestamp(java.util.Date) <em>Timestamp</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankmodelpim.domain.AccountTransaction#setTimestamp(java.util.Date)
	 * @generated
	 */
	public void testSetTimestamp() {
		// TODO: implement this feature setter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //AccountTransactionTest
