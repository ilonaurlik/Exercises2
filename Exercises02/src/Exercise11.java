/**
 * Find the greatest common divisor.
 */
public class Exercise11 {
	public long getGreatestCommonDivisor(long a, long b) {
		while (a != b) {
			if (a > b) {
				a -= b;
			} else {
				b -= a;
			}
		}
		return a;
	}
}
