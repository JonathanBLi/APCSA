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
		
		double avg = getAverage(text);
		System.out.printf("Average of integers in text: %.4f \n", avg);
		System.out.println();
	}

	/** Calculate the average of the integers that appear in a line of text
	 *   @param line the line of text to examine
	 *   @return the average of the integers in line (0 if there are none)
	 */
	public static double getAverage(String line)
	{
		int count = 0;
		double sum = 0;

		Scanner sc = new Scanner(line);
		while (sc.hasNext())
		{
			if (sc.hasNextInt())
			{
				sum += sc.nextInt();
				count++;
			}
			else
			{
				sc.next();
			}
		}

		if (count == 0)
			return 0;
		else
			return sum / count;
	}
}