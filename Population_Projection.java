class Population_Projection
{
	public static void main(String[] args) {
		int secondsPerYear = 365 * 24 * 60 * 60;
		int birthsPerYear = secondsPerYear / 7;
		int deathsPerYear = secondsPerYear / 13;
		int immigrantsPerYear = secondsPerYear / 45;

		int population = 312032486;

		population = population + ((birthsPerYear - deathsPerYear + immigrantsPerYear)*5);
		System.out.println("Population : "+ population);
		
	}
}