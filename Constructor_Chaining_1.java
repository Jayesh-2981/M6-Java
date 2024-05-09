class Demo
{
	//No argument constructor
	Demo()
	{
		System.out.println("No argument constructor");
	}

	//Parameterized Constructor 1
	Demo(int a)
	{
		this();
		System.out.println("one argument constructor");
	}

	//Parameterized Constructor 2
	Demo(int a, int b)
	{
		this(10);
		System.out.println("Two argument constructor");
	}
}

class DemoDriver
{
	//main method
	public static void main(String[] args) 
	{
		//object of demo class
		Demo d = new Demo(10,20);
	}
}

/*
OUTPUT :-
No argument constructor
one argument constructor
Two argument constructor
*/