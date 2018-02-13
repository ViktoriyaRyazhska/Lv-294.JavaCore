package fourth.exercise;

public class Product {

	public int countEvenNumbers(int[] array) {
		int pr = 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0 && array[i] != 0) {
				pr *= array[i];
			}
		}
		return pr;
	}
}
