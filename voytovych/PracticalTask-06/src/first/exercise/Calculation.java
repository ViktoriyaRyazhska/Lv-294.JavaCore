package first.exercise;

public class Calculation {

	private int[] numbers;

	public Calculation() {

	}

	public Calculation(int[] numbers) {

		this.numbers = numbers;
	}
	
	//the biggest number
	public int biggestNumber() {
		int max = numbers[0];
		int i = 0;
		while (i < numbers.length) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
			i++;
		}
		return max;
	}
	
	//the sum of positive numbers in the array
	public int sumOfPositiveNumbers() {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) { 
			if(numbers[i] > 0) {
				sum += numbers[i];	
			}

			}
		return sum;
	}
	
	//the amount of negative numbers in the array
	public int amountOfNegativeNumbers() {
		int amount = 0;
		for (int a : numbers) {
			if (a < 0) { amount++; }
		}

		return amount;
	}
	
	//Compares a set of negative and positive numbers
	public void comparisonOfSets() {
		int positiveNumber = 0;
		int negativeNumber = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] > 0) {
				positiveNumber++;
			}else {
				negativeNumber++;
			}
		}
		System.out.println((positiveNumber > negativeNumber?"Positive":"Negative") + " numbers are more");
	}

	public int[] getNumbers() {
		return numbers;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}
	
	
}
