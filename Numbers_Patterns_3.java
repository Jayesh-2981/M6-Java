class Numbers_Patterns_3
{
	public static void main(String [] np3)
	{
		for(int i=1; i<=6; i++)
		{
			for(int j=1; j<=i; j++)
			{
				if(i==j || j==1 || i==6)
				{
					System.out.print(1);
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}