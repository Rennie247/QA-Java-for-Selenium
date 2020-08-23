package Assignment_1;
// Write a Java program to print the sum of two numbers.

import java.util.Scanner;

public class AdetolaPg12Point2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		int firstnumber; 
		int secondnumber; 
		
		int sum;
		
		System.out.println("Enter First number");
		firstnumber=input.nextInt();
		
		System.out.println("Enter Second number");
		secondnumber=input.nextInt();
		input.close(); //This closes the scanner
		
		sum= firstnumber + secondnumber;
 
		
		System.out.println("the sum of the two numbers for a and b is: "+sum );

	}

}
