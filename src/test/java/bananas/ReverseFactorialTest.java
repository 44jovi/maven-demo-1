package bananas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseFactorialTest {

	private ReverseFactorial rf = new ReverseFactorial();

	@Test
	void testGetResult() {
		assertEquals(3628800, this.rf.getResult(120));
//		fail("Not yet implemented");
	}

}
