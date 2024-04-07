class Recurssion_Even_1_To_100
{
	static int num=1;
	public static void main(String[] args) 
	{
		Even_1_100();
	}

	public static void Even_1_100()
	{
		if(num%2==0)
		{
			System.out.print(num+" ");
		}
		num++;

		if(num>100)
			return;

		Even_1_100();
	}
}

/*
OUTPUT
CT: success;
RT: success: 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60 62 64 66 68 70 72 74 76 78 80 82 84 86 88 90 92 94 96 98 100
*/