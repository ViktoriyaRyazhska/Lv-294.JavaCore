package lesson06.task2;

public class Student extends Person {

	public Student(String name, PersonType type) {
		super(name, type);

	}

	public Student() {
		super();

	}

	public Student(PersonType type) {
		super(type);

	}

	@Override
	public void print() {
		System.out.println(" I am a Student" + super.getName() + "!");

	}

}
