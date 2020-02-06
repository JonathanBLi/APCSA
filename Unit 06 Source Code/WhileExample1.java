/**
 *   WhileExample1.java
 *   Generate 50 random integers in range 10-99
 */

public class WhileExample1
{
	public static void main(String[] args)
	{
		int count = 0; // always declare and initialize loop control variable
		while (count < 50) // never put a ; here
		{
			int num = (int) (Math.random() * 90) + 10;
			System.out.print(num + "\t");
			count++; // always update the LCV
		}
		System.out.println();
		count = 50; // always declare and initialize loop control variable
		while (count > 0) // never put a ; here
		{
			int num = (int) (Math.random() * 90) + 10;
			System.out.print(num + "\t");
			--count; // always update the LCV
		}
		System.out.println();
	}
}