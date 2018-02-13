package hw05.task2;

import myScanner.MyScaner;

public class NumbersArrey {
	private int[] numArr;
	private MyScaner sc = new MyScaner();

	public NumbersArrey(int length) {
		this.numArr = new int[length];
		System.out.println("Fill the Arrey with " + length
				+ " integers values: ");
		for (int i = 0; i < numArr.length; i++) {
			System.out.println("Enter " + (i + 1) + " value :");
			numArr[i] = sc.inputIntNumbers();
		}
		sc.close();
		System.out.println("---------------------------------------");
		System.out.println("End.");
	}

	public int[] getNumArr() {
		return numArr;
	}

	public void setNumArr(int[] numArr) {
		this.numArr = numArr;
	}

	
}
