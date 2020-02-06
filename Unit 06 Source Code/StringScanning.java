/*
 *	StringScanning.java
 *
 *	Parsing (breaking apart) strings using the Scanner class
 */

import java.util.Scanner;

public class StringScanning 
{
	public static void main(String[] args) 
	{
		String line = "I love Plano West Senior High";
		Scanner parser = new Scanner(line);
		
		int numWords = 0;
		while (parser.hasNext()) 
		{
			String word = parser.next();
			System.out.println(word);
			numWords++;
		}
		System.out.println();

		System.out.println("\"" + line + "\"\nhas " + numWords + " words.");
		System.out.println();
	}
}