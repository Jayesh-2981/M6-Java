// Geaometry : Area Of Hexagon

/*
	Write a program that prompts the user to enter the side of hexagon and displays its area.
	The Formula of Area of Hexagon is :

	Area = 3(sqrt(2)/2)S*		//S = length of a side
*/

import java.util.Scanner;

class Area_Of_Hexagon
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Sides of Hexagon : ");
		double sides = input.nextDouble();

		double area = 3*(1.73205080757/2)*(sides*sides);
		System.out.print("Area of Hexagon : "+area);	
	}
}

/*
OUTPUT :-

Enter Sides of Hexagon : 5.5
Area of Hexagon : 78.59180539348876

*/