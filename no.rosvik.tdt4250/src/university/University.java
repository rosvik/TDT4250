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
 *   <li>{@link university.University#getCourseInstances <em>Course Instances</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getUniversity()
 * @model
 * @generated
 */
public interface University extends EObject {
	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' reference list.
	 * The list contents are of type {@link university.Programmes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' reference list.
	 * @see university.UniversityPackage#getUniversity_Programmes()
	 * @model
	 * @generated
	 */
	EList<Programmes> getProgrammes();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link university.Courses}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see university.UniversityPackage#getUniversity_Courses()
	 * @model
	 * @generated
	 */
	EList<Courses> getCourses();

	/**
	 * Returns the value of the '<em><b>Course Instances</b></em>' reference list.
	 * The list contents are of type {@link university.CourseInstances}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Instances</em>' reference list.
	 * @see university.UniversityPackage#getUniversity_CourseInstances()
	 * @model
	 * @generated
	 */
	EList<CourseInstances> getCourseInstances();

} // University
