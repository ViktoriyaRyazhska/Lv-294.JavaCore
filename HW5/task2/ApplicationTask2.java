package hw05.task2;

public class ApplicationTask2 {

	private  int [] numArr;

	public ApplicationTask2(int[] numArr) {
		this.numArr = numArr;
	}
	public int action() {
		int sum = 0;
		int prod = 1;
		boolean flag = false;
		for (int i = 0; i < numArr.length / 2; i++) {
			sum += numArr[i];
			prod *= numArr[numArr.length - 1 - i];
			if (numArr[i] < 0) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("A product of the last " + numArr.length / 2
					+ " numbers of an arrey is : " + prod);
			return prod;
		}
		System.out.println("A sum of the first " + numArr.length / 2
				+ " numbers of an arrey is : " + sum);

		return sum;
	}
}
