package assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPosfixEvaluation {

	@Test
	public void testEvaluation() {
		String expression = "2 3 1 * + 9 -";
		assertEquals(-4, PostfixEvaluation.evaluate(expression));
	}

}
