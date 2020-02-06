/**
 *  WhilePractice.java
 *  Practice definite (count-controlled) & indefinite (event-controlled) loops
 */

public class WhilePractice
{
	public static void main(String[] args)
	{
		//---------------------------------------------------------
		// Definite (count-controlled) Loop Practice
		// Write the statements to display integer values backwards
		// starting at 100 and working down to -100 by 5's
		//---------------------------------------------------------
		int x = 100;
		while (x >= -100)
		{
			System.out.println(x);
			x -= 5;
		}
		
		//---------------------------------------------------------
		// Indefinite (event-controlled) Loop Practice
		// Write the statements to display random integers in the
		// range [100, 999] until 500 is generated, keeping track of
		// the number of values generated
		//---------------------------------------------------------
		int count = 0;
		int rand = 0;
		while (rand != 500)
		{
			rand = (int) (Math.random() * 900) + 100;
			System.out.printf("%d\t", rand);
			count++;
		}
		System.out.printf("\ngenerated %d random numbers\n", count);
	}
}