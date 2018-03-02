package third.exercise;

public class Main {

	public static void main(String[] args) {
		/*
		 * Create a thread «one», which would start the thread «two», which has to
		 * output its number («Thread number two») 3 times and create thread «three»,
		 * which would to output message «Thread number three» 5 times.
		 */

		Thread thread3 = new MyThread("Thread number three", 5);
		Thread thread2 = new MyThread(thread3, "Thread number two", 3);
		Thread thread1 = new MyThread(thread2);

		thread1.start();

	}

}
