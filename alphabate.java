//Write a program to check whether the given character is alphabate or not

class alphabate
{
	public static void main (String [] a)
	{
		char c='A';
		String result=((c>='a' && c<='z') || (c>='A' && c<='Z'))?("Character is alphabate"):("Character is not alphabate");
	  //String result=((c>=65&&a<=90) || (c>=97&&c<=122));
		System.out.println(result);
	}
}

/*
OUTPUT:
CT: success;
RT: success: Character is alphabate
*/