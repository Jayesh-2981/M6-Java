class Else_If_Example
{
	public static void main(String [] eie)
	{
		int marks = 75;
		
		if(marks>=90 && marks<=100)
		{
			System.out.println("A+");
		}
		
		else if(marks>=80 && marks<90)
		{
			System.out.println("A");
		}
		
		else if(marks>=70 && marks<80)
		{
			System.out.println("B+");
		}
		
		else if(marks>=60 && marks<70)
		{
			System.out.println("B");
		}
		
		else if(marks>=50 && marks<60)
		{
			System.out.println("C+");
		}
		
		else if(marks>=40 && marks<50)
		{
			System.out.println("C");
		}
		
		else if(marks>=35 && marks<40)
		{
			System.out.println("E");
		}
		
		else
		{
			System.out.println("F");
		}
	}
}

/* 
OUTPUT
CT: success;
RT: success: B+
*/