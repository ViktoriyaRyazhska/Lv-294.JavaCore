package third.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		/* Enter the name of the country. Print the name of the continent (Declare enum with names of continents). */

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the name of the country: ");
		String country = br.readLine().toLowerCase();
		
		ShowContinent.output(country);
		
		
	}

}
