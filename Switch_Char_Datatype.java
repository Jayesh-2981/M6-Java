class Switch_Char_Datatype
{
	public static void main(String [] ssd)
	{
		char dayNum='E';
		
		switch(dayNum)
		{			
			case 'A' -> System.out.println("Monday");
			
			case 'B' -> System.out.println("Tuesday");

			case 'C' -> System.out.println("Wednsday");

			case 'D' -> System.out.println("Thursday");

			case 'E' -> System.out.println("Friday");

			case 'F' -> System.out.println("Saturday");

			case 'G' -> System.out.println("Sunday");

			default -> System.out.println("Day Number is not valid");
		}
	}
}

/* 
OUTPUT
CT: success;
RT: success: Friday
*/