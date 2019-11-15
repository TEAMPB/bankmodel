/**
 */
package bankmodelpim.domain.tests;

import bankmodelpim.domain.BankAccountHolder;
import bankmodelpim.domain.DomainFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Bank Account Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link bankmodelpim.domain.BankAccountHolder#transferMoney(int, int, double, java.lang.String) <em>Transfer Money</em>}</li>
 *   <li>{@link bankmodelpim.domain.BankAccountHolder#showLastTransactions() <em>Show Last Transactions</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class BankAccountHolderTest extends PIMBankObjectTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BankAccountHolderTest.class);
	}

	/**
	 * Constructs a new Bank Account Holder test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BankAccountHolderTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Bank Account Holder test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected BankAccountHolder getFixture() {
		return (BankAccountHolder)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DomainFactory.eINSTANCE.createBankAccountHolder());
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
	 * Tests the '{@link bankmodelpim.domain.BankAccountHolder#transferMoney(int, int, double, java.lang.String) <em>Transfer Money</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankmodelpim.domain.BankAccountHolder#transferMoney(int, int, double, java.lang.String)
	 * @generated NOT
	 */
	public void testTransferMoney__int_int_double_String() {
		fail();
	}

	/**
	 * Tests the '{@link bankmodelpim.domain.BankAccountHolder#showLastTransactions() <em>Show Last Transactions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankmodelpim.domain.BankAccountHolder#showLastTransactions()
	 * @generated
	 */
	public void testShowLastTransactions() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //BankAccountHolderTest
