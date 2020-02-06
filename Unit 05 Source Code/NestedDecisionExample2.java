/*
 * NestedDecisionExample2.java
 *
 * Demonstrate use of nested if-else
 */

import java.util.Scanner;

public class NestedDecisionExample2 
{
	public static void main(String[] args) 
	{
		// Read in user's age and whether or not they've been in an accident
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter current insurance 6-month cost: ");
		double cost = scan.nextDouble();
		System.out.print("Enter age: ");
		int age = scan.nextInt();
		System.out.print("Have you been in an accident (yes/no)? ");
		String reply = scan.next();
		System.out.println();
		
		// Assign boolean true if been in an accident; otherwise, false
		boolean accident = reply.equalsIgnoreCase("yes");
		
		System.out.println("Updated insurance cost: $" 
			+ getInsCost(cost, age, accident));
		System.out.println();
		
		// Beware dangling else!
		
		// Goal: display "bad driver" when someone has been in an accident,
		// but only if the age is no more than 21; display "good driver" 
		// for those that have not been in an accident
		System.out.println("Dangling else problem:");
		if (accident)
			if (age <= 21)
				System.out.println("Bad Driver!");
		else
			System.out.println("Good Driver!");

		System.out.println("\n");
	}
	
	/** Updates cost of insurance based on age and whether or not 
	 *  customer has been in an accident
	 *    25 & Under: 40% surcharge if been in an accident, 20% discount if not
	 *    Over 25:    10% surcharge if been in an accident, 10% discount if not
	 *  @param insCost current 6-month insurance cost
	 *  @param age customer's age
	 *  @param inAccident true if customer has been in accident
	 *  @return new insurance cost
	 */
	public static double getInsCost(double cost, int age, boolean inAccident)
	{
		if (age <= 25)
		{
			if (inAccident)
				cost = cost * 1.4;
			else
				cost = cost * 1.2;
		}
		else
		{
			if (inAccident)
				cost = cost * 1.1;
			else
				cost = cost * 0.9;
		}
		return cost;
	}
}


