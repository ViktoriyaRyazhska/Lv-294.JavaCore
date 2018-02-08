package Les3HW3;

import java.io.BufferedReader;
import java.io.IOException;

public class Person {
	
	private String name;
	
	private int birthYear;

	public Person() {
	}

	public Person(String name, int birthYear) {
		this.name = name;
		if((birthYear>2018)||(birthYear<1900)){
			System.out.println("Wrong format of year of birth");
			}
		else{
		this.birthYear = birthYear;
	}
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
		if((birthYear>2018)||(birthYear<1900)){
			System.out.println("Wrong format of year of birth");
			}
		else{
		this.birthYear = birthYear;
	}
	}
	public int age() {
		int age=2018-this.birthYear;
		return age;
	}
	public void input(BufferedReader b) throws IOException {
		System.out.println("Please, write person`s name");
		this.name=b.readLine();
		System.out.println("Please, write the year of birth of "+ name);
		this.birthYear=Integer.parseInt(b.readLine());
	}
	
	public void output() {
		if((birthYear>2018)||(birthYear<1900)){
			System.out.println("Wrong format of year of birth");
			}
		else{
		System.out.println("The name of person is "+ this.name + " and the year of birth is "+this.birthYear + " and age is "+ age() + " years");
	}
	}
	public void changeName(String name) {
		setName(name);
	}
	
	

}
