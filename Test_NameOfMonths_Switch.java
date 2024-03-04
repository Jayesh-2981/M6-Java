/*
Q. 2]	Write a java program to print the name of months based on number of months
		and also check if that month number is even or not?
		
*/

class Test_NameOfMonths_Switch
{
	public static void main(String [] tnoms)
	{
		int monthNumber=5;
		
		switch(monthNumber)
		{
			case 1 -> System.out.println("January");
			
			case 2 -> System.out.println("February");
			
			case 3 -> System.out.println("March");
			
			case 4 -> System.out.println("April");
			
			case 5 -> System.out.println("May");
			
			case 6 -> System.out.println("June");
			
			case 7 -> System.out.println("July");
			
			case 8 -> System.out.println("August");
			
			case 9 -> System.out.println("September");
			
			case 10 -> System.out.println("October");
			
			case 11 -> System.out.println("November");
			
			case 12 -> System.out.println("December");
			
			default -> System.out.println("Invalid Month Number");
		}
		
		if(monthNumber%2==0)
		{
			System.out.println("Month number is even");
		}
		else
		{
			System.out.println("Month number is odd");
		}
	}
}

/*
OUTPUT:
CT: success;
RT: success: May
			 Month number is odd
*/