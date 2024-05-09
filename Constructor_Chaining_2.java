class Father
{
	//No argument constructor 1
	Father()
	{
		super();	// Call to object class constructor
		System.out.println("Hello from Father()");
	}
}

class Son extends Father
{
	//No argument constructor 2
	Son()
	{
		super(); 	//Call to parent class construtor(class Father)
		System.out.println("Hello form Son()");
	}
}

class SonDriver
{
	//main method
	public static void main(String[] args) 
	{
		Son obj = new Son();
	}
}

/*
OUTPUT :-
Hello from Father()
Hello form Son()
*/