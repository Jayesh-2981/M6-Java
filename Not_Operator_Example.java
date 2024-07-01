import java.util.Scanner;

class Not_Operator_Example
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter The num : ");
		int num = input.nextInt();
		System.out.println((num%2==0)?num+" Number is even":num+" Number is odd");
	}
}

/*
OUTPUT :-

Enter The num : 18
18 Number is even
*/