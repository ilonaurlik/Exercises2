/**
 * Calculate weighted average (with note validation - range 2.0 - 5.5, with step = 0.5).
 */
public class Exercise14 {
	private boolean areGradesValid(double[][] grades) {
		for (int i = 0; i < grades.length; i++) {
			boolean isFullGradeAndIsOutsideRange = grades[i][0] < 2 || grades[i][0] > 6;
			boolean isGradeWithPlusOrMinusAndIsOutsideScope = (grades[i][0] * 2) % 2 != 0 && (grades[i][0] * 2) % 2 != 1;
			boolean isGradeOutOfRange = isFullGradeAndIsOutsideRange || isGradeWithPlusOrMinusAndIsOutsideScope;
			
			if (isGradeOutOfRange) {
				throw new IllegalArgumentException("Grades are invalid!");
			}
		}
		return true;
	}

	public double getWeightedAverage(double[][] grades) {
		double sum = 0;
		double sumOfWeights = 0;
		double weightedAverage = 0;
		boolean areGradesValid = areGradesValid(grades);
		
		if (areGradesValid) {
			for (int i = 0; i < grades.length; i++) {
				sum += (grades[i][0] * grades[i][1]);
				sumOfWeights += grades[i][1];
			}
		}
		weightedAverage = sum / sumOfWeights;

		return weightedAverage;
	}
}