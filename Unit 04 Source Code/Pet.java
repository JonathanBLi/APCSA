/**
 *  Pet.java
 *  Simulates a virtual pet that has a name, sound, and weight. 
 *  Provides methods for retrieving the pet's information, as well as
 *  taking the pet for a walk, feeding the pet, and letting it sleep.
 */

public class Pet
{
	/*
	 * Class constants
	 */
	public static final String DEFAULT_NAME = "Unknown";
	public static final String DEFAULT_SOUND = "Silence";
	public static final double EATING_WEIGHT_GAIN = 0.15;
	public static final double WALKING_WEIGHT_LOSS = 0.1;
	
	/*
	 * Instance variables
	 */
	private String name;
	private String sound;
	private double weight;
	
	/** Constructs a Pet with default settings
	 */
	public Pet()
	{
		name = DEFAULT_NAME;
		sound = DEFAULT_SOUND;
		weight = 0;
	}
	
	public Pet(String petName, String sound, double petWT)
	{
		this.name = petName;
		this.sound = sound;
		weight = petWT;
	}
	/** Provides the name of this pet
	 *  @return name of pet
	 */
	public String callPet()
	{
		return name;
	}
	
	/** Provides the sound that this pet makes
	 *  @return sound of pet
	 */
	public String makeNoise()
	{
		return sound;
	}
	
	/** Provides the current weight of this pet
	 *  @return weight of pet
	 */
	public double getWeight()
	{
		return weight;
	}
	
	/** Increase pet's weight for eating
	 */
	public double eat(double x)
	{
		weight = weight + x;
		return weight;
	}
	
	/** Nothing happens when the pet sleeps
	 */
	public void sleep()
	{
	}
	
	/** Reduce pet's weight for walking
	 */
	public double walk(double x)
	{
		weight = weight - x;
		return weight;
	}
	
	/** Provides this pet's information in a string
	 *  @return pet info as a string
	 */
	@Override
	public String toString()
	{
		return name + ", " + sound + ", " + String.format("%.3f", weight);
	}
}