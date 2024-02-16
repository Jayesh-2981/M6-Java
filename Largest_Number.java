class Largest_Number
{
	public static void main(String [] ln)
	{
		int a=10, b=20, c=30;
		int result = (a>b) ? ((a>c)?(a):(c)) : ((b>c)?(b):(c));
		System.out.println("Largest number between three variables is: " + result);
	}
}

/*
OUTPUT:
CT: success;
RT: success: Largest number between three variables is: 30
*/