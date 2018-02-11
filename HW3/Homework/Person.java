package Homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.GregorianCalendar;


public class Person {
	private String name;
	private int birthYear;
	private int sex;
	

	public Person() {
	}

	public Person(String name, int birthYear, int sex) {
		this.name = name;
		this.birthYear = birthYear;
		this.sex = sex;
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
	
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	
	GregorianCalendar calendar = new GregorianCalendar(2018, Calendar.FEBRUARY, 9);
	int year = calendar.get(Calendar.YEAR);

	public int age() {
		return year - getBirthYear();
	}

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write next person's name");
		String name = br.readLine();
		System.out.println("Write next person's birth year");
		int birthYear = Integer.parseInt(br.readLine());
		System.out.println("Choose sex of person (1 for male or 2 for female)");
		int sex = Integer.parseInt(br.readLine());
		this.setName(name);
		this.setBirthYear(birthYear);
		this.setSex(sex);
	}

	public void output() { 
		if (sex == 1) {
			System.out.println(name + " was born in " + birthYear + ". Now he is " + age());
		} if (sex == 2) {
			System.out.println(name + " was born in " + birthYear + ". Now she is " + age());
		} else {
			System.out.println("Choose 1 for male or 2 for female");
		}
		
	}

	public void changeName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		if (sex == 1) {
			return name + " was born in " + birthYear + ". Now he is " + age();
		} if (sex == 2) {
			return name + " was born in " + birthYear + ". Now she is " + age();
		} else {
			return "Choose 1 for male or 2 for 2 for female";
		}
		
	}
}