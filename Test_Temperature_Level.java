/*
Q. 1]	Write a program in java to take temperature input and display suitable message according to range of temperature
		if temperature is
		
			0-15	----------	Very cold
			15-25	----------	Cold
			25-30	----------	Medium
			30-40	----------	Very hot
			40-50	----------	Extreme
	
*/

class Test_Temperature_Level
{
	public static void main(String [] ttl)
	{
		int temperature=35;
		
		if(temperature>=0 && temperature<=15)
		{
			System.out.println("Very cold");
		}
		
		else if(temperature>15 && temperature<=25)
		{
			System.out.println("Cold");
		}
		
		else if(temperature>25 && temperature<=30)
		{
			System.out.println("Medium");
		}
		
		else if(temperature>30 && temperature<=40)
		{
			System.out.println("Very hot");
		}
		
		else if(temperature>40 && temperature<=50)
		{
			System.out.println("Extreme");
		}
		
		else
		{
			System.out.println("Out of range");
		}
		
	}
}

/*
OUTPUT:
CT: success;
RT: success: Very hot
*/