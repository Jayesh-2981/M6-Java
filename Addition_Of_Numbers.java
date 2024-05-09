import java.util.Scanner;

class Addition_Of_Numbers
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter First Number : ");
		int num1 = input.nextInt();

		System.out.print("Enter Second Number : ");
		int num2 = input.nextInt();

		int addition = num1 + num2;
		System.out.print("Addition of Two Numbers is : "+addition);
	}
}

/*
OUTPUT :-
Enter First Number : 10
Enter Second Number : 20
Addition of Two Numbers is : 30
*/