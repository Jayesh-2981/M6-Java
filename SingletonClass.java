import java.util.*;

class SingletonClass
{
	String name;
	String branch;

	static SingletonClass singletonObject = null;  //It always contains null value it not required to declare null

	private SingletonClass(String name, String branch)
	{
		this.name = name;
		this.branch = branch;
	}

	public static SingletonClass getInstance(String name, String branch)
	{
		if(singletonObject == null)
		{
			singletonObject = new SingletonClass(name,branch);
			return singletonObject;
		}
		else{
			return singletonObject;
		}
	}

	public static void main(String[] args) 
	{
		SingletonClass obj = getInstance("Jayesh","Computer");
		System.out.println(obj.name);

		SingletonClass obj1 = getInstance("Akshay","Computer");
		System.out.println(obj.name);
	}
}

/*
OUTPUT :-
Jayesh 
Jayesh
*/