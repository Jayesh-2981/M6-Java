class Switch_Short_Datatype
{
	public static void main(String [] ssd)
	{
		short dayNum=5;
		
		switch(dayNum)
		{			
			case 1 -> System.out.println("Monday");
			
			case 2 -> System.out.println("Tuesday");

			case 3 -> System.out.println("Wednsday");

			case 4 -> System.out.println("Thursday");

			case 5 -> System.out.println("Friday");

			case 6 -> System.out.println("Saturday");

			case 7 -> System.out.println("Sunday");

			default -> System.out.println("Day Number is not valid");
		}
	}
}

/* 
OUTPUT
CT: success;
RT: success: Friday
*/