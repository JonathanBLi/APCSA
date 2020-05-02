/**
 * The LargeBirdSanctuary class represents a collection of different birds in a bird sanctuary.  It only accepts large birds with a specified minimum wingspan, and has a specified maximum capacity. It is constructed from a list of birds, and it only accepts the large birds up to its capacity. It has functionality to count all of the healthy birds, and remove those birds that are not healthy. 
 * 
 * @author Jonathan Li
 * Collaborators: None
 * Teacher: Bailey
 * Period: 1
 * Due Date: 4/20/20
*/

import java.util.*;

/**
 * Represents a collection of different birds in a bird sanctuary
 */
 public class LargeBirdSanctuary
 {
 	public static final int MIN_WINGSPAN = 48;

 	private Bird[] bigBirds;

 	/**
 	 * Constructs a LargeBirdSanctuary with a maximum capacity and fills the
 	 * sanctuary by accepting all birds from a list that have a specified minimum wingspan
 	 * until it reaches maxCapacity
 	 * If it does not reach maxCapacity, the sanctuary will not be full
 	 * @param allBirds the list of birds
 	 * @param maxCapacity the maximum capacity for large birds at the sanctuary
 	 */
 	public LargeBirdSanctuary(List<Bird> allBirds, int maxCapacity)
 	{
 		bigBirds = new Bird[maxCapacity];
 		int i = 0;
 		int j = 0;
 		while (i < maxCapacity && j < allBirds.size())
 		{
 		   if (allBirds.get(j).getWingspan() >= MIN_WINGSPAN)
 		   {
 		     bigBirds[i] = allBirds.get(j);
 		     i++;
 		     j++;
 		   }
 		   else 
 		    j++;
 		}
 	}

 	/**
 	 * Calculates and returns the number of healthy birds in the sanctuary
 	 * Precondition: the array is either full or all existing 
 	 * birds are positioned in the leftmost slots in the array
 	 * with null slots at the end
 	 * @return the number of healthy birds in the sanctuary
 	 */
 	public int getHealthyBirdCount()
 	{
 	  int count = 0;
 		for (Bird b : bigBirds)
 		{
 		  if (b != null && b.isHealthy())
 		    count++;
 		}
 		return count;
 	}

	/**
	 * Removes all birds that are not healthy to the
	 * left while maintaining their relative order
	 * Generates and returns a list of removed birds
	 * Precondition: the array is either full or all existing birds are positioned in
 	 * the leftmost slots in the array with null slots at the end
	 * Postcondition: the array is still filled from the left with the remaining birds in the same
	 * relative position as before the removal
	 * @return a list of birds that are removed
	 */
	public List<Bird> removeSickBirds()
	{
		List<Bird> removed = new ArrayList<Bird>();
		for (int i = 0; i < bigBirds.length; i++)
		{
		  if (bigBirds[i] != null && !bigBirds[i].isHealthy())
		  {
		    removed.add(bigBirds[i]);
		    int j = i;
		    while (j < bigBirds.length - 1 && bigBirds[j] != null)
		    {
		      bigBirds[j] = bigBirds[j + 1];
		      j++;
		    }
		    while (j < bigBirds.length)
		    {
		      bigBirds[j] = null;
		      j++;
		    }
		  }
		}
		return removed;
	}

	/**
	 * Returns a String version of the list of birds
	 * @return a String version of the list of birds
	 */
	@Override
	public String toString()
	{
		String ret = "Number of Healthy Birds: " + getHealthyBirdCount() + "\n";
		for(Bird bird : bigBirds)
			ret += bird + "\n";
		return ret;
	}

 }