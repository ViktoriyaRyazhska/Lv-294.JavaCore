package les10HW10;

public class Task2{

	public static void main(String[] args) {
	
		
		Thread t = new A();		
		t.start();
		Thread t1 = new B();
		t1.start();

		System.out.println("Main");
		
	
	
	}

}
