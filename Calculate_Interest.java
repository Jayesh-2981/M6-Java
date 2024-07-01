// Financial Application : Calculate Interest

/*
	Write a program that reads balance and annual percentage interest rate and displays the interest for the next month.

	Interest = balance * (Annual Interest Rate / 1200)
*/

import java.util.Scanner;

class Calculate_Interest
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Balance : ");
		double balance = input.nextDouble();

		System.out.print("Annual Interest Rate : ");
		double interestRate = input.nextDouble();

		double interest = balance * (interestRate / 1200);
		System.out.print("Interest for next Month : "+interest);
	}
}

/*
OUTPUT :-

Enter Balance : 1000
Annual Interest Rate : 3.5
Interest for next Month : 2.916666666666667

*/