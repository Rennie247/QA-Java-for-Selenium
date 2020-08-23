package AttendanceDetail;

import EmployeeDetail.*;

public class Salary {

	public static void main(String[] args) {
		
		DisplayDetail DD1 = new DisplayDetail ();
		DisplayDetail DD2 = new DisplayDetail ();
		Attendance Att1 = new Attendance ();
		Attendance Att2 = new Attendance ();
		
		DD1.getdata(2100, "Ademide","15 John Street", 29);
		DD2.getdata(3200, "Kennedy","140A Sammy Street", 42);
		
		
		Att1.Pay (7.5, 16.5);
		Att2.Pay (5.0, 16.5);
		DD1.display();
		DD2.display();
	}

}
