package Homework3;

import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		Person person1 = new Person();
		person1.setName("Marta");
		person1.setBirthYear(1990);

		Person person2 = new Person();
		person2.setName("Bogdan");
		person2.setBirthYear(1992);

		Person person3 = new Person("Volodya", 1989);
		person3.changeName("Volodymyr");


		System.out.println(person1);
		System.out.println(person2);
		System.out.println(person3);

		Person person4 = new Person();
		person4.input();
		person4.output();
		
		Person person5 = new Person();
		person5.input();
		person5.output();
		
	}
}
