package Classwork;

public class ColorException extends Exception{

	private String message = "ColorException";
	
	public ColorException() {
		super();
	}

	public ColorException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public ColorException(String arg0) {
		super(arg0);
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
