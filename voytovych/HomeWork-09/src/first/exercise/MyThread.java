package first.exercise;

public class MyThread extends Thread {
	private Thread t1;
	private Thread t2;
	private String message = "";
	private int times = 0;
	private int sleep = 0;

	public MyThread() {

	}

	public MyThread(String message, int times, int sleep) {
		this.message = message;
		this.times = times;
		this.sleep = sleep;
	}
	
	public MyThread(String message, int times, int sleep, Thread t1, Thread t2) {
		this(message, times, sleep);
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public void run() {
		for (int i = 0; i < times; i++) {
				try {
					if((t1 != null) && (t2 != null)) {
						t1.join();
						t2.join();
					}
					Thread.sleep(sleep);
					System.out.println(message);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}
}
