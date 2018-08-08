import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Pregnancy calculator - when is a baby expected to be born, 
 * assuming that the pregnancy lasts exactly nine months?
 */
public class Exercise15 {
	public boolean isDayValid(String date) {
		if (date == null) {
			throw new IllegalArgumentException("Input string cannot be null!");
		} else
			return true;
	}

	public LocalDate calculateDateOfBirth(String date) {
		boolean dateValid;
		LocalDate dateOfBirth = null;

		try {
			dateValid = isDayValid(date);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception caught while checking the date. Expression is incorrect.");
			dateValid = false;
		}

		if (dateValid) {
			LocalDate firstDate = LocalDate.parse(date, DateTimeFormatter.BASIC_ISO_DATE);
			dateOfBirth = firstDate.plusMonths(9);
		}
		return dateOfBirth;
	}
}
