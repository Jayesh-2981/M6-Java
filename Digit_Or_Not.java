import java.util.Scanner;

class Digit_Or_Not
{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a Character : ");
		char ch = input.next().charAt(0);

		System.out.println((ch>'0' && ch<='9')?"Digit":"Not Digit");
	}
}

/*
OUTPUT :-
Enter a Character : 5
Digit
*/