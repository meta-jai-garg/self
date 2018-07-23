package area;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaTest {

	@Test
	public void testTriangle() {
		assertEquals(25.0, new Area().areaOfTriangle(10, 5), 1);
	}

	@Test
	public void testRectangle() {
		assertEquals(50.0, new Area().areaOfRectangle(10, 5), 1);
	}

	@Test
	public void testSquare() {
		assertEquals(25.0, new Area().areaOfSquare(5), 1);
	}

	@Test
	public void testCircle() {
		assertEquals(78.5, new Area().areaOfCircle(5), 1);
	}
}
