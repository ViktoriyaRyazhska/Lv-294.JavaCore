package fifth.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		
		/*Create class Car with fields type, year of production and engine capacity. 
		 * Create and initialize four instances of class Car. Display cars 
		 * certain model year  (enter year in the console);
		 * ordered by the field year.*/
		
		Car c1 = new Car("Truck", 2000, 1000);
		Car c2 = new Car("Sedan", 2000, 1500);
		Car c3 = new Car("Van", 2010, 2500);
		Car c4 = new Car("Sports Car", 2005, 1800);
		Car [] cars = new Car[4];
		cars[0] = c1;
		cars[1] = c2;
		cars[2] = c3;
		cars[3] = c4;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Display d = new Display();
		d.displayCar(cars, br);
		
	}

}
