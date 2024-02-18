class Grading_System
{
	public static void main(String [] gs)
	{
		int mOp=95;
		int mOc=75;
		int mOm=95;
		int mOb=78;
		int mOh=56;
		
		int sum=mOp+mOc+mOm+mOb+mOh;
		double percent=(sum*100)/500;
		
		int p=(int)percent;

		System.out.println("Percentage is: "+p);
		
		String grade=(p<=100 && p>=90)?("A"):((p<90 && p>=75)?("B"):(p<75 && p>=55)?("C"):(p<55 && p>=35)?("E"):("F"));
		
		System.out.println("grade is: "+grade);
			
	}
}

/*
OUTPUT:
CT: success;
RT: success: Percentage is: 79
			 grade is: B
*/