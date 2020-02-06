/**
 * DrawingExample3.java
 *
 * Using static methods with parameters
 */


public class DrawingExample3 
{
	public static void main(String[] args) 
	{
		drawDiamond("@");
		drawDiamond("%");
	}
	
	/* Draws a diamond shape
	 * @param symbol the character to use in drawing the diamond
	 */
	public static void drawDiamond(String symbol)
	{
		drawInvertedV(symbol);
		drawV(symbol);
		System.out.println();
	}
	
	/* Draws top half of cone 
	 * @param s the character to use in drawing the cone
	 */
	public static void drawInvertedV(String s)
	{
		System.out.println("     " + s);
		System.out.println("    " + s + " " + s);
		System.out.println("   " + s + "   " + s);
		System.out.println("  " + s + "     " + s);
		System.out.println(" " + s + "       " + s);
	}
	
	/* Draws bottom half of cone
	 * @param x the character to use in drawing the cone
	 */
	public static void drawV(String x)
	{
		System.out.println(" " + x + "       " + x);
		System.out.println("  " + x + "     " + x);
		System.out.println("   " + x + "   " + x);
		System.out.println("    " + x + " " + x);
		System.out.println("     " + x);
	}
}