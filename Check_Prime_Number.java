
// Check the given number is prime number or not using while loop

class Check_Prime_Number
{
	public static void main(String [] cpn)
	{
		int num=4;
		int i=2;
		int count=0;
		
		while(i<num)
		{
			if(num%i==0)
			{
				count++;
			}
			i++;
		}
		
		if(count==0)
		{
			System.out.println("Prime number");
		}
		else
		{
			System.out.println("Not prime number");
		}
	}
}

/*
OUTPUT
CT: success;
RT: success: Not prime number
*/