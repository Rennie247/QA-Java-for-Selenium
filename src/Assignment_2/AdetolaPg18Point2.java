package Assignment_2;

import java.util.Scanner;

public class AdetolaPg18Point2 {

	public static void main(String[] args) {
		// Write a Java program that prints weekday based the week number(1 to 7).
		
		Scanner scanner= new Scanner (System.in);
		System.out.println("Enter weekday number (1 to 7): ");
		int day = scanner.nextInt();
		scanner.close();
		
		switch(day)
		{
			case 1: System.out.println("Sunday"); break;
			case 2: System.out.println("Monday"); break;
			case 3: System.out.println("Tuesday"); break;
			case 4: System.out.println("Wednesday"); break;
			case 5: System.out.println("Thursday"); break;
			case 6: System.out.println("Friday"); break;
			case 7: System.out.println("Saturday"); break;
			default: System.out.println("Invalid day range"); break; 
			
		}
	}
	
}
