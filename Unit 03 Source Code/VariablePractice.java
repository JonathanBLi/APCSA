/*
 * VariablePractice.java
 *
 * Demonstrate of working with variables in Java
 */

public class VariablePractice 
{
	public static void main(String[] args) 
	{
		int x = 10;
		System.out.println("x = " + x);
		double y = 4.35;
		System.out.println("y * 100 = " + y * 100);
		float z = 4.35f;
		System.out.println("z * 100 = " + z * 100);
		
		// Declare three integer variables (test1, test2, test3)
		// in one statement to store three different test scores
		int test1, test2, test3;
		
		// Assign 100 to test1
		test1 = 100;
		
		// In a single statement, assign 93 to both test2 and test3
		test2 = test3 = 93;
		
		// Increase test2 by 4 points - there was a curve! Add 4 and store 
		// the value BACK in the SAME variable.
		test2 += 4;
		
		
		// Declare and initialize a floating point number variable, average,
		// in one statement. Initialize the average to 0.
		double average = 0.0;
		average = (test1 + test2 + test3) / 0.0;
		
		// Write the statements to display the contents of all 4
		// variables
		System.out.println("Tests: " + test1 + ", " + test2 + ", " + test3);
		System.out.println("Average: " + average);
		System.out.println();
		
		
	}
}