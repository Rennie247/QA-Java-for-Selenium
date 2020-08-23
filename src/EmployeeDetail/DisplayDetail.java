package EmployeeDetail;

public class DisplayDetail extends Details {
	int Empno;
	String Name;
	String Address;
	int Age;
	
	public void getdata(int em, String nm, String ad,int ag) {
		Empno = em;
		Name = nm;
		Address = ad;
		Age = ag;
		}
		
	public void display() {
			System.out.println("Employee details are as follows: "
					+ "Employee number is "+Empno+" , Name is "+Name+" "
					+ ", Address is "+Address+" , Age is "+Age);
	}
	
}
