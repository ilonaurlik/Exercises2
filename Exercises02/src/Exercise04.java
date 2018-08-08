import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Count words in text.
 */
public class Exercise04 {
	public long getNumberOfWordsInText(String text) { 
		List<String> words = new ArrayList<>();
		words = Arrays.asList(text.split(" "));
		long numberOfWords = words.size();

		return numberOfWords;
	}
}