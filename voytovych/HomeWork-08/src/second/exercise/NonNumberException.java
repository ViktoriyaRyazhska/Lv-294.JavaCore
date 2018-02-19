package second.exercise;

public class NonNumberException extends Exception {

	private static final long serialVersionUID = 1L;

	public NonNumberException() {

	}

	public NonNumberException(String str) {
		super(str);
	}
}
