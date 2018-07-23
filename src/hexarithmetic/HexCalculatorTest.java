package hexarithmetic;

import static org.junit.Assert.*;

import org.junit.Test;

public class HexCalculatorTest {
	HexaCalculator hex = new HexaCalculator();

	@Test
	public void checkHexCalculator() {
		try {
			assertEquals("1423", hex.add("8AB", "B78"));
			assertEquals("0", hex.subtract("AB", "AB"));
			assertEquals("6E", hex.multiply("A", "B"));
			assertEquals("0", hex.divide("A", "0"));
		} catch (NumberNotValidException e) {
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
