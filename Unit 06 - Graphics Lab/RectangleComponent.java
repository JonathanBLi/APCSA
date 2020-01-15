/** 
 * The RectangleComponent class draws rectangles 20 pixels apart, inintialized to random colors.
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 11/8/19
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JPanel;
import javax.swing.JComponent;

public class RectangleComponent extends JComponent
{

	private static final int MIN_WIDTH = 10;
	private static final int MIN_HEIGHT = 5;

	@Override
	public void paintComponent(Graphics g)
	{
		// Recover Graphics2D object
		Graphics2D g2 = (Graphics2D) g;
		
		// Define running constants to draw rectangle
		int width = this.getWidth(), height = this.getHeight();
		int xCoord = 0, yCoord = 0;

		// Draw rectangles as long as the height and width remain above 5 and 10, respectively
		while (width >= MIN_WIDTH && height >= MIN_HEIGHT) {
			// Draw rectangle with random color
			g2.setColor(getRandomColor());
			g2.fill(generateRect(xCoord, yCoord, width, height));

			// Update running constants
			width -= 20;
			height -= 20;
			xCoord += 10;
			yCoord += 10;
		}
		
	}

	/** Returns a Rectangle object based on specified location and size
	 *  parameters
	 * 
	 * @param xCoord x coordinate of top left corner
	 * @param yCoord y coordinate or top left corner
	 * @param width width in pixels
	 * @param height height in pixels
	 * @return Rectangle object drawable by Graphics component
	 */
	private Rectangle generateRect(int xCoord, int yCoord, int width, int height)
	{
		return new Rectangle(xCoord, yCoord, width, height);
	}

	/** Returns a random integer in the range [min, max]
	 * 
	 * @param min inclusive minimum value
	 * @param max inclusive maximum value
	 * @return random integer in range [min, max]
	 */
	private int getRandomInteger(int min, int max)
	{
		return (int) (Math.random() * (max - min + 1)) + min;
	}
	
	/** Returns a Color with a randomized RGB
	 * 
	 * @return random Color object usable by Graphics component
	 */
	private Color getRandomColor()
	{
		return new Color(
			getRandomInteger(0, 255),
			getRandomInteger(0, 255),
			getRandomInteger(0, 255));
	}

}