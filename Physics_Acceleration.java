/*
	Average acceleration is defined as the change of velocity divided by the time taken to make the change,
	as shown in the following formula:
	a = (v1-v0)/t

	Write a program that prompts the user to enter the starting velocity V0 in meters/second,
	the ending velocity V1 in meter/second,
	and the time span it in seconds, 
	and display the Average acceleration

	Here is a sample run :
	Enter V0, V1, and t : 5.5, 50.9, 4.5
	The average acceleration is 10.0889
*/

import java.util.*;
class Physics_Acceleration
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter V0, v1 and t : ");
		double v0 = sc.nextDouble();
		double v1 = sc.nextDouble();
		double t = sc.nextDouble();

		double averageAcceleration = (v1-v0)/t;

		System.out.println("The Average acceleration is : "+averageAcceleration);
	}
}

/*
OUTPUT :-
Enter V0, v1 and t : 5.5 50.9 4.5
The Average acceleration is : 10.088888888888889
*/