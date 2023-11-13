package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class OtterTestBeforeAfterAll {
	static Otter otter;
	
	@BeforeAll
	public static void setUp() throws Exception { // method executed before all test cases
		System.out.println("Setup");
		otter = new Otter();
	}
	
	@AfterAll
	public static void tearDown() throws Exception {
		System.out.println("Teardown");
	}
	
	@Test
	void testLegs() { // test method for setting/getting otter leg values
		int actual = 5;
		otter.setLegs(5);
		
		System.out.println("testLegs()");
		assertEquals(otter.getLegs(), actual);
	}
	
	@Test
	void testColor() { // test method for setting/getting otter color values
		String actual = "red";
		otter.setColor("red");
		
		System.out.println("testColor()");
		assertSame(otter.getColor(), actual);
	}
}
