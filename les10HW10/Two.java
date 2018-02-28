package les10HW10;

public class Two extends Thread {
	Thread tree = new Tree();

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
		}
		tree.start();
	}
}
