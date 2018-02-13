package lesson05;

public class IntArr {
	private int[] arr;

	public IntArr(int[] arr) {
		this.arr = arr;
	}

	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getBigest() {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max <= arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public int getSumPositiveNums() {
		int sum = 0;
		for (int i : arr) {
			if (i > 0) {
				sum += i;
			}
		}
		return sum;
	}

	public int amountNegNums() {
		int count = 0;
		for (int i : arr) {

			if (i < 0) {
				count++;
			}
		}
		return count;
	}

	public void whatMore() {
		if (amountNegNums() > (arr.length - amountNegNums())) {
			System.out.println(" Negative values are more then Positive!");
		} else {
			System.out.println(" Positive values are more then Negative!");
		}

	}
}
