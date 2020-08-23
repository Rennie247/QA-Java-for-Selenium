package Assignment_6;

public class TestStudent {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		s1.getStuData(1001, "sireesha");
		s2.getStuData(1002, "christina");
		s3.getStuData(1003, "robert");
		s1.getStuMarks(45,72,89);
		s2.getStuMarks(25,76,53);
		s3.getStuMarks(47,92,65);
		s1.calTotalMarks();
		s2.calTotalMarks();
		s3.calTotalMarks();


	}

}
