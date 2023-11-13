package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.Test;

public class OtterTest { // class including basic JUnit tests
	@Test
	void testLegs() { // test method for setting/getting otter leg values
		Otter otter = new Otter();
		int actual = 5;
		
		otter.setLegs(5);
		assertEquals(otter.getLegs(), actual);
	}
	
	@Test
	void testColor() { // test method for setting/getting otter color values
		Otter otter = new Otter();
		String actual = "red";
		
		otter.setColor("red");
		assertSame(otter.getColor(), actual);
	}
}
