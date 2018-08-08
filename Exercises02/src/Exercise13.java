import java.util.List;

/**
 * Calculate arithmetic average (with note validation - range 2.0 - 5.5, with step = 0.5).
 */
public class Exercise13 {
	private boolean areGradesValid(List<Double> grades) {
		for (int i = 0; i < grades.size(); i++) {
			boolean isFullGradeAndIsOutsideRange = grades.get(i) < 2 || grades.get(i) > 6;
			boolean isGradeWithPlusOrMinusAndIsOutsideScope = (grades.get(i) * 2) % 2 != 0  && (grades.get(i) * 2) % 2 != 1;
			boolean isGradeOutOfRange = isFullGradeAndIsOutsideRange || isGradeWithPlusOrMinusAndIsOutsideScope;
			
			if (isGradeOutOfRange) {
				throw new IllegalArgumentException("Grades are invalid!");
			}
		}
		return true;
	}

	public double getArithmeticAverage(List<Double> grades) {
		double sum = 0;
		double arithmeticAverage = 0;
		boolean areGradesValid = areGradesValid(grades);
		
		if (areGradesValid) {
			for (int i = 0; i < grades.size(); i++) {
				sum += grades.get(i);
			}
		}
		arithmeticAverage = sum / (grades.size());

		return arithmeticAverage;
	}
}
