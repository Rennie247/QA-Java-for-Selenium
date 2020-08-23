package Assignment_2;

import java.util.Scanner;

public class AdetolaPg18Point6 {

	public static void main(String[] args) {
		// Write a program to print month name based month number as an input using
		// switch...Case statement.
		
				Scanner scanner= new Scanner (System.in);
				System.out.println("Enter month number (1 to 12): ");
				int month = scanner.nextInt();
				scanner.close(); 	// close the scanner
		
				switch(month)
				{
					case 1: System.out.println("January"); break;
					case 2: System.out.println("Febuary"); break;
					case 3: System.out.println("March"); break;
					case 4: System.out.println("April"); break;
					case 5: System.out.println("May"); break;
					case 6: System.out.println("June"); break;
					case 7: System.out.println("July"); break;
					case 8: System.out.println("August"); break;
					case 9: System.out.println("September"); break;
					case 10: System.out.println("October"); break;
					case 11: System.out.println("November"); break;
					case 12: System.out.println("December"); break;
					default: System.out.println("Invalid day range"); break; 
					
				}  		
	}
}
