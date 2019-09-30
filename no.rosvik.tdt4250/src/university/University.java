/**
 */
package university;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.University#getProgrammes <em>Programmes</em>}</li>
 *   <li>{@link university.University#getCourses <em>Courses</em>}</li>
 *   <li>{@link university.University#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' containment reference list.
	 * The list contents are of type {@link university.Programmes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' containment reference list.
	 * @see university.UniversityPackage#getUniversity_Programmes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Programmes> getProgrammes();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link university.Courses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see university.UniversityPackage#getUniversity_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Courses> getCourses();

	/**
	 * Returns the value of the '<em><b>Semesters</b></em>' containment reference list.
	 * The list contents are of type {@link university.Semesters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semesters</em>' containment reference list.
	 * @see university.UniversityPackage#getUniversity_Semesters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Semesters> getSemesters();

} // University
