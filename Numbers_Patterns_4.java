class Numbers_Patterns_4
{
	public static void main(String [] np4)
	{                         
		int a=2;
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=4; j++)
			{
				//prime logic
				int c=0;
				for(int k=2;k<=a/2;k++)
				{
					if(a%k==0)
					{
						c++;
						break;
					}
				}
			    if (c==0)
				{
					System.out.print(a+" ");	
				}
				else
				{
					j=j-1;	
				}
				a++;
			}
			System.out.println();					
		}
	}
		
}
