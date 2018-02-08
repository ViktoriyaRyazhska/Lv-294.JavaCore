package task2;

import java.util.Scanner;

public class Day {
	public static void main(String[] args) {

		System.out.println("Enter the number of the day of the week");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();

		switch (a) {
		case 1:
			System.out.println("Українська: понеділок");
			System.out.println("English: Monday");
			System.out.println("Deutsch: der Montag");
			break;
		case 2:
			System.out.println("Українська: вівторок");
			System.out.println("English: Tuesday");
			System.out.println("Deutsch: der Dienstag");
			break;
		case 3:
			System.out.println("Українська: середа");
			System.out.println("English: Wednesday");
			System.out.println("Deutsch: der Mittwoch");
			break;
		case 4:
			System.out.println("Українська: четвер");
			System.out.println("English: Thursday");
			System.out.println("Deutsch: der Donnerstag");
			break;
		case 5:
			System.out.println("Українська: п'ятниця");
			System.out.println("English: Friday");
			System.out.println("Deutsch: der Freitag");
			break;
		case 6:
			System.out.println("Українська: субота");
			System.out.println("English: Saturday");
			System.out.println("Deutsch: der Samstag");
			break;
		case 7:
			System.out.println("Українська: неділя");
			System.out.println("English: Sunday");
			System.out.println("Deutsch: der Sonntag");
			break;
		default:
			System.out.println("Тиждень має лише 7 днів");
			System.out.println("A week contains only 7 days");
			System.out.println("Eine Woche enthaltet nur 7 Tage");

		}

	}
}
