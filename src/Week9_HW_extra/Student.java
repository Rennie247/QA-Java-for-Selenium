package Week9_HW_extra;

//public is be added to the method so it can be visible to another package
public class Student {
	int StudentID;
	String StudentName;
	String StudentGrade;
	
	//public is be added to the method so it can be visible to another package
	public void insertRecord(int ID, String name, String grade){	
		StudentID=ID; 
		StudentName=name; 
		StudentGrade=grade;
	}
	
	//public will be added to this method so it can be visible to another package
	public void displayStudentInformation() {
		System.out.println(StudentID+" "+StudentName+" "+StudentGrade);
		
	}
}
