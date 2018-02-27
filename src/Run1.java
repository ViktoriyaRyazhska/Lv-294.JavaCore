public class Run1 implements Runnable {
	@Override
	public void run() {
		synchronized (Appl2.class) {
		for (int i = 0; i < 10000; i++) {
				Appl2.sum--;
			}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
