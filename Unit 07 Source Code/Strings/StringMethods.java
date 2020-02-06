/*
 *	StringMethods.java
 *
 *	Demonstrate numerous String methods
 */

public class StringMethods 
{
	public static void main(String[] args) 
	{

//-------------------------------------------------------------------
//		Accessing individual characters
//-------------------------------------------------------------------
		String day = new String("Saturday");

		// Show each character on a separate line
		for (int index = 0; index < day.length(); index++) 
		{
			System.out.println("Index: " + index + ":" 
				+ day.charAt(index) + ":");
		}
		System.out.println();

		// What if negative index? length() as index?
//		System.out.println("Index -5: " + day.charAt(-5));
//		System.out.println("Index length(): " + day.charAt(day.length()));
		System.out.println("" + day.charAt(0) + day.charAt(day.length() - 1));
		for (int i = 0; i < day.length(); i++)
		{
			char let = day.charAt(i);
			if (let >= 'a' && let <= 'd')
				System.out.println(let);
		}
		System.out.println();
		
//-------------------------------------------------------------------
//		Searching
//-------------------------------------------------------------------

		String shop = new String("Are you finished shopping?");
		String str1 = new String("SHOP");
		String str2 = new String("shop");
		
		System.out.println("01234567890123456789012345\n"
			+ shop);
		System.out.println();
		
		// Length of shop
		System.out.println("Length: " + shop.length());
		
		// Search for "you" inside shop
		System.out.println("\"you\" is at index " +
			shop.indexOf("you"));

		// Search for str1 inside shop
		System.out.println("\"" + str1 + "\" is at index " +
			shop.indexOf(str1));
		
		// Search for str2 inside shop
		System.out.println("\"" + str2 + "\" is at index " +
			shop.indexOf(str2));
		
		// Search for FIRST "i" inside shop
		int firstI = shop.indexOf("i");
		System.out.println("1st \"i\" is at index " + firstI);
			
		// Find 2nd "i" inside shop
		int secondI = shop.indexOf("i", firstI + 1);
		System.out.println("2nd \"i\" is at index " + secondI);
			
		// Search for LAST "i" inside shop
		int lastI = shop.lastIndexOf("i");
		System.out.println("last \"i\" is at index " + lastI);
		System.out.println();

		// Find each occurrence of "th"
		String thoughts = "It's the thought that counts";
		System.out.println("0123456789012345678901234567\n" 
			+ thoughts);
		System.out.println();

//-------------------------------------------------------------------
//		Extracting strings
//-------------------------------------------------------------------
		System.out.println("Substrings:");
		String sub1 = shop.substring(0, 3);
		System.out.println("0..3 = " + sub1);
		String sub2 = shop.substring(5, 20);
		System.out.println("5..20 = " + sub2);
		// Try negative, <, greater than length, etc.
		
		// Grab "hop"
		System.out.println("\nGrabbing \"hop\":");
		int index = shop.indexOf("hop");
		String hop = shop.substring(index, index + 3);
		System.out.println("hop = " + hop);
		System.out.println();
		
		// Using 1-parameter substring - grab from index 11 to the end
		String sub3 = shop.substring(11);
		System.out.println("11...end = " + sub3);
		System.out.println();
			
//-------------------------------------------------------------------
//		Case changes
//-------------------------------------------------------------------
/*
		String shop2 = "Shop 'til you drop!";
		String upper = shop2.toUpperCase();
		String lower = shop2.toLowerCase();
		System.out.println("shop2 = " + shop2);
		System.out.println("upper =   " + upper);
		System.out.println("lower =   " + lower);
		System.out.println();

//-------------------------------------------------------------------
//		Trimming a string
//-------------------------------------------------------------------
/*
		String shop3 = "     Let's go   to the     mall!    ";
		String trimShop3 = shop3.trim();
		System.out.println("shop3:" + shop3 + ":length=" 
			+ shop3.length());
		System.out.println("trimShop3:" + trimShop3 + ":length=" 
			+ trimShop3.length());
		System.out.println();

//-------------------------------------------------------------------
//		Replacing within a string
//-------------------------------------------------------------------
/*
		String song1 = "Jingle Bells, Jingle Bells";
		String song2 = song1.replace('i', 'u');
		String song3 = song1.replace("Bells", "Wolves");
		System.out.println("song1:  " + song1);
		System.out.println("song2:  " + song2);
		System.out.println("song3:  " + song3);
		System.out.println();
*/
	}
}