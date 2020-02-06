/**
 *  SortRoutines.java
 *
 *  Set of methods that sort an array of integers
 */

public class SortRoutines 
{
	/**
	 *  Bubble Sort - in each pass, start at beginning of array, comparing
	 *  neighboring elements, swapping if out of order. Continue passes until
	 *  no swaps are made in a pass.
	 *  @param numbers an array of integers to sort
	 */
	public static void bubbleSort(int[] numbers) 
	{
		int temp, end, index;
		end = numbers.length - 1;
		boolean swapped = true;
		while (swapped && end > 0)  
		{
			swapped = false;
			for (index = 0; index < end; index++) 
			{
				// Need to swap?
				if (numbers[index] > numbers[index + 1]) 
				{
					temp = numbers[index];   
					numbers[index] = numbers[index + 1];
					numbers[index + 1] = temp;
					swapped = true;
				}
			}
			end--; // last one in place, shorten the pass
		}
	}
	
	/**
	 *  Insertion Sort - starting with the 2nd element [1] "insert" each 
	 *  element into the sorted list before it
	 *  @param numbers an array of integers to sort
	 */
	public static void insertionSort(int[] numbers) 
	{
		int index, key, position;
		for (index = 1; index < numbers.length; index++) 
		{
			// shift elements to right until insertion point found
			key = numbers[index];	
			position = index;
			while (position > 0 && key < numbers[position - 1]) 
			{
				numbers[position] = numbers[position - 1];
				position--;
			}
			numbers[position] = key;
		}
	}

	/**
	 *  Selection Sort - in each pass, find the next smallest value left and
	 *  swap into position
	 *  @param numbers an array of integers to sort
	 */
	public static void selectionSort(int[] numbers) 
	{
		int minIndex, length, temp, index;
		length = numbers.length;
		for (int startIndex = 0; startIndex + 1 < length; startIndex++) 
		{
			minIndex = startIndex;
			for (index = startIndex + 1; index < length; index++) 
			{
				if (numbers[index] < numbers[minIndex]) 
					minIndex = index;
			}
			
			// Swap numbers[startIndex] and numbers[minIndex]
			temp = numbers[startIndex];
			numbers[startIndex] = numbers[minIndex];
			numbers[minIndex] = temp;
		}
	}
}