package fifth.exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Input {

	public int inputYear(BufferedReader br) throws IOException {
		System.out.println("Please enter year of car: ");
		String year = br.readLine();
		return Integer.parseInt(year);
	}

}
