package Les3HW3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PersonMain {

	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		Person p1 = new Person();
		p1.setName("Ivan");
		p1.setBirthYear(1965);
		p1.output();
		
		Person p2 = new Person("Kolya", 1985);
		p2.output();
		p2.changeName("Mykola");
		p2.output();
		
		Person p3 = new Person();
		p3.input(b);
		p3.output();
		
		Person p4 = new Person();
		p4.input(b);
		p4.output();
		
		Person p5 = new Person("Olya", 1959);
		p5.output();

	}

}
