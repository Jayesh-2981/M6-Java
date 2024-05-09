/*
	Write a program that reads a number in feet, converts it to meters, and displays the result. 
	1 feet is 0.305m.
	Here is a sample run : 
	Enter a value for feet : 16.5
	16.5 feet is 5.0325 meters
*/

import java.util.*;

class Feet_To_Meter
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter feet : ");
		double feet = sc.nextDouble();

		double meters = feet*0.305;
		System.out.println(feet + " feet is "+meters +" in meters" );
	}
}

/*
OUTPUT :-
Enter feet :16.5
16.5 feet is 5.0325 in meters
*/