interface Arithmetic
{
	int add(int a, int b);
	int multi(int a , int b );
}

class Demo implements Arithmetic
{
	public int add(int num1, int num2)
	{
		return (num1+num2);
	}

	public int multi(int c, int d)
	{
		return (c*d);
	}
}

class InterfaceExample1
{
	public static void main(String[] args) 
	{
		Demo obj = new Demo();
		System.out.println(obj.add(10,20));
		System.out.println(obj.multi(10,20));
	}
}