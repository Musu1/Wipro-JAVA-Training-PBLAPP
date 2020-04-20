import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;
public class VideoStoreTest {

	VideoStore v;
	String name;
	Video lastAdded;
	int size;
	@Before
	public void before() {
		v=new VideoStore();
		name="Matrix";
		size=0;
	}
	
	@Test
	public void testAddVideo() {
		name="The matrix";
		v.addVideo(name);
		size=v.getStoreSize();
		lastAdded=v.getLastAdded();
		assertEquals(1,size);
		assertEquals(name,lastAdded.getName());
		
		name="The matrix 2";
		v.addVideo(name);
		size=v.getStoreSize();
		lastAdded=v.getLastAdded();
		assertEquals(2,size);
		assertEquals(name,lastAdded.getName());
	}

	@Test
	public void testDoCheckout() {
		v.addVideo(name);
		v.getLastAdded().doCheckout();
		assertTrue(v.getLastAdded().getCheckout());
	}

	@Test
	public void testDoReturn() {
		v.addVideo(name);
		v.getLastAdded().doReturn();
		assertFalse(v.getLastAdded().getCheckout());
	}

	@Test
	public void testReceiveRating() {
		v.addVideo(name);
		v.receiveRating(name,5);
		lastAdded=v.getLastAdded();
		assertEquals(5,lastAdded.getRating());
	}



}
