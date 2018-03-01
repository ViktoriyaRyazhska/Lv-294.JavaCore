
public class MainTread {

	public static void main(String[] args) throws Exception {
	      Thread t2 = new MyThread2();
	      Thread t3 = new MyTread3();
	      Thread t = new MyThread1(1,100,t2,t3);
	      System.out.println("Thread main -start");
	      t.start();
	      t2.start();
	      t3.start();
	      
	      
	      System.out.println("Thread main -end");
	   }
	}

