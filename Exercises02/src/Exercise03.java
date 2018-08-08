import java.util.ArrayList;
import java.util.List;

/**
 * Write prime numbers in given range (sieve of Eratosthenes).
 */
public class Exercise03 {
	private boolean isPrimeNumber(int number) {
		boolean isPrime = true;
		if (number < 2) {
			isPrime = false;
		}
		if (number == 2) {
			isPrime = true;
		}
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
	
	public List<Integer> getPrimeNumbers(int number) {
		List<Integer> primeNumbers = new ArrayList<Integer>();
		for (int j = 2; j <= number; j++) {
			boolean primeNumber = isPrimeNumber(j);
			if (primeNumber) {
				primeNumbers.add(j);
			}
		}
		return primeNumbers;
	}
}
