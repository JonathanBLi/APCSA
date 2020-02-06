/**
 * The FilesLab class runs a series of commands to extract data from and write data to text
 * files. It also handles exceptions for negative tests.
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 1/15/20
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class DayOfGiving 
{
	public static void main( String[] args) 
	{
		// Test the methods using the first input file
		testMethods("westGiving.txt");

		System.out.println("******************************************************\n");
		
		// Test the methods using the second input file
		testMethods("wolfGiving.txt");
	}
	
	/**
	 * Reads in integer N, the number of Donation objects, from inputFile.
	 * An array of Donation objects is then created and populated using provided data.
	 * 
	 * @param inputFile name of input file
	 * @return populated array of Donation objects
	 */
	public static Donation[] loadDonations(String inputFile)
	{
		// Check if the file exists
		File input = new File(inputFile);
		if (!input.exists())
		{
			System.out.println(inputFile 
				+ " not found. Check with your teacher.");
			System.out.println("Ending program");
			System.exit(0);
		}
		
		try
		{
			// Declare and create a Scanner object for the input File object 
			Scanner sc = new Scanner(new File(inputFile));
			
			// Read in the number of donations on the first line of
			// the file. Remember to flush the end-of-line character.
			int N = sc.nextInt();
			sc.nextLine();
			
			// Declare and create an array of Donation objects using the
			// number of donations read from the file.
			Donation[] myDonations = new Donation[N];
			
			// In a loop, read in each set of donation information. 
			// Create a Donation object and store it in your array.
			// Remember to flush the end-of-line character AFTER reading the amount.
			for (int i = 0; i < N; i++)
			{
				String donor = sc.nextLine();
				String recipient = sc.nextLine();
				int age = sc.nextInt();
				double amount = sc.nextDouble();
				sc.nextLine();
				myDonations[i] = new Donation(donor, age, recipient, amount);
			}
			
			// Return your new array HERE
			return myDonations;
		}
		catch (IOException exc)
		{
			System.out.println(exc.getMessage());
			System.out.println("Ending program");
			System.exit(0);
		}
		return null;
	}

	/**
	 * Given an array of Donation objects, displays each Donation object
	 * on a separate line using the toString method.
	 * 
	 * @param donations array of Donation objects
	 */
	public static void showDonations(Donation[] donations)
	{
		// replace statement with code to print each donation on a separate line
		for (Donation d : donations)
		{
			System.out.println(d.toString());
		}
		System.out.println();
	}
	
	/**
	 * Given an array of Donation objects, calculates the average donation amount
	 * of all donations in the array.
	 * 
	 * @param donations array of Donation objects
	 * @return average donation amount of all donations in the array
	 */
	public static double calcAverageDonation(Donation[] donations)
	{
		double sum = 0;
		for (Donation d : donations)
		{
			sum += d.getAmount();
		}
		return sum / donations.length;
	}
	
	/**
	 * Given an array of Donation objects, returns the number of donations that
	 * have a donor's age in a given inclusive range.
	 * 
	 * @param donations array of Donation objects
	 * @param minAge minimum age in range
	 * @param maxAge maximum age in range
	 * @return number of donations in array that have a donor's age in [minAge, maxAge]
	 */
	public static int calcNumInAgeRange(Donation[] donations, int minAge, int maxAge)
	{
		int count = 0;
		for (Donation d : donations)
		{
			if (d.getAge() >= minAge && d.getAge() <= maxAge)
				count ++;
		}
		return count;
	}
	
	/**
	 * Given an array of Donation objects, changes all donation amounts of a given
	 * donor to a given new amount. Returns the number of changes.
	 * 
	 * @param donations array of Donation objects
	 * @param donor name of donor whose donation amounts are to be changed
	 * @param bigCheck amount that donations will be changed to
	 * @return number of donations that had its amount changed
	 */
	public static int updateDonation(Donation[] donations, String donor, double bigCheck)
	{
		int count = 0;
		for (int i = 0; i < donations.length; i++)
		{
			String curDonor = donations[i].getDonor();
			if (curDonor.equals(donor))
			{
				donations[i].changeAmount(bigCheck);
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Given an array of Donation objects, finds and returns the name of the
	 * recipient of the donation with the largest amount.
	 * 
	 * @param donations array of Donation objects
	 * @return name of the recipient of the donation with the largest amount
	 */
	public static String getBiggestDonationRecipient(Donation[] donations)
	{
		double max = Double.MIN_VALUE;
		String maxRecip = new String();
		for (Donation d : donations)
		{
			if (d.getAmount() > max)
			{
				max = d.getAmount();
				maxRecip = d.getRecipient();
			}
		}
		return maxRecip;
	}
	
	/** Tests the methods for a given file
	 *  @param fileName name of file to read 
	 */
	public static void testMethods(String fileName) 
	{
		System.out.println("Test with file: " + fileName);
		
		// Populate array of Donation objects
		Donation[] heroGiving = loadDonations(fileName);
		
		// Display the donations
		showDonations(heroGiving);
		
		// Calculate the average amount of all donations
		double avgAmount = calcAverageDonation(heroGiving);
		System.out.printf("Average Donation Amount: $%,.2f %n%n", avgAmount);
		
		// Determine the number of donors in range [13, 215]
		int numYoungDonors = calcNumInAgeRange(heroGiving, 13, 25);
		System.out.println("Number of younger donors: " + numYoungDonors);
		
		// Determine the number of donors in range [60, 110]
		int numOlderDonors = calcNumInAgeRange(heroGiving, 60, 110);
		System.out.println("Number of older donors: " + numOlderDonors);
		System.out.println();
		
		// Change the donation amount for all donations from the given donor
		int numChanged = updateDonation(heroGiving, "Wonder Woman", 25_000);
		System.out.println("Changed " + numChanged + " donations from \"Wonder Woman\"");
		
		// Change the donation amount for all donations from the given donor
		numChanged = updateDonation(heroGiving, "The Avengers", 3_333);
		System.out.println("Changed " + numChanged + " donations from \"The Avengers\"");
		System.out.println();
		
		System.out.println("After updating:");
		showDonations(heroGiving);
		
		// Find the recipient of the largest donation amount
		String recipient = getBiggestDonationRecipient(heroGiving);
		System.out.println("Recipient of largest donation: " + recipient);
		System.out.println();
	}
	
}