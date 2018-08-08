/**
 * Check if the word is a palindrome.
 */
public class Exercise01 {
	public boolean isPalindrome(String expression) {
		String convertedExpression;
		
		if (expression != null) {
			convertedExpression = expression.replaceAll("\\W", "").toLowerCase();
		} else {
			throw new IllegalArgumentException("Expression is empty.");
		}

		for (int i = 0; i < convertedExpression.length(); i++) {
			if (convertedExpression.charAt(i) != convertedExpression.charAt(convertedExpression.length() - i - 1)) {
				return false;
			}
		}

		return true;
	}
}
