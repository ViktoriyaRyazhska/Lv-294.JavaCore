package cw09.task1;

public class Rectangle {

	public double squareRectangle(int a , int b) throws MyException {
		if(a < 0 || b < 0 ) {
			throw new MyException("Negativ number Exceptio!");
		}
		return a*b;
	}
}
