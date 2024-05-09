class Marker
{
	//Non Static variables
	String brand;
	String type;
	boolean refillable;
	double price;
	String color;

	//Parameterized constructor
	Marker(String brand, String type, String color, boolean refillable, double price)
	{
		this.brand = brand;
		this.type = type;
		this.refillable = refillable;
		this.price = price;
		this.color= color;

		System.out.println();
		System.out.println("Original Marker Created");
	}


	//Copy Constructor
	Marker(Marker obj)
	{
		this.brand=obj.brand;
		this.type=obj.type;
		this.refillable=obj.refillable;
		this.color=obj.color;
		this.price=obj.price;

		System.out.println();
		System.out.println("Copy of Marker Created");
	}

	// User Defined method to display output
	void displayMarker()
	{
		System.out.println();
		System.out.println("--- Marker Details ---");
		System.out.println("Brand : " + this.brand);
		System.out.println("Type : " + this.type);
		System.out.println("Refillable : " + this.refillable);
		System.out.println("Price : " + this.price);
		System.out.println("Colour : " + this.color);
		System.out.println();
	}
}

class MarkerDriver
{
	//Main method
	public static void main(String[] args) 
	{
		//Making object of marker class
		Marker obj = new Marker("Camlin", "White Board Marker", "Black", true, 30);	
		//calling original marker;
		obj.displayMarker();

		//Making copy of original marker
		Marker obj1= new Marker(obj);
		obj1.displayMarker();

		//Making another copy of original marker with change in color
		Marker obj2 = new Marker(obj);
		obj2.color = "Red";
		obj2.displayMarker();
	}
}


/*
OUTPUT :- 

Original Marker Created

--- Marker Details ---
Brand : Camlin
Type : White Board Marker
Refillable : true
Price : 30.0
Colour : Black


Copy of Marker Created

--- Marker Details ---
Brand : Camlin
Type : White Board Marker
Refillable : true
Price : 30.0
Colour : Black


Copy of Marker Created

--- Marker Details ---
Brand : Camlin
Type : White Board Marker
Refillable : true
Price : 30.0
Colour : Red


*/