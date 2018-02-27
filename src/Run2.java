public class Run2 implements Runnable {
	@Override
	public void run() {
		synchronized (Appl2.class) {
			for (int i = 0; i < 5000; i++)
				Appl2.sum++;
			}
	}
}
