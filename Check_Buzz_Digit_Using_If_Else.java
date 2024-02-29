class Check_Buzz_Digit_Using_If_Else
{
	public static void main (String [] cbd)
	{
		int n=45;
		if(n>9&&n<100)
		{
			System.out.println("Number can check for Buzz Number");
			if(n%7==0||n%10==7)
			{
				System.out.println("Number is buzz");
			}
			else
			{
				System.out.println("Number is not buzz");
			}
		}
		else
		{
			System.out.println("Cannot check for Buzz number");
		}
	}
}

/*
OUTPUT
CT: success;
RT: success: Number can check for Buzz Number
			 Number is not buzz
*/