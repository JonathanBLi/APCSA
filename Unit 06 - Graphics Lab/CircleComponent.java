/** 
 * The CircleComponent class draws 100 circles, initialized to random colors and locations. 
 * Circles will always fill the entire screen but never run off of it.
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 11/8/19
 */

import java.lang.Math;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import javax.swing.JPanel;
import javax.swing.JComponent;

public class CircleComponent extends JComponent
{

	private static final int MIN_DIAMETER = 20;
	private static final int MAX_DIAMETER = 50;

	@Override
	public void paintComponent(Graphics g)
	{
		// Recover Graphics2D object
		Graphics2D g2 = (Graphics2D) g;

		// Draw 100 circles
		for (int i = 0; i < 100; i++)
		{
			// Set color and draw randomly generated circle
			g2.setColor(getRandomColor());
			g2.fill(generateCircle());
		}

	}

	/** Returns Ellipse2D.Double object with a random diameter in range [20, 50]
	 *  and location so that the circles will fill the screen but not run off it.
	 * 
	 * @return Ellipse2D.Double object drawable by Graphics component
	 */
	private Ellipse2D.Double generateCircle()
	{
		int diam = getRandomInteger(MIN_DIAMETER, MAX_DIAMETER);
		int xCoord = getRandomInteger(0, this.getWidth() - diam);
		int yCoord = getRandomInteger(0, this.getHeight() - diam);
		return new Ellipse2D.Double(xCoord, yCoord, diam, diam);
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