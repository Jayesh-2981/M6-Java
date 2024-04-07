class Recurssion_First_10_Numbers
{
	static int num=1;
	public static void main(String[] args) 
	{
		first_10_Numbers();
	}

	public static void first_10_Numbers()
	{
		System.out.println(num);
		num++;
		if(num>10)
			return;
		first_10_Numbers();
	}
}

/* 
	OUTPUT
CT: success;
RT: success: 1
			 2
			 3
			 4
			 5
		 	 6
			 7
			 8
			 9
			 10
*/