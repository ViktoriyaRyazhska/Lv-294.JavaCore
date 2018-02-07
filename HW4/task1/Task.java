package hw04.task1;

public class Task {

	private boolean swch = true;

	public boolean startA(float min, float max, float... nums) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < min || nums[i] > max) {
				swch = false;
			}
		}
		System.out.println("---------------------------------------");
		if (swch) {
			System.out.println("All numbers are belong to the range [" + min
					+ " , " + max + "]");
			// returns is necessary for testing this method
			return true;
		} else {
			System.out.println("All numbers are NOT belong to the range ["
					+ min + " , " + max + "]");
			return false;
		}
	}

	public String startB(int... nums) {
		int min = nums[0];
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
			if (nums[i] > max)
				max = nums[i];
		}
		System.out.println("---------------------------------------");
		System.out.println(" Min number: " + min + " Max number: " + max);
		// returns is necessary for testing this method
		return min + ";" + max;
	}

	public String startC(int errNum) {
		HTTPErrorEnum[] errors = HTTPErrorEnum.values();
		for (int i = 0; i < errors.length; i++) {
			if (errors[i].getNum() == errNum) {
				return errors[i].toString();
			}
		}
		return "ERROR NUMBER NOT FOUND";
	}
}
