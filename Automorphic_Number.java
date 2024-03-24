class Automorphic_Number
{
	public static void main(String [] an)
	{
		int a=25;
		int b=a*a;
		
		while(a>0)
		{
			int rem1=a%10;
			int rem2=b%10;
			
			if(rem1==rem2)
			{
				
			}
			else
			{
				System.out.println("a is not Automorphic Number");
			}
			
			a/=10;
			b/=10;
		}
		
		if(a==0)
		{
			System.out.println("a is Automorphic Number");
		}
	}
}

/*
OUTPUT
CT: success;
RT: success: a is Automorphic Number
*/