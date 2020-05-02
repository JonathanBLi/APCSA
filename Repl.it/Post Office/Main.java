/**
 * The Main class tests the POBox and PostOffice classes.
 * 
 * @author Jonathan Li
 * Collaborators: None
 * Teacher: Bailey
 * Period: 1
 * Due Date: 4/30/20
*/

import java.util.*;
import java.io.*;

/**
 * This Main Class is used to test the Post Office lab.
 */ 
public class Main 
{
  /**
   * This Main method creates and tests Post Office object.
   * 
   * @param args This argument will not be used to test this lab.
   */ 
  public static void main(String[] args) 
  {
    System.out.println("Test Case #1");
    List<POBox> boxMembers = loadFile("BoxMembers.txt");
    PostOffice pOffice = new PostOffice(boxMembers, 3, 4);
    System.out.println("Printing PO Boxes at the Post Office:");
    System.out.println(pOffice);
    
    List<String> removedNames = pOffice.removeOwnersLatePmts(3);
    
    System.out.println("Printing PO Boxes after removing all members with more than 3 late payments:");
    System.out.println(removedNames + " were removed from the Post Office!");
    System.out.println(pOffice);
    
    
    System.out.println("*****\n\nTest Case #2");
    boxMembers = loadFile("BoxMembers2.txt");
    pOffice = new PostOffice(boxMembers, 7, 2);
    System.out.println("Printing PO Boxes at the Post Office:");
    System.out.println(pOffice);
    
    removedNames = pOffice.removeOwnersLatePmts(4);
    
    System.out.println("Printing PO Boxes after removing all members with more than 4 late payments:");
    System.out.println(removedNames + " were removed from the Post Office!");
    System.out.println(pOffice);
  }
  
  public static List<POBox> loadFile(String fileName)
  {
    try
    {
      List<POBox> box = new ArrayList<POBox>();
      Scanner file = new Scanner( new File(fileName) );
      while( file.hasNextLine() )
      {
        String line = file.nextLine( );
        String name = line.substring( 0,line.indexOf(" ") );
        int late = Integer.parseInt( line.substring( line.indexOf(" ")+1 ) );
        box.add( new POBox(name,late) );
      }
      file.close();
      return box;
    }
    catch(Exception e)
    {
      System.out.println("You should never see this message!");
      return null;
    }
  }
  
}