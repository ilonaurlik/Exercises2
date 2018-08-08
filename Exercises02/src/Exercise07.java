import java.util.Collections;
import java.util.List;

/**
 * Sort the list descending.
 */
public class Exercise07 {
	public List<Integer> getSortedNumbers(List<Integer> numbers) {
		Collections.sort(numbers, Collections.reverseOrder());
		
		return numbers;
	}
}
