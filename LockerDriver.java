import java.util.Scanner;

class LockerDriver
{
	static Locker l;

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to open the Door ?");
		boolean key = input.nextBoolean();

		try{
			Locker l = new Locker();
			if(key == true)
			{
				l.unLock();
			}
			else 
			{
				l.lock();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}