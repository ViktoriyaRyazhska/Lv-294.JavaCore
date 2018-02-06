package Homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Person {
	private String name;
	private int birthYear;

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

	public int age() {
		return 2018 - getBirthYear();
	}

	public void input() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Write next person's name");
		String name = br.readLine();
		System.out.println("Write next person's birth year");
		int birthYear = Integer.parseInt(br.readLine());
		this.setName(name);
		this.setBirthYear(birthYear);
	}

	public void output() {
		System.out.println(name + " was born in " + birthYear + ". Now he/she is " + age());
	}

	public void changeName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name + " was born in " + birthYear + ". Now he/she is " + age();
	}
}