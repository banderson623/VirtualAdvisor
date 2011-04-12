package virtualAdvisor;

import java.util.ArrayList;
import java.util.List;

public class RequirementController implements RequirementControllerInterface
{
	protected List<RequirementInterface> requirements;
	
	public RequirementController(){
		// TODO find a way to load these
		requirements = DatabaseSupport.findAllRequirements();
//		requirements = new ArrayList<RequirementInterface>();
	}
	
	public List<CourseInterface> listOfCoursesForRequirement(int requirementID){
		if (requirementID < 0) {
        	throw new IndexOutOfBoundsException("Requirement ID must be a positive number");
		}
		for(RequirementInterface r :requirements){
			if(r.id() == requirementID) return r.getCourses();
		}
		
		// if nothing return an empty list
		return new ArrayList<CourseInterface>();
	}
	
	public List<RequirementInterface> listForDegreeId(int degreeId){
		if (degreeId < 0) {
        	throw new IndexOutOfBoundsException("Degree ID must be a positive number");
		}
		
		return DatabaseSupport.findDegree(degreeId).getRequirements();
	}
	
}
