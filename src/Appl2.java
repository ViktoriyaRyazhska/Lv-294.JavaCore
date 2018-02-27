public class Appl2 {
	public static int sum = 1;

	public static void main(String[] args) throws InterruptedException {

		Runnable r1 = new Run1();
		Thread t1 = new Thread(r1);

		Runnable r2 = new Run2();
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();
//		Thread.sleep(200);
		Thread.yield();
		System.out.println("Success, sum = " + sum);
	}
}
