package test1;

import static org.junit.Assert.*;

import org.junit.Test;

public class Demo2Test {

	@Test
	public void testIsPalindrome() {
		Demo2 d=new Demo2();
		assertFalse("Result",d.isPalindrome("RAMAN"));
		assertTrue("Result",d.isPalindrome("Madam"));
		assertTrue("Result",d.isPalindrome("Malayalam"));
		assertFalse("Result",d.isPalindrome("HI"));
		}

}
