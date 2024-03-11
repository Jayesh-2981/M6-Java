
// Write a program in java to find the ffactorial of given number where number=6 using while loop

class Factrorial_While_Loop
{
	public static void main(String [] fwl)
	{
		int num=6;
		int fact=1;
		int i=1;
		
		while(i<=num)
		{
			fact = fact*i;
			i++;
		}
		
		System.out.println(fact);
	}
}

/*
OUTPUT
CT: success;
RT: success: 720
*/
