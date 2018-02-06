package cw04.task2;

import java.util.Scanner;

public class DayOfTheWeek {
	private Scanner sc = new Scanner(System.in);

	public void start() {
		boolean swch;
		int choice = 0;
		do {
			swch = true;
			System.out.println(" -------Day of the week names ------- :");
			System.out
					.println(" 1 - 7) Display name of the day in three languages:");
			System.out.println(" 0) Exit :");
			System.out
					.println(" -------------------------------------------------- :");
			System.out
					.println(" ----------------- Please make your choice -------- :");
			System.out
					.println(" -------------------------------------------------- :");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out
						.println(" -------------------------------------------------- :");
				System.out.println(" 1) Monday ");
				System.out.println(" 2) Понеділок ");
				System.out.println(" 3) 月曜日 ");
				System.out
						.println(" -------------------------------------------------- :");
				break;
			case 2:
				System.out
						.println(" -------------------------------------------------- :");
				System.out.println(" 1) Tuesday ");
				System.out.println(" 2) Вівторок ");
				System.out.println(" 3) 火曜日 ");
				System.out
						.println(" -------------------------------------------------- :");
				break;
			case 3:
				System.out
						.println(" -------------------------------------------------- :");
				System.out.println(" 1) Wednesday ");
				System.out.println(" 2) Середа");
				System.out.println(" 3) 水曜日 ");
				System.out
						.println(" -------------------------------------------------- :");
				break;
			case 4:
				System.out
						.println(" -------------------------------------------------- :");
				System.out.println(" 1) Thursday ");
				System.out.println(" 2) Четвер ");
				System.out.println(" 3) 木曜日 ");
				System.out
						.println(" -------------------------------------------------- :");
				break;
			case 5:
				System.out
						.println(" -------------------------------------------------- :");
				System.out.println(" 1) Friday ");
				System.out.println(" 2) П'ятниця ");
				System.out.println(" 3) 金曜日 ");
				System.out
						.println(" -------------------------------------------------- :");
				break;
			case 6:
				System.out
						.println(" -------------------------------------------------- :");
				System.out.println(" 1) Saturday ");
				System.out.println(" 2) Субота ");
				System.out.println(" 3) 土曜日 ");
				System.out
						.println(" -------------------------------------------------- :");
				break;
			case 7:
				System.out
						.println(" -------------------------------------------------- :");
				System.out.println(" 1) Sunday ");
				System.out.println(" 2) Неділя ");
				System.out.println(" 3) 日曜日 ");
				System.out
						.println(" -------------------------------------------------- :");
				break;
			case 0:
				swch = false;
				System.out.println(" 0) Exit :");
				System.out
						.println(" -------------------------------------------------- :");
				sc.close();
			}

		} while (swch);
	}
}
