package lesson10;

public class ThreadPeace implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
		System.out.println("Peace in the peace");
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
	}
}
