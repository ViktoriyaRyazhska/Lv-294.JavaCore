package homework;

public class MassageThread implements Runnable{
	int number;
	public MassageThread(int number) {
		this.number = number;
	}

	@Override
	public void run() {
		for(int i = 0 ;i < 5;i++) {
			System.out.println("Thread " + number );
		}
	}
	
}
