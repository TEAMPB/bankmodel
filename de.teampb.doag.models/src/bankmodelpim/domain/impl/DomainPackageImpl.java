/**
 */
package bankmodelpim.domain.impl;

import bankmodelpim.domain.AccountTransaction;
import bankmodelpim.domain.Bank;
import bankmodelpim.domain.BankAccount;
import bankmodelpim.domain.BankAccountHolder;
import bankmodelpim.domain.DomainFactory;
import bankmodelpim.domain.DomainPackage;
import bankmodelpim.domain.PIMBankObject;

import bankmodelpim.ui.UiPackage;

import bankmodelpim.ui.impl.UiPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DomainPackageImpl extends EPackageImpl implements DomainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankAccountHolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankAccountEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bankEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pimBankObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accountTransactionEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see bankmodelpim.domain.DomainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DomainPackageImpl() {
		super(eNS_URI, DomainFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DomainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DomainPackage init() {
		if (isInited) return (DomainPackage)EPackage.Registry.INSTANCE.getEPackage(DomainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDomainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DomainPackageImpl theDomainPackage = registeredDomainPackage instanceof DomainPackageImpl ? (DomainPackageImpl)registeredDomainPackage : new DomainPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(UiPackage.eNS_URI);
		UiPackageImpl theUiPackage = (UiPackageImpl)(registeredPackage instanceof UiPackageImpl ? registeredPackage : UiPackage.eINSTANCE);

		// Create package meta-data objects
		theDomainPackage.createPackageContents();
		theUiPackage.createPackageContents();

		// Initialize created meta-data
		theDomainPackage.initializePackageContents();
		theUiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDomainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DomainPackage.eNS_URI, theDomainPackage);
		return theDomainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBankAccountHolder() {
		return bankAccountHolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBankAccountHolder_Bankaccounts() {
		return (EReference)bankAccountHolderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBankAccountHolder_Transactions() {
		return (EReference)bankAccountHolderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankAccountHolder_Password() {
		return (EAttribute)bankAccountHolderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBankAccountHolder__TransferMoney__int_int_double_String() {
		return bankAccountHolderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBankAccountHolder__ShowLastTransactions() {
		return bankAccountHolderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBankAccount() {
		return bankAccountEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankAccount_Id() {
		return (EAttribute)bankAccountEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBankAccount_Balance() {
		return (EAttribute)bankAccountEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBank() {
		return bankEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBank_Customers() {
		return (EReference)bankEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getBank__Login__String_String() {
		return bankEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPIMBankObject() {
		return pimBankObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPIMBankObject_Name() {
		return (EAttribute)pimBankObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccountTransaction() {
		return accountTransactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccountTransaction_FromAccount() {
		return (EReference)accountTransactionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAccountTransaction_ToAccount() {
		return (EReference)accountTransactionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccountTransaction_Amount() {
		return (EAttribute)accountTransactionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccountTransaction_IntendedUse() {
		return (EAttribute)accountTransactionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccountTransaction_Timestamp() {
		return (EAttribute)accountTransactionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DomainFactory getDomainFactory() {
		return (DomainFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bankAccountHolderEClass = createEClass(BANK_ACCOUNT_HOLDER);
		createEReference(bankAccountHolderEClass, BANK_ACCOUNT_HOLDER__BANKACCOUNTS);
		createEReference(bankAccountHolderEClass, BANK_ACCOUNT_HOLDER__TRANSACTIONS);
		createEAttribute(bankAccountHolderEClass, BANK_ACCOUNT_HOLDER__PASSWORD);
		createEOperation(bankAccountHolderEClass, BANK_ACCOUNT_HOLDER___TRANSFER_MONEY__INT_INT_DOUBLE_STRING);
		createEOperation(bankAccountHolderEClass, BANK_ACCOUNT_HOLDER___SHOW_LAST_TRANSACTIONS);

		bankAccountEClass = createEClass(BANK_ACCOUNT);
		createEAttribute(bankAccountEClass, BANK_ACCOUNT__ID);
		createEAttribute(bankAccountEClass, BANK_ACCOUNT__BALANCE);

		bankEClass = createEClass(BANK);
		createEReference(bankEClass, BANK__CUSTOMERS);
		createEOperation(bankEClass, BANK___LOGIN__STRING_STRING);

		pimBankObjectEClass = createEClass(PIM_BANK_OBJECT);
		createEAttribute(pimBankObjectEClass, PIM_BANK_OBJECT__NAME);

		accountTransactionEClass = createEClass(ACCOUNT_TRANSACTION);
		createEReference(accountTransactionEClass, ACCOUNT_TRANSACTION__FROM_ACCOUNT);
		createEReference(accountTransactionEClass, ACCOUNT_TRANSACTION__TO_ACCOUNT);
		createEAttribute(accountTransactionEClass, ACCOUNT_TRANSACTION__AMOUNT);
		createEAttribute(accountTransactionEClass, ACCOUNT_TRANSACTION__INTENDED_USE);
		createEAttribute(accountTransactionEClass, ACCOUNT_TRANSACTION__TIMESTAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bankAccountHolderEClass.getESuperTypes().add(this.getPIMBankObject());
		bankAccountEClass.getESuperTypes().add(this.getPIMBankObject());
		bankEClass.getESuperTypes().add(this.getPIMBankObject());

		// Initialize classes, features, and operations; add parameters
		initEClass(bankAccountHolderEClass, BankAccountHolder.class, "BankAccountHolder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBankAccountHolder_Bankaccounts(), this.getBankAccount(), null, "bankaccounts", null, 1, -1, BankAccountHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBankAccountHolder_Transactions(), this.getAccountTransaction(), null, "transactions", null, 0, -1, BankAccountHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBankAccountHolder_Password(), ecorePackage.getEString(), "password", null, 0, 1, BankAccountHolder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getBankAccountHolder__TransferMoney__int_int_double_String(), ecorePackage.getEBoolean(), "transferMoney", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "sourceBankAccountId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "targetBankAccountId", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "amount", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "intendedUse", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getBankAccountHolder__ShowLastTransactions(), ecorePackage.getEEList(), "showLastTransactions", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(bankAccountEClass, BankAccount.class, "BankAccount", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBankAccount_Id(), ecorePackage.getEInt(), "id", null, 0, 1, BankAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBankAccount_Balance(), ecorePackage.getEDouble(), "balance", null, 1, 1, BankAccount.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bankEClass, Bank.class, "Bank", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBank_Customers(), this.getBankAccountHolder(), null, "customers", null, 0, -1, Bank.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBank__Login__String_String(), ecorePackage.getEString(), "login", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "givenUsername", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "givenPassword", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pimBankObjectEClass, PIMBankObject.class, "PIMBankObject", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPIMBankObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, PIMBankObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accountTransactionEClass, AccountTransaction.class, "AccountTransaction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAccountTransaction_FromAccount(), this.getBankAccount(), null, "fromAccount", null, 1, 1, AccountTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAccountTransaction_ToAccount(), this.getBankAccount(), null, "toAccount", null, 1, 1, AccountTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccountTransaction_Amount(), ecorePackage.getEDouble(), "amount", null, 1, 1, AccountTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccountTransaction_IntendedUse(), ecorePackage.getEString(), "intendedUse", null, 1, 1, AccountTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccountTransaction_Timestamp(), ecorePackage.getEDate(), "timestamp", null, 1, 1, AccountTransaction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //DomainPackageImpl
