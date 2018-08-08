import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * How many days to birthday?
 */
public class Exercise19 {
	public boolean isBirthDateValid(String birthday) {
		if (birthday == null) {
			throw new IllegalArgumentException("birthday cannot be null!");
		} else
			return true;
		}

	public long calculateNumberOfDays(String birthday) {
		return calculateNumberOfDays(birthday, LocalDate.now().format(DateTimeFormatter.BASIC_ISO_DATE));
	}
	
	public long calculateNumberOfDays(String birthday, String referenceDate) {
		boolean birthdayValid;
		long days = 0;
		
		try {
			birthdayValid = isBirthDateValid(birthday);
		} catch (IllegalArgumentException e) {
			System.out.println("Exception caught while checking birthday. Expression is incorrect.");
			birthdayValid = false;
		}
		
		if (birthdayValid) {
			LocalDate birthdayFromString = LocalDate.parse(birthday, DateTimeFormatter.BASIC_ISO_DATE);
			LocalDate reference = referenceDate != null ? LocalDate.parse(referenceDate, DateTimeFormatter.BASIC_ISO_DATE) : LocalDate.now();
			days = ChronoUnit.DAYS.between(reference, birthdayFromString);
			System.out.println("Number of days to your birthday is : " + days);
		}

		return days;
	}

}
