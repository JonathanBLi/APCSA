/**
 * Test InsertDelete class
 *
 */

public class InsertDeleteTest 
{
	public  static void main(String[] args) 
	{
		InsertDelete test = new InsertDelete();
		
		System.out.println("Array:  ");
		System.out.println(test + "\n");
		
		// Test insert by inserting at the beginning, middle, and end
		System.out.println("Inserting -10");
		test.insert(-10);
		System.out.println(test + "\n");
		
		System.out.println("Inserting 105");
		test.insert(105);
		System.out.println(test + "\n");
		
		System.out.println("Inserting 500");
		test.insert(500);
		System.out.println(test + "\n");
		
		// Test delete by deleting at the beginning, middle, end, and
		// a non-existent value
		System.out.print("Removing -10? ");
		System.out.println(test.delete(-10));
		System.out.println(test + "\n");
		
		System.out.print("Removing 80? ");
		System.out.println(test.delete(80));
		System.out.println(test + "\n");
		
		System.out.print("Removing 500? ");
		System.out.println(test.delete(500));
		System.out.println(test + "\n");
		
		System.out.print("Removing 42? ");
		System.out.println(test.delete(42));
		System.out.println(test + "\n");
	}
}