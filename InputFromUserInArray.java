import java.util.*;
class InputFromUserInArray
{
	int arr[];
	static Scanner sc = new Scanner(System.in);

	public void storeElements(int arr[])
	{
		this.arr = arr;
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
		}
	}

	public void displayElemnts()
	{
		for(int i:arr)
		{
			System.out.print(i+ " ");
		}
	}

	public static void main(String[] args) 
	{
		System.out.print("Enter The Size : ");
		int size = sc.nextInt();

		System.out.println("Enter Array Elements : ");
		int arr[] = new int[size];

		InputFromUserInArray obj = new InputFromUserInArray();
		obj.storeElements(arr);
		obj.displayElemnts();
	}
	
}