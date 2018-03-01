package les10HW10;

public class MainTask3 {

	public static void main(String[] args) {
		Thread one = new One(new Two());
		one.start();

	}

}
