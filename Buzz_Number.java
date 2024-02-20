class Buzz_Number
{
	public static void main(String [] bn)
	{
		int n=47;
		String result=(n%7==0 || n%10==7)?("Number is buzz"):("Number is not buzz number");
		System.out.println(result);
		
		/*
		OUTPUT:
		CT: success;
		RT: success: Number is buzz
		*/
	}
}