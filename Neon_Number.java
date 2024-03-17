class Neon_Number
{
	public static void main(String [] nn)
	{
		int num=9;
		int sum=0;
		int square=num*num;
		
		while(square>0)
		{
			int digit=square%10;
			sum+=digit;
			square/=10;
		}
		
		if(sum==num)
		{
			System.out.println("Number is neon number");
		}			
		else
		{
			System.out.println("Number is not a neon number");
		}
}
}

/* 
OUTPUT
CT: success;
RT: success: Number is neon number
*/