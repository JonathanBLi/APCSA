/**
 * The FilesLab class runs a series of commands to extract data from and write data to text
 * files. It also handles exceptions for negative tests.
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 12/11/19
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilesLab 
{
	public static void main(String[] args) 
	{
		try
		{
			// run 70-point version
			processIntegers("test1.txt", "output1.txt");
			System.out.println();
			
			// run 85-point version
			testLines("test2a.txt", "output2a.txt");
			
			// run 85-point version
			testLines("test2b.txt", "output2b.txt");
			System.out.println();
			
			// run 100-point version - good data
			extractSubstrings("test3a.txt", "output3a.txt");		
			
			// run 100-point version - bad data
			extractSubstrings("test3b.txt", "output3b.txt");		
			System.out.println();
		}
		catch (Exception exc)
		{
			System.out.println("Error opening file: " + exc.getMessage());
		}
	}
	
	/**
	 * Reads in integer N, the number of sets of 3 integers, from inFile.
	 * For each set, the minimum and maximum value is written to outFile.
	 * 
	 * @param inFile name of input file
	 * @param outFile name of output file
	 * @throws FileNotFoundException if inFile is not found
	 */
	public static void processIntegers(String inFile, String outFile) throws FileNotFoundException
	{
		// declare and instantiate input/output streams
		Scanner sc = new Scanner(new File(inFile));
		PrintWriter pw = new PrintWriter(new File(outFile));

		int N = sc.nextInt();
		for (int i = 0; i < N; i++)
		{
			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < 3; j++)
			{
				int cur = sc.nextInt();
				min = Math.min(min, cur);
				max = Math.max(max, cur);
			}
			pw.println(min + "  " + max);
		}

		// update message
		System.out.println("Smallest and largest integers from " + inFile 
			+ " written to " + outFile);

		// close streams
		sc.close();
		pw.close();
	}
	
	/**
	 * Reads in a string to find from inFile. For each following line in inFile,
	 * the line is printed to outFile if the string to find is contained in the sentence,
	 * ignoring case.
	 * 
	 * @param inFile name of input file
	 * @param outFile name of output file
	 * @throws FileNotFoundException if inFile is not found
	 */
	public static void testLines(String inFile, String outFile) throws FileNotFoundException
	{
		// declare and instantiate input/output streams
		Scanner sc = new Scanner(new File(inFile));
		PrintWriter pw = new PrintWriter(new File(outFile));

		String toFind = sc.nextLine();
		while (sc.hasNextLine())
		{
			String line = sc.nextLine();
			String lowerLine = line.toLowerCase();
			if (lowerLine.contains(toFind.toLowerCase()))
				pw.println(line);
		}

		// update message
		System.out.println("Lines containing \"" + toFind + "\" from " + inFile + " written to " + outFile);

		// close streams
		sc.close();
		pw.close();
	}
	
	/**
	 * For each line in inFile, scans in hard left bound and soft right bound to
	 * query the substring for. Outputs substring to outFile surrounded by colons
	 * if the substring is valid and an error message if the substring is invalid.
	 * 
	 * @param inFile name of input file
	 * @param outFile name of output file
	 * @throws FileNotFoundException if inFile is not found
	 */
	public static void extractSubstrings(String inFile, String outFile) throws FileNotFoundException
	{
		// declare and instantiate input/output streams
		Scanner sc = new Scanner(new File(inFile));
		PrintWriter pw = new PrintWriter(new File(outFile));

		while (sc.hasNextLine())
		{
			int leftBound = sc.nextInt(), rightBound = sc.nextInt();
			String str = sc.nextLine().substring(1);

			try
			{
				String sub = getSubstring(leftBound, rightBound, str);
				pw.printf(":%s:\n", sub);
			}
			catch(IllegalArgumentException e)
			{
				pw.printf("Error in file %s: %s\n", inFile, e.getMessage());
			}
		}

		// update msg
		System.out.println("Requested substrings from " + inFile + " written to " + outFile);

		// close streams
		sc.close();
		pw.close();
	}
	
	/**
	 * Extracts substring of string.
	 * 
	 * @param index1 inclusive left bound of index
	 * @param index2 exclusive right bound of index
	 * @throws IllegalArgumentException if either index is out of bounds
	 */
	private static String getSubstring(int index1, int index2, String text) throws IllegalArgumentException
	{
		try {
			return text.substring(index1, index2);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			throw new IllegalArgumentException(String.format("Invalid indexes [%d, %d) for \"%s\"", index1, index2, text));
		}
	}
}