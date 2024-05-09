			
								//Construction Chaining

class Demo
{
	// No argument constructor
	Demo()
	{
		this(10);
		System.out.println("Hello from Demo()");
	}

	//Parameterized constructor
	Demo(int a)
	{
		this("Ramesh");
		System.out.println("Hello from Demo(int a)");
	}

	//Parameterized constructor
	Demo(String a)
	{
		this(10, "Suresh");
		System.out.println("Hello from Demo(String a)");
	}

	//Parameterized constructor
	Demo(int a, String b)
	{
		super();
		System.out.println("Hello from Demo(int a, String b)");
	}

	//Main method
	public static void main(String[] args) 
	{
		Demo a = new Demo();								//Object of Demo class
	}
}

/*
OUTPUT :-
Hello from Demo(int a, String b)
Hello from Demo(String a)
Hello from Demo(int a)
Hello from Demo()
*/