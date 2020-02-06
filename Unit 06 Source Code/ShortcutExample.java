/**
 *  ShortcutExample.java
 *  Demonstrate the use of short-cut notation with numeric
 *  types and strings
 */
 
import java.util.Scanner;

public class ShortcutExample
{
	public static void main(String[] args)
	{
		int num = 7;
		num += 10;
		num *= 4;
		num -= 5;
		num /= 3;
		num %= 8;
		System.out.println("num: " + num);
		System.out.println();
		

		// Increment and decrement operators
		num++;
		System.out.println("After num++: " + num);
		
		num--;
		System.out.println("After num--: " + num);
		
		System.out.println("Using --num: " + --num);
		System.out.println("After --num: " + num);
		System.out.println("Using num--: " + num--);
		System.out.println("After num--: " + num);
		System.out.println();



		// Add to the end of a string
		String str = "Comp";
		str = str + "uter Sci";
		System.out.println("str: " + str);
		str += "ence";
		System.out.println("str: " + str);
		System.out.println();

	}
}