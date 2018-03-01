package cw10.task2;

public class Main {

	public static void main(String[] args) {
		MyThread t1 = new MyThread("Hello,World", 2000, 5);
		MyThread t2 = new MyThread("Peace in the peace!", 3000, 5);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("My name is Yura!");
	}

}
