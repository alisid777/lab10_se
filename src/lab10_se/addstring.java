package lab10_se;

import static org.junit.Assert.*;

import org.junit.Test;

public class addstring {

	@Test
	public void testAddstring() {
		lab10_class test = new lab10_class();
		String result = test.addstring("Hello", "World");
		assertEquals("HelloWorld", result);
	}

}
