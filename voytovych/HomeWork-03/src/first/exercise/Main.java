package first.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/* read 3 float numbers and check: are they all belong to the range [-5,5] */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Input input = new Input(br);
		CheckNumbers c = new CheckNumbers();
		boolean number1 = c.check(input.getN1());
		boolean number2 = c.check(input.getN2());
		boolean number3 = c.check(input.getN3());
		
		System.out.println("First number " + (number1 ? "belong to the range [-5,5]" : "don't belong to the range [-5,5]"));
		System.out.println("Second number " + (number2 ? "belong to the range [-5,5]" : "don't belong to the range [-5,5]"));
		System.out.println("Third number " + (number3 ? "belong to the range [-5,5]" : "don't belong to the range [-5,5]"));
		
		
	}

}
