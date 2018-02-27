import java.io.IOException;
import java.util.Scanner;

public class DivMain {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in);) {
			System.out.println(div(in));
		} catch (ArithmeticException e) {
			System.err.println("You can`t divide into zero, please enter double number");
			//return -1; ----doesn't work
		} catch (NumberFormatException | IOException e) {
			System.err.println("Please enter only double number");
			//return -2; ----doesn't work
		}
	}

	public static double div(Scanner in) throws NumberFormatException, IOException { 
		System.out.println("Please enter first double number");
		double first = Double.parseDouble(in.nextLine());
		System.out.println("Please enter second double number");
		double second = Double.parseDouble(in.nextLine());
		if (second == 0) {
			throw new ArithmeticException();
		} else {
			return first / second;
		}
	}
}