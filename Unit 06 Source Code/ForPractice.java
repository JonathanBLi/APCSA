/**
 *  ForPractice.java
 *  Demonstrates for loop structure. 
 */
 
public class ForPractice
{
	public static void main(String[] args) 
	{
		//---------------------------------------------------------
		// Generate 10 random real numbers in range [2.5, 10.0)
		//---------------------------------------------------------
		for (int i = 0; i < 10; i++)
		{
			double rand = Math.random() * 7.5 + 2.5;
			System.out.printf("%f    ", rand);
		}
		

		//---------------------------------------------------------
		// Count and display the number of multiples of 3 
		// from -500 through 200
		//---------------------------------------------------------
		int num = 0;
		for (int i = -500; i < 200; i++)
		{ 
			if (i % 3 == 0)
			{
				System.out.printf("%d    ", i);
				num++;
			}
		}
		System.out.println("\n" + num);




		//---------------------------------------------------------
		// Simulate 100 flips of a coin
		// Display # of heads (0) and tails (1)
		//---------------------------------------------------------
		int heads = 0;
		for (int i = 0; i < 100; i++) 
		{
			if (Math.random() < 0.5) heads++;
		}
		int tails = 100 - heads;
		System.out.println("Heads: " + heads + " Tails: " + tails);
	}
}
