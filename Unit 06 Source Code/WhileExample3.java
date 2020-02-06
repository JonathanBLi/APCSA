/**
 *  WhileExample3.java
 *  Uses a while loop to input and sum a given number of grades.
 *  Calculates and displays the average of the quiz grades. 
 */

import java.util.Scanner;

public class WhileExample3
{
	public static void main(String[] args) 
	{
		// Read in the quantity of quiz grades to be entered
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number of quiz grades to be entered: ");
		int numGrades = scan.nextInt();
		
		// Write a loop that prompts and reads in numGrades quiz grades.
		// Sum the grades as they are entered.

		int num = 0;
		int sumGrades = 0;
		while (num < numGrades)
		{
			sumGrades += scan.nextInt();
			num++;
		}

		// Calculate and display the average grade
		double average = (double) sumGrades / numGrades;
		System.out.printf("Average: %.4f%n", average);
		System.out.println();
	}
}
