/*
 * ArrayListPractice.java
 *
 * Demonstrates using methods from an ArrayList of Strings
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice 
{
	public static void main(String[] args)  
	{
		// Create an ArrayList of Strings
		List<String> text = new ArrayList<String>();
		
		// Read in a line of text from the keyboard
		// Store each word as a separate element
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a line of text:");
		String quote = keyboard.nextLine();
		Scanner chopper = new Scanner(quote);
		while (chopper.hasNext()) 
		{
			text.add(chopper.next());
		}
		System.out.println();
		System.out.println("Initial List:");
		System.out.println("Size: " + text.size());
		System.out.println(text.toString());
		System.out.println();
		
		// Display all words ending with "ing"
		displayWordsEndingWith(text, "ing");
		
		// Remove words with length smaller than 5
		removeShortWords(text, 5);
		System.out.println("After removing short words:");
		System.out.println("Size: " + text.size());
		System.out.println(text.toString());
		System.out.println();
	}
	
	/** Displays those elements in words that end with ending
	 *  @param words list of words to check
	 *  @param ending the substring to find
	 */
	public static void displayWordsEndingWith(List<String> words, String ending)
	{
	}

	/** Removes those elements in words that have a length smaller than minLength
	 *  @param words list of words to check
	 *  @param minLength the smallest string length to keep in words
	 */
	public static void removeShortWords(List<String> words, int minLength)
	{
		for (int i = 0; i < words.size(); i++)
		{
			String word = words.get(i);
			if (word.length() < minLength)
			{
				words.remove(i);
				i--;
			}
		}
	}
}