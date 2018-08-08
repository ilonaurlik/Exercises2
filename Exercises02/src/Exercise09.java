import java.util.List;

/**
 * Return the sum of negative numbers from the list.
 */
public class Exercise09 {
	public int getSumOfNegativeNumbers(List<Integer> numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) < 0) {
				sum += numbers.get(i);
			}
		}
		return sum;
	}
}
