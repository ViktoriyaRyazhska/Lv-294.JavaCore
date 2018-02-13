package first.exercise;

import java.io.IOException;

public class Display {
	
	public void showAmountOfDays() throws NumberFormatException, IOException {
		Input in = new Input();
		int num = in.inputNumberOfMonth();
		int counter = 1;
		for (Months months : Months.values()) {
			if(num == counter) {
				System.out.println(months + " [" + months.getAmountOfDays() + "]");
			}
			counter++;
		}
	}
	
	
}
