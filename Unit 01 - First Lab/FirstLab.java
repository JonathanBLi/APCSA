/** 
 * The FirstLab class prints my name, information about my neighbors, and a face within a frame.
 *
 * @author Jonathan Li
 * Collaborators: Matthew Lin, Thomas Kung
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 8/21/19
 */

public class FirstLab 
{
	public static void main(String[] args) 
	{
		// Write the code HERE to print your name and address in boxes
		System.out.println("+====================================+");
		System.out.println("|\t     \"Jonathan Li\"\t     |");
		System.out.println("+====================================+");
		System.out.println("|      Matthew Lin: likes sushi      |");
		System.out.println("+====================================+");
		System.out.println("|  Thomas Kung: plays the saxophone  |");
		System.out.println("+====================================+");
		// This calls the bonus method to draw your silly face/picture
		bonus();
	}
	
	/** Draws a silly face or picture
	 */	
	public static void bonus()
	{
		// Write the code HERE to display a silly face or picture
		System.out.println("+=======================+");
		System.out.println("| \t---------\t|");
		System.out.println("|     /###########\\     |");
		System.out.println("|   /               \\   |");
		System.out.println("|  /    \"\"\"    \"\"\"   \\  |");
		System.out.println("| |      '     '      | |");
		System.out.println("| |         |         | |");
		System.out.println("|  \\   \\         /   /  |");
		System.out.println("|   \\   \\_______/   /   |");
		System.out.println("|     \\           /     |");
		System.out.println("| \t---------\t|");
		System.out.println("+=======================+\n");
	}
}