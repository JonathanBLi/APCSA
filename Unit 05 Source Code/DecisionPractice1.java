/*
 * DecisionPractice1.java
 *
 * Practice using if and if-else statements
 */

public class DecisionPractice1 
{
	public static void main(String[] args) 
	{
		// Generate and display a random GPA in the range [1.5, 5.0)
		
		double gpa = Math.random() * 3.5 + 1.5;
		System.out.printf("GPA: %.4f\n", gpa);
		
		// A student must have a minimum GPA of 2.0 to graduate.  
		// Display whether or not the student is graduating.
		
		if (gpa >= 2.0)
		{
			System.out.println("You are graduating.");
		}
		else
		{
			System.out.println("You are not graduating.");
		}
		
		// A student graduates with honors with a GPA of 3.6 and higher. 
		// Display congratulations for the student graduating with honors.
	
		if (gpa >= 3.6) {
			System.out.println("Congratulations for graduating with honors.");
		}
		
	}
}


