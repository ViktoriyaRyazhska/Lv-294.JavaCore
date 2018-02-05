package hw03;

import java.util.Calendar;
//import java.util.InputMismatchException;
//import java.util.Scanner;

public class Person {
	private String name;
	private int birthYear;
	private Calendar calendar = Calendar.getInstance();

	public Person() {
//		input();
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "Person [" + name + "; birth day year : " + birthYear
				+ " ; age : " + age() + "]";
	}

	public int age() {

		return calendar.getWeekYear() - birthYear;
	}

	public void input(String name , int birthYear) {
//		boolean swch;
//		try (Scanner sc = new Scanner(System.in)) {
//			do {
//				swch = false;
//				try {
//					System.out.println("Enter Name of the Person : ");
//					this.name = sc.next();
//				} catch (InputMismatchException exc) {
//					System.out
//							.println("Input Mismatch Exception! Please try agen! ");
//					swch = true;
//				}
//			} while (swch);
//			do {
//				swch = false;
//				try {
//					System.out.println("Enter birthday year of the Person : ");
//					this.birthYear = sc.nextInt();
//					if (birthYear < 1900 || birthYear >= calendar.getWeekYear()) {
//						System.out
//								.println("Illegal Argument Exception! Please try agen! ");
//						System.out
//								.println("Incorect the birthday year input (1900 < birthday year <= "
//										+ calendar.getWeekYear());
//						swch = true;
//					}
//				} catch (InputMismatchException exc) {
//					System.out
//							.println("Input Mismatch Exception! Please try agen! ");
//					swch = true;
//					sc.next();
//				}
//			} while (swch);
//		}
		this.setName(name);
		this.setBirthYear(birthYear);
	}

	public void output() {
		System.out.println(this.toString());
	}

	public void changeName(String name) {
		this.setName(name);
	}
}