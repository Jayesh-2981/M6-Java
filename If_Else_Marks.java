/*
create a variable of marks 
if Marks is greater than 90 then he should be allowed to get in exam(Scholership)
if ExamMarks(Scholership) is greater than 80 he will get 20% of on his admission fees
*/

class If_Else_Marks
{
	public static void main(String [] iem)
	{
		int marks= 98;
		int marks_Scholership=90;
		if(marks>90)
		{
			if(marks_Scholership>80)
			{
				System.out.println("Student will get 20% off on his admission fees");
			}
			else
			{
				System.out.println("No discount");
			}
		}
		else
		{
			System.out.println("Marks is low");
		}
	}
}

/* 
OUTPUT
CT: success;
RT: success: Student will get 20% off on his admission fees
*/