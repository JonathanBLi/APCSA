/**
 *	SearchRoutines.java
 *
 *	Set of methods that search for a value in an array of integers
 */

public class SearchRoutines 
{
	/**
	 * Linear Search - begin searching at beginning, stopping when found or
	 * list exhausted
	 * @param numbers an array of integers to sort
	 * @param key value to find
	 * @return index at which key found; -1 if not found
	 */
	public static int linearSearch(int[] numbers, int key) 
	{
		for (int index = 0; index < numbers.length; index++) 
		{
			if (numbers[index] == key)
				return index;
		}
		return -1;
	}
	
	/**
	 * Binary Search - begin searching in middle, discarding half of remaining
	 *array from search area until found or array exhausted
	 * @param numbers an array of integers to sort
	 * @param key value to find
	 * @return index at which key found; -1 if not found
	 */
	public static int binarySearch(int[] numbers, int key) 
	{
		int low = 0;
		int high = numbers.length - 1;
		while (low <= high) 
		{
			int middle = (low + high) / 2;
			if (numbers[middle] == key)
				return middle;
			else if (key < numbers[middle])
				high = middle - 1;
			else
				low = middle + 1;
		}
		return -1;
	}
}