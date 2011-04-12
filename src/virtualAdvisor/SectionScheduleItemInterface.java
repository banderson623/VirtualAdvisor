package virtualAdvisor;

public interface SectionScheduleItemInterface extends ScheduleItemInterface {
	/**
 	 *  Retrieves the section information of a SectionScheduleItem from the class that
	 *  will be taken at this items time
	 *
	 *  @param ID The ID of the section
	 *  @return A reference to the Section that corresponds to the ID
 	 */
	SectionInterface getSection();

	/**
 	 *  Sets the section Id for this Scheduled item
	 *
	 *  @param ID The ID of the section
	 *  @return A reference to the Section that corresponds to the ID
 	 */
	void setSectionId(int id);


}

