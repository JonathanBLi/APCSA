/**
 *  WhileExample2.java
 *  Uses a while loop to ensure a GPA is in the correct range. 
 */

import java.util.Scanner;

public class WhileExample2 
{
	public static void main(String[] args) 
	{
		// Read in a floating-point GPA, making sure it
		// is in the range [0.0, 5.0]
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter GPA: ");
		double stuGPA = scan.nextDouble();
		System.out.println();

		
		
		
		System.out.println(getGradStatus(stuGPA));
		System.out.println();		
	}
		
	/* Returns student's graduation status base on the GPA:
	 *   summa cum laude  4.3 and up
	 *   magna cum laude  [4.0, 4.3)
	 *   cum laude        [3.6, 4.0)
	 *   graduating       [2.0, 3.6)
	 *   not graduating   below 2.0
	 * @param gpa the student's GPA
	 *    Precondition: 0.0 <= gpa <= 5.0
	 * @return student's graduation status
	 */
	public static String getGradStatus(double gpa)
	{
		String gradStatus = "Your GPA is " + gpa + "\n";
		if (gpa >= 2.0)
		{
			gradStatus += "Congratulations! You're graduating";
			if (gpa >= 4.3)
				gradStatus += " summa cum laude!";
			else if (gpa >= 4.0)
				gradStatus += " magna cum laude!";
			else if (gpa >= 3.6)
				gradStatus += " cum laude!";
			else
				gradStatus += ".";
		}
		else
		{
			gradStatus += "Sorry! You'll be attending summer school.";
		}
		return gradStatus;
	}
}
