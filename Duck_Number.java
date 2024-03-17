class Duck_Number
{
	public static void main(String [] dn)
	{
		int n=1102;
		
		while(n>0)
		{
			int rem=n%10;
			if(rem==0)
			{
				System.out.println("Number is Duck Number");
				break;
			}
			n/=10;
			
			if(n==0)
			{
				System.out.println("Number is not a Duck Number");
			}
		}
	}
}
/*
OUTPUT
CT: success;
RT: success: Number is Duck Number
*/