public class DeadlockDemo {
	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String s[]) {
		Thread t1 = new Thread() {
			public void run() {
				synchronized (first) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (second) {
						System.out.println("Success!");
					}
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (second) {
					try {
						Thread.sleep(200);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					synchronized (first) {
						System.out.println("Success!");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}
