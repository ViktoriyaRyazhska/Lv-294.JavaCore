package cw10.task2;

public class MyThread extends Thread {
	private String words;
	private int sleep;
	private int time;

	public MyThread() {

	}

	public MyThread(String words, int sleep, int time) {
		this.words = words;
		this.sleep = sleep;
		this.time = time;
	}

	public String getWords() {
		return words;
	}

	public void setWords(String words) {
		this.words = words;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getSleep() {
		return sleep;
	}

	public void setSleep(int sleep) {
		this.sleep = sleep;
	}

	@Override
	public void run() {
		for (int i = 0; i < time; i++) {
			try {
				Thread.sleep(sleep);
				System.out.println(words);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
