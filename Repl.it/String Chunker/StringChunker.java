/**
 * The StringChunker class constructs an ArrayList containing chunks of
 * a given string and provides functionality to count how many chunks contain
 * a certain string and to remove all chunks that start with a vowel
 * 
 * @author Jonathan Li
 * Collaborators: None
 * Teacher: Bailey
 * Period: 1
 * Due Date: 4/9/20
*/

// Complete ALL javadocs and follow proper coding style!

import java.util.*;

public class StringChunker
{
  private ArrayList<String> chunkList;
  
  /** Constructor for the StringChunker class
   * @param toBeChunked the string to be chunked
   * @param chunkLength the length of the chunks
   */ 
  public StringChunker(String toBeChunked, int chunkLength)
  {
    chunkList = new ArrayList<String>();
    int i = 0;
    while (i + chunkLength < toBeChunked.length())
    {
      chunkList.add(toBeChunked.substring(i, i + chunkLength));
      i += chunkLength;
    }
    chunkList.add(toBeChunked.substring(i));
  }
  
  /** Counts the number of chunks that contain a given string
   * @param find string to found in chunks
   * @return number of chunks that contain find
   */ 
  public int countChunks(String find)
  {
    int count = 0;
    for (String s : chunkList)
    {
      if (s.contains(find))
        count++;
    }
    return count;
  }
  
  
  /** Removes all chunks that start with a vowel
   */ 
  public void remStartVowelChunks( )
  {
    for (int i = 0; i < chunkList.size(); i++)
    {
      String s = chunkList.get(i);
      if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u' || s.charAt(0) == 'A' || s.charAt(0) == 'E' || s.charAt(0) == 'I' || s.charAt(0) == 'O' || s.charAt(0) == 'U')
      {
        chunkList.remove(s);
        i--;
      }
    }
  }
  
  
  /**
   * toString returns the state of the Chunk List.
   * 
   * @return the state of the Chunk List.
   */ 
  public String toString()
  {
    return chunkList.toString( );
  }
}