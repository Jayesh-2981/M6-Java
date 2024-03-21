class Evil_Number
{
	public static void main(String [] en)
	{
		int num=12;
		int i=1;
		int binary=0;
		int count=0;
		
		while(num>0)
		{
			int rem=num%2;
			binary = binary+(rem*i);
			num=num/2;
			i=i*10;
		}
		
		while(binary>0)
		{
			if(binary%10==1)
			{
				count++;
			}
			binary=binary/10;
		}
		
		if(count%2==0)
		{
			System.out.println("Given number is Evil Number");
		}
		else
		{
			System.out.println("Given number is not Evil Number");
		}
	}
}

/*
OUTPUT
CT: success;
RT: success: Given Number is Evil Number
*/