package first.exercise;

public class Main {

	public static void main(String[] args) {
		/*
		 * Run three threads and output there different messages for 5 times. The third
		 * thread supposed to start after finishing working of the two previous threads.
		 */
		
		MyThread t1 = new MyThread("Message 1", 5, 500);
		MyThread t2 = new MyThread("Message 2", 5, 500);
		MyThread t3 = new MyThread("Message 3", 5, 500, t1, t2);

		System.out.println("Start!");
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
			System.out.println("End!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
