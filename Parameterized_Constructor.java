class Student
{
	//Parameterized Constructor
	Student(String name, String branch, int yop)
	{
		super();
		this.name = name;
		this.branch = branch;
		this.yop = yop;
	}

	// Non static variables
	String name;
	String branch;
	int yop;

	// user defined method
	void displayStudent()
	{
		System.out.println("Name : "+this.name);
		System.out.println("Branch : "+ this.branch);
		System.out.println("Year of Passing : "+this.yop);
	}
}

class StudentDriver
{
	//main method
	public static void main(String[] args) 
	{
		//creating object
		Student obj = new Student("Jayesh", "Computer Engineering", 2023);

		//calling user defined method
		obj.displayStudent();
	}
}

/*
OUTPUT :-
Name : Jayesh
Branch : Computer Engineering
Year of Passing : 2023
*/