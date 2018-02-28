package les10HW10;

public class One extends Thread{
	
	Thread two;
	
	public One(Thread two) {
		super();
		this.two = two;
	}

	@Override
	public void run() {
	two.start();	
	}

}
