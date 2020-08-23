package Assignment_6;

public class Employee {

	int empID;
	String ename;
	int esal;
	String job;
     void getEmpData(int i, String n,int s, String j)
     {
	
			empID =i;
			ename=n;
			esal=s;
			job=j;
		}
		void displayEmpData()
		{

           System.out.println(empID+" "+ename+" "+esal+" "+job);
			
		
	}
}


