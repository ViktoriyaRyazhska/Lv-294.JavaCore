package Classwork;

public class NegativeSquareException extends Exception{
	
	String message = "Negative square";
	
	public NegativeSquareException() {
		super();
	}

	public NegativeSquareException(String arg0) {
		super(arg0);
	}

	public NegativeSquareException(Throwable arg0) {
		super(arg0);
	}

	public String getMessage() {
		return message;
	}


}
