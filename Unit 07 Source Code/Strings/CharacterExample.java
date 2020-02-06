/*
 *	CharacterExample.java
 * Demonstrates character comparisons in Java
 */

public class CharacterExample
{
	public static void main(String[] args)
	{
		char littleA = 'a';
		char littleZ = 'z';
		char bigA = 'A';
		char bigZ = 'Z';
		char zero = '0';
		char nine = '9';
		
		// All characters have an integer equivalent
		System.out.println(littleA + " = " + (int) littleA);
		System.out.println(littleZ + " = " + (int) littleZ);
		System.out.println(bigA + " = " + (int) bigA);
		System.out.println(bigZ + " = " + (int) bigZ);
		System.out.println(zero + " = " + (int) zero);
		System.out.println(nine + " = " + (int) nine);
		System.out.println();
		
		// Can use arithmetic operators with characters
		int diff1 = littleZ - littleA;
		System.out.println("z - a: " + diff1);
		
		int diff2 = littleA - bigA;
		System.out.println("a - A: " + diff2);
		
		char ch = (char) (littleA + 10);
		System.out.println("a + 10: " + ch);
		System.out.println();
		
		// Can use relational operators
		boolean littleAtoZ = (littleA < littleZ);
		System.out.println(littleA + " < " + littleZ + "? " + littleAtoZ);
		
		boolean aToA = (littleA < bigA);
		System.out.println(littleA + " < " + bigA + "? " + aToA);
		System.out.println();
		
		// Print some of the ASCII table (32 through 127)
		int count = 1;
		for (int value = 32; value < 128; value++)
		{
			System.out.print((char) value + "  ");
			if (count % 10 == 0) 
				System.out.println();
			count++;
		}
		System.out.println("\n");
		for (int i = 0; i < 5; i++)
		{
			char rand = (char) (Math.random() * ('z' - 'a' + 1) + 'a');
			System.out.println(rand);
		}
	}
}