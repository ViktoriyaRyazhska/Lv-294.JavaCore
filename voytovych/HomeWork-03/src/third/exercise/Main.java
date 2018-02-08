package third.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError) */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Input input = new Input();
		input.show(br);
	}

}
