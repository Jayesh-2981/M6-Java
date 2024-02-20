/* Declare a float/double variable as a temperature.
	Check as per the given criteria, what will be the suitable message to display
	criteria
	temperature --> 0 - 10 --> Very cold
					10 - 20 --> Cold
					20 - 30 --> Moderate
					30 - 40 --> Summer
					40 - 50 --> Very hot
*/

class Check_Temperature
{
	public static void main(String [] ct)
	{
		float temp=32.54f;
		String result=(temp>=0&&temp<=10)?("Very cold"):((temp>=10&&temp<20)?("Cold"):(temp>=20&&temp<30)?("Moderate"):(temp>=30&&temp<40)?("Summer"):(temp>=40&&temp<=50)?("Very hot"):("Extremely hot"));
		System.out.println(result);
		
		/* 
		OUTPUT:
		CT: success;
		RT: success: Summer
		*/	
		
		double temp1=25.72;
		String result1=(temp1>=0&&temp1<=10)?("Very cold"):((temp1>=10&&temp1<20)?("Cold"):(temp1>=20&&temp1<30)?("Moderate"):(temp1>=30&&temp1<40)?("Summer"):(temp1>=40&&temp1<=50)?("Very hot"):("Extremely hot"));
		System.out.println(result1);
		
		/* 
		OUTPUT:
		CT: success;
		RT: success: Moderate
		*/	
	}
}

