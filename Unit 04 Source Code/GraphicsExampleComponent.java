/**
 *  GraphicsExampleComponent.java
 *  Extend JComponent to draw 2D shapes
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

public class GraphicsExampleComponent extends JComponent
{
	@Override
	public void paintComponent(Graphics g)
	{
		// Recover Graphics2D object
		Graphics2D g2 = (Graphics2D) g;
		
		// Get size of component window
		int width = getWidth();
		int height = getHeight();
		
		// Draw outline of a red rectangle 
		g2.setColor(Color.red);
		int boxX = 5;
		int boxY = 10; 
		int boxWidth = 30;
		int boxHeight = 50;
		Rectangle box = new Rectangle(boxX, boxY, boxWidth, boxHeight);
		g2.draw(box);
		
		// Draw a solid purple rectangle 
		box = new Rectangle(width / 2 + 5, 10, 30, 50);
		Color purple = new Color(150, 50, 250);
		g2.setColor(purple);
		g2.fill(box);
		
		// Draw outline of a blue ellipse 
		g2.setColor(Color.blue);
		Ellipse2D.Double ellipse = new Ellipse2D.Double(5, height / 2 + 10, 70, 40);
		g2.draw(ellipse);
		
		// Draw a solid magenta circle 
		g2.setColor(Color.magenta);
		double circleX = width / 2 + 5;
		double circleY = height / 2 + 10;
		double diameter = 70;
		Ellipse2D.Double circle = new Ellipse2D.Double(circleX, circleY, diameter, diameter);
		g2.fill(circle);
		
		// Draw random-colored line to bisect window
		// vertically
		Color randomColor = new Color((float) Math.random(), (float) Math.random(), 
		                               (float) Math.random());
		g2.setColor(randomColor);
		Line2D.Double vertical = new Line2D.Double(width / 2, 0, width / 2, height);
		g2.draw(vertical);
		
		// Draw random-colored line to bisect window 
		// horizontally
		randomColor = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), 
		                        (int) (Math.random() * 256));
		g2.setColor(randomColor);
		Line2D.Double horizontal = new Line2D.Double(0, height / 2, 
		                                              width, height / 2);
		g2.draw(horizontal);
		
		// Add text
		g2.setColor(Color.blue);
		g2.drawString("Plano West Wolves", 100, 50);
	}
}
