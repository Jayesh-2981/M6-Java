class Recurssion_Factors
{
	static int num=8;
	static int i=1;
	public static void main(String[] args) 
	{
		factors();
	}

	public static void factors()
	{
		if(num%i==0)
		{
			System.out.print(i+" ");
		}

		i++;

		if(i>num)
			return;

		factors();

	}
}

/*
	OUTPUT
CT: success;
RT: success:1 2 4 8
*/