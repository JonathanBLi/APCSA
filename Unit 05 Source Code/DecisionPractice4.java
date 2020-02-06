/*
 * DecisionPractice4.java
 *
 * Practice using nested selection
 */

import java.util.Scanner;

public class DecisionPractice4 
{
	public static void main(String[] args) 
	{
		// Read in a floating-point GPA
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter GPA: ");
		double stuGPA = scan.nextDouble();
		System.out.println();

		if (stuGPA >= 0 && stuGPA <= 5)
			System.out.println(getGradStatus(stuGPA));
		else
			System.out.println("Invalid GPA not in range [0, 5].");
		System.out.println();
	}
	
		
	/* Returns student's graduation status base on the GPA:
	 *   summa cum laude  4.3 and up
	 *   magna cum laude  [4.0, 4.3)
	 *   cum laude        [3.6, 4.0)
	 *   graduating       [2.0, 3.6)
	 *   not graduating   below 2.0
	 *  @param gpa the student's GPA
	 *  @return student's graduation status
	 */
	public static String getGradStatus(double gpa)
	{
		String gradStatus = "Your GPA is " + gpa + "\n";
		
		// Graduating? 
		if (gpa >= 2.0)
		{
			String honors = "";
			if (gpa >= 4.3)
				honors = " summa cum laude";
				else if (gpa >= 4.0)
					honors = " magna cum laude";
					else if (gpa >= 3.6)
						honors = " cum laude";
						else
							honors = "!";
			gradStatus = gradStatus 
				+ "Congratulations! You're graduating" + honors;
		}
		// Not graduating? 
		else
		{
			gradStatus = gradStatus 
				+ "Sorry! You'll be attending summer school.";
		}
		
		return gradStatus;
	}
}


