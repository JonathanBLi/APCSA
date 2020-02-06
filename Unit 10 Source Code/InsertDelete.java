/**
 *	InsertDelete.java
 *
 *	Insert and delete elements from an array
 */

import java.util.Arrays; 

public class InsertDelete 
{
	// Data Members
	private static final int DEFAULT_CAPACITY = 200;
	private static final int NUM_INTEGERS_TO_ADD = 15;
	private static final int STARTING_MULTIPLE_VALUE = 10;
	
	private int[] numbers;
	private int numInArray;
	
	/**
	 *	Construct the array to have the default capacity
	 *	Add 15 integers that are multiples of 10 starting with 0
	 */
	public InsertDelete() 
	{
	}
	
	/**
	 *	Insert a single element by starting at end and shifting
	 *	elements to right until insertion point found
	 */
	public void insert(int value) 
	{
	}

	/**
	 *	Delete a specified item by searching for the matching item
	 *	and if found, shift items to left to remove it and reduce
	 *	the number of actual values stored in the array
	 */
	public boolean delete(int value) 
	{
		boolean found = false;
		return found;
	}


	/**
	 *	Return a string containing the array
	 */
	@Override
	public String toString() 
	{
		String str = "[";
		for (int index = 0; index < numInArray; index++)
		{
			str += numbers[index];
			if (index != numInArray - 1)
				str += ", ";
		}
		return str + "]";
	}
}