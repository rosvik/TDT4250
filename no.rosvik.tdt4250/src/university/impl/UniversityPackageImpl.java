/**
 */
package university.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import university.CourseInstances;
import university.Courses;
import university.ProgrammeInstances;
import university.ProgrammeSemester;
import university.Programmes;
import university.Semesters;
import university.UniversityFactory;
import university.UniversityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniversityPackageImpl extends EPackageImpl implements UniversityPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmeInstancesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coursesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass courseInstancesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programmeSemesterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semestersEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see university.UniversityPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UniversityPackageImpl() {
		super(eNS_URI, UniversityFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link UniversityPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UniversityPackage init() {
		if (isInited) return (UniversityPackage)EPackage.Registry.INSTANCE.getEPackage(UniversityPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredUniversityPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		UniversityPackageImpl theUniversityPackage = registeredUniversityPackage instanceof UniversityPackageImpl ? (UniversityPackageImpl)registeredUniversityPackage : new UniversityPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theUniversityPackage.createPackageContents();

		// Initialize created meta-data
		theUniversityPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUniversityPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UniversityPackage.eNS_URI, theUniversityPackage);
		return theUniversityPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgrammes() {
		return programmesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgrammes_Instances() {
		return (EReference)programmesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgrammes_Name() {
		return (EAttribute)programmesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgrammeInstances() {
		return programmeInstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgrammeInstances_Programme() {
		return (EReference)programmeInstancesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgrammeInstances_Semesters() {
		return (EReference)programmeInstancesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourses() {
		return coursesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourses_Instances() {
		return (EReference)coursesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourses_Credits() {
		return (EAttribute)coursesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourses_Code() {
		return (EAttribute)coursesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCourses_Name() {
		return (EAttribute)coursesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCourseInstances() {
		return courseInstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCourseInstances_Course() {
		return (EReference)courseInstancesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgrammeSemester() {
		return programmeSemesterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgrammeSemester_ProgrammeInstance() {
		return (EReference)programmeSemesterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgrammeSemester_CouseInstances() {
		return (EReference)programmeSemesterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSemesters() {
		return semestersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSemesters_SemesterInstances() {
		return (EReference)semestersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityFactory getUniversityFactory() {
		return (UniversityFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		programmesEClass = createEClass(PROGRAMMES);
		createEReference(programmesEClass, PROGRAMMES__INSTANCES);
		createEAttribute(programmesEClass, PROGRAMMES__NAME);

		programmeInstancesEClass = createEClass(PROGRAMME_INSTANCES);
		createEReference(programmeInstancesEClass, PROGRAMME_INSTANCES__PROGRAMME);
		createEReference(programmeInstancesEClass, PROGRAMME_INSTANCES__SEMESTERS);

		coursesEClass = createEClass(COURSES);
		createEReference(coursesEClass, COURSES__INSTANCES);
		createEAttribute(coursesEClass, COURSES__CREDITS);
		createEAttribute(coursesEClass, COURSES__CODE);
		createEAttribute(coursesEClass, COURSES__NAME);

		courseInstancesEClass = createEClass(COURSE_INSTANCES);
		createEReference(courseInstancesEClass, COURSE_INSTANCES__COURSE);

		programmeSemesterEClass = createEClass(PROGRAMME_SEMESTER);
		createEReference(programmeSemesterEClass, PROGRAMME_SEMESTER__PROGRAMME_INSTANCE);
		createEReference(programmeSemesterEClass, PROGRAMME_SEMESTER__COUSE_INSTANCES);

		semestersEClass = createEClass(SEMESTERS);
		createEReference(semestersEClass, SEMESTERS__SEMESTER_INSTANCES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(programmesEClass, Programmes.class, "Programmes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgrammes_Instances(), this.getProgrammeInstances(), this.getProgrammeInstances_Programme(), "instances", null, 0, -1, Programmes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgrammes_Name(), ecorePackage.getEString(), "Name", null, 0, 1, Programmes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programmeInstancesEClass, ProgrammeInstances.class, "ProgrammeInstances", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgrammeInstances_Programme(), this.getProgrammes(), this.getProgrammes_Instances(), "programme", null, 1, 1, ProgrammeInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgrammeInstances_Semesters(), this.getProgrammeSemester(), this.getProgrammeSemester_ProgrammeInstance(), "semesters", null, 0, -1, ProgrammeInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coursesEClass, Courses.class, "Courses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourses_Instances(), this.getCourseInstances(), this.getCourseInstances_Course(), "instances", null, 0, -1, Courses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourses_Credits(), ecorePackage.getEFloat(), "credits", null, 0, 1, Courses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourses_Code(), ecorePackage.getEString(), "code", null, 0, 1, Courses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourses_Name(), ecorePackage.getEString(), "name", null, 0, 1, Courses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseInstancesEClass, CourseInstances.class, "CourseInstances", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourseInstances_Course(), this.getCourses(), this.getCourses_Instances(), "course", null, 1, 1, CourseInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programmeSemesterEClass, ProgrammeSemester.class, "ProgrammeSemester", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgrammeSemester_ProgrammeInstance(), this.getProgrammeInstances(), this.getProgrammeInstances_Semesters(), "programmeInstance", null, 0, 1, ProgrammeSemester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgrammeSemester_CouseInstances(), this.getCourseInstances(), null, "couseInstances", null, 0, -1, ProgrammeSemester.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semestersEClass, Semesters.class, "Semesters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSemesters_SemesterInstances(), this.getProgrammeSemester(), null, "semesterInstances", null, 0, -1, Semesters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UniversityPackageImpl
