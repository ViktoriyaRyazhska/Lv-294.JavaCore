package hw05.task1;

import java.time.LocalDate;

import myScanner.MyScaner;

public class MonthArrey {
	private int[] monthes = new int[12];
	private int year = LocalDate.now().getYear();
	private MyScaner sc = new MyScaner();

	public MonthArrey() {

		monthes[0] = 31;
		if (((year % 4 == 0) & (year % 100 != 0)) | year % 400 == 0) {
			monthes[1] = 29;
		} else {
			monthes[1] = 28;
		}
		monthes[2] = 31;
		monthes[3] = 30;
		monthes[4] = 31;
		monthes[5] = 30;
		monthes[6] = 31;
		monthes[7] = 31;
		monthes[8] = 30;
		monthes[9] = 31;
		monthes[10] = 30;
		monthes[11] = 31;

	}

	public int[] getMonthes() {
		return monthes;
	}

	public void setMonthes(int[] monthes) {
		this.monthes = monthes;
	}

	public int getNumDays(int month) {
		return monthes[month - 1];
	}

	public void displayNumDays() {
		System.out.println("Enter number of month : ");
		int days = getNumDays(sc.menuChoice(1, 12));
		System.out.println("This month have a " + days + " days : ");
		sc.close();
	}
}
