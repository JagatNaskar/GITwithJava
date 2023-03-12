

package OOPS_Assignment;

//import com.springcore2.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		System.out.println(s1);
		
		s1.setRollNum(001);
		s1.setName("Sariful");
		s1.setCourse("Science");
		s1.setMarks1(45);
		s1.setMarks2(55);
		s1.setMarks3(45);
		System.out.println(s1);
		System.out.println("Grade = "+s1.calculateGrade(s1.calculateAverage(s1.calTotal(s1.getMarks1(), s1.getMarks2(), s1.getMarks3()), 3)));
		
		s2.setRollNum(002);
		s2.setName("Asish");
		s2.setCourse("Science");
		s2.setMarks1(43);
		s2.setMarks2(66);
		s2.setMarks3(85);
		System.out.println(s2);
		System.out.println("Grade = "+s2.calculateGrade(s2.calculateAverage(s2.calTotal(s2.getMarks1(), s2.getMarks2(), s2.getMarks3()), 3)));
		
		s3.setRollNum(003);
		s3.setName("Bunti");
		s3.setCourse("Science");
		s3.setMarks1(45);
		s3.setMarks2(65);
		s3.setMarks3(64);
		System.out.println(s3);
		System.out.println("Grade = "+s3.calculateGrade(s3.calculateAverage(s3.calTotal(s3.getMarks1(), s3.getMarks2(), s3.getMarks3()), 3)));
		
		s4.setRollNum(004);
		s4.setName("Haami");
		s4.setCourse("Science");
		s4.setMarks1(66);
		s4.setMarks2(87);
		s4.setMarks3(45);
		System.out.println(s4);
		System.out.println("Grade = "+s4.calculateGrade(s4.calculateAverage(s4.calTotal(s4.getMarks1(), s4.getMarks2(), s4.getMarks3()), 3)));
		
		s5.setRollNum(005);
		s5.setName("Thor");
		s5.setCourse("Science");
		s5.setMarks1(46);
		s5.setMarks2(77);
		s5.setMarks3(66);
		System.out.println(s5);
		System.out.println("Grade = "+s5.calculateGrade(s5.calculateAverage(s5.calTotal(s5.getMarks1(), s5.getMarks2(), s5.getMarks3()), 3)));
		
	}

}
