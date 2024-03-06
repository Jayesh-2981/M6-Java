/*
	print each digit of a number using do while loop
*/

class Print_Each_Digit
{
	public static void main(String [] ped)
	{
		int a=1234;
		
		do
		{
			int r=a%10;
			a=a/10;
			System.out.println(r);
		}while(a>0);
	}
}

/*
OUTPUT
CT: success;
RT: success: 4
			 3
			 2
			 1
*/