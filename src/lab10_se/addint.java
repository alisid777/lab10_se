package lab10_se;

import static org.junit.Assert.*;

import org.junit.Test;

public class addint {

	@Test
	public void testAddint() {
		lab10_class test = new lab10_class();
		int result = test.addint(1, 2);
		assertEquals(3, result);
	}

}
