package Assignment_3;
// Write a java program to sum digits of a number.
import java.util.Scanner;

public class AdetolaPg28Point5 {

	public static void main(String[] args) {

		int num, sum, rem;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number ");
		num=scanner.nextInt();
		scanner.close();
		
		for(sum=0 ;num!=0 ;num/=10)
		{
		rem = num % 10;
		sum = sum + rem;
		}
		
		System.out.println("Sum of digits "+sum);
	}

}
