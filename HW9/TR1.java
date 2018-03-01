


	public class TR1 {
			public final static Object first = new Object();
			public final static Object second = new Object();
		
			public static void main(String s[]) throws InterruptedException {
				System.out.println("Thread main - start");
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
								System.out.println("Success! 1111");
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
								System.out.println("Success!  222222");
							}
						}
					}
				};
				
				t1.start();
				t1.join();
				t2.start();
				t2.join();
				
				System.out.println("Thread main - end");
			}
		}
