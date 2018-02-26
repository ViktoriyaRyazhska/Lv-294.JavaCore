package les9HW9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) {


		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
			System.out.println(div(br));
		}
		catch (NumberFormatException | IOException e) {
			System.out.println("You shoul write only double digit");
		}
		catch (ArithmeticException e) {
			System.out.println("You can`t divide into zero, please write another second number");
		}
		
	}

	public static double div( BufferedReader br) throws NumberFormatException, IOException {
		System.out.println("Please write first double digit");
		double a = Double.parseDouble(br.readLine());
		System.out.println("Please write second double digit");
		double b = Double.parseDouble(br.readLine());
		if(b==0) {
			throw new ArithmeticException();
		}
		else {
		return a/b ;
	}
	}
}
