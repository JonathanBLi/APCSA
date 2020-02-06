/*
 * ArrayListExample1.java
 *
 * Demonstrates creating an ArrayList of Strings
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListExample1 
{
	public static void main(String[] args)  
	{
		// Create an ArrayList of Strings
		List<String> text = new ArrayList<String>();
		
		// Show the size and the list
		System.out.println("After instantiation:");
		System.out.println("Size: " + text.size());
		System.out.println("List: " + text.toString());
		System.out.println();
		
		// Read in a line of text from the keyboard
		// Store each word as a separate element
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a line of text:");
		String quote = keyboard.nextLine();

		System.out.println("Building list:");
		Scanner chopper = new Scanner(quote);
		while (chopper.hasNext()) 
		{
			String word = chopper.next();
			text.add(word);
			System.out.println("Size: " + text.size());
			System.out.println("List: " + text.toString());
		}
		System.out.println();
	
		// Insert your first name at the beginning of the list
		
		
		
		// Append your last name at the end of the list
		
		
		
		// Show the size and the list
		
		
		
		
		// Display in reverse order
		displayReverse(text);
	}
	
	/** Displays each element of words in reverse order
	 *  @param words list of words to display
	 */
	public static void displayReverse(List<String> words)
	{
	}
}