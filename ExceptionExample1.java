class ExceptionExample1
{
	public static void main(String[] args) 
	{
		System.out.println("Hello");

		try{
			System.out.println("Outer Try Block");
			System.out.println(10/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Outer Catch Block 1");

			try{
				System.out.println("Inner Try Block");
				System.out.println(10/0);
			}
			catch(NullPointerException npe)
			{
				System.out.println("Inner Catch");
			}
		}
		catch(RuntimeException re)
		{
			System.out.println("Outer Catch Block 2");
		}
	}
}