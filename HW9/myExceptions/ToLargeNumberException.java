package hw09.myExceptions;

@SuppressWarnings("serial")
public class ToLargeNumberException extends MyException {

	public ToLargeNumberException() {
		super();
	}

	public ToLargeNumberException(String message) {
		super(message);
	}

}
