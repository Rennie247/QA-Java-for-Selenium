package Assignment_2;

import java.util.Scanner;

public class AdetolaPg18Point4 {

	public static void main(String[] args) {
		// Write a Java program to check whether number is negative, zero, or positive.
		
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the number");
		float num =scanner.nextFloat();
		scanner.close(); 	// close the scanner
	
		if (num>0)
			System.out.println("This is a positive number");
		else if (num<0)
			System.out.println("This is a negative number");
		else if (num==0)
			System.out.println("This number is Zero");
		
	}

}
