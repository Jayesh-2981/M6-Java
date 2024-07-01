import java.util.*;

class Fruit
{	
		String fruits[];
		static Scanner input = new Scanner(System.in);

		public void storeFruits(String [] fruits)
		{
			this.fruits = fruits;
			for(int i=0; i<fruits.length;i++)
			{
				fruits[i]=input.next();
			}
		}

		public void displayFruits()
		{
			System.out.println(Arrays.toString(fruits));
		}

		public void changeFruit()
		{
			System.out.println("Enter The Fruit : ");
			String inputFruit = input.next();

			for(int i=0; i<fruits.length; i++)
			{
				if(inputFruit.equals(fruits[i]))
				{
					System.err.println("Matches");
					System.err.println("Enter New Fruit To Update :");
					String newFruit = input.next();
					fruits[i] = newFruit;
					break;
				}
			}
		}
		
}

class FruitStore
{
	public static void main(String[] args) 
	{
		Fruit f = new Fruit();
		Scanner input = new Scanner(System.in);
		boolean exit=true;
		while(exit)
		{
			System.out.println("Enter Options : ");
			System.out.println("1. Store Fruits : ");
			System.out.println("2. Display Fruits : ");
			System.out.println("3. Change Fruit : ");
			System.out.println("4. Exit");
			int options = input.nextInt();

			switch (options) 
			{
				case 1: 
				{
					System.out.println("Enter The size of Array : ");
					int size = input.nextInt();
					System.out.println("Enter The Fruits : ");
					String fruits [] = new String[size];
					f.storeFruits(fruits);
				}
				
				case 2:
				{
					if(f.fruits == null)
					{
						System.out.println("Add Fruits First to Display It");
					}
					else
					{
						f.displayFruits();
					}
				}
				break;

				case 3:
				{
					if(f.fruits==null)
					{
						System.out.println("Please add the Fruits to Make an Update");
					}
					else
					{
						f.changeFruit();
					}
				}
				break;

				case 4:
				{
					exit = false;
				}
				break;

				default :
				{
					System.out.println("Invalid Options");
				}
				
			}
				
		}
	}
}
