package virtualAdvisor;

import java.util.List;

/**
 * Classes implementing this interface will a qualified
 * Degree Program that has a list of requirements, and
 * course, ...
 */
public interface DegreeInterface {
	/**
	 * Returns a list of courses eligable for the Degree program
	 * (should deligate the core of its functionality to 
	 *  a class implementing a UniversityRegistrationSystem interface)
	 * 
	 * @return list of courses
	 */
	List<CourseInterface> getCourses();
	
	/**
	 * Returns a list of requirements for the Degree program
	 * A requirement is a list of classes for a given type of 
	 * course. For instance an English requirement may be
	 * satisfied from a set of courses, or from only one
	 * each requirement is different
	 *
	 * (should delegate the core of its functionality to 
	 *  a class implementing a UniversityRegistrationSystem interface)
	 * 
	 * @return list of Requirements for the given Degree
	 */
	List<RequirementInterface> getRequirements();
}
