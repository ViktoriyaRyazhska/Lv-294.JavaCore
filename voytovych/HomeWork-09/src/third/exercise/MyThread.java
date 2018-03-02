package third.exercise;

public class MyThread extends Thread {
	private Thread thread;
	private String message;
	private int times;

	public MyThread() {

	}

	public MyThread(Thread thread) {
		this.thread = thread;
	}

	public MyThread(String message, int times) {
		this.message = message;
		this.times = times;
	}

	public MyThread(Thread thread, String message, int times) {
		this(message, times);
		this.times = times;
		this.thread = thread;
	}

	public void run() {
		if (message != null) {
			for (int i = 0; i < times; i++) {
				System.out.println(message);
			}
		}
		if (thread != null) {
			thread.start();
		}
	}
}
