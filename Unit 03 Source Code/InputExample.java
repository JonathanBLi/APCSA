/*
 * InputExample.java
 *
 * Inputs the number of items purchased and the item's unit price.
 * Calculates and displays a receipt for the purchase.
 */
 
import java.util.Scanner;

public class InputExample 
{
	// Constants for the store
	public static final String STORE_NAME = "West Wares";
	public static final double SALES_TAX_RATE = 0.0825;


	public static void main(String[] args) 
	{
		// Input the number of items purchased and their unit price
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number of items purchased: ");
		int numItems = reader.nextInt();
		System.out.print("Enter the item's unit price: ");
		double itemPrice = reader.nextDouble();
		System.out.println();
		
		// Calculate and display the "receipt"
		makePurchase(numItems, itemPrice);
	}

	/** Display "receipt" for purchase
	 *  @param itemCount the number of items purchased
	 *  @param pricePerItem the price of each item purchased
	 */
	public static void makePurchase(int itemCount, double pricePerItem)
	{
		double subtotal = itemCount * pricePerItem;
		double salesTax = getTaxOwed(subtotal);
		double totalCost = subtotal + salesTax;
		
		System.out.println(STORE_NAME);
		System.out.println(itemCount + " @ $" + pricePerItem);
		System.out.printf(" Sub-total:  $%7.2f\n", subtotal);
		System.out.printf(" Sales tax:  $%7.2f\n", salesTax);
		System.out.printf("Total cost:  $%7.2f\n", totalCost);
		System.out.println();
	}

	/** Calculates and returns the tax owed for a given amount
	 *  @param cost the amount being taxed
	 *  @return the tax owed on cost
	 */
	public static double getTaxOwed(double cost)
	{
		double salesTax = cost * SALES_TAX_RATE;
		return salesTax;
	}
}