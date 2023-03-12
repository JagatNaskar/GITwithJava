package OOPS_Assignment;
//package SStudent;
public class Student {
	private int rollNum;
	private String name;
	private String course;
	private int marks1, marks2, marks3;
	
	public double calTotal(int m1, int m2, int m3)
	{
		return (m1+m2+m3);
	}
	
	public double calculateAverage(double total, int no_of_sub)
	{
		return (total/no_of_sub);
	}
	public String calculateGrade(double average)
	{
		   if(average > 90)
			   return "A+";
		   else if(average >80 && average < 90)
			   return "A";
		   else if(average >70 && average <80)
			   return "B+";
		   else if(average >60 && average <70)
			   return "B";
		   else if(average >50 && average <60)
			   return "C+";
		   else if(average >40 && average <50)
			   return "C";
		   else return "F";
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", course=" + course + ", marks1=" + marks1
				+ ", marks2=" + marks2 + ", marks3=" + marks3 + "]";
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getMarks1() {
		return marks1;
	}

	public void setMarks1(int marks1) {
		this.marks1 = marks1;
	}

	public int getMarks2() {
		return marks2;
	}

	public void setMarks2(int marks2) {
		this.marks2 = marks2;
	}

	public int getMarks3() {
		return marks3;
	}

	public void setMarks3(int marks3) {
		this.marks3 = marks3;
	}
	
}
