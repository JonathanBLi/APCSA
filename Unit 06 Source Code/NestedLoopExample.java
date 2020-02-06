/**
 *  NestedLoopExample.java
 *
 *  Demonstrates nested loop structures. 
 */

import java.util.Scanner;

public class NestedLoopExample 
{
	public static void main(String[] args) 
	{
		// Notice how the values for val get reset with 
		// each iteration of the outer loop
		for (int num = 1; num <= 5; num++) 
		{
			System.out.print("num = " + num + "  val: ");
			for (int val = 1; val <= 10; val++) 
			{
				System.out.print(val + "  ");
			}
			System.out.println();
		}
		System.out.println("\n\n");
		
		// Demo how nested loops can be used to
		// make tables
		for (int num = 1; num <= 5; num++) 
		{
			for (int mult = 1; mult <= 10; mult++) 
			{
				System.out.printf("%4d", (num * mult));
			}
			System.out.println();
		}
		System.out.println("\n\n");
		
		// Demo how nested loops can be used make rows of *'s
		// Notice how the outer loop controls # of rows,
		// inner loop controls # columns
		for (int row = 1; row <= 5; row++) 
		{
			for (int col = 1; col <= 10; col++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n\n");
		
		// Demo how changing the outer loop to go backward
		// and the inner loop to rely on the outer loop's
		// control variable make decreasing # of *'s
		for (int row = 1; row <= 5; row++) 
		{
			for (int col = 1; col <= row; col++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	
	}
}