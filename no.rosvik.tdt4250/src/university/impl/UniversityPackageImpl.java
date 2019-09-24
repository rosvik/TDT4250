/**
 */
package university.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import university.CourseInstances;
import university.Courses;
import university.ProgrammeInstances;
import university.ProgrammeSemesters;
import university.Programmes;
import university.SemesterTime;
import university.Semesters;
import university.Slot;
import university.SlotType;
import university.Specializations;
import university.University;
import university.UniversityFactory;
import university.UniversityPackage;

import university.util.UniversityValidator;

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
	private EClass programmeSemestersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass semestersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specializationsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass universityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum semesterTimeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum slotTypeEEnum = null;

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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theUniversityPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return UniversityValidator.INSTANCE;
				 }
			 });

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
	@Override
	public EClass getProgrammes() {
		return programmesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgrammes_Instances() {
		return (EReference)programmesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgrammes_Name() {
		return (EAttribute)programmesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgrammes_Code() {
		return (EAttribute)programmesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgrammeInstances() {
		return programmeInstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgrammeInstances_Programme() {
		return (EReference)programmeInstancesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgrammeInstances_Semesters() {
		return (EReference)programmeInstancesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgrammeInstances_Specializations() {
		return (EReference)programmeInstancesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProgrammeInstances_StartYear() {
		return (EAttribute)programmeInstancesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourses() {
		return coursesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourses_Instances() {
		return (EReference)coursesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourses_Credits() {
		return (EAttribute)coursesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourses_Code() {
		return (EAttribute)coursesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCourses_Name() {
		return (EAttribute)coursesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCourseInstances() {
		return courseInstancesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourseInstances_Course() {
		return (EReference)courseInstancesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCourseInstances_Semester() {
		return (EReference)courseInstancesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProgrammeSemesters() {
		return programmeSemestersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgrammeSemesters_ProgrammeInstance() {
		return (EReference)programmeSemestersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgrammeSemesters_Slots() {
		return (EReference)programmeSemestersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProgrammeSemesters_Semester() {
		return (EReference)programmeSemestersEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSlot() {
		return slotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSlot_ProgrammeSemester() {
		return (EReference)slotEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSlot_AvaliableCourses() {
		return (EReference)slotEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlot_Points() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlot_SlotType() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlot_Name() {
		return (EAttribute)slotEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSemesters() {
		return semestersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemesters_Year() {
		return (EAttribute)semestersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSemesters_SemesterTime() {
		return (EAttribute)semestersEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecializations() {
		return specializationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpecializations_ProgrammeInstance() {
		return (EReference)specializationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpecializations_Name() {
		return (EAttribute)specializationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUniversity() {
		return universityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversity_Programmes() {
		return (EReference)universityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversity_Courses() {
		return (EReference)universityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUniversity_CourseInstances() {
		return (EReference)universityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSemesterTime() {
		return semesterTimeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSlotType() {
		return slotTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
		createEAttribute(programmesEClass, PROGRAMMES__CODE);

		programmeInstancesEClass = createEClass(PROGRAMME_INSTANCES);
		createEReference(programmeInstancesEClass, PROGRAMME_INSTANCES__PROGRAMME);
		createEReference(programmeInstancesEClass, PROGRAMME_INSTANCES__SEMESTERS);
		createEReference(programmeInstancesEClass, PROGRAMME_INSTANCES__SPECIALIZATIONS);
		createEAttribute(programmeInstancesEClass, PROGRAMME_INSTANCES__START_YEAR);

		coursesEClass = createEClass(COURSES);
		createEReference(coursesEClass, COURSES__INSTANCES);
		createEAttribute(coursesEClass, COURSES__CREDITS);
		createEAttribute(coursesEClass, COURSES__CODE);
		createEAttribute(coursesEClass, COURSES__NAME);

		courseInstancesEClass = createEClass(COURSE_INSTANCES);
		createEReference(courseInstancesEClass, COURSE_INSTANCES__COURSE);
		createEReference(courseInstancesEClass, COURSE_INSTANCES__SEMESTER);

		programmeSemestersEClass = createEClass(PROGRAMME_SEMESTERS);
		createEReference(programmeSemestersEClass, PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE);
		createEReference(programmeSemestersEClass, PROGRAMME_SEMESTERS__SLOTS);
		createEReference(programmeSemestersEClass, PROGRAMME_SEMESTERS__SEMESTER);

		slotEClass = createEClass(SLOT);
		createEReference(slotEClass, SLOT__PROGRAMME_SEMESTER);
		createEReference(slotEClass, SLOT__AVALIABLE_COURSES);
		createEAttribute(slotEClass, SLOT__POINTS);
		createEAttribute(slotEClass, SLOT__SLOT_TYPE);
		createEAttribute(slotEClass, SLOT__NAME);

		semestersEClass = createEClass(SEMESTERS);
		createEAttribute(semestersEClass, SEMESTERS__YEAR);
		createEAttribute(semestersEClass, SEMESTERS__SEMESTER_TIME);

		specializationsEClass = createEClass(SPECIALIZATIONS);
		createEReference(specializationsEClass, SPECIALIZATIONS__PROGRAMME_INSTANCE);
		createEAttribute(specializationsEClass, SPECIALIZATIONS__NAME);

		universityEClass = createEClass(UNIVERSITY);
		createEReference(universityEClass, UNIVERSITY__PROGRAMMES);
		createEReference(universityEClass, UNIVERSITY__COURSES);
		createEReference(universityEClass, UNIVERSITY__COURSE_INSTANCES);

		// Create enums
		semesterTimeEEnum = createEEnum(SEMESTER_TIME);
		slotTypeEEnum = createEEnum(SLOT_TYPE);
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
		initEAttribute(getProgrammes_Name(), ecorePackage.getEString(), "name", null, 0, 1, Programmes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgrammes_Code(), ecorePackage.getEString(), "code", null, 0, 1, Programmes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programmeInstancesEClass, ProgrammeInstances.class, "ProgrammeInstances", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgrammeInstances_Programme(), this.getProgrammes(), this.getProgrammes_Instances(), "programme", null, 1, 1, ProgrammeInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgrammeInstances_Semesters(), this.getProgrammeSemesters(), this.getProgrammeSemesters_ProgrammeInstance(), "semesters", null, 1, 1, ProgrammeInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgrammeInstances_Specializations(), this.getSpecializations(), this.getSpecializations_ProgrammeInstance(), "specializations", null, 0, -1, ProgrammeInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgrammeInstances_StartYear(), ecorePackage.getEInt(), "startYear", null, 0, 1, ProgrammeInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(coursesEClass, Courses.class, "Courses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourses_Instances(), this.getCourseInstances(), this.getCourseInstances_Course(), "instances", null, 0, -1, Courses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourses_Credits(), ecorePackage.getEFloat(), "credits", null, 0, 1, Courses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourses_Code(), ecorePackage.getEString(), "code", null, 0, 1, Courses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCourses_Name(), ecorePackage.getEString(), "name", null, 0, 1, Courses.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(courseInstancesEClass, CourseInstances.class, "CourseInstances", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCourseInstances_Course(), this.getCourses(), this.getCourses_Instances(), "course", null, 1, 1, CourseInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCourseInstances_Semester(), this.getSemesters(), null, "semester", null, 1, 1, CourseInstances.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programmeSemestersEClass, ProgrammeSemesters.class, "ProgrammeSemesters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProgrammeSemesters_ProgrammeInstance(), this.getProgrammeInstances(), this.getProgrammeInstances_Semesters(), "programmeInstance", null, 0, -1, ProgrammeSemesters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgrammeSemesters_Slots(), this.getSlot(), this.getSlot_ProgrammeSemester(), "slots", null, 0, -1, ProgrammeSemesters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProgrammeSemesters_Semester(), this.getSemesters(), null, "semester", null, 1, 1, ProgrammeSemesters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slotEClass, Slot.class, "Slot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSlot_ProgrammeSemester(), this.getProgrammeSemesters(), this.getProgrammeSemesters_Slots(), "programmeSemester", null, 1, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSlot_AvaliableCourses(), this.getCourseInstances(), null, "avaliableCourses", null, 0, -1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_Points(), ecorePackage.getEInt(), "points", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_SlotType(), this.getSlotType(), "slotType", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlot_Name(), ecorePackage.getEString(), "name", null, 0, 1, Slot.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(semestersEClass, Semesters.class, "Semesters", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSemesters_Year(), ecorePackage.getEInt(), "year", null, 0, 1, Semesters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSemesters_SemesterTime(), this.getSemesterTime(), "semesterTime", null, 0, 1, Semesters.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specializationsEClass, Specializations.class, "Specializations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecializations_ProgrammeInstance(), this.getProgrammeInstances(), this.getProgrammeInstances_Specializations(), "programmeInstance", null, 1, 1, Specializations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecializations_Name(), ecorePackage.getEString(), "name", null, 0, 1, Specializations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(universityEClass, University.class, "University", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUniversity_Programmes(), this.getProgrammes(), null, "programmes", null, 0, -1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversity_Courses(), this.getCourses(), null, "courses", null, 0, -1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUniversity_CourseInstances(), this.getCourseInstances(), null, "courseInstances", null, 0, -1, University.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(semesterTimeEEnum, SemesterTime.class, "SemesterTime");
		addEEnumLiteral(semesterTimeEEnum, SemesterTime.FALL);
		addEEnumLiteral(semesterTimeEEnum, SemesterTime.SPRING);

		initEEnum(slotTypeEEnum, SlotType.class, "SlotType");
		addEEnumLiteral(slotTypeEEnum, SlotType.O);
		addEEnumLiteral(slotTypeEEnum, SlotType.V);
		addEEnumLiteral(slotTypeEEnum, SlotType.V2);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (semestersEClass,
		   source,
		   new String[] {
			   "constraints", "validYear"
		   });
	}

} //UniversityPackageImpl
