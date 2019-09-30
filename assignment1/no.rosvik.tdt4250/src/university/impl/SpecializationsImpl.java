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
 *   <li>{@link university.impl.SpecializationsImpl#getName <em>Name</em>}</li>
 *   <li>{@link university.impl.SpecializationsImpl#getProgrammeSemester <em>Programme Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecializationsImpl extends MinimalEObjectImpl.Container implements Specializations {
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
	 * The cached value of the '{@link #getProgrammeSemester() <em>Programme Semester</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgrammeSemester()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgrammeSemesters> programmeSemester;

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
		if (eContainerFeatureID() != UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE) return null;
		return (ProgrammeInstances)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgrammeInstance(ProgrammeInstances newProgrammeInstance, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newProgrammeInstance, UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setProgrammeInstance(ProgrammeInstances newProgrammeInstance) {
		if (newProgrammeInstance != eInternalContainer() || (eContainerFeatureID() != UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE && newProgrammeInstance != null)) {
			if (EcoreUtil.isAncestor(this, newProgrammeInstance))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
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
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.SPECIALIZATIONS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgrammeSemesters> getProgrammeSemester() {
		if (programmeSemester == null) {
			programmeSemester = new EObjectContainmentWithInverseEList<ProgrammeSemesters>(ProgrammeSemesters.class, this, UniversityPackage.SPECIALIZATIONS__PROGRAMME_SEMESTER, UniversityPackage.PROGRAMME_SEMESTERS__SPECIALIZATION);
		}
		return programmeSemester;
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
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetProgrammeInstance((ProgrammeInstances)otherEnd, msgs);
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_SEMESTER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getProgrammeSemester()).basicAdd(otherEnd, msgs);
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
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_SEMESTER:
				return ((InternalEList<?>)getProgrammeSemester()).basicRemove(otherEnd, msgs);
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
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE:
				return eInternalContainer().eInverseRemove(this, UniversityPackage.PROGRAMME_INSTANCES__SPECIALIZATIONS, ProgrammeInstances.class, msgs);
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
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE:
				return getProgrammeInstance();
			case UniversityPackage.SPECIALIZATIONS__NAME:
				return getName();
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_SEMESTER:
				return getProgrammeSemester();
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
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_INSTANCE:
				setProgrammeInstance((ProgrammeInstances)newValue);
				return;
			case UniversityPackage.SPECIALIZATIONS__NAME:
				setName((String)newValue);
				return;
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_SEMESTER:
				getProgrammeSemester().clear();
				getProgrammeSemester().addAll((Collection<? extends ProgrammeSemesters>)newValue);
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
			case UniversityPackage.SPECIALIZATIONS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_SEMESTER:
				getProgrammeSemester().clear();
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
				return getProgrammeInstance() != null;
			case UniversityPackage.SPECIALIZATIONS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UniversityPackage.SPECIALIZATIONS__PROGRAMME_SEMESTER:
				return programmeSemester != null && !programmeSemester.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SpecializationsImpl
