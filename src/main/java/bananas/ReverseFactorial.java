package bananas;

public class ReverseFactorial {

	public String getResult(int n) {

		int num = n;

		for (int i = 2; num > 1; i++) {
			num = num / i;

			if (num == 1) {
				return i + "!";
			}
		}

		return "NONE";

	}
}
