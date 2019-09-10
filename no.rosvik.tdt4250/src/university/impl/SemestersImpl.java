/**
 */
package university.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import university.ProgrammeSemester;
import university.Semesters;
import university.UniversityPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semesters</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link university.impl.SemestersImpl#getSemesterInstances <em>Semester Instances</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemestersImpl extends MinimalEObjectImpl.Container implements Semesters {
	/**
	 * The cached value of the '{@link #getSemesterInstances() <em>Semester Instances</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<ProgrammeSemester> semesterInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemestersImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UniversityPackage.Literals.SEMESTERS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ProgrammeSemester> getSemesterInstances() {
		if (semesterInstances == null) {
			semesterInstances = new EObjectResolvingEList<ProgrammeSemester>(ProgrammeSemester.class, this, UniversityPackage.SEMESTERS__SEMESTER_INSTANCES);
		}
		return semesterInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityPackage.SEMESTERS__SEMESTER_INSTANCES:
				return getSemesterInstances();
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
			case UniversityPackage.SEMESTERS__SEMESTER_INSTANCES:
				getSemesterInstances().clear();
				getSemesterInstances().addAll((Collection<? extends ProgrammeSemester>)newValue);
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
			case UniversityPackage.SEMESTERS__SEMESTER_INSTANCES:
				getSemesterInstances().clear();
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
			case UniversityPackage.SEMESTERS__SEMESTER_INSTANCES:
				return semesterInstances != null && !semesterInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SemestersImpl
