package second.exercise;

public class Calculation {
	private int sum;
	private int product = 1;
	private int[] numbers;
	private int firstPositiveAddends;

	public Calculation(int[] numbers, int firstPositiveAddends) {
		this.numbers = numbers;
		this.firstPositiveAddends = firstPositiveAddends;
	}

	public boolean isPositive() {
		boolean positive = true;
		for (int i = 0; i < firstPositiveAddends; i++) {
			if (numbers[i] < 0) {
				positive = false;
			}
		}
		return positive;
	}

	public void calculationNumbers() {
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0 && i < firstPositiveAddends) {
				sum += numbers[i];
			} else if (i > (firstPositiveAddends - 1)) {
				product *= numbers[i];
			}
		}
	}

	public int getSum() {
		return sum;
	}

	public int getProduct() {
		return product;
	}

}
