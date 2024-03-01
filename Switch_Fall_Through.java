class Switch_Fall_Through
{
	public static void main(String [] sft)
	{
		int dayNum=3;
		
		switch(dayNum)
		{
			case 1 : System.out.println("Monday");
			case 2 : System.out.println("Tuesday");
			case 3 : System.out.println("Wednesday");
			case 4 : System.out.println("Thursday");
			case 5 : System.out.println("Friday");
			case 6 : System.out.println("Saturday");
			case 7 : System.out.println("Sunday");
			default : System.out.println("Invalid Number");
		}
	}
}

/*
OUTPUT
CT: success;
RT: success: Wednesday
			 Thursday
			 Friday
			 Saturday
			 Sunday
			 Invalid Number
*/