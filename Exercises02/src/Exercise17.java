/**
 * Caesar cipher.
 */
public class Exercise17 {
	private static final String ALPHABET = "ABCDEFGHIJKLMNOPRSTUWXYZ"; 

	public String getTokenizedExpression(String expression) {
		char[] letters = expression.toUpperCase().toCharArray();
		StringBuilder dividedExpression = new StringBuilder();
		int letterPosition = 0;
		char encodedLetter;

		for (int i = 0; i < letters.length; i++) {
			if (Character.isLetter(letters[i])) {
				if (letters[i] == 'z') {
					dividedExpression.append('a');
				} else {
					letterPosition = ALPHABET.indexOf(letters[i]);
					encodedLetter = ALPHABET.charAt(letterPosition + 1);
					dividedExpression.append(encodedLetter);
				}
			} else {
				letterPosition = ALPHABET.indexOf(letters[i]);
				dividedExpression.append(letters[i]);
			}
		}
		return dividedExpression.toString();
	}
}
