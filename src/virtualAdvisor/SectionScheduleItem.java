package virtualAdvisor;

import java.sql.Time;
import java.util.Date;

public class SectionScheduleItem extends ScheduleItem implements SectionScheduleItemInterface {

	int sectionId;
	
	public SectionScheduleItem(String name, Time startTime, Time endTime,
			boolean[] days, int sectionId) {
		super(name, startTime, endTime, days);
		this.sectionId = sectionId;
		// TODO Auto-generated constructor stub
	}
	
	public void setSectionId(int id)
	{
		sectionId = id;
	}
	
	public SectionInterface getSection() {
		return DatabaseSupport.findSection(sectionId);
	}
}
