/** Practice scanning strings
 */

import java.util.Scanner;

public class StringScanningPractice
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a line of text: ");
		String text = keyboard.nextLine();
		System.out.println();
		
		int num = numStartWithVowel(text);
		System.out.println("Number of words starting with a vowel: " 
			+ num);
		System.out.println();
	}

	/** Determine the number of strings in line that start with a vowel
	 *   @param line the line of text to examine
	 *   @return the number of words in line starting with a vowel
	 */
	public static int numStartWithVowel(String line)
	{
		int count = 0;
		String tempLine = line.toLowerCase();
		Scanner chop = new Scanner(tempLine);
		return count;
	}

}