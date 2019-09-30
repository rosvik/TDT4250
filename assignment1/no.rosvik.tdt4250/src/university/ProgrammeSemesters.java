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
 *   <li>{@link university.ProgrammeSemesters#getSpecialization <em>Specialization</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getProgrammeSemesters()
 * @model
 * @generated
 */
public interface ProgrammeSemesters extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme Instance</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link university.ProgrammeInstances#getProgrammeSemesters <em>Programme Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Instance</em>' container reference.
	 * @see #setProgrammeInstance(ProgrammeInstances)
	 * @see university.UniversityPackage#getProgrammeSemesters_ProgrammeInstance()
	 * @see university.ProgrammeInstances#getProgrammeSemesters
	 * @model opposite="programmeSemesters" transient="false"
	 * @generated
	 */
	ProgrammeInstances getProgrammeInstance();

	/**
	 * Sets the value of the '{@link university.ProgrammeSemesters#getProgrammeInstance <em>Programme Instance</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Instance</em>' container reference.
	 * @see #getProgrammeInstance()
	 * @generated
	 */
	void setProgrammeInstance(ProgrammeInstances value);

	/**
	 * Returns the value of the '<em><b>Slots</b></em>' containment reference list.
	 * The list contents are of type {@link university.Slot}.
	 * It is bidirectional and its opposite is '{@link university.Slot#getProgrammeSemester <em>Programme Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slots</em>' containment reference list.
	 * @see university.UniversityPackage#getProgrammeSemesters_Slots()
	 * @see university.Slot#getProgrammeSemester
	 * @model opposite="programmeSemester" containment="true"
	 * @generated
	 */
	EList<Slot> getSlots();

	/**
	 * Returns the value of the '<em><b>Semester</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link university.Semesters#getProgrammeSemesters <em>Programme Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester</em>' reference.
	 * @see #setSemester(Semesters)
	 * @see university.UniversityPackage#getProgrammeSemesters_Semester()
	 * @see university.Semesters#getProgrammeSemesters
	 * @model opposite="programmeSemesters" required="true"
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

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link university.Specializations#getProgrammeSemester <em>Programme Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' container reference.
	 * @see #setSpecialization(Specializations)
	 * @see university.UniversityPackage#getProgrammeSemesters_Specialization()
	 * @see university.Specializations#getProgrammeSemester
	 * @model opposite="programmeSemester" transient="false"
	 * @generated
	 */
	Specializations getSpecialization();

	/**
	 * Sets the value of the '{@link university.ProgrammeSemesters#getSpecialization <em>Specialization</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' container reference.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(Specializations value);

} // ProgrammeSemesters
