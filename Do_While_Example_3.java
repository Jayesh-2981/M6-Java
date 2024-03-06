class Do_While_Example_3
{
	public static void main(String[] dwe)
	{
		int v=1;
		
		do
		{
			int a=3*v;
			if(a%2==0){
				System.out.println(a);
			}
			v++;
		}while(v<=10);
	}
}
/*
OUTPUT
CT: success;
RT: success:6
			12
			18
			24
			30
*/