class Recurssion_Check_Prime
{
	static int num=7;
	static int i=2;
	static boolean flag=true;
	public static void main(String[] args) 
	{
		prime();
		System.out.println(flag?("Prime"):("Not Prime"));
	}

	public static void prime()
	{
		if(num%i==0)
		{
			flag=false;
		}

		i++;
		if(i==num)
			return;
		prime();
	}
}

/*
	OUTPUT
CT: success;
RT: success:Prime
*/