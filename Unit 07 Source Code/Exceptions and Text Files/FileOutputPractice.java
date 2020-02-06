/*
 * FileOutputPractice.java
 * Demo use of PrintWriter class to output to file
 */

import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputPractice 
{
	public static void main(String[] args) 
	{
		try 
		{
			// Open the outputPractice.txt file for output
			PrintWriter file = new PrintWriter("outputPractice.txt");
			
			
			// Generate the random integer in range [50, 60]
			// this is the number of integers to be output
			int rand = (int) (Math.random() * 11) + 50;
			
			
			// Generate the chosen number of random integers in
			// the range [100, 200] and write them to the file.
			for (int i = 0; i < rand; i++)
			{
				int rnd = (int) (Math.random() * 101) + 100;
				file.print(rnd + " ");
				if ((i + 1) % 10 == 0)
					file.println();
			}
			
			
			// Close the file!
			file.close();
			
		}
		catch (IOException exception) 
		{
			System.out.println("Error processing file: " + exception);
		}
	}
}