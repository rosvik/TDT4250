/**
 */
package university.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import university.CourseInstances;
import university.ProgrammeSemesters;
import university.Slot;
import university.SlotType;
import university.UniversityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link university.impl.SlotImpl#getProgrammeSemester <em>Programme Semester</em>}</li>
 *   <li>{@link university.impl.SlotImpl#getAvaliableCourses <em>Avaliable Courses</em>}</li>
 *   <li>{@link university.impl.SlotImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link university.impl.SlotImpl#getSlotType <em>Slot Type</em>}</li>
 *   <li>{@link university.impl.SlotImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SlotImpl extends MinimalEObjectImpl.Container implements Slot {
	/**
	 * The cached value of the '{@link #getProgrammeSemester() <em>Programme Semester</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeSemester()
	 * @generated
	 * @ordered
	 */
	protected ProgrammeSemesters programmeSemester;

	/**
	 * The cached value of the '{@link #getAvaliableCourses() <em>Avaliable Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvaliableCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseInstances> avaliableCourses;

	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected int points = POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSlotType() <em>Slot Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotType()
	 * @generated
	 * @ordered
	 */
	protected static final SlotType SLOT_TYPE_EDEFAULT = SlotType.O;

	/**
	 * The cached value of the '{@link #getSlotType() <em>Slot Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlotType()
	 * @generated
	 * @ordered
	 */
	protected SlotType slotType = SLOT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SlotImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityPackage.Literals.SLOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeSemesters getProgrammeSemester() {
		if (programmeSemester != null && programmeSemester.eIsProxy()) {
			InternalEObject oldProgrammeSemester = (InternalEObject)programmeSemester;
			programmeSemester = (ProgrammeSemesters)eResolveProxy(oldProgrammeSemester);
			if (programmeSemester != oldProgrammeSemester) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityPackage.SLOT__PROGRAMME_SEMESTER, oldProgrammeSemester, programmeSemester));
			}
		}
		return programmeSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammeSemesters basicGetProgrammeSemester() {
		return programmeSemester;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgrammeSemester(ProgrammeSemesters newProgrammeSemester, NotificationChain msgs) {
		ProgrammeSemesters oldProgrammeSemester = programmeSemester;
		programmeSemester = newProgrammeSemester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniversityPackage.SLOT__PROGRAMME_SEMESTER, oldProgrammeSemester, newProgrammeSemester);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammeSemester(ProgrammeSemesters newProgrammeSemester) {
		if (newProgrammeSemester != programmeSemester) {
			NotificationChain msgs = null;
			if (programmeSemester != null)
				msgs = ((InternalEObject)programmeSemester).eInverseRemove(this, UniversityPackage.PROGRAMME_SEMESTERS__SLOTS, ProgrammeSemesters.class, msgs);
			if (newProgrammeSemester != null)
				msgs = ((InternalEObject)newProgrammeSemester).eInverseAdd(this, UniversityPackage.PROGRAMME_SEMESTERS__SLOTS, ProgrammeSemesters.class, msgs);
			msgs = basicSetProgrammeSemester(newProgrammeSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.SLOT__PROGRAMME_SEMESTER, newProgrammeSemester, newProgrammeSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CourseInstances> getAvaliableCourses() {
		if (avaliableCourses == null) {
			avaliableCourses = new EObjectResolvingEList<CourseInstances>(CourseInstances.class, this, UniversityPackage.SLOT__AVALIABLE_COURSES);
		}
		return avaliableCourses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPoints(int newPoints) {
		int oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.SLOT__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlotType getSlotType() {
		return slotType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSlotType(SlotType newSlotType) {
		SlotType oldSlotType = slotType;
		slotType = newSlotType == null ? SLOT_TYPE_EDEFAULT : newSlotType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.SLOT__SLOT_TYPE, oldSlotType, slotType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.SLOT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityPackage.SLOT__PROGRAMME_SEMESTER:
				if (programmeSemester != null)
					msgs = ((InternalEObject)programmeSemester).eInverseRemove(this, UniversityPackage.PROGRAMME_SEMESTERS__SLOTS, ProgrammeSemesters.class, msgs);
				return basicSetProgrammeSemester((ProgrammeSemesters)otherEnd, msgs);
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
			case UniversityPackage.SLOT__PROGRAMME_SEMESTER:
				return basicSetProgrammeSemester(null, msgs);
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
			case UniversityPackage.SLOT__PROGRAMME_SEMESTER:
				if (resolve) return getProgrammeSemester();
				return basicGetProgrammeSemester();
			case UniversityPackage.SLOT__AVALIABLE_COURSES:
				return getAvaliableCourses();
			case UniversityPackage.SLOT__POINTS:
				return getPoints();
			case UniversityPackage.SLOT__SLOT_TYPE:
				return getSlotType();
			case UniversityPackage.SLOT__NAME:
				return getName();
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
			case UniversityPackage.SLOT__PROGRAMME_SEMESTER:
				setProgrammeSemester((ProgrammeSemesters)newValue);
				return;
			case UniversityPackage.SLOT__AVALIABLE_COURSES:
				getAvaliableCourses().clear();
				getAvaliableCourses().addAll((Collection<? extends CourseInstances>)newValue);
				return;
			case UniversityPackage.SLOT__POINTS:
				setPoints((Integer)newValue);
				return;
			case UniversityPackage.SLOT__SLOT_TYPE:
				setSlotType((SlotType)newValue);
				return;
			case UniversityPackage.SLOT__NAME:
				setName((String)newValue);
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
			case UniversityPackage.SLOT__PROGRAMME_SEMESTER:
				setProgrammeSemester((ProgrammeSemesters)null);
				return;
			case UniversityPackage.SLOT__AVALIABLE_COURSES:
				getAvaliableCourses().clear();
				return;
			case UniversityPackage.SLOT__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case UniversityPackage.SLOT__SLOT_TYPE:
				setSlotType(SLOT_TYPE_EDEFAULT);
				return;
			case UniversityPackage.SLOT__NAME:
				setName(NAME_EDEFAULT);
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
			case UniversityPackage.SLOT__PROGRAMME_SEMESTER:
				return programmeSemester != null;
			case UniversityPackage.SLOT__AVALIABLE_COURSES:
				return avaliableCourses != null && !avaliableCourses.isEmpty();
			case UniversityPackage.SLOT__POINTS:
				return points != POINTS_EDEFAULT;
			case UniversityPackage.SLOT__SLOT_TYPE:
				return slotType != SLOT_TYPE_EDEFAULT;
			case UniversityPackage.SLOT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (points: ");
		result.append(points);
		result.append(", slotType: ");
		result.append(slotType);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SlotImpl
