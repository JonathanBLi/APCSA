/*
 * StandardInput.java
 *
 * Examples using standard input and output.
 */

import java.util.Scanner;

public class StandardInput 
{
	public static void main(String[] args) 
	{
		// Declare and instantiate Scanner object 
		// to read from standard input
		Scanner scan = new Scanner(System.in);
		
		// Input user's full name, age, gpa, favorite color
		System.out.print("Enter full name: ");
		String name = scan.nextLine();

		System.out.print("Enter age: ");
		int age = scan.nextInt();
		
		System.out.print("Enter gpa: ");
		double gpa = scan.nextDouble();
		scan.nextLine();
		
		System.out.print("Enter favorite color: ");
		String color = scan.next();
		
		System.out.println();
		System.out.println("name = " + name);
		System.out.println("age = " + age);
		System.out.println("gpa = " + gpa);
		System.out.println("color = " + color);
		System.out.println();
	}
}