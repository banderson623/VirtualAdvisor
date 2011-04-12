package virtualAdvisor;

import java.util.List;

public interface ScheduleInterface {

	/**
 	 *  Allows the system to add an Item to the Schedule, and makes a call to 
	 *  doesConflict to make sure it's clear to be added.
	 *
	 *  @param item The ScheduleItem to be added
	 *  @return False if the startTime does conflict with a previous engagement, 
 *          True if the scheduleItem was added.
 	 */
	boolean add(ScheduleItemInterface item);

	/**
	 *  @return The entire schedule
 	 */
	List<ScheduleItemInterface> getFullList();

	/**
	 *  @return Only the Items that have a section ID in them, 
 *   making them school related
 	 */
	List<ScheduleItemInterface> getSectionsList();

	/**
	 *  @return The list of items that are not school related, or have no section ID
 	 */
	List<ScheduleItem> getNonSchoolList();

	/**
 	 *  Checks the current schedule to make sure the input item doesn't conflict with
	 *  any previous engagements
	 *
	 *  @param item The item being compared to the current schedule
	 *  @return True if the startTime does conflict with a previous engagement
 	 */
	boolean doesConflict(ScheduleItemInterface item);
}
