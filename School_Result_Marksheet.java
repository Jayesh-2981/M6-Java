class School_Result_Marksheet
{
	public static void main(String [] srm)
	{
		
		int phy = 94;
		int chem = 95;
		int bio = 85;
		int maths = 90;
		int cs = 84;
		
		int total_obtained_marks= phy+chem+bio+maths+cs;
		
		int physics = 100;
		int chemistry = 100;
		int biology = 100;
		int mathematics = 100;
		int computer_science = 100;
		
		int total_full_marks = physics+chemistry+biology+mathematics+computer_science;
		
		double p = (total_obtained_marks*100)/total_full_marks;
		
		String grade = (p<=100 && p>=85)?("A"):((p<85 && p>=60)?("B"):(p<60 && p>=35)?("C"):("F"));
		String remark = (grade=="A")?("Excellent"):((grade=="B")?("Very good"):(grade=="C")?("Good"):("Better Luck Next Time"));
		
		System.out.println();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("                    Navbharat Highschool Bharne                  ");
		System.out.println();
		System.out.println("                              SSC Board                    ");
		System.out.println("----------------------------------------------------------------------");
		System.out.println();
		System.out.println("Name: Jayesh Jadhav"+"                              "+"Date: 21/02/2024");
		System.out.println();
		System.out.println("Roll NO: B022933"+"               "+"SEC: A"+"            "+"Exam: Final");
		System.out.println();
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Subject"+"                 "+"Full Marks"+"              "+"Obtained Marks");
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Physics"+"                    "+physics+"                       "+phy);
		System.out.println("Chemistry"+"                  "+chemistry+"                       "+chem);
		System.out.println("Biology"+"                    "+biology+"                       "+bio);
		System.out.println("Mathematics"+"                "+mathematics+"                       "+maths);
		System.out.println("Computer Science"+"           "+computer_science+"                       "+cs);
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Total"+"                      "+total_full_marks+"                      "+total_obtained_marks);
		System.out.println("----------------------------------------------------------------------");
		System.out.println();
		System.out.println("Percentage: " +p +"                                  " +"Grade: " +grade);
		System.out.println();
		System.out.println("Remark: "+remark +"                                 "+"Signature: Jayesh");
		System.out.println("----------------------------------------------------------------------");
	}
}

/*
OUTPUT:
CT: success;
RT: success: 
----------------------------------------------------------------------
                    Navbharat Highschool Bharne

                              SSC Board
----------------------------------------------------------------------

Name: Jayesh Jadhav                              Date: 21/02/2024

Roll NO: B022933               SEC: A            Exam: Final

----------------------------------------------------------------------
Subject                 Full Marks              Obtained Marks
----------------------------------------------------------------------
Physics                    100                       94
Chemistry                  100                       95
Biology                    100                       85
Mathematics                100                       90
Computer Science           100                       84
----------------------------------------------------------------------
Total                      500                      448
----------------------------------------------------------------------

Percentage: 89.0                                  Grade: A

Remark: Excellent                                 Signature: Jayesh
----------------------------------------------------------------------
*/