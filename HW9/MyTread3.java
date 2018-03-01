
public class MyTread3 extends Thread {
	public void run( ) {
        // a long operation, calculation
       
        for (int i = 1; i <6; i++) {
        	System.out.println("Thread number three "+i);
        }
        
     }
}
