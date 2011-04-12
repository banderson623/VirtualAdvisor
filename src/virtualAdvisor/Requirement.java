package virtualAdvisor;

import java.util.ArrayList;
import java.util.List;


public class Requirement implements RequirementInterface {
	private String name;
	private int id;
	private DegreeInterface degree;
	private List<CourseInterface> courses;
	
	public Requirement(String newName, int newId, DegreeInterface newDegree){
		name = newName;
		id = newId;
		degree = newDegree;
		courses = new ArrayList<CourseInterface>();		
	}
	
	public List<CourseInterface> getCourses() {
		// TODO: make this useful...
		return courses;
	}

	public void addCourse(CourseInterface course){
		courses.add(course);
	}
	
	/**
	 * Get requirement name
	 */
	public String getName(){ return name; }

	/**
	 * Set requirement name
	 */
	public void setName(String newName){ name = newName; }
	
	/**
	 * Get requirement Id
	 */
	public int getId(){ return id; }
	
	/**
	 * Get associated Degree
	 */
	public DegreeInterface getDegree(){ return degree; }

	@Override
	public int id() {
		return id;
	}
}

