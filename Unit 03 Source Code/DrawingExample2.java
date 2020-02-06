/**
 * DrawingExample2.java
 *
 * Draws shapes with cone halves using static methods
 */


public class DrawingExample2 
{
	public static void main(String[] args) 
	{
		drawDiamond();
		drawHourGlass();
		drawSnowCone();
	}
	
	/* Draws a diamond shape
	 */
	public static void drawDiamond()
	{
		drawInvertedV();
		drawV();
		System.out.println();
	}
	
	/* Draws hour glass shape
	 */
	public static void drawHourGlass()
	{
		System.out.println("+---------+");
		drawV();
		drawInvertedV();
		System.out.println("+---------+");
		System.out.println();
	}
	
	/* Draws snow cone
	 */
	public static void drawSnowCone()
	{
		drawSnowTop();
		System.out.println("+---------+");
		drawV();
		System.out.println();
	}
	
	/* Draws top half of cone 
	 */
	public static void drawInvertedV()
	{
		System.out.println("     *");
		System.out.println("    * *");
		System.out.println("   *   *");
		System.out.println("  *     *");
		System.out.println(" *       *");
	}
	
	/* Draws bottom half of cone
	 */
	public static void drawV()
	{
		System.out.println(" *       *");
		System.out.println("  *     *");
		System.out.println("   *   *");
		System.out.println("    * *");
		System.out.println("     *");
	}
	
	/* Draws snow cone topper
	 */
	public static void drawSnowTop()
	{
		System.out.println("    ~~~");
		System.out.println("  ~~~~~~~");
		System.out.println(" ~~~~~~~~~");
	}	
}