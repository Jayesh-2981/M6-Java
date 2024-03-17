class Tech_Number
{
	public static void main(String [] tn)
	{
		int num=1256;
		
		// number will be tech number when num=2025,3025 etc.
		
		int copy_num=num;
		int count=0;
		
		// Generating count of digit
		
		while(num>0)
		{
			count++;
			num/=10;
		}
		
		if(count%2==0)
		{
			// Generating Divisor
			
			int div=1;
			
			for(int i=1; i<=count/2; i++)
			{
				div*=10;
			}
			
			int first_Half = copy_num/div;
			int second_Half = copy_num%div;
			
			int sum=first_Half+second_Half;
			int sumSquare=sum*sum;
			
			if(sumSquare==copy_num)
			{
				System.out.println("Number is Tech number");
			}
			else
			{
				System.out.println("Number is not Tech Number");
			}
		}
		else
		{
			System.out.println("Number is no even digit");
		}
	}
}

/* 
OUTPUT
CT: success;
RT: success: Number is not Tech Number
*/