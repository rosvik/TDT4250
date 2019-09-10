/**
 */
package university.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import university.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see university.UniversityPackage
 * @generated
 */
public class UniversityAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UniversityPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UniversityPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversitySwitch<Adapter> modelSwitch =
		new UniversitySwitch<Adapter>() {
			@Override
			public Adapter caseProgrammes(Programmes object) {
				return createProgrammesAdapter();
			}
			@Override
			public Adapter caseProgrammeInstances(ProgrammeInstances object) {
				return createProgrammeInstancesAdapter();
			}
			@Override
			public Adapter caseCourses(Courses object) {
				return createCoursesAdapter();
			}
			@Override
			public Adapter caseCourseInstances(CourseInstances object) {
				return createCourseInstancesAdapter();
			}
			@Override
			public Adapter caseProgrammeSemesters(ProgrammeSemesters object) {
				return createProgrammeSemestersAdapter();
			}
			@Override
			public Adapter caseSemesters(Semesters object) {
				return createSemestersAdapter();
			}
			@Override
			public Adapter caseSpecializations(Specializations object) {
				return createSpecializationsAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link university.Programmes <em>Programmes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see university.Programmes
	 * @generated
	 */
	public Adapter createProgrammesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link university.ProgrammeInstances <em>Programme Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see university.ProgrammeInstances
	 * @generated
	 */
	public Adapter createProgrammeInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link university.Courses <em>Courses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see university.Courses
	 * @generated
	 */
	public Adapter createCoursesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link university.CourseInstances <em>Course Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see university.CourseInstances
	 * @generated
	 */
	public Adapter createCourseInstancesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link university.ProgrammeSemesters <em>Programme Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see university.ProgrammeSemesters
	 * @generated
	 */
	public Adapter createProgrammeSemestersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link university.Semesters <em>Semesters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see university.Semesters
	 * @generated
	 */
	public Adapter createSemestersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link university.Specializations <em>Specializations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see university.Specializations
	 * @generated
	 */
	public Adapter createSpecializationsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UniversityAdapterFactory
