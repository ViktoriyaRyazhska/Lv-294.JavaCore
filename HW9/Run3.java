package HW9;

public class Run3 implements Runnable {
	@Override
	public void run()  {
		synchronized (Appl.class){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		for (int i = 0; i < 5; i++) {
			System.out.println("Run 3, i = " + i);

			}
		}
	}
}