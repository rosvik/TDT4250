/**
 */
package university;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programmes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.Programmes#getInstances <em>Instances</em>}</li>
 *   <li>{@link university.Programmes#getName <em>Name</em>}</li>
 *   <li>{@link university.Programmes#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getProgrammes()
 * @model
 * @generated
 */
public interface Programmes extends EObject {
	/**
	 * Returns the value of the '<em><b>Instances</b></em>' containment reference list.
	 * The list contents are of type {@link university.ProgrammeInstances}.
	 * It is bidirectional and its opposite is '{@link university.ProgrammeInstances#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instances</em>' containment reference list.
	 * @see university.UniversityPackage#getProgrammes_Instances()
	 * @see university.ProgrammeInstances#getProgramme
	 * @model opposite="programme" containment="true"
	 * @generated
	 */
	EList<ProgrammeInstances> getInstances();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see university.UniversityPackage#getProgrammes_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link university.Programmes#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see university.UniversityPackage#getProgrammes_Code()
	 * @model
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link university.Programmes#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

} // Programmes
