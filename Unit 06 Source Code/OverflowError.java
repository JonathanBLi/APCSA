/**
 *  OverflowError.java
 *
 *  Demonstrates overflow error.
 */

public class OverflowError 
{
	public static void main(String[] args) 
	{
		// A byte holds values from -128 to 127
		byte num = 10;
		while (num > 0)
		{
			System.out.print(num + "  ");
			num++;
		}
		System.out.println();
		System.out.println("After loop, num = " + num);
		System.out.println();
	}
}
