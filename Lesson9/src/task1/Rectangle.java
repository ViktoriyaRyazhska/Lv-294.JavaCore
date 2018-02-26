package task1;

public class Rectangle {

	int a;
	int b;
	
	public Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int square(int a, int b) throws NegativeException {
		if (a >= 0 && b >= 0) {
			return a * b;
		} else {
			throw new NegativeException("Values cannot be negative!");
		}
	}

}
