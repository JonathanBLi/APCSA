/*
 *	Strings.java
 *
 *	Demonstrate String variables and assignments
 */

public class Strings
{
	public static void main(String[] args)
	{
		// Declaring and assigning values to String variables
		String school;
		school = new String("Plano West");
		
		String mascot = new String("Wolves");
		
		String yell = "Wolf Pack!";
		
		// Use concatenation to put strings together in prints
		System.out.println("school: " + school);
		System.out.println("mascot: " + mascot);
		System.out.println();
		
		// Create a new string using concatenation
		String cheer = "Gimme a " + yell;
		System.out.println(cheer);
		System.out.println();
		
		// Concatenating strings and numbers
		double gpa = 3.95;
		System.out.println("My GPA is " + gpa);
		System.out.println();
		
		// Determining number of characters in a string
		int count = school.length();
		System.out.println(school + " length is " + count);
		System.out.println();
		
		String name = "Jonathan Li";
		System.out.println("I have " + name.length() + " letters in my name");
		String practice = 5 + 5 + "number";
		System.out.println(practice);
	}
}