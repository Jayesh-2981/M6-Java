public class Multiple_Classes
{
	public static void main(String[] args) 
	{
		System.out.println("Hello from main()");
		method1();
		Demo1.method2();
		Demo2.method3();
	}

	public static void method1()
	{
		System.out.println("Hello from method1()");
	}
}

class Demo1
{
	public static void method2()
	{
		System.out.println("Hello from method2()");
	}
}

class Demo2
{
	public static void method3()
	{
		System.out.println("Hello form method3()");
	}
}

/*
OUTPUT
CT: success;
RT: success: Hello from main()
			 Hello from method1()
			 Hello from method2()
			 Hello form method3()

*/