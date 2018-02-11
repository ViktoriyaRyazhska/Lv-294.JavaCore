package hw05.task5;

import java.time.LocalDate;

import myScanner.MyScaner;

public class CarsApplication {
	private Car[] cars;
	private MyScaner sc = new MyScaner();

	public CarsApplication(Car... cars) {
		this.cars = new Car[cars.length];
		this.cars = cars;
	}

	public Car[] getCars() {
		return cars;
	}

	public void setCars(Car[] cars) {
		this.cars = cars;
	}

	public void displayByYear() {
		int year = sc.inputYear(1888, LocalDate.now().getYear());
		System.out.println("--------------------------------------");
		for (Car car : cars) {
			if (car.getYearOfProduction() == year) {
				System.out.println(car);
			}
		}
		System.out.println("--------------------------------------");
	}

	public void displayAll() {
		for (Car car : cars) {
			System.out.println(car);
		}
	}

	public void orderedByYear() {
		Car tempCar = new Car();
		boolean swch = true;
		while (swch) {
			swch = false;
			for (int i = 0; i < cars.length - 1; i++) {
				if (cars[i].getYearOfProduction() < cars[i + 1]
						.getYearOfProduction()) {
					tempCar = cars[i];
					cars[i] = cars[i + 1];
					cars[i + 1] = tempCar;
					swch = true;
				}
			}
		}
		displayAll();
	}
}
