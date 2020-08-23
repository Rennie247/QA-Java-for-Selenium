package Assignment_2;

import java.util.Scanner;

public class AdetolaPg18Point1 {
	
	 public static void main(String args[]){
		// Write a Java program to check a number is even or odd.

		 Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the number");
			int num= scanner.nextInt();
			scanner.close(); 	// close the scanner

    
    if ( num % 2 == 0 )
        System.out.println("This is an even number");
     else
        System.out.println("Entered number is odd");
	}
}
