/*
 * DecisionPractice3.java
 *
 * Practice using complex boolean conditions
 */

import java.util.Scanner;

public class DecisionPractice3 
{
	public static void main(String[] args) 
	{
		// Read in a floating-point GPA
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter GPA: ");
		double stuGPA = scan.nextDouble();
		
		// Display an error message if the GPA is invalid
		// A valid GPA is at least 0 and no more than 5.0
		if (stuGPA < 0 || stuGPA > 5)
			System.out.println("Invalid GPA!");
		// Give the graduation status
		
		
		
	}
	
	/** Display graduation status based on gpa
	 *  @param gpa the student's GPA
	 */
	public static void showGradStatus(double gpa)
	{
		if (gpa < 2.0)
		{
			System.out.println("Sorry, you're not graduating.");
		}
		else
		{
			System.out.println("You're a graduate!");
		}
		
		if (gpa >= 3.6)
		{
			System.out.println("Congratulations, Honors Graduate!");
		}
	}
}


