/**
 * Check if the year is leap one.
 */
public class Exercise06 {
	public boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
}