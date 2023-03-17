package bananas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class ReverseFactorialTest {

	private ReverseFactorial rf = new ReverseFactorial();

	@Test
	void test120() {
		assertEquals("5!", this.rf.getResult(120));
	}

	@Test
	void test150() {
		assertEquals("NONE", this.rf.getResult(150));
	}

}
