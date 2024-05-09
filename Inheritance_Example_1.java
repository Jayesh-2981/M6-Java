class Parent
{
	String str = "Hello From Parent Class";

	void m1()
	{
		System.out.println("Hello from non static method m1() from parent class");
	}

	static void m2()
	{
		System.out.println("Hello from Static method m2() from parent class");
	}
}

class Child extends Parent
{
	String str = "Hello from Child Class";

	void m3()
	{
		System.out.println("Hello from non static method m3() from child class");
		m1();
		System.out.println(str);
		System.out.println(super.str);
	}

	static void m4()
	{
		System.out.println("Hello from static method m4() from child class");
		m2();
	}
}


class Inheritance_Example_1
{
	public static void main(String[] args) 
	{
		Child obj = new Child();

		// System.out.println(obj.str2);	
		obj.m3();
		obj.m4();
		System.out.println();

		// System.out.println(obj.str1);
		obj.m1();
		obj.m2();
	}
}


/*
OUTPUT :-

Hello from Child Class
Hello from non static method m3() from child class
Hello from static method m4() from child class

Hello From Parent Class
Hello from non static method m1() from parent class
Hello from Static method m2() from parent class

*/