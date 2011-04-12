package virtualAdvisor;

import java.util.List;

public interface CourseInterface {

	/**
	  * Returns the list of sections for the selected course.
	  *
	  * @param courseName is the name of the selected course.
	  * @return a list of sections for the selected course.
	  */
	List<SectionInterface>  getSectionList();

	 /**
	  * Returns the list of prerequisite courses for the selected course.
	  *
	  * @param courseName is the name of the selected course.
	  * @return a list of  prerequisite courses for the selected course.
	  */
	List<CourseInterface>  getPrerequisiteCourses();

	 /**
	  * Returns the number of credits of the selected course.
	  *
	  * @param courseName is the name of the selected course.
	  * @return the number of credits of the selected course.
	  */
	int getCredits();

}
