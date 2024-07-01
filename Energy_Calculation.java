// Science : Energy Calculation

/*	Write a program that calculates the energy needed to heat water from an initial temperature to a final temperature.
	Your program should prompt the user to enter the amount of in kilograms and the initial and final temperatures of the water
	The Formula to compute the energy is :

	Q = M*(Final Temperature - Initial Temperature)*4184

	where, M is weight of water in kilograms,
		   Temperatures are in degrees celcius
		   Energy Q is measured in joules.
*/

import java.util.Scanner;

class Energy_Calculation
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter amount of Water in Kg : ");
		float water = input.nextFloat();

		System.out.print("Enter initial Temperature : ");
		float initialTemp = input.nextFloat();

		System.out.print("Enter Final Temperatur : ");
		float finalTemp = input.nextFloat();

		float energyNeeded = water * (finalTemp - initialTemp) * 4184;
		System.out.println("The energy Needed is : "+energyNeeded);
	}
}

/*
OUTPUT :-
Enter amount of Water in Kg : 55.5
Enter initial Temperature : 3.5
Enter Final Temperatur : 10.5
The energy Needed is : 1625484.0
*/