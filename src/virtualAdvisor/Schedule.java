package virtualAdvisor;

import java.util.ArrayList;
import java.util.List;

public class Schedule implements ScheduleInterface {
	private ArrayList<ScheduleItem> items;

	public Schedule() {
		items = new ArrayList<ScheduleItem>();
	}

	public boolean add(ScheduleItem item) {
		if (!doesConflict(item)) {
			return items.add(item);
		}
		return false;
	}

	public List<ScheduleItemInterface> getFullList() {
		return items;
	}

	public List<ScheduleItemInterface> getSectionsList() {
		List<ScheduleItem> ret = new ArrayList<ScheduleItem>();

		for (int i = 0; i < ret.size(); i++) {
			for (Class j : items.get(i).getClass().getInterfaces()) {
				if (j.equals("SectionScheduleItemInterface"))
					ret.add(items.get(i));
			}
		}

		return ret;
	}

	public List<ScheduleItem> getNonSchoolList() {
		List<ScheduleItem> temp = items;
		temp.removeAll(getSectionsList());
		return temp;
	}

	public boolean doesConflict(ScheduleItemInterface item) {
		ScheduleItem temp = null;
		for (int i = 0; i < items.size(); i++) {
			temp = items.get(i);
			if ((temp.getStartDate().equals(item.getStartDate()) || temp
					.getEndDate().equals(item.getEndDate()))
					|| (temp.getStartDate().before(item.getStartDate()) && temp
							.getEndDate().after(item.getStartDate()))
					|| (temp.getStartDate().after(item.getEndDate()) && temp
							.getEndDate().before(item.getEndDate()))
					|| (temp.getStartDate().after(item.getStartDate()) && temp
							.getEndDate().before(item.getEndDate()))) {
				if (intersect(item, temp)) {
					if ((temp.getStartTime().equals(item.getStartTime()) || temp
							.getEndTime().equals(item.getEndTime()))
							|| (temp.getStartTime().before(item.getStartTime()) && temp
									.getEndTime().after(item.getStartTime()))
							|| (temp.getStartTime().after(item.getEndTime()) && temp
									.getEndTime().before(item.getEndTime()))
							|| (temp.getStartTime().after(item.getStartTime()) && temp
									.getEndTime().before(item.getEndTime()))) {
						return true;
					}
				}
			}
		}
		return false;
	}

	protected boolean intersect(boolean[] first, boolean[] second) {
		for (int i = 0; i < 7; i++) {
			if (first[i] && second[i])
				return true;
		}
		return false;
	}

}
