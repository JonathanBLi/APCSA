/*
 * WestStore.java
 *
 * Demonstrate use of constants and variables in Java
 */

public class WestStore 
{
	// Constants to store the store's name
	// and the sales tax rate
	public static final String STORE_NAME = "West Wares";
	public static final double SALES_TAX_RATE = 0.0825;


	public static void main(String[] args) 
	{
		// Calculate and display the tax due and total cost
		// for a purchase
		int numItems = 7;
		double itemPrice = 3.99;
		double subtotal = numItems * itemPrice;
		double salesTax = subtotal * SALES_TAX_RATE;
		double totalCost = subtotal + salesTax;
		
		System.out.println(STORE_NAME);
		System.out.println(numItems + " @ $" + itemPrice);
		System.out.println(" Sub-total:  " + subtotal);
		System.out.println(" Sales tax:  " + salesTax);
		System.out.println("Total cost: $" + totalCost);
		System.out.println();
		
		// Calculate and display the tax due and total cost
		// for another purchase
		numItems = 30;
		itemPrice = 5.67;
		
		subtotal = numItems * itemPrice;
		salesTax = subtotal * SALES_TAX_RATE;
		totalCost = subtotal + salesTax;
		
		System.out.println(STORE_NAME);
		System.out.println(numItems + " @ $" + itemPrice);
		System.out.println(" Sub-total:  " + subtotal);
		System.out.println(" Sales tax:  " + salesTax);
		System.out.println("Total cost: $" + totalCost);
		System.out.println();
		
		
		
	}
}