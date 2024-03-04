/*
Q. 3]	Write a java program to perform given task on given number input

	1: Check if the number is odd or even
	2: Check if the number is buzz number or not
	3: Check if the number is positive or not
	4: Check if the number is two dogit or not

*/

class Test_If_Inside_Switch
{
	public static void main(String [] tiis)
	{
		int number=144;
		int keyValue=2;
		
		switch (keyValue)
		{
			case 1 : if(number%2==0)
						{
							System.out.println("Number is even");
						}
						else
						{
							System.out.println("Number is odd");
						}
					break;
			
			case 2 : if(number%7==0 || number%10==7)
						{
							System.out.println("Number is buzz");
						}
						else
						{
							System.out.println("Number is not buzz");
						}
						break;
						
			case 3 : if(number>=0)
						{
							System.out.println("Number is positive");
						}
						else
						{
							System.out.println("Number is negative");
						}
						break;
						
			case 4 : if(number>=10 && number<=99)
						{
							System.out.println("Number is two digit");
						}
						else
						{
							System.out.println("Number is not two digit");
						}
						break;
						
			default : System.out.println("Out of case");
			break;
		}
	}
}

/*
OUTPUT
CT: success;
RT: success: Number is not buzz
*/