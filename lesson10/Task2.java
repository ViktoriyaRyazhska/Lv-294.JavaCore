package lesson10;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = new ThreadHello();
		Thread t1 = new Thread(r1);
		Runnable r2 = new ThreadPeace();
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

		System.out.println("My name is...");

	}

}
