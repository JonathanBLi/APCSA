/**
 *  PetOwner.java
 *  Driver for owning virtual pets
 */

public class PetOwner
{
	public static void main(String[] args)
	{
		// Instantiate a virtual pet using the default constructor
		// and display its information
		
		
		// Instantiate a virtual dog using your new constructor. 
		// Display its information

		Pet dog = new Pet("Fluffy", "meow", 5.5);
		System.out.println(dog);

		// Take your dog for a walk, display its sound, feed it, 
		// and let it sleep, then display its new weight
		
		dog.walk(1);
		System.out.println(dog.toString());
		dog.eat(1);
		dog.sleep();
		System.out.println(dog.toString());
		
		
		// Instantiate a virtual pet of your choosing & display its information
		
		Pet pig = new Pet("Bob", "oink", 3.9);
		// Feed your new pet, increasing its weight by 0.312 pounds
		pig.eat(0.312);
		// Take your pet for a fast walk, reducing the weight by 0.23 pounds.
		pig.walk(0.23);
		// Display its sound, adding an extra sound. 
		pig.makeNoise();
		// Let it sleep, then re-display its information
		pig.sleep();
		System.out.println(pig.toString());
		
		
		
		
		
	}
}