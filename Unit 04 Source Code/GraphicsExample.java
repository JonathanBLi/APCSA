/**
 *	GraphicsExample.java
 *  Demonstrate drawing shapes in a component
 */

import javax.swing.JFrame;

public class GraphicsExample
{
	// Frame size constants
	public static final int FRAME_WIDTH = 500;
	public static final int FRAME_HEIGHT = 300;
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setLocation(100, 100);
		frame.setTitle("Graphics Examples");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Draw shapes
		GraphicsExampleComponent example = new GraphicsExampleComponent();
		frame.add(example);
		
		// Show it
		frame.setVisible(true);
	}
}