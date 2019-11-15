/**
 */
package bankmodelpim.ui;

import bankmodelpim.domain.PIMBankObject;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Field</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link bankmodelpim.ui.DataField#getType <em>Type</em>}</li>
 *   <li>{@link bankmodelpim.ui.DataField#getName <em>Name</em>}</li>
 *   <li>{@link bankmodelpim.ui.DataField#getDomainObjectRef <em>Domain Object Ref</em>}</li>
 *   <li>{@link bankmodelpim.ui.DataField#getObjectRefName <em>Object Ref Name</em>}</li>
 * </ul>
 *
 * @see bankmodelpim.ui.UiPackage#getDataField()
 * @model
 * @generated
 */
public interface DataField extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link bankmodelpim.ui.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see bankmodelpim.ui.Type
	 * @see #setType(Type)
	 * @see bankmodelpim.ui.UiPackage#getDataField_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link bankmodelpim.ui.DataField#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see bankmodelpim.ui.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see bankmodelpim.ui.UiPackage#getDataField_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link bankmodelpim.ui.DataField#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Domain Object Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Object Ref</em>' reference.
	 * @see #setDomainObjectRef(PIMBankObject)
	 * @see bankmodelpim.ui.UiPackage#getDataField_DomainObjectRef()
	 * @model
	 * @generated
	 */
	PIMBankObject getDomainObjectRef();

	/**
	 * Sets the value of the '{@link bankmodelpim.ui.DataField#getDomainObjectRef <em>Domain Object Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Object Ref</em>' reference.
	 * @see #getDomainObjectRef()
	 * @generated
	 */
	void setDomainObjectRef(PIMBankObject value);

	/**
	 * Returns the value of the '<em><b>Object Ref Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Ref Name</em>' attribute.
	 * @see #setObjectRefName(String)
	 * @see bankmodelpim.ui.UiPackage#getDataField_ObjectRefName()
	 * @model
	 * @generated
	 */
	String getObjectRefName();

	/**
	 * Sets the value of the '{@link bankmodelpim.ui.DataField#getObjectRefName <em>Object Ref Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Ref Name</em>' attribute.
	 * @see #getObjectRefName()
	 * @generated
	 */
	void setObjectRefName(String value);

} // DataField
