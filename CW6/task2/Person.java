package lesson06.task2;

public abstract class Person {
	private String name;
	private PersonType type;

	public Person() {

	}

	public Person(String name, PersonType type) {
		this.name = name;
		this.type = type;
	}

	public Person(PersonType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PersonType getType() {
		return type;
	}

	public void setType(PersonType type) {
		this.type = type;
	}

	public abstract void print();
}
