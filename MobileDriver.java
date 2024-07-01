class MobileDriver
{
	static Mobile m;
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");

		try{
			MobileDriver.m.pGames = true;
			MobileDriver.m.playGames(MobileDriver.m.pGames);
			MobileDriver.m.watchReels(MobileDriver.m.wReels);
		}
		catch(Exception e1)
		{
			e1.printStackTrace();

			try{
				Mobile m = new Mobile();
				m.pGames = true;
				m.wReels = true;
				m.playGames(m.pGames);
				m.watchReels(m.wReels);
			}
			catch(Exception e2)
			{
				e2.printStackTrace();
			}
		}
		System.out.println("Main Ends");
	}
}

/* OUTPUT
Main Starts
java.lang.NullPointerException: Cannot assign field "pGames" because "MobileDriver.m" is null
        at MobileDriver.main(MobileDriver.java:9)
Play Games
Watch Reels
Main Ends 

*/