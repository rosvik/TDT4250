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
import university.Programmes;
import university.Specializations;
import university.UniversityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Programme Instances</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link university.impl.ProgrammeInstancesImpl#getProgramme <em>Programme</em>}</li>
 *   <li>{@link university.impl.ProgrammeInstancesImpl#getProgrammeSemesters <em>Programme Semesters</em>}</li>
 *   <li>{@link university.impl.ProgrammeInstancesImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link university.impl.ProgrammeInstancesImpl#getStartYear <em>Start Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeInstancesImpl extends MinimalEObjectImpl.Container implements ProgrammeInstances {
	/**
	 * The cached value of the '{@link #getProgrammeSemesters() <em>Programme Semesters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgrammeSemesters> programmeSemesters;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializations()
	 * @generated
	 * @ordered
	 */
	protected EList<Specializations> specializations;

	/**
	 * The default value of the '{@link #getStartYear() <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartYear()
	 * @generated
	 * @ordered
	 */
	protected static final int START_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStartYear() <em>Start Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartYear()
	 * @generated
	 * @ordered
	 */
	protected int startYear = START_YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgrammeInstancesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityPackage.Literals.PROGRAMME_INSTANCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Programmes getProgramme() {
		if (eContainerFeatureID() != UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME) return null;
		return (Programmes)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(Programmes newProgramme, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgramme, UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgramme(Programmes newProgramme) {
		if (newProgramme != eInternalContainer() || (eContainerFeatureID() != UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME && newProgramme != null)) {
			if (EcoreUtil.isAncestor(this, newProgramme))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newProgramme != null)
				msgs = ((InternalEObject)newProgramme).eInverseAdd(this, UniversityPackage.PROGRAMMES__INSTANCES, Programmes.class, msgs);
			msgs = basicSetProgramme(newProgramme, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME, newProgramme, newProgramme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgrammeSemesters> getProgrammeSemesters() {
		if (programmeSemesters == null) {
			programmeSemesters = new EObjectContainmentWithInverseEList<ProgrammeSemesters>(ProgrammeSemesters.class, this, UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME_SEMESTERS, UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE);
		}
		return programmeSemesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specializations> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectContainmentWithInverseEList<Specializations>(Specializations.class, this, UniversityPackage.PROGRAMME_INSTANCES__SPECIALIZATIONS, UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE);
		}
		return specializations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getStartYear() {
		return startYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStartYear(int newStartYear) {
		int oldStartYear = startYear;
		startYear = newStartYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.PROGRAMME_INSTANCES__START_YEAR, oldStartYear, startYear));
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
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgramme((Programmes)otherEnd, msgs);
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME_SEMESTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProgrammeSemesters()).basicAdd(otherEnd, msgs);
			case UniversityPackage.PROGRAMME_INSTANCES__SPECIALIZATIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecializations()).basicAdd(otherEnd, msgs);
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
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME:
				return basicSetProgramme(null, msgs);
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME_SEMESTERS:
				return ((InternalEList<?>)getProgrammeSemesters()).basicRemove(otherEnd, msgs);
			case UniversityPackage.PROGRAMME_INSTANCES__SPECIALIZATIONS:
				return ((InternalEList<?>)getSpecializations()).basicRemove(otherEnd, msgs);
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
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME:
				return eInternalContainer().eInverseRemove(this, UniversityPackage.PROGRAMMES__INSTANCES, Programmes.class, msgs);
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
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME:
				return getProgramme();
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME_SEMESTERS:
				return getProgrammeSemesters();
			case UniversityPackage.PROGRAMME_INSTANCES__SPECIALIZATIONS:
				return getSpecializations();
			case UniversityPackage.PROGRAMME_INSTANCES__START_YEAR:
				return getStartYear();
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
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME:
				setProgramme((Programmes)newValue);
				return;
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME_SEMESTERS:
				getProgrammeSemesters().clear();
				getProgrammeSemesters().addAll((Collection<? extends ProgrammeSemesters>)newValue);
				return;
			case UniversityPackage.PROGRAMME_INSTANCES__SPECIALIZATIONS:
				getSpecializations().clear();
				getSpecializations().addAll((Collection<? extends Specializations>)newValue);
				return;
			case UniversityPackage.PROGRAMME_INSTANCES__START_YEAR:
				setStartYear((Integer)newValue);
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
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME:
				setProgramme((Programmes)null);
				return;
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME_SEMESTERS:
				getProgrammeSemesters().clear();
				return;
			case UniversityPackage.PROGRAMME_INSTANCES__SPECIALIZATIONS:
				getSpecializations().clear();
				return;
			case UniversityPackage.PROGRAMME_INSTANCES__START_YEAR:
				setStartYear(START_YEAR_EDEFAULT);
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
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME:
				return getProgramme() != null;
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME_SEMESTERS:
				return programmeSemesters != null && !programmeSemesters.isEmpty();
			case UniversityPackage.PROGRAMME_INSTANCES__SPECIALIZATIONS:
				return specializations != null && !specializations.isEmpty();
			case UniversityPackage.PROGRAMME_INSTANCES__START_YEAR:
				return startYear != START_YEAR_EDEFAULT;
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
		result.append(" (startYear: ");
		result.append(startYear);
		result.append(')');
		return result.toString();
	}

} //ProgrammeInstancesImpl
