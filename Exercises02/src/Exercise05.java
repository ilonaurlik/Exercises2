/**
 * Count letters in text (without whitespaces).
 */
public class Exercise05 {
	public long getNumberOfLetters(String expression) {
		long numberOfLetters; 
		
		if (expression != null) {
			String trimmedExpression = expression.replaceAll("\\W", "");
			numberOfLetters = trimmedExpression.length();
		} else {
			throw new IllegalArgumentException("Expression is empty.");
		}
		
		return numberOfLetters;
	}
}