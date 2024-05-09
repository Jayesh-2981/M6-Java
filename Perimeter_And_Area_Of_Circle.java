/*
	Write a program that displays the area and perimeter of a circle that has a radius of 
	5.5 using the following formula : 

	perimeter of Circle = 2 * pi(3.14) * radius
	Area of Circle = pi(3.14)*radius*radius;
*/
	
import java.util.*;
class Perimeter_And_Area_Of_Circle
{
	public static void main (String [] paaoc)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius size : ");
		double radius = sc.nextDouble();

		final double pi = 3.14;

		double perimeter = 2*pi*radius;
		System.out.println("perimeter of Circle : "+perimeter);

		double area = pi*radius*radius;
		System.out.println("Area of Circle : "+area);
	}
}

/*
OUTPUT :-
Enter radius size :
5.5
perimeter of Circle : 34.54
Area of Circle : 94.985
*/