package hw03;

import java.util.Calendar;

public class Person {
	private String name;
	private int birthYear;
	private Calendar calendar = Calendar.getInstance();

	public Person() {
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

	public void input(String name, int birthYear) {
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