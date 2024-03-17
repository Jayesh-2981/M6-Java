class Armstrong_Number
{
	public static void main(String [] an)
	{
		int number=125;
		int num=number;
		int n=number;
		int digit=0;
		int sum=0;
		
		while(num>0)
		{
			digit++;
			num/=10;
		}
		
		while(n>0)
		{
			int rem=n%10;
			int power=1;
			
			for (int i=1; i<=digit; i++)
			{
				power=power*rem;
			}
			sum=sum+power;
			n/=10;
		}
		
		if(number==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not Armstrong Number");
		}
	}
}

/*
OUTPUT
CT: success;
RT: success: Not Armstrong Number
*/