/*
 * MixedModeOperations.java
 *
 * Examples demonstrating mixing of ints and doubles in
 * expressions.
 */

public class MixedModeOperations 
{
	public static void main(String[] args) 
	{
		int a = -5;  
		int b = 8;  
		int c = 27;
		double x = -123.5;
		double y = a + b + x;
		double z = 3.7428;
		System.out.println("a = " + a + "  b = " + b + "  c = " + c);
		System.out.println("x = " + x + "  y = " + y + "  z = " + z);
		System.out.println();
		
		// Assigning ints to doubles
		x = a;
		y = c % b;
		System.out.println("x = " + x + "  y = " + y);
		System.out.println();
		
		// Assigning a double to an int
		x = -123.5;
//		a = x;
		System.out.println("a = " + a + ", x = " + x);
		System.out.println();
		
		// Using casting with division
		double div1 = 23 / 5;
		double div2 = (double) 23 / 5;
		double div3 = 23 / (double) 5;
		double div4 = (double) (23 / 5);
		System.out.println("23 / 5 = " + div1);
		System.out.println("(double) 23 / 5 = " + div2);
		System.out.println("23 / (double) 5 = " + div3);
		System.out.println("(double) (23 / 5) = " + div4);
		System.out.println();
		
		// Be careful when mixing concatenation and addition
		System.out.println("hello" + 4 + 2);
		System.out.println("hello" + (4 + 2));
		System.out.println(4 + 2 + "hello");
		System.out.println();

	}
}