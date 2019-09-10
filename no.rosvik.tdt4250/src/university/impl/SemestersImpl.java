/**
 */
package university.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
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
 *   <li>{@link university.impl.SemestersImpl#getYear <em>Year</em>}</li>
 *   <li>{@link university.impl.SemestersImpl#isSeason <em>Season</em>}</li>
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
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final int YEAR_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected int year = YEAR_EDEFAULT;
	/**
	 * The default value of the '{@link #isSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeason()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SEASON_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isSeason() <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSeason()
	 * @generated
	 * @ordered
	 */
	protected boolean season = SEASON_EDEFAULT;

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
	public int getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYear(int newYear) {
		int oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.SEMESTERS__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSeason() {
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSeason(boolean newSeason) {
		boolean oldSeason = season;
		season = newSeason;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.SEMESTERS__SEASON, oldSeason, season));
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
			case UniversityPackage.SEMESTERS__YEAR:
				return getYear();
			case UniversityPackage.SEMESTERS__SEASON:
				return isSeason();
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
			case UniversityPackage.SEMESTERS__YEAR:
				setYear((Integer)newValue);
				return;
			case UniversityPackage.SEMESTERS__SEASON:
				setSeason((Boolean)newValue);
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
			case UniversityPackage.SEMESTERS__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case UniversityPackage.SEMESTERS__SEASON:
				setSeason(SEASON_EDEFAULT);
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
			case UniversityPackage.SEMESTERS__YEAR:
				return year != YEAR_EDEFAULT;
			case UniversityPackage.SEMESTERS__SEASON:
				return season != SEASON_EDEFAULT;
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
		result.append(" (year: ");
		result.append(year);
		result.append(", season: ");
		result.append(season);
		result.append(')');
		return result.toString();
	}

} //SemestersImpl
