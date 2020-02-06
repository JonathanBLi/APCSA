/*
 * ArrayPractice2.java
 * Calculate the averages of several test scores
 */

import java.util.Scanner;
import java.util.Arrays;

public class ArrayPractice2 
{
	public static void main(String[] args) 
	{
		// Instantiate an array of test scores
		Scanner scan = new Scanner(System.in);
		System.out.print("How many test scores to generate? ");
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		
		// Randomly populate the array with range [60, 100]
		double sum = 0;
		for (int index = 0; index < testScores.length; index++)
		{
			testScores[index] = (int) (Math.random() * 41) + 60;
			sum += testScores[index];
		}
		System.out.println();
		double average = sum / testScores.length;
		
		// Display the test scores and average
		System.out.println("Test scores: " + Arrays.toString(testScores));
		System.out.printf("Test average: %6.2f \n", average);
		System.out.println();
		
		// Calculate and display the number of 85s in the array
		// using the enhanced for loop
		int count = 0;
		for (int i : testScores)
		{
			if (i == 85) count++;
		}
		System.out.println("There are " + count + " 85s in the array.");
		// Calculate and display the lowest score in the array
		int min = Integer.MAX_VALUE;
		for (int i : testScores)
		{
			min = Math.min(i, min);
		}
		System.out.println("The lowest score is " + min + ".");
	}
}	