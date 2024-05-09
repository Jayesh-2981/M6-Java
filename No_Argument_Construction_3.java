//No argument constructor can have either this() or super() but not both at the same time

class Example
{
	//No argument construction
	Example()
	{
		this(10);
		super();
		System.out.println("Hello from No argument construction");
	}

	//Parametarized construction
	Example(int a)
	{
		System.out.println("1 argument construction");
	}

	//main method
	public static void main(String[] args) 
	{
		Example obj = new Example();	
	}
}

/*
OUTPUT :-
 error: call to super must be first statement in constructor
                super();
*/

// If we comment one of this() or super() then output will be

/*
OUTPUT :-
Hello from No argument construction
*/