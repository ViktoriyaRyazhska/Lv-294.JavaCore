public class MyThread1 extends Thread {
	private int number;
	private int pause;
	private Thread t;

	public MyThread1(int number, int pause) {
		this.number = number;
		this.pause = pause;
	}
	
	public MyThread1(int number, int pause, Thread t) {
		this.number = number;
		this.pause = pause;
		this.t = t;
	}


	@Override
	public void run() {
		if (t != null)
			try {
				t.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		for (int i = 0; i < 5; i++) {
			try {
				sleep(pause);
			} catch (InterruptedException e) {
			}
			System.out.println("Thread " + number);
		}
	}
}
