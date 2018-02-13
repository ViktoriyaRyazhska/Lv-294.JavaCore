package lesson06.task2;

public class PersonApp {
	private Person[] persons;

	public PersonApp(Person[] persons) {
		this.persons = persons;
	}

	public Person[] getPersons() {
		return persons;
	}

	public void setPersons(Person[] persons) {
		this.persons = persons;
	}

	public void start() {
		for (Person person : persons) {
			if (person.getType().equals(PersonType.STAFF)) {
				person.print();
				((Staff) person).salary();
			}
			person.print();
		}
	}
}
