/**
 *   ForExample.java
 *   Demonstrate for statement
 */

public class ForExample
{
	public static void main(String[] args)
	{
		// Generate 50 random integers in range 10-99
		for (int count = 0; count < 50; count++)
		{
			int randInt = (int) (Math.random() * 90) + 10;
			System.out.print(randInt + "\t");
		}
		System.out.println("\n");
		
/*		
		// Display from 100 to -100 counting by 5's
		for (int num = 100; num >= -100; num -= 5)
			System.out.printf("%5d", num);
			
		System.out.println("\n");
*/
	}
}