class Blood_Donation
{
	public static void main(String [] bd)
	{
		char bloodType='O';
		int himoglobin=13;
		int age=25;
		char disease='N';
		char drugaddict='N';
		
		if(age>=20 && age<=60)
		{
			if(himoglobin>=13)
			{
				if(disease=='N')
				{
					if(drugaddict=='N')
					{
						System.out.println("You can donate blood");
					}
					else
					{
						System.out.println("Not allowed to donate blood");
					}
				}
				else
				{
					System.out.println("Not allowed to donate blood");
				}
			}
			else
			{
				System.out.println("Not allowed to donate blood");
			}
		}
		else
		{
			System.out.println("Not allowed to donate blood");
		}
	}
}

/*
OUTPUT
CT: success;
RT: success: You can donate blood
*/