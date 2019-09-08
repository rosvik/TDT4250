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
import university.ProgrammeSemester;
import university.Programmes;
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
	 * The cached value of the '{@link #getSemesters() <em>Semesters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesters()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgrammeSemester> semesters;

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
	public EList<ProgrammeSemester> getSemesters() {
		if (semesters == null) {
			semesters = new EObjectWithInverseResolvingEList<ProgrammeSemester>(ProgrammeSemester.class, this, UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS, UniversityPackage.PROGRAMME_SEMESTER__PROGRAMME_INSTANCE);
		}
		return semesters;
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
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSemesters()).basicAdd(otherEnd, msgs);
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
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME:
				if (resolve) return getProgramme();
				return basicGetProgramme();
			case UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS:
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
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME:
				setProgramme((Programmes)newValue);
				return;
			case UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS:
				getSemesters().clear();
				getSemesters().addAll((Collection<? extends ProgrammeSemester>)newValue);
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
			case UniversityPackage.PROGRAMME_INSTANCES__PROGRAMME:
				return programme != null;
			case UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS:
				return semesters != null && !semesters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProgrammeInstancesImpl
