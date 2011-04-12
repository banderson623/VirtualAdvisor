package virtualAdvisor;

import java.util.List;

/**
 * A requirement is a list of classes for a given type of 
 * course. For instance an english requirement may be
 * satisfied from a set of courses, or from only one
 * each requirement is different
 */
public interface RequirementInterface {
	/**
	 * A list of courses that can be used to satisfy the requirement
	 * 
	 * @return a list of Course objects
	 */
	List<CourseInterface> getCourses();
	
	/**
	 * Returns the unique ID of this requirement
	 * @return the unique ID of this requirement
	 */
	int id();
}
