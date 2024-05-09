/*
	Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
	For example,
	if an integer is 932, the sum of all its digits is 14.
*/

import java.util.*;
class Addition_Of_Digits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int number = sc.nextInt();
		int sum =0;
		if(number>0 && number<1000)
		{
			while(number>0)
			{
				sum = sum + (number%10);
				number/=10;
			}

			System.out.println("The sum of all digits is "+ sum);
		}
		else{
			System.out.println("The number should be in between 0 and 1000");
		}

	}
}

/*
OUTPUT :-
Enter Number : 932
The sum of all digits is 14
*/