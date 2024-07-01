class Mobile
{
	boolean pGames;
	boolean wReels;

	public void playGames(boolean pGames)
	{
		this.pGames = pGames;
		if(pGames == true)
		{
			System.out.println("Play Games");
		}
		else
		{
			System.out.println("Don't Play Games");
		}
	}	

	public void watchReels(boolean wReels)
	{
		this.wReels = wReels;
		if(wReels == true)
		{
			System.out.println("Watch Reels");
		}
		else
		{
			System.out.println("Don't watch Reels");
		}
	}
}