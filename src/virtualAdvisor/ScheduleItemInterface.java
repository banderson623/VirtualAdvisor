package virtualAdvisor;

import java.sql.Time;
import java.util.Date;

public interface ScheduleItemInterface {
	/**
 	 *  If the item only occurs from a certain date on, then this could be set so
	 *  the schedule knows that the item starts at the input date
	 *
	 *  @param startDate The date at which the Item will become active
 	 */
	void setStartDate(Date startDate);

	/**
 	 *  Only can be set if there is a start date.  This will tell the item
	 *  when it will stop occurring on the schedule.
	 *
	 *  @param endDate The date at which the Item will stop being active
 	 */
	void setEndDate(Date startDate);

	/**
 	 *  Returns the starting date
	 *
	 *  @return the starting date
 	 */	
	Date getStartDate();

	/**
 	 *  Returns the end date
	 *
	 *  @return the end date
 	 */
	Date getEndDate();

	/**
	 *  Set the days of the week from when the Item will occur and reoccur
	 *
	 *  @param days Days of the week, true if it occurs on that day, false if not
	 *  @return True if the days when set doesn't conflict with a previous engagement
 	 */
	boolean setDays(boolean[] days);

//	/**
// 	 *  Change the start time of an Item
//	 *
//	 *  @param startTime The time to replace the old start time
//	 *  @return True if the startTime didn't conflict with a previous engagement
// 	 */
//	boolean changeStartTime(Time startTime);
//
//	/**
// 	 *  Change the end time of an Item
//	 *
//	 *  @param endTime The time to replace the old end time
//	 *  @return True if the endTime didn't conflict with a previous engagement
// 	 */
//	boolean changeEndTime(Time endTime);

	/**
 	 *  Change the name of an Item
	 *
	 *  @param name The new name for the Item
 	 */
	void changeName(String name);

	/**
 	 *  Gets the days that this item pertains to
	 *
	 *  @return boolean array that this items pertains to
 	 */
	boolean[] getDays();

	/**
 	 *  Returns the end time of this item
	 *
	 *  @return the time item ends
 	 */
	Time getEndTime();

	/**
 	 *  Returns the start time of this item
	 *
	 *  @return the time item starts
 	 */
	Time getStartTime();
}
