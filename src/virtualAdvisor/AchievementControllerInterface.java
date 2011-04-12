package virtualAdvisor;

import java.util.List;

public interface AchievementControllerInterface {
	/**
	 * Connects the user interface to the achievements,
	 * 
	 * @returns a list of the achievements that were accomplished by the current user	
	 */
	List<AchievementInterface> listAchievements();

	/**
	 * Connects the user interface to the achievements, and provides a way for the
	 * user to get all courses taken that have a lower grade than specified
	 * 
	 * 
	 * @param grade, a character of the grade given to find achievements lower than (defaults to "c")
	 * @returns a list of the achievements that have a lower grade than provided	
	 */
	List<AchievementInterface> listOfAchievementsWithLowGrade(char grade);
}
