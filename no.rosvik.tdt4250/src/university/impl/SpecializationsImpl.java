/**
 */
package university.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import university.ProgrammeInstances;
import university.Specializations;
import university.UniversityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specializations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link university.impl.SpecializationsImpl#getProgrammeInstance <em>Programme Instance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationsImpl extends MinimalEObjectImpl.Container implements Specializations {
	/**
	 * The cached value of the '{@link #getProgrammeInstance() <em>Programme Instance</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeInstance()
	 * @generated
	 * @ordered
	 */
	protected ProgrammeInstances programmeInstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecializationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityPackage.Literals.SPECIALIZATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ProgrammeInstances getProgrammeInstance() {
		if (programmeInstance != null && programmeInstance.eIsProxy()) {
			InternalEObject oldProgrammeInstance = (InternalEObject)programmeInstance;
			programmeInstance = (ProgrammeInstances)eResolveProxy(oldProgrammeInstance);
			if (programmeInstance != oldProgrammeInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE, oldProgrammeInstance, programmeInstance));
			}
		}
		return programmeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgrammeInstances basicGetProgrammeInstance() {
		return programmeInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgrammeInstance(ProgrammeInstances newProgrammeInstance, NotificationChain msgs) {
		ProgrammeInstances oldProgrammeInstance = programmeInstance;
		programmeInstance = newProgrammeInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE, oldProgrammeInstance, newProgrammeInstance);
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
	public void setProgrammeInstance(ProgrammeInstances newProgrammeInstance) {
		if (newProgrammeInstance != programmeInstance) {
			NotificationChain msgs = null;
			if (programmeInstance != null)
				msgs = ((InternalEObject)programmeInstance).eInverseRemove(this, UniversityPackage.PROGRAMME_INSTANCES__SPECIALIZATIONS, ProgrammeInstances.class, msgs);
			if (newProgrammeInstance != null)
				msgs = ((InternalEObject)newProgrammeInstance).eInverseAdd(this, UniversityPackage.PROGRAMME_INSTANCES__SPECIALIZATIONS, ProgrammeInstances.class, msgs);
			msgs = basicSetProgrammeInstance(newProgrammeInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE, newProgrammeInstance, newProgrammeInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE:
				if (programmeInstance != null)
					msgs = ((InternalEObject)programmeInstance).eInverseRemove(this, UniversityPackage.PROGRAMME_INSTANCES__SPECIALIZATIONS, ProgrammeInstances.class, msgs);
				return basicSetProgrammeInstance((ProgrammeInstances)otherEnd, msgs);
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
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE:
				return basicSetProgrammeInstance(null, msgs);
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
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE:
				if (resolve) return getProgrammeInstance();
				return basicGetProgrammeInstance();
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
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE:
				setProgrammeInstance((ProgrammeInstances)newValue);
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
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE:
				setProgrammeInstance((ProgrammeInstances)null);
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
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE:
				return programmeInstance != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecializationsImpl
