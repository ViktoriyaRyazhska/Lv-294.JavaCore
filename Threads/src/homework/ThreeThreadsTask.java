package homework;

public class ThreeThreadsTask {

	public ThreeThreadsTask() {
		
	}

	public void perform() {
		Runnable r1 = new MassageThread(1);
		Runnable r2 = new MassageThread(2);
		Runnable r3 = new MassageThread(3);
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t3.start();
	}
}
