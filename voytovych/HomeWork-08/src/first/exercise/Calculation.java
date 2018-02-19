package first.exercise;

public class Calculation {
	public static double div(double a, double b) {
		double d;
		if (b != 0) {
			d = a / b;
		} else {
			throw new ArithmeticException("You try to divide by zero.");
		}
		return d;
	}
}
