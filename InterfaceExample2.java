interface Parent1
{
	void m1();
}

interface Parent2
{
	void m2();
}

interface Child extends Parent1,Parent2
{
	void m3();
}

class Subchild implements Child
{
	public void m1()
	{
		System.out.println("Hello from m1() of Interface Parent 1");
	}

	public void m2()
	{
		System.out.println("Hello from m2() of Interface Parent 2");
	}

	public void m3()
	{
		System.out.println("Hello from m3() of Interface Child");
	}
}

class InterfaceExample2
{
	public static void main (String [] args)
	{
		Subchild obj= new Subchild();
		obj.m1();
		obj.m2();
		obj.m3();
}
	
}