import java.util.LinkedList;
import java.util.Queue;
/*ASSIGNMENT 04
 * SINGLETON PATTERN
 * COMPLETED OCTOBER 6, 2019 14:20
 * This program is an example of a single instance 'singleton' design pattern
 * which limits the number of instances of a class to one- byway of using a private
 * constructor and getInstance() method to return a persistent object.
 * 
 * 
 */
public class JukeBox {

	Queue<String> songQueue;
	
	private static JukeBox juke; //private jukebox object
	
	private JukeBox() {
		//private constructor to limit number of jukeboxes to one
		songQueue=new LinkedList<String>();//queue is an interface implemented by linkedlist
		System.out.println("Initializing the Jukebox!!! Let's get dancing");
	}
	
	public void requestSong(String string) {//adds the next element from the queue
			songQueue.add(string);
			System.out.println(string+" is now number "+songQueue.size()+" on the list!");
	}

	public boolean hasMoreSongs() {//checks if any songs remain
		return !(songQueue.isEmpty());
	}
	
	public static JukeBox getInstance() {//only invoker of the private constructor, limits program to a single constructor
		if(juke==null) {
			juke = new JukeBox();
		}
		return juke;
	}

	public String playNextSong() {//returns next element from the queue
		System.out.println("Let's jam to "+songQueue.peek()+"!");
		return songQueue.remove();
		
		
	}
	
}
