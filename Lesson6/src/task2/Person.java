package task2;

public abstract class Person {
	private String name;
	final String TYPE_PERSON = "PERSON";
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void print();
}
