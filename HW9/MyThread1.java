public class MyThread1 extends Thread {
	private int number;
	private int pause;
	private Thread t1;
	private Thread t2;

	public MyThread1(int number, int pause) {
		this.number = number;
		this.pause = pause;
	}
	
	public MyThread1(int number, int pause, Thread t1,Thread t2) {
		this.number = number;
		this.pause = pause;
		this.t1 = t1;
		this.t2 = t2;
		
	}


	@Override
	public void run() {
		System.out.println("Thread 1 started" );
		if ((t1 != null)&&(t2 != null))
			try {
				t1.join();t2.join();
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		//for (int i = 0; i < 5; i++) {
			//try {
			//	sleep(pause);
			//} catch (InterruptedException e) {
		//	}
			System.out.println("Thread 1 ended" );
		//}
	}
}


