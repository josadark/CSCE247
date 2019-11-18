/*
 * a class to hold the details of a song
 */
public class Song {
	private String title;
	private String band;
	private double length;
	private String genre;
	/*
	 * Parameterized Constructor
	 * @Param title is song title, band is band name, length is length of song, genre if genre of song
	 */
	public Song(String title, String band, double length, String genre) {
		this.title = title;
		this.band = band;
		this.length = length;
		this.genre = genre;
	}
	
	public String toString() {
		return (title+" "+band+" "+length+" "+genre);
	}
	
	public void print() {
		System.out.println(title+" "+band+" "+" category : "+genre+" length : "+length);
	}
}
