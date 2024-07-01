// Financial Application : Future Investment Value

/*
	Write a program that reads in investment amount, annual interest rate and number of years
	and displays the future investment value using the following formula:

	Future Investment Value = (Invesement Amount)*(1 + Monthly Interest Rate) Number Of Years *12
*/

import java.util.Scanner;

class Future_Investment_Value
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Investment Amount : ");
		double investment = input.nextDouble();

		System.out.print("Enter Annual Interest Rate : ");
		double annualInterestRate = input.nextDouble();

		System.out.print("Enter number of Years : ");
		double numberOfYears = input.nextDouble();

		double futureValue = investment*Math.pow(1+(annualInterestRate/100),numberOfYears);
		System.out.print("Future Investment value is : "+futureValue);
	}
}

/*
OUTPUT :-
Enter Investment Amount : 10000.56
Enter Annual Interest Rate : 4.25
Enter number of Years : 1
Future Investment value is : 10425.583799999999
*/