/*
 * DecisionExample.java
 *
 * Demonstrates use of if and if-else statements
 */

import java.util.Scanner;

public class DecisionExample 
{
	public static void main(String[] args) 
	{
		// Instantiate the Scanner object
		Scanner reader = new Scanner(System.in);
		
		// Find out the grade
		System.out.print("What is your APCS1 grade? ");
		int csGrade = reader.nextInt();
		
		// Determine if we get Dad's keys and $50
		if (csGrade >= 80) 
			System.out.println("Here are Dad's keys and $50");
		else
		{
			System.out.println("Here is Mom's minivan");
		}
		System.out.println("Have fun tonight!");
		
		System.out.println();		
	}
}


