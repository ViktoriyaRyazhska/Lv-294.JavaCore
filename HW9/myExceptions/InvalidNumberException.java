package hw09.myExceptions;

@SuppressWarnings("serial")
public class InvalidNumberException extends MyException {

	public InvalidNumberException() {
		super();
	}

	public InvalidNumberException(String message) {
		super(message);
	}

}
