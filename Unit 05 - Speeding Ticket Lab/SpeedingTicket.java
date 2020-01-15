/** 
 * The SpeedingTicket class computes the price of a speeding ticket based on data provided 
 * regarding the incident.
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 10/17/19
 */

import java.util.*;

public class SpeedingTicket 
{
	// Given constants
	public static final int MIN_COST = 50;
	public static final int RATE_PER_EXCESS = 7;
	public static final int SCHOOL_RATE_PER_EXCESS = 15;
	public static final int EXCESS_SPEED = 30;
	public static final int EXCESS_COST = 175;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		// Scan in driver's name and speed, speed limit, and whether it was a school zone or not
		System.out.print("Enter driver's name: ");
		String name = sc.nextLine();
		System.out.print("Enter driver's speed: ");
		int speed = sc.nextInt();
		System.out.print("Enter speed limit: ");
		int speedLim = sc.nextInt();
		System.out.print("Was driver in school zone? ");
		String schoolZone = sc.next();

		// Calculate and display speeding ticket price
		int ticketPrice = calcTicket(speed, speedLim, schoolZone);
		System.out.printf("\nSpeed traveled: %3d\nSpeed limit: %6d\nIn school zone: %3s\n%s owes $%d\n\n",
			speed, speedLim, schoolZone, name, ticketPrice);	

		sc.close();
	}

	/**
	 * Calculates the price of the speeding ticket using given data.
	 * 
	 * @param speedDriving speed at which the driver was driving
	 * @param speedLimit speed limit at the location of the incident
	 * @param schoolZone whether the location was within a school zone or not
	 * @return calculated price of speeding ticket
	 */ 
	public static int calcTicket(int speedDriving, int speedLimit, String schoolZone)
	{
		// No ticket
		if (speedDriving <= speedLimit)
			return 0;
		
		int ticketPrice = MIN_COST;

		// School zone or not
		if (schoolZone.equalsIgnoreCase("yes"))
			ticketPrice += (speedDriving - speedLimit) * SCHOOL_RATE_PER_EXCESS;
		else
			ticketPrice += (speedDriving - speedLimit) * RATE_PER_EXCESS;

		// Excessive speed
		if (speedDriving - speedLimit > EXCESS_SPEED)
			ticketPrice += EXCESS_COST;

		return ticketPrice;
	}
}		