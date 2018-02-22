package Classwork;

public class TypeException extends Exception{

	private String message = "TypeException";
	
	public TypeException() {
		super();
	}

	public TypeException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public TypeException(String arg0) {
		super(arg0);
	}
	
	@Override
	public String getMessage() {
		return message;
	}
	
}
