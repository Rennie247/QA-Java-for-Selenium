package Assignment_3;
// Write a java program to reverse a number

import java.util.Scanner;

public class AdetolaPg28Point6 {

	public static void main(String[] args) {
		//where num:number, rev:reverse
		
		int num,rev=0,rem;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number : ");
		num = scanner.nextInt();
		scanner.close();
		
		
		while (num>0)
		{
		rem = num % 10;
		rev = rev * 10 + rem;
		num = num / 10;
		}
		
		System.out.println("Reverse order is : "+rev);

	}

}
