package first.exercise;

public class FlowerBed implements Circle {
	
	private double r;
	
	private static final double PI = Math.PI;
	
	public double area(double r) {
		
		return (PI * Math.pow(r, 2));
	}
	
	public double circleLength(double r) {
		
		return (2 * PI * r);
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}
	
	
}
