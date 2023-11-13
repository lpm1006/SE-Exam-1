package Testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OtterTestBeforeAfterEach {
	static Otter otter;
	
	@BeforeEach
	public void setUp() throws Exception { // method executed before each test case
		System.out.println("Setup");
		otter = new Otter();
	}
	
	@AfterEach
	public void tearDown() throws Exception { // method executed after each test case
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
