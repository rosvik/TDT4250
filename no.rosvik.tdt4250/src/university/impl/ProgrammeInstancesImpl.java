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
 *   <li>{@link university.impl.ProgrammeInstancesImpl#getSemesters <em>Semesters</em>}</li>
 *   <li>{@link university.impl.ProgrammeInstancesImpl#getSpecializations <em>Specializations</em>}</li>
 *   <li>{@link university.impl.ProgrammeInstancesImpl#getStartYear <em>Start Year</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeInstancesImpl extends MinimalEObjectImpl.Container implements ProgrammeInstances {
	/**
	 * The cached value of the '{@link #getProgramme() <em>Programme</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramme()
	 * @generated
	 * @ordered
	 */
	protected Programmes programme;

	/**
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected ProgrammeSemesters semesters;

	/**
	 * The cached value of the '{@link #getSpecializations() <em>Specializations</em>}' reference list.
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
		if (programme != null && programme.eIsProxy()) {
			InternalEObject oldProgramme = (InternalEObject)programme;
			programme = (Programmes)eResolveProxy(oldProgramme);
			if (programme != oldProgramme) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME, oldProgramme, programme));
			}
		}
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Programmes basicGetProgramme() {
		return programme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramme(Programmes newProgramme, NotificationChain msgs) {
		Programmes oldProgramme = programme;
		programme = newProgramme;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME, oldProgramme, newProgramme);
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
	public void setProgramme(Programmes newProgramme) {
		if (newProgramme != programme) {
			NotificationChain msgs = null;
			if (programme != null)
				msgs = ((InternalEObject)programme).eInverseRemove(this, UniversityPackage.PROGRAMMES__INSTANCES, Programmes.class, msgs);
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
	public ProgrammeSemesters getSemesters() {
		if (semesters != null && semesters.eIsProxy()) {
			InternalEObject oldSemesters = (InternalEObject)semesters;
			semesters = (ProgrammeSemesters)eResolveProxy(oldSemesters);
			if (semesters != oldSemesters) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS, oldSemesters, semesters));
			}
		}
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammeSemesters basicGetSemesters() {
		return semesters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemesters(ProgrammeSemesters newSemesters, NotificationChain msgs) {
		ProgrammeSemesters oldSemesters = semesters;
		semesters = newSemesters;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS, oldSemesters, newSemesters);
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
	public void setSemesters(ProgrammeSemesters newSemesters) {
		if (newSemesters != semesters) {
			NotificationChain msgs = null;
			if (semesters != null)
				msgs = ((InternalEObject)semesters).eInverseRemove(this, UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE, ProgrammeSemesters.class, msgs);
			if (newSemesters != null)
				msgs = ((InternalEObject)newSemesters).eInverseAdd(this, UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE, ProgrammeSemesters.class, msgs);
			msgs = basicSetSemesters(newSemesters, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS, newSemesters, newSemesters));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Specializations> getSpecializations() {
		if (specializations == null) {
			specializations = new EObjectWithInverseResolvingEList<Specializations>(Specializations.class, this, UniversityPackage.PROGRAMME_INSTANCES__SPECIALIZATIONS, UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE);
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
				if (programme != null)
					msgs = ((InternalEObject)programme).eInverseRemove(this, UniversityPackage.PROGRAMMES__INSTANCES, Programmes.class, msgs);
				return basicSetProgramme((Programmes)otherEnd, msgs);
			case UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS:
				if (semesters != null)
					msgs = ((InternalEObject)semesters).eInverseRemove(this, UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE, ProgrammeSemesters.class, msgs);
				return basicSetSemesters((ProgrammeSemesters)otherEnd, msgs);
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
			case UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS:
				return basicSetSemesters(null, msgs);
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME:
				if (resolve) return getProgramme();
				return basicGetProgramme();
			case UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS:
				if (resolve) return getSemesters();
				return basicGetSemesters();
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
			case UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS:
				setSemesters((ProgrammeSemesters)newValue);
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
			case UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS:
				setSemesters((ProgrammeSemesters)null);
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
				return programme != null;
			case UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS:
				return semesters != null;
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
