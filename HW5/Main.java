package hw05;

import hw05.task5.Car;
import hw05.task5.CarsApplication;
import hw05.task5.CarsBodys;

//import hw05.task4.ApplicationTask4;

//import hw05.task2.NumbersArrey;
//import hw05.task3.ApplicationTask3;

//import hw05.task1.MonthArrey;
//import hw05.task2.NumbersArrey;

public class Main {

	public static void main(String[] args) {
		// MonthArrey arr = new MonthArrey();
		// arr.displayNumDays();
		
		// ApplicationTask2 array = new ApplicationTask2(new
		// NumbersArrey(10).getNumArr());
		// array.action();
		
		// ApplicationTask3 array = new ApplicationTask3(
		// new NumbersArrey(5).getNumArr());
		// array.secondPositive();
		// array.positionOfMin();
		
		// ApplicationTask4 app = new ApplicationTask4();
		// app.start();

		Car car1 = new Car(CarsBodys.HATCHBACK, 2005, 1.1);
		Car car2 = new Car(CarsBodys.COUPE, 2010, 1.4);
		Car car3 = new Car(CarsBodys.MINIVAN, 2008, 2.0);
		Car car4 = new Car(CarsBodys.MUV, 2000, 5.0);
		Car car5 = new Car(CarsBodys.CONVERTIBLE, 2015, 2.8);
		Car car6 = new Car(CarsBodys.HATCHBACK, 1995, 2.1);
		Car car7 = new Car(CarsBodys.HATCHBACK, 2018, 1.8);
		CarsApplication app = new CarsApplication(car1, car2, car3, car4, car5,
				car6, car7);
		app.displayByYear();
		System.out.println("-------------------------------------------------");
		app.displayAll();
		System.out.println("-------------------------------------------------");
		app.orderedByYear();
		
	}
}
