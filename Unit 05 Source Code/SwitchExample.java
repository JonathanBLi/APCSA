/*
 * SwitchExample.java
 *
 * Demonstrate use of switch
 */

import java.util.Scanner;

public class SwitchExample 
{
	public static void main(String[] args) 
	{
		// Read in student's grade level
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter high school grade level: ");
		int gradeLevel = scan.nextInt();
		System.out.println();
		
		// Display grade name using switch statement 
		// (freshman, sophomore, junior, senior, invalid)
		String gradeName;
		switch (gradeLevel)
		{
			case  9:  gradeName = "Freshman";
			          break;
			case 10:  gradeName = "Sophomore";
			          break;
			case 11:  gradeName = "Junior";
			          break;
			case 12:  gradeName = "Senior";
			          break;
			default:  gradeName = "Invalid grade level entered";
		}	
		System.out.println("Grade level " + gradeLevel + ":  " + gradeName);
		System.out.println();
	}
}


