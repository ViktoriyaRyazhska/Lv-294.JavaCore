package task1;

public class MyThread extends Thread{
	public void run() {
		try {
			for(int i = 0; i < 10; i++) {
				System.out.println("I study Java");
				sleep(1000);
			}
		} catch (InterruptedException e) {
		}
	}
}
