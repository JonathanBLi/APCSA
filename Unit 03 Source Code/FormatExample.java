/*
 * FormatExample.java
 * Demonstrates use of System.out.printf and String.format methods
 */

public class FormatExample 
{
	public static void main(String[] args) 
	{
		
		// Formatting strings (s), integers (d), and floating-point numbers (f)
		System.out.printf("%8s \n", "hello");
		System.out.printf("%8d \n", 123);
		System.out.printf("%-8d \n", 123);
		System.out.printf("%8.2f \n", 246.579);
		System.out.printf("%7.3f %7.3f %7.3f \n", 1.2345, 23.45, 3.4567);
		System.out.printf("%.2f %.2f %.2f \n", 1.2345, 23.45, 3.4567);
		System.out.printf("Just format rounding: %.3f whatever\n", 2938.37987);
		System.out.println();
		
		String name = "Plano West";
		double num1 = 3.284937;
		int num2 = 43;
		System.out.printf("%-15s lalala %6.4f of stuff %3d\n", name, num1, num2);
		System.out.println();
		
		// Table Example
		int a1 = 42;
		double b1 = 1673.12389;
		double c1 = a1 * b1;
		int a2 = 1123;
		double b2 = 14.33;
		double c2 = a2 * b2;
		System.out.printf("Product 1: %6d %10.3f  %12.3f \n", a1, b1, c1);
		System.out.printf("Product 2: %6d %10.3f  %12.3f \n", a2, b2, c2);
		System.out.println();
	}
}