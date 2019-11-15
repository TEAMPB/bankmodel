/**
 */
package bankmodelpim.ui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see bankmodelpim.ui.UiFactory
 * @model kind="package"
 * @generated
 */
public interface UiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.team-pb.de.org/models/bankmodelpim/ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UiPackage eINSTANCE = bankmodelpim.ui.impl.UiPackageImpl.init();

	/**
	 * The meta object id for the '{@link bankmodelpim.ui.impl.PageImpl <em>Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankmodelpim.ui.impl.PageImpl
	 * @see bankmodelpim.ui.impl.UiPackageImpl#getPage()
	 * @generated
	 */
	int PAGE = 0;

	/**
	 * The feature id for the '<em><b>Datafield</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__DATAFIELD = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__OPERATION = 1;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__LAYOUT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bankmodelpim.ui.impl.DataFieldImpl <em>Data Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankmodelpim.ui.impl.DataFieldImpl
	 * @see bankmodelpim.ui.impl.UiPackageImpl#getDataField()
	 * @generated
	 */
	int DATA_FIELD = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Domain Object Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__DOMAIN_OBJECT_REF = 2;

	/**
	 * The feature id for the '<em><b>Object Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD__OBJECT_REF_NAME = 3;

	/**
	 * The number of structural features of the '<em>Data Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Data Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bankmodelpim.ui.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankmodelpim.ui.impl.OperationImpl
	 * @see bankmodelpim.ui.impl.UiPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 2;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__INPUT = 0;

	/**
	 * The feature id for the '<em><b>Success Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__SUCCESS_PAGE = 1;

	/**
	 * The feature id for the '<em><b>Error Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__ERROR_PAGE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = 3;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link bankmodelpim.ui.Layout <em>Layout</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankmodelpim.ui.Layout
	 * @see bankmodelpim.ui.impl.UiPackageImpl#getLayout()
	 * @generated
	 */
	int LAYOUT = 3;

	/**
	 * The meta object id for the '{@link bankmodelpim.ui.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see bankmodelpim.ui.Type
	 * @see bankmodelpim.ui.impl.UiPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 4;


	/**
	 * Returns the meta object for class '{@link bankmodelpim.ui.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Page</em>'.
	 * @see bankmodelpim.ui.Page
	 * @generated
	 */
	EClass getPage();

	/**
	 * Returns the meta object for the containment reference list '{@link bankmodelpim.ui.Page#getDatafield <em>Datafield</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datafield</em>'.
	 * @see bankmodelpim.ui.Page#getDatafield()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Datafield();

	/**
	 * Returns the meta object for the containment reference list '{@link bankmodelpim.ui.Page#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see bankmodelpim.ui.Page#getOperation()
	 * @see #getPage()
	 * @generated
	 */
	EReference getPage_Operation();

	/**
	 * Returns the meta object for the attribute '{@link bankmodelpim.ui.Page#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Layout</em>'.
	 * @see bankmodelpim.ui.Page#getLayout()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Layout();

	/**
	 * Returns the meta object for the attribute '{@link bankmodelpim.ui.Page#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bankmodelpim.ui.Page#getName()
	 * @see #getPage()
	 * @generated
	 */
	EAttribute getPage_Name();

	/**
	 * Returns the meta object for class '{@link bankmodelpim.ui.DataField <em>Data Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Field</em>'.
	 * @see bankmodelpim.ui.DataField
	 * @generated
	 */
	EClass getDataField();

	/**
	 * Returns the meta object for the attribute '{@link bankmodelpim.ui.DataField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see bankmodelpim.ui.DataField#getType()
	 * @see #getDataField()
	 * @generated
	 */
	EAttribute getDataField_Type();

	/**
	 * Returns the meta object for the attribute '{@link bankmodelpim.ui.DataField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bankmodelpim.ui.DataField#getName()
	 * @see #getDataField()
	 * @generated
	 */
	EAttribute getDataField_Name();

	/**
	 * Returns the meta object for the reference '{@link bankmodelpim.ui.DataField#getDomainObjectRef <em>Domain Object Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain Object Ref</em>'.
	 * @see bankmodelpim.ui.DataField#getDomainObjectRef()
	 * @see #getDataField()
	 * @generated
	 */
	EReference getDataField_DomainObjectRef();

	/**
	 * Returns the meta object for the attribute '{@link bankmodelpim.ui.DataField#getObjectRefName <em>Object Ref Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Object Ref Name</em>'.
	 * @see bankmodelpim.ui.DataField#getObjectRefName()
	 * @see #getDataField()
	 * @generated
	 */
	EAttribute getDataField_ObjectRefName();

	/**
	 * Returns the meta object for class '{@link bankmodelpim.ui.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see bankmodelpim.ui.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the reference list '{@link bankmodelpim.ui.Operation#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Input</em>'.
	 * @see bankmodelpim.ui.Operation#getInput()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_Input();

	/**
	 * Returns the meta object for the reference '{@link bankmodelpim.ui.Operation#getSuccessPage <em>Success Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Success Page</em>'.
	 * @see bankmodelpim.ui.Operation#getSuccessPage()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_SuccessPage();

	/**
	 * Returns the meta object for the reference '{@link bankmodelpim.ui.Operation#getErrorPage <em>Error Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Error Page</em>'.
	 * @see bankmodelpim.ui.Operation#getErrorPage()
	 * @see #getOperation()
	 * @generated
	 */
	EReference getOperation_ErrorPage();

	/**
	 * Returns the meta object for the attribute '{@link bankmodelpim.ui.Operation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see bankmodelpim.ui.Operation#getName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_Name();

	/**
	 * Returns the meta object for enum '{@link bankmodelpim.ui.Layout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Layout</em>'.
	 * @see bankmodelpim.ui.Layout
	 * @generated
	 */
	EEnum getLayout();

	/**
	 * Returns the meta object for enum '{@link bankmodelpim.ui.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see bankmodelpim.ui.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UiFactory getUiFactory();

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
		 * The meta object literal for the '{@link bankmodelpim.ui.impl.PageImpl <em>Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankmodelpim.ui.impl.PageImpl
		 * @see bankmodelpim.ui.impl.UiPackageImpl#getPage()
		 * @generated
		 */
		EClass PAGE = eINSTANCE.getPage();

		/**
		 * The meta object literal for the '<em><b>Datafield</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__DATAFIELD = eINSTANCE.getPage_Datafield();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PAGE__OPERATION = eINSTANCE.getPage_Operation();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__LAYOUT = eINSTANCE.getPage_Layout();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

		/**
		 * The meta object literal for the '{@link bankmodelpim.ui.impl.DataFieldImpl <em>Data Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankmodelpim.ui.impl.DataFieldImpl
		 * @see bankmodelpim.ui.impl.UiPackageImpl#getDataField()
		 * @generated
		 */
		EClass DATA_FIELD = eINSTANCE.getDataField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FIELD__TYPE = eINSTANCE.getDataField_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FIELD__NAME = eINSTANCE.getDataField_Name();

		/**
		 * The meta object literal for the '<em><b>Domain Object Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_FIELD__DOMAIN_OBJECT_REF = eINSTANCE.getDataField_DomainObjectRef();

		/**
		 * The meta object literal for the '<em><b>Object Ref Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATA_FIELD__OBJECT_REF_NAME = eINSTANCE.getDataField_ObjectRefName();

		/**
		 * The meta object literal for the '{@link bankmodelpim.ui.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankmodelpim.ui.impl.OperationImpl
		 * @see bankmodelpim.ui.impl.UiPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__INPUT = eINSTANCE.getOperation_Input();

		/**
		 * The meta object literal for the '<em><b>Success Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__SUCCESS_PAGE = eINSTANCE.getOperation_SuccessPage();

		/**
		 * The meta object literal for the '<em><b>Error Page</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION__ERROR_PAGE = eINSTANCE.getOperation_ErrorPage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__NAME = eINSTANCE.getOperation_Name();

		/**
		 * The meta object literal for the '{@link bankmodelpim.ui.Layout <em>Layout</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankmodelpim.ui.Layout
		 * @see bankmodelpim.ui.impl.UiPackageImpl#getLayout()
		 * @generated
		 */
		EEnum LAYOUT = eINSTANCE.getLayout();

		/**
		 * The meta object literal for the '{@link bankmodelpim.ui.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see bankmodelpim.ui.Type
		 * @see bankmodelpim.ui.impl.UiPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //UiPackage
