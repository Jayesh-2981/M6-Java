class Less_Than
{
	public static void main(String [] lt)
	{
		//1st 
		int age=25;
		int age2=80;
		
		boolean result1=age<age2;
		
		System.out.println("L.H.S. is less than R.H.S. " + result1);
		
		//2nd 
		int price=56;
		int price1=58;
		
		boolean result2=price<price1;
		
		System.out.println("L.H.S. is less than R.H.S. " + result2);
		
		//3rd
		int distance=15;
		int distance1=15;
		
		boolean result3=distance<distance1;
		
		System.out.println("L.H.S. is less than R.H.S. " + result3);
	}
}

/*
CT: success;
RT: success: L.H.S. is less than R.H.S. true
			 L.H.S. is less than R.H.S. true
			 L.H.S. is less than R.H.S. false
*/