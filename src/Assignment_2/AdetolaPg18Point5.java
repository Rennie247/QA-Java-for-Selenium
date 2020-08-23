package Assignment_2;

import java.util.Scanner;

public class AdetolaPg18Point5 {

	public static void main(String[] args) {
		// Write a program will show if the person is eligible to vote.
		
				Scanner scanner = new Scanner (System.in);
				System.out.println("Enter your age");
				int age =scanner.nextInt();
				scanner.close(); 	// close the scanner
				
			if (age>=18)
				System.out.println("You are eligible to vote");
			else if (age<18)
				System.out.println("Sorry, you are not eligible to "
						+ "vote. You must be 18 years and above ");
			else 
				System.out.println("Please enter a valid input");
	
	}

}
