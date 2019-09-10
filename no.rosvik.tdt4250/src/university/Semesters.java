/**
 */
package university;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semesters</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.Semesters#getYear <em>Year</em>}</li>
 *   <li>{@link university.Semesters#isSeason <em>Season</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getSemesters()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='validYear'"
 * @generated
 */
public interface Semesters extends EObject {
	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(int)
	 * @see university.UniversityPackage#getSemesters_Year()
	 * @model
	 * @generated
	 */
	int getYear();

	/**
	 * Sets the value of the '{@link university.Semesters#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(int value);

	/**
	 * Returns the value of the '<em><b>Season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' attribute.
	 * @see #setSeason(boolean)
	 * @see university.UniversityPackage#getSemesters_Season()
	 * @model
	 * @generated
	 */
	boolean isSeason();

	/**
	 * Sets the value of the '{@link university.Semesters#isSeason <em>Season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' attribute.
	 * @see #isSeason()
	 * @generated
	 */
	void setSeason(boolean value);

} // Semesters
