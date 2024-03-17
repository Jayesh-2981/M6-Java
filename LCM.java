class LCM
{
	public static void main(String [] lcm)
	{
		int num1=2;
		int num2=25;
		int i=1;
		int largest=(num1>num2)?(num1):(num2);
		int l=largest;
		while(true)
		{
			if(largest%num1==0 && largest%num2==0)
			{
				System.out.println("LCM : " + largest);
				break;
			}
				//We can use This
			largest=l*i;
			i++;
			
				//OR we can use this
				
			//largest++;
		}
	}
}

/*
OUTPUT
CT: success;
RT: success: LCM : 50
*/