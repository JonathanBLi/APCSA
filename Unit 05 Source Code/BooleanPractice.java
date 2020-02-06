/*
 * BooleanPractice.java
 *
 * Practice using boolean variables and boolean return methods
 */

import java.util.Scanner;

public class BooleanPractice 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a quiz grade: ");
		int quizGrade = scan.nextInt();
		
		// Define a boolean variable isValid and store results of isValidGrade
		boolean isValid = isValidGrade(quizGrade);
		String letterGrade = getLetterGrade(quizGrade);
		
		// Display whether or not this is a valid grade
		if (isValid)
		{
			System.out.println(quizGrade + " is a valid grade.");
			System.out.println("The letter grade is " + letterGrade);
		}
		else
			System.out.println(quizGrade + " is not a valid grade.");
		System.out.println();
	}
	
	/** Determine whether or not a grade is in the range [0,110]
	 *  @param grade the grade to check
	 *  @return true if grade is in range [0,110]; false otherwise
	 */
	public static boolean isValidGrade(int grade)
	{
		return (grade >= 0 && grade <= 110);
	}

	
	/** Determine the grade's corresponding letter grade
	 *  (A = 90+, B = 80-89, C = 70-79, F = below 70)
	 *  @param grade the grade to examine
	 *  @return grade's corresponding letter grade
	 */
	public static String getLetterGrade(int grade)
	{
		if (grade >= 90)
			return "A";
			else if (grade >= 80)
				return "B";
				else if (grade >= 70)
					return "C";
					else
						return "F";
	}

}


