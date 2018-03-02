package second.exercise;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Output two messages «Hello, world» and «Peace in the peace» 5 times each with
		 * the intervals of 2 seconds, and the second - 3 seconds. After printing
		 * messages, print the text «My name is …»
		 */
		Runnable r1 = new MyRunnable1();
		Runnable r2 = new MyRunnable2();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
		t1.join();
		t2.join();

		System.out.println("My name is …");

	}

}
