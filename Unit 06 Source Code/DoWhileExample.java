/**
 *  DoWhileExample.java
 *
 *  Demonstrates do-while loop structure. 
 */

import java.util.Scanner;

public class DoWhileExample 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		// Use a do-while statement to enter a valid GPA
		double gpa;
		boolean valid;
		do // never put a ; here
		{
			System.out.print("Enter GPA: ");
			gpa = scan.nextDouble();
			valid = (gpa >= 0 && gpa <= 5);
			if (!valid) 
				System.out.println("Invalid. Try again.\n");
		} 
		while (!valid);
		
		System.out.println("GPA entered:  " + gpa);
		System.out.println();
		
		// Compare the difference in output	
		System.out.println("print then increase");
		int k = 15;
		do 
		{
			System.out.println(k + "  ");
			k += 2;
		} 
		while (k < 20);
		System.out.println("\n");
		
		System.out.println("increase then print");
		k = 15;
		do 
		{
			k += 2;
			System.out.println(k + "  ");
		} 
		while (k < 20);
		System.out.println("\n");


		// Compare the difference in output	
		System.out.println("while loop");
		k = 5;
		while (k < 10) 
		{
			System.out.println(k + "  ");
			k++;
		}
		System.out.println("Loop over; k = " + k + "\n");
		
		System.out.println("do-while loop");
		k = 5;
		do 
		{
			System.out.println(k + "  ");
			k++;
		} 
		while (k < 10);
		System.out.println("Loop over; k = " + k + "\n");

	}
}