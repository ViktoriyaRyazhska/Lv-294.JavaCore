package hw10.task3;

public class Main {

	public static void main(String[] args) {
		Thread t3 = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread number three");
				}
			}

		};
		Thread t2 = new Thread() {

			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					System.out.println("Thread number two");
				}
				t3.start();
			}

		};
		Thread t1 = new Thread() {
			@Override
			public void run() {
				t2.start();
			}

		};

		t1.start();

	}

}
