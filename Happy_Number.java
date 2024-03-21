class Happy_Number
{
	public static void main(String [] hn)
	{
		int a=13;
		int sum=0;
		
		ab: while(a>9||sum>9)	// ab: --> named loop/Labeled loop
		{
			if(a==0)
			{
				a=sum;
				sum=0;
			}
					
			ac: while(a>0)		//For splitting the digit 
			{
				int rem=a%10;
				sum=sum+(rem*rem);
				a/=10;
			}
		}
		
		if(sum==1||a==1)
		{
			System.out.println("Given number is Happy Number");
		}
		else
		{
			System.out.println("Given number is not Happy Number");
		}
	}
}

// Named loops or labeleld loops are the specific name given to loop. It can be any kind of loop(do while, while, for).

/*
OUTPUT
CT: success;
RT: success: Given number is not Happy Number
*/