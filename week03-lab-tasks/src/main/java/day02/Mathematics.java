package day02;

public class Mathematics {
	public boolean isPrime(int number) {
		boolean result = true;

		if (number < 2) return false;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) result = false;
		}

		return result;
	}
}
