package les10HW10;

public class B extends Thread {
	A a = new A();
	@Override
	public void run() {
		synchronized (Task2.class) {
			System.out.println("B");
			a.start();
		}
	}

}
