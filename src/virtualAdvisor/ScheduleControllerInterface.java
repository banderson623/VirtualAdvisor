package virtualAdvisor;

import java.sql.Time;
import java.util.Date;
import java.util.List;

public interface ScheduleControllerInterface {
	/**
	 * Connects the user interface to the schedule, and provides a way for the 
	 * a non school item to be added to the schedule.
	 * 
	 * @param title, a string used to name the schedule item
	 * @param startDate, a date used to denote the first date this item begins
	 * @param endDate, the date used to denote the last date this item occurs
	 * @param startTime, a time used to denote the start time of this event
	 * @param endTime, a time used to denote the end time of this event 
	 * @param days, a boolean array, 0 being sunday, 
        *     used to declare on which days the event occurs
	 * @return boolean, true on successful add, false if the add failed
	 */
	boolean addNonSchoolScheduleItem(String title, Date startDate, Date endDate, Time startTime, Time endTime, boolean[] days);
	
	/**
	 * returns the non school items current in the schedule
	 * 
	 * @return a list of objects that implement the ScheduleItemInterface
	 */
	List<ScheduleItemInterface> getNonSchoolScheduleItems();

	/**
	 * Returns the course sections in current in the schedule
	 * 
	 * @return a list of objects that implement the SectionScheduleItemInterface
	 */
	List<SectionScheduleItemInterface> getSectionsInSchedule();
	
	/**
	 * Returns the all of the items in current in the schedule
	 * 
	 * @return a list of objects that implement the SectionScheduleItemInterface
	 */
	List<ScheduleItemInterface> getSchedule();
	
	/**
	 * Returns the schedule in a way that allows the user to save their schedule
	 * to disk or to print it out.
	 * 
	 * @return a string formatted output of a schedule
	 */
	String saveSchedule();
}
