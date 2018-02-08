package task1;

public class Numbers {
	private int a;
	private static int odd;

	public Numbers(int a) {
		this.a = a;
	}

	public void count() {
		if (a % 2 == 1) {
			odd++;
		}
	}

	public static void HowMany() {
		if (odd == 1 || odd == 0) {
			System.out.println(odd + " of them is odd");
		} else
			System.out.println(odd + " of them are odd");
	}

}
