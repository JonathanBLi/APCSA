/*
 * SearchTest.java
 * 
 * Test searching algorithms using an array of integers.
 */

import java.util.Arrays;
import java.util.Scanner;

public class SearchTest
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		// Randomly populated int array in range [10,99]
		int[] values = new int[20];
		for (int index = 0; index < values.length; index++)
		{
			values[index] = (int) (Math.random() * 90) + 10;
		}
		
		// Test linear search
		System.out.println("Testing linear search\n");
		boolean done = false;
		while (!done)
		{
			displayArray("Random Int Array:", values);
			System.out.print("Key (negative to quit): ");
			int key = scan.nextInt();
			if (key < 0)
			{
				done = true;
			}
			else
			{
				int index = SearchRoutines.linearSearch(values, key);
				if (index == -1)
					System.out.println(key + " not found.");
				else
					System.out.println(key + " found at index " + index);
				System.out.println();
			}
		}
		
		// Sort the array
		Arrays.sort(values);
		
		// Test binary search
		System.out.println("Testing binary search\n");
		done = false;
		while (!done)
		{
			displayArray("Ordered Int Array:", values);
			System.out.print("Key (negative to quit): ");
			int key = scan.nextInt();
			if (key < 0)
			{
				done = true;
			}
			else
			{
				int indexFound = SearchRoutines.binarySearch(values, key);
				if (indexFound == -1)
					System.out.println(key + " not found.");
				else
					System.out.println(key + " found at index " + indexFound);
				System.out.println();
			}
		}
	}
	
	/* Display the Java array
	 * @param title the description title to show
	 * @param array the array of integers to display
	 */
	public static void displayArray(String title, int[] array) 
	{
		System.out.println(title);
		for (int ndx = 0; ndx < array.length; ndx++) 
		{
			System.out.printf("%4d ", array[ndx]);
			if ((ndx + 1) % 10 == 0) 
				System.out.println();
		}
		System.out.println("\n");
	}
			
}