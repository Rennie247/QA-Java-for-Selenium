package Week9_HW;

import Week9_HW_extra.*;

public class TestStudent {

	public static void main(String[] args) {
		// Homework week9 #2
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
	
		s1.insertRecord(2020001, "Andy Anderson", "A");
		s2.insertRecord(2020002, "Bell Sony", "B");
		s3.insertRecord(2020003, "Shunty Lious", "C");
	
		s1.displayStudentInformation();
		s2.displayStudentInformation();
		s3.displayStudentInformation();
	}
}
