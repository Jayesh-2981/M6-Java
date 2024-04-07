class Numbers_Patterns_5
{
	public static void main(String [] np5)
	{
		
		for(int i=1; i<=4; i++)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print("  ");
			}
			
			for(char k='a'; k<='d'; k++)
			{
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}