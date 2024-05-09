						
							//Computer Details

class Computer
{
	String brand;
	double price;
	CPU cpu;
	Keyboard keyboard;
	Monitor monitor;
	Mouse mouse;
	Speaker speaker;
	Printer printer;

	Computer(String brand, double price)
	{
		this.brand = brand;
		this.price = price;
	}

	public void displayComputer()
	{
		System.out.println();
		System.out.println(" * * *  COMPUTER DETAILS  * * * ");
		System.out.println();
		System.out.println("Enter Brand : "+this.brand);
		System.out.println("Enter Price : "+this.price +" Rs");
		System.out.println();
	}

	public void createInstanceOfCPU(String graphicsCard, int ram, int rom, String processor)
	{
		cpu = new CPU(graphicsCard, ram, rom, processor);
	}

	public void createInstanceOfKeyboard(boolean isBackLight, String type, boolean isWithNum, boolean isWireless)
	{
		keyboard = new Keyboard(isBackLight, type, isWithNum, isWireless);
	}

	public void createInstanceOfMonitor(String displayType, double displaySize, int resolution, String shape)
	{
		monitor = new Monitor(displayType, displaySize, resolution, shape);
	}

	public void createInstanceOfMouse(String brand, String type, boolean scroll, int buttons)
	{
		mouse = new Mouse(brand, type, scroll, buttons);
	}

	public void createInstanceOfSpeaker(String brand, String type, int noOfSpeakers, double watt, boolean isWireless)
	{
		speaker = new Speaker(brand, type, noOfSpeakers, watt, isWireless);
	}

	public void createInstanceOfPrinter(String brand, String type, double inkCapacity, double price)
	{
		printer = new Printer(brand, type, inkCapacity, price);
	}
}
								//CPU Details

class CPU
{
	String graphicsCard;
	int ram;
	int rom;
	String processor;

	CPU(String graphicsCard, int ram, int rom, String processor)
	{
		this.graphicsCard = graphicsCard;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
	}

	public void displayCPU()
	{
		System.out.println();
		System.out.println(" * * *  CPU  * * * ");
		System.out.println();
		System.out.println("Graphics Card : "+this.graphicsCard);
		System.out.println("Ram : "+this.ram +" gb");
		System.out.println("Rom : "+this.rom +" gb");
		System.out.println("processor : "+this.processor);
	}
}
							//Keyboard Details

class Keyboard
{
	boolean isBackLight;
	String type;
	boolean isWithNum;
	boolean isWireless;

	Keyboard(boolean isBackLight, String type, boolean isWithNum, boolean isWireless)
	{
		this.isBackLight = isBackLight;
		this.type = type;
		this.isWithNum = isWithNum;
		this.isWireless = isWireless;
	}

	public void displayKeyboard()
	{
		System.out.println();
		System.out.println(" * * *  KEYBOARD  * * * ");
		System.out.println();
		System.out.println("Is Backlight : "+this.isBackLight);
		System.out.println("Type : "+this.type);
		System.out.println("Is Numpad : "+this.isWithNum);
		System.out.println("Is Wireless : "+this.isWireless);
	}
}
							//Monitor Details

class Monitor
{
	String displayType;
	double displaySize;
	int resolution;
	String shape;

	Monitor(String displayType, double displaySize, int resolution, String shape)
	{
		this.displayType = displayType;
		this.displaySize = displaySize;
		this.resolution = resolution;
		this.shape = shape;
	}

	public void displayMonitor()
	{
		System.out.println();
		System.out.println(" * * *  MONITOR  * * * ");
		System.out.println();
		System.out.println("Type : "+this.displayType);
		System.out.println("Size : "+this.displaySize + " inches");
		System.out.println("Resolution : "+this.resolution + " pixels/inch");
		System.out.println("Shape : "+this.shape);
	}
}
							//Mouse Details

class Mouse
{
	String brand;
	String type;
	boolean scroll;
	int buttons;

	Mouse(String brand, String type, boolean scroll, int buttons)
	{
		this.brand = brand;
		this.type = type;
		this.scroll = scroll;
		this.buttons = buttons;
	}

	public void displayMouse()
	{
		System.out.println();
		System.out.println(" * * *  MOUSE  * * * ");
		System.out.println();
		System.out.println("Brand : "+ this.brand);
		System.out.println("Type : "+ this.type);
		System.out.println("Scroll : "+this.scroll);
		System.out.println("Number of Buttons : "+this.buttons);
	}
}
					//Speakers Details

class Speaker
{
	String brand;
	String type;
	int noOfSpeakers;
	double watt;
	boolean isWireless;

	Speaker(String brand, String type, int noOfSpeakers, double watt, boolean isWireless)
	{
		this.brand = brand;
		this.type = type;
		this.noOfSpeakers = noOfSpeakers;
		this.watt = watt;
		this.isWireless = isWireless;
	}

	public void displaySpeaker()
	{
		System.out.println();
		System.out.println(" * * *  SPEAKER  * * *");
		System.out.println();
		System.out.println("Brand : "+this.brand);
		System.out.println("Type : "+this.type);
		System.out.println("Number of Speakers : "+this.noOfSpeakers);
		System.out.println("Charger : "+this.watt+" watt");
		System.out.println("Is Speaker Wireless : "+this.isWireless);
	}
}
						//Printer Details

class Printer
{
	String brand;
	String type;
	double inkCapacity;
	double price;

	Printer(String brand, String type, double inkCapacity, double price)
	{
		this.brand = brand;
		this.type = type;
		this.inkCapacity = inkCapacity;
		this.price = price;
	}

	public void displayPrinter()
	{
		System.out.println();
		System.out.println(" * * *  PRINTER  * * * ");
		System.out.println();
		System.out.println("Brand : "+this.brand);
		System.out.println("Type : "+this.type);
		System.out.println("Ink Capacity : "+this.inkCapacity +" ml");
		System.out.println("Price : "+this.price+" Rs");
	}
}

							//Main Method 

class Has_A_Realtionship_Example
{
	public static void main(String[] args) 
	{
		Computer computer = new Computer("HP",65000l);
		computer.displayComputer();

		computer.createInstanceOfCPU("Nvidia", 8, 512, "Intel");
		computer.cpu.displayCPU();

		computer.createInstanceOfKeyboard(true, "Gaming Keyboard", true,true);
		computer.keyboard.displayKeyboard();

		computer.createInstanceOfMonitor("LCD", 22.83, 72, "Rectangular");
		computer.monitor.displayMonitor();

		computer.createInstanceOfMouse("Logitech","Trackball Mouse",true,8);
		computer.mouse.displayMouse();

		computer.createInstanceOfSpeaker("JBL", "Bluetooth Speakers", 5, 50, true);
		computer.speaker.displaySpeaker();

		computer.createInstanceOfPrinter("Canon","LED Printer",100,15000);
		computer.printer.displayPrinter();
	}
}


/*
OUTPUT :-


 * * *  COMPUTER DETAILS  * * *

Enter Brand : HP
Enter Price : 65000.0 Rs


 * * *  CPU  * * *

Graphics Card : Nvidia
Ram : 8 gb
Rom : 512 gb
processor : Intel

 * * *  KEYBOARD  * * *

Is Backlight : true
Type : Gaming Keyboard
Is Numpad : true
Is Wireless : true

 * * *  MONITOR  * * *

Type : LCD
Size : 22.83 inches
Resolution : 72 pixels/inch
Shape : Rectangular

 * * *  MOUSE  * * *

Brand : Logitech
Type : Trackball Mouse
Scroll : true
Number of Buttons : 8

 * * *  SPEAKER  * * *

Brand : JBL
Type : Bluetooth Speakers
Number of Speakers : 5
Charger : 50.0 watt
Is Speaker Wireless : true

 * * *  PRINTER  * * *

Brand : Canon
Type : LED Printer
Ink Capacity : 100.0 ml
Price : 15000.0 Rs
*/