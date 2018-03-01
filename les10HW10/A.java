package les10HW10;

public class A extends Thread{

	B b = new B();
	@Override
	public void run() {
		synchronized (Task2.class) {		
			System.out.println("A");
			b.start();
		}
	}
	
}
