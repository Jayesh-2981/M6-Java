/*
	Print count of even and odd digits in number
*/

class Print_EvenOdd_Count_OfDigit
{
	public static void main(String [] peocod)
	{
		int a=2799;
		int even=0;
		int odd=0;
		
		do{
			int r=a%10;
			if(r%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			a=a/10;
		}while(a>0);
		
		System.out.println("Odd Count = "+odd+" Even Count = "+even);
	}
}

/*
OUTPUT
CT: success;
RT: success: Odd Count = 3 Even Count = 1
*/