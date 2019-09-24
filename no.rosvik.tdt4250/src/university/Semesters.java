/**
 */
package university;

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
 *   <li>{@link university.Semesters#getYear <em>Year</em>}</li>
 *   <li>{@link university.Semesters#getSemesterTime <em>Semester Time</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getSemesters()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validYear'"
 * @generated
 */
public interface Semesters extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see university.UniversityPackage#getSemesters_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link university.Semesters#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Semester Time</b></em>' attribute.
	 * The literals are from the enumeration {@link university.SemesterTime}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semester Time</em>' attribute.
	 * @see university.SemesterTime
	 * @see #setSemesterTime(SemesterTime)
	 * @see university.UniversityPackage#getSemesters_SemesterTime()
	 * @model
	 * @generated
	 */
	SemesterTime getSemesterTime();

	/**
	 * Sets the value of the '{@link university.Semesters#getSemesterTime <em>Semester Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semester Time</em>' attribute.
	 * @see university.SemesterTime
	 * @see #getSemesterTime()
	 * @generated
	 */
	void setSemesterTime(SemesterTime value);

} // Semesters
