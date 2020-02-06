/*
 * BooleanExample.java
 *
 * Demonstrate the use of boolean variables
 */

import java.util.Scanner;

public class BooleanExample 
{
	public static void main(String[] args) 
	{
		boolean guess = true;
		System.out.println("guess? " + guess);

		guess = !guess;
		System.out.println("!guess? " + guess);
		System.out.println();
		
		int x = 5, y = 8;
		System.out.println("x = " + x + ", y = " + y);
		guess = x > 0 && x <= 0;
		System.out.println("x > 0 && x <= 0? " + guess);
		
		guess = x > 0 || x <= 0;
		System.out.println("x > 0 || x <= 0? " + guess);
		
		guess = x % 2 == 0 || y % 2 == 0;
		System.out.println("x % 2 == 0 || y % 2 == 0? " + guess);
		System.out.println();

	}
}


