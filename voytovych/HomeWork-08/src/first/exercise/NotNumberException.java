package first.exercise;

public class NotNumberException extends Exception {

	private static final long serialVersionUID = 1L;

	public NotNumberException() {

	}

	public NotNumberException(String str) {
		super(str);
	}
}
