import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_1_3 {

	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(	new InputStreamReader(System.in));
	    
	    
	    System.out.println("Enter the duration of the talk -  t1");
	    
	    String t1 = br.readLine();
	    int m1 = Integer.parseInt(t1);
	    
	    System.out.println("Enter the duration of the talk -  t2");
	    String t2 = br.readLine();
	    int m2 = Integer.parseInt(t2);
	    
	    System.out.println("Enter the duration of the talk -  t3");
	    String t3 = br.readLine();
	    int m3 = Integer.parseInt(t3);
	    
	    // Counting for country C1
	    System.out.println("The number of t1 talks for country C1");
	    String c1t1 = br.readLine();
	    int q1t1 = Integer.parseInt(c1t1);
	 
	    System.out.println("The number of t2 talks for country C1");
	    String c1t2 = br.readLine();
	    int q1t2 = Integer.parseInt(c1t2);
	    
	    System.out.println("The number of t3 talks for country C1");
	    String c1t3 = br.readLine();
	    int q1t3 = Integer.parseInt(c1t3);
	  	     
	
          long start1 = System.nanoTime();
          double timeC1 = q1t1*m1+q1t2*m2+q1t3*m3 ;
          System.out.println("Talk time for country C1  =  " + timeC1);
          long end1 = System.nanoTime();
          long traceTime1 = end1-start1;
          System.out.println("Computer counting time for country C1 =  " + traceTime1 + " nanoseconds");
          System.out.println();
  // Counting for country C2
	    System.out.println("The number of t1 talks for country C2");
	    String c2t1 = br.readLine();
	    int q2t1 = Integer.parseInt(c2t1);
	    
	    System.out.println("The number of t2 talks for country C2");
	    String c2t2 = br.readLine();
	    int q2t2 = Integer.parseInt(c2t2);
	    
	    System.out.println("The number of t3 talks for country C2");
	    String c2t3 = br.readLine();
	    int q2t3 = Integer.parseInt(c2t3);
	  	     
	
         long start2 = System.nanoTime();
         double timeC2 = q2t1*m1+q2t2*m2+q2t3*m3 ;
         System.out.println("Talk time for country C1  =  " + timeC2);
         long end2 = System.nanoTime();
         long traceTime2 = end2-start2;
         System.out.println("Computer counting time for country C2 =  " + traceTime2 + " nanoseconds");
         System.out.println();
        // Counting for country C3
           System.out.println("The number of t1 talks for country C3");
           String c3t1 = br.readLine();
           int q3t1 = Integer.parseInt(c3t1);
  
           System.out.println("The number of t2 talks for country C3");
           String c3t2 = br.readLine();
           int q3t2 = Integer.parseInt(c3t2);
  
  System.out.println("The number of t3 talks for country C3");
  String c3t3 = br.readLine();
  int q3t3 = Integer.parseInt(c3t3);
	     

       long start3 = System.nanoTime();
       double timeC3 = q3t1*m1+q3t2*m2+q3t3*m3 ;
       System.out.println("Talk time for country C3  =  " + timeC3);
       long end3 = System.nanoTime();
       long traceTime3 = end3-start3;
       System.out.println("Computer counting time for country C3 =  " + traceTime3 + " nanoseconds");
       System.out.println();
       // Counting for countries C1,C2, C3 all talks together
       long start = System.nanoTime();
       double time =q1t1*m1+q1t2*m2+q1t3*m3+q2t1*m1+q2t2*m2+q2t3*m3+ q3t1*m1+q3t2*m2+q3t3*m3 ;
       System.out.println("Talk time for country C1,C2,C3  =  " + time);
       long end = System.nanoTime();
       long traceTime = end-start;
       System.out.println("Computer counting time for countries C1,C2,C3 =  " + traceTime + " nanoseconds");
	
	  }

}
