/* 
Q. 4]	Write a program to swap two numbers 
		1) Using 3rd variable
		2) Without using 3rd variable
		
		Numbers are
		int a=14;
		int b=47;

*/

// 1)	Using 3rd variable:

class Test_Swap_Numbers
{
	public static void main(String [] tsn)
	{
		int a=14;
		int b=47;
		int c=0;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("a= "+a);
		System.out.println("b= "+b);
		
		/*
		OUTPUT
		CT: success;
		RT: success: a= 47
					 b= 14
		*/
		
// 2) Without using 3rd variable:

		int d=14;
		int e=47;
		
		d=d+e;
		e=d-e;
		d=d-e;
		
		System.out.println("d= "+d);
		System.out.println("e= "+e);
		
		/*
		OUTPUT
		CT: success;
		RT: success: d= 47
					 e= 14
		*/
	}
}