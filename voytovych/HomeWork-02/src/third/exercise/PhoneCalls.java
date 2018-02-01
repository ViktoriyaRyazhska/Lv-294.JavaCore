package third.exercise;

import java.util.ArrayList;

public class PhoneCalls {

	private double c1, c2, c3;
	private double t1, t2, t3;
	private double[] sum;
	
	public PhoneCalls(double c1, double c2, double c3, double t1, double t2, double t3) {
		super();
		this.c1 = c1;
		this.c2 = c2;
		this.c3 = c3;
		this.t1 = t1;
		this.t2 = t2;
		this.t3 = t3;
	}

	public void countSeparately() {
		
		double s1 = c1 * t1;
		double s2 = c2 * t2;
		double s3 = c3 * t3;
		
		sum = new double[3];
		sum[0] = s1;
		sum[1] = s2;
		sum[2] = s3;
	}
	
	public double countTogether() {
		
		double sumCall = 0;
		
		for (double it : sum) {
			sumCall += it; 
		}
		
		return sumCall;
	}
	
	public double getC1() {
		return c1;
	}

	public void setC1(double c1) {
		this.c1 = c1;
	}

	public double getC2() {
		return c2;
	}

	public void setC2(double c2) {
		this.c2 = c2;
	}

	public double getC3() {
		return c3;
	}

	public void setC3(double c3) {
		this.c3 = c3;
	}

	public double getT1() {
		return t1;
	}

	public void setT1(double t1) {
		this.t1 = t1;
	}

	public double getT2() {
		return t2;
	}

	public void setT2(double t2) {
		this.t2 = t2;
	}

	public double getT3() {
		return t3;
	}

	public void setT3(double t3) {
		this.t3 = t3;
	}

	public double[] getSum() {
		return sum;
	}

	public void setSum(double[] sum) {
		this.sum = sum;
	}
	
	
	
}
