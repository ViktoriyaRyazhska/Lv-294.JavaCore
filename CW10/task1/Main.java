package cw10.task1;

public class Main {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println("I study Java!");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
