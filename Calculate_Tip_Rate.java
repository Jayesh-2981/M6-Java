/*
	Write a program that reads the subtotal and the gratutity vote,
	then computers the gratuity and total
	for example :- If the user enters 10 for subtotal and 15% for gratuity rate,
				   the program displays 1.5 as gratuity and $11.5 as total
				   Here is a sample run:
				   Enter the subtotal 10 and a tip rate 15%
				   The tip is 1.5 and total is 11.5
*/
import java.util.*;
class Calculate_Tip_Rate
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the subtotal : ");
		double subtotal = sc.nextDouble();

		System.out.println("Enter tip rate : ");
		double tipRate = sc.nextDouble(); 

		double tip = subtotal*(tipRate/100);

		double total = subtotal + tip;

		System.out.println("The tip is "+tip + " and total is "+total);
	}
}

/*
OUTPUT :-
Enter the subtotal :
10
Enter tip rate :
15
The tip is 1.5 and total is 11.5
*/