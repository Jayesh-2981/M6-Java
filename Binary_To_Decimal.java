class Binary_To_Decimal
{
	public static void main(String [] btd)
	{
		int num=1100;
		int n=num;
		int power=1;
		int sum=0;
		
		while(num>0)
		{
			int rem=num%10;
			int c=rem*power;
			sum=sum+c;
			num/=10;
			power=power*2;
		}
		System.out.println("Decimal Conversion of "+n+" is : "+sum);
	}
}

/*
OUTPUT
CT: success;
RT: success: Decimal Conversion of 1100 is : 12
*/ 