/*	
	Write a java program that displays the area of perimeter of a rectangle with the width
	The width of 4.5 and height of 7.9 using the following formula :
	
	area = width * height
	Perimeter = 2*height + width
*/

import java.util.*;

class Perimeter_And_Area_Of_Rectangle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Height : ");
		double height = sc.nextDouble();

		System.out.println("Enter Width : ");
		double width = sc.nextDouble();

		double area = width * height;
		double perimeter = 2 * height +width;

		System.out.println("Perimeter of Rectangle : "+perimeter);
		System.out.println("Area of Rectangle : "+area);
	}
}

/*
OUTPUT :-
Enter Height :
7.9
Enter Width :
4.5
Perimeter of Rectangle : 20.3
Area of Rectangle : 35.550000000000004
*/