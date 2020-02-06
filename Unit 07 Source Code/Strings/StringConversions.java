/*
 *	StringConversions.java
 *
 *	Converting strings into primitive types
 */
import javax.swing.JOptionPane;

public class StringConversions 
{
	public static void main(String[] args) 
	{
		String name = JOptionPane.showInputDialog("Enter your name: ");
		String ageStr = JOptionPane.showInputDialog("Enter your age: ");
		int age = Integer.parseInt(ageStr);
		String gpaStr = JOptionPane.showInputDialog("Enter your GPA: ");
		double gpa = Double.parseDouble(gpaStr);
		
		String result = name + ", \nyou are ";
		if (age < 15)
			result += "young";
		else if (age < 50)
			result += "hip";
		else 
			result += "wise";
		result += String.format("!\nGPA: %.4f", gpa);
		JOptionPane.showMessageDialog(null, result);
	}
}