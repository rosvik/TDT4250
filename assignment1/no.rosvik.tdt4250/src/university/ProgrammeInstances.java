/**
 */
package university;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.ProgrammeInstances#getProgramme <em>Programme</em>}</li>
 *   <li>{@link university.ProgrammeInstances#getProgrammeSemesters <em>Programme Semesters</em>}</li>
 *   <li>{@link university.ProgrammeInstances#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link university.ProgrammeInstances#getStartYear <em>Start Year</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getProgrammeInstances()
 * @model
 * @generated
 */
public interface ProgrammeInstances extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link university.Programmes#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme</em>' container reference.
	 * @see #setProgramme(Programmes)
	 * @see university.UniversityPackage#getProgrammeInstances_Programme()
	 * @see university.Programmes#getInstances
	 * @model opposite="instances" required="true" transient="false"
	 * @generated
	 */
	Programmes getProgramme();

	/**
	 * Sets the value of the '{@link university.ProgrammeInstances#getProgramme <em>Programme</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme</em>' container reference.
	 * @see #getProgramme()
	 * @generated
	 */
	void setProgramme(Programmes value);

	/**
	 * Returns the value of the '<em><b>Programme Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link university.ProgrammeSemesters}.
	 * It is bidirectional and its opposite is '{@link university.ProgrammeSemesters#getProgrammeInstance <em>Programme Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Semesters</em>' containment reference list.
	 * @see university.UniversityPackage#getProgrammeInstances_ProgrammeSemesters()
	 * @see university.ProgrammeSemesters#getProgrammeInstance
	 * @model opposite="programmeInstance" containment="true" required="true"
	 * @generated
	 */
	EList<ProgrammeSemesters> getProgrammeSemesters();

	/**
	 * Returns the value of the '<em><b>Specializations</b></em>' containment reference list.
	 * The list contents are of type {@link university.Specializations}.
	 * It is bidirectional and its opposite is '{@link university.Specializations#getProgrammeInstance <em>Programme Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializations</em>' containment reference list.
	 * @see university.UniversityPackage#getProgrammeInstances_Specializations()
	 * @see university.Specializations#getProgrammeInstance
	 * @model opposite="programmeInstance" containment="true"
	 * @generated
	 */
	EList<Specializations> getSpecializations();

	/**
	 * Returns the value of the '<em><b>Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Year</em>' attribute.
	 * @see #setStartYear(int)
	 * @see university.UniversityPackage#getProgrammeInstances_StartYear()
	 * @model
	 * @generated
	 */
	int getStartYear();

	/**
	 * Sets the value of the '{@link university.ProgrammeInstances#getStartYear <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Year</em>' attribute.
	 * @see #getStartYear()
	 * @generated
	 */
	void setStartYear(int value);

} // ProgrammeInstances
