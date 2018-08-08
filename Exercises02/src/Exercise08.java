import java.util.Collections;
import java.util.List;

/**
 * Find the largest element in the list.
 */
public class Exercise08 {
	public Integer getLargestNumber(List<Integer> numbers) {
		Collections.sort(numbers, Collections.reverseOrder());
		Integer largestNumber = numbers.get(0);
		
		return largestNumber;
	}
}
