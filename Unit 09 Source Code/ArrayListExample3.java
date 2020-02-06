/*
 * ArrayListExample3.java
 *
 * Demonstrates calling methods with the objects in an ArrayList
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample3 
{
	public static void main(String[] args)  
	{
		// Create an ArrayList of Strings
		List<String> words = populateList();
		
		// Show the size and the list
		System.out.println("Words:");
		System.out.println("Size: " + words.size());
		System.out.println(words.toString());
		System.out.println();
		
		// Count the total number of characters in the list
		int totalChar = 0;
		for (int index = 0; index < words.size(); index++)
		{
			String str = words.get(index);
			totalChar += str.length();
		}
		System.out.println("There are " + totalChar + " characters in the list");
		System.out.println();
	}
	
	/** Creates and returns an ArrayList of strings
	 *  @return ArrayList of words
	 */
	public static List<String> populateList()
	{
		List<String> text = new ArrayList<>();
		Scanner chop = new Scanner("Can I get a wolfpack? Plano West is #1");
		while (chop.hasNext())
		{
			text.add(chop.next());
		}
		return text;
	}

	
}