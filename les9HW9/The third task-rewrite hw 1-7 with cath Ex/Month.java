package Les5HW5;

import java.io.BufferedReader;
import java.io.IOException;

public class Month {
	String [] months = {"January", "February", "March", "April", "May", "June", 
			"July", "August", "September", "October", "November", "December"};
	
   int [] monthsDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
   
   public void print(BufferedReader b) throws IOException {
	   System.out.println("Write number of month what are you loking for");
	   String m = b.readLine();
	   int k = Integer.parseInt(m)-1;
	   System.out.println("This month is " + months[k]+ " and it has " + monthsDay[k]+" days");
   }
   
//   Варіант номер 2
   String [] ma[] = {{"January", "31"} ,
   {"February" , "28"}, 
   {"March", "31" }, 
   {"April", "30"},
   {"May",  "31"},
   {"June", "30"},
   {"July", "31"},
   {"August", "31"},
   {"September", "30"}, 
   {"October", "31"}, 
   {"November", "30"},
   {"December", "31"}};
   
   
   public void pM(BufferedReader b) throws IOException {
	   System.out.println("Write number of month what are you loking for");
	   String s= b.readLine();
	   int f = Integer.parseInt(s)-1;
	   System.out.println("This month is " + ma[f][0]+ " and it has " + ma[f][1]+" days");
   }
}
