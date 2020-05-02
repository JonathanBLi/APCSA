/**
 * The PostOffice class represents a collection of PO Boxes. This class uses a
 * two-dimensional array to represent the arrangement of post office boxes. The
 * boxes in the Post Office are in a rectangular arrangement of rows and columns.
 * It also contains a method that removes owners who have more than a given number
 * of late payments.
 * 
 * @author Jonathan Li
 * Collaborators: None
 * Teacher: Bailey
 * Period: 1
 * Due Date: 4/30/20
*/

import java.util.*;

// Remember to write javadocs for the class description and the 2 methods you are writing.

/**
 * A PostOffice object represents a collection of PO Boxes.
 */ 
public class PostOffice
{
  /* 2D Array of POBox objects. */
  private POBox[][] boxes;
  
  /** The constructor initializes the boxes instance variable (which is a 2D 
   * array of POBox objects) using a List of POBox objects and a specified 
   * number of rows and columns.
   * 
   * @param ownerList list of PO boxes
   * @param rows the number of rows the PostOffice will have
   * @param cols the number of columns the PostOffice will have
   */
  public PostOffice(List<POBox> ownerList, int rows, int cols)
  {
    boxes = new POBox[rows][cols];
    int k = 0;
    for (int i = 0; i < rows; i++)
    {
      for (int j = 0; j < cols; j++)
      {
        boxes[i][j] = ownerList.get(k);
        k++;
        if (k == ownerList.size())
          return;
      }
    }
  }
  
  /** Removes owners who have more than a given number of late payments from the
   * box owner chart and returns an ArrayList of String representing the names of
   * the PO Box owners that were removed in the order they were removed.
   * 
   * @param allowedLatePmts the maximum allowed number of late payments
   * @return the names of the PO Box owners that were removed in the order they were removed
  */
  public List<String> removeOwnersLatePmts(int allowedLatePmts)
  {
    List<String> removed = new ArrayList<String>();
    for (int j = 0; j < boxes[0].length; j++)
    {
      for (int i = 0; i < boxes.length; i++)
      {
        if (boxes[i][j] != null && boxes[i][j].getNumLatePayments() > allowedLatePmts)
        {
          removed.add(boxes[i][j].getName());
          boxes[i][j] = null;
        }
      }
    }
    return removed;
  }

  /**
   * Returns a string version of the PO Boxes in the Post Office in
   * rows and columns.  PO Box information is separated by semi-colons.
   * 
   * @return the PO Boxes in the Post Office as a String
   */ 
  public String toString( )
  {
    String result = "";
    for(POBox[] box : boxes)
    {
      result += java.util.Arrays.toString(box);
    }
    result = result.replace("[", "");
    result = result.replace("]", "\n");
    result = result.replace(",", ";");
    return result;
  }
}