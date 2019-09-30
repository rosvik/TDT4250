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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import university.ProgrammeInstances;
import university.ProgrammeSemesters;
import university.Semesters;
import university.Slot;
import university.Specializations;
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
 *   <li>{@link university.impl.ProgrammeSemestersImpl#getSpecialization <em>Specialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeSemestersImpl extends MinimalEObjectImpl.Container implements ProgrammeSemesters {
	/**
	 * The cached value of the '{@link #getSlots() <em>Slots</em>}' containment reference list.
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
	public ProgrammeInstances getProgrammeInstance() {
		if (eContainerFeatureID() != UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE) return null;
		return (ProgrammeInstances)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgrammeInstance(ProgrammeInstances newProgrammeInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgrammeInstance, UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammeInstance(ProgrammeInstances newProgrammeInstance) {
		if (newProgrammeInstance != eInternalContainer() || (eContainerFeatureID() != UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE && newProgrammeInstance != null)) {
			if (EcoreUtil.isAncestor(this, newProgrammeInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgrammeInstance != null)
				msgs = ((InternalEObject)newProgrammeInstance).eInverseAdd(this, UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME_SEMESTERS, ProgrammeInstances.class, msgs);
			msgs = basicSetProgrammeInstance(newProgrammeInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE, newProgrammeInstance, newProgrammeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Slot> getSlots() {
		if (slots == null) {
			slots = new EObjectContainmentWithInverseEList<Slot>(Slot.class, this, UniversityPackage.PROGRAMME_SEMESTERS__SLOTS, UniversityPackage.SLOT__PROGRAMME_SEMESTER);
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
	public NotificationChain basicSetSemester(Semesters newSemester, NotificationChain msgs) {
		Semesters oldSemester = semester;
		semester = newSemester;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniversityPackage.PROGRAMME_SEMESTERS__SEMESTER, oldSemester, newSemester);
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
	public void setSemester(Semesters newSemester) {
		if (newSemester != semester) {
			NotificationChain msgs = null;
			if (semester != null)
				msgs = ((InternalEObject)semester).eInverseRemove(this, UniversityPackage.SEMESTERS__PROGRAMME_SEMESTERS, Semesters.class, msgs);
			if (newSemester != null)
				msgs = ((InternalEObject)newSemester).eInverseAdd(this, UniversityPackage.SEMESTERS__PROGRAMME_SEMESTERS, Semesters.class, msgs);
			msgs = basicSetSemester(newSemester, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.PROGRAMME_SEMESTERS__SEMESTER, newSemester, newSemester));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Specializations getSpecialization() {
		if (eContainerFeatureID() != UniversityPackage.PROGRAMME_SEMESTERS__SPECIALIZATION) return null;
		return (Specializations)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialization(Specializations newSpecialization, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecialization, UniversityPackage.PROGRAMME_SEMESTERS__SPECIALIZATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSpecialization(Specializations newSpecialization) {
		if (newSpecialization != eInternalContainer() || (eContainerFeatureID() != UniversityPackage.PROGRAMME_SEMESTERS__SPECIALIZATION && newSpecialization != null)) {
			if (EcoreUtil.isAncestor(this, newSpecialization))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecialization != null)
				msgs = ((InternalEObject)newSpecialization).eInverseAdd(this, UniversityPackage.SPECIALIZATIONS__PROGRAMME_SEMESTER, Specializations.class, msgs);
			msgs = basicSetSpecialization(newSpecialization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.PROGRAMME_SEMESTERS__SPECIALIZATION, newSpecialization, newSpecialization));
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
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgrammeInstance((ProgrammeInstances)otherEnd, msgs);
			case UniversityPackage.PROGRAMME_SEMESTERS__SLOTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSlots()).basicAdd(otherEnd, msgs);
			case UniversityPackage.PROGRAMME_SEMESTERS__SEMESTER:
				if (semester != null)
					msgs = ((InternalEObject)semester).eInverseRemove(this, UniversityPackage.SEMESTERS__PROGRAMME_SEMESTERS, Semesters.class, msgs);
				return basicSetSemester((Semesters)otherEnd, msgs);
			case UniversityPackage.PROGRAMME_SEMESTERS__SPECIALIZATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecialization((Specializations)otherEnd, msgs);
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
				return basicSetProgrammeInstance(null, msgs);
			case UniversityPackage.PROGRAMME_SEMESTERS__SLOTS:
				return ((InternalEList<?>)getSlots()).basicRemove(otherEnd, msgs);
			case UniversityPackage.PROGRAMME_SEMESTERS__SEMESTER:
				return basicSetSemester(null, msgs);
			case UniversityPackage.PROGRAMME_SEMESTERS__SPECIALIZATION:
				return basicSetSpecialization(null, msgs);
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
			case UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE:
				return eInternalContainer().eInverseRemove(this, UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME_SEMESTERS, ProgrammeInstances.class, msgs);
			case UniversityPackage.PROGRAMME_SEMESTERS__SPECIALIZATION:
				return eInternalContainer().eInverseRemove(this, UniversityPackage.SPECIALIZATIONS__PROGRAMME_SEMESTER, Specializations.class, msgs);
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
			case UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE:
				return getProgrammeInstance();
			case UniversityPackage.PROGRAMME_SEMESTERS__SLOTS:
				return getSlots();
			case UniversityPackage.PROGRAMME_SEMESTERS__SEMESTER:
				if (resolve) return getSemester();
				return basicGetSemester();
			case UniversityPackage.PROGRAMME_SEMESTERS__SPECIALIZATION:
				return getSpecialization();
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
				setProgrammeInstance((ProgrammeInstances)newValue);
				return;
			case UniversityPackage.PROGRAMME_SEMESTERS__SLOTS:
				getSlots().clear();
				getSlots().addAll((Collection<? extends Slot>)newValue);
				return;
			case UniversityPackage.PROGRAMME_SEMESTERS__SEMESTER:
				setSemester((Semesters)newValue);
				return;
			case UniversityPackage.PROGRAMME_SEMESTERS__SPECIALIZATION:
				setSpecialization((Specializations)newValue);
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
				setProgrammeInstance((ProgrammeInstances)null);
				return;
			case UniversityPackage.PROGRAMME_SEMESTERS__SLOTS:
				getSlots().clear();
				return;
			case UniversityPackage.PROGRAMME_SEMESTERS__SEMESTER:
				setSemester((Semesters)null);
				return;
			case UniversityPackage.PROGRAMME_SEMESTERS__SPECIALIZATION:
				setSpecialization((Specializations)null);
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
				return getProgrammeInstance() != null;
			case UniversityPackage.PROGRAMME_SEMESTERS__SLOTS:
				return slots != null && !slots.isEmpty();
			case UniversityPackage.PROGRAMME_SEMESTERS__SEMESTER:
				return semester != null;
			case UniversityPackage.PROGRAMME_SEMESTERS__SPECIALIZATION:
				return getSpecialization() != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgrammeSemestersImpl
