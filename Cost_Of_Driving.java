// Cost Of Driving

/*
	Write a program that prompts the user to enter the distance to drive, the fuel efficiency of car 
	in miles/gallon and price/gallon and displays the cost of the trip.

	Cost = (distance/miles per gallon)*price per gallon
*/

import java.util.Scanner;

class Cost_Of_Driving
{
	public static void main(String[] cod)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Distance : ");
		double distance = input.nextDouble();

		System.out.print("Enter miles/gallon : ");
		double milesPerGallon = input.nextDouble();

		System.out.print("Enter price/gallon : ");
		double pricePerGallon = input.nextDouble();

		double costOfDriving = (distance/milesPerGallon)*pricePerGallon;
		System.out.print("The cost of driving is : "+costOfDriving);
	}
}

/*
OUTPUT :-
Enter Distance : 900.5
Enter miles/gallon : 25.5
Enter price/gallon : 3.55
The cost of driving is : 125.36372549019607
*/