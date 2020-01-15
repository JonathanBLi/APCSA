/** 
 * The RoachPopulation Class establishes a constructor that defines the number 
 * of initial roaches in a certain location. There are also methods to get the
 * roach population, wait for the population to double, and spray an insectide to
 * reduce the population.
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 9/30/19
 */

public class RoachPopulation 
{
	private static final int DEFAULT_POPULATION = 10;
	
	private int numRoaches; // The roach population
	
	/** Default constructor, initializes the population to 10 
	 */
	public RoachPopulation() 
	{
		numRoaches = DEFAULT_POPULATION;
	}
	
	/** Overloaded constructor that initializes the population to user-specified integer
	 */
	public RoachPopulation(int initPop) 
	{
		numRoaches = initPop;
	}

	/** Returns the current roach population
	 *  @return number of roaches remaining
	 */
	public int getRoaches() 
	{
		return numRoaches;
	}


	/** Doubles roach population
	 */
	public void waitForDoubling() 
	{
		numRoaches *= 2;
	}
	
	/** Sprays insectide that kills a user-specified percentage of the roach population
	 *  @param killPercent percentage of roaches to kill
	 *  @return number of roaches killed
	 */
	public int spray(double killPercent) 
	{
		int numKilled = (int) Math.ceil(numRoaches * killPercent / 100.0);
		numRoaches -= numKilled;
		return numKilled;
	}
}