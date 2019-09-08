/**
 */
package university;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Instances</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.CourseInstances#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getCourseInstances()
 * @model
 * @generated
 */
public interface CourseInstances extends EObject {
	/**
	 * Returns the value of the '<em><b>Course</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link university.Courses#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Course</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' reference.
	 * @see #setCourse(Courses)
	 * @see university.UniversityPackage#getCourseInstances_Course()
	 * @see university.Courses#getInstances
	 * @model opposite="instances" required="true"
	 * @generated
	 */
	Courses getCourse();

	/**
	 * Sets the value of the '{@link university.CourseInstances#getCourse <em>Course</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course</em>' reference.
	 * @see #getCourse()
	 * @generated
	 */
	void setCourse(Courses value);

} // CourseInstances
