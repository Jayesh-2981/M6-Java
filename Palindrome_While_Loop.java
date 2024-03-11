
// Write a program to reverse the given number and check its palindrome or not using while loop

class Palindrome_While_Loop
{
	public static void main(String [] pwl)
	{
		int num=121;
		int reverse=0;
		int n=num;
		
		while(num>0)
		{
			int rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		
		if(n==reverse)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}

/* 
OUTPUT:
CT: success;
RT: success: Palindrome
*/