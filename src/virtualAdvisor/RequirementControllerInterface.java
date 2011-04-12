package virtualAdvisor;

import java.util.List;

/**
 * Controller for all user actions that pertain to 
 * a degree's requirements 
 */
public interface RequirementControllerInterface {
	/**
	 * Given a degree ID this returns a list of requirements
	 * (should delegate the core of its functionality to 
	 *  a class implementing a UniversityRegistrationSystem interface)
	 * 
	 * @param degreeId an integer of the degree's unique identifier
	 * @return A list of requirements for the given degree ID
	 */
	List<RequirementInterface> listForDegreeId(int degreeId);
	
	/**
	 * Given a requirement ID this returns a list of courses that
	 * can be used satisfy the given requirement
	 * (should delegate the core of its functionality to 
	 *  a class implementing a UniversityRegistrationSystem interface)
	 * 
	 * @param requirementID an integer of the requirements's unique identifier
	 * @return A list of courses for the given requirement
	 */
	List<CourseInterface> listOfCoursesForRequirement(int requirementID);
}