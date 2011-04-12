package virtualAdvisor;

public interface SectionInterface
{
	/**
	 * 
	 * Retrieves the name of the professor teaching the specified section
	 *
	 * @return The name of the professor teaching the section
	 */
	String getProfessor();

	/**
	 * 
	 * Retrieves the time at which the section will be meeting
	 *
	 * @return The meeting time of the section
	 */
	String getMeetingTime();

	/**
	 * 
	 * Retrieves the availability of the course, whether its open, full, closed, ect.
	 *
	 * @return The avaialability of the course
	 */
	String getAvailability();

}
