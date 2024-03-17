// Fibonacci Series

class Fibonacci_Series
{
	public static void main(String [] fs)
	{
		int num1=0;
		int num2=1;
		int result=0;
		
		System.out.println(num1);
		System.out.println(num2);
		
		for(result=0; result<=30; result++)
		{
			result = num1 + num2;
			num1 = num2;
			num2 = result;
			
			System.out.println(result);
		}
	}
}

/*
OUTPUT
CT: success;
RT: success: 0
			 1
			 1
			 2
			 3
			 5
			 8
			 13
			 21
			 34
*/