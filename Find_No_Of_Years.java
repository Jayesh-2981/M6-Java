/*
	Write a program that prompts the user to enter the minutes(eg.1 billion),
	and displays the number of years and days for minutes, for simplicity, 
	assume a year has 365 days
	Here is a sample run :
	Enter the number of minutes : 1000000000
	1000000000 minutes is approximately 1902 years and 214 days
*/

import java.util.*;
class Find_No_Of_Years
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of minutes : ");
		long minutes = sc.nextLong();

		long years = minutes / (365*24*60);				//(days*hours*minutes)
		long remainingMinutes = minutes % (365*24*60);
		long days = remainingMinutes / (24*60);			//(hours*minutes)

		System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days");
	}
}

/*
OUTPUT :-
Enter number of minutes : 1000000000
1000000000 minutes is approximately 1902 years and 214 days
*/