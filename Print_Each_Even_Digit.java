/*
	Print Each even digits from number
*/

class Print_Each_Even_Digit
{
	public static void main(String [] peed)
	{
		int a=1234;
		
		do{
			int r=a%10;
			a=a/10;
			if(r%2==0)
			{
				System.out.println(r);
			}
		}while(a>0);
	}
}

/*
OUTPUT
CT: success;
RT: success: 4
			 2
*/