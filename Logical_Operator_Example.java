class Logical_Operator_Example
{
	public static void main(String []loe)
	{
		System.out.println(true&&true||true&&true||true&&false);
		System.out.println(false&&false||true&&true||false&&false);
		System.out.println(true&&false||true&&false||true&&true);
		System.out.println(false&&false||false&&false||true&&false);
	}
}

/*
Output:
CT: success;
RT: success : true
			  true
			  true
			  false
*/