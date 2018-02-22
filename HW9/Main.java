package hw09;

import hw09.myExceptions.InvalidLengthException;

public class Main {

	public static void main(String[] args) {
		try (Application app = new Application()) {
			// try {
			// System.out.println(app.div(0, 2));
			// } catch (ArithmeticException exc) {
			// System.err.println("Dividing by Zerro! ");
			// } catch (Exception e) {
			// System.err.println("Exception!");
			// e.printStackTrace();
			// }
			//
			try {
				app.main(1, 100, 10);
			} catch (InvalidLengthException e) {
				System.err.println(e.getMessage());
			}
		}
	}
}
