/**
 */
package bankmodelpim.ui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bankmodelpim.ui.Operation#getInput <em>Input</em>}</li>
 *   <li>{@link bankmodelpim.ui.Operation#getSuccessPage <em>Success Page</em>}</li>
 *   <li>{@link bankmodelpim.ui.Operation#getErrorPage <em>Error Page</em>}</li>
 *   <li>{@link bankmodelpim.ui.Operation#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see bankmodelpim.ui.UiPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Input</b></em>' reference list.
	 * The list contents are of type {@link bankmodelpim.ui.DataField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input</em>' reference list.
	 * @see bankmodelpim.ui.UiPackage#getOperation_Input()
	 * @model
	 * @generated
	 */
	EList<DataField> getInput();

	/**
	 * Returns the value of the '<em><b>Success Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Success Page</em>' reference.
	 * @see #setSuccessPage(Page)
	 * @see bankmodelpim.ui.UiPackage#getOperation_SuccessPage()
	 * @model
	 * @generated
	 */
	Page getSuccessPage();

	/**
	 * Sets the value of the '{@link bankmodelpim.ui.Operation#getSuccessPage <em>Success Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Success Page</em>' reference.
	 * @see #getSuccessPage()
	 * @generated
	 */
	void setSuccessPage(Page value);

	/**
	 * Returns the value of the '<em><b>Error Page</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Page</em>' reference.
	 * @see #setErrorPage(Page)
	 * @see bankmodelpim.ui.UiPackage#getOperation_ErrorPage()
	 * @model
	 * @generated
	 */
	Page getErrorPage();

	/**
	 * Sets the value of the '{@link bankmodelpim.ui.Operation#getErrorPage <em>Error Page</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Page</em>' reference.
	 * @see #getErrorPage()
	 * @generated
	 */
	void setErrorPage(Page value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bankmodelpim.ui.UiPackage#getOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bankmodelpim.ui.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Operation
