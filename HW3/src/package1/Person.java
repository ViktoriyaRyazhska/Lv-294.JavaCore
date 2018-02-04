package package1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Create Console Application project in Java.
Add class Person to the project.
Class Person should consists of
two private fields: name and birthYear (the birthday year) 
properties for access to these fields
default constructor and constructor with 2 parameters 
methods:
age - to calculate the age of person
input - to input information about person
output - to output information about person
changeName - to change the name of person
In the method main() create 5 objects of Person type and input information about them.
 */

public class Person{
	
	private String name;
	private int birthYear;
	
	private Person () {
		this.name="empty";
		this.birthYear=0;
	}
	
	private Person (String name, int birthYear) {
		this.name=name;
		this.birthYear=birthYear;
	}
	
	public int age() {
		int age=2018-this.birthYear;
		return age;
	}
	
	public void input () throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		System.out.println("Please, input the name of person");
		this.name = br.readLine();
		
		System.out.println("Please, input the birthday year of person");
		this.birthYear = Integer.parseInt(br.readLine());
	}

	public void output() {
		System.out.println("Name: " + this.name + " birthday year: " + this.birthYear + 
		" age: " + age()) ;        	
	}
	
	
	
	public static void main(String[] args)  throws NumberFormatException, IOException  {
		// TODO Auto-generated method stub
Person p1 = new Person("Ivan",1993);
p1.output();
	}

}
