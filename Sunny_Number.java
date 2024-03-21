class Sunny_Number
{
	public static void main(String [] sn)
	{
		int num=15;
		int result=1;
		
		for(int i=1; result<=num+1; i++)
		{
			result=i*i;
			
			if(result==num+1)
			{
				System.out.println("Given number is a Sunny Number");
				break;
			}
		}
		
		if(result>num+1)
		{
			System.out.println("Given number is not a Sunny Number");
		}
	}
}

/* 
OUTPUT
CT: success;
RT: success: Given number is a Sunny Number
*/