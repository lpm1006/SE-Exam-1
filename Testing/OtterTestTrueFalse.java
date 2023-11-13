package Testing;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class OtterTestTrueFalse {
	@Test
	void testTrue() {
		Otter otter = new Otter();
		int actual = 10;
		
		otter.setLegs(10);
		assertTrue((otter.getLegs()==actual));  // is equivalent to assertTrue(true) which passes
	}

	/*
	 * Test for false
	 */
	@Test
	void testFalse() {
		Otter otter = new Otter();
		int actual = 10;
		
		otter.setLegs(10);
		assertFalse((otter.getLegs()==actual));  // is equivalent to assertFalse(true) which does not pass
	}
	
	
	/*
	 * Test for null
	 */
	@Test
	void testNull() {
		Otter otter = new Otter();
		int actual = 10;
		//newElephant = new Elephant();
		otter = null;
		
		assertNull((otter.getLegs()==actual)); 
	}
}
