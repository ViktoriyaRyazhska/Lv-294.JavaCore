package Classwork;

import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;
import Classwork.Continents.*;

public class ThirdTask {
	private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	/*private Africa af;
	private Asia as;
	private Australia aus;
	private Europe eu;
	private NorthAmerica na;
	private SouthAmerica su;*/

	public void doTask() {
		try {
			System.out.println("Enter the country");
			String country = reader.readLine().toUpperCase();
			if (Africa.contains(country)) {
				System.out.println("Africa");
			}
			if (Asia.contains(country)) {
				System.out.println("Asia");
			}
			if (Australia.contains(country)) {
				System.out.println("Australia");
			}
			if (Europe.contains(country)) {
				System.out.println("Europe");
			}
			if (NorthAmerica.contains(country)) {
				System.out.println("North America");
			}
			if (SouthAmerica.contains(country)) {
				System.out.println("South America");
			}

		} catch (NumberFormatException e) {
			System.out.println("Wrong input!");
		} catch (IOException e) {
			System.out.println("IO Exception!");
		}
	}
}
