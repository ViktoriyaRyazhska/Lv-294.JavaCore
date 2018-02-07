package second.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		/* Enter three numbers. Find out how many of them are odd. */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		OddNumbers numbers = new OddNumbers(br);
		numbers.output();

	}

}
