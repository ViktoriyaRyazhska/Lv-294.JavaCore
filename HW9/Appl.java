package HW9;

public class Appl {

	public static void main(String[ ] args) throws InterruptedException {
        Runnable r1 = new Run1( );
        Thread t1 = new Thread(r1);
        Runnable r2 = new Run2( );
        Thread t2 = new Thread(r2);
        Runnable r3 = new Run3( );
        Thread t3 = new Thread(r3);
        t1.start( );
        t1.join();
        t2.start( );
        t2.join();
        t3.start( );
      
        
    }
}

