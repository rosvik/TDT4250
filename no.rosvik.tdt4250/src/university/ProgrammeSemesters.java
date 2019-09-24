/**
 */
package university;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Programme Semesters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.ProgrammeSemesters#getProgrammeInstance <em>Programme Instance</em>}</li>
 *   <li>{@link university.ProgrammeSemesters#getSlots <em>Slots</em>}</li>
 *   <li>{@link university.ProgrammeSemesters#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getProgrammeSemesters()
 * @model
 * @generated
 */
public interface ProgrammeSemesters extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme Instance</b></em>' reference list.
	 * The list contents are of type {@link university.ProgrammeInstances}.
	 * It is bidirectional and its opposite is '{@link university.ProgrammeInstances#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Instance</em>' reference list.
	 * @see university.UniversityPackage#getProgrammeSemesters_ProgrammeInstance()
	 * @see university.ProgrammeInstances#getSemesters
	 * @model opposite="semesters"
	 * @generated
	 */
	EList<ProgrammeInstances> getProgrammeInstance();

	/**
	 * Returns the value of the '<em><b>Slots</b></em>' reference list.
	 * The list contents are of type {@link university.Slot}.
	 * It is bidirectional and its opposite is '{@link university.Slot#getProgrammeSemester <em>Programme Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slots</em>' reference list.
	 * @see university.UniversityPackage#getProgrammeSemesters_Slots()
	 * @see university.Slot#getProgrammeSemester
	 * @model opposite="programmeSemester"
	 * @generated
	 */
	EList<Slot> getSlots();

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' reference.
	 * @see #setSemester(Semesters)
	 * @see university.UniversityPackage#getProgrammeSemesters_Semester()
	 * @model required="true"
	 * @generated
	 */
	Semesters getSemester();

	/**
	 * Sets the value of the '{@link university.ProgrammeSemesters#getSemester <em>Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester</em>' reference.
	 * @see #getSemester()
	 * @generated
	 */
	void setSemester(Semesters value);

} // ProgrammeSemesters
