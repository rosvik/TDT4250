/**
 */
package university.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import university.CourseInstances;
import university.Courses;
import university.Programmes;
import university.University;
import university.UniversityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>University</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link university.impl.UniversityImpl#getProgrammes <em>Programmes</em>}</li>
 *   <li>{@link university.impl.UniversityImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link university.impl.UniversityImpl#getCourseInstances <em>Course Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversityImpl extends MinimalEObjectImpl.Container implements University {
	/**
	 * The cached value of the '{@link #getProgrammes() <em>Programmes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammes()
	 * @generated
	 * @ordered
	 */
	protected EList<Programmes> programmes;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Courses> courses;

	/**
	 * The cached value of the '{@link #getCourseInstances() <em>Course Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseInstances> courseInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UniversityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityPackage.Literals.UNIVERSITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Programmes> getProgrammes() {
		if (programmes == null) {
			programmes = new EObjectResolvingEList<Programmes>(Programmes.class, this, UniversityPackage.UNIVERSITY__PROGRAMMES);
		}
		return programmes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Courses> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<Courses>(Courses.class, this, UniversityPackage.UNIVERSITY__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseInstances> getCourseInstances() {
		if (courseInstances == null) {
			courseInstances = new EObjectResolvingEList<CourseInstances>(CourseInstances.class, this, UniversityPackage.UNIVERSITY__COURSE_INSTANCES);
		}
		return courseInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityPackage.UNIVERSITY__PROGRAMMES:
				return getProgrammes();
			case UniversityPackage.UNIVERSITY__COURSES:
				return getCourses();
			case UniversityPackage.UNIVERSITY__COURSE_INSTANCES:
				return getCourseInstances();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversityPackage.UNIVERSITY__PROGRAMMES:
				getProgrammes().clear();
				getProgrammes().addAll((Collection<? extends Programmes>)newValue);
				return;
			case UniversityPackage.UNIVERSITY__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Courses>)newValue);
				return;
			case UniversityPackage.UNIVERSITY__COURSE_INSTANCES:
				getCourseInstances().clear();
				getCourseInstances().addAll((Collection<? extends CourseInstances>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case UniversityPackage.UNIVERSITY__PROGRAMMES:
				getProgrammes().clear();
				return;
			case UniversityPackage.UNIVERSITY__COURSES:
				getCourses().clear();
				return;
			case UniversityPackage.UNIVERSITY__COURSE_INSTANCES:
				getCourseInstances().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case UniversityPackage.UNIVERSITY__PROGRAMMES:
				return programmes != null && !programmes.isEmpty();
			case UniversityPackage.UNIVERSITY__COURSES:
				return courses != null && !courses.isEmpty();
			case UniversityPackage.UNIVERSITY__COURSE_INSTANCES:
				return courseInstances != null && !courseInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UniversityImpl
