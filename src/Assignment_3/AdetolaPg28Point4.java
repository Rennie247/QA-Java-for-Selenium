package Assignment_3;

//Question: Write a java program to split number into digits.

public class AdetolaPg28Point4 {

	public static void main(String[] args) {
		
	int num=12346, temp, digit, count=0;
	
	temp = num;
	while (num>0) 
	{
		num =num / 10;
		count++;
	}
	while (temp>0)
	{
		digit = temp % 10;
		System.out.println("Digit at position "+count+ " is: "+digit);
		temp = temp / 10;
		count--;
	
	}
}
}
