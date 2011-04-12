package virtualAdvisor;

public class Achievement implements AchievementInterface {
	String ID;
	String semester;
	char actualGrade;
	char changedGrade;
	boolean changed;

	public Achievement(String ID, String semester, char grade)
	{
		this.ID = ID;
		this.semester = semester;
		this.actualGrade = grade;
		changed = false;
	}

	public void changeGrade(char grade)
	{
		changed = true;
		changedGrade = grade;
	}

	public char getGrade()
	{
		if(changed) return changedGrade;
		return actualGrade;
	}

	public String getSemesterTaken()
	{
		return semester;
	}

	public void retake(String semester, char grade)
	{
		actualGrade = grade;
		changedGrade = ' ';
		this.semester = semester;
		changed = false;
	}

}
