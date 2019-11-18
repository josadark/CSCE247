import java.util.Iterator;
public class AlbumIterator implements Iterator{

	private Song[] song;
	private int position;
	/*
	 * album iterator constructor requires songs array
	 */
	public AlbumIterator(Song[] songs) {
		position=0;
		this.song = songs;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		if(song[position+1]==null||position+1==song.length) {
		return false;
		}
		return true;
	}

	@Override
	public Song next() {
		position++;
		return song[position];
	}
	
}
