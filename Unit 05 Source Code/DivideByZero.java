/*
 * DivideByZero.java
 *
 * Practice using short-circuiting
 */

import java.util.Scanner;

public class DivideByZero 
{
	public static void main(String[] args) 
	{
		// Read in two integer values
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter two integers: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		System.out.println();
		
		// Display "We have a winner" if quotient is positive
		if (num2 != 0 && num1 / num2 > 0)
			System.out.println("We have a winner");
		
		
		System.out.println();
	}
}


