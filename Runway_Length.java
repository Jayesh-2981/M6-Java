// Finding Runway Length

/*
	Given an airplane's acceleration 'a' and take-off speed v,
	You can compute the minimum runway length needed 
	For an airplane to take off using the following formula:

	length = v2/2a

	Write a program that prompts the user to enter 'v' in m/sec(m/s) 
	and acceleration 'a' in m/s squared and displays minimum runway length.
*/

import java.util.Scanner;

class Runway_Length
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Speed : ");
		float speed = input.nextFloat();

		System.out.print("Enter Acceleration : ");
		float acceleration = input.nextFloat();

		float runwayLength = (speed*speed)/(2*acceleration);
		System.out.println("The minimim length for this airplane is : "+runwayLength);
	}
}

/*
OUTPUT :-

Enter Speed : 60
Enter Acceleration : 3.5
The minimim length for this airplane is : 514.2857
*/