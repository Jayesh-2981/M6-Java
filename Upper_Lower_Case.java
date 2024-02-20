class Upper_Lower_Case
{
	public static void main (String [] ulc)
	{
		char value='A';
		String result=(value>='A'&&value<='Z')?("Character is in uppercase"):("Character is in lowercase");
		System.out.println(result);
		
		/*
		OUTPUT:
		CT: success;
		RT: success: Character is in uppercase
		*/
		
		char value1 = '@';
		String result1=((value1>=65 && value1<=90) || (value1>=97 && value1<=122))?((value1>=65&&value1<=90)?("The character is in uppercase"):("The character is in lowercase")):("The given character is not alphabate");	
		System.out.println(result1);
		
		/*
		OUTPUT:
		CT: success;
		RT: success: The given character is not alphabate
		*/
	}
}
