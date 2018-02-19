package first.exercise;

public class NegativeValueException extends Exception {

	private static final long serialVersionUID = 1L;

	public NegativeValueException() {

	}

	public NegativeValueException(String msg) {
		super(msg);
	}

}
