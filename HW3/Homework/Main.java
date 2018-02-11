package Homework3;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Person person1 = new Person();
		person1.setName("Marta");
		person1.setBirthYear(1990);
		person1.setSex(2);

		Person person2 = new Person();
		person2.setName("Bogdan");
		person2.setBirthYear(1992);
		person2.setSex(1);

		Person person3 = new Person("Volodya", 1989, 1);
		person3.changeName("Volodymyr");
		
		Person person4 = new Person("Zlata", 1996, 2);
		
		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);
		System.out.println(person4);

		Person person5 = new Person();
		person5.input();
		person5.output();
		
	}
}
