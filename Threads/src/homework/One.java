package homework;

public class One implements Runnable {

	@Override
	public void run() {
		Runnable r = new Two();
		Thread t = new Thread(r);
		t.start();

	}

}
