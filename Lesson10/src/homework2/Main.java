package homework2;

public class Main {

	public static void main(String[] args) {
		Thread t1  = new Thread() {
		public void run() {
			try {
			join();
			Thread.yield();
			System.out.println("Hello!");
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		
	}
};	
		t1.start();
		
			try {
			    t1.join();
				System.out.println("It's me.");
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
