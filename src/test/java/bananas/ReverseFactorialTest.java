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

	@Test
	void test3628800() {
		assertEquals("10!", this.rf.getResult(3628800));
	}

	@Test
	void test479001600() {
		assertEquals("12!", this.rf.getResult(479001600));
	}

	@Test
	void test6() {
		assertEquals("3!", this.rf.getResult(6));
	}

	@Test
	void test18() {
		assertEquals("NONE", this.rf.getResult(18));
	}

}
