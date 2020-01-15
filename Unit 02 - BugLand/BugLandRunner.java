/** 
 * The BugLandRunner class <replace this with description of your program>
 *
 * @author Jonathan Li
 * Collaborators: None
 * Teacher Name: Bailey
 * Period: 1
 * Due Date: 9/3/19
 */
 
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Location;
import java.awt.Color;

public class BugLandRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		
		// Creates bugs and sets their colors, locations, and directions.
		
		Bug bug1 = new Bug(Color.RED);
		Location locBug1 = new Location(5, 0);
		bug1.setDirection(45);
		world.add(locBug1, bug1);
		
		Bug bug2 = new Bug(Color.YELLOW);
		Location locBug2 = new Location(0, 4);
		bug2.setDirection(135);
		world.add(locBug2, bug2);
		
		Bug bug3 = new Bug(Color.GREEN);
		Location locBug3 = new Location(4, 9);
		bug3.setDirection(225);
		world.add(locBug3, bug3);
		
		Bug bug4 = new Bug(Color.BLUE);
		Location locBug4 = new Location(9, 5);
		bug4.setDirection(315);
		world.add(locBug4, bug4);
		
		// Places rocks in diamond pattern.
		
		Rock rock1 = new Rock(Color.RED);
		Location locRock1 = new Location(4, 0);
		world.add(locRock1, rock1);
		
		Rock rock2 = new Rock(Color.RED);
		Location locRock2 = new Location(3, 1);
		world.add(locRock2, rock2);
		
		Rock rock3 = new Rock(Color.RED);
		Location locRock3 = new Location(2, 2);
		world.add(locRock3, rock3);
		
		Rock rock4 = new Rock(Color.RED);
		Location locRock4 = new Location(1, 3);
		world.add(locRock4, rock4);
		
		Rock rock5 = new Rock(Color.YELLOW);
		Location locRock5 = new Location(0, 5);
		world.add(locRock5, rock5);
		
		Rock rock6 = new Rock(Color.YELLOW);
		Location locRock6 = new Location(1, 6);
		world.add(locRock6, rock6);
		
		Rock rock7 = new Rock(Color.YELLOW);
		Location locRock7 = new Location(2, 7);
		world.add(locRock7, rock7);
		
		Rock rock8 = new Rock(Color.YELLOW);
		Location locRock8 = new Location(3, 8);
		world.add(locRock8, rock8);
		
		Rock rock9 = new Rock(Color.GREEN);
		Location locRock9 = new Location(5, 9);
		world.add(locRock9, rock9);
		
		Rock rock10 = new Rock(Color.GREEN);
		Location locRock10 = new Location(6, 8);
		world.add(locRock10, rock10);
		
		Rock rock11 = new Rock(Color.GREEN);
		Location locRock11 = new Location(7, 7);
		world.add(locRock11, rock11);
		
		Rock rock12 = new Rock(Color.GREEN);
		Location locRock12 = new Location(8, 6);
		world.add(locRock12, rock12);
		
		Rock rock13 = new Rock(Color.BLUE);
		Location locRock13 = new Location(9, 4);
		world.add(locRock13, rock13);
		
		Rock rock14 = new Rock(Color.BLUE);
		Location locRock14 = new Location(8, 3);
		world.add(locRock14, rock14);
		
		Rock rock15 = new Rock(Color.BLUE);
		Location locRock15 = new Location(7, 2);
		world.add(locRock15, rock15);
		
		Rock rock16 = new Rock(Color.BLUE);
		Location locRock16 = new Location(6, 1);
		world.add(locRock16, rock16);
		
		// Bonus
		
		Bug bug5 = new Bug();
		world.add(bug5);
		bug5.act();
		bug5.act();
		int dirBug5 = bug5.getDirection();
		Location locBug5 = bug5.getLocation();
		System.out.println("Direction: " + dirBug5);
		System.out.println("Location: " + locBug5);
		
		// show the world - DO NOT DELETE THIS!!!!
		world.show();
	}
}