/**
 * Constructs the ShowPlaylist class and its methods, which can
 * add shows to a playlist, return playlist size, check for
 * certain shows in a playlist, and remove shows with short lengths
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 3/31/20
 */

import java.util.ArrayList;

public class ShowPlaylist
{
  /** list of shows being streamed */
  private ArrayList<String> playlist;
  
  /**
   *  Constructor for the ShowPlaylist class
   */
  public ShowPlaylist()
  {
    playlist = new ArrayList<String>();
  }
  
  /**
	 *  Adds a given show to the playlist
	 *  @param newShow new show to be added
	 */
  public void addShow(String newShow)
  {
    playlist.add(newShow);
  }
  
  /**
	 *  Returns the number of shows in the playlist
	 *  @return the number of shows in the playlist
	 */
  public int getNumShows()
  {
    return playlist.size();
  }
  
  /**
	 *  Calculates and returns the number of shows in the
	 *  playlist that contain a given string
	 *  @param checkShow string to be searched for
	 *  @return number of shows in the playlist that contain checkShow
	 */
  public int getNumContains(String checkShow)
  {
    int count = 0;
    for (String s : playlist)
    {
      if (s.contains(checkShow))
        count++;
    }
    return count;
  }
  
  /**
	 *  Removes all shows in the playlist that have a length
	 *  less than a given length
	 *  @param minLength the inclusive minimum length for a show
	 *  @return the number of shows removed
	 */
  public int removeSmaller(int minLength)
  {
    int count = 0;
    for (int i = 0; i < playlist.size(); i++)
    {
      if (playlist.get(i).length() < minLength)
      {
        playlist.remove(i);
        count++;
        i--;
      }
    }
    return count;
  }
  
  /**
   *  Returns the contents of playlist in a string format
   *  @return string of playlist contents
   */
  @Override
  public String toString()
  {
    return playlist.toString();
  }
}