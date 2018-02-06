import java.io.BufferedReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

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

		GregorianCalendar birthdate = new GregorianCalendar();
		birthdate.set(Calendar.YEAR, birthYear);
		GregorianCalendar today = new GregorianCalendar();

		return today.get(Calendar.YEAR) - birthdate.get(Calendar.YEAR);

	}

	public void input(BufferedReader br) throws IOException {
		this.name = br.readLine();
		this.birthYear = Integer.parseInt(br.readLine());
	}

	public void output() {
		System.out.println("Your name is: " + name + "\nYou are born in " + birthYear + "\nThis year you are " + age()
				+ " years old");
	}

	public void changeName(String newName) {
		System.out.println("\nYou have been changed name from \"" + name + "\" to new name \"" + newName + "\"");
		setName(newName);
		System.out.println("Hello " + newName + "\nThis year you are " + age() + "years old");
	}
}
