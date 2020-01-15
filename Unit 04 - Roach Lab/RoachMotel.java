/** 
 * The RoachMotel Class establishes populations of roaches in a lab and a kitchen
 * that can be grown and reduced. Populations are printed to show the change in
 * the number of roaches over time.
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 9/30/19
 */
 
import java.util.Scanner;

public class RoachMotel 
{
	public static void main(String[] args) 
	{
		/*
		 * 70-point version
		 */

		// Using the default constructor, declare and instantiate a 
		// RoachPopulation object to represent the roach population 
		// in the computer lab. 
		// Display the initial population using the accessor method.
		
		RoachPopulation labRoaches = new RoachPopulation();
		System.out.printf("My lab has an initial population of %d roaches.\n\n",
			labRoaches.getRoaches());


		// Using the starting population provided by the user and 1-parameter
		// constructor, declare and instantiate a RoachPopulation object to
		// represent the roach population in your kitchen. 
		// Display initial population using the accessor method.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting population of the kitchen (an integer): ");
		int initialPopulation = sc.nextInt();

		RoachPopulation kitchenRoaches = new RoachPopulation(initialPopulation);
		System.out.printf("My kitchen has an initial population of %d roaches.\n\n",
			kitchenRoaches.getRoaches());

		/*
		 * 85-point version
		 */

		// Wait for the kitchen population to double and display the results
		
		System.out.printf("Waiting for the kitchen population to grow....\n");
		kitchenRoaches.waitForDoubling();
		System.out.printf("My kitchen now has %d roaches.\n\n", kitchenRoaches.getRoaches());
		
		// Wait for the lab population to double and display the results

		System.out.printf("Waiting for the lab population to grow....\n");
		labRoaches.waitForDoubling();
		System.out.printf("My lab now has %d roaches.\n\n", labRoaches.getRoaches());

		/*
		 * 100-point version (uncomment section below)
		 */
		 
		// Spray insecticide in the kitchen and display the results
		
		System.out.print("Enter strength of kitchen insecticide used (ex, 22.75): ");
		double sprayKitchen = sc.nextDouble();
		
		int numKilledKitchen = kitchenRoaches.spray(sprayKitchen);
		System.out.printf("My kitchen now has %d roaches after killing %d roaches.\n\n",
			kitchenRoaches.getRoaches(), numKilledKitchen);

		// Spray insecticide in the lab and display the results
		
		System.out.print("Enter strength of lab insecticide used (ex, 22.75): ");
		double sprayLab = sc.nextDouble();
		
		int numKilledLab = labRoaches.spray(sprayLab);
		System.out.printf("My lab now has %d roaches after killing %d roaches.\n\n",
			labRoaches.getRoaches(), numKilledLab);
		
	}
}