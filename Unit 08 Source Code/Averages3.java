/*
 *	Averages3.java
 * Arrays as parameters and return objects
 */
public class Averages3 
{
	public static void main(String[] args) 
	{
		// Declare and instantiate an array of test scores
		int[] testScores = { 90, 95, 88, 100 };		
		showScores(testScores);

		// Change the scores and display the result
		changeScores(testScores);
		showScores(testScores);

		// Try to change the size of the array and display the result
		changeSize(testScores);
		showScores(testScores);
	}
	
	/** Displays contents of scores
	 *   @param scores an integer array of test scores
	 */
	public static void showScores(int[] scores) 
	{
		System.out.println("Test scores:  ");
		for (int test : scores) 
		{
			System.out.printf("%5d", test);
		}
		System.out.println("\n");
	}

	/** Increases each test score in scores by 5
	 *   @param scores an integer array of test scores
	 */
	public static void changeScores(int[] scores) 
	{
		for (int i = 0; i < scores.length; i++)
		{
			scores[i] += 5;
		}
	}

	/** Creates and returns a new array of 10 scores: 100, 90, 80, etc.
	 *   @param scores an integer array of test scores
	 */
	public static void changeSize(int[] scores) 
	{
		scores = new int[10];
		for (int index = 0; index < 10; index++)
			scores[index] = 100 - (index * 10);
	}
}	