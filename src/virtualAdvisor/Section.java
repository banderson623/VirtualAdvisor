package virtualAdvisor;


public class Section implements SectionInterface
{

		private String professor;
		private String meetingTime;
//		private String availability;

		private boolean open;
		private int currentEnrollment;
		private int maximumEnrollment;

		/**
		 * 
		 * Creates a new section and defaults its enrollment to 0 and
		 * it starts off closed
		 */
		public Section()
		{
			currentEnrollment = 0;
			boolean open = false;
		}

		/**
		 * 
		 * Retrieves the name of the professor teaching the specified section
		 *
		 * @return The name of the professor teaching the section
		 */
		public String getProfessor()
		{
			return professor;
		}


		/**
		 * 
		 * Retrieves the time at which the section will be meeting
		 *
		 * @return The meeting time of the section
		 */
		public String getMeetingTime()
		{
			return meetingTime;
		}

		/**
		 * Retrieves the availability of the course, whether its open, full, closed, ect.
		 *
		 * @return The availability of the course
		 */
		public String getAvailability()
		{
			if(currentEnrollment == maximumEnrollment)
			{
				return "Full";
			}
			else if(open == false)
			{
				return "Closed";
			}
			else
			{
				return "Open";
			}
		}

		
		/**
		 * Sets the name of the professor teaching the section
		 *
		 * @param the name of the professor
		 */
		public void setProfessor(String prof)
		{
			professor = prof;
		}

		/**
		 * Sets the meeting time that the section takes place
		 *
		 * @param the meeting time of the section
		 */
		public void setMeetingTime(String time)
		{
			meetingTime = time;
		}

		/**
		 * Sets the maximum amount of students that can be enrolled in the section
		 *
		 * @param max number of students in the section
		 */
		public void setMaxEnroll(int max)
		{
			maximumEnrollment = max;
		}

		/**
		 * Sets the status of the section, open or closed
		 * TODO: consider refactoring this method... so there is no string comparison needed
		 * @param status of the section
		 */
		public void setStatus(String status)
		{
			open = status.equals("Open") ? true : false;
		}

		/**
		 * Sets the current amount of students that can be enrolled in the section
		 *
		 * @param current number of students in the section
		 * @return A message on whether the students were able to fit in the section
		 */
		public String setCurEnroll(int cur)
		{
			if(cur > maximumEnrollment)
			{
				return "Section is too full";
			}

			currentEnrollment = cur;
			return "Students Added";
		}

}
