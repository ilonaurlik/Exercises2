/**
 * Count k^n.
 */
public class Exercise10 {

	private double handleCornerCases(double baseOfThePower, double exponent) {
		double result = 0;
		if (exponent == 0 && baseOfThePower != 0) {
			result = 1;
		} else if (baseOfThePower == 0) {
			result = 0;
		}
		return result;
	}

	public double getPower(double baseOfThePower, double exponent) {
		double result = 0;
        if (exponent > 0) {
        	for (long i = 1; i <= exponent; i++) {
        		result *= baseOfThePower;
        	}
        } else if (exponent < 0) {
        	for (double i = exponent; i < 0; i++) {
        		result *= 1/baseOfThePower;
        	}
        } else {
        	handleCornerCases(baseOfThePower, exponent);
        }
        return result;
    }
}
