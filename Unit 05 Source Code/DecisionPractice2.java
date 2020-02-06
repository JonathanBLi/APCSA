/*
 * DecisionPractice2.java
 *
 * Practice using if and if-else statements
 */

import java.util.Scanner;

public class DecisionPractice2 
{
	public static void main(String[] args) 
	{
		// Read in an integer quiz grade

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter integer quiz grade: ");
		int grade = sc.nextInt();
		
		// Curve the quiz: if not passing increase the grade by 10% and 
		// round it; otherwise, increase by 7% and round it

		if (grade < 70)
		{
			grade = (int) Math.round(grade * 1.1);
		}
		else
		{
			grade = (int) Math.round(grade * 1.07);
		}
		
		// Display the updated quiz grade

		System.out.printf("Updated quiz grade: %d\n", grade);

		// Add 10 more points if the quiz grade is below 50

		if (grade < 50)
		{
			grade += 10;
		}
		
		// Display the updated quiz grade

		System.out.printf("Updated quiz grade: %d\n", grade);

	}
}


