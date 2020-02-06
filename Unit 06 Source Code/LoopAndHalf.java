/**
 *  LoopAndHalf.java
 *  Demonstrates loop-and-a-half structure. Decision to stop is
 *  in middle of loop.
 */

import java.util.Scanner;

public class LoopAndHalf 
{
	public static void main(String[] args) 
	{
		// Read in quiz grades and calculate the average
		// Stop reading when -1 entered
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		boolean done = false;
		while (!done)
		{
			System.out.print("Enter quiz grade (-1 to stop): ");
			int quiz = scan.nextInt();
			if (quiz < 0)
			{
				done = true;
			}
			else
			{
				num++;
				sum += quiz;
			}
		}
		System.out.println();
		
		// Display average
		double average = (double) sum / num;
		System.out.println("Average: " + average);
		System.out.println();
		
		
		// Can also be written using break
		num = sum = 0;
		while (true)
		{
			System.out.print("Enter quiz grade (-1 to stop): ");
			int quiz = scan.nextInt();
			
			if (quiz < 0)
				break;
			
			num++;
			sum += quiz;
		}
		System.out.println();
		
		// Display average
		average = (double) sum / num;
		System.out.println("Average: " + average);
		System.out.println();
		
	}
}
