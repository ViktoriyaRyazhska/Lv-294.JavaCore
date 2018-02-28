package task2;

public class MyThread2 extends Thread{
	public void run() {
		try {
			for(int i =0 ;i<5; i++) {
				System.out.println("Peace in the peace");
				sleep(300);
			}
		} catch(InterruptedException e) {}
	}
}
