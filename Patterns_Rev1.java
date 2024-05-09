class Patterns_Rev1
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ ) {
			// loop for spaces
			for(int j=1; j<i; j++){
				System.out.print("  ");
			}
			// loop for stars
			for (int j=5;j>=i ;j-- ) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}