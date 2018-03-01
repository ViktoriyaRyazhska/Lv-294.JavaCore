package hw10.task1;

import java.util.ArrayList;
import java.util.List;

public class MyThread extends Thread {
	private List<Thread> threads = new ArrayList<Thread>();
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

	public MyThread(List<Thread> threads, String message, int times, int sleep) {
		this.threads = threads;
		this.message = message;
		this.times = times;
		this.sleep = sleep;
	}

	public List<Thread> getThread() {
		return threads;
	}

	public void setThread(List<Thread> threads) {
		this.threads = threads;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}

	public void addThread(Thread thread) {
		this.threads.add(thread);
	}

	@Override
	public void run() {
		for (int i = 0; i < times; i++) {
			try {
				if (!threads.isEmpty()) {
					for (Thread thread : threads) {
						thread.join();
					}
				}
				Thread.sleep(sleep);
				System.out.println(message);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
