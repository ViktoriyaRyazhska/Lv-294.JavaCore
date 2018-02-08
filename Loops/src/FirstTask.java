
public class FirstTask {
	public static int Maximum(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		return max;
	}

	public static int sumOfPositive(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				sum += array[i];
			}
		}
		return sum;
	}

	public static int amountOfNegative(int[] array) {
		int amount = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				amount++;
			}
		}
		return amount;
	}

	public static int amountOfPositive(int[] array) {
		int pos = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				pos++;
			}
		}
		return pos;
	}

	public static void PosOrNeg(int[] array) {
		int negative = amountOfNegative(array);
		int positive = amountOfPositive(array);
		if (negative > positive) {
			System.out.println("Negative");
		} else if (negative < positive) {
			System.out.println("Positive");
		} else {
			System.out.println("Positive = Negative");
		}
	}
}
