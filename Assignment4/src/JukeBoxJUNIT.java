import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class JukeBoxJUNIT {
	@Test
	void testHasMoreSongs() {//tests boolean return
		assertEquals(JukeBox.getInstance().hasMoreSongs(), false);
	}

	@Test
	void testGetInstance() {//tests singleton instances
		assertEquals(JukeBox.getInstance(),JukeBox.getInstance());
	}
	@Test
	void testNextSong1() {//tests song requests
		JukeBox.getInstance().requestSong("test");
		assertEquals(JukeBox.getInstance().playNextSong(),"test");
	}
	@Test
	void testNextSong2() {//tests keyword characters (newline)
		JukeBox.getInstance().requestSong("\n\n\n\n/n/n/n/n");
		assertEquals(JukeBox.getInstance().playNextSong(),"\n\n\n\n/n/n/n/n");
	}
	@Test
	void testNextSong3() {//tests keyword characters (false)
		JukeBox.getInstance().requestSong("false");
		assertEquals(JukeBox.getInstance().playNextSong(),"false");
	}
	@Test
	void testNextSong4() {//tests ordering
		JukeBox.getInstance().requestSong("first");
		JukeBox.getInstance().requestSong("second");
		assertEquals(JukeBox.getInstance().playNextSong(),"first");
	}
	@Test
	void testNextSongs5() {//tests boolean return
		JukeBox.getInstance().requestSong("first");
		JukeBox.getInstance().requestSong("second");
		assertEquals(JukeBox.getInstance().hasMoreSongs(),true);
	}
}

