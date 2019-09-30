/**
 */
package university;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Slot</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link university.Slot#getProgrammeSemester <em>Programme Semester</em>}</li>
 *   <li>{@link university.Slot#getAvaliableCourses <em>Avaliable Courses</em>}</li>
 *   <li>{@link university.Slot#getPoints <em>Points</em>}</li>
 *   <li>{@link university.Slot#getSlotType <em>Slot Type</em>}</li>
 *   <li>{@link university.Slot#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see university.UniversityPackage#getSlot()
 * @model
 * @generated
 */
public interface Slot extends EObject {
	/**
	 * Returns the value of the '<em><b>Programme Semester</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link university.ProgrammeSemesters#getSlots <em>Slots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programme Semester</em>' container reference.
	 * @see #setProgrammeSemester(ProgrammeSemesters)
	 * @see university.UniversityPackage#getSlot_ProgrammeSemester()
	 * @see university.ProgrammeSemesters#getSlots
	 * @model opposite="slots" required="true" transient="false"
	 * @generated
	 */
	ProgrammeSemesters getProgrammeSemester();

	/**
	 * Sets the value of the '{@link university.Slot#getProgrammeSemester <em>Programme Semester</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programme Semester</em>' container reference.
	 * @see #getProgrammeSemester()
	 * @generated
	 */
	void setProgrammeSemester(ProgrammeSemesters value);

	/**
	 * Returns the value of the '<em><b>Avaliable Courses</b></em>' reference list.
	 * The list contents are of type {@link university.CourseInstances}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Avaliable Courses</em>' reference list.
	 * @see university.UniversityPackage#getSlot_AvaliableCourses()
	 * @model
	 * @generated
	 */
	EList<CourseInstances> getAvaliableCourses();

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(int)
	 * @see university.UniversityPackage#getSlot_Points()
	 * @model
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link university.Slot#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

	/**
	 * Returns the value of the '<em><b>Slot Type</b></em>' attribute.
	 * The literals are from the enumeration {@link university.SlotType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slot Type</em>' attribute.
	 * @see university.SlotType
	 * @see #setSlotType(SlotType)
	 * @see university.UniversityPackage#getSlot_SlotType()
	 * @model
	 * @generated
	 */
	SlotType getSlotType();

	/**
	 * Sets the value of the '{@link university.Slot#getSlotType <em>Slot Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Slot Type</em>' attribute.
	 * @see university.SlotType
	 * @see #getSlotType()
	 * @generated
	 */
	void setSlotType(SlotType value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see university.UniversityPackage#getSlot_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link university.Slot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Slot
