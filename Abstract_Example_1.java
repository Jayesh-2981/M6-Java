abstract class RBI
{
	RBI()
	{
		super();
	}

	abstract void rateOfInterest();
	abstract void withdrawLimit();
	abstract void depositeLimit();
}

abstract class SBI extends RBI
{
	String userName;
	String accountType;

	SBI(String userName, String accountType)
	{
		super();
		this.userName = userName;
		this.accountType = accountType;
	}

	public void displayDetails()
	{
		System.out.println();
		System.out.println();
		System.out.println("Account Holder Name : "+this.userName);
		System.out.println("Account Type : "+this.accountType);
	}
}

class Savings extends SBI
{
	Savings(String userName, String accountType)
	{
		super(userName,accountType);
	}

	void rateOfInterest()
	{
		System.out.println();
		System.out.println("Rate of Interest : "+ 8.5 + "%");
	}

	void withdrawLimit()
	{
		System.out.println("Withdraw Limit : " + 50000 + " rs.");
	}

	void depositeLimit()
	{
		System.out.println("Deposite Limit : "+ 100000 + " rs.");
	}
}

class Current extends SBI
{
	Current(String userName, String accountType)
	{
		super(userName,accountType);
	}

	void rateOfInterest()
	{
		System.out.println();
		System.out.println("Rate of Interest : "+ 7.5 + "%");
	}

	void withdrawLimit()
	{
		System.out.println("Withdraw Limit : " + 500000 + " rs.");
	}

	void depositeLimit()
	{
		System.out.println("Deposite Limit : "+ 1000000 + " rs.");
	}
}

class Abstract_Example_1
{
	public static void main(String[] args) 
	{
		Savings obj1 = new Savings("Ramesh","Saving");
		obj1.displayDetails();
		obj1.rateOfInterest();
		obj1.withdrawLimit();
		obj1.depositeLimit();

		Current obj2 = new Current("Suresh","Current");
		obj2.displayDetails();
		obj2.rateOfInterest();
		obj2.withdrawLimit();
		obj2.depositeLimit();
	}
}