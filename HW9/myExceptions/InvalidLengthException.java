package hw09.myExceptions;

@SuppressWarnings("serial")
public class InvalidLengthException extends MyException{

	public InvalidLengthException() {
		super();
	}

	public InvalidLengthException(String message) {
		super(message);
	}

}
