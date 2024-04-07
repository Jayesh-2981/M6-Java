class Recurssion_Fibonacci_Series
{
	static int first=0;
	static int second=1;
	static int result=0;
	static int i=3;
	public static void main(String[] args) 
	{
		System.out.print(first+" ");
		System.out.print(second+" ");
		fibonacci_Series();
	}

	public static void fibonacci_Series()
	{
		result=first+second;
		System.out.print(result+" ");
		first=second;
		second=result;

		i++;
		if(i>10)
			return;

		fibonacci_Series();

	}
}

/*
OUTPUT
CT: success;
RT: success:0 1 1 2 3 5 8 13 21 34
*/