package Homework;

public class NumberOutOfSectionException extends Exception {
	
	private String message = "NumberOutOfSectionException";
	
	public NumberOutOfSectionException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NumberOutOfSectionException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	public NumberOutOfSectionException(String arg0) {
		super(arg0);
		
	}

	public String getMessage() {
		return message;
	}
	
}
