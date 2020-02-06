/*
 * ComparisonExample.java
 *
 * Demonstrates difference between comparing
 * primitive and object variables
 */

import java.util.Scanner;

public class ComparisonExample 
{
	public static void main(String[] args) 
	{
		// Instantiate a Scanner object
		Scanner reader = new Scanner(System.in);
		
		// Read in 2 integer
		int intVar1, intVar2;
		System.out.print("Enter 2 integers: ");
		intVar1 = reader.nextInt();
		intVar2 = reader.nextInt();
		
		// Display whether or not they're the same value
		System.out.println("\nValues: " + intVar1 + "  " + intVar2);
		if (intVar1 == intVar2) 
		{
		   System.out.println("The integers are the same");
		}
		else 
		{
		   System.out.println("The integers are different");
		}
		System.out.println();		
		
		// Clear out "enter" key from last input
		reader.nextLine();
		
		// Read in 2 strings
		String str1, str2;
		System.out.print("Enter a string: ");
		str1 = reader.nextLine();
		System.out.print("Enter a string: ");
		str2 = reader.nextLine();
		
		// Display whether or not they're the same value
		System.out.println("\nValues: " + str1 + "  " + str2);
		if (str1 == str2) 
		{
		   System.out.println("The strings are the same");
		}
		else 
		{
		   System.out.println("The strings are different");
		}
		System.out.println();		
	}
}


