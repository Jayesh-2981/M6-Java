class Lychrel_Number
{
	public static void main(String [] ln)
	{
		int num=39;
		int n=num;
		int rev=0;
		
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		
		int sum=n+rev;
		int s=sum;
		int sumRev=0;
		while(sum>0)
		{
			int rem=sum%10;
			sumRev=sumRev*10+rem;
			sum/=10;
		}
		
		if(s==sumRev)
		{
			System.out.println(n+" is not a Lychrel Number");
		}
		else
		{
			System.out.println(n+" is a Lychrel Number");
		}
	}
}

/*
OUTPUT
CT: success;
RT: success: 39 is a Lychrel Number
*/