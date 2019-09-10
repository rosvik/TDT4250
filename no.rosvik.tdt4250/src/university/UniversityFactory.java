/**
 */
package university;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see university.UniversityPackage
 * @generated
 */
public interface UniversityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniversityFactory eINSTANCE = university.impl.UniversityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Programmes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programmes</em>'.
	 * @generated
	 */
	Programmes createProgrammes();

	/**
	 * Returns a new object of class '<em>Programme Instances</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programme Instances</em>'.
	 * @generated
	 */
	ProgrammeInstances createProgrammeInstances();

	/**
	 * Returns a new object of class '<em>Courses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Courses</em>'.
	 * @generated
	 */
	Courses createCourses();

	/**
	 * Returns a new object of class '<em>Course Instances</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Course Instances</em>'.
	 * @generated
	 */
	CourseInstances createCourseInstances();

	/**
	 * Returns a new object of class '<em>Programme Semesters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Programme Semesters</em>'.
	 * @generated
	 */
	ProgrammeSemesters createProgrammeSemesters();

	/**
	 * Returns a new object of class '<em>Semesters</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Semesters</em>'.
	 * @generated
	 */
	Semesters createSemesters();

	/**
	 * Returns a new object of class '<em>Specializations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Specializations</em>'.
	 * @generated
	 */
	Specializations createSpecializations();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UniversityPackage getUniversityPackage();

} //UniversityFactory
