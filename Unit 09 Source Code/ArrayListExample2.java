/*
 * ArrayListExample2.java
 *
 * Demonstrates creating an ArrayList of integers
 */

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample2 
{
	public static void main(String[] args) 
	{
		// Create an ArrayList of integers 
		List<Integer> numbers = new ArrayList<Integer>(); 
		
		// Show the size
		System.out.println("Size: " + numbers.size());
		System.out.println();
		
		// Add 10 random integers [10-99] to the list




		
		// Show the size and the list
		System.out.println("Size: " + numbers.size());
		System.out.println(numbers + "\n");
		
		// Insert 200 at index 1, and 500 at the end
		// Show the results
		
		
		
		
		
		// Increase all of the values in the list by 50
		increaseAll(numbers, 50);
		System.out.println("After increasing all by 50:");
		System.out.println(numbers + "\n");
		
		// Find the smallest value in the list
		System.out.println("Smallest value: " + findSmallest(numbers));
		System.out.println();
	}
	
	/** Increases each value in nums by value in addedValue
	 *  @param nums list of integers to check
	 *  @param addedValue value to add to each element
	 */
	public static void increaseAll(List<Integer> nums, int addedValue)
	{
	}
	
	/** Determines and returns the smallest value in nums
	 *  @param nums list of integers to check
	 *  @return smallest value found in nums
	 */
	public static int findSmallest(List<Integer> nums)
	{
		return 0;
	}
}