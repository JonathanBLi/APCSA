/**
 * The Bird class represents a bird that has a type, number of eggs, wingspan, and an indicator of whether or not it is healthy.  It has one constructor, standard accessor and mutator methods, and a toString method. 
 * 
 * @author Jonathan Li
 * Collaborators: None
 * Teacher: Bailey
 * Period: 1
 * Due Date: 4/20/20
*/

/**
 * Represents a nesting bird
 */
public class Bird
{
 	private String type;
 	private int numEggs;
 	private double wingspan;
 	private boolean isHealthy;

  /** 
   * Constructs a bird with a specified type, number of numEggs,
   * wingspan in inches, and health status
   * @param type the bird type
   * @param eggs the number of numEggs
   * @param span the bird's wingspan
   * @param health true if the bird is healthy, false otherwise
   */
 	public Bird(String type, int eggs, double span, boolean health)
 	{
 		this.type = type;
 		numEggs = eggs;
 		wingspan = span;
 		isHealthy = health;
 	}

  /**
   * Returns the bird's type 
   * @return the type of the bird
   */
 	public String getType()
 	{
 		return type;
 	}

  /**
   * Returns the number of bird eggs 
   * @return the number of eggs 
   */
 	public int getNumEggs()
 	{
 		return numEggs;
 	}

  /**
   * Returns the bird wingspan 
   * @return the bird wingspan 
   */
 	public double getWingspan()
 	{
 		return wingspan;
 	}

 	/**
 	 * Returns true if the bird is healthy and false otherwise
 	 * @return true if the bird is healthy and false otherwise
 	 */
 	public boolean isHealthy()
 	{
 	  return isHealthy;
 	}

  /**
   * Returns a String version of the bird
   * @return a String version of the bird
   */
	public String toString()
	{
	  String health = isHealthy ? "healthy" : "sick";
		return String.format ("%-30s%-2d%7.2f  %s",type,numEggs,wingspan,health);
	}
}