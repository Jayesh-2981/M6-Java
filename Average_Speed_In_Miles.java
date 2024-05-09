/*
	Assume a runner runs 14 kilometer in 45 minutes and 30 seconds.
	Write a program that displays the average speed in miles/hour.
	(Note that 1 mile is 1.6 kilometers)
*/

class Average_Speed_In_Miles
{
	public static void main(String[] args) 
	{
		double distance = 8.75;		//14 km is 14/1.6 = 8.75 miles
		double time = 0.759;		//45 min 30 sec = 45.5/60 = 0.759 hours
		
		double averageSpeed = distance/time;	
		System.out.println("The Average Speed is "+averageSpeed+" miles/hours");
	}
}

/*
The Average Speed is 11.52832674571805 miles/hours
*/