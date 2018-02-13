package fifth.exercise;

import java.io.BufferedReader;
import java.io.IOException;

public class Display {
	public void displayCar(Car [] array, BufferedReader br) throws IOException {
		Input in = new Input();
		int year = in.inputYear(br);
		Car tmp;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i].getYearOfProduction() < array[j].getYearOfProduction()) {
					tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}

		}
		System.out.println("Cars certain model year: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i].getYearOfProduction() == year) {
				System.out.println(array[i]); 
			}
		}
	}
}
