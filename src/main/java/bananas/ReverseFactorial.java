package bananas;

public class ReverseFactorial {

	public String getResult(int n) {

		float num = n;

		// Remember the condition in a for loop is a 'while' condition
		for (int i = 2; num > 1; i++) {
			num = num / i;

			if (num == 1) {
				return i + "!";
			}
		}

		return "NONE";

	}
}
