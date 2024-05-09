class Demo
{
	//Creating global variable
	String str = "Hello I am Global Variable";

	//Creating method m1
	void m1()
	{
		System.out.println("Hello I am m1()");
	}

	//Creating method for addition
	void add(int num1, int num2)
	{
		System.out.println("Addition is : " + (num1+num2));
	}

	//Creating static method m2
	static void m2()
	{
		System.out.println("Hello I am m2()");
	}

	//Creating method for execution controll
	void exeControll()
	{
		String str = "Hello I am Local Variable";	//creating local variable
		this.add(10,20);							//calling addition method
		this.m2();	//m2();							//calling m2 method
		m1();										//calling m1 method
		System.out.println(str);					//calling local variable
		System.out.println(this.str);				//calling Gloabal variable
	}

	//Calling main method
	public static void main(String[] args) 
	{
		Demo a = new Demo();						//creating object of Demo class
		a.exeControll();							//calling execution control method
	}
}

/*
OUTPUT :- 
Addition is : 30
Hello I am m2()
Hello I am m1()
Hello I am Local Variable
Hello I am Global Variable
*/