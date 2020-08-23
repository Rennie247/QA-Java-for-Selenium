package AttendanceDetail;

public class Attendance {

	double hrsWorked;
	double rate;
	double Pay;

	void Pay(double hw, double r) {
		hrsWorked = hw;
		rate = r;
		
		double TotalPay = hrsWorked * rate;
		System.out.println("The total pay for the employee is "+TotalPay);
		
	}

}

