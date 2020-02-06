/*
 *  SortTest.java
 * 
 *  Test sorting algorithms using an array of integers
 */

import java.util.Arrays;
import java.util.Scanner;

public class SortTest 
{
	public static void main(String[] args) 
	{		
		Scanner scan = new Scanner(System.in);
		int[] values = null;
		boolean done = false;
		while (!done)
		{
			// display menu of choices
			System.out.println("Main Menu");
			System.out.println("1 - Instantiate array");
			System.out.println("2 - Display array");
			System.out.println("3 - Bubble Sort");
			System.out.println("4 - Insertion Sort");
			System.out.println("5 - Selection Sort");
			System.out.println("6 - Exit");
			
			// Call method based on choice
			System.out.print("Menu choice: ");
			int choice = scan.nextInt();
			System.out.println();

			if (choice == 1)
			{
				System.out.print("Array length: ");
				int len = scan.nextInt();
				values = random1DArray(len);
				System.out.println(Arrays.toString(values) + "\n");
			}
			else if (choice == 2)
			{
				System.out.println(Arrays.toString(values) + "\n");
			}
			else if (choice >= 3 && choice <= 5)
			{
				System.out.println("Sorting...");
				if (choice == 3)
					SortRoutines.bubbleSort(values);
				else if (choice == 4)
					SortRoutines.insertionSort(values);
				else if (choice == 5)
					SortRoutines.selectionSort(values);
				System.out.println(Arrays.toString(values) + "\n");
			}
			else if (choice == 6)
				done = true;
			else
				System.out.println("Invalid choice. Please try again.");
			System.out.println();
		}
	}
	
	/*
	 *	Create and return an array of len integers, filling 
	 *	with random values in the range [100,999]
	 */
	private static int[] random1DArray(int len)
	{
		int[] nums = new int[len];
		for (int k = 0; k < nums.length; k++)
			nums[k] = (int) (Math.random() * 900) + 100;
		return nums;
	}
}