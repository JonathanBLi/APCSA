/** 
 * The HalloweenDrawing class draws a house, a pumpkin, and a greeting using graphics classes.
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 10/4/19
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class HalloweenDrawing extends JComponent
{
	private Graphics2D g2;
	private int width;
	private int height;
	
	/** Draw a house, a pumpkin, and a greeting
	 *  @param g the Graphics object for drawing
	 */
	@Override
	public void paintComponent(Graphics g)
	{
		// Convert g back to its Graphics2D self
		g2 = (Graphics2D)g;
		
		// Get size of component window
		width = getWidth();
		height = getHeight();
		
		// Draw sky
		g2.setColor(new Color(120, 200, 255));
		g2.fill(new Rectangle(0, 0, width, height / 2));
		
		// Draw grass
		g2.setColor(new Color(100, 200, 50));
		g2.fill(new Rectangle(0, height / 2, width, height / 2));
		
		// Draw house 
		drawHouse();
		drawHouseFeatures(50, 100, width / 3, height / 2);
		
		// Draw pumpkin
		drawPumpkin();
		drawPumpkinFace(50 + width / 2, 100, width / 3,  height / 2);
		
		// Draw greeting
		g2.setColor(Color.BLACK);
		g2.drawString("Happy Halloween!", width / 2 - 50, 10);
	}
	
	/** Draw a house
	 */
	public void drawHouse()
	{
		// Set house to red
		g2.setColor(new Color(200, 50, 50));
		
		// Create house
		g2.fill(new Rectangle(50, 100, width / 3,  height / 2));
		
		// Set roofing lines to black
		g2.setColor(Color.BLACK);
		
		// Draw two lines that define the edges of roof		
		g2.draw(new Line2D.Double(50.0, 100.0, 50.0 + width / 6, 25.0));
		g2.draw(new Line2D.Double(50.0 + width / 6, 25.0, 50.0 + width / 3, 100.0));
	}
	
	/** Draw the features of the house
	 *  @param houseX x-coordinate of house
	 *  @param houseY y-coordinate of house
	 *  @param houseWidth width of house
	 *  @param houseHeight height of house
	 */
	public void drawHouseFeatures(int houseX, int houseY, int houseWidth, int houseHeight)
	{
		// Set windows to light blue
		g2.setColor(new Color(150, 200, 240));
		
		// Draw two windows
		g2.fill(new Rectangle(houseX + houseWidth / 7, houseY + houseHeight / 3,
			houseWidth / 7, houseHeight / 3));
		g2.fill(new Rectangle(houseX + houseWidth * 5 / 7, houseY + houseHeight / 3,
			houseWidth / 7, houseHeight / 3));
		
		// Set door to brown
		g2.setColor(new Color(140, 70, 35));
		
		// Draw door
		g2.fill(new Rectangle(houseX + houseWidth * 2 / 5, houseY + houseHeight / 3,
			houseWidth / 5, houseHeight * 2 / 3));
	}
	
	/** Draw a pumpkin
	 */
	public void drawPumpkin()
	{
		// Set pumpkin to orange
		g2.setColor(new Color(255, 120, 0));
		
		// Create pumpkin
		g2.fill(new Ellipse2D.Double(50 + width / 2, 100, width / 3, height / 2));
	}
	
	/** Draw a face on the pumpkin
	 *  @param pumpkinX x-coordinate of pumpkin
	 *  @param pumpkinY y-coordinate of pumpkin
	 *  @param pumpkinWidth width of pumpkin
	 *  @param pumpkinHeight height of pumpkin
	 */
	public void drawPumpkinFace(int pumpkinX, int pumpkinY, int pumpkinWidth, int pumpkinHeight)
	{
		// Set facial features to black
		g2.setColor(Color.BLACK);
		
		// Draw two eyes
		g2.fill(new Ellipse2D.Double(pumpkinX + pumpkinWidth * 2.0 / 7.0, 
			pumpkinY + pumpkinHeight / 4.0, pumpkinWidth / 7.0, pumpkinWidth / 7.0));
		g2.fill(new Ellipse2D.Double(pumpkinX + pumpkinWidth * 4.0 / 7.0, 
			pumpkinY + pumpkinHeight / 4.0, pumpkinWidth / 7.0, pumpkinWidth / 7.0));
		
		// Draw mouth
		g2.fill(new Ellipse2D.Double(pumpkinX + pumpkinWidth * 2.0 / 5.0, 
			pumpkinY + pumpkinHeight * 3 / 5.0, pumpkinWidth / 5.0, pumpkinWidth / 5.0));
		
		// Set pumpkin stem to green
		g2.setColor(new Color(0, 120, 0));
		g2.fill(new Rectangle(pumpkinX + pumpkinWidth * 3 / 7, pumpkinY - pumpkinHeight / 10, 
			pumpkinWidth / 7, pumpkinHeight / 5));
	}
}