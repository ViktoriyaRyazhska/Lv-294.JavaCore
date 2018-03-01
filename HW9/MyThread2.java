
public class MyThread2 extends Thread {
	public void run( ) {
        // a long operation, calculation
       
        for (int i = 1; i <4; i++) {
        	System.out.println("Thread number two  "+i);
        }
        
     }

}
