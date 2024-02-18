class Vovel_Or_Not
{
	public static void main(String [] von)
	{
		char ch='A';
		String vovel=(ch=='A')?("Character is vovel"):("Character is not vovel");
		System.out.println(vovel);

/*
OUTPUT
CT: success
RT: success: Character is vovel
*/

										//OR
										
		char cha='Y';
		String result=(cha=='A'||cha=='E'||cha=='I'||cha=='O'||cha=='U')?("This is vovel"):("This is not vovel");
		System.out.println(result);

/*
OUTPUT
CT: success
RT: success: This is vovel
*/

	}
}
