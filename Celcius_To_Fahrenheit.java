/*
	write a program that reads a celcius degree in a double value from the console,
	that converts it to Fahrenheit and displays the result.
	The formula for the conversion is as follows:

	Fahrenheit = (9/5)*celcius+32

	(Hint :- In java 9/5 is 1, but 9.0/5 is 1.8)
*/

import java.util.*;

class Celcius_To_Fahrenheit
{
	public static void main(String [] ctf)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temperature in Celcius : ");
		double celcius = sc.nextDouble();
		double farhenheit = 9d/5*celcius + 32;	// if 9/5*celcius + 32

		System.out.println(celcius + " Celcius is "+farhenheit + " in Farhenheit");
	}
}

/*
OUTPUT :-
Enter Temperature in Celcius :
45
45.0 Celcius is 113.0 in Farhenheit
*/

/*
OUTPUT :-
If 9/5*celcius +32
Enter Temperature in Celcius :
45
45.0 Celcius is 77.0 in Farhenheit
*/