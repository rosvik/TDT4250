/**
 */
package university;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see university.UniversityFactory
 * @model kind="package"
 * @generated
 */
public interface UniversityPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "university";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "no.rosvik.uni.test";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uni";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UniversityPackage eINSTANCE = university.impl.UniversityPackageImpl.init();

	/**
	 * The meta object id for the '{@link university.impl.ProgrammesImpl <em>Programmes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see university.impl.ProgrammesImpl
	 * @see university.impl.UniversityPackageImpl#getProgrammes()
	 * @generated
	 */
	int PROGRAMMES = 0;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMES__INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMES__NAME = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMES__CODE = 2;

	/**
	 * The number of structural features of the '<em>Programmes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMES_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Programmes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMMES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link university.impl.ProgrammeInstancesImpl <em>Programme Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see university.impl.ProgrammeInstancesImpl
	 * @see university.impl.UniversityPackageImpl#getProgrammeInstances()
	 * @generated
	 */
	int PROGRAMME_INSTANCES = 1;

	/**
	 * The feature id for the '<em><b>Programme</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_INSTANCES__PROGRAMME = 0;

	/**
	 * The feature id for the '<em><b>Semesters</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_INSTANCES__SEMESTERS = 1;

	/**
	 * The feature id for the '<em><b>Specializations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_INSTANCES__SPECIALIZATIONS = 2;

	/**
	 * The feature id for the '<em><b>Start Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_INSTANCES__START_YEAR = 3;

	/**
	 * The number of structural features of the '<em>Programme Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_INSTANCES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Programme Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_INSTANCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link university.impl.CoursesImpl <em>Courses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see university.impl.CoursesImpl
	 * @see university.impl.UniversityPackageImpl#getCourses()
	 * @generated
	 */
	int COURSES = 2;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES__INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES__CREDITS = 1;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES__CODE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES__NAME = 3;

	/**
	 * The number of structural features of the '<em>Courses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Courses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link university.impl.CourseInstancesImpl <em>Course Instances</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see university.impl.CourseInstancesImpl
	 * @see university.impl.UniversityPackageImpl#getCourseInstances()
	 * @generated
	 */
	int COURSE_INSTANCES = 3;

	/**
	 * The feature id for the '<em><b>Course</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCES__COURSE = 0;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCES__SEMESTER = 1;

	/**
	 * The number of structural features of the '<em>Course Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Course Instances</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COURSE_INSTANCES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link university.impl.ProgrammeSemestersImpl <em>Programme Semesters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see university.impl.ProgrammeSemestersImpl
	 * @see university.impl.UniversityPackageImpl#getProgrammeSemesters()
	 * @generated
	 */
	int PROGRAMME_SEMESTERS = 4;

	/**
	 * The feature id for the '<em><b>Programme Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Couse Instances</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_SEMESTERS__COUSE_INSTANCES = 1;

	/**
	 * The feature id for the '<em><b>Semester</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_SEMESTERS__SEMESTER = 2;

	/**
	 * The number of structural features of the '<em>Programme Semesters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_SEMESTERS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Programme Semesters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMME_SEMESTERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link university.impl.SemestersImpl <em>Semesters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see university.impl.SemestersImpl
	 * @see university.impl.UniversityPackageImpl#getSemesters()
	 * @generated
	 */
	int SEMESTERS = 5;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTERS__YEAR = 0;

	/**
	 * The feature id for the '<em><b>Season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTERS__SEASON = 1;

	/**
	 * The number of structural features of the '<em>Semesters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTERS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Semesters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEMESTERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link university.impl.SpecializationsImpl <em>Specializations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see university.impl.SpecializationsImpl
	 * @see university.impl.UniversityPackageImpl#getSpecializations()
	 * @generated
	 */
	int SPECIALIZATIONS = 6;

	/**
	 * The feature id for the '<em><b>Programme Instance</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATIONS__PROGRAMME_INSTANCE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATIONS__NAME = 1;

	/**
	 * The number of structural features of the '<em>Specializations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Specializations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIALIZATIONS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link university.Programmes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programmes</em>'.
	 * @see university.Programmes
	 * @generated
	 */
	EClass getProgrammes();

	/**
	 * Returns the meta object for the reference list '{@link university.Programmes#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see university.Programmes#getInstances()
	 * @see #getProgrammes()
	 * @generated
	 */
	EReference getProgrammes_Instances();

	/**
	 * Returns the meta object for the attribute '{@link university.Programmes#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see university.Programmes#getName()
	 * @see #getProgrammes()
	 * @generated
	 */
	EAttribute getProgrammes_Name();

	/**
	 * Returns the meta object for the attribute '{@link university.Programmes#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see university.Programmes#getCode()
	 * @see #getProgrammes()
	 * @generated
	 */
	EAttribute getProgrammes_Code();

	/**
	 * Returns the meta object for class '{@link university.ProgrammeInstances <em>Programme Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme Instances</em>'.
	 * @see university.ProgrammeInstances
	 * @generated
	 */
	EClass getProgrammeInstances();

	/**
	 * Returns the meta object for the reference '{@link university.ProgrammeInstances#getProgramme <em>Programme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Programme</em>'.
	 * @see university.ProgrammeInstances#getProgramme()
	 * @see #getProgrammeInstances()
	 * @generated
	 */
	EReference getProgrammeInstances_Programme();

	/**
	 * Returns the meta object for the reference '{@link university.ProgrammeInstances#getSemesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semesters</em>'.
	 * @see university.ProgrammeInstances#getSemesters()
	 * @see #getProgrammeInstances()
	 * @generated
	 */
	EReference getProgrammeInstances_Semesters();

	/**
	 * Returns the meta object for the reference list '{@link university.ProgrammeInstances#getSpecializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specializations</em>'.
	 * @see university.ProgrammeInstances#getSpecializations()
	 * @see #getProgrammeInstances()
	 * @generated
	 */
	EReference getProgrammeInstances_Specializations();

	/**
	 * Returns the meta object for the attribute '{@link university.ProgrammeInstances#getStartYear <em>Start Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Year</em>'.
	 * @see university.ProgrammeInstances#getStartYear()
	 * @see #getProgrammeInstances()
	 * @generated
	 */
	EAttribute getProgrammeInstances_StartYear();

	/**
	 * Returns the meta object for class '{@link university.Courses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Courses</em>'.
	 * @see university.Courses
	 * @generated
	 */
	EClass getCourses();

	/**
	 * Returns the meta object for the reference list '{@link university.Courses#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Instances</em>'.
	 * @see university.Courses#getInstances()
	 * @see #getCourses()
	 * @generated
	 */
	EReference getCourses_Instances();

	/**
	 * Returns the meta object for the attribute '{@link university.Courses#getCredits <em>Credits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credits</em>'.
	 * @see university.Courses#getCredits()
	 * @see #getCourses()
	 * @generated
	 */
	EAttribute getCourses_Credits();

	/**
	 * Returns the meta object for the attribute '{@link university.Courses#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see university.Courses#getCode()
	 * @see #getCourses()
	 * @generated
	 */
	EAttribute getCourses_Code();

	/**
	 * Returns the meta object for the attribute '{@link university.Courses#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see university.Courses#getName()
	 * @see #getCourses()
	 * @generated
	 */
	EAttribute getCourses_Name();

	/**
	 * Returns the meta object for class '{@link university.CourseInstances <em>Course Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Course Instances</em>'.
	 * @see university.CourseInstances
	 * @generated
	 */
	EClass getCourseInstances();

	/**
	 * Returns the meta object for the reference '{@link university.CourseInstances#getCourse <em>Course</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Course</em>'.
	 * @see university.CourseInstances#getCourse()
	 * @see #getCourseInstances()
	 * @generated
	 */
	EReference getCourseInstances_Course();

	/**
	 * Returns the meta object for the reference '{@link university.CourseInstances#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semester</em>'.
	 * @see university.CourseInstances#getSemester()
	 * @see #getCourseInstances()
	 * @generated
	 */
	EReference getCourseInstances_Semester();

	/**
	 * Returns the meta object for class '{@link university.ProgrammeSemesters <em>Programme Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programme Semesters</em>'.
	 * @see university.ProgrammeSemesters
	 * @generated
	 */
	EClass getProgrammeSemesters();

	/**
	 * Returns the meta object for the reference '{@link university.ProgrammeSemesters#getProgrammeInstance <em>Programme Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Programme Instance</em>'.
	 * @see university.ProgrammeSemesters#getProgrammeInstance()
	 * @see #getProgrammeSemesters()
	 * @generated
	 */
	EReference getProgrammeSemesters_ProgrammeInstance();

	/**
	 * Returns the meta object for the reference list '{@link university.ProgrammeSemesters#getCouseInstances <em>Couse Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Couse Instances</em>'.
	 * @see university.ProgrammeSemesters#getCouseInstances()
	 * @see #getProgrammeSemesters()
	 * @generated
	 */
	EReference getProgrammeSemesters_CouseInstances();

	/**
	 * Returns the meta object for the reference '{@link university.ProgrammeSemesters#getSemester <em>Semester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Semester</em>'.
	 * @see university.ProgrammeSemesters#getSemester()
	 * @see #getProgrammeSemesters()
	 * @generated
	 */
	EReference getProgrammeSemesters_Semester();

	/**
	 * Returns the meta object for class '{@link university.Semesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Semesters</em>'.
	 * @see university.Semesters
	 * @generated
	 */
	EClass getSemesters();

	/**
	 * Returns the meta object for the attribute '{@link university.Semesters#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see university.Semesters#getYear()
	 * @see #getSemesters()
	 * @generated
	 */
	EAttribute getSemesters_Year();

	/**
	 * Returns the meta object for the attribute '{@link university.Semesters#isSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Season</em>'.
	 * @see university.Semesters#isSeason()
	 * @see #getSemesters()
	 * @generated
	 */
	EAttribute getSemesters_Season();

	/**
	 * Returns the meta object for class '{@link university.Specializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Specializations</em>'.
	 * @see university.Specializations
	 * @generated
	 */
	EClass getSpecializations();

	/**
	 * Returns the meta object for the reference '{@link university.Specializations#getProgrammeInstance <em>Programme Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Programme Instance</em>'.
	 * @see university.Specializations#getProgrammeInstance()
	 * @see #getSpecializations()
	 * @generated
	 */
	EReference getSpecializations_ProgrammeInstance();

	/**
	 * Returns the meta object for the attribute '{@link university.Specializations#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see university.Specializations#getName()
	 * @see #getSpecializations()
	 * @generated
	 */
	EAttribute getSpecializations_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UniversityFactory getUniversityFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link university.impl.ProgrammesImpl <em>Programmes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see university.impl.ProgrammesImpl
		 * @see university.impl.UniversityPackageImpl#getProgrammes()
		 * @generated
		 */
		EClass PROGRAMMES = eINSTANCE.getProgrammes();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMMES__INSTANCES = eINSTANCE.getProgrammes_Instances();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMES__NAME = eINSTANCE.getProgrammes_Name();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMMES__CODE = eINSTANCE.getProgrammes_Code();

		/**
		 * The meta object literal for the '{@link university.impl.ProgrammeInstancesImpl <em>Programme Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see university.impl.ProgrammeInstancesImpl
		 * @see university.impl.UniversityPackageImpl#getProgrammeInstances()
		 * @generated
		 */
		EClass PROGRAMME_INSTANCES = eINSTANCE.getProgrammeInstances();

		/**
		 * The meta object literal for the '<em><b>Programme</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_INSTANCES__PROGRAMME = eINSTANCE.getProgrammeInstances_Programme();

		/**
		 * The meta object literal for the '<em><b>Semesters</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_INSTANCES__SEMESTERS = eINSTANCE.getProgrammeInstances_Semesters();

		/**
		 * The meta object literal for the '<em><b>Specializations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_INSTANCES__SPECIALIZATIONS = eINSTANCE.getProgrammeInstances_Specializations();

		/**
		 * The meta object literal for the '<em><b>Start Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMME_INSTANCES__START_YEAR = eINSTANCE.getProgrammeInstances_StartYear();

		/**
		 * The meta object literal for the '{@link university.impl.CoursesImpl <em>Courses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see university.impl.CoursesImpl
		 * @see university.impl.UniversityPackageImpl#getCourses()
		 * @generated
		 */
		EClass COURSES = eINSTANCE.getCourses();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSES__INSTANCES = eINSTANCE.getCourses_Instances();

		/**
		 * The meta object literal for the '<em><b>Credits</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSES__CREDITS = eINSTANCE.getCourses_Credits();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSES__CODE = eINSTANCE.getCourses_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COURSES__NAME = eINSTANCE.getCourses_Name();

		/**
		 * The meta object literal for the '{@link university.impl.CourseInstancesImpl <em>Course Instances</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see university.impl.CourseInstancesImpl
		 * @see university.impl.UniversityPackageImpl#getCourseInstances()
		 * @generated
		 */
		EClass COURSE_INSTANCES = eINSTANCE.getCourseInstances();

		/**
		 * The meta object literal for the '<em><b>Course</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCES__COURSE = eINSTANCE.getCourseInstances_Course();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COURSE_INSTANCES__SEMESTER = eINSTANCE.getCourseInstances_Semester();

		/**
		 * The meta object literal for the '{@link university.impl.ProgrammeSemestersImpl <em>Programme Semesters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see university.impl.ProgrammeSemestersImpl
		 * @see university.impl.UniversityPackageImpl#getProgrammeSemesters()
		 * @generated
		 */
		EClass PROGRAMME_SEMESTERS = eINSTANCE.getProgrammeSemesters();

		/**
		 * The meta object literal for the '<em><b>Programme Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE = eINSTANCE.getProgrammeSemesters_ProgrammeInstance();

		/**
		 * The meta object literal for the '<em><b>Couse Instances</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_SEMESTERS__COUSE_INSTANCES = eINSTANCE.getProgrammeSemesters_CouseInstances();

		/**
		 * The meta object literal for the '<em><b>Semester</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMME_SEMESTERS__SEMESTER = eINSTANCE.getProgrammeSemesters_Semester();

		/**
		 * The meta object literal for the '{@link university.impl.SemestersImpl <em>Semesters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see university.impl.SemestersImpl
		 * @see university.impl.UniversityPackageImpl#getSemesters()
		 * @generated
		 */
		EClass SEMESTERS = eINSTANCE.getSemesters();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTERS__YEAR = eINSTANCE.getSemesters_Year();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEMESTERS__SEASON = eINSTANCE.getSemesters_Season();

		/**
		 * The meta object literal for the '{@link university.impl.SpecializationsImpl <em>Specializations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see university.impl.SpecializationsImpl
		 * @see university.impl.UniversityPackageImpl#getSpecializations()
		 * @generated
		 */
		EClass SPECIALIZATIONS = eINSTANCE.getSpecializations();

		/**
		 * The meta object literal for the '<em><b>Programme Instance</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPECIALIZATIONS__PROGRAMME_INSTANCE = eINSTANCE.getSpecializations_ProgrammeInstance();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIALIZATIONS__NAME = eINSTANCE.getSpecializations_Name();

	}

} //UniversityPackage
