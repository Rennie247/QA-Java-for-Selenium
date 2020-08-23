package Week8_HW;

public class employeeGrossSalary {

	public static void main(String[] args) {
		// Homework week 8; Number 1

		double BasicSalary = 120000;
		
		double DA = 0.10 * BasicSalary;  // 10% of the Basic Salary
		double HRA = 0.05 * BasicSalary; // 5% of the Basic Salary
		double Tax = 0.13 * BasicSalary; // 13% of the Basic Salary
		
		double grossSalary = BasicSalary + DA + HRA + Tax;
		
		grossSalary=Math.round(grossSalary);
		
		System.out.println("The gross salary for employee is :"+ grossSalary);
	}

}
