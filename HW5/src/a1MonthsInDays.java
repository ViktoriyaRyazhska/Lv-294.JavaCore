// Ask user to enter the number of month. 
// Read the value and write the amount of days 
// in this month (create array with amount days of each month).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
				
public class a1MonthsInDays {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		System.out.println("Please, enter number of month in regular (non-leap) year");
		
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));

		int month_days[ ]  = {31, 28, 31, 30, 31, 30, 
				31, 31, 30, 31, 30, 31} ;
		
		int month_number = Integer.parseInt(br.readLine());
		System.out.println("In that month " + month_days[month_number-1] + " days");		
	}

}
