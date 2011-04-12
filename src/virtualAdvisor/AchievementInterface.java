package virtualAdvisor;


/**
 *  Courses that the student has taken and has a letter grade for are reclassified
 *  as Achievements
 */
public interface AchievementInterface {
	
	/**
 	 *  The constructor for an Achievement class, which is a course
	 *  that the student has already taken and received a letter grade
	 *
	 *  @param ID The ID of the course that the student has taken
	 *  @param semester The semester and year that the student took the course
	 *  @param grade The grade the student received from the course
	 * @return 
 	 */
//	public abstract AchievementInterface(String ID, String semester, char grade);

	/**
 	 *  Allows the student to change a grade if there was an error in submission
	 *  or an initial error when receiving the grade that was worked out.  The 
	 *  grade will changed will be a different font color so the Student is aware
	 *  that a change was made and could be used for 'What If' cases.
	 *
	 *  @param grade The grade to replace the previous one
 	 */
	void ChangeGrade(char grade);

	/**
	 *  @return The grade the student received from the course
 	 */
	char getGrade();

	/**
	 *  @return The semester and year the course was taken
 	 */
	String getSemesterTaken();

	/**
 	 *  A special case to where the student retook the course to update the
	 *  the semester it was taken and grade received, no coloration of modified
	 *  information
	 *
	 *  @param grade The grade received when the class was retaken
	 *  @param semester The semester when the student retook the course
 	 */
	void Retake(String semester, char grade);
}


