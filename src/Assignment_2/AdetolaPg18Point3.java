package Assignment_2;

import java.util.Scanner;

public class AdetolaPg18Point3 {

	public static void main(String[] args) {
		// Print the greatest number of 3 numbers.
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number the number A");
	int a= scanner.nextInt();
	
	System.out.println("Enter the number the number B");
	int b= scanner.nextInt();
	
	System.out.println("Enter the number the number C");
	int c= scanner.nextInt();
	scanner.close(); 	// close the scanner
	
	
	
	if (a>b && a>c)
		System.out.println("The greatest number is A");
	else if (b>a && b>c)
		System.out.println("The greatest number is B");
	else if (c>a && c>b)
		System.out.println("The greatest number is C");
	else
		System.out.println("invalid input, please check and retry again");
	
	}
	

}
