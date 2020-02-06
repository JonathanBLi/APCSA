/*
 * StringFormat.java
 * Demonstrates use of System.out.printf and String.format methods
 */

import java.util.Scanner;

public class StringFormat 
{
	public static void main(String[] args) 
	{
		// Formatting to store in a string (great for toString methods)
		System.out.println("5 Random numbers in range [0, 1000):");
		String result = genNumbers(5);
		System.out.println(result);
		System.out.println();
		
		System.out.println("Set of 10 numbers:");
		result = genNumbers(10);
		System.out.println(result);
		System.out.println();
	}
	
	/** Creates a string with num random numbers in range
	 *   [0, 1000) on separate lines with decimal points aligned
	 *   @param num the quantity of numbers to generate
	 *   @return num random numbers aligned on separate lines
	 */
	public static String genNumbers(int num)
	{
		String numStr = "";
		double randomNum;
		for (int count = 1; count <= num; count++)
		{
			randomNum = Math.random() * 1000;
			numStr += String.format("%9.3f\n", randomNum);
		}
		return numStr;
	}
}