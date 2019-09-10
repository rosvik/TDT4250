/**
 */
package university.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import university.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniversityFactoryImpl extends EFactoryImpl implements UniversityFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UniversityFactory init() {
		try {
			UniversityFactory theUniversityFactory = (UniversityFactory)EPackage.Registry.INSTANCE.getEFactory(UniversityPackage.eNS_URI);
			if (theUniversityFactory != null) {
				return theUniversityFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UniversityFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UniversityPackage.PROGRAMMES: return createProgrammes();
			case UniversityPackage.PROGRAMME_INSTANCES: return createProgrammeInstances();
			case UniversityPackage.COURSES: return createCourses();
			case UniversityPackage.COURSE_INSTANCES: return createCourseInstances();
			case UniversityPackage.PROGRAMME_SEMESTERS: return createProgrammeSemesters();
			case UniversityPackage.SEMESTERS: return createSemesters();
			case UniversityPackage.SPECIALIZATIONS: return createSpecializations();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programmes createProgrammes() {
		ProgrammesImpl programmes = new ProgrammesImpl();
		return programmes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeInstances createProgrammeInstances() {
		ProgrammeInstancesImpl programmeInstances = new ProgrammeInstancesImpl();
		return programmeInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Courses createCourses() {
		CoursesImpl courses = new CoursesImpl();
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CourseInstances createCourseInstances() {
		CourseInstancesImpl courseInstances = new CourseInstancesImpl();
		return courseInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeSemesters createProgrammeSemesters() {
		ProgrammeSemestersImpl programmeSemesters = new ProgrammeSemestersImpl();
		return programmeSemesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semesters createSemesters() {
		SemestersImpl semesters = new SemestersImpl();
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specializations createSpecializations() {
		SpecializationsImpl specializations = new SpecializationsImpl();
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UniversityPackage getUniversityPackage() {
		return (UniversityPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UniversityPackage getPackage() {
		return UniversityPackage.eINSTANCE;
	}

} //UniversityFactoryImpl
