class Car
{
	String brand;
	String model;
	String type;
	double price;
	int seatCapacity;
	Engine engine;

	Car(String brand, String model, String type, double price, int seatCapacity, double horsePower, double capacity, String engineType, double milage, int noOfPistons)
	{
		this.brand = brand;
		this.model = model;
		this.type = type;
		this.price = price;
		this.seatCapacity = seatCapacity;

		this.engine = new Engine(horsePower, capacity, engineType, milage, noOfPistons);
	}

	public void displayCar()
	{
		System.out.println(" * * *  Car  * * * ");
		System.out.println();
		System.out.println("Brand : "+this.brand);
		System.out.println("Model : "+this.model);
		System.out.println("Type : "+this.type);
		System.out.println("Price : "+this.price);
		System.out.println("Seat Capacity : "+this.seatCapacity);
		System.out.println();
	}

}


class Engine
{
	double horsePower;
	double capacity;
	String engineType;
	double milage;
	int noOfPistons;

	Engine(double horsePower, double capacity, String engineType, double milage, int noOfPistons)
	{
		this.horsePower = horsePower;
		this.capacity = capacity;
		this.engineType = engineType;
		this.milage = milage;
		this.noOfPistons = noOfPistons;
	}

	public void displayEngine()
	{
		System.out.println();
		System.out.println(" * * * Engine  * * * ");
		System.out.println("Horse power : "+this.horsePower);
		System.out.println("Capacity : "+this.capacity);
		System.out.println("Engine Type : "+this.engineType);
		System.out.println("Milage : "+this.milage);
		System.out.println("No of Pistons : "+this.noOfPistons);
	}
}
class Car_Engine
{
	public static void main(String[] args) 
	{
		Car obj = new Car("Tata","Hexon","SUN",9000000,5,120,1.2,"Petrol",16,4);
		obj.displayCar();
		obj.engine.displayEngine();
	}
}


/*
OUTPUT :-

 * * *  Car  * * *

Brand : Tata
Model : Hexon
Type : SUN
Price : 9000000.0
Seat Capacity : 5


 * * * Engine  * * *
Horse power : 120.0
Capacity : 1.2
Engine Type : Petrol
Milage : 16.0
No of Pistons : 4

*/