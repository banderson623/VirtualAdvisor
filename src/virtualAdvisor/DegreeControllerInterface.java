package virtualAdvisor;

import java.util.List;

/**
 * Controller for all user actions that pertain to Degree programs
 * available from the university
 */
public interface DegreeControllerInterface {
	/**
	 * Returns a list of degrees within the system
	 * (should delegate the core of its functionality to 
	 *  a class implementing a UniversityRegistrationSystem interface)
	 *
	 * @return A list of Degrees
	 */
	List<DegreeInterface> list();
	
	/**
	 * Given a Degree's ID, will return the list of courses
	 * applicable for a degree program
	 * 
	 * @param degreeId an integer of the degree's unique identifier
	 * @return A list of courses for the given degree ID
	 */
	List<CourseInterface> listOfCoursesForDegree(int degreeId);
}
