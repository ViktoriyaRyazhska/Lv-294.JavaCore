package task2;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		Thread t1 = new MyThread1();
		Thread t2 = new MyThread2();
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("My name is ...");
	}
}
