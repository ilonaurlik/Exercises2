/**
 * Convert the text to the Morse code.
 */
public class Exercise20 {
	private final char[] LETTERS = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
			's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', ',', '.', '?',
			' '};
	private final String[] MORSE = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
			"--", "-.", "---", ".---.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..",
			".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.", "-----", "--..--",
			".-.-.-", "..--..", " "};

	public String convertExpressionToMorse(String expression) {
		char[] dividedExpression = expression.toLowerCase().toCharArray();
		StringBuilder convertedExpression = new StringBuilder();

		for (int i = 0; i < dividedExpression.length; i++) {
			for (int j = 0; j < LETTERS.length; j++) {
				if (dividedExpression[0] == LETTERS[j]) {
					convertedExpression.append(MORSE[j]);
				}else if (dividedExpression[i] == LETTERS[j]) {
					convertedExpression.append(" ").append(MORSE[j]);
				}
			}
		}
		return convertedExpression.toString();
	}
}