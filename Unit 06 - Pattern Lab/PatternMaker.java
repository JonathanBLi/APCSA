/**
 * The PatternMaker Class draws a series of 4 patterns on the GridWorld GUI
 * based on pre-defined requirements.
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 11/18/19
 */

import java.awt.Color;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class PatternMaker
{
	/** Dimensions for the different worlds */
	public static final int NUM_ROWS_NUMBER_GRID = 10;
	public static final int NUM_COLS_NUMBER_GRID = 10;
	
	public static final int NUM_ROWS_COLOR_GRID = 19;
	public static final int NUM_COLS_COLOR_GRID = 19;
	
	/** Draw the different patterns. Comment others out while working on a single pattern.
	 *  Uncomment calls to completed patterns before turning in.
	 */	
	public static void main(String[] args)
	{
		drawPattern1(NUM_ROWS_NUMBER_GRID, NUM_COLS_NUMBER_GRID);
		drawPattern2(NUM_ROWS_COLOR_GRID, NUM_COLS_COLOR_GRID);
		drawPattern3(NUM_ROWS_COLOR_GRID, NUM_COLS_COLOR_GRID);
		drawPattern4(NUM_ROWS_COLOR_GRID, NUM_COLS_COLOR_GRID);
	}

   /**
    * Draws a pattern of a triangle using the digits 0 through 9
    * @param numRows number of rows
    * @param numCols number of columns
    */
	public static void drawPattern1(int numRows, int numCols)
	{
		BoundedGrid grid = new BoundedGrid(numRows, numCols);
		World world = new World(grid);
		
		for (int i = 0; i < numRows; i++)
		{
            for (int j = 0; j <= i; j++)
            {
                world.add(new Location(i, j), j);
            }
        }
		
		world.show();
	}

   /**
    * Draws a pattern of two color gradients divided by a black diagonal line
    * @param numRows number of rows
    * @param numCols number of columns
    */
	public static void drawPattern2(int numRows, int numCols)
	{
		BoundedGrid grid = new BoundedGrid(numRows, numCols);
		World world = new World(grid);

		for (int i = 0; i < numRows; i++)
		{
		    for (int j = 0; j < numCols; j++)
		    {
		        if (j == i)
		        {
		            world.add(new Location(i, j), Color.BLACK);
                }
                else if (j < i)
                {
		            world.add(new Location(i, j), new Color(0, i * 255 / 30, j * 255 / 30));
                }
                else {
					world.add(new Location(i, j), new Color(i * 255 / 30, j * 255 / 30, 255));
                }
            }
        }

		world.show();
	}

   /**
    * Draws a pattern of columns of 3 alternating colors
    * @param numRows number of rows
    * @param numCols number of columns
    */
	public static void drawPattern3(int numRows, int numCols)
	{
		BoundedGrid grid = new BoundedGrid(numRows, numCols);
		World world = new World(grid);

		Color[] colors = {Color.RED, Color.YELLOW, Color.BLUE};
		for (int j = 0; j < numCols; j++)
		{
		    for (int i = 0; i < numRows; i++)
		    {
		        world.add(new Location(i, j), colors[j % 3]);
            }
        }
		
		world.show();
	}

   /**
    * Draws a pattern of a diamond
    * @param numRows number of rows
    * @param numCols number of columns
    */
	public static void drawPattern4(int numRows, int numCols)
	{
		BoundedGrid grid = new BoundedGrid(numRows, numCols);
		World world = new World(grid);

		int rowCenter = numCols / 2;
		int colCenter = numRows / 2;
		for (int i = 0; i < numRows; i++)
		{
		    for (int j = 0; j < numCols; j++)
		    {
		        if (j >= colCenter - rowCenter + Math.abs(i - rowCenter) &&
                    j <= colCenter + rowCenter - Math.abs(i - rowCenter))
		        {
		            world.add(new Location(i, j), new Color(i * 255 / 30, j * 255 / 30, 150));
                }
            }
        }

		world.show();
	}
}