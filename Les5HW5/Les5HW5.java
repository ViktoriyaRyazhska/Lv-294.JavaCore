package Les5HW5;

import java.awt.print.Printable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Les5HW5 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		Car car4 = new Car();
		Car[] cars = { car1, car2, car3, car4 };
		car1.setType("Toyota");
		car2.setType("Mercedes");
		car3.setType("Audi");
		car4.setType("Tesla");
		car1.writeYear(b);
		car2.writeYear(b);
		car3.writeYear(b);
		car4.writeYear(b);
		orderedByYear(cars);
		printCar(cars);

	}

	static public void orderedByYear(Car[] car) {
		Car min;
		for (int i = 0; i<car.length-1; i++) {
			for (int j = i+1; j<car.length; j++) {
				if (car[i].getYear() > car[j].getYear()) {
					min = car[i];
					car[i]=car[j];
					car[j]=min;
				}
			}

		}

	}

	static public void printCar(Car[] cars) {
		System.out.println("Sorted by year");
		for (Car c : cars) {
			System.out.println("The car`s type is " + c.getType() + " of " + c.getYear() + " year"
					+ " and engine capacity is" + c.getEngineCapacity());
		}
	}

}
