package lesson10;

public class Study {

	public static void main(String[] args) throws InterruptedException {
		Thread tr = new StudyThread();
		tr.start();
	
		
	System.out.println("main");

	}

}
