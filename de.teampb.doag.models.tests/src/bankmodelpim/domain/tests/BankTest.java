/**
 */
package bankmodelpim.domain.tests;

import bankmodelpim.domain.Bank;
import bankmodelpim.domain.DomainFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bank</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link bankmodelpim.domain.Bank#login(java.lang.String, java.lang.String) <em>Login</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BankTest extends PIMBankObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BankTest.class);
	}

	/**
	 * Constructs a new Bank test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bank test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Bank getFixture() {
		return (Bank)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DomainFactory.eINSTANCE.createBank());
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
	 * Tests the '{@link bankmodelpim.domain.Bank#login(java.lang.String, java.lang.String) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankmodelpim.domain.Bank#login(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testLogin__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //BankTest
