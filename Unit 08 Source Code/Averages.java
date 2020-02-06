/*
 *	Averages.java
 * Calculate the averages of several test scores
 */

import java.util.Scanner;

public class Averages 
{
	public static void main(String[] args) 
	{
		// Read in 3 test scores
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter test score 1:  ");
		int test1 = scan.nextInt();
		System.out.print("Enter test score 2:  ");
		int test2 = scan.nextInt();
		System.out.print("Enter test score 3:  ");
		int test3 = scan.nextInt();
		System.out.println();
		
		// Calculate the sum
		double sum = test1 + test2 + test3;
		
		// Calculate the average
		double average = sum / 3;
		
		// Display the test scores and average
		System.out.println("Test scores: " + test1 + "  " 
			+ test2 + "  " + test3);
		System.out.printf("Test average: %6.2f \n", average);
		System.out.println();
	}
}	