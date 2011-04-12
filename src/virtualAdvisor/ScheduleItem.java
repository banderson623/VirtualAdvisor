package virtualAdvisor;

import java.sql.Time;
import java.util.Date;

public class ScheduleItem implements ScheduleItemInterface {

	protected String className = new String();
	protected Time timeStart;
	protected Time timeEnd;
	protected Date dateStart;
	protected Date dateEnd;
	protected boolean[] classDays;

	public ScheduleItem(String name, Time startTime, Time endTime,
			boolean[] days) {
		if (days.length == 7) {
			for (int i = 0; i < days.length; i++)
				classDays[i] = days[i];
		} else {
			System.out.println("Error. Invalid input for Class Days");
			return;
		}
		className = name;
		timeStart = startTime;
		timeEnd = endTime;
	}

	public void setStartDate(Date startDate) {
		dateStart = startDate;
	}

	public void setEndDate(Date endDate) {
		dateEnd = endDate;
	}

	public boolean[] getDays() {
		return classDays;
	}

	public boolean setDays(boolean[] days) {

		if (days.length == 7) {
			for (int i = 0; i < days.length; i++) {
				classDays[i] = days[i];
			}
			return true;
		} else {
			System.out.println("Error. Invalid input for Class Days");
			return false;
		}
	}

	public Time getStartTime() {
		return timeStart;
	}

	public Time getEndTime() {

		return timeEnd;
	}

	public Date getStartDate() {

		return dateStart;
	}

	public Date getEndDate() {

		return dateEnd;
	}

//	public boolean changeStartTime(Date startTime) {
//
//		if (startTime.isEmpty())
//			return false;
//		else {
//			timeStart = startTime;
//			return true;
//		}
//	}
//
//	public boolean changeEndTime(Date endTime) {
//		if (endTime.isEmpty())
//			return false;
//		else {
//			timeEnd = endTime;
//			return true;
//		}
//	}

	public void changeName(String name) {
		className = name;
	}

}
