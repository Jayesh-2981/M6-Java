
// Check whether the numbers are co-prime or not

class Co_Prime_Number
{
	public static void main(String [] cpn)
	{
		int num1=8;
		int num2=15;
		int count=0;
		
		for(int i=1; i<=num2; i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				count++;
				if(count>1)
				{
					break;
				}
			}
		}
		if(count==1)
		{
			System.out.println("Numbers are Co-Prime");
		}
		else
		{
			System.out.println("Numbers are not Co-Prime");
		}
	}
}

/*
OUTPUT
CT: success;
RT: success: Numbers are Co-Prime
*/