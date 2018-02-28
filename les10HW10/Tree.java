package les10HW10;

public class Tree extends Thread {

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
		System.out.println("Thread number tree");	
		}
	}
}
