package Assignment_3;
// Write a program in Java to display the multiplication table of a number using
// for loop

import java.util.Scanner;

public class AdetolaPg28Point3 {

	public static void main(String[] args) {
		
		//Either this method is used getting all number between 1 and 10 for both variables i and j
	/*	for (int i=1; i<=12; i++) {
			for (int j=1; j<=12; j++) 
			{
				System.out.println("The multiplication table of this number is : "+i+"  * "+j+" = "+i*j);
			}
		}
	*/
		//OR This method is used to enter any number of your choice
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number");
		int j = scanner.nextInt();
		scanner.close(); 	// close the scanner
		
		for (int i=1; i<=12; i++) {
			System.out.println("The multiplication table of this number is : "+j+"  * "+i+" = "+j*i);
		}	
	}

}
