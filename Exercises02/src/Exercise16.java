/**
 * Get the area of ring.
 */
public class Exercise16 {
	private final double PI = Math.PI;
	
	private boolean isRadiusCorrect(double smallerRadius, double largerRadius) throws IllegalArgumentException {
		if (smallerRadius <= 0 || largerRadius <= 0 || smallerRadius > largerRadius) {
			throw new IllegalArgumentException("Parameter is incorrect.");
		}
		return true;
	}

	public double getArea(double smallerRadius, double largerRadius) { 
		double area = 0;
		try {
			if (isRadiusCorrect(smallerRadius, largerRadius)) {
				area = PI * (largerRadius * largerRadius - smallerRadius * smallerRadius);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return area;
	}

}
