/**
 */
package university.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import university.SemesterTime;
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
 *   <li>{@link university.impl.SemestersImpl#getYear <em>Year</em>}</li>
 *   <li>{@link university.impl.SemestersImpl#getSemesterTime <em>Semester Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemestersImpl extends MinimalEObjectImpl.Container implements Semesters {
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
	 * The default value of the '{@link #getSemesterTime() <em>Semester Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterTime()
	 * @generated
	 * @ordered
	 */
	protected static final SemesterTime SEMESTER_TIME_EDEFAULT = SemesterTime.FALL;

	/**
	 * The cached value of the '{@link #getSemesterTime() <em>Semester Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemesterTime()
	 * @generated
	 * @ordered
	 */
	protected SemesterTime semesterTime = SEMESTER_TIME_EDEFAULT;

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
	public SemesterTime getSemesterTime() {
		return semesterTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSemesterTime(SemesterTime newSemesterTime) {
		SemesterTime oldSemesterTime = semesterTime;
		semesterTime = newSemesterTime == null ? SEMESTER_TIME_EDEFAULT : newSemesterTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UniversityPackage.SEMESTERS__SEMESTER_TIME, oldSemesterTime, semesterTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UniversityPackage.SEMESTERS__YEAR:
				return getYear();
			case UniversityPackage.SEMESTERS__SEMESTER_TIME:
				return getSemesterTime();
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
			case UniversityPackage.SEMESTERS__YEAR:
				setYear((Integer)newValue);
				return;
			case UniversityPackage.SEMESTERS__SEMESTER_TIME:
				setSemesterTime((SemesterTime)newValue);
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
			case UniversityPackage.SEMESTERS__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
			case UniversityPackage.SEMESTERS__SEMESTER_TIME:
				setSemesterTime(SEMESTER_TIME_EDEFAULT);
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
			case UniversityPackage.SEMESTERS__YEAR:
				return year != YEAR_EDEFAULT;
			case UniversityPackage.SEMESTERS__SEMESTER_TIME:
				return semesterTime != SEMESTER_TIME_EDEFAULT;
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
		result.append(", semesterTime: ");
		result.append(semesterTime);
		result.append(')');
		return result.toString();
	}

} //SemestersImpl
