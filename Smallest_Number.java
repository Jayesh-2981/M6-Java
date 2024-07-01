import java.util.Scanner;

class Smallest_Number
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the first Number : ");
		int num1 = input.nextInt();

		System.out.print("Enter the Second Number : ");
		int num2 = input.nextInt();

		int smallest = ((num1<num2)?num1:num2);
		System.out.println("The smallest number is : "+smallest);
	}
}

/*
OUTPUT :-
Enter the first Number : 11
Enter the Second Number : 12
The smallest number is : 11
*/