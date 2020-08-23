package Assignment_1;
// Write a Java program to print the sum (addition), multiply, subtract,
// divide and remainder of two numbers.

import java.util.Scanner;

public class AdetolaPg12Point3 {

	public static void main(String[] args) {

	/*	int a=100; int b=25;			//You can use this method
		
		int c=a+b; //where two numbers are added
		int d=a*b; //where two numbers are multiplied
		int e=a-b; //where two numbers are subtracted
		int f=a/b; //where two numbers are divided
		int g=a%b; //where two numbers are remained
		
		System.out.println("The addition of a and b is "+c);
		System.out.println("The multiplication of a and b is "+d);
		System.out.println("The subtraction of a and b is "+e );
		System.out.println("The division of a and b is "+f);
		System.out.println("The remainder of two numbers of a and b is "+g);
		
		OR
	*/
		
		
		Scanner scanner = new Scanner (System.in); 				//This method is better for easy input
		int firstnumber;
		int secondnumber;
		
		System.out.println( "Enter the first number");
		firstnumber=scanner.nextInt();
		
		System.out.println( "Enter the second number");
		secondnumber =scanner.nextInt();
		scanner.close(); //This closes the scanner
		
		int c= firstnumber+secondnumber;
		int d= firstnumber*secondnumber;
		int e= firstnumber-secondnumber;
		int f= firstnumber/secondnumber;
		int g= firstnumber%secondnumber;
		
		System.out.println("Additon of these two numbers :"+firstnumber+" + "+secondnumber+" is "+c );
		System.out.println("Multiplication of these two numbers :"+firstnumber+" * "+secondnumber+" is "+d);
		System.out.println("Subtraction of these two numbers :"+firstnumber+" - "+secondnumber+" is "+e );
		System.out.println("Division of these two numbers :"+firstnumber+" / "+secondnumber+" is "+f );
		System.out.println("Remainder of these two numbers :"+firstnumber+" % "+secondnumber+" is "+g );
		
	}

}
