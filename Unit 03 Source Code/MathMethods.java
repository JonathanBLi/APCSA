/*
 * MathMethods.java
 *
 * Demonstrate use of Math Class
 */

import java.util.Scanner;

public class MathMethods 
{
	public static void main(String[] args) 
	{
		// Constants
		System.out.println("E  = " + Math.E);
		System.out.println("PI = " + Math.PI);
		System.out.println();
		
		// Absolute Value
		int x = Math.abs(-235);
		double y = Math.abs(-7.5);
		System.out.println("|-235| = " + x);
		System.out.println("|-7.5| = " + y);
		System.out.println();
		
		// Rounding
		System.out.println("round(-12.8) = " + Math.round(-12.8));
		System.out.println("round(-12.3) = " + Math.round(-12.3));
		System.out.println("round(12.34) = " + Math.round(12.34));
		System.out.println("round(12.50) = " + Math.round(12.5));
		System.out.println("round(12.82) = " + Math.round(12.82));
		System.out.println();
		
		// Rounding Up
		System.out.println("ceil(-3.8)  = " + Math.ceil(-3.8));
		System.out.println("ceil(-3.6)  = " + Math.ceil(-3.6));
		System.out.println("ceil(12.34) = " + Math.ceil(12.34));
		System.out.println("ceil(12.85) = " + Math.ceil(12.85));
		System.out.println("ceil(12)    = " + Math.ceil(12));
		System.out.println();
		
		// Rounding Down 
		System.out.println("floor(-3.8)  = " + Math.floor(-3.8));
		System.out.println("floor(-3.6)  = " + Math.floor(-3.6));
		System.out.println("floor(12.34) = " + Math.floor(12.34));
		System.out.println("floor(12.85) = " + Math.floor(12.85));
		System.out.println("floor(12)    = " + Math.floor(12));
		System.out.println();
		
		// Finding the minimum and maximum
		Scanner read = new Scanner(System.in);
		System.out.print("Enter 3 integers: ");
		int a = read.nextInt();
		int b = read.nextInt();
		int c = read.nextInt();
		System.out.println("min(" + a + ", " + b + ") = " + Math.min(a, b));
		System.out.println("min(" + b + ", " + c + ") = " + Math.min(b, c));
		System.out.println("min(" + a + ", " + c + ") = " + Math.min(a, c));
		System.out.println();
		System.out.println("max(" + a + ", " + b + ") = " + Math.max(a, b));
		System.out.println("max(" + b + ", " + c + ") = " + Math.max(b, c));
		System.out.println("max(" + a + ", " + c + ") = " + Math.max(a, c));
		System.out.println();
		
		// Finding the square root
		System.out.println("sqrt(16)     = " + Math.sqrt(16));
		System.out.println("sqrt(210.25) = " + Math.sqrt(210.25));
		System.out.println();

		// Raising to a Power
		System.out.println("pow(2, 5) = " + Math.pow(2, 5));
		System.out.println("pow(5, 2) = " + Math.pow(5, 2));
		System.out.println();

		// Generating a random value
		System.out.println("[0.0, 1.0) = " + Math.random());
		System.out.println("[0.0, 7.0) = " + (Math.random() * 7));
		System.out.println("[0.5, 5.0) = " + ((Math.random() * 4.5) + 0.5));
		System.out.println("[0, 1]     = " + (int) (Math.random() * 2));
		System.out.println("[1, 6]     = " + ((int) (Math.random() * 6) + 1));
		System.out.println("[40, 100]  = " + ((int) (Math.random() * 61) + 40));
		System.out.println();
	
		double num = Math.random() * 20 + 15.5;
		System.out.println(num);
		System.out.println((int) (Math.random() * 900) + 100);
		System.out.println(Math.random() * (Math.sqrt(5) - Math.sqrt(2)) + Math.sqrt(2));
	}
}