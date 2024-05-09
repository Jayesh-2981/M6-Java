class Compund_Assignment_Operator
{
	public static void main(String[] args) {
		
		byte a = 1;
		a = a+1;				// CTE : incompatible types: possible lossy conversion from int to byte
		System.out.println(a);	
		byte b = 1;
		b += 1;
		System.out.println(b);	//2
	}
}