// Health Application : Computing BMI

/*
	Body Mass Index (BMI) is a measure of health on weight.
	It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters.

	Write a program that prompts the user to enter a weight in pounds and Height in inches and displays the BMI.

	1 pound = 0.45359237 kg
	1 inch = 0.0254 meter
*/

import java.util.Scanner;

class Computing_BMI
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Weight in pound : ");
		float weight = input.nextFloat();

		System.out.print("Enter Height in inches : ");
		float height = input.nextFloat();

		double weightKg = weight * 0.45359237;
		double heightMeters = height * 0.0254;

		double bmi = weightKg / (heightMeters * heightMeters);
		System.out.println("BMI is : "+bmi);
	}
}

/*
OUTPUT :-

Enter Weight in pound : 95.5
Enter Height in inches : 50
BMI is : 26.857257942215885

*/