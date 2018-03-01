package hw10.task2;

public class Main {
	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String[] args) throws InterruptedException {
		// Мені здається що це не працює(принаймні в мене не вийшло спімати
		// deadlock), і я не розумію чому =(
		synchronized (first) {
			Thread.yield();
			synchronized (second) {
				System.out.println("Success!");
			}
		}

		Thread thread = new Thread() {
			@Override
			public void run() {
				synchronized (second) {
					Thread.yield();
					synchronized (first) {
						System.out.println("Success!");
					}
				}
			}
		};
		thread.start();

		
	}
}
