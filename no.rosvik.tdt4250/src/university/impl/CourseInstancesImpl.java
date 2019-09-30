/**
 */
package university.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import university.CourseInstances;
import university.Courses;
import university.Semesters;
import university.UniversityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Instances</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link university.impl.CourseInstancesImpl#getCourse <em>Course</em>}</li>
 *   <li>{@link university.impl.CourseInstancesImpl#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseInstancesImpl extends MinimalEObjectImpl.Container implements CourseInstances {
	/**
	 * The cached value of the '{@link #getSemester() <em>Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemester()
	 * @generated
	 * @ordered
	 */
	protected Semesters semester;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseInstancesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityPackage.Literals.COURSE_INSTANCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Courses getCourse() {
		if (eContainerFeatureID() != UniversityPackage.COURSE_INSTANCES__COURSE) return null;
		return (Courses)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCourse(Courses newCourse, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCourse, UniversityPackage.COURSE_INSTANCES__COURSE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCourse(Courses newCourse) {
		if (newCourse != eInternalContainer() || (eContainerFeatureID() != UniversityPackage.COURSE_INSTANCES__COURSE && newCourse != null)) {
			if (EcoreUtil.isAncestor(this, newCourse))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCourse != null)
				msgs = ((InternalEObject)newCourse).eInverseAdd(this, UniversityPackage.COURSES__INSTANCES, Courses.class, msgs);
			msgs = basicSetCourse(newCourse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.COURSE_INSTANCES__COURSE, newCourse, newCourse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Semesters getSemester() {
		if (semester != null && semester.eIsProxy()) {
			InternalEObject oldSemester = (InternalEObject)semester;
			semester = (Semesters)eResolveProxy(oldSemester);
			if (semester != oldSemester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityPackage.COURSE_INSTANCES__SEMESTER, oldSemester, semester));
			}
		}
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Semesters basicGetSemester() {
		return semester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemester(Semesters newSemester) {
		Semesters oldSemester = semester;
		semester = newSemester;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.COURSE_INSTANCES__SEMESTER, oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityPackage.COURSE_INSTANCES__COURSE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCourse((Courses)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityPackage.COURSE_INSTANCES__COURSE:
				return basicSetCourse(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case UniversityPackage.COURSE_INSTANCES__COURSE:
				return eInternalContainer().eInverseRemove(this, UniversityPackage.COURSES__INSTANCES, Courses.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityPackage.COURSE_INSTANCES__COURSE:
				return getCourse();
			case UniversityPackage.COURSE_INSTANCES__SEMESTER:
				if (resolve) return getSemester();
				return basicGetSemester();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversityPackage.COURSE_INSTANCES__COURSE:
				setCourse((Courses)newValue);
				return;
			case UniversityPackage.COURSE_INSTANCES__SEMESTER:
				setSemester((Semesters)newValue);
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
			case UniversityPackage.COURSE_INSTANCES__COURSE:
				setCourse((Courses)null);
				return;
			case UniversityPackage.COURSE_INSTANCES__SEMESTER:
				setSemester((Semesters)null);
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
			case UniversityPackage.COURSE_INSTANCES__COURSE:
				return getCourse() != null;
			case UniversityPackage.COURSE_INSTANCES__SEMESTER:
				return semester != null;
		}
		return super.eIsSet(featureID);
	}

} //CourseInstancesImpl
