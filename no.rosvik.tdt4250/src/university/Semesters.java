/**
 */
package university;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semesters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.Semesters#getSemesterInstances <em>Semester Instances</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getSemesters()
 * @model
 * @generated
 */
public interface Semesters extends EObject {
	/**
	 * Returns the value of the '<em><b>Semester Instances</b></em>' reference list.
	 * The list contents are of type {@link university.ProgrammeSemester}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semester Instances</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Instances</em>' reference list.
	 * @see university.UniversityPackage#getSemesters_SemesterInstances()
	 * @model
	 * @generated
	 */
	EList<ProgrammeSemester> getSemesterInstances();

} // Semesters
