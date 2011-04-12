package virtualAdvisor;

import java.util.ArrayList;
import java.util.List;

public class Course implements CourseInterface {
	ArrayList<SectionInterface> sections = new ArrayList<SectionInterface>();
	ArrayList<CourseInterface> prerequisites = new ArrayList<CourseInterface>();
	int numOfCredits;
	int difficultyLevel;

	/**
	  *  Constructor for courses
	  *
	**/
	public Course()
	{
		numOfCredits =  0;
		difficultyLevel =  0;
	}

	/**
	  *  Specific Constructor for courses
	  *
	  *@param credits set the number of credits for the course
	 **/
	private Course (int credits, int difficulty)
	{
		numOfCredits = credits;
		difficultyLevel = difficulty;
	}

	/**
	  * Adds a section to the list of sections
	  *
	  * @param section the Section object of the section to be added
	**/
	private void addSection(Section section)
	{
	     sections.add(section);
	}

	/**
	  * Removes a section to the list of sections
	  *
	  * @param section the name of the section to be removed
	**/
	private void removeSection(SectionInterface section)
	{
	     sections.remove(section);
	}

	/**
	  * Returns the list of sections for the course
	  *
	  * @return the list of sections for the course
	**/
	public ArrayList<SectionInterface> getSectionList()
	{
	     return sections;
	}

	/**
	  * Adds a prerequisite to the list of prerequisites
	  *
	  * @param section the name of the prerequisite to be added
	**/
	public void addPrerequisite(CourseInterface course)
	{
	     prerequisites.add(course);
	}
	/**
	  * Removes a prerequisite to the list of prerequisites
	  *
	  * @param section the name of the section to be removed
	**/
	public void removePrerequisite(CourseInterface course)
	{
	     prerequisites.remove(course);
	}

	/**
	  * Returns the list of prerequisites  for the course
	  *
	  * @return the list of prerequisites for the course
	**/
	public ArrayList<CourseInterface> getPrerequisites()
	{
	     return prerequisites;
	}

	/**
	  * Sets the number of credits for the course
	  *
	  * @param credits the number of credits 
	**/
	public void setCredits(int credits)
	{
		numOfCredits = credits;
	}
	/**
	  * Returns the number of credits
	  *
	  * @return the number of credits
	**/
	public int getCredits() 
	{
		return numOfCredits;
	}
	
	 /** Sets the difficulty level for the course
	  *
	  * @param difficultyLevel the level of difficulty for the course 
	  **/
	public void setDifficulty(int difficulty)
	{
		difficultyLevel = difficulty;
	}
	
	/**
	  * Returns the difficulty level of the course
	  *
	  * @return difficulty level
	**/
	public int getDifficulty() 
	{
		return difficultyLevel;
	}

	@Override
	public List<CourseInterface> getPrerequisiteCourses() {
		return prerequisites;
	}

}
