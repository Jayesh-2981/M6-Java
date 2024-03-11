
// Check the given number is prime number or not using do while loop

class Check_Prime_Number_DoWhile_Loop
{
	public static void main(String [] cpndl)
	{
		int num=11;
		int count=0;
		int i=2;
		
		do{
			if(num%i==0)
			{
				count++;
			}
			i++;
		}while(i<num);
		
		if(count==0)
		{
			System.out.println("Given number is a prime number");
		}
		else
		{
			System.out.println("Given number is not a prime number");
		}
		
	}
}

/*
OUTPUT
CT: success;
RT: success:Given number is a prime number
*/