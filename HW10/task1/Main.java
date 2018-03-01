package hw10.task1;

public class Main {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("Thread 1", 5, 1000);
		MyThread t2 = new MyThread("Thread 2", 5, 1000);
		MyThread t3 = new MyThread("Thread 3", 5, 1000);
		t3.addThread(t1);
		t3.addThread(t2);
		System.out.println("Main thread start!");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			System.out.println("Main thread dead!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}
