class Method_Calling
{
	public static void main(String[] args) {
		System.out.println("main() starts");
		myMethod();
		System.out.println("main() ends");
	}

	public static void addition()
	{
		System.out.println("addition() starts");
		int num1=10;
		int num2=20;
		int sum=num1+num2;
		System.out.println(sum);
		System.out.println("addition() ends");
	}

	public static void myMethod()
	{
		System.out.println("myMethod() starts");
		addition();
		System.out.println("myMethod() ends");
	}
}

/* 
OUTPUT:
CT: success;
RT: success:main() starts
			myMethod() starts
			addition() starts
			30
			addition() ends
			myMethod() ends
			main() ends

*/