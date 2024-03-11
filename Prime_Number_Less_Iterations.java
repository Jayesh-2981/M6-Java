
// Check prime number using while loop and reduce the iterations

class Prime_Number_Less_Iterations
{
	public static void main(String [] pnli)
	{
		int num=10;
		int count=0;
		int i=2;
		
		while(i<=num/2)
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