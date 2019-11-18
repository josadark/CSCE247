/*JOSHUA DARK
 * CSCE 247
 * ITERATOR CLASS 
 * ASSIGNMENT 07
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * A class that holds an array of at max 20 songs
 * Has a name associated with the album
 * addSong -> accepts the song details, creates a song and adds to array
 * createIterator -> returns a new AlbumIterator using song array
 */
public class Album {

	private String title;
	private Song[] songs;
	
	public Album(String title) {
		this.title = title;
		songs = new Song[20];
	}
	/*
	 * AddSong method, takes title, band, length, and genre parameters to construct new song item.
	 * adds song to local songs field
	 */
	public void addSong(String title, String band, double length, String genre) {
		Song song = new Song(title, band, length, genre);
		for(int i=0; i<songs.length; i++) {
			if(songs[i]==null) {
				songs[i]=song;
				break;
			}
		}
	}
	/*
	 * createIteratormethod creates new albumiterator and returns created object
	 */
	public AlbumIterator createIterator() {
		return new AlbumIterator(songs);
	}
	
	
}
