class Decimal_To_Binary
{
	public static void main(String [] dtb)
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
		
		System.out.println("Binary Number of 12 is : "+binary);
	}
}

/* 
OUTPUT
CT: success;
RT: success: Binary Number of 12 is : 1100
*/