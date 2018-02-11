package hw05.task4;

import myScanner.MyScaner;

public class ApplicationTask4 {
	private MyScaner sc = new MyScaner();

	public int start() {

		int prodOfEven = 1;
		int value = 0;
		do {
			System.out.println("Enter next number:");
			value = sc.inputIntNumbers();
			if (value % 2 == 0) {
				prodOfEven *= value;
			}
		} while (value >= 0);
		sc.close();
		System.out.println("--------------------------------------");
		if (prodOfEven > 1) {
			System.out.println("The product of all event numbers is "
					+ prodOfEven);
			return prodOfEven;
		}
		System.out.println("There is no event numbers!");
		return 0;
	}

}
