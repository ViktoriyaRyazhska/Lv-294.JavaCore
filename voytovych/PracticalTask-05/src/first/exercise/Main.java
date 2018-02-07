package first.exercise;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	


	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/* Enter the number of the day of the week. Display the name in three languages. */
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		DayOfTheWeek day = new DayOfTheWeek(br);
		day.output();

		
		


		
	}

}
