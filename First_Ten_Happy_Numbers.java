class First_Ten_Happy_Numbers
{
	public static void main(String [] fthn)
	{
		System.out.println("First Ten Happy Numbers are : ");
		int count=0;
		int a=1;
		int b=a;
		//ab: while(true)
		ab: for(a=1;true;b++)
		{
			a=b;
			// Check it a is happy or not
			
			int sqr=1;
			int sum=0;
			
			ac: while(a>9 || sum>9)
			{
				if(a==0)
				{
					a=sum;
					sum=0;
				}
				
				ad: while(a>0)
				{
				int rem=a%10;
				sqr=rem*rem;
				sum=sum+sqr;
				a/=10;
				}//Loop ad closed
			}//Loop ac closed
			
			if(sum==1 || a==1)
			{
				System.out.println(b);
				count++;
				
				if(count==10)
				{
					break ab;
				}
			}
		}// Loop ab closed
	}
}

/*
OUTPUT
CT: success;
RT: success: First Ten Happy Numbers are :
			 1 
			 10
			 13
			 19
			 23
			 28
			 31
			 32
			 44
			 49
*/