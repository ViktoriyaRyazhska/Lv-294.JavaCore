package third.exercise;

public class Calculation {
	private int [] array;
	
	public Calculation(int[] array) {
		this.array = array;
	}

	public int positiveNumber() {
		int positiveNumber = -1;
		int counter = 1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0 && counter <= 2) {
				positiveNumber = array[i];
				counter++;
			}
		}
		return positiveNumber;
	}
	
	public int positionOfNumber() {
		int positionOfPositiveNumber = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == positiveNumber()) {
				positionOfPositiveNumber = i;
			}
		}
		return positionOfPositiveNumber;
		
	}

	public int minimumNumber() {
		int minNumber = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < minNumber) {
				minNumber = array[i];
			}
		}
		return minNumber;
	}
	
	public int posMinNumber() {
		int posMinNumber = -1;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == minimumNumber()) {
				posMinNumber = i;
				break;
			}
		}
		return posMinNumber;
	}
}









