class Plane
{
	String type;
	
	Plane(String type)
	{
		super();
		this.type = type;
	}
}

class FighterJet extends Plane
{
	int capacity;
	String name;

	FighterJet(String type, String name, int capacity)
	{
		super(type);
		this.capacity = capacity;
		this.name = name;
	}

	void displayFighetJet()
	{
		System.out.println();
		System.out.println("Plane Type : "+this.type);
		System.out.println("Plane Name : "+this.name);
		System.out.println("Missile Capacity : "+this.capacity);
	}

}

class Cargo extends Plane
{
	String name;
	double capacity;

	Cargo(String type, String name, double capacity)
	{
		super(type);
		this.name = name;
		this.capacity=capacity;
	}

	void displayCargo()
	{
		System.out.println();
		System.out.println("Plane Type : "+this.type);
		System.out.println("Plane Name : "+this.name);
		System.out.println("Cargo Capacity : "+this.capacity + " tons");
	}
}

class Commercial extends Plane
{
	String name;
	int capacity;

	Commercial(String type, String name, int capacity)
	{
		super(type);
		this.name = name;
		this.capacity = capacity;
	}

	void displayCommercial()
	{
		System.out.println();
		System.out.println("Plane Type : "+this.type);
		System.out.println("Plane Name : "+this.name);
		System.out.println("Passengers Capacity : "+this.capacity);
	}
}

class Heirarchichal_Inheritance_Example_2
{
	public static void main(String[] args) 
	{
		Plane plane = new Plane("Plane Type");

		FighterJet fighterJet = new FighterJet("Fighter Jet","F-16",4);
		fighterJet.displayFighetJet();

		Cargo cargo = new Cargo("Cargo","Airbus 380",100);
		cargo.displayCargo();

		Commercial commercial = new Commercial("Commercial","Booeing 737",180);
		commercial.displayCommercial();
	}
}

/*

OUTPUT :-

Plane Type : Fighter Jet
Plane Name : F-16
Missile Capacity : 4

Plane Type : Cargo
Plane Name : Airbus 380
Cargo Capacity : 100.0 tons

Plane Type : Commercial
Plane Name : Booeing 737
Passengers Capacity : 180

*/