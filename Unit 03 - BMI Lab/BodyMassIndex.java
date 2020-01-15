/** 
 * The BodyMassIndex Class receives a user's weight in either kilograms or prounds
 * and height in either centimeters or inches and outputs the Body Mass Index.
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 9/18/19
 */

import java.util.Scanner;

public class BodyMassIndex 
{
	// Define unit conversion constants
	
	public static final double CM_TO_M = 100.0;
	public static final double KG_TO_LB = 0.453592;
	public static final double CM_TO_IN = 2.54;

	// Create Scanner object

	public static Scanner sc = new Scanner(System.in);
	
	// Do not make any changes to the main!
	public static void main(String[] args) 
	{
		// 80-point version
		// Input user's weight and height in metric units and calculate BMI
		calculateMetricBMI();
		System.out.println();
		
		// 100-point version
		// Input user's weight and height in imperial units and calculate BMI
		calculateImperialBMI();
		System.out.println();
	}

	/**
	 * Collects user's weight in kilograms and height in centimeters. Passes
	 * information to a method to calculate the BMI, receives its output, and
	 * prints the result to the command line.
	 */
	public static void calculateMetricBMI()
	{
		// Declare variables to store data
		int weightKG, heightCM;

		// Collect user's weight in kilograms
		System.out.print("Enter your weight in kilograms: ");
		System.out.flush();
		weightKG = sc.nextInt();

		// Collect user's height in centimeters
		System.out.print("\nEnter your height in centimeters: ");
		System.out.flush();
		heightCM = sc.nextInt();

		// Calculate BMI
		double bmi = getBMI(weightKG, heightCM);

		// Display BMI
		System.out.printf("\nA body mass index of 20 - 25 is considered \"normal\"\n");
		System.out.printf("Your BMI is %.2f\n\n", bmi);
	} 

	/**
	 * Calculates and returns a person's BMI, given the weight in kilograms and
	 * height in centimeters.
	 * @param weightKG the weight in kilograms
	 * @param heightCM the height in centimeters
	 * @return BMI of individual with specificed parameters
	 */
	public static double getBMI(int weightKG, int heightCM)
	{
		return (double) weightKG / (heightCM / CM_TO_M) / (heightCM / CM_TO_M);
	}

	/**
	 * Collects user's weight in pounds and height in inches. Passes
	 * information to a method to convert both units to kilograms and centimeters,
	 * respectively. Passes converted data to a function that calculates the BMI,
	 * receives its output, and prints the result to the command line.
	 */
	public static void calculateImperialBMI()
	{
		// Declare variables to store data
		int weightLB, heightIN;

		// Collect user's weight in pounds
		System.out.print("Enter your weight in pounds: ");
		System.out.flush();
		weightLB = sc.nextInt();

		// Collect user's height in inches
		System.out.print("\nEnter your height in inches: ");
		System.out.flush();
		heightIN = sc.nextInt();

		// Convert imperial units to metric units
		int weightKG = convertPoundsToKG(weightLB);
		int heightCM = convertInchesToCM(heightIN);

		// Calculate BMI
		double bmi = getBMI(weightKG, heightCM);
		
		// Display BMI
		System.out.printf("\nA body mass index of 20 - 25 is considered \"normal\"\n");
		System.out.printf("Your BMI is %.2f\n\n", bmi);

		// Close Scanner to prevent resource leaks
		sc.close();
	}

	/**
	 * Coverts pounds to kilograms.
	 * @param numPounds pounds to be converted
	 * @return kilogram equivalent of the input
	 */
	public static int convertPoundsToKG(int numPounds)
	{
		return (int) Math.round((double) numPounds * KG_TO_LB);
	}
	
	/**
	 * Coverts inches to centimeters.
	 * @param numInches inches to be converted
	 * @return centimeter equivalent of the input
	 */
	public static int convertInchesToCM(int numInches)
	{
		return (int) Math.round((double) numInches * CM_TO_IN);
	}
}