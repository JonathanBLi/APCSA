/**
 * The runner class for the BalloonTest class
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 4/2/20
 */

class Main 
{
  public static void main(String[] args) 
  {
    
    BalloonTest one;
    
    /* runs a series of tests on a balloon with 8 pumps
       some should result in true/some in false (it's random)
    */
    System.out.println("15 tests on a balloon with 8 pumps:");
    for(int i = 1; i <= 15; i++)
    {
      one = new BalloonTest(8);
      System.out.println(one.testBalloon());
    }
    System.out.println();
    
    /* calls the runTests method to determine the proportion of tests in which a balloon with a minimum of 25 pumps pops in 1000 tests 
    */
    System.out.println("10000 tests with 18 pumps:");
    BalloonTest two = new BalloonTest(18);
    System.out.println(two.runTests(10000));
    
    System.out.println("\n5000 tests with 22 pumps:");
    BalloonTest three = new BalloonTest(22);
    System.out.println(three.runTests(5000));
  }
}