/**
 * The Main class first builds an empty LargeBirdSanctuary and tests the constructor and methods on the empty object. Then, builds a sanctuary from birds in the data file, testing the constructor and functionality of the other methods. Then, tests removing sick birds from the sanctuary when all of the sick birds have already been removed.  
 * 
 * @author Jonathan Li
 * Collaborators: None
 * Teacher: Bailey
 * Period: 1
 * Due Date: 4/20/20
*/

import java.util.*;
import java.io.*;

/**
 * A class to test the LargeBirdSanctuary class
 */
 public class Main
 {
 	public static void main(String[] args) throws IOException
 	{
 		Scanner input = new Scanner(new File("Birds.txt"));
 		List<Bird> birdies = new ArrayList<Bird>();
 		birdies.add(new Bird("Cardinal", 2, 10, true));
 		
 		/* Tests an empty sanctuary: makes a LargeBirdSanctuary with a maximum capacity of 10 from a list of 1 small bird, so it is empty. prints the count of healthy birds, removes and prints the sick birds, and prints the empty sanctuary */
 		System.out.println("Testing an empty sanctuary");
 		LargeBirdSanctuary sanctuary1 = new LargeBirdSanctuary(birdies, 10);
 		System.out.println("Healthy birds in sanctuary1: " + sanctuary1.getHealthyBirdCount());
 		System.out.println("Sick birds removed from sanctuary1: " + sanctuary1.removeSickBirds());
 		System.out.println("sanctuary1: \n" + sanctuary1 + "\n");

    /* Reads the bird data from the file to load into aviary */
 		while(input.hasNextLine())
 		{
 			String type = input.nextLine();
 			int eggs = input.nextInt();
 			double span = input.nextDouble();
 			boolean healthy = input.nextBoolean();
 			input.nextLine();
 			birdies.add(new Bird(type, eggs, span, healthy));
 		}

    /* Makes a sanctuary with a maximum capacity of 25 from the data file birds  and prints */
 		LargeBirdSanctuary aviary = new LargeBirdSanctuary(birdies, 25);
 		System.out.println("aviary: \n" + aviary);

    /* Tests removing sick birds with aviary */
 		List<Bird> removedBirds = aviary.removeSickBirds();
 		System.out.println(removedBirds.size() + " birds were removed from aviary:");
 		for(Bird birdie: removedBirds)
 		{
 			System.out.println(birdie);
 		}
 		System.out.println();

 		System.out.println("aviary: \n" + aviary);
 		
 		/* Tests removing sick birds after all of the sick birds have already been removed */
 		System.out.println("Sick birds in aviary: \n" + aviary.removeSickBirds());
 		System.out.println("\naviary: \n" + aviary);


 	}
 }