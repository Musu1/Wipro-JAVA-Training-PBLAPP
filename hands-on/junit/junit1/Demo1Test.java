package junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo1Test {

	@Test
	public void testStringConcat() {
		Demo1 d=new Demo1();
		assertEquals("Result","HelloWorld",d.stringConcat("Hello", "World"));
	}

}
