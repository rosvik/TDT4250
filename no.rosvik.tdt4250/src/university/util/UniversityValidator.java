/**
 */
package university.util;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import university.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see university.UniversityPackage
 * @generated
 */
public class UniversityValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final UniversityValidator INSTANCE = new UniversityValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "university";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniversityValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return UniversityPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case UniversityPackage.PROGRAMMES:
				return validateProgrammes((Programmes)value, diagnostics, context);
			case UniversityPackage.PROGRAMME_INSTANCES:
				return validateProgrammeInstances((ProgrammeInstances)value, diagnostics, context);
			case UniversityPackage.COURSES:
				return validateCourses((Courses)value, diagnostics, context);
			case UniversityPackage.COURSE_INSTANCES:
				return validateCourseInstances((CourseInstances)value, diagnostics, context);
			case UniversityPackage.PROGRAMME_SEMESTERS:
				return validateProgrammeSemesters((ProgrammeSemesters)value, diagnostics, context);
			case UniversityPackage.SLOT:
				return validateSlot((Slot)value, diagnostics, context);
			case UniversityPackage.SEMESTERS:
				return validateSemesters((Semesters)value, diagnostics, context);
			case UniversityPackage.SPECIALIZATIONS:
				return validateSpecializations((Specializations)value, diagnostics, context);
			case UniversityPackage.UNIVERSITY:
				return validateUniversity((University)value, diagnostics, context);
			case UniversityPackage.SEMESTER_TIME:
				return validateSemesterTime((SemesterTime)value, diagnostics, context);
			case UniversityPackage.SLOT_TYPE:
				return validateSlotType((SlotType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammes(Programmes programmes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programmes, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammeInstances(ProgrammeInstances programmeInstances, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programmeInstances, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourses(Courses courses, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courses, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseInstances(CourseInstances courseInstances, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(courseInstances, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgrammeSemesters(ProgrammeSemesters programmeSemesters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programmeSemesters, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlot(Slot slot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(slot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesters(Semesters semesters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(semesters, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(semesters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(semesters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(semesters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(semesters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(semesters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(semesters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(semesters, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(semesters, diagnostics, context);
		if (result || diagnostics != null) result &= validateSemesters_validYear(semesters, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validYear constraint of '<em>Semesters</em>'.
	 * <!-- begin-user-doc -->
	 * Checks if the semester is from a year since NTNU was founded and year 2500.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSemesters_validYear(Semesters semesters, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (semesters.getYear() >= 1760 && semesters.getYear() <= 2500) {
			return true;
		}
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecializations(Specializations specializations, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specializations, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUniversity(University university, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(university, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemesterTime(SemesterTime semesterTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSlotType(SlotType slotType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //UniversityValidator
