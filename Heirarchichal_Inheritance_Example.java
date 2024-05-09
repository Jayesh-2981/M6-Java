class PhoneOperatingSystem
{
	String type;

	PhoneOperatingSystem(String type)
	{
		super();
		this.type = type;
	}

	void displayPhoneOperatingSystem()
	{
		System.out.println();
		System.out.println("******* PHONE OPERATING SYSTEM *******");
		System.out.println();
		System.out.println("Operating System : "+this.type);
		System.out.println();
	}
}


class Samsung extends PhoneOperatingSystem
{
	String sName;
	String sSeries;
	double sPrice;

	Samsung(String type,String sName, String sSeries, double sPrice)
	{
		super(type);
		this.sName = sName;
		this.sSeries = sSeries;
		this.sPrice = sPrice;
	}

	void displaySamsung()
	{
		System.out.println();
		System.out.println("******* SAMSUNG *******");
		System.out.println();
		System.out.println("Type : "+this.type);
		System.out.println("Name : "+this.sName);
		System.out.println("series : "+this.sSeries);
		System.out.println("price : "+this.sPrice);
		System.out.println();
	}
}


class OnePlus extends PhoneOperatingSystem
{
	String opName;
	String opSeries;
	double opPrice;

	OnePlus(String type, String opName, String opSeries, double opPrice)
	{
		super(type);
		this.opName = opName;
		this.opSeries = opSeries;
		this.opPrice = opPrice;
	}

	void displayOnePlus()
	{
		System.out.println();
		System.out.println("******* ONE PLUS *******");
		System.out.println();
		System.out.println("Type : "+this.type);
		System.out.println("Name : "+this.opName);
		System.out.println("Series : "+this.opSeries);
		System.out.println("Price : "+this.opPrice);
		System.out.println();
	}
}


class Apple extends PhoneOperatingSystem
{
	String iName;
	String iSeries;
	double iPrice;

	Apple(String type, String iName, String iSeries, double iPrice)
	{
		super(type);
		this.iName = iName;
		this.iSeries = iSeries;
		this.iPrice = iPrice;
	}

	void displayApple()
	{
		System.out.println();
		System.out.println("******* IPHONE *******");
		System.out.println();
		System.out.println("Type : "+this.type);
		System.out.println("Name : "+this.iName);
		System.out.println("Series : "+this.iSeries);
		System.out.println("Price : "+this.iPrice);
		System.out.println();
	}
}


class Heirarchichal_Inheritance_Example
{
	public static void main(String[] args) 
	{
		PhoneOperatingSystem phoneOperatingSystem = new PhoneOperatingSystem("Phone Type");
		// phoneOperatingSystem.displayPhoneOperatingSystem();

		Samsung samsung = new Samsung("Android","Samsung Galaxy","A Series",16499);
		samsung.displaySamsung();

		OnePlus onePlus = new OnePlus("Android", "Nord","CE Series",17500);
		onePlus.displayOnePlus();

		Apple apple = new Apple("IOS","Iphone","iphone 15 Series",725000);
		apple.displayApple();
	}
}