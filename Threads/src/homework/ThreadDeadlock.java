package homework;

public class ThreadDeadlock {
	private static Integer i1 = 0;
	private static Integer i2 = 0;
	public ThreadDeadlock() {
	}
	
	public void perform() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				synchronized (i1) {
					Thread.yield();
					synchronized (i2) {
						System.out.println("Done");
					}
				}
			}
		});
	}

}
