import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		/*
			Create Console Application project in Java.
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
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Person person1 = new Person();
		System.out.println("Person1 " + "\nEnter name and year of birth");
		person1.input(br);
		
		Person person2 = new Person();
		System.out.println("Person2 " + "\nEnter name and year of birth");
		person2.input(br);
		
		Person person3 = new Person();
		System.out.println("Person3 " + "\nEnter name and year of birth");
		person2.input(br);
		
		Person person4 = new Person();
		System.out.println("Person4 " + "\nEnter name and year of birth");
		person4.input(br);
		
		Person person5 = new Person();
		System.out.println("Person5 " + "\nEnter name and year of birth");
		person5.input(br);
		
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();

		person1.changeName("Oleg");
	}

}
