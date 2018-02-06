package cw04;

import cw04.task4.Product;
import cw04.task4.ProductApp;

//import cw04.task1.Numbers;
//import cw04.task2.DayOfTheWeek;

public class Main {

	public static void main(String[] args) {
		
		// Numbers num = new Numbers();
		// num.start(3);
		
		// DayOfTheWeek days = new DayOfTheWeek();
		// days.start();

		Product p1 = new Product("Gold", 150, 150);
		Product p2 = new Product("Silver", 50, 1500);
		Product p3 = new Product("Iron", 1.5, 150);
		Product p4 = new Product("Platinum", 350, 50);

		ProductApp app = new ProductApp(p1, p2, p3, p4);
		System.out.println(app.mostExpensive());
		System.out.println(app.biggestQuantity());
	}

}
