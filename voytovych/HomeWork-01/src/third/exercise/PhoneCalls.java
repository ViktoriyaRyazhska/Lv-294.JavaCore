package third.exercise;


public class PhoneCalls {

	private double c;
	private double t;
	private static double sum;
	
	public PhoneCalls(double c, double t) {
		this.c = c;
		this.t = t;
	}
	
	public double countTogether() {
		
		double countSeparately = c * t;
		
		sum += countSeparately;
		
		return countSeparately;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double getT() {
		return t;
	}

	public void setT(double t) {
		this.t = t;
	}

	public static double getSum() {
		return sum;
	}

	public static void setSum(double sum) {
		PhoneCalls.sum = sum;
	}
	
	
	
}
