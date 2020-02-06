/** 
 * The ArrayPlotter class fills in patterns on a GridWorld canvas
 * using loops and a 2D array of Boolean values.
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 1/23/20
 */

public class ArrayPlotter
{
	/** The Array Plotter Graphical User Interface. */
	private ArrayPlotterGUI gui;
	
	/** The Color Array.  The element values indicate how to color a grid cell:
	 *  - true: Color the cell with the Drawing Color.
	 *  - false: Color the cell with the Background Color.
	 */
	private boolean[][] colorArray;
	
	/** Constructs an Array Plotter */
	public ArrayPlotter()
	{
		gui = new ArrayPlotterGUI(this);
		colorArray = null;
	}
	
	/** Initialize this's Color Array to a new 2D array of boolean values
	 *  with the given dimensions.
	 *  @param rows the number of rows in the new array.
	 *  @param cols the number of columns in the new array.
	 *  Postcondition: All of the Color Array's elements have the value false.
	 */
	public void initializeColorArray(int rows, int cols)
	{
		colorArray = new boolean[rows][cols];
	}

	/** Removes all objects from the grid. */
	public void onClearGridButtonClick()
	{
		for (int row = 0; row < colorArray.length; row++)
			for (int col = 0; col < colorArray[row].length; col++)
				colorArray[row][col] = false;
		gui.update(colorArray);
	}
	
	/** Fills in all the cells of the grid using a row-major traversal. */
	public void onRowMajorFillButtonClick()
	{
		for (int row = 0; row < colorArray.length; row++)
			for (int col = 0; col < colorArray[row].length; col++)
			{
				colorArray[row][col] = true;
				gui.update(colorArray);
			}
	}

	/** Fills in cells of the grid using col-major traversal. */
	public void onColMajorFillButtonClick()
	{
		for (int col = 0; col < colorArray[0].length; col++)
			for (int row = 0; row < colorArray.length; row++)
			{
				colorArray[row][col] = true;
				gui.update(colorArray);
			}
	}
	
	/** Fills top left to bottom right diagonal of array */
	public void onMainDiagonalFillButtonClick()
	{
		for (int row = 0; row < Math.min(colorArray.length, colorArray[0].length); row++)
		{
			colorArray[row][row] = true;
			gui.update(colorArray);
		}
	}
	
	/** Fills given row from left to right 
	 *  @param row the given row
	 **/
	private void fillRowLeftToRight(boolean[] row)
	{
		for (int i = 0; i < row.length; i++)
		{
			row[i] = true;
			gui.update(colorArray);
		}
	}

	/** Fills given row from right to left
	 *  @param row the given row
	 **/
	private void fillRowRightToLeft(boolean[] row)
	{
		for (int i = row.length - 1; i >= 0; i--)
		{
			row[i] = true;
			gui.update(colorArray);
		}
	}
	
	/** Fills array in a snaking fashion */
	public void onSerpentineFillButtonClick()
	{
		for (int i = 0; i < colorArray.length; i++)
		{
			if (i % 2 == 0) fillRowLeftToRight(colorArray[i]);
			else fillRowRightToLeft(colorArray[i]);
		}
	}

	/** Fills array from bottom to top, left to right */
	public void onReverseColMajorFillButtonClick()
	{
		for (int col = colorArray[0].length - 1; col >= 0; col--)
			for (int row = colorArray.length - 1; row >= 0; row--)
			
			{
				colorArray[row][col] = true;
				gui.update(colorArray);
			}
	}
	
	/** Fills array in a triangle fashion from top left to bottom right */
	public void onMainTriangleFillButtonClick()
	{
		if (colorArray.length > colorArray[0].length)
		{
			for (int row = 0; row < colorArray[0].length; row++)
				for (int col = 0; col < row + 1; col++)
				{
					colorArray[row][col] = true;
					gui.update(colorArray);
				}
			for (int row = colorArray[0].length; row < colorArray.length; row++)
				fillRowLeftToRight(colorArray[row]);
		}
		else for (int row = 0; row < colorArray.length; row++)
			for (int col = 0; col < row + 1; col++)
			{
				colorArray[row][col] = true;
				gui.update(colorArray);
			}
	}

	/** Fills array in a triangle fashion from top right to bottom left */
	public void onOtherTriangleFillButtonClick()
	{
		if (colorArray.length > colorArray[0].length)
		{
			for (int row = 0; row < colorArray[0].length; row++)
				for (int col = colorArray[row].length - row - 1; col < colorArray[row].length; col++)
				{
					colorArray[row][col] = true;
					gui.update(colorArray);
				}
			for (int row = colorArray[0].length; row < colorArray.length; row++)
				fillRowLeftToRight(colorArray[row]);
		}
		else for (int row = 0; row < colorArray.length; row++)
			for (int col = colorArray[row].length - row - 1; col < colorArray[row].length; col++)
			{
				colorArray[row][col] = true;
				gui.update(colorArray);
			}
	}

	/** main method that creates the grid plotter application. */
	public static void main(String[] args)
	{
		new ArrayPlotter();
	}
}