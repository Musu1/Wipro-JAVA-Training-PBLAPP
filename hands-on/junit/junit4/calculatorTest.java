package test2;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculatorTest {
	calculator c=new calculator();
	@Test
	public void testAdd() {
		assertEquals("Result",20, c.add(15, 5));
		assertEquals("Result",50, c.add(40, 10));
		assertEquals("Result",5, c.add(10, -5));
		assertEquals("Result",5, c.add(0,5));
	}

	@Test
	public void testSub() {
		assertEquals("Result",5, c.sub(5,0));
		assertEquals("Result",10, c.sub(20,10));
		assertEquals("Result",0, c.sub(5,5));
	}

}
