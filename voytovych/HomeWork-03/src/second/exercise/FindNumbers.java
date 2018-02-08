package second.exercise;

public class FindNumbers {

	public int findMax(int [] numbers) {
		int i = 0;
		int max = numbers[i];
		for (; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}
	
	public int findMin(int [] numbers) {
		int i = 0;
		int min = numbers[i];
		for (; i < numbers.length; i++) {
			if(numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}

}
