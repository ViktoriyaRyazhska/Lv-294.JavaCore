
public class Main {

	public static void main(String[] args) {
		
		
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
		
		Person person1 = new Person("Roman", 1996);
		Person person2 = new Person("Oleksandr", 1987);
		Person person3 = new Person("Igor", 1975);
		Person person4 = new Person("Olga", 1956);
		Person person5 = new Person("Ivan", 2000);
		
		person1.output();
		person2.output();
		person3.output();
		person4.output();
		person5.output();

		person1.changeName("Oleg");
	}

}
