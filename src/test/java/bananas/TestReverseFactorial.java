package bananas;

// TODO: Import JUnit

public class TestReverseFactorial {

	private ReverseFactorial run = new ReverseFactorial();

	@Test
	void testFactorial() {
		assertEquals(3628800, this.Factorial(120));
	}

}
