import java.util.Scanner;
class ToLowerCase
{
	static String str;
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String : ");
		str = sc.nextLine();

		String op = userToLowerCase();
		System.out.println(str + " : "+op);

		// Inbuit Method starts
		// String op1 = str.toLowerCase();
		// System.out.println(op1);
		// Inbuilt Method ends
	}

	public static String userToLowerCase()
	{
		String newStr = "";
		for(int i=0; i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='A'&& ch<'Z')
			{
				newStr = newStr + (char)(ch+32);
			}
			else
			{
				newStr = newStr +ch;
			}

		}
		return newStr;
	}
}