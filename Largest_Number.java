import java.util.Scanner;

class Largest_Number
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first Number : ");
		int num1 = input.nextInt();

		System.out.print("Enter the Second Number : ");
		int num2 = input.nextInt();

		int l = ((num1>num2)?num1:num2);
		System.out.println("The Largest number is : "+l);
	}
}

/*
OUTPUT :-

Enter the first Number : 10
Enter the Second Number : 11
The Largest number is : 11
*/