package lesson06.task2;

public abstract class Staff extends Person {

	public Staff() {
		super();
	}

	public Staff(PersonType type) {
		super(type);
	}

	public Staff(String name, PersonType type) {
		super(name, type);
	}

	public abstract double salary();

}
