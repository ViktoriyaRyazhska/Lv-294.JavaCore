package les10HW10;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new MyThread(1);
		Thread t2 = new MyThread(2);
		Thread t3 = new MyThread(3);
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
	
		System.out.println("the main");
		

	}

}
