/*
	Write a program that converts pounds into kilograms.
	The program prompt the user to enter a number in pounds,
	converts it to kilograms and displays the result. 
	One pound is 0.454 kilograms.
	Here is a sample run :
	Enter a number in pounds : 55.5 pounds is 25.197 in kilograms
*/

import java.util.*;
class Pounds_To_Kilometer
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value in pounds : ");
		double pounds = sc.nextDouble();

		double kilograms = pounds * 0.454;

		System.out.println(pounds + " pounds are "+kilograms + " in kilograms");
	}
}

/*
OUTPUT :-
Enter the value in pounds : 55.5
55.5 pounds are 25.197 in kilograms
*/ 