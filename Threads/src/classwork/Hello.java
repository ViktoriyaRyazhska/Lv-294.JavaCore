package classwork;

public class Hello implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 5;i++) {
			System.out.println("Hello,world!");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
