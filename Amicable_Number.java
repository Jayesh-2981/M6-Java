class Amicable_Number
{
	public static void main(String [] an)
	{
		int num1=143;
		int num2=106;
		int sum1=0;
		int sum2=0;
		
		for(int i=1; i<num1;i++)
		{
			if(num1%i==0)
			{
				sum1=sum1+i;
			}
		}
		
		for(int i=1; i<num2; i++)
		{
			if(num2%i==0)
			{
				sum2=sum2+i;
			}
		}
		
		if((num1==sum2) && (num2==sum1))
		{
			System.out.println("Given numbers are Amicible Numbers");
		}
		else
		{
			System.out.println("Given numbers are not Amicable Numbers");
		}
		
		
	}
}

/*
OUTPUT
CT: success;
RT: success: Given numbers are not Amicable Number
*/