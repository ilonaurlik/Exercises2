import java.util.ArrayList;
import java.util.List;

/**
 * Write odd numbers in given range.
 */
public class Exercise02 {
	public List<Integer> getOddNumbers(int number) {
		List<Integer> oddNumbers = new ArrayList<Integer>();
		for (int i = 2; i <= number; i++) {
			if (i % 2 == 1) {
				oddNumbers.add(i);
			}
		}
		return oddNumbers;
	}
}