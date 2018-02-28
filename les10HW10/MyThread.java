package les10HW10;

public class MyThread extends Thread{

	private int i;
	
	public MyThread(int i) {
	
		this.i = i;
	}

	@Override
	public void run() {
		for(int k=0; k<5; k++)
		System.out.println("This is thread number " + i);
	}
}
