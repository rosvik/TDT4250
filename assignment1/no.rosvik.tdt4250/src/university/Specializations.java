/**
 */
package university;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specializations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.Specializations#getProgrammeInstance <em>Programme Instance</em>}</li>
 *   <li>{@link university.Specializations#getName <em>Name</em>}</li>
 *   <li>{@link university.Specializations#getProgrammeSemester <em>Programme Semester</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getSpecializations()
 * @model
 * @generated
 */
public interface Specializations extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link university.ProgrammeInstances#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Instance</em>' container reference.
	 * @see #setProgrammeInstance(ProgrammeInstances)
	 * @see university.UniversityPackage#getSpecializations_ProgrammeInstance()
	 * @see university.ProgrammeInstances#getSpecializations
	 * @model opposite="specializations" required="true" transient="false"
	 * @generated
	 */
	ProgrammeInstances getProgrammeInstance();

	/**
	 * Sets the value of the '{@link university.Specializations#getProgrammeInstance <em>Programme Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Instance</em>' container reference.
	 * @see #getProgrammeInstance()
	 * @generated
	 */
	void setProgrammeInstance(ProgrammeInstances value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see university.UniversityPackage#getSpecializations_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link university.Specializations#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Programme Semester</b></em>' containment reference list.
	 * The list contents are of type {@link university.ProgrammeSemesters}.
	 * It is bidirectional and its opposite is '{@link university.ProgrammeSemesters#getSpecialization <em>Specialization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Semester</em>' containment reference list.
	 * @see university.UniversityPackage#getSpecializations_ProgrammeSemester()
	 * @see university.ProgrammeSemesters#getSpecialization
	 * @model opposite="specialization" containment="true"
	 * @generated
	 */
	EList<ProgrammeSemesters> getProgrammeSemester();

} // Specializations
