class Nesting_Ternary_Operators
{
	public static void main(String [] nto)
	{
		int a=10, b=20, c=30, e=40;
		int reault = (a > b) ? ((a > c) ? ((a > e) ? a : e) : ((c > e) ? c : e)) : ((b > c) ? ((b > e) ? b : e) : ((c > e) ? c : e));
		System.out.println("Largest Number between four variables is: " + reault);	
	}
}

/*
OUTPUT:
CT: success;
RT: success: Largest Number between four variables is: 40
*/