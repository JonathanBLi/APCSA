/*
 *	Book.java
 * Represents a book and its information
 */

public class Book 
{
	// Instance Variables
	private String title;
	private String author;
	private double cost;
	
	/** Constructs book with given title, author, and cost
	 *  @param title the title of this book
	 *  @param author the author of this book
	 *  @param cost the cost of this book
	 */ 
	public Book(String title, String author, double cost) 
	{
		this.title = title;
		this.author = author;
		this.cost = cost;
	}
	
	/** @return title of this book
	 */
	public String getTitle() 
	{
		return title;
	}
	
	/** @return author of this book
	 */
	public String getAuthor() 
	{
		return author;
	}
	
	/** @return cost of this book
	 */
	public double getCost() 
	{
		return cost;
	}
	
	/** Resets the cost of this book
	 *  @param newCost the new cost of this book
	 */
	public void setCost(double newCost) 
	{
		cost = newCost;
	}
	
	/** @return book as a string
	 */
	@Override
	public String toString() 
	{
		return String.format("%-25s %-15s %7.2f", getTitle(), getAuthor(),
			getCost());
	}
}