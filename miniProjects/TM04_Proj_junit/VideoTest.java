import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class VideoTest {
	Video video;
	String name;
	int rate;
	
	@Before
	public void before() {
		name="Matrix";
		rate=5;
		video=new Video(name);
	}
	
	@Test
	public void testGetName() {
		assertEquals(name,video.getName());
	}

	@Test
	public void testDoCheckout() {
		video.doCheckout();
		assertTrue(video.getCheckout());
	}

	@Test
	public void testDoReturn() {
		video.doReturn();
		assertFalse(video.getCheckout());
	}

	@Test
	public void testReceiveRating() {
		video.receiveRating(rate);
		assertEquals(rate,video.getRating());
	}

	@Test
	public void testGetRating() {
		video.receiveRating(rate);
		assertEquals(rate,video.getRating());
	}

	@Test
	public void testGetCheckout() {
		video.doCheckout();
		assertTrue(video.getCheckout());
		video.doReturn();
		assertFalse(video.getCheckout());
	}

}
