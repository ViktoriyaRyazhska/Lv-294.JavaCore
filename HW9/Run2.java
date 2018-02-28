package HW9;

public class Run2 implements Runnable {
	@Override
	public void run()  {
		synchronized (Appl.class) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Run 2, i = " + i);

			}
		}
	}
}