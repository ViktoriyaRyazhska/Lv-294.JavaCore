package first.exercise;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Output text «I study Java» 10 times with the intervals of one second
		 * (Thread.sleep(1000);)
		 */
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		
		t.start();
		t.join();
		
		System.out.println("Finish");

	}

}
