/**
 */
package university;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.ProgrammeSemester#getProgrammeInstance <em>Programme Instance</em>}</li>
 *   <li>{@link university.ProgrammeSemester#getCouseInstances <em>Couse Instances</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getProgrammeSemester()
 * @model
 * @generated
 */
public interface ProgrammeSemester extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme Instance</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link university.ProgrammeInstances#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programme Instance</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Instance</em>' reference.
	 * @see #setProgrammeInstance(ProgrammeInstances)
	 * @see university.UniversityPackage#getProgrammeSemester_ProgrammeInstance()
	 * @see university.ProgrammeInstances#getSemesters
	 * @model opposite="semesters"
	 * @generated
	 */
	ProgrammeInstances getProgrammeInstance();

	/**
	 * Sets the value of the '{@link university.ProgrammeSemester#getProgrammeInstance <em>Programme Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Instance</em>' reference.
	 * @see #getProgrammeInstance()
	 * @generated
	 */
	void setProgrammeInstance(ProgrammeInstances value);

	/**
	 * Returns the value of the '<em><b>Couse Instances</b></em>' reference list.
	 * The list contents are of type {@link university.CourseInstances}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Couse Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Couse Instances</em>' reference list.
	 * @see university.UniversityPackage#getProgrammeSemester_CouseInstances()
	 * @model
	 * @generated
	 */
	EList<CourseInstances> getCouseInstances();

} // ProgrammeSemester
