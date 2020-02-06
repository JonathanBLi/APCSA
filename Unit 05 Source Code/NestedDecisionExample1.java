/*
 * NestedDecisionExample1.java
 *
 * Demonstrate use of nested if-else
 */

import java.util.Scanner;

public class NestedDecisionExample1 
{
	public static void main(String[] args) 
	{
		// Read in student's grade level
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter high school grade level: ");
		int gradeLevel = scan.nextInt();
		System.out.println();
		
		// Display grade name using nested if-else 
		// (freshman, sophomore, junior, senior, invalid)
		String gradeName = new String();
//		if (gradeLevel == 9)
//			gradeName = "Freshman";
//		else if (gradeLevel == 10)
//			gradeName = "Sophomore";
//		else if (gradeLevel == 11)
//			gradeName = "Junior";
//		else if (gradeLevel == 12)
//			gradeName = "Senior";
//		else
//			gradeName = "Invalid grade level entered";
		switch (gradeLevel)
		{
			case 9:
				gradeName = "Freshman";
				break;
			case 10:
				gradeName = "Sophomore";
				break;
			case 11:
				gradeName = "Junior";
				break;
			case 12:
				gradeName = "Senior";
				break;
		}
		System.out.println("Grade level " + gradeLevel + ":  " + gradeName);
		System.out.println("\n");
	}
}