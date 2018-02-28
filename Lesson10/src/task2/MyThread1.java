package task2;

public class MyThread1 extends Thread{
	public void run() {
		try {
			for(int i = 0; i<5; i++) {
				System.out.println("Hello, world!");
				sleep(200);
			}
		} catch(InterruptedException e) {}
	}
}
