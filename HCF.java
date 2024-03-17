class HCF
{
	public static void main(String [] hcf)
	{
		int num1=25;
		int num2=50;
		int gcd=0;
		int smallest=(num1<num2)?(num1):(num2);
		
					//1st way; Number Of Iterations=16
		
		for(int i=1; i<=smallest; i++)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
			}
		}
		
		System.out.println("HCF of given numbers is : "+gcd);
		
		
					// 2nd way; Number of iterations =8
					
		for(int i=smallest; smallest>0; i--)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
				break;
			}
		}
		
		System.out.println("HCF of given numbers is : "+gcd);
		
		
					// 3rd way; Number of iterations=2
		
		for(int i=smallest; smallest>0; i/=2)
		{
			if(num1%i==0 && num2%i==0)
			{
				gcd=i;
				break;
			}
		}
		
		System.out.println("HCF of given numbers is : "+gcd);
		
	}
}

/* 
OUTPUT
CT: success;
RT: success: HCF of given numbers is : 25
*/