import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Sweepstake - generate 6 numbers from 49.
 */
public class Exercise18 {

	private List<Integer> generatedNumbers;
	
	public Exercise18() {
		generatedNumbers = generateRandomNumbers();
	}

	private List<Integer> generateRandomNumbers() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 50; i++) {
			list.add(new Integer(i));
			
		}
		Collections.shuffle(list);
		for (int i = 0; i < 6; i++) {
			System.out.println(list.get(i));
		}

		return list;
	}
	
	public List<Integer> getGeneratedNumbers() {
		return generatedNumbers;
	}
}