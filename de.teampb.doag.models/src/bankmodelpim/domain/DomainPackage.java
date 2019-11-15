/**
 */
package bankmodelpim.domain;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see bankmodelpim.domain.DomainFactory
 * @model kind="package"
 * @generated
 */
public interface DomainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "domain";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.team-pb.de.org/models/bankmodelpim/domain";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "domain";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DomainPackage eINSTANCE = bankmodelpim.domain.impl.DomainPackageImpl.init();

	/**
	 * The meta object id for the '{@link bankmodelpim.domain.impl.PIMBankObjectImpl <em>PIM Bank Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankmodelpim.domain.impl.PIMBankObjectImpl
	 * @see bankmodelpim.domain.impl.DomainPackageImpl#getPIMBankObject()
	 * @generated
	 */
	int PIM_BANK_OBJECT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIM_BANK_OBJECT__NAME = 0;

	/**
	 * The number of structural features of the '<em>PIM Bank Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIM_BANK_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>PIM Bank Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PIM_BANK_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bankmodelpim.domain.impl.BankAccountHolderImpl <em>Bank Account Holder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankmodelpim.domain.impl.BankAccountHolderImpl
	 * @see bankmodelpim.domain.impl.DomainPackageImpl#getBankAccountHolder()
	 * @generated
	 */
	int BANK_ACCOUNT_HOLDER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_HOLDER__NAME = PIM_BANK_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Bankaccounts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_HOLDER__BANKACCOUNTS = PIM_BANK_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transactions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_HOLDER__TRANSACTIONS = PIM_BANK_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_HOLDER__PASSWORD = PIM_BANK_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Bank Account Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_HOLDER_FEATURE_COUNT = PIM_BANK_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Transfer Money</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_HOLDER___TRANSFER_MONEY__INT_INT_DOUBLE_STRING = PIM_BANK_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Show Last Transactions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_HOLDER___SHOW_LAST_TRANSACTIONS = PIM_BANK_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bank Account Holder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_HOLDER_OPERATION_COUNT = PIM_BANK_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link bankmodelpim.domain.impl.BankAccountImpl <em>Bank Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankmodelpim.domain.impl.BankAccountImpl
	 * @see bankmodelpim.domain.impl.DomainPackageImpl#getBankAccount()
	 * @generated
	 */
	int BANK_ACCOUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT__NAME = PIM_BANK_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT__ID = PIM_BANK_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Balance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT__BALANCE = PIM_BANK_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Bank Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_FEATURE_COUNT = PIM_BANK_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Bank Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_ACCOUNT_OPERATION_COUNT = PIM_BANK_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link bankmodelpim.domain.impl.BankImpl <em>Bank</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankmodelpim.domain.impl.BankImpl
	 * @see bankmodelpim.domain.impl.DomainPackageImpl#getBank()
	 * @generated
	 */
	int BANK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__NAME = PIM_BANK_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Customers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK__CUSTOMERS = PIM_BANK_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_FEATURE_COUNT = PIM_BANK_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK___LOGIN__STRING_STRING = PIM_BANK_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bank</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BANK_OPERATION_COUNT = PIM_BANK_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link bankmodelpim.domain.impl.AccountTransactionImpl <em>Account Transaction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankmodelpim.domain.impl.AccountTransactionImpl
	 * @see bankmodelpim.domain.impl.DomainPackageImpl#getAccountTransaction()
	 * @generated
	 */
	int ACCOUNT_TRANSACTION = 4;

	/**
	 * The feature id for the '<em><b>From Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_TRANSACTION__FROM_ACCOUNT = 0;

	/**
	 * The feature id for the '<em><b>To Account</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_TRANSACTION__TO_ACCOUNT = 1;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_TRANSACTION__AMOUNT = 2;

	/**
	 * The feature id for the '<em><b>Intended Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_TRANSACTION__INTENDED_USE = 3;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_TRANSACTION__TIMESTAMP = 4;

	/**
	 * The number of structural features of the '<em>Account Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_TRANSACTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Account Transaction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_TRANSACTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link bankmodelpim.domain.BankAccountHolder <em>Bank Account Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Account Holder</em>'.
	 * @see bankmodelpim.domain.BankAccountHolder
	 * @generated
	 */
	EClass getBankAccountHolder();

	/**
	 * Returns the meta object for the containment reference list '{@link bankmodelpim.domain.BankAccountHolder#getBankaccounts <em>Bankaccounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Bankaccounts</em>'.
	 * @see bankmodelpim.domain.BankAccountHolder#getBankaccounts()
	 * @see #getBankAccountHolder()
	 * @generated
	 */
	EReference getBankAccountHolder_Bankaccounts();

	/**
	 * Returns the meta object for the containment reference list '{@link bankmodelpim.domain.BankAccountHolder#getTransactions <em>Transactions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transactions</em>'.
	 * @see bankmodelpim.domain.BankAccountHolder#getTransactions()
	 * @see #getBankAccountHolder()
	 * @generated
	 */
	EReference getBankAccountHolder_Transactions();

	/**
	 * Returns the meta object for the attribute '{@link bankmodelpim.domain.BankAccountHolder#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see bankmodelpim.domain.BankAccountHolder#getPassword()
	 * @see #getBankAccountHolder()
	 * @generated
	 */
	EAttribute getBankAccountHolder_Password();

	/**
	 * Returns the meta object for the '{@link bankmodelpim.domain.BankAccountHolder#transferMoney(int, int, double, java.lang.String) <em>Transfer Money</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Transfer Money</em>' operation.
	 * @see bankmodelpim.domain.BankAccountHolder#transferMoney(int, int, double, java.lang.String)
	 * @generated
	 */
	EOperation getBankAccountHolder__TransferMoney__int_int_double_String();

	/**
	 * Returns the meta object for the '{@link bankmodelpim.domain.BankAccountHolder#showLastTransactions() <em>Show Last Transactions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Show Last Transactions</em>' operation.
	 * @see bankmodelpim.domain.BankAccountHolder#showLastTransactions()
	 * @generated
	 */
	EOperation getBankAccountHolder__ShowLastTransactions();

	/**
	 * Returns the meta object for class '{@link bankmodelpim.domain.BankAccount <em>Bank Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank Account</em>'.
	 * @see bankmodelpim.domain.BankAccount
	 * @generated
	 */
	EClass getBankAccount();

	/**
	 * Returns the meta object for the attribute '{@link bankmodelpim.domain.BankAccount#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see bankmodelpim.domain.BankAccount#getId()
	 * @see #getBankAccount()
	 * @generated
	 */
	EAttribute getBankAccount_Id();

	/**
	 * Returns the meta object for the attribute '{@link bankmodelpim.domain.BankAccount#getBalance <em>Balance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Balance</em>'.
	 * @see bankmodelpim.domain.BankAccount#getBalance()
	 * @see #getBankAccount()
	 * @generated
	 */
	EAttribute getBankAccount_Balance();

	/**
	 * Returns the meta object for class '{@link bankmodelpim.domain.Bank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bank</em>'.
	 * @see bankmodelpim.domain.Bank
	 * @generated
	 */
	EClass getBank();

	/**
	 * Returns the meta object for the containment reference list '{@link bankmodelpim.domain.Bank#getCustomers <em>Customers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Customers</em>'.
	 * @see bankmodelpim.domain.Bank#getCustomers()
	 * @see #getBank()
	 * @generated
	 */
	EReference getBank_Customers();

	/**
	 * Returns the meta object for the '{@link bankmodelpim.domain.Bank#login(java.lang.String, java.lang.String) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see bankmodelpim.domain.Bank#login(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getBank__Login__String_String();

	/**
	 * Returns the meta object for class '{@link bankmodelpim.domain.PIMBankObject <em>PIM Bank Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PIM Bank Object</em>'.
	 * @see bankmodelpim.domain.PIMBankObject
	 * @generated
	 */
	EClass getPIMBankObject();

	/**
	 * Returns the meta object for the attribute '{@link bankmodelpim.domain.PIMBankObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bankmodelpim.domain.PIMBankObject#getName()
	 * @see #getPIMBankObject()
	 * @generated
	 */
	EAttribute getPIMBankObject_Name();

	/**
	 * Returns the meta object for class '{@link bankmodelpim.domain.AccountTransaction <em>Account Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account Transaction</em>'.
	 * @see bankmodelpim.domain.AccountTransaction
	 * @generated
	 */
	EClass getAccountTransaction();

	/**
	 * Returns the meta object for the reference '{@link bankmodelpim.domain.AccountTransaction#getFromAccount <em>From Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Account</em>'.
	 * @see bankmodelpim.domain.AccountTransaction#getFromAccount()
	 * @see #getAccountTransaction()
	 * @generated
	 */
	EReference getAccountTransaction_FromAccount();

	/**
	 * Returns the meta object for the reference '{@link bankmodelpim.domain.AccountTransaction#getToAccount <em>To Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Account</em>'.
	 * @see bankmodelpim.domain.AccountTransaction#getToAccount()
	 * @see #getAccountTransaction()
	 * @generated
	 */
	EReference getAccountTransaction_ToAccount();

	/**
	 * Returns the meta object for the attribute '{@link bankmodelpim.domain.AccountTransaction#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see bankmodelpim.domain.AccountTransaction#getAmount()
	 * @see #getAccountTransaction()
	 * @generated
	 */
	EAttribute getAccountTransaction_Amount();

	/**
	 * Returns the meta object for the attribute '{@link bankmodelpim.domain.AccountTransaction#getIntendedUse <em>Intended Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Intended Use</em>'.
	 * @see bankmodelpim.domain.AccountTransaction#getIntendedUse()
	 * @see #getAccountTransaction()
	 * @generated
	 */
	EAttribute getAccountTransaction_IntendedUse();

	/**
	 * Returns the meta object for the attribute '{@link bankmodelpim.domain.AccountTransaction#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see bankmodelpim.domain.AccountTransaction#getTimestamp()
	 * @see #getAccountTransaction()
	 * @generated
	 */
	EAttribute getAccountTransaction_Timestamp();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DomainFactory getDomainFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link bankmodelpim.domain.impl.BankAccountHolderImpl <em>Bank Account Holder</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankmodelpim.domain.impl.BankAccountHolderImpl
		 * @see bankmodelpim.domain.impl.DomainPackageImpl#getBankAccountHolder()
		 * @generated
		 */
		EClass BANK_ACCOUNT_HOLDER = eINSTANCE.getBankAccountHolder();

		/**
		 * The meta object literal for the '<em><b>Bankaccounts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK_ACCOUNT_HOLDER__BANKACCOUNTS = eINSTANCE.getBankAccountHolder_Bankaccounts();

		/**
		 * The meta object literal for the '<em><b>Transactions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK_ACCOUNT_HOLDER__TRANSACTIONS = eINSTANCE.getBankAccountHolder_Transactions();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_ACCOUNT_HOLDER__PASSWORD = eINSTANCE.getBankAccountHolder_Password();

		/**
		 * The meta object literal for the '<em><b>Transfer Money</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BANK_ACCOUNT_HOLDER___TRANSFER_MONEY__INT_INT_DOUBLE_STRING = eINSTANCE.getBankAccountHolder__TransferMoney__int_int_double_String();

		/**
		 * The meta object literal for the '<em><b>Show Last Transactions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BANK_ACCOUNT_HOLDER___SHOW_LAST_TRANSACTIONS = eINSTANCE.getBankAccountHolder__ShowLastTransactions();

		/**
		 * The meta object literal for the '{@link bankmodelpim.domain.impl.BankAccountImpl <em>Bank Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankmodelpim.domain.impl.BankAccountImpl
		 * @see bankmodelpim.domain.impl.DomainPackageImpl#getBankAccount()
		 * @generated
		 */
		EClass BANK_ACCOUNT = eINSTANCE.getBankAccount();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_ACCOUNT__ID = eINSTANCE.getBankAccount_Id();

		/**
		 * The meta object literal for the '<em><b>Balance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BANK_ACCOUNT__BALANCE = eINSTANCE.getBankAccount_Balance();

		/**
		 * The meta object literal for the '{@link bankmodelpim.domain.impl.BankImpl <em>Bank</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankmodelpim.domain.impl.BankImpl
		 * @see bankmodelpim.domain.impl.DomainPackageImpl#getBank()
		 * @generated
		 */
		EClass BANK = eINSTANCE.getBank();

		/**
		 * The meta object literal for the '<em><b>Customers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BANK__CUSTOMERS = eINSTANCE.getBank_Customers();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BANK___LOGIN__STRING_STRING = eINSTANCE.getBank__Login__String_String();

		/**
		 * The meta object literal for the '{@link bankmodelpim.domain.impl.PIMBankObjectImpl <em>PIM Bank Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankmodelpim.domain.impl.PIMBankObjectImpl
		 * @see bankmodelpim.domain.impl.DomainPackageImpl#getPIMBankObject()
		 * @generated
		 */
		EClass PIM_BANK_OBJECT = eINSTANCE.getPIMBankObject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PIM_BANK_OBJECT__NAME = eINSTANCE.getPIMBankObject_Name();

		/**
		 * The meta object literal for the '{@link bankmodelpim.domain.impl.AccountTransactionImpl <em>Account Transaction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankmodelpim.domain.impl.AccountTransactionImpl
		 * @see bankmodelpim.domain.impl.DomainPackageImpl#getAccountTransaction()
		 * @generated
		 */
		EClass ACCOUNT_TRANSACTION = eINSTANCE.getAccountTransaction();

		/**
		 * The meta object literal for the '<em><b>From Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT_TRANSACTION__FROM_ACCOUNT = eINSTANCE.getAccountTransaction_FromAccount();

		/**
		 * The meta object literal for the '<em><b>To Account</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNT_TRANSACTION__TO_ACCOUNT = eINSTANCE.getAccountTransaction_ToAccount();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT_TRANSACTION__AMOUNT = eINSTANCE.getAccountTransaction_Amount();

		/**
		 * The meta object literal for the '<em><b>Intended Use</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT_TRANSACTION__INTENDED_USE = eINSTANCE.getAccountTransaction_IntendedUse();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT_TRANSACTION__TIMESTAMP = eINSTANCE.getAccountTransaction_Timestamp();

	}

} //DomainPackage
