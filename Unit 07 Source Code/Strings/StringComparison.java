/*
 *	StringComparison.java
 *
 *	Demonstrate how String objects are compared
 */

public class StringComparison 
{
	public static void main(String[] args) 
	{
		String str1 = new String("COMPUTER");
		String str2 = new String("computer");
		String str3 = "computer";
		String str4 = "computer";
		String str5 = str1;
		
		System.out.println("str1:  " + str1);
		System.out.println("str2:  " + str2);
		System.out.println("str3:  " + str3);
		System.out.println("str4:  " + str4);
		System.out.println("str5:  " + str5);
		System.out.println();

		// Comparing with == and .equals
		System.out.println("str1 == str2? " + (str1 == str2));
		System.out.println("str2 == str3? " + (str2 == str3));
		System.out.println("str3 == str4? " + (str3 == str4));
		System.out.println();
		
		// How does the compareTo method work?
		System.out.println("str1.compareTo(str2)? " +
			(str1.compareTo(str2)));
		System.out.println("str2.compareTo(str1)? " +
			(str2.compareTo(str1)));
		System.out.println("str2.compareTo(str3)? " +
			(str2.compareTo(str3)));
		System.out.println();

		String science = "science";
		String program = "program";
		System.out.println("science: " + science);
		System.out.println("program: " + program);
		System.out.println("science.compareTo(program)? " +
			(science.compareTo(program)));
		System.out.println("program.compareTo(science)? " +
			(program.compareTo(science)));
		System.out.println();
	}
}