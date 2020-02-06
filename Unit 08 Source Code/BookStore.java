/*
 *	BookStore.java
 * Represents a collection of books
 */


public class BookStore 
{
	public static void main(String[] args) 
	{
		
		// Create an array of 5 books
		Book[] myBooks = new Book[5];
		
		// Populate with 5 books
		myBooks[0] = new Book("Cell: A Novel", "Stephen King", 26.95);
		myBooks[1] = new Book("The Da Vinci Code", "Dan Brown", 24.95);
		myBooks[2] = new Book("Chronicles of Narnia", "C. S. Lewis", 45.00);
		myBooks[3] = new Book("Memoirs of a Geisha", "Arthur Golden", 14.95);
		myBooks[4] = new Book("S is for Silence", "Sue Grafton", 26.95);
		
		// Display all of the books in the array

		for (Book bk : myBooks)
		{
			System.out.println(bk);
		}
		
		
		// Calculate and display the average price

		double sum = 0;
		for (Book bk : myBooks)
		{
			sum += bk.getCost();
		}
		System.out.printf("The average cost of the books is $%.2f\n", (sum / myBooks.length));
		
		
		// Increase the cost of each book by 10% then display the array
		
		for (Book bk : myBooks)
		{
			bk.setCost(bk.getCost() * 1.1);
			System.out.println(bk);
		}
		
		
		// Display all books that contain "of" in the title and 
		// are stored at odd-numbered indexes in books array
		
		for (int i = 1; i < myBooks.length; i += 2)
		{
			String title = myBooks[i].getTitle();
			if (title.contains("of")) System.out.println(myBooks[i]);
		}
	}	
}