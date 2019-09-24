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
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import university.ProgrammeInstances;
import university.ProgrammeSemesters;
import university.Semesters;
import university.Slot;
import university.UniversityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme Semesters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link university.impl.ProgrammeSemestersImpl#getProgrammeInstance <em>Programme Instance</em>}</li>
 *   <li>{@link university.impl.ProgrammeSemestersImpl#getSlots <em>Slots</em>}</li>
 *   <li>{@link university.impl.ProgrammeSemestersImpl#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeSemestersImpl extends MinimalEObjectImpl.Container implements ProgrammeSemesters {
	/**
	 * The cached value of the '{@link #getProgrammeInstance() <em>Programme Instance</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgrammeInstances> programmeInstance;

	/**
	 * The cached value of the '{@link #getSlots() <em>Slots</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlots()
	 * @generated
	 * @ordered
	 */
	protected EList<Slot> slots;

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
	protected ProgrammeSemestersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityPackage.Literals.PROGRAMME_SEMESTERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgrammeInstances> getProgrammeInstance() {
		if (programmeInstance == null) {
			programmeInstance = new EObjectWithInverseResolvingEList<ProgrammeInstances>(ProgrammeInstances.class, this, UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE, UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS);
		}
		return programmeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Slot> getSlots() {
		if (slots == null) {
			slots = new EObjectWithInverseResolvingEList<Slot>(Slot.class, this, UniversityPackage.PROGRAMME_SEMESTERS__SLOTS, UniversityPackage.SLOT__PROGRAMME_SEMESTER);
		}
		return slots;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityPackage.PROGRAMME_SEMESTERS__SEMESTER, oldSemester, semester));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.PROGRAMME_SEMESTERS__SEMESTER, oldSemester, semester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProgrammeInstance()).basicAdd(otherEnd, msgs);
			case UniversityPackage.PROGRAMME_SEMESTERS__SLOTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSlots()).basicAdd(otherEnd, msgs);
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
			case UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE:
				return ((InternalEList<?>)getProgrammeInstance()).basicRemove(otherEnd, msgs);
			case UniversityPackage.PROGRAMME_SEMESTERS__SLOTS:
				return ((InternalEList<?>)getSlots()).basicRemove(otherEnd, msgs);
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
			case UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE:
				return getProgrammeInstance();
			case UniversityPackage.PROGRAMME_SEMESTERS__SLOTS:
				return getSlots();
			case UniversityPackage.PROGRAMME_SEMESTERS__SEMESTER:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE:
				getProgrammeInstance().clear();
				getProgrammeInstance().addAll((Collection<? extends ProgrammeInstances>)newValue);
				return;
			case UniversityPackage.PROGRAMME_SEMESTERS__SLOTS:
				getSlots().clear();
				getSlots().addAll((Collection<? extends Slot>)newValue);
				return;
			case UniversityPackage.PROGRAMME_SEMESTERS__SEMESTER:
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
			case UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE:
				getProgrammeInstance().clear();
				return;
			case UniversityPackage.PROGRAMME_SEMESTERS__SLOTS:
				getSlots().clear();
				return;
			case UniversityPackage.PROGRAMME_SEMESTERS__SEMESTER:
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
			case UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE:
				return programmeInstance != null && !programmeInstance.isEmpty();
			case UniversityPackage.PROGRAMME_SEMESTERS__SLOTS:
				return slots != null && !slots.isEmpty();
			case UniversityPackage.PROGRAMME_SEMESTERS__SEMESTER:
				return semester != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgrammeSemestersImpl
