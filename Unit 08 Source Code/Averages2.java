/** Averages2.java
 *  Using an array that is not fully populated
 */

import java.util.Scanner;

public class Averages2 
{
	public static void main(String[] args) 
	{
		// Instantiate an array to hold up to 500 integers
		int[] testScores = new int[500];
		int numScores = 0;
		
		// Enter the test scores until the user enters a negative
		// value, calculating the sum as we go
		System.out.println("Enter test scores (negative score to stop).");
		Scanner scan = new Scanner(System.in);		
		double sum = 0;
		int score = 0;
		while (score >= 0)
		{
			System.out.print("Enter test score " + (numScores + 1) + ":  ");
			score = scan.nextInt();
			if (score >= 0)
			{
				testScores[numScores] = score;
				sum += score;
				numScores++;
			}
		}
		System.out.println();
		
		// Calculate the average
		double average = sum / numScores;
		
		// Display the test scores and average
		System.out.println("Test scores: ");
		for (int i = 0; i < numScores; i++)
		{
			System.out.printf("%5d", testScores[i]);
		} 
		System.out.println();
		System.out.printf("Test average: %6.2f \n", average);
		System.out.println();
	}
}	