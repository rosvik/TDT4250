/**
 */
package university.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import university.Courses;
import university.Programmes;
import university.Semesters;
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
 *   <li>{@link university.impl.UniversityImpl#getSemesters <em>Semesters</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UniversityImpl extends MinimalEObjectImpl.Container implements University {
	/**
	 * The cached value of the '{@link #getProgrammes() <em>Programmes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammes()
	 * @generated
	 * @ordered
	 */
	protected EList<Programmes> programmes;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Courses> courses;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<Semesters> semesters;

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
			programmes = new EObjectContainmentEList<Programmes>(Programmes.class, this, UniversityPackage.UNIVERSITY__PROGRAMMES);
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
			courses = new EObjectContainmentEList<Courses>(Courses.class, this, UniversityPackage.UNIVERSITY__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Semesters> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectContainmentEList<Semesters>(Semesters.class, this, UniversityPackage.UNIVERSITY__SEMESTERS);
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityPackage.UNIVERSITY__PROGRAMMES:
				return ((InternalEList<?>)getProgrammes()).basicRemove(otherEnd, msgs);
			case UniversityPackage.UNIVERSITY__COURSES:
				return ((InternalEList<?>)getCourses()).basicRemove(otherEnd, msgs);
			case UniversityPackage.UNIVERSITY__SEMESTERS:
				return ((InternalEList<?>)getSemesters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case UniversityPackage.UNIVERSITY__SEMESTERS:
				return getSemesters();
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
			case UniversityPackage.UNIVERSITY__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends Semesters>)newValue);
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
			case UniversityPackage.UNIVERSITY__SEMESTERS:
				getSemesters().clear();
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
			case UniversityPackage.UNIVERSITY__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //UniversityImpl
