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
import university.ProgrammeInstances;
import university.ProgrammeSemesters;
import university.Semesters;
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
 *   <li>{@link university.impl.ProgrammeSemestersImpl#getCouseInstances <em>Couse Instances</em>}</li>
 *   <li>{@link university.impl.ProgrammeSemestersImpl#getSemester <em>Semester</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgrammeSemestersImpl extends MinimalEObjectImpl.Container implements ProgrammeSemesters {
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
	 * The cached value of the '{@link #getCouseInstances() <em>Couse Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouseInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseInstances> couseInstances;

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
		if (programmeInstance != null && programmeInstance.eIsProxy()) {
			InternalEObject oldProgrammeInstance = (InternalEObject)programmeInstance;
			programmeInstance = (ProgrammeInstances)eResolveProxy(oldProgrammeInstance);
			if (programmeInstance != oldProgrammeInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE, oldProgrammeInstance, programmeInstance));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE, oldProgrammeInstance, newProgrammeInstance);
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
				msgs = ((InternalEObject)programmeInstance).eInverseRemove(this, UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS, ProgrammeInstances.class, msgs);
			if (newProgrammeInstance != null)
				msgs = ((InternalEObject)newProgrammeInstance).eInverseAdd(this, UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS, ProgrammeInstances.class, msgs);
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
	public EList<CourseInstances> getCouseInstances() {
		if (couseInstances == null) {
			couseInstances = new EObjectResolvingEList<CourseInstances>(CourseInstances.class, this, UniversityPackage.PROGRAMME_SEMESTERS__COUSE_INSTANCES);
		}
		return couseInstances;
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE:
				if (programmeInstance != null)
					msgs = ((InternalEObject)programmeInstance).eInverseRemove(this, UniversityPackage.PROGRAMME_INSTANCES__SEMESTERS, ProgrammeInstances.class, msgs);
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
			case UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE:
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
			case UniversityPackage.PROGRAMME_SEMESTERS__PROGRAMME_INSTANCE:
				if (resolve) return getProgrammeInstance();
				return basicGetProgrammeInstance();
			case UniversityPackage.PROGRAMME_SEMESTERS__COUSE_INSTANCES:
				return getCouseInstances();
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
				setProgrammeInstance((ProgrammeInstances)newValue);
				return;
			case UniversityPackage.PROGRAMME_SEMESTERS__COUSE_INSTANCES:
				getCouseInstances().clear();
				getCouseInstances().addAll((Collection<? extends CourseInstances>)newValue);
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
				setProgrammeInstance((ProgrammeInstances)null);
				return;
			case UniversityPackage.PROGRAMME_SEMESTERS__COUSE_INSTANCES:
				getCouseInstances().clear();
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
				return programmeInstance != null;
			case UniversityPackage.PROGRAMME_SEMESTERS__COUSE_INSTANCES:
				return couseInstances != null && !couseInstances.isEmpty();
			case UniversityPackage.PROGRAMME_SEMESTERS__SEMESTER:
				return semester != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgrammeSemestersImpl
