class Perfect_Square
{
	public static void main(String []ps)
	{
		int num=16;
		int result=1;
		
		for(int i=1; result<=num; i++)
		{
			result=i*i;
			
			if(result==num)
			{
				System.out.println("Number is perfect square number");
				break;
			}		
		}
					
		if(result>num)
		{
			System.out.println("Number is not perfect square number");
		}
	}
}

/*
OUTPUT
CT: success;
RT: success: Number is perfect square number
*/