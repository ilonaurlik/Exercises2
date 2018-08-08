import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Check if PESEL is valid.
 */
public class Exercise12 {
	private String pesel;
	private int[] tokenizedPesel;
	
	public Exercise12(String pesel) {
		this.pesel = pesel;
	}

	private int[] convertIntoInt() {
		String[] splitedPesel = pesel.split("");
		tokenizedPesel = new int[splitedPesel.length];

		for (int i = 0; i < splitedPesel.length; i++) {
			tokenizedPesel[i] = Integer.parseInt(splitedPesel[i]);
		}
		return tokenizedPesel;
	}

	public boolean isPeselValid() {
		return (isLengthValid() && isSumCorrect() && isDateCorrect());
	}

	private boolean isLengthValid() {
		int[] newSplitedPesel = convertIntoInt();
		return (newSplitedPesel.length == 11);
	}

	private boolean isSumCorrect() {
		int sum = 1 * tokenizedPesel[0] + 3 * tokenizedPesel[1] + 7 * tokenizedPesel[2] + 9 * tokenizedPesel[3]
				+ 1 * tokenizedPesel[4] + 3 * tokenizedPesel[5] + 7 * tokenizedPesel[6] + 9 * tokenizedPesel[7]
				+ 1 * tokenizedPesel[8] + 3 * tokenizedPesel[9];
		sum %= 10;
		sum = 10 - sum;
		sum %= 10;

		return (sum == tokenizedPesel[10]);
	}

	private int getBirthYear() {
		int year;
		int month;
		year = 10 * tokenizedPesel[0];
		year += tokenizedPesel[1];
		month = 10 * tokenizedPesel[2];
		month += tokenizedPesel[3];
		if (month > 80 && month < 93) {
			year += 1800;
		} else if (month > 0 && month < 13) {
			year += 1900;
		} else if (month > 20 && month < 33) {
			year += 2000;
		} else if (month > 40 && month < 53) {
			year += 2100;
		} else if (month > 60 && month < 73) {
			year += 2200;
		}
		return year;
	}

	private int getBirthMonth() {
		int month;
		month = 10 * tokenizedPesel[2];
		month += tokenizedPesel[3];
		if (month > 80 && month < 93) {
			month -= 80;
		} else if (month > 20 && month < 33) {
			month -= 20;
		} else if (month > 40 && month < 53) {
			month -= 40;
		} else if (month > 60 && month < 73) {
			month -= 60;
		}
		return month;
	}

	private int getBirthDay() {
		int day;
		day = 10 * tokenizedPesel[4];
		day += tokenizedPesel[5];
		return day;
	}
	
	private boolean isDateCorrectForMonthsWith31Days() {
		int month = getBirthMonth();
		int day = getBirthDay();
		List<Integer> monthsWith31Days = new ArrayList<>(Arrays.asList(1,3,5,7,8,10,12));
		
		return ((day > 0 && day < 32) && (monthsWith31Days.contains(month)));
	}
	
	private boolean isDateCorrectForMonthsWith30Days() {
		int month = getBirthMonth();
		int day = getBirthDay();
		List<Integer> monthsWith30Days = new ArrayList<>(Arrays.asList(4,6,9,11));
		
		return ((day > 0 && day < 31) && (monthsWith30Days.contains(month)));
	}
	
	private boolean isDateCorrectForMonthsForFebruary() {		
		int year = getBirthYear();
		int day = getBirthDay();
		
		return ((day > 0 && day < 30 && ifLeapYear(year)) || (day > 0 && day < 29 && !ifLeapYear(year)));
	}

	private boolean isDateCorrect() {		
		return (isDateCorrectForMonthsWith31Days() || isDateCorrectForMonthsWith30Days() || isDateCorrectForMonthsForFebruary());
	}

	private boolean ifLeapYear(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
	}
}
