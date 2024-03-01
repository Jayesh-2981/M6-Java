class Else_If_DaysOfWeek
{
	public static void main(String [] dow)
	{
		int dayNum = 7;
		
		if (dayNum==1)
		{
			System.out.println("Monday");
		}
		else if(dayNum==2)
		{
			System.out.println("Tuesday");
		}
		else if(dayNum==3)
		{
			System.out.println("Wednsday");
		}
		else if(dayNum==4)
		{
			System.out.println("Thursday");
		}
		else if(dayNum==5){
			
			System.out.println("Friday");
		}
		else if(dayNum==6)
		{
			System.out.println("Saturday");
		}
		else if(dayNum==7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Not valid number");
		}
	}
}

/*
OUTPUT:
CT: success;
RT: success: Sunday
*/