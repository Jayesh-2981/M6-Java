// No argument constructor can have any access modifirers such as public, private, protected and default

class Ramesh
{
	//Default construction 
	Ramesh()
	{
		System.out.println("Hello from default construction");
	}

	//Private construction
	private Ramesh(int a)
	{
		System.out.println("Hello from private construction");
		System.out.println(a);
	}

	// protected construction
	protected Ramesh(int a, int b)
	{
		System.out.println("Hello form protected construction");
		System.out.println(a);
		System.out.println(b);
	}

	// public construction
	public Ramesh(int a, int b, int c)
	{
		System.out.println("Hello from public construction");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	// Main Method
	public static void main(String[] args) 
	{
		Ramesh obj1 = new Ramesh();	
		Ramesh obj2 = new Ramesh(10);
		Ramesh obj3 = new Ramesh(10,20);
		Ramesh obj4 = new Ramesh(10,20,30);
	}
}

/*
OUTPUT :-
Hello from default construction
Hello from private construction
10
Hello form protected construction
10
20
Hello from public construction
10
20
30
*/