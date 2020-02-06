/*
 *	AutoBoxingExample.java
 *
 * Demonstrate Java 5.0 auto-boxing and auto-unboxing
 */

public class AutoBoxingExample
{
	public static void main(String[] args) 
	{
		// Java automatically constructs the wrapper object
		Integer intObj = 1492;
		
		// Java automatically unwraps the wrapper object
		int num = intObj / 10;
		
		System.out.println("intObj: " + intObj);
		System.out.println("num:      " + num);
		System.out.println();
		
		// Java automatically unwraps and wraps to perform
		// arithmetic operations
		intObj--;
		System.out.println("intObj: " + intObj);
		System.out.println();
		
		// Comparing Integer objects
		Integer a = new Integer(4000);
		Integer b = new Integer(4000);
		boolean checkEqOp = (a == b);
		boolean checkEquals = (a.equals(b));
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("a == b? " + checkEqOp);
		System.out.println("a.equals(b)? " + checkEquals);
		System.out.println();
	}
}
