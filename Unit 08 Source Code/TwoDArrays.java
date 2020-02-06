/*
 * TwoDArrays.java
 * Demonstrate two-dimensional Java arrays
 */

public class TwoDArrays 
{
	public static void main(String[] args) 
	{
		// Declare a 2D array to hold 3 rows and 4 columns of doubles
		double[][] gpas = new double[3][4];
		
		// Assign random values in range [1.0, 5.0)
		for (int row = 0; row < gpas.length; row++) 
		{
			for (int col = 0; col < gpas[row].length; col++) 
			{
				gpas[row][col] = Math.random() * 4 + 1.0;
			}
		}
		
		// Display the array
		for (int row = 0; row < gpas.length; row++) 
		{
			for (int col = 0; col < gpas[row].length; col++) 
			{
				System.out.printf("%7.3f", gpas[row][col]);
			}
			System.out.println();
		}
		System.out.println("\n");
		
		// Get average GPA in array
		double avg = getAverage(gpas);
		System.out.printf("Average GPA: %.4f \n\n", avg);
				
		// Get number of 4.0 and higher GPAs
		int numHighGPAs = getAbove(gpas, 4.0);
		System.out.println("Number of GPAs 4.0 and above: " + numHighGPAs);
		System.out.println();
	}
	
	/* Calculate the average (mean) of all values in matrix
	 * @param matrix a 2D array of values
	 * @return the mean of all values in matrix
	 */
	public static double getAverage(double[][] matrix)
	{
		return 0;
	}
	
	/* Calculate number of values in matrix that are at least as big as minValue
	 * @param matrix a 2D array of values
	 * @param minValue the smallest value in matrix to be counted
	 * @return the number of values in matrix greater than or equal to minValue 
	 */
	public static int getAbove(double[][] matrix, double minValue)
	{
		return 0;
	}
}