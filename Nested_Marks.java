/* 
Create a varriable pf marks 
If marks are greater than 90 than he should be allowed to get in exam(Scholership)
If exam marks (Scholership) is greater than 80 he will get 20% off on his admission fees.
*/

class Nested_Marks
{
	public static void main(String [] nm)
	{
		int marks=85;
		int marks_Scholership=90;
		
		if(marks>90)
		{
			if(marks_Scholership>80)
			{
				System.out.println("Congratulations you get 20% off on your admission fees");
			}
			else
			{
				System.out.println("Sorry no Discount");
			}
		}
		else
		{
			System.out.println("Your marks are low");
		}
	}
}

/* 
OUTPUT
CT: success;
RT: success: Your marks are low
*/