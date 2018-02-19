package second.exercise;

public class OutOfRangeException extends Exception {

	private static final long serialVersionUID = 1L;

	public OutOfRangeException() {

	}

	public OutOfRangeException(String str) {
		super(str);
	}
}
