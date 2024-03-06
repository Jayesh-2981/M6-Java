/*	Assignment 

	Reverse the digits of the given number
	a=467
	OUTPUT: 764
*/

class Reverse_Digits
{
	public static void main(String [] rd)
	{
		int a=467;
		int b=0;
		
		do
		{
			int r=a%10;
			a=a/10;
			b=b*10+r;	
		}while(a>0);
		
		System.out.println(b);
	}
}

/*
OUTPUT
CT: success;
RT: success: 764
*/