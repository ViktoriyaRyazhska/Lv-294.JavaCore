package Classwork;

public class Rectangle {
	private int a;
	private int b;
	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	public int square() throws NegativeSquareException{
		if(a >= 0 && b>=0) {
			return a*b;
		}else {
			throw new NegativeSquareException("One of the numbers is negative!");
		}
	}
}
