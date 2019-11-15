/**
 */
package bankmodelpim.ui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bankmodelpim.ui.Page#getDatafield <em>Datafield</em>}</li>
 *   <li>{@link bankmodelpim.ui.Page#getOperation <em>Operation</em>}</li>
 *   <li>{@link bankmodelpim.ui.Page#getLayout <em>Layout</em>}</li>
 *   <li>{@link bankmodelpim.ui.Page#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see bankmodelpim.ui.UiPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends EObject {
	/**
	 * Returns the value of the '<em><b>Datafield</b></em>' containment reference list.
	 * The list contents are of type {@link bankmodelpim.ui.DataField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datafield</em>' containment reference list.
	 * @see bankmodelpim.ui.UiPackage#getPage_Datafield()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataField> getDatafield();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link bankmodelpim.ui.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see bankmodelpim.ui.UiPackage#getPage_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Layout</b></em>' attribute.
	 * The literals are from the enumeration {@link bankmodelpim.ui.Layout}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' attribute.
	 * @see bankmodelpim.ui.Layout
	 * @see #setLayout(Layout)
	 * @see bankmodelpim.ui.UiPackage#getPage_Layout()
	 * @model
	 * @generated
	 */
	Layout getLayout();

	/**
	 * Sets the value of the '{@link bankmodelpim.ui.Page#getLayout <em>Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' attribute.
	 * @see bankmodelpim.ui.Layout
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(Layout value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bankmodelpim.ui.UiPackage#getPage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bankmodelpim.ui.Page#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Page
