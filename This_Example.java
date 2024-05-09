class Bottle
{
	//Creating non static variable
	String brand;
	String material;
	Double capacity;

	//Creating parameterized constructor
	Bottle(String brand_1, String material_1, Double capacity_1) 
	{
		//Assingning local variable values into non static variable
		this.brand = brand_1;				
		this.material = material_1;
		this.capacity = capacity_1;
	}

	//creating display method 
	void displayBottle()
	{
		System.out.println("Brand : " + this.brand);
		System.out.println("Material : " + this.material);
		System.out.println("Capacity : " + this.capacity);
	}
}

//Creating another class for execution of main method
class BottleDriver
{
	//main method
	public static void main(String[] args) 
	{
		System.out.println();

		Bottle a = new Bottle("Bisleri", "Plastic", 1.0);	//Creating 1st object of Bottle Class
		a.displayBottle();									//calling 1st object

		System.out.println();

		Bottle b = new Bottle("Kinley","Steel", 1.5);		//Creating 2nd object of Bottle Class
		b.displayBottle();									//calling 2nd object
	}
}

/*
OUTPUT :- 

Brand : Bisleri
Material : Plastic
Capacity : 1.0

Brand : Kinley
Material : Steel
Capacity : 1.5

*/