/**
 * Constructs the BalloonTest class and its methods, which can determine if
 * a balloon pops after a series of pumps and run any number of these tests
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 4/2/20
 */
 
public class BalloonTest
{
  /** Maximum diameter before balloon pops */
  private int maxDiameter;
  
  /** Maximum number of pumps allowed to reach the goal */
  private int maxPumps;
  
  /**
   *Constructs a BalloonTest where numPumps is the maximum number of pumps required in the balloon test 
   * @param numPumps the maximum number of pumps
   * Precondition: numPumps > 0 
   */
  public BalloonTest(int numPumps)
  {
    maxDiameter = (int) (Math.random() * 261) + 40;
    maxPumps = numPumps;
  }
  
  /**
   * Returns an int representing the number of centimeters the balloon diameter increases in a pump 
   * @return the number of centimeters the balloon diameter increases
   */
  private int pumpImpact()
  {
    return (int) (Math.random() * 14) + 2;
  }
  
  /**
   * Simulates a balloon inflating over a series of pumps.  
   * Determines whether or not the balloon popped at any point
   * during the series of pumps.
   * @return true if the balloon popped and false otherwise
   */
  public boolean testBalloon()
  {
    int curDiameter = 0;
    for (int i = 0; i < maxPumps; i++)
    {
      curDiameter += pumpImpact();
      if (curDiameter > maxDiameter)
        return true;
    }
    return false;
  }
  
  /**
   *Runs numTests tests and returns the proportion of tests in which the balloon pops 
   * Precondition: numTests > 0
   * @return the proportion of test in which the balloon pops 
   */
  public double runTests(int numTests)
  {
    int count = 0;
    for (int i = 0; i < numTests; i++)
    {
      if (testBalloon())
        count++;
    }
    return (double) count / numTests;
  }
}