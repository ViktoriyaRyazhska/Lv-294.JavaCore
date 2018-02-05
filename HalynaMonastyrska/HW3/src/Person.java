import java.util.Scanner;

public class Person {
	private String name;
	private static int birthYear;
	private static int age;

	public Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getBirthYear() {
		return (int) birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	public int setAge() {
		return (int) age;
	}

	public static int getAge() {
		age = 2018 - birthYear;
		return (int) age;
	}

	public void changeName(String name) {
		this.name = name;
	}

	public Person() {
	}

	public Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	} 

	public void Input() {
		Scanner in = new Scanner(System.in);
		System.out.println("Input name: ");
		name = in.nextLine();
		System.out.println("Input birth year: ");
		birthYear = in.nextInt();
		in.close();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthYear=" + birthYear + ", age = " + Person.getAge() + "]";
	}

}
