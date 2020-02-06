/*
 * FileInputPractice.java
 * Practice using Scanner class to input from file
 */

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileInputPractice 
{
	public static void main(String[] args) 
	{
		try 
		{
			// Open "outputPractice.txt" for input
			Scanner sc = new Scanner(new File("outputPractice.txt"));
			
			// Read all of the integers in the file
			// Calculate and display the smallest and largest values found)
			if (sc.hasNextInt())
			{
				int min = sc.nextInt();
				int max = min;
				while (sc.hasNextInt())
				{
					int temp = sc.nextInt();
					if (temp < min)
						min = temp;
					if (temp > max)
						max = temp;
				}
				System.out.println("The smallest integer is: " + min);
				System.out.println("The largest integer is: " + max);
				sc.close();
			}
			else
				System.out.println("There are no integers in your file");



		}
		catch (IOException exception) 
		{
			System.out.println("Error processing file: " + exception);
		}
	}
}