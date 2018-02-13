package hw05.task3;

public class ApplicationTask3 {
	private int[] arr;

	public ApplicationTask3(int[] arr) {
		this.arr = arr;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int secondPositive() {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				count++;
				if (count == 2) {
					System.out
							.println("The position of the second positive number is "
									+ (i + 1));
					return (i + 1);
				}
			}
		}
		System.out.println("There are no two positive numbers in this array!");
		return 0;
	}

	public int positionOfMin() {
		int min = arr[0];
		int minPosition = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minPosition = i;
			}
		}
		System.out.println("The position of the minimum number is "
				+ (minPosition+1));
		return minPosition;
	}
}
