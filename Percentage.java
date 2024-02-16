class Percentage
{
	public static void main(String [] p)
	{
		int physics = 85;
		int chemistry = 72;
		int history = 45;
		int maths = 86;
		int cs = 85;
		
		int sum=physics+chemistry+history+maths+cs;
		double percent=(sum*100)/500;
		
		int percentage=(int)percent;
		
		//boolean check = (percentage%2==0);
		//System.out.println("Percentage is: "+percentage);
		//System.out.println("Percentage is even: "+check);	
		
		//OR
		
		String result=(percentage%2==0)?("The percentage is even"):("The percentage is odd");
		System.out.println(result);
	}
}

/* Output
CT: success;
RT: success: Percentage is: 0
			 Percentage is even: true
*/
 
/* Output
CT: success;
RT: success: The percentage is even
*/