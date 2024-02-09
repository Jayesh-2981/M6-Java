//This is a example of Unary Operator

class Operator
{
	public static void main(String[] o)
	{
		int a=10, b=20, c=30;
		int operator1 = ++a-a+++b---b+c+a+a+--c+a+--b+--c;
		int operator2 = c+c+c+++c+b---b+a-b+c+--b+c;

		System.out.println("operator1= " + operator1);
		System.out.println("operator2= " + operator2);
	}
}

/*
Output:
CT: success
RT: success:operator1= 142
			operator2= 183
*/
